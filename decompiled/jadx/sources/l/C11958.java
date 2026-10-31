package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۨ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C11958 extends AbstractC15379 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7724 f35811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1933 f35812;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f35813;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f35814;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f35815;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f35816;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f35817;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f35818;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۫ */
    public final void mo5873() {
    }

    public C11958(C7724 c7724, int i, boolean z, int i2, boolean z2) {
        this.f35811 = c7724;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C19373.m44634("Start key (", i, ") is larger than end key (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f35816 = i;
        this.f35817 = z;
        this.f35815 = i2;
        this.f35814 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C8430 c8430 = this.f35811.f23896;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C12663 c12663 = new C12663(this);
        while (c12663.hasNext()) {
            c12663.m51565();
            c12663.remove();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m29235(int i) {
        if (this.f35817 || Integer.compare(i, this.f35816) >= 0) {
            return this.f35814 || Integer.compare(i, this.f35815) < 0;
        }
        return false;
    }

    @Override // l.AbstractC15379, l.InterfaceC13659
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC0919 mo5869() {
        if (this.f35818 == null) {
            this.f35818 = new C20425(this);
        }
        return this.f35818;
    }

    @Override // l.AbstractC15379, java.util.Map, l.InterfaceC1749, java.util.SortedMap
    public final InterfaceC1933 keySet() {
        if (this.f35812 == null) {
            this.f35812 = new C3491(this);
        }
        return this.f35812;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f35813 == null) {
            this.f35813 = new C4902(this);
        }
        return this.f35813;
    }

    @Override // l.AbstractC1269, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2422(int i) {
        return m29235(i) && this.f35811.mo2422(i);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C12663 c12663 = new C12663(this);
        while (c12663.hasNext()) {
            if (C11003.equals(c12663.m51565().f17058, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        C8430 c8430M20679;
        if (!m29235(i) || (c8430M20679 = this.f35811.m20679(i)) == null) {
            return null;
        }
        return c8430M20679.f17058;
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        C7724 c7724 = this.f35811;
        c7724.f23900 = false;
        if (m29235(i)) {
            Object objMo2318 = c7724.mo2318(i, obj);
            if (c7724.f23900) {
                return null;
            }
            return objMo2318;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Key (", ") out of range [");
        sbM32308.append(this.f35817 ? "-" : String.valueOf(this.f35816));
        sbM32308.append(", ");
        throw new IllegalArgumentException(C9045.m23341(sbM32308, this.f35814 ? "-" : String.valueOf(this.f35815), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    public final Object remove(int i) {
        C7724 c7724 = this.f35811;
        c7724.f23900 = false;
        if (!m29235(i)) {
            return null;
        }
        Object objRemove = c7724.remove(i);
        if (c7724.f23900) {
            return objRemove;
        }
        return null;
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final int size() {
        C12663 c12663 = new C12663(this);
        int i = 0;
        while (c12663.hasNext()) {
            i++;
            c12663.m51565();
        }
        return i;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC1749 mo5874(int i) {
        boolean z = this.f35814;
        C7724 c7724 = this.f35811;
        if (z) {
            return new C11958(c7724, this.f35816, this.f35817, i, false);
        }
        if (Integer.compare(i, this.f35815) >= 0) {
            return this;
        }
        return new C11958(c7724, this.f35816, this.f35817, i, false);
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC1749 mo5871(int i) {
        boolean z = this.f35817;
        C7724 c7724 = this.f35811;
        if (z) {
            return new C11958(c7724, i, false, this.f35815, this.f35814);
        }
        return Integer.compare(i, this.f35816) > 0 ? new C11958(c7724, i, false, this.f35815, this.f35814) : this;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC1749 mo5872(int i, int i2) {
        C7724 c7724 = this.f35811;
        boolean z = this.f35817;
        boolean z2 = this.f35814;
        if (z2 && z) {
            return new C11958(c7724, i, false, i2, false);
        }
        int i3 = this.f35815;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f35816;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C11958(c7724, i, false, i4, false) : this;
    }

    public final C8430 firstEntry() {
        C8430 c8430M20680;
        C7724 c7724 = this.f35811;
        if (c7724.f23897 == null) {
            return null;
        }
        if (this.f35817) {
            c8430M20680 = c7724.f23896;
        } else {
            int i = this.f35816;
            c8430M20680 = c7724.m20680(i);
            if (Integer.compare(c8430M20680.f17057, i) < 0) {
                c8430M20680 = c8430M20680.m22104();
            }
        }
        if (c8430M20680 == null) {
            return null;
        }
        if (this.f35814 || Integer.compare(c8430M20680.f17057, this.f35815) < 0) {
            return c8430M20680;
        }
        return null;
    }

    public final C8430 lastEntry() {
        C8430 c8430M20680;
        C7724 c7724 = this.f35811;
        if (c7724.f23897 == null) {
            return null;
        }
        if (this.f35814) {
            c8430M20680 = c7724.f23901;
        } else {
            int i = this.f35815;
            c8430M20680 = c7724.m20680(i);
            if (Integer.compare(c8430M20680.f17057, i) >= 0) {
                c8430M20680 = c8430M20680.m22100();
            }
        }
        if (c8430M20680 == null) {
            return null;
        }
        if (this.f35817 || Integer.compare(c8430M20680.f17057, this.f35816) >= 0) {
            return c8430M20680;
        }
        return null;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۡ */
    public final int mo5870() {
        C8430 c8430FirstEntry = firstEntry();
        if (c8430FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c8430FirstEntry.f17057;
    }

    @Override // l.InterfaceC1749
    /* JADX INFO: renamed from: ۛ */
    public final int mo5868() {
        C8430 c8430LastEntry = lastEntry();
        if (c8430LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c8430LastEntry.f17057;
    }
}
