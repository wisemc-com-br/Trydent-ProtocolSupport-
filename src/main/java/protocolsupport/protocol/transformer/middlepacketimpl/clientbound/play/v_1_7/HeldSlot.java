package protocolsupport.protocol.transformer.middlepacketimpl.clientbound.play.v_1_7;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.ClientBoundPacket;
import protocolsupport.protocol.transformer.middlepacket.clientbound.play.MiddleHeldSlot;
import protocolsupport.protocol.transformer.middlepacketimpl.PacketData;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public class HeldSlot extends MiddleHeldSlot<RecyclableCollection<PacketData>> {

	@Override
	public RecyclableCollection<PacketData> toData(ProtocolVersion version) {
		PacketData serializer = PacketData.create(ClientBoundPacket.PLAY_HELD_SLOT_ID, version);
		serializer.writeByte(slot);
		return RecyclableSingletonList.create(serializer);
	}

}
