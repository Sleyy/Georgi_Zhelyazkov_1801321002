
Feature: Резервиране на място

  Scenario: Резервиране на прожекция без закъснение и незаето място
    Given Потребителя отваря екрана за резервиране на място
    When Потребителя въведе име на прожекция "Movie 16"
    And Избира място "1"
    And Часът е "14"
    And Натисне върху бутона за изпращане
    Then Вижда съобщение "Успешно резервирахте билет!"
    
	Scenario: Резервиране на прожекция със закъснение и незаето място
    Given Потребителя отваря екрана за резервиране на място
    When Потребителя въведе име на прожекция "Movie 16"
    And Избира място "1"
    And Часът е "16"
    And Натисне върху бутона за изпращане
    Then Вижда съобщение "Закъсняхте за този филм!"
   
	 Scenario: Резервиране на прожекция със закъснение и заето място
	    Given Потребителя отваря екрана за резервиране на място
	    When Потребителя въведе име на прожекция "Movie 16"
	    And Избира място "2"
	    And Часът е "16"
	    And Натисне върху бутона за изпращане
	    Then Вижда съобщение "Закъсняхте за този филм и мястото е заето!"
    
  Scenario: Резервиране на прожекция без закъснение и заето място
    Given Потребителя отваря екрана за резервиране на място
    When Потребителя въведе име на прожекция "Movie 16"
    And Избира място "2"
    And Часът е "14"
    And Натисне върху бутона за изпращане
    Then Вижда съобщение "Мястото е заето!"
    
  Scenario: Резервиране на прожекция за несъществуващ филм
    Given Потребителя отваря екрана за резервиране на място
    When Потребителя въведе име на прожекция "Несъществуващ"
    And Избира място "1"
    And Часът е "16"
    And Натисне върху бутона за изпращане
    Then Вижда съобщение "Няма такава прожекция!"
