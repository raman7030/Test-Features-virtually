package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۧۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 44QG */
/* JADX INFO: loaded from: classes4.dex */
public final class C10803 extends AbstractC18063 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f32489;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f32490;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f32491;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12918 f32492;

    public C10803(C12918 c12918, int i) {
        this.f32492 = c12918;
        C18729 c18729M11939 = c12918.m31418().m11939(i);
        this.f32489 = c18729M11939.m43358();
        this.f32490 = c18729M11939.m43368();
        this.f32491 = c18729M11939.m43364();
        c18729M11939.m43359();
    }

    @Override // l.InterfaceC20561
    public final int getVisibility() {
        return this.f32489;
    }

    @Override // l.InterfaceC20561
    public final String getType() {
        return this.f32492.m31401(this.f32490);
    }

    @Override // l.InterfaceC20561
    public final Set getElements() {
        C12918 c12918 = this.f32492;
        C18729 c18729M11939 = c12918.m31418().m11939(this.f32491);
        int iM43368 = c18729M11939.m43368();
        int iM43364 = c18729M11939.m43364();
        c18729M11939.m43359();
        return new C1630(this, c12918, iM43364, iM43368);
    }
}
