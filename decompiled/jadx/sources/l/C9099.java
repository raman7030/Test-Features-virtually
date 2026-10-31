package l;

/* JADX INFO: renamed from: l.ۡ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes3.dex */
public final class C9099 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f27573;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f27574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16153[] f27575;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f27576;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23472(C9099 c9099, C1547 c1547) {
        c9099.getClass();
        C16153[] c16153Arr = c9099.f27575;
        int length = c16153Arr.length;
        int i = c9099.f27574;
        if (i > -1) {
            length *= -1;
        }
        c1547.m5303(length);
        for (C16153 c16153 : c16153Arr) {
            C16153.m38079(c16153, c1547);
        }
        if (i > -1) {
            c1547.m5301(i);
        }
    }

    public C9099(C16153[] c16153Arr, int i) {
        this.f27575 = c16153Arr;
        this.f27574 = i;
    }

    public C9099(C3454 c3454, C10720 c10720) {
        int iM26906 = c10720.m26906();
        if (iM26906 < 0) {
            this.f27575 = new C16153[iM26906 * (-1)];
        } else {
            this.f27575 = new C16153[iM26906];
        }
        int i = 0;
        while (true) {
            C16153[] c16153Arr = this.f27575;
            if (i >= c16153Arr.length) {
                break;
            }
            try {
                c16153Arr[i] = new C16153(c3454, c10720);
                i++;
            } catch (Exception e) {
                throw C16363.m38521("Error while reading EncodedTypeAddrPair at index " + i, e);
            }
        }
        if (iM26906 <= 0) {
            this.f27574 = c10720.m26903();
        } else {
            this.f27574 = -1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m23473() {
        return this.f27574;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23471(C9099 c9099) {
        return c9099.f27576 - c9099.f27573;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23470(int i, int i2, C9099 c9099) {
        c9099.f27576 = i;
        c9099.f27573 = i2;
        C16153[] c16153Arr = c9099.f27575;
        int length = c16153Arr.length;
        int i3 = c9099.f27574;
        if (i3 > -1) {
            length *= -1;
            i += C11166.m27697(i3);
        }
        int iM27711 = C11166.m27711(length) + i;
        for (C16153 c16153 : c16153Arr) {
            iM27711 += C16153.m38078(c16153);
        }
        return iM27711;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (C16153 c16153 : this.f27575) {
            iHashCode = (iHashCode * 31) + c16153.hashCode();
        }
        return (iHashCode * 31) + this.f27574;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9099.class.equals(obj.getClass())) {
            C9099 c9099 = (C9099) obj;
            C16153[] c16153Arr = c9099.f27575;
            C16153[] c16153Arr2 = this.f27575;
            if (c16153Arr2.length == c16153Arr.length && this.f27574 == c9099.f27574) {
                for (int i = 0; i < c16153Arr2.length; i++) {
                    if (!c16153Arr2[i].equals(c16153Arr[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
