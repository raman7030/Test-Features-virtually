package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳ᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F67X */
/* JADX INFO: loaded from: classes4.dex */
public final class C19773 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final C19102 f60158;

    /* JADX INFO: renamed from: ᩹ */
    public final int f60159;

    /* JADX INFO: renamed from: ᩶ */
    public int f60157 = 0;

    /* JADX INFO: renamed from: ۙ */
    public int f60156 = 0;

    @Override // java.util.Iterator
    public final void remove() {
    }

    public C19773(C16419 c16419) {
        this.f60159 = c16419.m37317();
        this.f60158 = new C19102(c16419.f48271, c16419.m37318());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f60157 < this.f60159;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f60156;
        C19102 c19102 = this.f60158;
        c19102.f56990 = i;
        this.f60156 = i + c19102.f56991;
        this.f60157++;
        return c19102;
    }
}
