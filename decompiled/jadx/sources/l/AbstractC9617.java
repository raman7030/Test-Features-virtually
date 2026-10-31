package l;

/* JADX INFO: renamed from: l.ۢܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 46A3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9617 implements InterfaceC22677 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC0841 f29162;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f29163;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f29164;

    public AbstractC9617(C12918 c12918, EnumC0841 enumC0841, int i) {
        this.f29163 = c12918;
        this.f29162 = enumC0841;
        this.f29164 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC9617 m24548(C12918 c12918, C18729 c18729) {
        AbstractC9617 c9889;
        AbstractC9617 abstractC9617M31384;
        int iM43371 = c18729.m43371();
        if (iM43371 == 0) {
            iM43371 = c18729.m43366();
        }
        EnumC0841 enumC0841M21189 = c12918.mo27437().m21189(iM43371);
        int iM43364 = c18729.m43364();
        if (enumC0841M21189 == null) {
            abstractC9617M31384 = new C0443(c12918, EnumC0841.f3065, iM43364);
        } else {
            switch (C21178.f68251[enumC0841M21189.f3316.ordinal()]) {
                case 1:
                    c9889 = new C9889(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 2:
                    c9889 = new C9183(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 3:
                    c9889 = new C16237(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 4:
                    abstractC9617M31384 = c12918.m31384(iM43364, enumC0841M21189);
                    break;
                case 5:
                    c9889 = new C4244(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 6:
                    c9889 = new C19767(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 7:
                    c9889 = new C0715(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 8:
                    c9889 = new C5655(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 9:
                    c9889 = new C1421(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 10:
                    c9889 = new C8477(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 11:
                    c9889 = new C15531(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 12:
                    c9889 = new C21883(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 13:
                    c9889 = new C22588(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 14:
                    abstractC9617M31384 = c12918.m31405(iM43364, enumC0841M21189);
                    break;
                case 15:
                    c9889 = new C4949(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 16:
                    c9889 = new C3538(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 17:
                    c9889 = new C13415(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 18:
                    c9889 = new C12710(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 19:
                    c9889 = new C10594(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 20:
                    c9889 = new C6360(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 21:
                    c9889 = new C12005(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 22:
                    c9889 = new C23293(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 23:
                    c9889 = new C14120(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 24:
                    c9889 = new C7771(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 25:
                    abstractC9617M31384 = c12918.m31412(iM43364, enumC0841M21189);
                    break;
                case 26:
                    c9889 = new C16671(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 27:
                    c9889 = new C11028(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 28:
                    c9889 = new C18083(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 29:
                    c9889 = new C17377(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 30:
                    c9889 = new C14554(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 31:
                    c9889 = new C23727(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 32:
                    c9889 = new C6794(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 33:
                    c9889 = new C20906(c12918, enumC0841M21189, iM43364);
                    abstractC9617M31384 = c9889;
                    break;
                case 34:
                    abstractC9617M31384 = new C2561(c12918, iM43364);
                    break;
                case 35:
                    abstractC9617M31384 = new C19495(c12918, iM43364);
                    break;
                case 36:
                    abstractC9617M31384 = new C7066(c12918, iM43364);
                    break;
                default:
                    throw new C15431(null, "Unexpected opcode format: %s", enumC0841M21189.f3316.toString());
            }
        }
        c18729.m43356(abstractC9617M31384.mo3974() * 2);
        return abstractC9617M31384;
    }

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ۢ */
    public final EnumC0841 mo3975() {
        return this.f29162;
    }

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ۚ */
    public int mo3974() {
        return this.f29162.f3316.f11595 / 2;
    }
}
