package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2597 extends AbstractC17539 implements InterfaceC16707, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f8210;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C2597(C5419 c5419) {
        this.f8210 = c5419;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C14590(this.f8210);
    }

    @Override // l.InterfaceC16707
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12063 mo8224() {
        return new C6830(this.f8210);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C23763(this.f8210);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Byte)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        byte bByteValue = ((Byte) entry.getValue()).byteValue();
        C5419 c5419 = this.f8210;
        if (iIntValue != 0) {
            int[] iArr = c5419.f16906;
            int iM32766 = C13630.m32766(iIntValue) & c5419.f16899;
            int i2 = iArr[iM32766];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (c5419.f16903[iM32766] != bByteValue) {
                    return false;
                }
            } else {
                do {
                    iM32766 = (iM32766 + 1) & c5419.f16899;
                    i = iArr[iM32766];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (c5419.f16903[iM32766] != bByteValue) {
                    return false;
                }
            }
        } else if (!c5419.f16907 || c5419.f16903[c5419.f16902] != bByteValue) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Byte)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        byte bByteValue = ((Byte) entry.getValue()).byteValue();
        C5419 c5419 = this.f8210;
        if (iIntValue == 0) {
            if (!c5419.f16907 || c5419.f16903[c5419.f16902] != bByteValue) {
                return false;
            }
            c5419.m15504();
            return true;
        }
        int[] iArr = c5419.f16906;
        int iM32766 = C13630.m32766(iIntValue) & c5419.f16899;
        int i = iArr[iM32766];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (c5419.f16903[iM32766] != bByteValue) {
                return false;
            }
            c5419.m15507(iM32766);
            return true;
        }
        while (true) {
            iM32766 = (iM32766 + 1) & c5419.f16899;
            int i2 = iArr[iM32766];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && c5419.f16903[iM32766] == bByteValue) {
                c5419.m15507(iM32766);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8210.f16901;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f8210.clear();
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C5419 c5419 = this.f8210;
        if (c5419.f16907) {
            consumer.n(new C16001(c5419, c5419.f16902));
        }
        int[] iArr = c5419.f16906;
        int i = c5419.f16902;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C16001(c5419, i2));
            }
            i = i2;
        }
    }
}
