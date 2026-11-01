package p067l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19023 extends AbstractC4942 {

    /* JADX INFO: renamed from: ֫ */
    public final Set f56712;

    /* JADX INFO: renamed from: ۧ */
    public final C4848 f56713;

    /* JADX INFO: renamed from: ܽ */
    public final C9794 f56714;

    public C19023(C9794 c9794, C4848 c4848) {
        this(c9794, c4848, EnumSet.noneOf(EnumC16340.class));
    }

    public C19023(C9794 c9794, C4848 c4848, EnumSet enumSet) {
        this.f56714 = c9794;
        this.f56713 = c4848;
        this.f56712 = enumSet;
    }

    public final String toString() {
        C9794 c9794 = this.f56714;
        C4848 c4848 = this.f56713;
        if (c4848 == null) {
            return "Exports[" + c9794 + "]";
        }
        return "Exports[" + c9794 + ":" + c4848 + "]";
    }

    @Override // p067l.InterfaceC13095
    /* JADX INFO: renamed from: ֫ */
    public final void mo26783(InterfaceC19800 interfaceC19800) {
        interfaceC19800.mo15949(this);
    }
}
