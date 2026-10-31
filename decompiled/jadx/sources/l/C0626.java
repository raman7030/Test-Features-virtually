package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0626 extends AbstractC17539 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21794 f2401;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C0626(C21794 c21794) {
        this.f2401 = c21794;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2401.m49130(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C21794 c21794 = this.f2401;
        int iM49130 = c21794.m49130(obj);
        if (iM49130 == -1) {
            return false;
        }
        int i = (c21794.f69812 - iM49130) - 1;
        Object[] objArr = c21794.f69816;
        int i2 = iM49130 + 1;
        System.arraycopy(objArr, i2, objArr, iM49130, i);
        Object[] objArr2 = c21794.f69811;
        System.arraycopy(objArr2, i2, objArr2, iM49130, i);
        int i3 = c21794.f69812 - 1;
        c21794.f69812 = i3;
        c21794.f69816[i3] = null;
        c21794.f69811[i3] = null;
        return true;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C18972(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C18972(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C19678(this, 0, this.f2401.f69812);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C21794 c21794 = this.f2401;
        Object[] objArr = c21794.f69816;
        int i = c21794.f69812;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(objArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2401.f69812;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2401.clear();
    }
}
