package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes4.dex */
public final class C9136 extends AbstractC17539 implements InterfaceC22832, InterfaceC8886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f27664;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C9136(C19720 c19720) {
        this.f27664 = c19720;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C18308(this.f27664);
    }

    @Override // l.InterfaceC22832
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12063 mo1523() {
        return new C14779(this.f27664);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C17602(this.f27664);
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
        C19720 c19720 = this.f27664;
        if (iIntValue == 0) {
            return c19720.f63737 && C11003.equals(c19720.f63739[c19720.f63730], value);
        }
        int[] iArr = c19720.f63729;
        int iM32766 = C13630.m32766(iIntValue) & c19720.f63734;
        int i2 = iArr[iM32766];
        if (i2 == 0) {
            return false;
        }
        if (iIntValue == i2) {
            return C11003.equals(c19720.f63739[iM32766], value);
        }
        do {
            iM32766 = (iM32766 + 1) & c19720.f63734;
            i = iArr[iM32766];
            if (i == 0) {
                return false;
            }
        } while (iIntValue != i);
        return C11003.equals(c19720.f63739[iM32766], value);
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
        C19720 c19720 = this.f27664;
        if (iIntValue == 0) {
            if (!c19720.f63737 || !C11003.equals(c19720.f63739[c19720.f63730], value)) {
                return false;
            }
            c19720.m45430();
            return true;
        }
        int[] iArr = c19720.f63729;
        int iM32766 = C13630.m32766(iIntValue) & c19720.f63734;
        int i = iArr[iM32766];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (!C11003.equals(c19720.f63739[iM32766], value)) {
                return false;
            }
            c19720.m45434(iM32766);
            return true;
        }
        while (true) {
            iM32766 = (iM32766 + 1) & c19720.f63734;
            int i2 = iArr[iM32766];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && C11003.equals(c19720.f63739[iM32766], value)) {
                c19720.m45434(iM32766);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27664.f63732;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f27664.clear();
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C19720 c19720 = this.f27664;
        if (c19720.f63737) {
            consumer.n(new C9842(c19720, c19720.f63730));
        }
        int[] iArr = c19720.f63729;
        int i = c19720.f63730;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C9842(c19720, i2));
            }
            i = i2;
        }
    }
}
