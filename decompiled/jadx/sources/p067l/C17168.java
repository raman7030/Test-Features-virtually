package p067l;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܺ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 37TO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17168 implements InterfaceC18530 {

    /* JADX INFO: renamed from: ֫ */
    public static final C15177 f51116;

    /* JADX INFO: renamed from: ۧ */
    public static final Pattern f51117;

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f51118;

    static {
        C23895 c23895M34616 = C15177.m34616();
        c23895M34616.m52979('<');
        c23895M34616.m52979('>');
        f51116 = c23895M34616.m52978();
        f51118 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
        f51117 = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*+$");
    }

    @Override // p067l.InterfaceC18530
    /* JADX INFO: renamed from: ֫ */
    public final C6441 mo12931(C24406 c24406) {
        String strM48631;
        C11155 c11155M53830 = c24406.m53830();
        c11155M53830.m25724();
        C21884 c21884M25725 = c11155M53830.m25725();
        int i = 0;
        while (true) {
            char cM25726 = c11155M53830.m25726();
            if (cM25726 == 0) {
                i = -1;
                break;
            }
            if (f51116.m34618(cM25726)) {
                break;
            }
            i++;
            c11155M53830.m25724();
        }
        if (i > 0 && c11155M53830.m25726() == '>') {
            C19201 c19201M25719 = c11155M53830.m25719(c21884M25725, c11155M53830.m25725());
            String strM43690 = c19201M25719.m43690();
            c11155M53830.m25724();
            if (f51118.matcher(strM43690).matches()) {
                strM48631 = strM43690;
            } else {
                strM48631 = f51117.matcher(strM43690).matches() ? C21466.m48631("mailto:", strM43690) : null;
            }
            if (strM48631 != null) {
                C4568 c4568 = new C4568(strM48631, null);
                C14625 c14625 = new C14625(strM43690);
                c14625.m3755(c19201M25719.m43693());
                c4568.m3756(c14625);
                return new C6441(c4568, c11155M53830.m25725());
            }
        }
        return null;
    }
}
