package p067l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16721 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Predicate f49308;

    /* JADX INFO: renamed from: ᩸ */
    public Object f49309;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator f49310;

    public C16721(Iterator it, Predicate predicate) {
        Object next;
        this.f49310 = it;
        this.f49308 = predicate;
        do {
            C22758 c22758 = (C22758) it;
            if (!c22758.hasNext()) {
                next = null;
                break;
            }
            next = c22758.next();
        } while (!this.f49308.test(next));
        this.f49309 = next;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f49309 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next;
        Object obj = this.f49309;
        do {
            C22758 c22758 = (C22758) this.f49310;
            if (!c22758.hasNext()) {
                next = null;
                break;
            }
            next = c22758.next();
        } while (!this.f49308.test(next));
        this.f49309 = next;
        return obj;
    }
}
