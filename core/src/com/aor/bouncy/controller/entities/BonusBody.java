package com.aor.bouncy.controller.entities;

import com.aor.bouncy.model.entities.BonusModel;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

/**
 * A concrete representation of an EntityBody
 * representing the bonus.
 */
public class BonusBody extends EntityBody{
    /**
     * Constructs a bonus's body according to
     * a bonus model.
     * @param world the physical world this bonus belongs to.
     * @param model the model representing this bonus.
     */
    public BonusBody(World world, BonusModel model){
        super(world, model, BodyDef.BodyType.StaticBody);

        float density = 0.0f, friction = 0.8f, restitution = 0.5f;
        int width = 100, height = 100;

        // Upper triangle
        createFixture(body, new float[]{0,15, 15,1, 85,1, 100,15, 0,85}, width, height, density, friction, restitution, BONUS_BODY, (short) (BIRD_BODY | SPIKE_BODY | BONUS_BODY | EDGE_BODY));

        // Bottom triangle
        createFixture(body, new float[]{0,85, 100,15, 100,85, 85,99, 15,99}, width, height, density, friction, restitution, BONUS_BODY, (short) (BIRD_BODY | SPIKE_BODY | BONUS_BODY | EDGE_BODY));
    }
}
