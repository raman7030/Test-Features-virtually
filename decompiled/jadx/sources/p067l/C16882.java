package p067l;

/* JADX INFO: renamed from: l.ܶܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D60A */
/* JADX INFO: loaded from: classes5.dex */
public final class C16882 extends C20249 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ String f49980;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16882(C22919 c22919, InterfaceC5815 interfaceC5815, String str) {
        super(c22919, interfaceC5815);
        int i = 1334513250;
        int i2 = C0863.f81833;
        int i3 = C0898.f81858;
        this.f49980 = str;
        int iM55680 = C0873.m55680("ܶ᩹") ^ i2;
        int i4 = ((iM55680 ^ i3) * 32157) ^ 643583753;
        int i5 = -1563839467;
        while (true) {
            i = (iM55680 ^ i5) ^ (i4 & (((i ^ i3) * (-27177)) >> 31));
            switch (i) {
                case -2125715050:
                case -1857196879:
                    C0898.m55800();
                    if (C1017.f81942 >= 0) {
                        iM55680 = C0946.m55979("۟۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27145)) ^ 770803397;
                        i5 = 1251600511;
                    } else {
                        iM55680 = C0873.m55680("ۡܽ") ^ i2;
                        i4 = ((iM55680 ^ i3) * 8575) ^ (-1771649106);
                        i5 = -475454930;
                    }
                    break;
                case -1964889466:
                case -1424001994:
                    C1036.m56257();
                    if (C0947.f81895) {
                        iM55680 = C0946.m55979("۟۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27145)) ^ 770803397;
                        i5 = 1251600511;
                    } else {
                        iM55680 = C0873.m55680("ۡۜ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 32503) ^ (-656241735);
                        i5 = -1714833566;
                    }
                    break;
                case -1782821654:
                case 956489654:
                    C1048.m56305();
                    C0992.m56107();
                    throw new RuntimeException();
                case -1433686340:
                case -749881440:
                    return;
                case -1172173545:
                case 953082364:
                    if (C0937.f81884) {
                        iM55680 = C0873.m55680("֫᩸") ^ i2;
                        i4 = ((iM55680 ^ i3) * 19089) ^ (-138686920);
                        i5 = -1302321264;
                    } else {
                        iM55680 = (i2 - C0946.m55979("ۛ᩹")) * (-49);
                        i4 = ((iM55680 ^ i3) * (-13847)) ^ 360034717;
                        i5 = -1875206309;
                    }
                    break;
                case -416781258:
                case -79512237:
                    if (ServiceConnectionC1013.f81940 < 0) {
                        iM55680 = C0946.m55979("۟۬") ^ i3;
                        i4 = ((iM55680 ^ i2) * (-27145)) ^ 770803397;
                        i5 = 1251600511;
                    } else {
                        iM55680 = C0946.m55979("ۙۚ") ^ i3;
                        i4 = ((iM55680 ^ i2) * 9883) ^ 703386148;
                        i5 = 830866271;
                    }
                    break;
                default:
                    C0912.m55833();
                    C0882.m55710();
                    iM55680 = C0946.m55979("ۙۚ") ^ i3;
                    i4 = ((iM55680 ^ i2) * 9883) ^ 703386148;
                    i5 = 830866271;
                    break;
            }
        }
    }

    @Override // p067l.C20249, p067l.InterfaceC5815
    /* JADX INFO: renamed from: ۚ֫ */
    public final InterfaceC12262 mo13085() {
        return new C7588(this.f49980);
    }
}
