package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C9764 extends AbstractC2708 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f29540;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0052 f29541;

    public C9764(C0052 c0052, EnumSet enumSet) {
        this.f29541 = c0052;
        this.f29540 = enumSet;
    }

    public final String toString() {
        return "Requires[" + this.f29540 + "," + this.f29541 + "]";
    }

    @Override // l.InterfaceC11286
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo24769(InterfaceC18341 interfaceC18341) {
        interfaceC18341.mo14067(this);
    }
}
