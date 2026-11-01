package p067l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.᩻ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes.dex */
public final class C25058 extends AbstractC4942 {

    /* JADX INFO: renamed from: ֫ */
    public final Set f79949;

    /* JADX INFO: renamed from: ۧ */
    public final C4848 f79950;

    /* JADX INFO: renamed from: ܽ */
    public final C9794 f79951;

    public C25058(C9794 c9794, C4848 c4848, EnumSet enumSet) {
        this.f79951 = c9794;
        this.f79950 = c4848;
        this.f79949 = enumSet;
    }

    public final String toString() {
        C9794 c9794 = this.f79951;
        C4848 c4848 = this.f79950;
        if (c4848 == null) {
            return "Opens[" + c9794 + "]";
        }
        return "Opens[" + c9794 + ":" + c4848 + "]";
    }

    @Override // p067l.InterfaceC13095
    /* JADX INFO: renamed from: ֫ */
    public final void mo26783(InterfaceC19800 interfaceC19800) {
        interfaceC19800.mo15951(this);
    }
}
