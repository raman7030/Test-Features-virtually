package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ۠ */
/* JADX INFO: compiled from: 91K6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1101 {

    /* JADX INFO: renamed from: ۜ */
    public C1101 f19179;

    /* JADX INFO: renamed from: ۧ */
    public int f19180;

    /* JADX INFO: renamed from: ܳ */
    public final C1591 f19181;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f19184;

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC0856 f19185;

    /* JADX INFO: renamed from: ᩻ */
    public C1626 f19186;

    /* JADX INFO: renamed from: ֫ */
    public HashSet f19178 = null;

    /* JADX INFO: renamed from: ܿ */
    public int f19183 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f19182 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final void m16907(int i, C0866 c0866, ArrayList arrayList) {
        HashSet hashSet = this.f19178;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C1181.m20465(((C1101) it.next()).f19181, i, arrayList, c0866);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final HashSet m16905() {
        return this.f19178;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m16921() {
        HashSet hashSet = this.f19178;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m16915() {
        HashSet hashSet = this.f19178;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1101) it.next()).m16919().m16920()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16906(int i) {
        this.f19180 = i;
        this.f19184 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m16914() {
        if (this.f19184) {
            return this.f19180;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m16912() {
        this.f19184 = false;
        this.f19180 = 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m16911() {
        return this.f19184;
    }

    public C1101(C1591 c1591, EnumC0856 enumC0856) {
        this.f19181 = c1591;
        this.f19185 = enumC0856;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C1626 m16918() {
        return this.f19186;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m16916() {
        C1626 c1626 = this.f19186;
        if (c1626 == null) {
            this.f19186 = new C1626(EnumC1276.UNRESTRICTED);
        } else {
            c1626.m39607();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m16917() {
        C1101 c1101;
        if (this.f19181.m37893() == 8) {
            return 0;
        }
        if (this.f19182 > -1 && (c1101 = this.f19179) != null && c1101.f19181.m37893() == 8) {
            return this.f19182;
        }
        return this.f19183;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m16913() {
        HashSet hashSet;
        C1101 c1101 = this.f19179;
        if (c1101 != null && (hashSet = c1101.f19178) != null) {
            hashSet.remove(this);
            if (this.f19179.f19178.size() == 0) {
                this.f19179.f19178 = null;
            }
        }
        this.f19178 = null;
        this.f19179 = null;
        this.f19183 = 0;
        this.f19182 = -1;
        this.f19184 = false;
        this.f19180 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16910(C1101 c1101, int i, int i2, boolean z) {
        if (c1101 == null) {
            m16913();
            return true;
        }
        if (!z && !m16909(c1101)) {
            return false;
        }
        this.f19179 = c1101;
        if (c1101.f19178 == null) {
            c1101.f19178 = new HashSet();
        }
        HashSet hashSet = this.f19179.f19178;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f19183 = i;
        } else {
            this.f19183 = 0;
        }
        this.f19182 = i2;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16908(C1101 c1101, int i) {
        m16910(c1101, i, -1, false);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m16920() {
        return this.f19179 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16909(C1101 c1101) {
        if (c1101 == null) {
            return false;
        }
        C1591 c1591 = c1101.f19181;
        EnumC0856 enumC0856 = c1101.f19185;
        EnumC0856 enumC0857 = this.f19185;
        if (enumC0856 == enumC0857) {
            return enumC0857 != EnumC0856.BASELINE || (c1591.m37929() && this.f19181.m37929());
        }
        switch (C1801.f64012[enumC0857.ordinal()]) {
            case 1:
                return (enumC0856 == EnumC0856.BASELINE || enumC0856 == EnumC0856.CENTER_X || enumC0856 == EnumC0856.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = enumC0856 == EnumC0856.LEFT || enumC0856 == EnumC0856.RIGHT;
                if (c1591 instanceof C0996) {
                    return z || enumC0856 == EnumC0856.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = enumC0856 == EnumC0856.TOP || enumC0856 == EnumC0856.BOTTOM;
                if (c1591 instanceof C0996) {
                    return z2 || enumC0856 == EnumC0856.CENTER_Y;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(enumC0857.name());
        }
    }

    public final String toString() {
        return this.f19181.m37909() + ":" + this.f19185.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C1101 m16919() {
        int[] iArr = C1801.f64012;
        EnumC0856 enumC0856 = this.f19185;
        int i = iArr[enumC0856.ordinal()];
        C1591 c1591 = this.f19181;
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return c1591.f49279;
            case 3:
                return c1591.f49261;
            case 4:
                return c1591.f49253;
            case 5:
                return c1591.f49281;
            default:
                throw new AssertionError(enumC0856.name());
        }
    }
}
