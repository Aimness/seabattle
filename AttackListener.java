package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttackListener implements ActionListener
{
    int i,j;

    public void actionPerformed(ActionEvent v)
    {
        Battleship.getPlayers(Battleship.getYou()).humanAttack(v);
    }
}
