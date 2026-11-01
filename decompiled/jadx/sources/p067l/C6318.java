package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6318 extends AbstractC19038 implements InterfaceC15034, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23082 f16375;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C6318(C23082 c23082) {
        this.f16375 = c23082;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C11012(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C11012(this);
    }

    @Override // p067l.InterfaceC15034
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo14445() {
        return new C17716(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C4977(this, 0, this.f16375.f72520);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C23082 c23082 = this.f16375;
        int i = c23082.f72520;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C7659(c23082, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f16375.f72520;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        C23082 c23082 = this.f16375;
        return c23082.containsKey(key) && C12826.equals(c23082.get(key), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        C23082 c23082 = this.f16375;
        int iM51480 = c23082.m51480(key);
        if (iM51480 == -1 || !C12826.equals(value, c23082.f72519[iM51480])) {
            return false;
        }
        int i = (c23082.f72520 - iM51480) - 1;
        Object[] objArr = c23082.f72524;
        int i2 = iM51480 + 1;
        System.arraycopy(objArr, i2, objArr, iM51480, i);
        Object[] objArr2 = c23082.f72519;
        System.arraycopy(objArr2, i2, objArr2, iM51480, i);
        int i3 = c23082.f72520 - 1;
        c23082.f72520 = i3;
        c23082.f72524[i3] = null;
        c23082.f72519[i3] = null;
        return true;
    }
}
