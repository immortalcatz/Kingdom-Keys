package wehavecookies56.kk.item;

import net.minecraft.client.renderer.texture.IconRegister;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;

public class ItemPureHeart extends ItemKingdomKeys{

    public ItemPureHeart(int id) {
        super(id);       
        this.setUnlocalizedName(Strings.PHeart);
    }
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}