package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.props.PlayerProperty;
import emu.grasscutter.net.packet.GenshinPacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.PlayerPropNotifyOuterClass.PlayerPropNotify;
import emu.grasscutter.utils.ProtoHelper;

public class PacketPlayerPropNotify extends GenshinPacket {
	
	public PacketPlayerPropNotify(GenshinPlayer player, PlayerProperty prop) {
		super(PacketOpcodes.PlayerPropNotify);
		
		this.buildHeader(0);
		
		PlayerPropNotify proto = PlayerPropNotify.newBuilder()
				.putPropMap(prop.getId(), ProtoHelper.newPropValue(prop, player.getProperty(prop)))
				.build();
		
		this.setData(proto);
	}
}