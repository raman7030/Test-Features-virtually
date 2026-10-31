package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩹ܰۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22320 extends AbstractC17539 implements InterfaceC17903, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11737 f72342;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C22320(C11737 c11737) {
        this.f72342 = c11737;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8209(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C8209(this);
    }

    @Override // l.InterfaceC17903
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12063 mo41879() {
        return new C15263(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C21615(this, 0, this.f72342.f35006);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C11737 c11737 = this.f72342;
        int i = c11737.f35006;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C13147(c11737, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f72342.f35006;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Character) && entry.getValue() != null && (entry.getValue() instanceof Character)) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            C11737 c11737 = this.f72342;
            if (c11737.mo20129(cCharValue) && c11737.mo20130(cCharValue) == ((Character) entry.getValue()).charValue()) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Character) || entry.getValue() == null || !(entry.getValue() instanceof Character)) {
            return false;
        }
        char cCharValue = ((Character) entry.getKey()).charValue();
        char cCharValue2 = ((Character) entry.getValue()).charValue();
        C11737 c11737 = this.f72342;
        int iM28640 = c11737.m28640(cCharValue);
        if (iM28640 == -1 || cCharValue2 != c11737.f35005[iM28640]) {
            return false;
        }
        int i = (c11737.f35006 - iM28640) - 1;
        char[] cArr = c11737.f35010;
        int i2 = iM28640 + 1;
        System.arraycopy(cArr, i2, cArr, iM28640, i);
        char[] cArr2 = c11737.f35005;
        System.arraycopy(cArr2, i2, cArr2, iM28640, i);
        c11737.f35006--;
        return true;
    }
}
