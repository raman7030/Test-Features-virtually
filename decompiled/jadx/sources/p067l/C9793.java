package p067l;

/* JADX INFO: renamed from: l.۠֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 97SA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9793 implements InterfaceC18530 {

    /* JADX INFO: renamed from: ֫ */
    public static final C15177 f27055;

    /* JADX INFO: renamed from: ۧ */
    public static final C15177 f27056;

    /* JADX INFO: renamed from: ܽ */
    public static final C15177 f27057;

    /* JADX INFO: renamed from: ᩳ */
    public static final C15177 f27058;

    static {
        C23895 c23895M34616 = C15177.m34616();
        c23895M34616.m52980('0', '9');
        c23895M34616.m52980('A', 'F');
        c23895M34616.m52980('a', 'f');
        f27058 = c23895M34616.m52978();
        C23895 c23895M34617 = C15177.m34616();
        c23895M34617.m52980('0', '9');
        f27055 = c23895M34617.m52978();
        C23895 c23895M34618 = C15177.m34616();
        c23895M34618.m52980('A', 'Z');
        c23895M34618.m52980('a', 'z');
        C15177 c15177M52978 = c23895M34618.m52978();
        f27057 = c15177M52978;
        C23895 c23895M34619 = c15177M52978.m34617();
        c23895M34619.m52980('0', '9');
        f27056 = c23895M34619.m52978();
    }

    @Override // p067l.InterfaceC18530
    /* JADX INFO: renamed from: ֫ */
    public final C6441 mo12931(C24406 c24406) {
        C11155 c11155M53830 = c24406.m53830();
        C21884 c21884M25725 = c11155M53830.m25725();
        c11155M53830.m25724();
        char cM25726 = c11155M53830.m25726();
        if (cM25726 == '#') {
            c11155M53830.m25724();
            if (c11155M53830.m25727('x') || c11155M53830.m25727('X')) {
                int iM25718 = c11155M53830.m25718(f27058);
                if (1 > iM25718 || iM25718 > 6 || !c11155M53830.m25727(';')) {
                    return null;
                }
                return m22843(c21884M25725, c11155M53830);
            }
            int iM25719 = c11155M53830.m25718(f27055);
            if (1 > iM25719 || iM25719 > 7 || !c11155M53830.m25727(';')) {
                return null;
            }
            return m22843(c21884M25725, c11155M53830);
        }
        if (!f27057.m34618(cM25726)) {
            return null;
        }
        c11155M53830.m25718(f27056);
        if (c11155M53830.m25727(';')) {
            return m22843(c21884M25725, c11155M53830);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6441 m22843(C21884 c21884, C11155 c11155) {
        return new C6441(new C14625(C11806.m27055(c11155.m25719(c21884, c11155.m25725()).m43690())), c11155.m25725());
    }
}
