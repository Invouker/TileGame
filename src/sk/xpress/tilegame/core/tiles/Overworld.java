package sk.xpress.tilegame.core.tiles;

import sk.xpress.tilegame.core.blocks.Block;
import sk.xpress.tilegame.core.blocks.BlockMaterial;
import sk.xpress.tilegame.core.threads.Game;

public class Overworld extends World {

    @Override
    public void addTile(BlockMaterial blockMaterial, int x, int y) {
    }

    @Override
    public void addTile(Block block, int x, int y) {
        getTile()[x][y] = new Tile(Game.DEFAULT_TILE_SIZE_PX , Game.DEFAULT_TILE_SIZE_PX, block);
    }
}
