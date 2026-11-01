package p067l;

import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/* JADX INFO: renamed from: l.۫ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14284 extends C20991 {
    public static final long serialVersionUID = -3185226345314976296L;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C12273 f40688;

    @Override // p067l.C3555, p067l.AbstractC16965, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14284(C12273 c12273, int i, int i2) {
        super(c12273, i, i2);
        this.f40688 = c12273;
    }

    @Override // p067l.C3555, p067l.InterfaceC6948
    public final float getFloat(int i) {
        m38560(i);
        return this.f40688.f34289[i + this.f7212];
    }

    @Override // p067l.AbstractC16965, p067l.InterfaceC6948, java.util.List
    public final ListIterator listIterator(int i) {
        return new C5567(this, i);
    }

    @Override // p067l.C3555, p067l.AbstractC16965, p067l.InterfaceC6948, java.util.List
    public final InterfaceC5607 listIterator(int i) {
        return new C5567(this, i);
    }

    @Override // p067l.C3555, p067l.AbstractC16965, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C14954(this);
    }

    @Override // p067l.C3555, p067l.AbstractC16965, p067l.AbstractC6238, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC18327 spliterator() {
        return new C14954(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m32852(int i, int i2, float[] fArr) {
        C12273 c12273 = this.f40688;
        float[] fArr2 = c12273.f34289;
        int i3 = this.f7212;
        if (fArr2 == fArr && i3 == i && this.f7211 == i2) {
            return true;
        }
        if (i2 - i != size()) {
            return false;
        }
        while (i3 < this.f7211) {
            int i4 = i3 + 1;
            float f = c12273.f34289[i3];
            int i5 = i + 1;
            if (f != fArr[i]) {
                return false;
            }
            i = i5;
            i3 = i4;
        }
        return true;
    }

    @Override // p067l.AbstractC16965, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        if (obj instanceof C12273) {
            C12273 c12273 = (C12273) obj;
            return m32852(0, c12273.f34290, c12273.f34289);
        }
        if (obj instanceof C14284) {
            C14284 c14284 = (C14284) obj;
            return m32852(c14284.f7212, c14284.f7211, c14284.f40688.f34289);
        }
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m32851(int i, int i2, float[] fArr) {
        int i3;
        C12273 c12273 = this.f40688;
        float[] fArr2 = c12273.f34289;
        int i4 = this.f7212;
        if (fArr2 == fArr && i4 == i && this.f7211 == i2) {
            return 0;
        }
        while (true) {
            i3 = this.f7211;
            if (i4 >= i3 || i4 >= i2) {
                break;
            }
            int iCompare = Float.compare(c12273.f34289[i4], fArr[i]);
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

    @Override // p067l.C3555, p067l.AbstractC16965, java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(List list) {
        if (list instanceof C12273) {
            C12273 c12273 = (C12273) list;
            return m32851(0, c12273.f34290, c12273.f34289);
        }
        if (list instanceof C14284) {
            C14284 c14284 = (C14284) list;
            return m32851(c14284.f7212, c14284.f7211, c14284.f40688.f34289);
        }
        return super.compareTo(list);
    }
}
