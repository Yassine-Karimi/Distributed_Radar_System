package yas.kr.immatriculation_service.mappers;



import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import yas.kr.immatriculation_service.entities.Vehicule;
import yas.kr.immatriculation_service.grpc.stub.Imt;

@Component
public class VehiculeMapper {


        private ModelMapper modelMapper=new ModelMapper();

        public Vehicule fromGrpcVehicule(Imt.Vehicule source){
            return modelMapper.map(source,Vehicule.class);
        }
        public Imt.Vehicule fromVehicule(Vehicule vehicule){
            return  (Imt.Vehicule) modelMapper.map(vehicule,Imt.Vehicule.Builder.class).build();
        }

}
