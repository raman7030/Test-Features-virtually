package p067l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4837 extends AbstractC19038 implements InterfaceC18247, InterfaceC10814 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C7519 f11002;

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C4837(C7519 c7519) {
        this.f11002 = c7519;
    }

    @Override // p067l.AbstractC13262, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC13833 iterator() {
        return new C16235(this.f11002);
    }

    @Override // p067l.InterfaceC18247
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13833 mo10263() {
        return new C8860(this.f11002);
    }

    @Override // p067l.AbstractC13262, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC9948 spliterator() {
        return new C24953(this.f11002);
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
        C7519 c7519 = this.f11002;
        if (iIntValue != 0) {
            int[] iArr = c7519.f19744;
            int iM34881 = C15322.m34881(iIntValue) & c7519.f19737;
            int i2 = iArr[iM34881];
            if (i2 == 0) {
                return false;
            }
            if (iIntValue == i2) {
                if (c7519.f19741[iM34881] != bByteValue) {
                    return false;
                }
            } else {
                do {
                    iM34881 = (iM34881 + 1) & c7519.f19737;
                    i = iArr[iM34881];
                    if (i == 0) {
                        return false;
                    }
                } while (iIntValue != i);
                if (c7519.f19741[iM34881] != bByteValue) {
                    return false;
                }
            }
        } else if (!c7519.f19745 || c7519.f19741[c7519.f19740] != bByteValue) {
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
        C7519 c7519 = this.f11002;
        if (iIntValue == 0) {
            if (!c7519.f19745 || c7519.f19741[c7519.f19740] != bByteValue) {
                return false;
            }
            c7519.m17415();
            return true;
        }
        int[] iArr = c7519.f19744;
        int iM34881 = C15322.m34881(iIntValue) & c7519.f19737;
        int i = iArr[iM34881];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (c7519.f19741[iM34881] != bByteValue) {
                return false;
            }
            c7519.m17418(iM34881);
            return true;
        }
        while (true) {
            iM34881 = (iM34881 + 1) & c7519.f19737;
            int i2 = iArr[iM34881];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && c7519.f19741[iM34881] == bByteValue) {
                c7519.m17418(iM34881);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11002.f19739;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f11002.clear();
    }

    @Override // p067l.AbstractC13262, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC6477
    public final void forEach(Consumer consumer) {
        C7519 c7519 = this.f11002;
        if (c7519.f19745) {
            consumer.m45213n(new C17576(c7519, c7519.f19740));
        }
        int[] iArr = c7519.f19744;
        int i = c7519.f19740;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.m45213n(new C17576(c7519, i2));
            }
            i = i2;
        }
    }
}
