package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: V52N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9362 extends AbstractC20151 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f28435;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object mo24186(Object obj);

    public AbstractC9362(Object obj) {
        this.f28435 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28435 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f28435;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f28435 = mo24186(obj);
        return obj;
    }
}
