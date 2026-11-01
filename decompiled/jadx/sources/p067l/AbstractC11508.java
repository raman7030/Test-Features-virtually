package p067l;

/* JADX INFO: renamed from: l.ۢܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 46A3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11508 implements InterfaceC23920 {

    /* JADX INFO: renamed from: ᩶ */
    public EnumC3167 f32110;

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f32111;

    /* JADX INFO: renamed from: ᩹ */
    public int f32112;

    public AbstractC11508(C14645 c14645, EnumC3167 enumC3167, int i) {
        this.f32111 = c14645;
        this.f32110 = enumC3167;
        this.f32112 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC11508 m26561(C14645 c14645, C20168 c20168) {
        AbstractC11508 c11767;
        AbstractC11508 abstractC11508M33470;
        int iM45638 = c20168.m45638();
        if (iM45638 == 0) {
            iM45638 = c20168.m45633();
        }
        EnumC3167 enumC3167M23155 = c14645.mo29499().m23155(iM45638);
        int iM45631 = c20168.m45631();
        if (enumC3167M23155 == null) {
            abstractC11508M33470 = new C2789(c14645, EnumC3167.f5839, iM45631);
        } else {
            switch (C22496.f70933[enumC3167M23155.f6090.ordinal()]) {
                case 1:
                    c11767 = new C11767(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 2:
                    c11767 = new C11096(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 3:
                    c11767 = new C17800(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 4:
                    abstractC11508M33470 = c14645.m33470(iM45631, enumC3167M23155);
                    break;
                case 5:
                    c11767 = new C6402(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 6:
                    c11767 = new C21155(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 7:
                    c11767 = new C3048(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 8:
                    c11767 = new C7743(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 9:
                    c11767 = new C3719(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 10:
                    c11767 = new C10425(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 11:
                    c11767 = new C17129(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 12:
                    c11767 = new C23166(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 13:
                    c11767 = new C23836(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 14:
                    abstractC11508M33470 = c14645.m33491(iM45631, enumC3167M23155);
                    break;
                case 15:
                    c11767 = new C7072(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 16:
                    c11767 = new C5731(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 17:
                    c11767 = new C15118(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 18:
                    c11767 = new C14448(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 19:
                    c11767 = new C12437(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 20:
                    c11767 = new C8413(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 21:
                    c11767 = new C13778(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 22:
                    c11767 = new C24506(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 23:
                    c11767 = new C15788(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 24:
                    c11767 = new C9754(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 25:
                    abstractC11508M33470 = c14645.m33498(iM45631, enumC3167M23155);
                    break;
                case 26:
                    c11767 = new C18212(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 27:
                    c11767 = new C12849(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 28:
                    c11767 = new C19554(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 29:
                    c11767 = new C18883(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 30:
                    c11767 = new C16200(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 31:
                    c11767 = new C24918(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 32:
                    c11767 = new C8825(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 33:
                    c11767 = new C22237(c14645, enumC3167M23155, iM45631);
                    abstractC11508M33470 = c11767;
                    break;
                case 34:
                    abstractC11508M33470 = new C4802(c14645, iM45631);
                    break;
                case 35:
                    abstractC11508M33470 = new C20896(c14645, iM45631);
                    break;
                case 36:
                    abstractC11508M33470 = new C9084(c14645, iM45631);
                    break;
                default:
                    throw new C17034(null, "Unexpected opcode format: %s", enumC3167M23155.f6090.toString());
            }
        }
        c20168.m45623(abstractC11508M33470.mo6216() * 2);
        return abstractC11508M33470;
    }

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۢ */
    public final EnumC3167 mo6217() {
        return this.f32110;
    }

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ۚ */
    public int mo6216() {
        return this.f32110.f6090.f14399 / 2;
    }
}
