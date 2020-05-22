package sk.xpress.tilegame.core.blocks;

import sk.xpress.tilegame.core.Collision;

public class Water extends Block {

    public Water(int x, int y) {
        super(x, y);
    }

    @Override
    public BlockMaterial getBlockMaterial() {
        return BlockMaterial.WATER;
    }

    @Override
    public Collision getCollision() {
        return Collision.DISABLED;
    }
}
