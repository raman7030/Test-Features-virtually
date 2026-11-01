package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11427 extends AbstractC24837 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C2708 c2708 = this.f49473b;
        if (c2708 == null) {
            throw new NoSuchElementException();
        }
        Object obj = c2708.f4545b;
        Object obj2 = c2708.f4546c;
        this.f79333j = c2708;
        m38035a();
        return new C20815(obj, obj2, this.f79332i);
    }
}
