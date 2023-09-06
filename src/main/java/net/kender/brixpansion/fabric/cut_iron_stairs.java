package net.kender.brixpansion.fabric;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
public class cut_iron_stairs extends StairsBlock {
public cut_iron_stairs(BlockState baseBlockState, Settings settings) {
    super(baseBlockState, settings);
}

@Override
public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
    super.onBlockAdded(state, world, pos, oldState, notify);
    
}
}
