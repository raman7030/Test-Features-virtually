package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V52N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11266 extends AbstractC21520 {

    /* JADX INFO: renamed from: ᩸ */
    public Object f31384;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo26196(Object obj);

    public AbstractC11266(Object obj) {
        this.f31384 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31384 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f31384;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f31384 = mo26196(obj);
        return obj;
    }
}
