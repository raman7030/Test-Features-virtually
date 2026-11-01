package p067l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܿ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: DD2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18526 extends AbstractC19038 implements InterfaceC15034, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11151 f55338;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C18526(C11151 c11151) {
        this.f55338 = c11151;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C24422(this.f55338);
    }

    @Override // p067l.InterfaceC15034
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo14445() {
        return new C9670(this.f55338);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C15704(this.f55338);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C11151 c11151 = this.f55338;
        if (c11151.f30933.mo10801(key, null)) {
            return c11151.f30931 && C12826.equals(c11151.f30929[c11151.f30923], value);
        }
        Object[] objArr = c11151.f30922;
        int iM34881 = C15322.m34881(c11151.f30933.mo10800(key)) & c11151.f30928;
        Object obj3 = objArr[iM34881];
        if (obj3 == null) {
            return false;
        }
        if (c11151.f30933.mo10801(key, obj3)) {
            return C12826.equals(c11151.f30929[iM34881], value);
        }
        do {
            iM34881 = (iM34881 + 1) & c11151.f30928;
            obj2 = objArr[iM34881];
            if (obj2 == null) {
                return false;
            }
        } while (!c11151.f30933.mo10801(key, obj2));
        return C12826.equals(c11151.f30929[iM34881], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C11151 c11151 = this.f55338;
        if (c11151.f30933.mo10801(key, null)) {
            if (!c11151.f30931 || !C12826.equals(c11151.f30929[c11151.f30923], value)) {
                return false;
            }
            c11151.m25686();
            return true;
        }
        Object[] objArr = c11151.f30922;
        int iM34881 = C15322.m34881(c11151.f30933.mo10800(key)) & c11151.f30928;
        Object obj2 = objArr[iM34881];
        if (obj2 == null) {
            return false;
        }
        if (c11151.f30933.mo10801(obj2, key)) {
            if (!C12826.equals(c11151.f30929[iM34881], value)) {
                return false;
            }
            c11151.m25687(iM34881);
            return true;
        }
        while (true) {
            iM34881 = (iM34881 + 1) & c11151.f30928;
            Object obj3 = objArr[iM34881];
            if (obj3 == null) {
                return false;
            }
            if (c11151.f30933.mo10801(obj3, key) && C12826.equals(c11151.f30929[iM34881], value)) {
                c11151.m25687(iM34881);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f55338.f30926;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f55338.clear();
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C11151 c11151 = this.f55338;
        if (c11151.f30931) {
            consumer.m45213n(new C19197(c11151, c11151.f30923));
        }
        Object[] objArr = c11151.f30922;
        int i = c11151.f30923;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (objArr[i2] != null) {
                consumer.m45213n(new C19197(c11151, i2));
            }
            i = i2;
        }
    }
}
