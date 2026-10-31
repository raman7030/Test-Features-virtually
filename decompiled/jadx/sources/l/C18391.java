package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes5.dex */
public final class C18391 extends AbstractC17539 implements InterfaceC4713, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21214 f57107;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C18391(C21214 c21214) {
        this.f57107 = c21214;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C11769(this.f57107);
    }

    @Override // l.InterfaceC4713
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12063 mo13813() {
        return new C13884(this.f57107);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C23057(this.f57107);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Float)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        float fFloatValue = ((Float) entry.getValue()).floatValue();
        C21214 c21214 = this.f57107;
        if (iIntValue != 0) {
            int[] iArr = c21214.f68352;
            int iM32766 = C13630.m32766(iIntValue) & c21214.f68345;
            int i2 = iArr[iM32766];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (Float.floatToRawIntBits(c21214.f68349[iM32766]) != Float.floatToRawIntBits(fFloatValue)) {
                    return false;
                }
            } else {
                do {
                    iM32766 = (iM32766 + 1) & c21214.f68345;
                    i = iArr[iM32766];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (Float.floatToRawIntBits(c21214.f68349[iM32766]) != Float.floatToRawIntBits(fFloatValue)) {
                    return false;
                }
            }
        } else if (!c21214.f68353 || Float.floatToRawIntBits(c21214.f68349[c21214.f68348]) != Float.floatToRawIntBits(fFloatValue)) {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer) || entry.getValue() == null || !(entry.getValue() instanceof Float)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        float fFloatValue = ((Float) entry.getValue()).floatValue();
        C21214 c21214 = this.f57107;
        if (iIntValue == 0) {
            if (!c21214.f68353 || Float.floatToRawIntBits(c21214.f68349[c21214.f68348]) != Float.floatToRawIntBits(fFloatValue)) {
                return false;
            }
            c21214.m48155();
            return true;
        }
        int[] iArr = c21214.f68352;
        int iM32766 = C13630.m32766(iIntValue) & c21214.f68345;
        int i = iArr[iM32766];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (Float.floatToRawIntBits(c21214.f68349[iM32766]) != Float.floatToRawIntBits(fFloatValue)) {
                return false;
            }
            c21214.m48158(iM32766);
            return true;
        }
        while (true) {
            iM32766 = (iM32766 + 1) & c21214.f68345;
            int i2 = iArr[iM32766];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && Float.floatToRawIntBits(c21214.f68349[iM32766]) == Float.floatToRawIntBits(fFloatValue)) {
                c21214.m48158(iM32766);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f57107.f68347;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f57107.clear();
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C21214 c21214 = this.f57107;
        if (c21214.f68353) {
            consumer.n(new C16979(c21214, c21214.f68348));
        }
        int[] iArr = c21214.f68352;
        int i = c21214.f68348;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C16979(c21214, i2));
            }
            i = i2;
        }
    }
}
