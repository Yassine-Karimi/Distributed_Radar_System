package yas.kr.immatriculation_service.mappers;



import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import yas.kr.immatriculation_service.entities.Proprietaire;
import yas.kr.immatriculation_service.grpc.stub.Imt;

@Component
public class ProprietaireMapper {


        private ModelMapper modelMapper=new ModelMapper();

        public Proprietaire fromGrpcOwner(Imt.Proprietaire source){
            return modelMapper.map(source,Proprietaire.class);
        }
        public Imt.Proprietaire fromOwner(Proprietaire proprietaire){
            return  (Imt.Proprietaire) modelMapper.map(proprietaire,Imt.Proprietaire.Builder.class).build();
        }

}
