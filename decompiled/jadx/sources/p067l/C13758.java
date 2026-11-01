package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩹֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04TC */
/* JADX INFO: loaded from: classes3.dex */
public final class C13758 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C15768 f38883;

    /* JADX INFO: renamed from: ᩶ */
    public final int f38884;

    /* JADX INFO: renamed from: ᩸ */
    public int f38885 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public C24486 f38886 = new C24486();

    @Override // java.util.Iterator
    public final void remove() {
    }

    public C13758(C15768 c15768) {
        this.f38883 = c15768;
        this.f38884 = c15768.m35837();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38885 < this.f38884;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C15768 c15768 = this.f38883;
        int i = c15768.f45654[this.f38885];
        C24486 c24486 = this.f38886;
        c24486.f77492 = i;
        int[] iArr = c15768.f45655;
        int i2 = this.f38885;
        c24486.f77493 = iArr[i2];
        this.f38885 = i2 + 1;
        return c24486;
    }
}
