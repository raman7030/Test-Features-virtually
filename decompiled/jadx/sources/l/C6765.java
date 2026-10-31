package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6765 extends AbstractC21315 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f21012;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18842 f21013;

    public C6765(Iterable iterable, InterfaceC18842 interfaceC18842) {
        this.f21012 = iterable;
        this.f21013 = interfaceC18842;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f21012.iterator();
        it.getClass();
        InterfaceC18842 interfaceC18842 = this.f21013;
        interfaceC18842.getClass();
        return new C3943(it, interfaceC18842);
    }
}
