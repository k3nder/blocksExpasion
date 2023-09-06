package net.kender.brixpansion.fabric;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class tuff_brick_wall extends WallBlock {
public tuff_brick_wall(Settings settings) {
super(settings);
}

@Override
public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
 super.onBlockAdded(state, world, pos, oldState, notify);

}
}
