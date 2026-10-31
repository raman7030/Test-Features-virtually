package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8603 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9309 f26280;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9309 f26281;

    public C8603() {
        C9309 c9309 = new C9309(this, 0, 0);
        this.f26280 = c9309;
        C9309 c93010 = new C9309(this, 0, 0);
        this.f26281 = c93010;
        c9309.f28206 = c93010;
        c93010.f28205 = c9309;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17069 m22354() {
        C9309 c9309 = this.f26280;
        C9309 c93010 = c9309.f28206;
        C9309 c93011 = this.f26281;
        if (c93010 == c93011) {
            return new C17069(null, null);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (C9309 c93012 = c9309.f28206; c93012 != c93011; c93012 = c93012.f28206) {
            C16153[] c16153Arr = new C16153[c93012.f28204.size()];
            int i = 0;
            for (C20598 c20598 : c93012.f28204) {
                c16153Arr[i] = new C16153(c20598.f66302, c20598.f66301);
                i++;
            }
            C9099 c9099 = new C9099(c16153Arr, c93012.f28201);
            C9099 c90910 = (C9099) map.get(c9099);
            if (c90910 == null) {
                map.put(c9099, c9099);
                arrayList2.add(c9099);
            } else {
                c9099 = c90910;
            }
            int i2 = c93012.f28203;
            arrayList.add(new C2749(i2, c93012.f28202 - i2, c9099));
        }
        return new C17069(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22356(int i, int i2, int i3) {
        C17069 c17069M22355 = m22355(i, i2);
        C9309 c9309 = (C9309) c17069M22355.f52322;
        C9309 c93010 = (C9309) c17069M22355.f52323;
        do {
            int i4 = c9309.f28203;
            if (i4 > i) {
                C9309 c93011 = new C9309(this, i, i4);
                c9309.m23895(c93011);
                c9309 = c93011;
            }
            if (c9309.f28201 == -1) {
                c9309.f28201 = i3;
            }
            i = c9309.f28202;
            c9309 = c9309.f28206;
        } while (c9309.f28205 != c93010);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17069 m22355(int i, int i2) {
        C9309 c9309;
        C9309 c93010;
        C9309 c9309M23894 = this.f26280.f28206;
        while (true) {
            c9309 = this.f26281;
            c93010 = null;
            if (c9309M23894 == c9309) {
                c9309M23894 = null;
                break;
            }
            int i3 = c9309M23894.f28203;
            if (i == i3) {
                break;
            }
            if (i > i3 && i < c9309M23894.f28202) {
                c9309M23894 = c9309M23894.m23894(i);
                break;
            }
            if (i < i3) {
                if (i2 <= i3) {
                    C9309 c93011 = new C9309(this, i, i2);
                    c9309M23894.m23895(c93011);
                    return new C17069(c93011, c93011);
                }
                C9309 c93012 = new C9309(this, i, i3);
                c9309M23894.m23895(c93012);
                c9309M23894 = c93012;
                break;
            }
            c9309M23894 = c9309M23894.f28206;
        }
        if (c9309M23894 == null) {
            C9309 c93013 = new C9309(this, i, i2);
            c9309.m23895(c93013);
            return new C17069(c93013, c93013);
        }
        for (C9309 c93014 = c9309M23894; c93014 != c9309; c93014 = c93014.f28206) {
            int i4 = c93014.f28202;
            if (i4 != i2) {
                int i5 = c93014.f28203;
                if (i5 < i2 && i4 > i2) {
                    c93014.m23894(i2);
                } else {
                    if (i5 >= i2) {
                        c93010 = new C9309(this, c93014.f28205.f28202, i2);
                        c93014.m23895(c93010);
                        break;
                    }
                }
            }
            c93010 = c93014;
            break;
        }
        if (c93010 == null) {
            c93010 = new C9309(this, c9309.f28205.f28202, i2);
            c9309.m23895(c93010);
        }
        return new C17069(c9309M23894, c93010);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22357(C22755 c22755, int i, int i2, int i3) {
        C17069 c17069M22355 = m22355(i, i2);
        C9309 c9309 = (C9309) c17069M22355.f52322;
        C9309 c93010 = (C9309) c17069M22355.f52323;
        C20598 c20598 = new C20598(c22755, i3);
        do {
            int i4 = c9309.f28203;
            if (i4 > i) {
                C9309 c93011 = new C9309(this, i, i4);
                c9309.m23895(c93011);
                c9309 = c93011;
            }
            c9309.f28204.addLast(c20598);
            i = c9309.f28202;
            c9309 = c9309.f28206;
        } while (c9309.f28205 != c93010);
    }
}
