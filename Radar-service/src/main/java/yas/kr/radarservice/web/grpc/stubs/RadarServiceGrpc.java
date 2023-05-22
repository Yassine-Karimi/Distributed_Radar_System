package yas.kr.radarservice.web.grpc.stubs;

import io.grpc.stub.ClientCalls;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ebank.proto")
public final class RadarServiceGrpc {

  private RadarServiceGrpc() {}

  public static final String SERVICE_NAME = "RadarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<RadarOut.DetectRequest,
      RadarOut.Infraction> getDetectInfractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectInfraction",
      requestType = RadarOut.DetectRequest.class,
      responseType = RadarOut.Infraction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RadarOut.DetectRequest,
      RadarOut.Infraction> getDetectInfractionMethod() {
    io.grpc.MethodDescriptor<RadarOut.DetectRequest, RadarOut.Infraction> getDetectInfractionMethod;
    if ((getDetectInfractionMethod = RadarServiceGrpc.getDetectInfractionMethod) == null) {
      synchronized (RadarServiceGrpc.class) {
        if ((getDetectInfractionMethod = RadarServiceGrpc.getDetectInfractionMethod) == null) {
          RadarServiceGrpc.getDetectInfractionMethod = getDetectInfractionMethod = 
              io.grpc.MethodDescriptor.<RadarOut.DetectRequest, RadarOut.Infraction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RadarService", "DetectInfraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RadarOut.DetectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RadarOut.Infraction.getDefaultInstance()))
                  .setSchemaDescriptor(new RadarServiceMethodDescriptorSupplier("DetectInfraction"))
                  .build();
          }
        }
     }
     return getDetectInfractionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadarServiceStub newStub(io.grpc.Channel channel) {
    return new RadarServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadarServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadarServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RadarServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void detectInfraction(RadarOut.DetectRequest request,
                                 io.grpc.stub.StreamObserver<RadarOut.Infraction> responseObserver) {
      asyncUnimplementedUnaryCall(getDetectInfractionMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDetectInfractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                RadarOut.DetectRequest,
                RadarOut.Infraction>(
                  this, METHODID_DETECT_INFRACTION)))
          .build();
    }
  }

  /**
   */
  public static final class RadarServiceStub extends io.grpc.stub.AbstractStub<RadarServiceStub> {
    private RadarServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RadarServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceStub(channel, callOptions);
    }

    /**
     */
    public void detectInfraction(RadarOut.DetectRequest request,
                                 io.grpc.stub.StreamObserver<RadarOut.Infraction> responseObserver) {
      ClientCalls.asyncUnaryCall(
              getChannel().newCall(getDetectInfractionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RadarServiceBlockingStub extends io.grpc.stub.AbstractStub<RadarServiceBlockingStub> {
    private RadarServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RadarServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public RadarOut.Infraction detectInfraction(RadarOut.DetectRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetectInfractionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RadarServiceFutureStub extends io.grpc.stub.AbstractStub<RadarServiceFutureStub> {
    private RadarServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadarServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected RadarServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadarServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<RadarOut.Infraction> detectInfraction(
        RadarOut.DetectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectInfractionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT_INFRACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadarServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadarServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECT_INFRACTION:
          serviceImpl.detectInfraction((RadarOut.DetectRequest) request,
              (io.grpc.stub.StreamObserver<RadarOut.Infraction>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadarServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RadarOut.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadarService");
    }
  }

  private static final class RadarServiceFileDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier {
    RadarServiceFileDescriptorSupplier() {}
  }

  private static final class RadarServiceMethodDescriptorSupplier
      extends RadarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadarServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RadarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadarServiceFileDescriptorSupplier())
              .addMethod(getDetectInfractionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
