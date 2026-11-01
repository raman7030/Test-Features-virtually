package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10469 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public int f28954 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C17173 f28955;

    public C10469(C17173 c17173) {
        this.f28955 = c17173;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C17173 c17173;
        while (true) {
            int i = this.f28954;
            c17173 = this.f28955;
            if (i >= c17173.f51129 || !C17173.m38880(c17173, c17173.f51128[this.f28954])) {
                break;
            }
            this.f28954++;
        }
        return this.f28954 < c17173.f51129;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C17173 c17173 = this.f28955;
        String[] strArr = c17173.f51128;
        int i = this.f28954;
        C11140 c11140 = new C11140(strArr[i], (String) c17173.f51127[i], c17173);
        this.f28954++;
        return c11140;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f28954 - 1;
        this.f28954 = i;
        this.f28955.remove(i);
    }
}
