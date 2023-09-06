package net.kender.brixpansion.fabric;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class red_nether_brick_fence extends FenceBlock {
public red_nether_brick_fence(Settings settings) {
super(settings);
}

@Override
public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
 super.onBlockAdded(state, world, pos, oldState, notify);

}
}
