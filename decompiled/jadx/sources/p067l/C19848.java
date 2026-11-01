package p067l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K9H */
/* JADX INFO: loaded from: classes5.dex */
public final class C19848 extends AbstractC19038 implements InterfaceC6848, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C22531 f60327;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C19848(C22531 c22531) {
        this.f60327 = c22531;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C13554(this.f60327);
    }

    @Override // p067l.InterfaceC6848
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo15689() {
        return new C15564(this.f60327);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C24282(this.f60327);
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
        C22531 c22531 = this.f60327;
        if (iIntValue != 0) {
            int[] iArr = c22531.f71035;
            int iM34881 = C15322.m34881(iIntValue) & c22531.f71028;
            int i2 = iArr[iM34881];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (Float.floatToRawIntBits(c22531.f71032[iM34881]) != Float.floatToRawIntBits(fFloatValue)) {
                    return false;
                }
            } else {
                do {
                    iM34881 = (iM34881 + 1) & c22531.f71028;
                    i = iArr[iM34881];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (Float.floatToRawIntBits(c22531.f71032[iM34881]) != Float.floatToRawIntBits(fFloatValue)) {
                    return false;
                }
            }
        } else if (!c22531.f71036 || Float.floatToRawIntBits(c22531.f71032[c22531.f71031]) != Float.floatToRawIntBits(fFloatValue)) {
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
        C22531 c22531 = this.f60327;
        if (iIntValue == 0) {
            if (!c22531.f71036 || Float.floatToRawIntBits(c22531.f71032[c22531.f71031]) != Float.floatToRawIntBits(fFloatValue)) {
                return false;
            }
            c22531.m50486();
            return true;
        }
        int[] iArr = c22531.f71035;
        int iM34881 = C15322.m34881(iIntValue) & c22531.f71028;
        int i = iArr[iM34881];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (Float.floatToRawIntBits(c22531.f71032[iM34881]) != Float.floatToRawIntBits(fFloatValue)) {
                return false;
            }
            c22531.m50489(iM34881);
            return true;
        }
        while (true) {
            iM34881 = (iM34881 + 1) & c22531.f71028;
            int i2 = iArr[iM34881];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && Float.floatToRawIntBits(c22531.f71032[iM34881]) == Float.floatToRawIntBits(fFloatValue)) {
                c22531.m50489(iM34881);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f60327.f71030;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f60327.clear();
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C22531 c22531 = this.f60327;
        if (c22531.f71036) {
            consumer.m45213n(new C18506(c22531, c22531.f71031));
        }
        int[] iArr = c22531.f71035;
        int i = c22531.f71031;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.m45213n(new C18506(c22531, i2));
            }
            i = i2;
        }
    }
}
