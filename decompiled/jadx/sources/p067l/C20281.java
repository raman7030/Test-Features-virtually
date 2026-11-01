package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20281 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final C8881 f62672;

    public C20281(C8881 c8881) {
        this.f62672 = c8881;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C20952(this.f62672.f24078.iterator());
    }
}
