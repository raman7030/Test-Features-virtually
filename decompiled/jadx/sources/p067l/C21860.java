package p067l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21860 extends AbstractC19038 implements InterfaceC6437, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C12472 f68768;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C21860(C12472 c12472) {
        this.f68768 = c12472;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C3083(this.f68768);
    }

    @Override // p067l.InterfaceC6437
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo14729() {
        return new C3754(this.f68768);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C7778(this.f68768);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        int iIntValue2 = ((Integer) entry.getValue()).intValue();
        C12472 c12472 = this.f68768;
        if (iIntValue != 0) {
            int[] iArr = c12472.f34906;
            int iM34881 = C15322.m34881(iIntValue) & c12472.f34912;
            int i2 = iArr[iM34881];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (c12472.f34914[iM34881] != iIntValue2) {
                    return false;
                }
            } else {
                do {
                    iM34881 = (iM34881 + 1) & c12472.f34912;
                    i = iArr[iM34881];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (c12472.f34914[iM34881] != iIntValue2) {
                    return false;
                }
            }
        } else if (!c12472.f34916 || c12472.f34914[c12472.f34911] != iIntValue2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        int iIntValue2 = ((Integer) entry.getValue()).intValue();
        C12472 c12472 = this.f68768;
        if (iIntValue == 0) {
            if (!c12472.f34916 || c12472.f34914[c12472.f34911] != iIntValue2) {
                return false;
            }
            c12472.m28702();
            return true;
        }
        int[] iArr = c12472.f34906;
        int iM34881 = C15322.m34881(iIntValue) & c12472.f34912;
        int i = iArr[iM34881];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (c12472.f34914[iM34881] != iIntValue2) {
                return false;
            }
            c12472.m28701(iM34881);
            return true;
        }
        while (true) {
            iM34881 = (iM34881 + 1) & c12472.f34912;
            int i2 = iArr[iM34881];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && c12472.f34914[iM34881] == iIntValue2) {
                c12472.m28701(iM34881);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f68768.f34917;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f68768.clear();
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C12472 c12472 = this.f68768;
        if (c12472.f34916) {
            consumer.m45213n(new C23871(c12472, c12472.f34911));
        }
        int[] iArr = c12472.f34906;
        int i = c12472.f34911;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.m45213n(new C23871(c12472, i2));
            }
            i = i2;
        }
    }
}
