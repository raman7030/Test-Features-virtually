package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18847 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6852 f59443;

    public C18847(C6852 c6852) {
        this.f59443 = c6852;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C19553(this.f59443.f21199.iterator());
    }
}
