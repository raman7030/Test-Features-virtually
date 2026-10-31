package l;

/* JADX INFO: renamed from: l.ܶܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: D60A */
/* JADX INFO: loaded from: classes5.dex */
public final class C15271 extends C18814 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f46856;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15271(C21623 c21623, InterfaceC3627 interfaceC3627, String str) {
        super(c21623, interfaceC3627);
        int i = 1334513250;
        int i2 = C0422.f1886;
        int i3 = C1128.f4106;
        this.f46856 = str;
        int iM2566 = C0630.m2566("ܶ᩹") ^ i2;
        int i4 = ((iM2566 ^ i3) * 32157) ^ 643583753;
        int i5 = -1563839467;
        while (true) {
            i = (iM2566 ^ i5) ^ (i4 & (((i ^ i3) * (-27177)) >> 31));
            switch (i) {
                case -2125715050:
                case -1857196879:
                    C1128.m3851();
                    if (C3537.f11231 >= 0) {
                        iM2566 = C2105.m6981("۟۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27145)) ^ 770803397;
                        i5 = 1251600511;
                    } else {
                        iM2566 = C0630.m2566("ۡܽ") ^ i2;
                        i4 = ((iM2566 ^ i3) * 8575) ^ (-1771649106);
                        i5 = -475454930;
                    }
                    break;
                case -1964889466:
                case -1424001994:
                    C3911.m11924();
                    if (C2126.f7087) {
                        iM2566 = C2105.m6981("۟۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27145)) ^ 770803397;
                        i5 = 1251600511;
                    } else {
                        iM2566 = C0630.m2566("ۡۜ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 32503) ^ (-656241735);
                        i5 = -1714833566;
                    }
                    break;
                case -1782821654:
                case 956489654:
                    C4159.m12565();
                    C3019.m9255();
                    throw new RuntimeException();
                case -1433686340:
                case -749881440:
                    return;
                case -1172173545:
                case 953082364:
                    if (C1916.f6442) {
                        iM2566 = C0630.m2566("֫᩸") ^ i2;
                        i4 = ((iM2566 ^ i3) * 19089) ^ (-138686920);
                        i5 = -1302321264;
                    } else {
                        iM2566 = (i2 - C2105.m6981("ۛ᩹")) * (-49);
                        i4 = ((iM2566 ^ i3) * (-13847)) ^ 360034717;
                        i5 = -1875206309;
                    }
                    break;
                case -416781258:
                case -79512237:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        iM2566 = C2105.m6981("۟۬") ^ i3;
                        i4 = ((iM2566 ^ i2) * (-27145)) ^ 770803397;
                        i5 = 1251600511;
                    } else {
                        iM2566 = C2105.m6981("ۙۚ") ^ i3;
                        i4 = ((iM2566 ^ i2) * 9883) ^ 703386148;
                        i5 = 830866271;
                    }
                    break;
                default:
                    C1420.m4913();
                    C0798.m2998();
                    iM2566 = C2105.m6981("ۙۚ") ^ i3;
                    i4 = ((iM2566 ^ i2) * 9883) ^ 703386148;
                    i5 = 830866271;
                    break;
            }
        }
    }

    @Override // l.C18814, l.InterfaceC3627
    /* JADX INFO: renamed from: ۚ֫ */
    public final InterfaceC10410 mo11109() {
        return new C5492(this.f46856);
    }
}
