package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12552 extends AbstractC19038 implements InterfaceC20599, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11211 f35271;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C12552(C11211 c11211) {
        this.f35271 = c11211;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C15604(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C15604(this);
    }

    @Override // p067l.InterfaceC20599
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo28932() {
        return new C9570(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C3834(this, 0, this.f35271.f31141);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C11211 c11211 = this.f35271;
        int i = c11211.f31141;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C15903(c11211, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f35271.f31141;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Long)) {
            long jLongValue = ((Long) entry.getKey()).longValue();
            C11211 c11211 = this.f35271;
            if (c11211.mo9531(jLongValue) && C12826.equals(c11211.mo9532(jLongValue), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long jLongValue = ((Long) entry.getKey()).longValue();
        Object value = entry.getValue();
        C11211 c11211 = this.f35271;
        int iM25898 = c11211.m25898(jLongValue);
        if (iM25898 == -1 || !C12826.equals(value, c11211.f31140[iM25898])) {
            return false;
        }
        int i = (c11211.f31141 - iM25898) - 1;
        long[] jArr = c11211.f31145;
        int i2 = iM25898 + 1;
        System.arraycopy(jArr, i2, jArr, iM25898, i);
        Object[] objArr = c11211.f31140;
        System.arraycopy(objArr, i2, objArr, iM25898, i);
        int i3 = c11211.f31141 - 1;
        c11211.f31141 = i3;
        c11211.f31140[i3] = null;
        return true;
    }
}
