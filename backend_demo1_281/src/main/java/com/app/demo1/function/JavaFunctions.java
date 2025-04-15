package com.app.demo1.function;

import com.app.demo1.model.Stage;
import com.app.demo1.model.Startup;
import com.app.demo1.model.FundingRound;
import com.app.demo1.model.Founder;
import com.app.demo1.model.Document;
import com.app.demo1.model.Investor;
import com.app.demo1.enums.RoundStatus;
import com.app.demo1.enums.StageName;
import com.app.demo1.converter.StageNameConverter;
import com.app.demo1.converter.RoundStatusConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.demo1.repository.FundingRoundRepository;
import com.app.demo1.repository.StageRepository;
import com.app.demo1.repository.DocumentRepository;
import com.app.demo1.repository.InvestorRepository;
import com.app.demo1.repository.FounderRepository;
import com.app.demo1.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
