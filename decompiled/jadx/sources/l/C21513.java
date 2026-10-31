package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩸ۤۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21513 implements InterfaceC18691 {
    @Override // l.InterfaceC18691
    /* JADX INFO: renamed from: ֫ */
    public final EnumC10930 mo3621() {
        return EnumC10930.FileBothDirectoryInformation;
    }

    @Override // l.InterfaceC18691
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC0345 mo3620(C10325 c10325) throws C13146 {
        long jM26082 = c10325.m26082();
        c10325.m26082();
        C13811.m33143(c10325);
        C13811.m33143(c10325);
        C13811.m33143(c10325);
        C13811.m33143(c10325);
        c10325.m26084();
        c10325.m26084();
        c10325.m26082();
        long jM26083 = c10325.m26082();
        c10325.m26082();
        byte bM26095 = c10325.m26095();
        c10325.m26095();
        byte[] bArr = new byte[24];
        c10325.m26087(24, bArr);
        Charset charset = C8208.f25225;
        new String(bArr, 0, bM26095, charset);
        return new C23629(jM26082, c10325.m26073(((int) jM26083) / 2, charset));
    }
}
