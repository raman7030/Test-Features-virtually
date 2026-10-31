package l;

import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9X6 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC21485 {
    SMB1,
    SMB202(514),
    SMB210(528),
    SMB300(768),
    SMB302(UMWorkDispatch.MSG_DELAY_PROCESS),
    SMB311(785);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f69124;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f69125;

    EnumC21485() {
        this.f69125 = false;
        this.f69124 = -1;
    }

    EnumC21485(int i) {
        this.f69125 = true;
        this.f69124 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48660() {
        return this.f69125;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48658() {
        if (!this.f69125) {
            throw new UnsupportedOperationException();
        }
        return this.f69124;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m48659(EnumC21485 enumC21485) {
        return ordinal() >= enumC21485.ordinal();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m48661(EnumC21485 enumC21485) {
        return ordinal() <= enumC21485.ordinal();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC21485 m48655(EnumC21485 enumC21485, EnumC21485 enumC21486) {
        return enumC21485.m48661(enumC21486) ? enumC21485 : enumC21486;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21485 m48654(EnumC21485 enumC21485, EnumC21485 enumC21486) {
        return enumC21485.m48659(enumC21486) ? enumC21485 : enumC21486;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Set m48656(EnumC21485 enumC21485, EnumC21485 enumC21486) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC21485.class);
        for (EnumC21485 enumC21487 : values()) {
            if ((enumC21485 == null || enumC21487.m48659(enumC21485)) && (enumC21486 == null || enumC21487.m48661(enumC21486))) {
                enumSetNoneOf.add(enumC21487);
            }
        }
        return enumSetNoneOf;
    }
}
