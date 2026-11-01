package p067l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11052 extends AbstractC19038 implements InterfaceC24068, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21111 f30604;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C11052(C21111 c21111) {
        this.f30604 = c21111;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C19769(this.f30604);
    }

    @Override // p067l.InterfaceC24068
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo3921() {
        return new C16415(this.f30604);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C19098(this.f30604);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        C21111 c21111 = this.f30604;
        if (iIntValue == 0) {
            return c21111.f66368 && C12826.equals(c21111.f66370[c21111.f66361], value);
        }
        int[] iArr = c21111.f66360;
        int iM34881 = C15322.m34881(iIntValue) & c21111.f66365;
        int i2 = iArr[iM34881];
        if (i2 == 0) {
            return false;
        }
        if (iIntValue == i2) {
            return C12826.equals(c21111.f66370[iM34881], value);
        }
        do {
            iM34881 = (iM34881 + 1) & c21111.f66365;
            i = iArr[iM34881];
            if (i == 0) {
                return false;
            }
        } while (iIntValue != i);
        return C12826.equals(c21111.f66370[iM34881], value);
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
        C21111 c21111 = this.f30604;
        if (iIntValue == 0) {
            if (!c21111.f66368 || !C12826.equals(c21111.f66370[c21111.f66361], value)) {
                return false;
            }
            c21111.m47734();
            return true;
        }
        int[] iArr = c21111.f66360;
        int iM34881 = C15322.m34881(iIntValue) & c21111.f66365;
        int i = iArr[iM34881];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (!C12826.equals(c21111.f66370[iM34881], value)) {
                return false;
            }
            c21111.m47738(iM34881);
            return true;
        }
        while (true) {
            iM34881 = (iM34881 + 1) & c21111.f66365;
            int i2 = iArr[iM34881];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && C12826.equals(c21111.f66370[iM34881], value)) {
                c21111.m47738(iM34881);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f30604.f66363;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f30604.clear();
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C21111 c21111 = this.f30604;
        if (c21111.f66368) {
            consumer.m45213n(new C11723(c21111, c21111.f66361));
        }
        int[] iArr = c21111.f66360;
        int i = c21111.f66361;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.m45213n(new C11723(c21111, i2));
            }
            i = i2;
        }
    }
}
