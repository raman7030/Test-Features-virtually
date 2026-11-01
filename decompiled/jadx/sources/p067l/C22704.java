package p067l;

/* JADX INFO: renamed from: l.᩸ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5AZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22704 extends AbstractC8146 {

    /* JADX INFO: renamed from: ۙ */
    public final transient Object f71593;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return false;
    }

    public C22704(Object obj) {
        obj.getClass();
        this.f71593 = obj;
    }

    @Override // p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f71593.equals(obj);
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 mo18927() {
        return AbstractC16192.m36873of(this.f71593);
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ֫ */
    public final int mo26245(int i, Object[] objArr) {
        objArr[i] = this.f71593;
        return i + 1;
    }

    @Override // p067l.AbstractC8146, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f71593.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f71593.toString() + ']';
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // p067l.AbstractC8146, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC21520 iterator() {
        return new C21539(this.f71593);
    }
}
