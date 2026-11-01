package p067l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩴᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20380 extends AbstractC19038 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C10321 f62993;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C20380(C10321 c10321) {
        this.f62993 = c10321;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f62993.m23935(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C10321 c10321 = this.f62993;
        int iM23935 = c10321.m23935(obj);
        if (iM23935 == -1) {
            return false;
        }
        int i = (c10321.f28587 - iM23935) - 1;
        Object[] objArr = c10321.f28591;
        int i2 = iM23935 + 1;
        System.arraycopy(objArr, i2, objArr, iM23935, i);
        int[] iArr = c10321.f28586;
        System.arraycopy(iArr, i2, iArr, iM23935, i);
        int i3 = c10321.f28587 - 1;
        c10321.f28587 = i3;
        c10321.f28591[i3] = null;
        return true;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C4957(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C4957(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C6298(this, 0, this.f62993.f28587);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C10321 c10321 = this.f62993;
        Object[] objArr = c10321.f28591;
        int i = c10321.f28587;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f62993.f28587;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f62993.clear();
    }
}
