package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2610 extends AbstractC19038 implements InterfaceC24068, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C6634 f4315;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C2610(C6634 c6634) {
        this.f4315 = c6634;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5964(this);
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C5964(this);
    }

    @Override // p067l.InterfaceC24068
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo3921() {
        return new C20046(this);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C20717(this, 0, this.f4315.f17107);
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C6634 c6634 = this.f4315;
        int i = c6634.f17107;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept(new C16691(c6634, i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f4315.f17107;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() != null && (entry.getKey() instanceof Integer)) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            C6634 c6634 = this.f4315;
            if (c6634.mo4793(iIntValue) && C12826.equals(c6634.get(iIntValue), entry.getValue())) {
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
        C6634 c6634 = this.f4315;
        int iM15118 = c6634.m15118(iIntValue);
        if (iM15118 == -1 || !C12826.equals(value, c6634.f17106[iM15118])) {
            return false;
        }
        int i = (c6634.f17107 - iM15118) - 1;
        int[] iArr = c6634.f17111;
        int i2 = iM15118 + 1;
        System.arraycopy(iArr, i2, iArr, iM15118, i);
        Object[] objArr = c6634.f17106;
        System.arraycopy(objArr, i2, objArr, iM15118, i);
        int i3 = c6634.f17107 - 1;
        c6634.f17107 = i3;
        c6634.f17106[i3] = null;
        return true;
    }
}
