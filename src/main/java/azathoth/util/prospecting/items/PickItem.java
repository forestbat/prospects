package azathoth.util.prospecting.items;

import azathoth.util.prospecting.Prospecting;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PickItem extends BaseItem {

	public static final String NAME = "prospecting_pick";

	@GameRegistry.ObjectHolder(Prospecting.MODID + ":" + NAME)
	public static PickItem INSTANCE;

	public PickItem() {
		super(NAME);
	}

	@Override
	protected boolean shouldProspect(World world, BlockPos pos) {
		return world.getBlockState(pos).getBlock() == Blocks.STONE;
	}

	@Override
	public void registerRecipe() {
		GameRegistry.addShapedRecipe(getRecipeName(), null, new ItemStack(INSTANCE),
				new Object[]{
						"iis", "  s", 'i', Items.IRON_INGOT, 's', Items.STICK
				});

	}
}
