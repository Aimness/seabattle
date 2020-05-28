package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Listener for the buttons on the board	while playing game
public class AttackListener implements ActionListener
{
    int i,j;

    public void actionPerformed(ActionEvent v)
    {
        Battleship.getPlayers(Battleship.getYou()).humanAttack(v);
    }
}
