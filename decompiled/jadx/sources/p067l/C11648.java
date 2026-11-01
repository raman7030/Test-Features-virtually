package p067l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes4.dex */
public final class C11648 extends AbstractC4942 {

    /* JADX INFO: renamed from: ֫ */
    public final Set f32493;

    /* JADX INFO: renamed from: ۧ */
    public final C2417 f32494;

    public C11648(C2417 c2417, EnumSet enumSet) {
        this.f32494 = c2417;
        this.f32493 = enumSet;
    }

    public final String toString() {
        return "Requires[" + this.f32493 + "," + this.f32494 + "]";
    }

    @Override // p067l.InterfaceC13095
    /* JADX INFO: renamed from: ֫ */
    public final void mo26783(InterfaceC19800 interfaceC19800) {
        interfaceC19800.mo15947(this);
    }
}
