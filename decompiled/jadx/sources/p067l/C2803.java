package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2803 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public int f4793;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22921 f4794;

    public C2803(C22921 c22921) {
        this.f4794 = c22921;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4793 < this.f4794.f72121;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f4793;
        this.f4793 = i + 1;
        C3474 c3474 = new C3474(this.f4794);
        if (!c3474.m6205(i)) {
            return null;
        }
        C20910 c20910 = new C20910();
        c20910.f65666 = new C17441();
        c20910.f65667 = c3474.m6204();
        c20910.f65665 = c3474.m6200();
        for (int i2 = 0; i2 < c3474.m6202(); i2++) {
            c20910.f65666.add(c3474.m6203(i2));
        }
        return c20910;
    }
}
