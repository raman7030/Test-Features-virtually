package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10544 {

    /* JADX INFO: renamed from: ֫ */
    public C11215 f29196;

    /* JADX INFO: renamed from: ۧ */
    public C11215 f29197;

    public C10544() {
        C11215 c11215 = new C11215(this, 0, 0);
        this.f29196 = c11215;
        C11215 c11216 = new C11215(this, 0, 0);
        this.f29197 = c11216;
        c11215.f31155 = c11216;
        c11216.f31154 = c11215;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18590 m24323() {
        C11215 c11215 = this.f29196;
        C11215 c11216 = c11215.f31155;
        C11215 c11217 = this.f29197;
        if (c11216 == c11217) {
            return new C18590(null, null);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (C11215 c11218 = c11215.f31155; c11218 != c11217; c11218 = c11218.f31155) {
            C17720[] c17720Arr = new C17720[c11218.f31153.size()];
            int i = 0;
            for (C21944 c21944 : c11218.f31153) {
                c17720Arr[i] = new C17720(c21944.f68982, c21944.f68981);
                i++;
            }
            C11016 c11016 = new C11016(c17720Arr, c11218.f31150);
            C11016 c11017 = (C11016) map.get(c11016);
            if (c11017 == null) {
                map.put(c11016, c11016);
                arrayList2.add(c11016);
            } else {
                c11016 = c11017;
            }
            int i2 = c11218.f31152;
            arrayList.add(new C4981(i2, c11218.f31151 - i2, c11016));
        }
        return new C18590(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24325(int i, int i2, int i3) {
        C18590 c18590M24324 = m24324(i, i2);
        C11215 c11215 = (C11215) c18590M24324.f55504;
        C11215 c11216 = (C11215) c18590M24324.f55505;
        do {
            int i4 = c11215.f31152;
            if (i4 > i) {
                C11215 c11217 = new C11215(this, i, i4);
                c11215.m25904(c11217);
                c11215 = c11217;
            }
            if (c11215.f31150 == -1) {
                c11215.f31150 = i3;
            }
            i = c11215.f31151;
            c11215 = c11215.f31155;
        } while (c11215.f31154 != c11216);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18590 m24324(int i, int i2) {
        C11215 c11215;
        C11215 c11216;
        C11215 c11215M25903 = this.f29196.f31155;
        while (true) {
            c11215 = this.f29197;
            c11216 = null;
            if (c11215M25903 == c11215) {
                c11215M25903 = null;
                break;
            }
            int i3 = c11215M25903.f31152;
            if (i == i3) {
                break;
            }
            if (i > i3 && i < c11215M25903.f31151) {
                c11215M25903 = c11215M25903.m25903(i);
                break;
            }
            if (i < i3) {
                if (i2 <= i3) {
                    C11215 c11217 = new C11215(this, i, i2);
                    c11215M25903.m25904(c11217);
                    return new C18590(c11217, c11217);
                }
                C11215 c11218 = new C11215(this, i, i3);
                c11215M25903.m25904(c11218);
                c11215M25903 = c11218;
                break;
            }
            c11215M25903 = c11215M25903.f31155;
        }
        if (c11215M25903 == null) {
            C11215 c11219 = new C11215(this, i, i2);
            c11215.m25904(c11219);
            return new C18590(c11219, c11219);
        }
        for (C11215 c112110 = c11215M25903; c112110 != c11215; c112110 = c112110.f31155) {
            int i4 = c112110.f31151;
            if (i4 != i2) {
                int i5 = c112110.f31152;
                if (i5 < i2 && i4 > i2) {
                    c112110.m25903(i2);
                } else {
                    if (i5 >= i2) {
                        c11216 = new C11215(this, c112110.f31154.f31151, i2);
                        c112110.m25904(c11216);
                        break;
                    }
                }
            }
            c11216 = c112110;
            break;
        }
        if (c11216 == null) {
            c11216 = new C11215(this, c11215.f31154.f31151, i2);
            c11215.m25904(c11216);
        }
        return new C18590(c11215M25903, c11216);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24326(C23994 c23994, int i, int i2, int i3) {
        C18590 c18590M24324 = m24324(i, i2);
        C11215 c11215 = (C11215) c18590M24324.f55504;
        C11215 c11216 = (C11215) c18590M24324.f55505;
        C21944 c21944 = new C21944(c23994, i3);
        do {
            int i4 = c11215.f31152;
            if (i4 > i) {
                C11215 c11217 = new C11215(this, i, i4);
                c11215.m25904(c11217);
                c11215 = c11217;
            }
            c11215.f31153.addLast(c21944);
            i = c11215.f31151;
            c11215 = c11215.f31155;
        } while (c11215.f31154 != c11216);
    }
}
