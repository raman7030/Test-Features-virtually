package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8798 extends AbstractC22626 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Iterable f23887;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC20276 f23888;

    public C8798(Iterable iterable, InterfaceC20276 interfaceC20276) {
        this.f23887 = iterable;
        this.f23888 = interfaceC20276;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f23887.iterator();
        it.getClass();
        InterfaceC20276 interfaceC20276 = this.f23888;
        interfaceC20276.getClass();
        return new C6116(it, interfaceC20276);
    }
}
