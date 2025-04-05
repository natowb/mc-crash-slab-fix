package net.minecraft.src;

public class ItemSlab extends ItemBlock {
    public ItemSlab(int var1) {
        super(var1);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getIconFromDamage(int var1) {
        return Block.stairSingle.getBlockTextureFromSideAndMetadata(2, var1);
    }

    public int getPlacedBlockMetadata(int var1) {
        return var1;
    }

    public String getItemNameIS(ItemStack var1) {

        int damageValue = var1.getItemDamage();

        if (damageValue >= BlockStep.field_22037_a.length || damageValue < 0) {
            damageValue = 0;
        }

        return super.getItemName() + "." + BlockStep.field_22037_a[damageValue];
    }
}
