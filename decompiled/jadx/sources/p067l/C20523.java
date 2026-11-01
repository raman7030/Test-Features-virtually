package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩵֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 07SP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20523 implements InterfaceC18530 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f63410 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public boolean f63411 = false;

    @Override // p067l.InterfaceC18530
    /* JADX INFO: renamed from: ֫ */
    public final C6441 mo12931(C24406 c24406) {
        C21884 c21884;
        C11155 c11155M53830 = c24406.m53830();
        C21884 c21884M25725 = c11155M53830.m25725();
        int iM25723 = c11155M53830.m25723('`');
        C21884 c21884M25726 = c11155M53830.m25725();
        boolean z = this.f63411;
        HashMap map = this.f63410;
        if (z && ((c21884 = (C21884) map.get(Integer.valueOf(iM25723))) == null || c21884.compareTo(c21884M25725) <= 0)) {
            return new C6441(new C14625(c11155M53830.m25719(c21884M25725, c21884M25726).m43690()), c21884M25726);
        }
        while (c11155M53830.m25717('`') > 0) {
            C21884 c21884M25727 = c11155M53830.m25725();
            int iM25724 = c11155M53830.m25723('`');
            map.put(Integer.valueOf(iM25724), c21884M25727);
            if (iM25724 == iM25723) {
                C9123 c9123 = new C9123();
                String strReplace = c11155M53830.m25719(c21884M25726, c21884M25727).m43690().replace('\n', ' ');
                if (strReplace.length() >= 3) {
                    int i = 0;
                    if (strReplace.charAt(0) == ' ' && C9417.m21911(1, strReplace) == ' ') {
                        int length = strReplace.length();
                        while (true) {
                            if (i >= length) {
                                i = length;
                                break;
                            }
                            if (strReplace.charAt(i) != ' ') {
                                break;
                            }
                            i++;
                        }
                        if (i != length) {
                            strReplace = C17073.m38720(1, 1, strReplace);
                        }
                    }
                }
                c9123.m21064(strReplace);
                return new C6441(c9123, c11155M53830.m25725());
            }
        }
        this.f63411 = true;
        return new C6441(new C14625(c11155M53830.m25719(c21884M25725, c21884M25726).m43690()), c21884M25726);
    }
}
