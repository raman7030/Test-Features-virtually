package l;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3886 extends AbstractC23641 implements Iterator, Enumeration {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3886(C0357[] c0357Arr, int i, int i2, ConcurrentMapC10942 concurrentMapC10942, int i3) {
        super(c0357Arr, i, i2, concurrentMapC10942);
        this.k = i3;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                C0357 c0357 = this.b;
                if (c0357 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = c0357.b;
                this.j = c0357;
                a();
                return obj;
            default:
                C0357 c0358 = this.b;
                if (c0358 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = c0358.c;
                this.j = c0358;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
            case 0:
                break;
        }
        return next();
    }
}
