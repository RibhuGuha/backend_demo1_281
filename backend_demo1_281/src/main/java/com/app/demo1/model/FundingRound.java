package com.app.demo1.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
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
import com.app.demo1.converter.DurationConverter;
import com.app.demo1.converter.UUIDToByteConverter;
import com.app.demo1.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "FundingRound")
@Table(name = "\"FundingRound\"", schema =  "\"demo1_858\"")
@Data
                        
public class FundingRound {
	public FundingRound () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"RoundId\"", nullable = true )
  private Integer roundId;
	  
  @Column(name = "\"RoundType\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = StageNameConverter.class)
  private StageName roundType;
  
	  
  @Column(name = "\"DateOfFunding\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date dateOfFunding;  
  
	  
  @Column(name = "\"AmountRaised\"", nullable = true )
  private Double amountRaised;
  
	  
  @Column(name = "\"Status\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = RoundStatusConverter.class)
  private RoundStatus status;
  
	  
  @Column(name = "\"TargetAmount\"", nullable = true )
  private Double targetAmount;
  
	  
  @Column(name = "\"PostValuation\"", nullable = true )
  private Double postValuation;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"FundingRoundLeadInvestor\"", referencedColumnName = "\"InvestorId\"", insertable = false, updatable = false)
	private Investor leadInvestor;
	
	@Column(name = "\"FundingRoundLeadInvestor\"")
	private Integer fundingRoundLeadInvestor;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"FundingRoundFundedStartup\"", referencedColumnName = "\"SId\"", insertable = false, updatable = false)
	private Startup fundedStartup;
	
	@Column(name = "\"FundingRoundFundedStartup\"")
	private Integer fundingRoundFundedStartup;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"FundingRoundStartupLogoIcon\"", referencedColumnName = "\"DocId\"", insertable = false, updatable = false)
	private Document startupLogoIcon;
	
	@Column(name = "\"FundingRoundStartupLogoIcon\"")
	private Integer fundingRoundStartupLogoIcon;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"FundingRoundInvestors\"",
            joinColumns = @JoinColumn( name="\"RoundId\""),
            inverseJoinColumns = @JoinColumn( name="\"InvestorId\""), schema = "\"demo1_858\"")
private List<Investor> investors = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "FundingRound [" 
  + "RoundId= " + roundId  + ", " 
  + "RoundType= " + roundType  + ", " 
  + "DateOfFunding= " + dateOfFunding  + ", " 
  + "AmountRaised= " + amountRaised  + ", " 
  + "Status= " + status  + ", " 
  + "TargetAmount= " + targetAmount  + ", " 
  + "PostValuation= " + postValuation 
 + "]";
	}
	
}
