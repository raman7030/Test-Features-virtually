package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܶ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15102 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f46188;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f46189;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f46190;

    public C15102(Iterator it, Predicate predicate) {
        Object next;
        this.f46190 = it;
        this.f46188 = predicate;
        do {
            C21454 c21454 = (C21454) it;
            if (!c21454.hasNext()) {
                next = null;
                break;
            }
            next = c21454.next();
        } while (!this.f46188.test(next));
        this.f46189 = next;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46189 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next;
        Object obj = this.f46189;
        do {
            C21454 c21454 = (C21454) this.f46190;
            if (!c21454.hasNext()) {
                next = null;
                break;
            }
            next = c21454.next();
        } while (!this.f46188.test(next));
        this.f46189 = next;
        return obj;
    }
}
