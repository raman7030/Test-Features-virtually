package l;

/* JADX INFO: renamed from: l.۠ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBH2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8300 extends C17535 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C8300 f25495 = new C8300(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21901(int i, int i2, int i3, int i4, C12512 c12512) {
        m40981(i, new C1244(i2, i3, i4, c12512));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8300 m21903(int i) {
        int size = size();
        C1244[] c1244Arr = new C1244[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C1244 c1244 = (C1244) m40978(i3);
            if (c1244.m4086(i)) {
                C12512 c12512M4087 = c1244.m4087();
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        c1244Arr[i2] = c1244;
                        i2++;
                        break;
                    }
                    C12512 c12512M4088 = c1244Arr[i4].m4087();
                    if (c12512M4088 == c12512M4087 || c12512M4088 == C12512.f37597) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (i2 != 0) {
            C8300 c8300 = new C8300(i2);
            for (int i5 = 0; i5 < i2; i5++) {
                C1244 c1245 = c1244Arr[i5];
                if (c1245 == null) {
                    throw new NullPointerException("item == null");
                }
                c8300.m40981(i5, c1245);
            }
            c8300.mo20349();
            return c8300;
        }
        return f25495;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C21064 m21902(int i) {
        if (i < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        int i2 = i >= 0 ? 1 : 0;
        int size = size();
        if (size == 0) {
            if (i2 != 0) {
                return C21064.m47910(i);
            }
            return C21064.f67936;
        }
        C21064 c21064 = new C21064(size + i2);
        for (int i3 = 0; i3 < size; i3++) {
            c21064.add(((C1244) m40978(i3)).m4088());
        }
        if (i2 != 0) {
            c21064.add(i);
        }
        c21064.mo20349();
        return c21064;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13922 m21900() {
        int size = size();
        if (size == 0) {
            return C13922.f41594;
        }
        C13922 c13922 = new C13922(size);
        for (int i = 0; i < size; i++) {
            c13922.m40983(i, ((C1244) m40978(i)).m4087().m30696());
        }
        c13922.mo20349();
        return c13922;
    }
}
