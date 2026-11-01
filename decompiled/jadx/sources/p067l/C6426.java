package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C2RY */
/* JADX INFO: loaded from: classes2.dex */
public final class C6426 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Iterable f16629;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC19837 f16630;

    public C6426(Iterable iterable, InterfaceC19837 interfaceC19837) {
        this.f16629 = iterable;
        this.f16630 = interfaceC19837;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5085(this, this.f16629.iterator());
    }
}
