package com.danilolimadev.graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.danilolimadev.entities.Player;

public class UI {

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(8,4,70,8);
		g.setColor(Color.GREEN);
		g.fillRect(8,4, (int)((Player.life/Player.maxlife)*70), 8);
		g.setColor(Color.WHITE);
		g.setFont(new Font("arial", Font.BOLD, 8));
		g.drawString((int)Player.life + "/" + (int)Player.maxlife, 30, 11);
	}
	
}
