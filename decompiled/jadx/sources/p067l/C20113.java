package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ᩴۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7YQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20113 extends C6346 {

    /* JADX INFO: renamed from: ۜ */
    public byte[] f62223;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f62224;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C20784 f62225;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f62226;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20113(C20784 c20784, String str, String str2, int i, byte[] bArr, String str3) {
        super(i, str, str2, str3, bArr);
        this.f62225 = c20784;
        this.f62226 = false;
        this.f62223 = null;
        this.f62224 = null;
        if (!this.f16446.startsWith("|1|") || this.f16446.substring(3).indexOf("|") <= 0) {
            return;
        }
        String strSubstring = this.f16446.substring(3);
        String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("|"));
        String strSubstring3 = strSubstring.substring(strSubstring.indexOf("|") + 1);
        Charset charset = StandardCharsets.UTF_8;
        this.f62223 = C20764.m46892(0, strSubstring2.length(), C20764.m46886(strSubstring2, charset));
        this.f62224 = C20764.m46892(0, strSubstring3.length(), C20764.m46886(strSubstring3, charset));
        int blockSize = c20784.f65330.getBlockSize();
        if (this.f62223.length != blockSize || this.f62224.length != blockSize) {
            this.f62223 = null;
            this.f62224 = null;
        } else {
            this.f62226 = true;
        }
    }

    @Override // p067l.C6346
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo14506(String str) {
        boolean zM46885;
        if (!this.f62226) {
            return super.mo14506(str);
        }
        try {
            synchronized (this.f62225.f65330) {
                this.f62225.f65330.init(this.f62223);
                byte[] bArrM46886 = C20764.m46886(str, StandardCharsets.UTF_8);
                this.f62225.f65330.mo5848(bArrM46886.length, bArrM46886);
                byte[] bArr = new byte[this.f62225.f65330.getBlockSize()];
                this.f62225.f65330.mo5850(0, bArr);
                zM46885 = C20764.m46885(this.f62224, bArr);
            }
            return zM46885;
        } catch (Exception unused) {
            this.f62225.f65331.m49100().getClass();
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m45555() {
        return this.f62226;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45554() {
        Charset charset;
        if (this.f62226) {
            return;
        }
        if (this.f62223 == null) {
            InterfaceC23465 interfaceC23465 = C9383.f25566;
            synchronized (interfaceC23465) {
                int blockSize = this.f62225.f65330.getBlockSize();
                byte[] bArr = new byte[blockSize];
                this.f62223 = bArr;
                interfaceC23465.mo5385(0, blockSize, bArr);
            }
        }
        try {
            synchronized (this.f62225.f65330) {
                this.f62225.f65330.init(this.f62223);
                String str = this.f16446;
                charset = StandardCharsets.UTF_8;
                byte[] bArrM46886 = C20764.m46886(str, charset);
                this.f62225.f65330.mo5848(bArrM46886.length, bArrM46886);
                byte[] bArr2 = new byte[this.f62225.f65330.getBlockSize()];
                this.f62224 = bArr2;
                this.f62225.f65330.mo5850(0, bArr2);
            }
            StringBuilder sb = new StringBuilder("|1|");
            byte[] bArr3 = this.f62223;
            byte[] bArrM46887 = C20764.m46887(bArr3, bArr3.length, true);
            sb.append(new String(bArrM46887, 0, bArrM46887.length, charset));
            sb.append("|");
            byte[] bArr4 = this.f62224;
            byte[] bArrM46888 = C20764.m46887(bArr4, bArr4.length, true);
            sb.append(new String(bArrM46888, 0, bArrM46888.length, charset));
            this.f16446 = sb.toString();
            this.f62226 = true;
        } catch (Exception unused) {
            this.f62225.f65331.m49100().getClass();
            this.f62223 = null;
            this.f62224 = null;
        }
    }
}
