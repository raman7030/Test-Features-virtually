package p067l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.֨᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 143X */
/* JADX INFO: loaded from: classes2.dex */
public class C3686 {

    /* JADX INFO: renamed from: ֫ */
    public EnumSet f7795;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC5323 f7796;

    /* JADX INFO: renamed from: ܽ */
    public EnumSet f7797;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC5323 m7109() {
        return this.f7796;
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo7112(EnumC21706 enumC21706) {
        this.f7795.add(enumC21706);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m7111(EnumC21706 enumC21706) {
        this.f7797.add(enumC21706);
    }

    public C3686(InterfaceC5323 interfaceC5323) {
        this.f7796 = null;
        this.f7795 = EnumSet.noneOf(EnumC21706.class);
        this.f7797 = EnumSet.noneOf(EnumC21706.class);
        this.f7796 = interfaceC5323;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7108(EnumC21706 enumC21706) {
        return this.f7797.contains(enumC21706) || this.f7795.contains(enumC21706);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m7110(EnumC21706 enumC21706) {
        return this.f7795.contains(enumC21706);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7107() {
        this.f7795.clear();
        this.f7797.clear();
    }

    public C3686() {
        this(null);
    }
}
