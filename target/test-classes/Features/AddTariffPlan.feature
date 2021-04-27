#Author: your.sathya@your.domain.com

Feature: Add Tariff Plan
  

    Scenario: Validate add Tariff module
      Given  user lanches Telecom application
      And    user click on Add tariff plan button
      When   user need to fill up the Add tariff plan fields
      And    user click on Submit button 
      Then   user verify to the Congratulation add Tariff Plan text

  Scenario: Validate add Tariff module
      Given  user lanches Telecom application
      And    user click on Add tariff plan button
      When   user need to fill up the Add tariff plan fields by one dimensional list
       | 4000 | 200 | 100 | 500 | 110 | 130 | 170 |
      And    user click on Submit button 
      Then   user verify to the Congratulation add Tariff Plan text
      
      Scenario: Validate add Tariff module
      Given  user lanches Telecom application
      And    user click on Add tariff plan button
      When   user need to fill up the Add tariff plan fields by one dimensional map
      | rental1          | 2000       |
      | local_minutes    | 2420       |
      | inter_minutes    | 2140       |
      | sms_pack         | 2060       |
      | minutes_charges  | 3950       |
      | inter_charges    | 3103       |
      | sms_charges      | 4101       |
      And    user click on Submit button 
      Then   user verify to the Congratulation add Tariff Plan text
      
      Scenario: Validate add Tariff module
      Given  user lanches Telecom application
      And    user click on Add tariff plan button
      When   user need to fill up the Add tariff plan fields by two dimensional list
             | 4005 | 208 | 110 | 590 | 110 | 130 | 170 |
             | 4001 | 201 | 101 | 502 | 111 | 131 | 171 |
             | 4002 | 202 | 102 | 503 | 112 | 132 | 191 |
             | 4102 | 292 | 152 | 800 | 712 | 032 | 271 |
             | 4132 | 092 | 952 | 890 | 702 | 062 | 371 |  
             

      And    user click on Submit button 
      Then   user verify to the Congratulation add Tariff Plan text
      
      Scenario: Validate add Tariff module
      Given  user lanches Telecom application
      And    user click on Add tariff plan button
      When   user need to fill up the Add tariff plan fields by two dimensional map
       | RT    | LM        | IM    | SP         |  MC     | IC         |  SC |
       | 4009  | 207       | 190   | 700        | 110     | 130        | 170 |
       | 4003  | 208       | 109   | 504        | 191     | 121        | 161 |
       | 4004  | 206       | 103   | 509        | 182     | 134        | 179 |
       | 4060  | 216       | 123   | 529        | 132     | 133        | 999 |
       | 4069  | 215       | 123   | 569        | 130     | 113        | 169 |
       | 4060  | 212       | 127   | 569        | 102     | 183        | 190 |
       
       
      And    user click on Submit button 
      Then   user verify to the Congratulation add Tariff Plan text
 