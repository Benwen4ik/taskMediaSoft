package com.example.task.entities;

import com.example.task.util.TypeItem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "itemsending")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemSending {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private TypeItem type;

    @Column
    private int index;

    @Column(name = "address_recipient")
    private String addressRecipient;

    @Column(name = "name_recipient")
    private String nameRecipient ;


}
