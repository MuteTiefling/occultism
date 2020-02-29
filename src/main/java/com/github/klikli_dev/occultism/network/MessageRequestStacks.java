/*
 * MIT License
 *
 * Copyright 2020 klikli-dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.github.klikli_dev.occultism.network;


import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.network.NetworkEvent;

public class MessageRequestStacks extends MessageBase {

    //region Initialization
    public MessageRequestStacks() {

    }
    //endregion Initialization

    //region Overrides
    @Override
    public void onClientReceived(Minecraft minecraft, PlayerEntity player, NetworkEvent.Context context) {

    }

    @Override
    public void onServerReceived(MinecraftServer minecraftServer, ServerPlayerEntity player,
                                 NetworkEvent.Context context) {
        //TODO: enabble once storage controller is ready
        //        if (player.openContainer instanceof IStorageControllerContainer) {
        //            IStorageController storageController = ((IStorageControllerContainer) player.openContainer)
        //                                                           .getStorageController();
        //            if (storageController != null) {
        //                OccultismPacketHandler.sendTo(player, storageController.getMessageUpdateStacks());
        //                OccultismPacketHandler.sendTo(player, new MessageUpdateLinkedMachines(storageController.getLinkedMachines()));
        //                player.openContainer.detectAndSendChanges();
        //            }
        //        }
    }

    @Override
    public void encode(PacketBuffer buf) {

    }

    @Override
    public void decode(PacketBuffer buf) {

    }
    //endregion Overrides
}
