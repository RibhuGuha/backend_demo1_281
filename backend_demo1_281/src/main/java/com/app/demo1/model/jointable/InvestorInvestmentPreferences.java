package com.app.demo1.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "InvestorInvestmentPreferences")
@Table(schema = "\"demo1_858\"", name = "\"InvestorInvestmentPreferences\"")
@Data
public class InvestorInvestmentPreferences{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"InvestorId\"")
	private Integer investorId;

    
    @Column(name = "\"InvestmentPreferences\"")
    private Integer investmentPreferences;
}