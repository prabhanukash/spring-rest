package org.example.familycashcardapplication;

import org.springframework.data.annotation.Id;

record CashCard(@Id Long id, Double amount){

}
