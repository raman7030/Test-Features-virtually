package p067l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2964 extends AbstractC19038 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23082 f5174;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C2964(C23082 c23082) {
        this.f5174 = c23082;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5174.m51480(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C23082 c23082 = this.f5174;
        int iM51480 = c23082.m51480(obj);
        if (iM51480 == -1) {
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

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C20400(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C20400(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C21071(this, 0, this.f5174.f72520);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C23082 c23082 = this.f5174;
        Object[] objArr = c23082.f72524;
        int i = c23082.f72520;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5174.f72520;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5174.clear();
    }
}
