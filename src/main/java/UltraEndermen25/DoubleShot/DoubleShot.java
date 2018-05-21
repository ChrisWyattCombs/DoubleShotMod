package UltraEndermen25.DoubleShot;
import UltraEndermen25.DoubleShot.Reference.*;
import UltraEndermen25.DoubleShot.proxy.Proxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.client.event.*;

@Mod(modid = Reference.Mod_Id, name = Reference.Name, version = Reference.Version, acceptedMinecraftVersions = Reference.Accepted_MC_verisons)
public class DoubleShot {
	@SidedProxy(clientSide = Reference.Client_Proxy, serverSide = Reference.Server_Proxy)
public static Proxy proxy;
	public static void PreInit(FMLPreInitializationEvent event){
	proxy.preInit();
}
}
