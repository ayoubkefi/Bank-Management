package tn.esprit.gnbapp.services;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gnbapp.Exceptions.BadRequestException;
import tn.esprit.gnbapp.Exceptions.ResourceNotFoundException;
import tn.esprit.gnbapp.entities.event;
import tn.esprit.gnbapp.entities.fund;
import tn.esprit.gnbapp.entities.user;

import java.util.List;

public interface IFundService {
    List<fund> retrieveAllFunds();

    fund addFund(fund f);

    void deleteFund(Integer idFund);

    fund updateFund(fund fun);

    fund retrieveFund(Integer idFund);
}
