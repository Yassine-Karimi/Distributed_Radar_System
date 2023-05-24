package yas.kr;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import yas.kr.stubs.RadarOuterClass;
import yas.kr.stubs.RadarServiceGrpc;

import java.util.Scanner;

public class Main {
    private static RadarServiceGrpc.RadarServiceBlockingStub stub;

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9094)
                .usePlaintext()
                .build();
        stub = RadarServiceGrpc.newBlockingStub(channel);
        Scanner sc = new Scanner(System.in);
        // Create new radar
      /*  System.out.print("Enter radar max speed: ");
        Double maxSpeed = sc.nextDouble();
        System.out.print("Enter radar longitude: ");
        Double longitude = sc.nextDouble();
        System.out.print("Enter radar latitude : ");
        Double latitude = sc.nextDouble();
        Long radarId = createRadar(maxSpeed, longitude, latitude);
        System.out.print("Radar created with id: " + radarId);*/
        System.out.print("Enter radar ID: ");
        Long radarId =sc.nextLong();
        // Detect infraction
        int choice = 0;
        while(choice != 2) {
            System.out.println("\n1. Detect infraction");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
           case 1:
                    System.out.print("Enter vehicle speed: ");
                    Double speed = sc.nextDouble();
                    System.out.print("Enter vehicle id: ");
                    Long vehicleId = sc.nextLong();
                    System.out.println("Detecting infraction...");
                    detectInfraction(radarId, vehicleId, speed);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void detectInfraction(Long radarId, Long vehicleId, Double speed) {
        RadarOuterClass.DetectRequest request = RadarOuterClass.DetectRequest.newBuilder()
                .setRadarId(radarId)
                .setVehiculeId(vehicleId)
                .setSpeed(speed)
                .build();
        RadarOuterClass.Infraction infraction = stub.detectInfraction(request);
        System.out.println("------------Infraction detected--------------- ");
        System.out.println(infraction);
        System.out.println("--------------------------------------------------- ");
    }
}