package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11329 extends AbstractC16985 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C4623 f31551;

    /* JADX INFO: renamed from: ۙ */
    public transient InterfaceC4206 f31552;

    /* JADX INFO: renamed from: ۤ */
    public transient InterfaceC21210 f31553;

    /* JADX INFO: renamed from: ۫ */
    public boolean f31554;

    /* JADX INFO: renamed from: ۬ */
    public int f31555;

    /* JADX INFO: renamed from: ᩶ */
    public int f31556;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f31557;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC3242 f31558;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۫ */
    public final void mo8083() {
    }

    public C11329(C4623 c4623, int i, boolean z, int i2, boolean z2) {
        this.f31551 = c4623;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C20780.m46928("Start key (", i, ") is larger than end key (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f31556 = i;
        this.f31557 = z;
        this.f31555 = i2;
        this.f31554 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C15823 c15823 = this.f31551.f10362;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C24739 c24739 = new C24739(this);
        while (c24739.hasNext()) {
            c24739.m24509();
            c24739.remove();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m26271(int i) {
        if (this.f31557 || Integer.compare(i, this.f31556) >= 0) {
            return this.f31554 || Integer.compare(i, this.f31555) < 0;
        }
        return false;
    }

    @Override // p067l.AbstractC16985, p067l.InterfaceC15350
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC3242 mo8079() {
        if (this.f31558 == null) {
            this.f31558 = new C18033(this);
        }
        return this.f31558;
    }

    @Override // p067l.AbstractC16985, java.util.Map, p067l.InterfaceC4031, java.util.SortedMap
    public final InterfaceC4206 keySet() {
        if (this.f31552 == null) {
            this.f31552 = new C18704(this);
        }
        return this.f31552;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f31553 == null) {
            this.f31553 = new C19375(this);
        }
        return this.f31553;
    }

    @Override // p067l.AbstractC3575, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4793(int i) {
        return m26271(i) && this.f31551.mo4793(i);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C24739 c24739 = new C24739(this);
        while (c24739.hasNext()) {
            if (C12826.equals(c24739.m24509().f19897, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC14680
    public final Object get(int i) {
        C15823 c15823M9748;
        if (!m26271(i) || (c15823M9748 = this.f31551.m9748(i)) == null) {
            return null;
        }
        return c15823M9748.f19897;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4686(int i, Object obj) {
        C4623 c4623 = this.f31551;
        c4623.f10365 = false;
        if (m26271(i)) {
            Object objMo4686 = c4623.mo4686(i, obj);
            if (c4623.f10365) {
                return null;
            }
            return objMo4686;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Key (", ") out of range [");
        sbM34408.append(this.f31557 ? "-" : String.valueOf(this.f31556));
        sbM34408.append(", ");
        throw new IllegalArgumentException(C10965.m25286(sbM34408, this.f31554 ? "-" : String.valueOf(this.f31555), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    public final Object remove(int i) {
        C4623 c4623 = this.f31551;
        c4623.f10365 = false;
        if (!m26271(i)) {
            return null;
        }
        Object objRemove = c4623.remove(i);
        if (c4623.f10365) {
            return objRemove;
        }
        return null;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final int size() {
        C24739 c24739 = new C24739(this);
        int i = 0;
        while (c24739.hasNext()) {
            i++;
            c24739.m24509();
        }
        return i;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC4031 mo8084(int i) {
        boolean z = this.f31554;
        C4623 c4623 = this.f31551;
        if (z) {
            return new C11329(c4623, this.f31556, this.f31557, i, false);
        }
        if (Integer.compare(i, this.f31555) >= 0) {
            return this;
        }
        return new C11329(c4623, this.f31556, this.f31557, i, false);
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4031 mo8081(int i) {
        boolean z = this.f31557;
        C4623 c4623 = this.f31551;
        if (z) {
            return new C11329(c4623, i, false, this.f31555, this.f31554);
        }
        return Integer.compare(i, this.f31556) > 0 ? new C11329(c4623, i, false, this.f31555, this.f31554) : this;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4031 mo8082(int i, int i2) {
        C4623 c4623 = this.f31551;
        boolean z = this.f31557;
        boolean z2 = this.f31554;
        if (z2 && z) {
            return new C11329(c4623, i, false, i2, false);
        }
        int i3 = this.f31555;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f31556;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C11329(c4623, i, false, i4, false) : this;
    }

    public final C15823 firstEntry() {
        C15823 c15823M9749;
        C4623 c4623 = this.f31551;
        if (c4623.f10364 == null) {
            return null;
        }
        if (this.f31557) {
            c15823M9749 = c4623.f10362;
        } else {
            int i = this.f31556;
            c15823M9749 = c4623.m9749(i);
            if (Integer.compare(c15823M9749.f19896, i) < 0) {
                c15823M9749 = c15823M9749.m35908();
            }
        }
        if (c15823M9749 == null) {
            return null;
        }
        if (this.f31554 || Integer.compare(c15823M9749.f19896, this.f31555) < 0) {
            return c15823M9749;
        }
        return null;
    }

    public final C15823 lastEntry() {
        C15823 c15823M9749;
        C4623 c4623 = this.f31551;
        if (c4623.f10364 == null) {
            return null;
        }
        if (this.f31554) {
            c15823M9749 = c4623.f10366;
        } else {
            int i = this.f31555;
            c15823M9749 = c4623.m9749(i);
            if (Integer.compare(c15823M9749.f19896, i) >= 0) {
                c15823M9749 = c15823M9749.m35903();
            }
        }
        if (c15823M9749 == null) {
            return null;
        }
        if (this.f31557 || Integer.compare(c15823M9749.f19896, this.f31556) >= 0) {
            return c15823M9749;
        }
        return null;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۡ */
    public final int mo8080() {
        C15823 c15823FirstEntry = firstEntry();
        if (c15823FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c15823FirstEntry.f19896;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۛ */
    public final int mo8078() {
        C15823 c15823LastEntry = lastEntry();
        if (c15823LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c15823LastEntry.f19896;
    }
}
