package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C9428 extends AbstractC15379 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2372 f28604;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1933 f28605;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f28606;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f28607;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f28608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f28609;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f28610;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f28611;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۫ */
    public final void mo5873() {
    }

    public C9428(C2372 c2372, int i, boolean z, int i2, boolean z2) {
        this.f28604 = c2372;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C19373.m44634("Start key (", i, ") is larger than end key (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f28609 = i;
        this.f28610 = z;
        this.f28608 = i2;
        this.f28607 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C14156 c14156 = this.f28604.f7571;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C23538 c23538 = new C23538(this);
        while (c23538.hasNext()) {
            c23538.m22540();
            c23538.remove();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m24261(int i) {
        if (this.f28610 || Integer.compare(i, this.f28609) >= 0) {
            return this.f28607 || Integer.compare(i, this.f28608) < 0;
        }
        return false;
    }

    @Override // l.AbstractC15379, l.InterfaceC13659
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC0919 mo5869() {
        if (this.f28611 == null) {
            this.f28611 = new C16482(this);
        }
        return this.f28611;
    }

    @Override // l.AbstractC15379, java.util.Map, l.InterfaceC1749, java.util.SortedMap
    public final InterfaceC1933 keySet() {
        if (this.f28605 == null) {
            this.f28605 = new C17188(this);
        }
        return this.f28605;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f28606 == null) {
            this.f28606 = new C17894(this);
        }
        return this.f28606;
    }

    @Override // l.AbstractC1269, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2422(int i) {
        return m24261(i) && this.f28604.mo2422(i);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C23538 c23538 = new C23538(this);
        while (c23538.hasNext()) {
            if (C11003.equals(c23538.m22540().f17058, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        C14156 c14156M7687;
        if (!m24261(i) || (c14156M7687 = this.f28604.m7687(i)) == null) {
            return null;
        }
        return c14156M7687.f17058;
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        C2372 c2372 = this.f28604;
        c2372.f7574 = false;
        if (m24261(i)) {
            Object objMo2318 = c2372.mo2318(i, obj);
            if (c2372.f7574) {
                return null;
            }
            return objMo2318;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Key (", ") out of range [");
        sbM32308.append(this.f28610 ? "-" : String.valueOf(this.f28609));
        sbM32308.append(", ");
        throw new IllegalArgumentException(C9045.m23341(sbM32308, this.f28607 ? "-" : String.valueOf(this.f28608), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    public final Object remove(int i) {
        C2372 c2372 = this.f28604;
        c2372.f7574 = false;
        if (!m24261(i)) {
            return null;
        }
        Object objRemove = c2372.remove(i);
        if (c2372.f7574) {
            return objRemove;
        }
        return null;
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final int size() {
        C23538 c23538 = new C23538(this);
        int i = 0;
        while (c23538.hasNext()) {
            i++;
            c23538.m22540();
        }
        return i;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC1749 mo5874(int i) {
        boolean z = this.f28607;
        C2372 c2372 = this.f28604;
        if (z) {
            return new C9428(c2372, this.f28609, this.f28610, i, false);
        }
        if (Integer.compare(i, this.f28608) >= 0) {
            return this;
        }
        return new C9428(c2372, this.f28609, this.f28610, i, false);
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC1749 mo5871(int i) {
        boolean z = this.f28610;
        C2372 c2372 = this.f28604;
        if (z) {
            return new C9428(c2372, i, false, this.f28608, this.f28607);
        }
        return Integer.compare(i, this.f28609) > 0 ? new C9428(c2372, i, false, this.f28608, this.f28607) : this;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1749 mo5872(int i, int i2) {
        C2372 c2372 = this.f28604;
        boolean z = this.f28610;
        boolean z2 = this.f28607;
        if (z2 && z) {
            return new C9428(c2372, i, false, i2, false);
        }
        int i3 = this.f28608;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f28609;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C9428(c2372, i, false, i4, false) : this;
    }

    public final C14156 firstEntry() {
        C14156 c14156M7688;
        C2372 c2372 = this.f28604;
        if (c2372.f7573 == null) {
            return null;
        }
        if (this.f28610) {
            c14156M7688 = c2372.f7571;
        } else {
            int i = this.f28609;
            c14156M7688 = c2372.m7688(i);
            if (Integer.compare(c14156M7688.f17057, i) < 0) {
                c14156M7688 = c14156M7688.m33775();
            }
        }
        if (c14156M7688 == null) {
            return null;
        }
        if (this.f28607 || Integer.compare(c14156M7688.f17057, this.f28608) < 0) {
            return c14156M7688;
        }
        return null;
    }

    public final C14156 lastEntry() {
        C14156 c14156M7688;
        C2372 c2372 = this.f28604;
        if (c2372.f7573 == null) {
            return null;
        }
        if (this.f28607) {
            c14156M7688 = c2372.f7575;
        } else {
            int i = this.f28608;
            c14156M7688 = c2372.m7688(i);
            if (Integer.compare(c14156M7688.f17057, i) >= 0) {
                c14156M7688 = c14156M7688.m33770();
            }
        }
        if (c14156M7688 == null) {
            return null;
        }
        if (this.f28610 || Integer.compare(c14156M7688.f17057, this.f28609) >= 0) {
            return c14156M7688;
        }
        return null;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۡ */
    public final int mo5870() {
        C14156 c14156FirstEntry = firstEntry();
        if (c14156FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c14156FirstEntry.f17057;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۛ */
    public final int mo5868() {
        C14156 c14156LastEntry = lastEntry();
        if (c14156LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c14156LastEntry.f17057;
    }
}
