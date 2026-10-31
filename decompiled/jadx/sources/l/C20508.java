package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.᩶᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1N0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20508 extends AbstractC17539 implements InterfaceC4280, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f66089;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C20508(C10630 c10630) {
        this.f66089 = c10630;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C0751(this.f66089);
    }

    @Override // l.InterfaceC4280
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12063 mo12865() {
        return new C1457(this.f66089);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C5691(this.f66089);
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
        C10630 c10630 = this.f66089;
        if (iIntValue != 0) {
            int[] iArr = c10630.f31934;
            int iM32766 = C13630.m32766(iIntValue) & c10630.f31940;
            int i2 = iArr[iM32766];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (c10630.f31942[iM32766] != iIntValue2) {
                    return false;
                }
            } else {
                do {
                    iM32766 = (iM32766 + 1) & c10630.f31940;
                    i = iArr[iM32766];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (c10630.f31942[iM32766] != iIntValue2) {
                    return false;
                }
            }
        } else if (!c10630.f31944 || c10630.f31942[c10630.f31939] != iIntValue2) {
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
        C10630 c10630 = this.f66089;
        if (iIntValue == 0) {
            if (!c10630.f31944 || c10630.f31942[c10630.f31939] != iIntValue2) {
                return false;
            }
            c10630.m26662();
            return true;
        }
        int[] iArr = c10630.f31934;
        int iM32766 = C13630.m32766(iIntValue) & c10630.f31940;
        int i = iArr[iM32766];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (c10630.f31942[iM32766] != iIntValue2) {
                return false;
            }
            c10630.m26661(iM32766);
            return true;
        }
        while (true) {
            iM32766 = (iM32766 + 1) & c10630.f31940;
            int i2 = iArr[iM32766];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && c10630.f31942[iM32766] == iIntValue2) {
                c10630.m26661(iM32766);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f66089.f31945;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f66089.clear();
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C10630 c10630 = this.f66089;
        if (c10630.f31944) {
            consumer.n(new C22624(c10630, c10630.f31939));
        }
        int[] iArr = c10630.f31934;
        int i = c10630.f31939;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C22624(c10630, i2));
            }
            i = i2;
        }
    }
}
