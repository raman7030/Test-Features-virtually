package l;

import com.umeng.analytics.pro.d;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۬᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7UY */
/* JADX INFO: loaded from: classes4.dex */
public class C13439 extends AbstractC19791 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static byte[] f40154;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f40156 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f40158 = "vt100";

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f40157 = 80;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40160 = 24;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40155 = 640;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f40159 = 480;

    static {
        byte[] bArr = C19356.f62660;
        f40154 = C19356.m44592(d.aw, StandardCharsets.UTF_8);
    }

    public C13439() {
        this.f63912 = f40154;
        this.f63917 = new C19708();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m32473() {
        C7381 c7381M45497 = m45497();
        if (this.f40156) {
            C3148 c3148 = new C3148();
            c3148.m9571(this.f40158);
            c3148.m9570(this.f40157, this.f40160, this.f40155, this.f40159);
            c3148.mo9572(c7381M45497, this);
        }
    }

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ۡ */
    public final void mo2847() {
        C19708 c19708;
        InputStream inputStream;
        C16261 c16261 = new C16261(this.f63911);
        C8087 c8087 = new C8087(c16261);
        try {
            C7381 c7381M45497 = m45497();
            while (m45489() && this.f63908 != null && (c19708 = this.f63917) != null && (inputStream = c19708.f63666) != null) {
                byte[] bArr = c16261.f50016;
                int i = inputStream.read(bArr, 14, (bArr.length - 14) - c7381M45497.m19874());
                if (i != 0) {
                    if (i == -1) {
                        m45495();
                        break;
                    }
                    if (this.f63909) {
                        break;
                    }
                    c8087.m21457();
                    c16261.m38234((byte) 94);
                    c16261.m38245(this.f63918);
                    c16261.m38245(i);
                    c16261.m38251(i);
                    c7381M45497.m19862(c8087, this, i);
                }
            }
        } catch (Exception unused) {
        }
        Thread thread = this.f63908;
        if (thread != null) {
            synchronized (thread) {
                thread.notifyAll();
            }
        }
        this.f63908 = null;
    }
}
