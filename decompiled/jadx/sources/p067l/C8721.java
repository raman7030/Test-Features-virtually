package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBIK */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8721 extends EnumC10062 {
    public /* synthetic */ C8721() {
        this("FORMAT_45CC", 31);
    }

    public C8721(String str, int i) {
        super(str, i, 0);
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public AbstractC6354 mo4152(int i, InterfaceC17752 interfaceC17752) {
        int iM23455 = EnumC10062.m23455(i);
        if (iM23455 != 250) {
            throw new UnsupportedOperationException(String.valueOf(iM23455));
        }
        int iM23472 = EnumC10062.m23472(i);
        int iM23487 = EnumC10062.m23487(i);
        int i2 = interfaceC17752.read();
        int i3 = interfaceC17752.read();
        int iM23447 = EnumC10062.m23447(i3);
        int iM23459 = EnumC10062.m23459(i3);
        int iM23473 = EnumC10062.m23472(i3);
        int iM23488 = EnumC10062.m23487(i3);
        int i4 = interfaceC17752.read();
        C11719.m26921(iM23455);
        if (iM23487 < 1 || iM23487 > 5) {
            throw new C2724("bogus registerCount: ".concat(C16351.m37154(iM23487)), null);
        }
        return new C16766(this, iM23455, i2, i4, Arrays.copyOfRange(new int[]{iM23447, iM23459, iM23473, iM23488, iM23472}, 0, iM23487));
    }

    @Override // p067l.EnumC10062
    /* JADX INFO: renamed from: ֫ */
    public void mo4153(AbstractC6354 abstractC6354, InterfaceC5013 interfaceC5013) {
        C16766 c16766 = (C16766) abstractC6354;
        EnumC10062.m23480(c16766.m14525(), EnumC10062.m23477(c16766.m38011(), c16766.mo5048()));
        EnumC10062.m23467(c16766.mo5046(), c16766.mo5047(), c16766.mo14527(), c16766.m38012());
        interfaceC5013.m10655();
    }
}
