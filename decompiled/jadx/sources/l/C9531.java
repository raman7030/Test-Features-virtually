package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9531 extends AbstractC23641 implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C0357 c0357 = this.b;
        if (c0357 == null) {
            throw new NoSuchElementException();
        }
        Object obj = c0357.b;
        Object obj2 = c0357.c;
        this.j = c0357;
        a();
        return new C19409(obj, obj2, this.i);
    }
}
