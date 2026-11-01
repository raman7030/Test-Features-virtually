package p067l;

/* JADX INFO: renamed from: l.۫ܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82T8 */
/* JADX INFO: loaded from: classes4.dex */
public class C14213 implements InterfaceC19837 {

    /* JADX INFO: renamed from: ֫ */
    public final C18236 f40491;

    public C14213(C18236 c18236) {
        this.f40491 = c18236;
    }

    @Override // p067l.InterfaceC19837
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public InterfaceC23920 mo6575(InterfaceC23920 interfaceC23920) {
        if (!(interfaceC23920 instanceof InterfaceC12777)) {
            return interfaceC23920;
        }
        switch (C2813.f4814[interfaceC23920.mo6217().f6090.ordinal()]) {
            case 1:
                return new C10190(this, (InterfaceC2717) interfaceC23920);
            case 2:
                return new C16894(this, (InterfaceC3388) interfaceC23920);
            case 3:
                return new C22931(this, (InterfaceC6741) interfaceC23920);
            case 4:
                return new C23601(this, (InterfaceC24175) interfaceC23920);
            case 5:
                return new C21590(this, (InterfaceC12933) interfaceC23920);
            case 6:
                return new C6837(this, (InterfaceC18967) interfaceC23920);
            case 7:
                return new C5496(this, (InterfaceC8909) interfaceC23920);
            case 8:
                return new C14883(this, (InterfaceC22321) interfaceC23920);
            default:
                throw new IllegalArgumentException(interfaceC23920.mo6217().f6089);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC10250 m32684(C14213 c14213, int i, InterfaceC10250 interfaceC10250) {
        C18236 c18236 = c14213.f40491;
        switch (i) {
            case 0:
                return (InterfaceC10250) c18236.m41482().mo6575((InterfaceC16954) interfaceC10250);
            case 1:
                return new C20508(c18236.m41469(), (InterfaceC22991) interfaceC10250);
            case 2:
                return (InterfaceC10250) c18236.m41473().mo6575((InterfaceC20309) interfaceC10250);
            case 3:
                return (InterfaceC10250) c18236.m41471().mo6575((InterfaceC7568) interfaceC10250);
            case 4:
                return new C3743(c18236.m41469(), (InterfaceC2873) interfaceC10250);
            case 5:
                C5576 c5576M41479 = c18236.m41479();
                c5576M41479.getClass();
                return new C6917(c5576M41479, (InterfaceC6227) interfaceC10250);
            case 6:
                return C23190.m51665((InterfaceC20980) interfaceC10250, c18236);
            default:
                throw new C17034(null, "Invalid reference type: %d", Integer.valueOf(i));
        }
    }
}
