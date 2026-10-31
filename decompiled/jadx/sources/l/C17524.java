package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C17524 extends AbstractC2708 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f53521;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 f53522;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7814 f53523;

    public C17524(C7814 c7814, C2609 c2609) {
        this(c7814, c2609, EnumSet.noneOf(EnumC14701.class));
    }

    public C17524(C7814 c7814, C2609 c2609, EnumSet enumSet) {
        this.f53523 = c7814;
        this.f53522 = c2609;
        this.f53521 = enumSet;
    }

    public final String toString() {
        C7814 c7814 = this.f53523;
        C2609 c2609 = this.f53522;
        if (c2609 == null) {
            return "Exports[" + c7814 + "]";
        }
        return "Exports[" + c7814 + ":" + c2609 + "]";
    }

    @Override // l.InterfaceC11286
    /* JADX INFO: renamed from: ֫ */
    public final void mo24769(InterfaceC18341 interfaceC18341) {
        interfaceC18341.mo14069(this);
    }
}
