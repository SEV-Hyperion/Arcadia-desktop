package com.hyperion.arcadia.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hyperion.arcadia.MainGame;
public class DesktopLauncher {
	public static void main (String[] arg) {
		
		// Lost TexturePacker integrated job. Gotta do it manually for now.
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height=MainGame.HEIGHT;
		config.width=MainGame.WIDTH;
		new LwjglApplication(new MainGame(), config);
	}
}

