package com.tmoodini.gdxsandbox;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

//Testing 
public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TextureAtlas textureAtlas;
	Sprite banana;
	OrthographicCamera camera;
    ExtendViewport viewport;
	
	@Override
	public void create () {
		camera = new OrthographicCamera();
        viewport = new ExtendViewport(800, 600, camera);
		batch = new SpriteBatch();
		//img = new Texture("badlogic.jpg");
		textureAtlas = new TextureAtlas("fruit.txt");
		banana = textureAtlas.createSprite("banana");
	}

	@Override
	public void render () {
		
		Gdx.gl.glClearColor(0.57f, 0.77f, 0.85f, 1);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	    batch.begin();
	    banana.draw(batch);
	    batch.end();
	    
	}
	
	@Override
	public void dispose () {
		//batch.dispose();
		//img.dispose();
		textureAtlas.dispose();
	}
	@Override
	public void resize(int width, int height) {
	    viewport.update(width, height, true);

	    batch.setProjectionMatrix(camera.combined);
	}
}
