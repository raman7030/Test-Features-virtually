package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17344 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f51730 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final C11683 f51731 = new C11683();

    static {
        String[] strArrMo20203 = ApplicationC21448.f67649.mo20203("psort", (String[]) null);
        if (strArrMo20203 != null) {
            for (int i = 0; i < strArrMo20203.length; i++) {
                f51731.mo23936(i, (Object) strArrMo20203[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m39330(String[] strArr) {
        ApplicationC21448.f67649.edit().mo27879("psort", strArr).apply();
        synchronized (C17344.class) {
            f51731.clear();
            for (int i = 0; i < strArr.length; i++) {
                f51731.mo23936(i, (Object) strArr[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m39327(AbstractC17043... abstractC17043Arr) {
        List list;
        synchronized (C17344.class) {
            list = (List) C23573.stream(abstractC17043Arr).flatMap(new C24721(0)).distinct().filter(new C8628(0)).map(new C22040()).sorted().map(new C11311()).collect(C24205.toList());
        }
        return list;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC19157 m39329(AbstractC17043 abstractC17043) {
        return C7480.stream(abstractC17043.mo25500(true));
    }
}
