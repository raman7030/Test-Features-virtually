package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۨ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public final class C13734 extends AbstractC16985 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C9710 f38821;

    /* JADX INFO: renamed from: ۙ */
    public transient InterfaceC4206 f38822;

    /* JADX INFO: renamed from: ۤ */
    public transient InterfaceC21210 f38823;

    /* JADX INFO: renamed from: ۫ */
    public boolean f38824;

    /* JADX INFO: renamed from: ۬ */
    public int f38825;

    /* JADX INFO: renamed from: ᩶ */
    public int f38826;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f38827;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC3242 f38828;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۫ */
    public final void mo8083() {
    }

    public C13734(C9710 c9710, int i, boolean z, int i2, boolean z2) {
        this.f38821 = c9710;
        if (!z && !z2 && Integer.compare(i, i2) > 0) {
            throw new IllegalArgumentException(C20780.m46928("Start key (", i, ") is larger than end key (", MotionUtils.EASING_TYPE_FORMAT_END, i2));
        }
        this.f38826 = i;
        this.f38827 = z;
        this.f38825 = i2;
        this.f38824 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C10381 c10381 = this.f38821.f26809;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C14404 c14404 = new C14404(this);
        while (c14404.hasNext()) {
            c14404.m53962();
            c14404.remove();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m31289(int i) {
        if (this.f38827 || Integer.compare(i, this.f38826) >= 0) {
            return this.f38824 || Integer.compare(i, this.f38825) < 0;
        }
        return false;
    }

    @Override // p067l.AbstractC16985, p067l.InterfaceC15350
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC3242 mo8079() {
        if (this.f38828 == null) {
            this.f38828 = new C21781(this);
        }
        return this.f38828;
    }

    @Override // p067l.AbstractC16985, java.util.Map, p067l.InterfaceC4031, java.util.SortedMap
    public final InterfaceC4206 keySet() {
        if (this.f38822 == null) {
            this.f38822 = new C5687(this);
        }
        return this.f38822;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f38823 == null) {
            this.f38823 = new C7028(this);
        }
        return this.f38823;
    }

    @Override // p067l.AbstractC3575, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4793(int i) {
        return m31289(i) && this.f38821.mo4793(i);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C14404 c14404 = new C14404(this);
        while (c14404.hasNext()) {
            if (C12826.equals(c14404.m53962().f19897, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC14680
    public final Object get(int i) {
        C10381 c10381M22659;
        if (!m31289(i) || (c10381M22659 = this.f38821.m22659(i)) == null) {
            return null;
        }
        return c10381M22659.f19897;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4686(int i, Object obj) {
        C9710 c9710 = this.f38821;
        c9710.f26813 = false;
        if (m31289(i)) {
            Object objMo4686 = c9710.mo4686(i, obj);
            if (c9710.f26813) {
                return null;
            }
            return objMo4686;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Key (", ") out of range [");
        sbM34408.append(this.f38827 ? "-" : String.valueOf(this.f38826));
        sbM34408.append(", ");
        throw new IllegalArgumentException(C10965.m25286(sbM34408, this.f38824 ? "-" : String.valueOf(this.f38825), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC14680
    public final Object remove(int i) {
        C9710 c9710 = this.f38821;
        c9710.f26813 = false;
        if (!m31289(i)) {
            return null;
        }
        Object objRemove = c9710.remove(i);
        if (c9710.f26813) {
            return objRemove;
        }
        return null;
    }

    @Override // p067l.AbstractC2904, p067l.InterfaceC11771
    public final int size() {
        C14404 c14404 = new C14404(this);
        int i = 0;
        while (c14404.hasNext()) {
            i++;
            c14404.m53962();
        }
        return i;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC4031 mo8084(int i) {
        boolean z = this.f38824;
        C9710 c9710 = this.f38821;
        if (z) {
            return new C13734(c9710, this.f38826, this.f38827, i, false);
        }
        if (Integer.compare(i, this.f38825) >= 0) {
            return this;
        }
        return new C13734(c9710, this.f38826, this.f38827, i, false);
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC4031 mo8081(int i) {
        boolean z = this.f38827;
        C9710 c9710 = this.f38821;
        if (z) {
            return new C13734(c9710, i, false, this.f38825, this.f38824);
        }
        return Integer.compare(i, this.f38826) > 0 ? new C13734(c9710, i, false, this.f38825, this.f38824) : this;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4031 mo8082(int i, int i2) {
        C9710 c9710 = this.f38821;
        boolean z = this.f38827;
        boolean z2 = this.f38824;
        if (z2 && z) {
            return new C13734(c9710, i, false, i2, false);
        }
        int i3 = this.f38825;
        int i4 = (z2 || Integer.compare(i2, i3) < 0) ? i2 : i3;
        int i5 = this.f38826;
        if (!z && Integer.compare(i, i5) <= 0) {
            i = i5;
        }
        return (z2 || z || i != i5 || i4 != i3) ? new C13734(c9710, i, false, i4, false) : this;
    }

    public final C10381 firstEntry() {
        C10381 c10381M22660;
        C9710 c9710 = this.f38821;
        if (c9710.f26810 == null) {
            return null;
        }
        if (this.f38827) {
            c10381M22660 = c9710.f26809;
        } else {
            int i = this.f38826;
            c10381M22660 = c9710.m22660(i);
            if (Integer.compare(c10381M22660.f19896, i) < 0) {
                c10381M22660 = c10381M22660.m24074();
            }
        }
        if (c10381M22660 == null) {
            return null;
        }
        if (this.f38824 || Integer.compare(c10381M22660.f19896, this.f38825) < 0) {
            return c10381M22660;
        }
        return null;
    }

    public final C10381 lastEntry() {
        C10381 c10381M22660;
        C9710 c9710 = this.f38821;
        if (c9710.f26810 == null) {
            return null;
        }
        if (this.f38824) {
            c10381M22660 = c9710.f26814;
        } else {
            int i = this.f38825;
            c10381M22660 = c9710.m22660(i);
            if (Integer.compare(c10381M22660.f19896, i) >= 0) {
                c10381M22660 = c10381M22660.m24070();
            }
        }
        if (c10381M22660 == null) {
            return null;
        }
        if (this.f38827 || Integer.compare(c10381M22660.f19896, this.f38826) >= 0) {
            return c10381M22660;
        }
        return null;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۡ */
    public final int mo8080() {
        C10381 c10381FirstEntry = firstEntry();
        if (c10381FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c10381FirstEntry.f19896;
    }

    @Override // p067l.InterfaceC4031
    /* JADX INFO: renamed from: ۛ */
    public final int mo8078() {
        C10381 c10381LastEntry = lastEntry();
        if (c10381LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c10381LastEntry.f19896;
    }
}
