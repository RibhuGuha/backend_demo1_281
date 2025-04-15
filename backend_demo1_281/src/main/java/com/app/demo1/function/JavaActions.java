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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  