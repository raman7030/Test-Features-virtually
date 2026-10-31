package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 491A */
/* JADX INFO: loaded from: classes3.dex */
public final class C8895 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f27063;

    public C8895(String str) {
        this.f27063 = str;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C9601(this);
    }
}
