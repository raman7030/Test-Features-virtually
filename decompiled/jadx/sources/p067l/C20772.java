package p067l;

/* JADX INFO: renamed from: l.᩵ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20772 {

    /* JADX INFO: renamed from: ֫ */
    public final C18759 f65299;

    /* JADX INFO: renamed from: ۧ */
    public final C14735 f65300;

    /* JADX INFO: renamed from: ܽ */
    public final C2665 f65301;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f65302;

    /* JADX INFO: renamed from: ֫ */
    public static C2665 m46916(C14735 c14735) {
        C20772 c20772 = new C20772(c14735);
        int iM33678 = c20772.f65300.m33678();
        while (true) {
            C2665 c2665 = c20772.f65301;
            if (iM33678 >= 0) {
                int[] iArr = c20772.f65302;
                C15268.m34732(iM33678, iArr);
                C6689 c6689M4120 = c2665.m4120(iM33678);
                C18088 c18088M42784 = c20772.f65299.m42784(iM33678);
                C4678 c4678M41142 = c18088M42784.m41142();
                int size = c4678M41142.size();
                boolean z = c18088M42784.m41143() && c4678M41142.m9913().m39655() != null;
                int i = size - 1;
                C6689 c6689M15239 = c6689M4120;
                for (int i2 = 0; i2 < size; i2++) {
                    if (z && i2 == i) {
                        c6689M15239.mo22326();
                        c6689M15239 = c6689M15239.m15239();
                    }
                    AbstractC17417 abstractC17417M56521get = c4678M41142.m56521get(i2);
                    C22783 c22783M39654 = abstractC17417M56521get.m39654();
                    if (c22783M39654 == null) {
                        C22783 c22783M39655 = abstractC17417M56521get.m39655();
                        if (c22783M39655 != null && c6689M15239.get(c22783M39655.m50989()) != null) {
                            c6689M15239.m15247(c6689M15239.get(c22783M39655.m50989()));
                        }
                    } else {
                        C22783 c22783M50985 = c22783M39654.m50985();
                        c6689M15239.getClass();
                        if (!c22783M50985.equals(c6689M15239.get(c22783M50985.m50989()))) {
                            C22783 c22783M15241 = c6689M15239.m15241(c22783M50985.m50990());
                            if (c22783M15241 != null && c22783M15241.m50989() != c22783M50985.m50989()) {
                                c6689M15239.m15247(c22783M15241);
                            }
                            c2665.m4123(abstractC17417M56521get, c22783M50985);
                            c6689M15239.m15246(c22783M50985);
                        }
                    }
                }
                c6689M15239.mo22326();
                C22388 c22388M41137 = c18088M42784.m41137();
                int size2 = c22388M41137.size();
                int iM41139 = c18088M42784.m41139();
                for (int i3 = 0; i3 < size2; i3++) {
                    int i4 = c22388M41137.get(i3);
                    if (c2665.m4124(i4, i4 == iM41139 ? c6689M15239 : c6689M4120)) {
                        C15268.m34739(i4, iArr);
                    }
                }
                iM33678 = C15268.m34735(0, iArr);
            } else {
                c2665.mo22326();
                return c2665;
            }
        }
    }

    public C20772(C14735 c14735) {
        C18759 c18759M33676 = c14735.m33676();
        int iM40215 = c18759M33676.m40215();
        this.f65300 = c14735;
        this.f65299 = c18759M33676;
        this.f65301 = new C2665(c14735);
        this.f65302 = C15268.m34734(iM40215);
    }
}
