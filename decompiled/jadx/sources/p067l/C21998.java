package p067l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21998 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayDeque f69110;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f69111;

    public C21998(C17302 c17302, boolean z) {
        this.f69111 = z;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f69110 = arrayDeque;
        C11269 c11269 = c17302.f51603;
        if (c11269 != null) {
            arrayDeque.push(c11269);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f69110.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f69110;
        if (arrayDeque.isEmpty()) {
            throw new NoSuchElementException();
        }
        C11269 c11269 = (C11269) arrayDeque.pop();
        while (true) {
            Object obj = c11269.f31388;
            C11269 c112610 = c11269.f31389;
            c11269 = c11269.f31390;
            if (obj != null) {
                return obj;
            }
            boolean z = this.f69111;
            arrayDeque.push(z ? c11269 : c112610);
            if (z) {
                c11269 = c112610;
            }
        }
    }
}
