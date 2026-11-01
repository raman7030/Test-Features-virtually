package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5VI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15601 extends C12250 implements Iterable {
    /* JADX INFO: renamed from: ֫ */
    public final C13591 m35478(int i) {
        C6885 c6885 = this.f34237;
        return new C13591(c6885, (C8226) c6885.f17900[this.f34242], (int) ((((long) i) * this.f34241) + this.f34238));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C24319(this);
    }
}
