package p067l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩸ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XC7C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23002 extends AbstractC6238 implements Cloneable, InterfaceC15664, InterfaceC10814 {
    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    @Override // p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public /* synthetic */ InterfaceC16847 spliterator() {
        return C23554.spliterator(this, 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo51392(float f);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != ((C24342) this).f77107) {
            return false;
        }
        if (set instanceof InterfaceC15664) {
            return mo14154((InterfaceC15664) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C24342 c24342 = (C24342) this;
        int i = c24342.f77107;
        C8249 c8249 = new C8249(c24342);
        int iFloatToRawIntBits = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iFloatToRawIntBits;
            }
            iFloatToRawIntBits += Float.floatToRawIntBits(c8249.nextFloat());
            i = i2;
        }
    }

    @Override // p067l.AbstractC6238, p067l.InterfaceC12984
    @Deprecated
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6350(float f) {
        return mo51392(f);
    }
}
