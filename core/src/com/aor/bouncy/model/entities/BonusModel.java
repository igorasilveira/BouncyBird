package com.aor.bouncy.model.entities;

import com.aor.bouncy.controller.GameController;

import static com.badlogic.gdx.math.MathUtils.random;

/**
 * A model representing the bonus.
 */
public class BonusModel extends EntityModel{
    public static float timeToLive;

    /**
     * Constructs a bonus model belonging to a game's model.
     * @param x The x-coordinate of this bonus in meters.
     * @param y The y-coordinate of this bonus in meters.
     */
    public BonusModel(float SPIKE_HEIGHT) {
        super(random(SPIKE_HEIGHT, GameController.ROOM_WIDTH - SPIKE_HEIGHT),
                random(SPIKE_HEIGHT, GameController.ROOM_HEIGHT - SPIKE_HEIGHT),
                0);
    }

    /**
     * Decreases the bonus's time to live by delta seconds
     * @param delta
     * @return
     */
    public boolean decreaseTimeToLive(float delta) {
        timeToLive -= delta;
        return timeToLive < 0;
    }

    /**
     * Sets the bonus' time to live in seconds
     * @param timeToLive seconds
     */
    public void setTimeToLive(float timeToLive) {
        this.timeToLive = timeToLive;
    }

    @Override
    public ModelType getType() {
        return ModelType.BONUS;
    }
}