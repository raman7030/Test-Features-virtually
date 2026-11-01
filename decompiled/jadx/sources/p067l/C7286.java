package p067l;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: l.ۚۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YAMC */
/* JADX INFO: loaded from: classes2.dex */
public final class C7286 {
    public volatile AtomicReferenceArray array;

    public C7286(int i) {
        this.array = new AtomicReferenceArray(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16737() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m16738(int i) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16739(int i, C24049 c24049) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c24049);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c24049);
        this.array = atomicReferenceArray2;
    }
}
