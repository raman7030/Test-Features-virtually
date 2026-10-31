package l;

import java.util.Set;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.᩸ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XC7C */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC21710 extends AbstractC4071 implements Cloneable, InterfaceC13989, InterfaceC8886 {
    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    @Override // l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public /* synthetic */ InterfaceC15234 spliterator() {
        return C22291.spliterator(this, 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract boolean mo49043(float f);

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != ((C23120) this).f74363) {
            return false;
        }
        if (set instanceof InterfaceC13989) {
            return mo12233((InterfaceC13989) set);
        }
        return containsAll(set);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C23120 c23120 = (C23120) this;
        int i = c23120.f74363;
        C6187 c6187 = new C6187(c23120);
        int iFloatToRawIntBits = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iFloatToRawIntBits;
            }
            iFloatToRawIntBits += Float.floatToRawIntBits(c6187.nextFloat());
            i = i2;
        }
    }

    @Override // l.AbstractC4071, l.InterfaceC11169
    @Deprecated
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo4106(float f) {
        return mo49043(f);
    }
}
