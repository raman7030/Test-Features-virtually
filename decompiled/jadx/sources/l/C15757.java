package l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15757 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48591 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C9800 f48592 = new C9800();

    static {
        String[] strArrMo18255 = ApplicationC20075.f65008.mo18255("psort", (String[]) null);
        if (strArrMo18255 != null) {
            for (int i = 0; i < strArrMo18255.length; i++) {
                f48592.mo21965(i, (Object) strArrMo18255[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37160(String[] strArr) {
        ApplicationC20075.f65008.edit().mo25857("psort", strArr).apply();
        synchronized (C15757.class) {
            f48592.clear();
            for (int i = 0; i < strArr.length; i++) {
                f48592.mo21965(i, (Object) strArr[i]);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m37157(AbstractC15440... abstractC15440Arr) {
        List list;
        synchronized (C15757.class) {
            list = (List) C22311.stream(abstractC15440Arr).flatMap(new C23519(0)).distinct().filter(new C6586(0)).map(new C20698()).sorted().map(new C9409()).collect(C22976.toList());
        }
        return list;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17664 m37159(AbstractC15440 abstractC15440) {
        return C5378.stream(abstractC15440.mo23549(true));
    }
}
