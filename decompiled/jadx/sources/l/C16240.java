package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܺ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9GX */
/* JADX INFO: loaded from: classes5.dex */
public final class C16240 extends C16614 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte f49990;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumSet f49991;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumSet f49992;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumSet f49993;

    @Override // l.C16614
    /* JADX INFO: renamed from: ۧ */
    public final void mo7050(C0097 c0097) throws C13146 {
        c0097.m26096(2);
        this.f49990 = c0097.m26095();
        c0097.m26095();
        this.f49993 = C15262.m36278(c0097.m26082(), EnumC9560.class);
        this.f49992 = C15262.m36278(c0097.m26082(), EnumC20849.class);
        this.f49991 = C15262.m36278(c0097.m26082(), EnumC11696.class);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m38207() {
        return this.f49990 == 1;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m38209() {
        return this.f49990 == 2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m38205() {
        return this.f49990 == 3;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumSet m38208() {
        return this.f49993;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Set m38206() {
        return this.f49992;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumSet m38210() {
        return this.f49991;
    }
}
