package p067l;

/* JADX INFO: renamed from: l.۠ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBH2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10257 extends C19034 {

    /* JADX INFO: renamed from: ᩶ */
    public static final C10257 f28405 = new C10257(0);

    /* JADX INFO: renamed from: ֫ */
    public final void m23871(int i, int i2, int i3, int i4, C14260 c14260) {
        m43241(i, new C3551(i2, i3, i4, c14260));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C10257 m23873(int i) {
        int size = size();
        C3551[] c3551Arr = new C3551[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            C3551 c3551 = (C3551) m43238(i3);
            if (c3551.m6330(i)) {
                C14260 c14260M6331 = c3551.m6331();
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        c3551Arr[i2] = c3551;
                        i2++;
                        break;
                    }
                    C14260 c14260M6332 = c3551Arr[i4].m6331();
                    if (c14260M6332 == c14260M6331 || c14260M6332 == C14260.f40621) {
                        break;
                    }
                    i4++;
                }
            }
        }
        if (i2 != 0) {
            C10257 c10257 = new C10257(i2);
            for (int i5 = 0; i5 < i2; i5++) {
                C3551 c3552 = c3551Arr[i5];
                if (c3552 == null) {
                    throw new NullPointerException("item == null");
                }
                c10257.m43241(i5, c3552);
            }
            c10257.mo22326();
            return c10257;
        }
        return f28405;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C22388 m23872(int i) {
        if (i < -1) {
            throw new IllegalArgumentException("noException < -1");
        }
        int i2 = i >= 0 ? 1 : 0;
        int size = size();
        if (size == 0) {
            if (i2 != 0) {
                return C22388.m50240(i);
            }
            return C22388.f70620;
        }
        C22388 c22388 = new C22388(size + i2);
        for (int i3 = 0; i3 < size; i3++) {
            c22388.add(((C3551) m43238(i3)).m6332());
        }
        if (i2 != 0) {
            c22388.add(i);
        }
        c22388.mo22326();
        return c22388;
    }

    /* JADX INFO: renamed from: ֨ */
    public final C15600 m23870() {
        int size = size();
        if (size == 0) {
            return C15600.f44675;
        }
        C15600 c15600 = new C15600(size);
        for (int i = 0; i < size; i++) {
            c15600.m43243(i, ((C3551) m43238(i)).m6331().m32771());
        }
        c15600.mo22326();
        return c15600;
    }
}
