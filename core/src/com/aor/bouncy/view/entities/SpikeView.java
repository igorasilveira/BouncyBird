package com.aor.bouncy.view.entities;

import com.aor.bouncy.MyBouncyBird;
import com.aor.bouncy.model.entities.EntityModel;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * A view representing the spike.
 */
public class SpikeView extends EntityView {
    /**
     * The texture used for the spikes.
     */
    private TextureRegion texture;

    /**
     * Constructs a spike model.
     *
     * @param game the game this view belongs to. Needed to access the
     *             asset manager to get textures.
     */
    public SpikeView(MyBouncyBird game) { super(game); }

    /**
     * Creates a sprite representing this spike.
     *
     * @param game the game this view belongs to. Needed to access the
     *             asset manager to get textures.
     * @return the sprite representing this spike.
     */
    @Override
    public Sprite createSprite(MyBouncyBird game) {
        texture = createTexture(game);

        return new Sprite(texture);
    }

    /**
     * Creates the texture used.
     *
     * @param game the game this view belongs to. Needed to access the
     *             asset manager to get textures.
     * @return the texture used.
     */
    private TextureRegion createTexture(MyBouncyBird game) {
        Texture texture = game.getAssetManager().get("spike.png");
        return new TextureRegion(texture, texture.getWidth(), texture.getHeight());
    }

    /**
     * Updates this spike's model.
     *
     * @param model the model used to update this view
     */
    @Override
    public void update(EntityModel model) {
        super.update(model);
    }

    /**
     * Draws the sprite from this view using a sprite batch.
     *
     * @param batch The sprite batch to be used for drawing.
     */
    @Override
    public void draw(SpriteBatch batch) {
        sprite.setRegion(texture);
        sprite.draw(batch);
    }
}
