package org.devathon.contest2016;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Mecha {

    public enum MechaState { DESPAWNED, EMPTY, OCCUPIED, FIRING, DESPAWNING }
    public enum MechaPrimaryWeapon { HEAD_CANNON, ARM_CANNON, CHEST_LASER }
    public enum MechaSecondaryWeapon { LASER_VISION, HEAT_BLAST }

    private UUID owner;
    private Material primaryBlock, secondaryBlock, appendageBlock;
    private MechaState state;
    private MechaPrimaryWeapon primaryWeapon;
    private MechaSecondaryWeapon secondaryWeapon;

    public Mecha(Player player) {
        this.owner = player.getUniqueId();

        this.primaryBlock = Material.IRON_BLOCK;
        this.secondaryBlock = Material.EMERALD_BLOCK;
        this.appendageBlock = Material.NETHER_BRICK;

        this.state = MechaState.DESPAWNED;
        this.primaryWeapon = MechaPrimaryWeapon.HEAD_CANNON;
        this.secondaryWeapon = MechaSecondaryWeapon.LASER_VISION;
    }

    public Mecha(UUID uuid) {
        this.owner = uuid;

        this.primaryBlock = Material.IRON_BLOCK;
        this.secondaryBlock = Material.EMERALD_BLOCK;
        this.appendageBlock = Material.NETHER_BRICK;

        this.state = MechaState.DESPAWNED;
        this.primaryWeapon = MechaPrimaryWeapon.HEAD_CANNON;
        this.secondaryWeapon = MechaSecondaryWeapon.LASER_VISION;
    }

    public UUID getOwner() {
        return owner;
    }

    public Material getPrimaryBlock() {
        return primaryBlock;
    }

    public Material getSecondaryBlock() {
        return secondaryBlock;
    }

    public Material getAppendageBlock() {
        return appendageBlock;
    }

    public MechaState getState() {
        return state;
    }

    public MechaPrimaryWeapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public MechaSecondaryWeapon getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setPrimaryBlock(Material primaryBlock) {
        if (!primaryBlock.isBlock()) {
            return;
        }

        this.primaryBlock = primaryBlock;
    }

    public void setSecondaryBlock(Material secondaryBlock) {
        if (!secondaryBlock.isBlock()) {
            return;
        }

        this.secondaryBlock = secondaryBlock;
    }

    public void setAppendageBlock(Material appendageBlock) {
        if (!appendageBlock.isBlock()) {
            return;
        }

        this.appendageBlock = appendageBlock;
    }

    public void setState(MechaState state) {
        this.state = state;
    }

    public void setPrimaryWeapon(MechaPrimaryWeapon primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public void setSecondaryWeapon(MechaSecondaryWeapon secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }
}
