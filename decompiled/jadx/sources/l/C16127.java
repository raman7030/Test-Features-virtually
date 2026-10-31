package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܺᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16127 extends AbstractC17539 implements InterfaceC13305, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8367 f49693;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C16127(C8367 c8367) {
        this.f49693 = c8367;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21068(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C21068(this);
    }

    @Override // l.InterfaceC13305
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12063 mo32280() {
        return new C9779(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C9073(this, 0, this.f49693.f25674);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C8367 c8367 = this.f49693;
        int i = c8367.f25674;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C19657(c8367, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f49693.f25674;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getValue() != null && (entry.getValue() instanceof Integer)) {
            Object key = entry.getKey();
            C8367 c8367 = this.f49693;
            if (c8367.containsKey(key) && c8367.mo21968(key) == ((Integer) entry.getValue()).intValue()) {
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
        if (entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        Object key = entry.getKey();
        int iIntValue = ((Integer) entry.getValue()).intValue();
        C8367 c8367 = this.f49693;
        int iM21964 = c8367.m21964(key);
        if (iM21964 == -1 || iIntValue != c8367.f25673[iM21964]) {
            return false;
        }
        int i = (c8367.f25674 - iM21964) - 1;
        Object[] objArr = c8367.f25678;
        int i2 = iM21964 + 1;
        System.arraycopy(objArr, i2, objArr, iM21964, i);
        int[] iArr = c8367.f25673;
        System.arraycopy(iArr, i2, iArr, iM21964, i);
        int i3 = c8367.f25674 - 1;
        c8367.f25674 = i3;
        c8367.f25678[i3] = null;
        return true;
    }
}
