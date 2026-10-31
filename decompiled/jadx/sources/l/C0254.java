package l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0254 extends AbstractC17539 implements InterfaceC22832, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4488 f1537;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C0254(C4488 c4488) {
        this.f1537 = c4488;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3783(this);
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C3783(this);
    }

    @Override // l.InterfaceC22832
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12063 mo1523() {
        return new C18600(this);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C19306(this, 0, this.f1537.f14280);
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C4488 c4488 = this.f1537;
        int i = c4488.f14280;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C15070(c4488, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f1537.f14280;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C4488 c4488 = this.f1537;
            if (c4488.mo2422(iIntValue) && C11003.equals(c4488.get(iIntValue), entry.getValue())) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        C4488 c4488 = this.f1537;
        int iM13236 = c4488.m13236(iIntValue);
        if (iM13236 == -1 || !C11003.equals(value, c4488.f14279[iM13236])) {
            return false;
        }
        int i = (c4488.f14280 - iM13236) - 1;
        int[] iArr = c4488.f14284;
        int i2 = iM13236 + 1;
        System.arraycopy(iArr, i2, iArr, iM13236, i);
        Object[] objArr = c4488.f14279;
        System.arraycopy(objArr, i2, objArr, iM13236, i);
        int i3 = c4488.f14280 - 1;
        c4488.f14280 = i3;
        c4488.f14279[i3] = null;
        return true;
    }
}
