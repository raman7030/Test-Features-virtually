package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩷ۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20654 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f66430;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f66431;

    public C20654(C15713 c15713, boolean z) {
        this.f66431 = z;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f66430 = arrayDeque;
        C9365 c9365 = c15713.f48465;
        if (c9365 != null) {
            arrayDeque.push(c9365);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f66430.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ArrayDeque arrayDeque = this.f66430;
        if (arrayDeque.isEmpty()) {
            throw new NoSuchElementException();
        }
        C9365 c9365 = (C9365) arrayDeque.pop();
        while (true) {
            Object obj = c9365.f28439;
            C9365 c9366 = c9365.f28440;
            c9365 = c9365.f28441;
            if (obj != null) {
                return obj;
            }
            boolean z = this.f66431;
            arrayDeque.push(z ? c9365 : c9366);
            if (z) {
                c9365 = c9366;
            }
        }
    }
}
