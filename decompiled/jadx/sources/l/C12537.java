package l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12537 extends C19594 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10421 f37664;

    @Override // l.C1248, l.AbstractC15358, l.AbstractC4071, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12537(C10421 c10421, int i, int i2) {
        super(c10421, i, i2);
        this.f37664 = c10421;
    }

    @Override // l.C1248, l.InterfaceC4818
    public final float getFloat(int i) {
        m36402(i);
        return this.f37664.f31324[i + this.f4443];
    }

    @Override // l.AbstractC15358, l.InterfaceC4818, java.util.List
    public final ListIterator listIterator(int i) {
        return new C3365(this, i);
    }

    @Override // l.C1248, l.AbstractC15358, l.InterfaceC4818, java.util.List
    public final InterfaceC3407 listIterator(int i) {
        return new C3365(this, i);
    }

    @Override // l.C1248, l.AbstractC15358, l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C13242(this);
    }

    @Override // l.C1248, l.AbstractC15358, l.AbstractC4071, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC16791 spliterator() {
        return new C13242(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30779(int i, int i2, float[] fArr) {
        C10421 c10421 = this.f37664;
        float[] fArr2 = c10421.f31324;
        int i3 = this.f4443;
        if (fArr2 == fArr && i3 == i && this.f4442 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f4442) {
            int i4 = i3 + 1;
            float f = c10421.f31324[i3];
            int i5 = i + 1;
            if (f != fArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // l.AbstractC15358, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C10421) {
            C10421 c10421 = (C10421) obj;
            return m30779(0, c10421.f31325, c10421.f31324);
        }
        if (obj instanceof C12537) {
            C12537 c12537 = (C12537) obj;
            return m30779(c12537.f4443, c12537.f4442, c12537.f37664.f31324);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30778(int i, int i2, float[] fArr) {
        int i3;
        C10421 c10421 = this.f37664;
        float[] fArr2 = c10421.f31324;
        int i4 = this.f4443;
        if (fArr2 == fArr && i4 == i && this.f4442 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f4442;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Float.compare(c10421.f31324[i4], fArr[i]);
            if (iCompare != 0) {
                return iCompare;
            }
            i4++;
            i++;
        }
        if (i4 < i2) {
            return -1;
        }
        return i4 < i3 ? 1 : 0;
    }

    @Override // l.C1248, l.AbstractC15358, java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C10421) {
            C10421 c10421 = (C10421) list;
            return m30778(0, c10421.f31325, c10421.f31324);
        }
        if (list instanceof C12537) {
            C12537 c12537 = (C12537) list;
            return m30778(c12537.f4443, c12537.f4442, c12537.f37664.f31324);
        }
        return super.compareTo(list);
    }
}
