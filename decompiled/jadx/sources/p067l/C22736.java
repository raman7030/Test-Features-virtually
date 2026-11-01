package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸۟ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5SO */
/* JADX INFO: loaded from: classes5.dex */
public final class C22736 extends AbstractC8829 {
    public static final long serialVersionUID = -7046029254386353129L;

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C6642 f71697;

    /* JADX INFO: renamed from: ۙ */
    public transient InterfaceC4226 f71698;

    /* JADX INFO: renamed from: ۤ */
    public transient InterfaceC21210 f71699;

    /* JADX INFO: renamed from: ۫ */
    public boolean f71700;

    /* JADX INFO: renamed from: ۬ */
    public char f71701;

    /* JADX INFO: renamed from: ᩶ */
    public char f71702;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f71703;

    /* JADX INFO: renamed from: ᩹ */
    public transient InterfaceC3242 f71704;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // p067l.InterfaceC2472, java.util.SortedMap
    public final void comparator() {
    }

    public C22736(C6642 c6642, char c, boolean z, char c2, boolean z2) {
        this.f71697 = c6642;
        if (!z && !z2 && Character.compare(c, c2) > 0) {
            throw new IllegalArgumentException("Start key (" + c + ") is larger than end key (" + c2 + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f71702 = c;
        this.f71703 = z;
        this.f71701 = c2;
        this.f71700 = z2;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        C10666 c10666 = this.f71697.f17133;
        return !(firstEntry() != null);
    }

    @Override // java.util.Map
    public final void clear() {
        C3289 c3289 = new C3289(this);
        while (c3289.hasNext()) {
            c3289.m52074();
            c3289.remove();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m50882(char c) {
        if (this.f71703 || Character.compare(c, this.f71702) >= 0) {
            return this.f71700 || Character.compare(c, this.f71701) < 0;
        }
        return false;
    }

    @Override // p067l.AbstractC8829, p067l.InterfaceC15358
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC3242 mo3493() {
        if (this.f71704 == null) {
            this.f71704 = new C20054(this);
        }
        return this.f71704;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC4226 keySet() {
        if (this.f71698 == null) {
            this.f71698 = new C2618(this);
        }
        return this.f71698;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f71699 == null) {
            this.f71699 = new C20725(this);
        }
        return this.f71699;
    }

    @Override // p067l.AbstractC16204, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15130(char c) {
        return m50882(c) && this.f71697.mo15130(c);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C3289 c3289 = new C3289(this);
        while (c3289.hasNext()) {
            if (C12826.equals(c3289.m52074().f56388, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC14688
    /* JADX INFO: renamed from: ۧ */
    public final Object mo15132(char c) {
        C10666 c10666M15133;
        if (!m50882(c) || (c10666M15133 = this.f71697.m15133(c)) == null) {
            return null;
        }
        return c10666M15133.f56388;
    }

    @Override // p067l.AbstractC19558, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15129(char c, Object obj) {
        C6642 c6642 = this.f71697;
        c6642.f17136 = false;
        if (m50882(c)) {
            Object objMo15129 = c6642.mo15129(c, obj);
            if (c6642.f17136) {
                return null;
            }
            return objMo15129;
        }
        StringBuilder sb = new StringBuilder("Key (");
        sb.append(c);
        sb.append(") out of range [");
        sb.append(this.f71703 ? "-" : String.valueOf(this.f71702));
        sb.append(", ");
        throw new IllegalArgumentException(C10965.m25286(sb, this.f71700 ? "-" : String.valueOf(this.f71701), MotionUtils.EASING_TYPE_FORMAT_END));
    }

    @Override // p067l.AbstractC19558, p067l.InterfaceC14688
    /* JADX INFO: renamed from: ܿ */
    public final Object mo15134(char c) {
        C6642 c6642 = this.f71697;
        c6642.f17136 = false;
        if (!m50882(c)) {
            return null;
        }
        Object objMo15134 = c6642.mo15134(c);
        if (c6642.f17136) {
            return objMo15134;
        }
        return null;
    }

    @Override // p067l.AbstractC19558, p067l.InterfaceC11771
    public final int size() {
        C3289 c3289 = new C3289(this);
        int i = 0;
        while (c3289.hasNext()) {
            i++;
            c3289.m52074();
        }
        return i;
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC2472 mo3495(char c) {
        boolean z = this.f71700;
        C6642 c6642 = this.f71697;
        if (z) {
            return new C22736(c6642, this.f71702, this.f71703, c, false);
        }
        if (Character.compare(c, this.f71701) >= 0) {
            return this;
        }
        return new C22736(c6642, this.f71702, this.f71703, c, false);
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC2472 mo3492(char c) {
        boolean z = this.f71703;
        C6642 c6642 = this.f71697;
        if (z) {
            return new C22736(c6642, c, false, this.f71701, this.f71700);
        }
        return Character.compare(c, this.f71702) > 0 ? new C22736(c6642, c, false, this.f71701, this.f71700) : this;
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC2472 mo3490(char c, char c2) {
        C6642 c6642 = this.f71697;
        boolean z = this.f71703;
        boolean z2 = this.f71700;
        if (z2 && z) {
            return new C22736(c6642, c, false, c2, false);
        }
        char c3 = this.f71701;
        char c4 = (z2 || Character.compare(c2, c3) < 0) ? c2 : c3;
        char c5 = this.f71702;
        if (!z && Character.compare(c, c5) <= 0) {
            c = c5;
        }
        return (z2 || z || c != c5 || c4 != c3) ? new C22736(c6642, c, false, c4, false) : this;
    }

    public final C10666 firstEntry() {
        C10666 c10666M15131;
        C6642 c6642 = this.f71697;
        if (c6642.f17135 == null) {
            return null;
        }
        if (this.f71703) {
            c10666M15131 = c6642.f17133;
        } else {
            char c = this.f71702;
            c10666M15131 = c6642.m15131(c);
            if (Character.compare(c10666M15131.f56387, c) < 0) {
                c10666M15131 = c10666M15131.m24541();
            }
        }
        if (c10666M15131 == null) {
            return null;
        }
        if (this.f71700 || Character.compare(c10666M15131.f56387, this.f71701) < 0) {
            return c10666M15131;
        }
        return null;
    }

    public final C10666 lastEntry() {
        C10666 c10666M15131;
        C6642 c6642 = this.f71697;
        if (c6642.f17135 == null) {
            return null;
        }
        if (this.f71700) {
            c10666M15131 = c6642.f17137;
        } else {
            char c = this.f71701;
            c10666M15131 = c6642.m15131(c);
            if (Character.compare(c10666M15131.f56387, c) >= 0) {
                c10666M15131 = c10666M15131.m24536();
            }
        }
        if (c10666M15131 == null) {
            return null;
        }
        if (this.f71703 || Character.compare(c10666M15131.f56387, this.f71702) >= 0) {
            return c10666M15131;
        }
        return null;
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ۬֫ */
    public final char mo3491() {
        C10666 c10666FirstEntry = firstEntry();
        if (c10666FirstEntry == null) {
            throw new NoSuchElementException();
        }
        return c10666FirstEntry.f56387;
    }

    @Override // p067l.InterfaceC2472
    /* JADX INFO: renamed from: ܳ֫ */
    public final char mo3494() {
        C10666 c10666LastEntry = lastEntry();
        if (c10666LastEntry == null) {
            throw new NoSuchElementException();
        }
        return c10666LastEntry.f56387;
    }
}
