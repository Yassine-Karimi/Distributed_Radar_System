package yas.kr.immatriculation_service.grpc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ebank.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Imt.CreateProprietaireRequest,
      Imt.CreateProprietaireResponse> getCreateProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProprietaire",
      requestType = Imt.CreateProprietaireRequest.class,
      responseType = Imt.CreateProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Imt.CreateProprietaireRequest,
      Imt.CreateProprietaireResponse> getCreateProprietaireMethod() {
    io.grpc.MethodDescriptor<Imt.CreateProprietaireRequest, Imt.CreateProprietaireResponse> getCreateProprietaireMethod;
    if ((getCreateProprietaireMethod = ImmatriculationServiceGrpc.getCreateProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getCreateProprietaireMethod = ImmatriculationServiceGrpc.getCreateProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getCreateProprietaireMethod = getCreateProprietaireMethod = 
              io.grpc.MethodDescriptor.<Imt.CreateProprietaireRequest, Imt.CreateProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "CreateProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.CreateProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.CreateProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("CreateProprietaire"))
                  .build();
          }
        }
     }
     return getCreateProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Imt.CreateVehiculeRequest,
      Imt.CreateVehiculeResponse> getCreateVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVehicule",
      requestType = Imt.CreateVehiculeRequest.class,
      responseType = Imt.CreateVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Imt.CreateVehiculeRequest,
      Imt.CreateVehiculeResponse> getCreateVehiculeMethod() {
    io.grpc.MethodDescriptor<Imt.CreateVehiculeRequest, Imt.CreateVehiculeResponse> getCreateVehiculeMethod;
    if ((getCreateVehiculeMethod = ImmatriculationServiceGrpc.getCreateVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getCreateVehiculeMethod = ImmatriculationServiceGrpc.getCreateVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getCreateVehiculeMethod = getCreateVehiculeMethod = 
              io.grpc.MethodDescriptor.<Imt.CreateVehiculeRequest, Imt.CreateVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "CreateVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.CreateVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.CreateVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("CreateVehicule"))
                  .build();
          }
        }
     }
     return getCreateVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Imt.GetProprietaireRequest,
      Imt.GetProprietaireResponse> getGetProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaire",
      requestType = Imt.GetProprietaireRequest.class,
      responseType = Imt.GetProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Imt.GetProprietaireRequest,
      Imt.GetProprietaireResponse> getGetProprietaireMethod() {
    io.grpc.MethodDescriptor<Imt.GetProprietaireRequest, Imt.GetProprietaireResponse> getGetProprietaireMethod;
    if ((getGetProprietaireMethod = ImmatriculationServiceGrpc.getGetProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetProprietaireMethod = ImmatriculationServiceGrpc.getGetProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getGetProprietaireMethod = getGetProprietaireMethod = 
              io.grpc.MethodDescriptor.<Imt.GetProprietaireRequest, Imt.GetProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.GetProprietaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.GetProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getProprietaire"))
                  .build();
          }
        }
     }
     return getGetProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Imt.GetAllProprietairesRequest,
      Imt.GetAllProprietairesResponse> getListProprietairesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listProprietaires",
      requestType = Imt.GetAllProprietairesRequest.class,
      responseType = Imt.GetAllProprietairesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Imt.GetAllProprietairesRequest,
      Imt.GetAllProprietairesResponse> getListProprietairesMethod() {
    io.grpc.MethodDescriptor<Imt.GetAllProprietairesRequest, Imt.GetAllProprietairesResponse> getListProprietairesMethod;
    if ((getListProprietairesMethod = ImmatriculationServiceGrpc.getListProprietairesMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getListProprietairesMethod = ImmatriculationServiceGrpc.getListProprietairesMethod) == null) {
          ImmatriculationServiceGrpc.getListProprietairesMethod = getListProprietairesMethod = 
              io.grpc.MethodDescriptor.<Imt.GetAllProprietairesRequest, Imt.GetAllProprietairesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "listProprietaires"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.GetAllProprietairesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.GetAllProprietairesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("listProprietaires"))
                  .build();
          }
        }
     }
     return getListProprietairesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Imt.GetVehiculeRequest,
      Imt.GetVehiculeResponse> getGetVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicule",
      requestType = Imt.GetVehiculeRequest.class,
      responseType = Imt.GetVehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Imt.GetVehiculeRequest,
      Imt.GetVehiculeResponse> getGetVehiculeMethod() {
    io.grpc.MethodDescriptor<Imt.GetVehiculeRequest, Imt.GetVehiculeResponse> getGetVehiculeMethod;
    if ((getGetVehiculeMethod = ImmatriculationServiceGrpc.getGetVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetVehiculeMethod = ImmatriculationServiceGrpc.getGetVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getGetVehiculeMethod = getGetVehiculeMethod = 
              io.grpc.MethodDescriptor.<Imt.GetVehiculeRequest, Imt.GetVehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.GetVehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.GetVehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getVehicule"))
                  .build();
          }
        }
     }
     return getGetVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Imt.GetAllVehiculesRequest,
      Imt.GetAllVehiculesResponse> getListVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listVehicules",
      requestType = Imt.GetAllVehiculesRequest.class,
      responseType = Imt.GetAllVehiculesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Imt.GetAllVehiculesRequest,
      Imt.GetAllVehiculesResponse> getListVehiculesMethod() {
    io.grpc.MethodDescriptor<Imt.GetAllVehiculesRequest, Imt.GetAllVehiculesResponse> getListVehiculesMethod;
    if ((getListVehiculesMethod = ImmatriculationServiceGrpc.getListVehiculesMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getListVehiculesMethod = ImmatriculationServiceGrpc.getListVehiculesMethod) == null) {
          ImmatriculationServiceGrpc.getListVehiculesMethod = getListVehiculesMethod = 
              io.grpc.MethodDescriptor.<Imt.GetAllVehiculesRequest, Imt.GetAllVehiculesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "listVehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.GetAllVehiculesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Imt.GetAllVehiculesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("listVehicules"))
                  .build();
          }
        }
     }
     return getListVehiculesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProprietaire(Imt.CreateProprietaireRequest request,
                                   io.grpc.stub.StreamObserver<Imt.CreateProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void createVehicule(Imt.CreateVehiculeRequest request,
                               io.grpc.stub.StreamObserver<Imt.CreateVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaire(Imt.GetProprietaireRequest request,
                                io.grpc.stub.StreamObserver<Imt.GetProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void listProprietaires(Imt.GetAllProprietairesRequest request,
                                  io.grpc.stub.StreamObserver<Imt.GetAllProprietairesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListProprietairesMethod(), responseObserver);
    }

    /**
     */
    public void getVehicule(Imt.GetVehiculeRequest request,
                            io.grpc.stub.StreamObserver<Imt.GetVehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Autres méthodes pour les opérations de modification
     * </pre>
     */
    public void listVehicules(Imt.GetAllVehiculesRequest request,
                              io.grpc.stub.StreamObserver<Imt.GetAllVehiculesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListVehiculesMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Imt.CreateProprietaireRequest,
                Imt.CreateProprietaireResponse>(
                  this, METHODID_CREATE_PROPRIETAIRE)))
          .addMethod(
            getCreateVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Imt.CreateVehiculeRequest,
                Imt.CreateVehiculeResponse>(
                  this, METHODID_CREATE_VEHICULE)))
          .addMethod(
            getGetProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Imt.GetProprietaireRequest,
                Imt.GetProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRE)))
          .addMethod(
            getListProprietairesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Imt.GetAllProprietairesRequest,
                Imt.GetAllProprietairesResponse>(
                  this, METHODID_LIST_PROPRIETAIRES)))
          .addMethod(
            getGetVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Imt.GetVehiculeRequest,
                Imt.GetVehiculeResponse>(
                  this, METHODID_GET_VEHICULE)))
          .addMethod(
            getListVehiculesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Imt.GetAllVehiculesRequest,
                Imt.GetAllVehiculesResponse>(
                  this, METHODID_LIST_VEHICULES)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceStub> {
    private ImmatriculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProprietaire(Imt.CreateProprietaireRequest request,
                                   io.grpc.stub.StreamObserver<Imt.CreateProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVehicule(Imt.CreateVehiculeRequest request,
                               io.grpc.stub.StreamObserver<Imt.CreateVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaire(Imt.GetProprietaireRequest request,
                                io.grpc.stub.StreamObserver<Imt.GetProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProprietaires(Imt.GetAllProprietairesRequest request,
                                  io.grpc.stub.StreamObserver<Imt.GetAllProprietairesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListProprietairesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicule(Imt.GetVehiculeRequest request,
                            io.grpc.stub.StreamObserver<Imt.GetVehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Autres méthodes pour les opérations de modification
     * </pre>
     */
    public void listVehicules(Imt.GetAllVehiculesRequest request,
                              io.grpc.stub.StreamObserver<Imt.GetAllVehiculesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListVehiculesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceBlockingStub> {
    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public Imt.CreateProprietaireResponse createProprietaire(Imt.CreateProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public Imt.CreateVehiculeResponse createVehicule(Imt.CreateVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public Imt.GetProprietaireResponse getProprietaire(Imt.GetProprietaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public Imt.GetAllProprietairesResponse listProprietaires(Imt.GetAllProprietairesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListProprietairesMethod(), getCallOptions(), request);
    }

    /**
     */
    public Imt.GetVehiculeResponse getVehicule(Imt.GetVehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Autres méthodes pour les opérations de modification
     * </pre>
     */
    public Imt.GetAllVehiculesResponse listVehicules(Imt.GetAllVehiculesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListVehiculesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceFutureStub> {
    private ImmatriculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Imt.CreateProprietaireResponse> createProprietaire(
        Imt.CreateProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Imt.CreateVehiculeResponse> createVehicule(
        Imt.CreateVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVehiculeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Imt.GetProprietaireResponse> getProprietaire(
        Imt.GetProprietaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Imt.GetAllProprietairesResponse> listProprietaires(
        Imt.GetAllProprietairesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListProprietairesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Imt.GetVehiculeResponse> getVehicule(
        Imt.GetVehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Autres méthodes pour les opérations de modification
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<Imt.GetAllVehiculesResponse> listVehicules(
        Imt.GetAllVehiculesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListVehiculesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROPRIETAIRE = 0;
  private static final int METHODID_CREATE_VEHICULE = 1;
  private static final int METHODID_GET_PROPRIETAIRE = 2;
  private static final int METHODID_LIST_PROPRIETAIRES = 3;
  private static final int METHODID_GET_VEHICULE = 4;
  private static final int METHODID_LIST_VEHICULES = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PROPRIETAIRE:
          serviceImpl.createProprietaire((Imt.CreateProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<Imt.CreateProprietaireResponse>) responseObserver);
          break;
        case METHODID_CREATE_VEHICULE:
          serviceImpl.createVehicule((Imt.CreateVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<Imt.CreateVehiculeResponse>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRE:
          serviceImpl.getProprietaire((Imt.GetProprietaireRequest) request,
              (io.grpc.stub.StreamObserver<Imt.GetProprietaireResponse>) responseObserver);
          break;
        case METHODID_LIST_PROPRIETAIRES:
          serviceImpl.listProprietaires((Imt.GetAllProprietairesRequest) request,
              (io.grpc.stub.StreamObserver<Imt.GetAllProprietairesResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICULE:
          serviceImpl.getVehicule((Imt.GetVehiculeRequest) request,
              (io.grpc.stub.StreamObserver<Imt.GetVehiculeResponse>) responseObserver);
          break;
        case METHODID_LIST_VEHICULES:
          serviceImpl.listVehicules((Imt.GetAllVehiculesRequest) request,
              (io.grpc.stub.StreamObserver<Imt.GetAllVehiculesResponse>) responseObserver);
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

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Imt.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationService");
    }
  }

  private static final class ImmatriculationServiceFileDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier {
    ImmatriculationServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationServiceMethodDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImmatriculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationServiceFileDescriptorSupplier())
              .addMethod(getCreateProprietaireMethod())
              .addMethod(getCreateVehiculeMethod())
              .addMethod(getGetProprietaireMethod())
              .addMethod(getListProprietairesMethod())
              .addMethod(getGetVehiculeMethod())
              .addMethod(getListVehiculesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
