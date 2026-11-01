package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۬ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Z3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14901 extends C1446 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C18434 f42507;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ HashMap f42508;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ HashMap f42509;

    public C14901(C18434 c18434, HashMap map, HashMap map2) {
        this.f42507 = c18434;
        this.f42508 = map;
        this.f42509 = map2;
    }

    @Override // p067l.C1446
    /* JADX INFO: renamed from: ֫ */
    public final void mo31707(EnumC5044 enumC5044, int i, int i2, C15376 c15376) {
        switch (C14231.f40531[enumC5044.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (c15376.m35048().equals(this.f42507.f55143)) {
                    String str = c15376.m35047() + ":" + c15376.m35049();
                    this.f42508.remove(str);
                    C5024 c5024 = (C5024) this.f42509.get(str);
                    if (c5024 != null) {
                        c5024.f11507 = null;
                    }
                }
                break;
        }
    }
}
