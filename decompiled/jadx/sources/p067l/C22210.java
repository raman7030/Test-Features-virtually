package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22210 extends AbstractC22626 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC18263 f70247;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterable f70248;

    public C22210(Iterable iterable, InterfaceC18263 interfaceC18263) {
        this.f70248 = iterable;
        this.f70247 = interfaceC18263;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C20198(this.f70248.iterator(), this.f70247);
    }
}
