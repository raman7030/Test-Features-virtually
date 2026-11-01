package p067l;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6062 extends AbstractC24837 implements Iterator, Enumeration {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f15241k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6062(C2708[] c2708Arr, int i, int i2, ConcurrentMapC12768 concurrentMapC12768, int i3) {
        super(c2708Arr, i, i2, concurrentMapC12768);
        this.f15241k = i3;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f15241k) {
            case 0:
                C2708 c2708 = this.f49473b;
                if (c2708 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = c2708.f4545b;
                this.f79333j = c2708;
                m38035a();
                return obj;
            default:
                C2708 c2709 = this.f49473b;
                if (c2709 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = c2709.f4546c;
                this.f79333j = c2709;
                m38035a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f15241k) {
            case 0:
                break;
        }
        return next();
    }
}
