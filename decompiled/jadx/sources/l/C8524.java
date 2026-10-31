package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes3.dex */
public final class C8524 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f26039 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15578 f26040;

    public C8524(C15578 c15578) {
        this.f26040 = c15578;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C15578 c15578;
        while (true) {
            int i = this.f26039;
            c15578 = this.f26040;
            if (i >= c15578.f47997 || !C15578.m36719(c15578, c15578.f47996[this.f26039])) {
                break;
            }
            this.f26039++;
        }
        return this.f26039 < c15578.f47997;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C15578 c15578 = this.f26040;
        String[] strArr = c15578.f47996;
        int i = this.f26039;
        C9230 c9230 = new C9230(strArr[i], (String) c15578.f47995[i], c15578);
        this.f26039++;
        return c9230;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f26039 - 1;
        this.f26039 = i;
        this.f26040.remove(i);
    }
}
