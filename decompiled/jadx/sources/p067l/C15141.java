package p067l;

import com.umeng.analytics.pro.C0708d;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۬᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7UY */
/* JADX INFO: loaded from: classes4.dex */
public class C15141 extends AbstractC21178 {

    /* JADX INFO: renamed from: ۗ */
    public static byte[] f43225;

    /* JADX INFO: renamed from: ۠ */
    public boolean f43227 = false;

    /* JADX INFO: renamed from: ᩶ */
    public String f43229 = "vt100";

    /* JADX INFO: renamed from: ܶ */
    public int f43228 = 80;

    /* JADX INFO: renamed from: ᩹ */
    public int f43231 = 24;

    /* JADX INFO: renamed from: ۙ */
    public int f43226 = 640;

    /* JADX INFO: renamed from: ᩸ */
    public int f43230 = 480;

    static {
        byte[] bArr = C20764.f65273;
        f43225 = C20764.m46886(C0708d.f2642aw, StandardCharsets.UTF_8);
    }

    public C15141() {
        this.f66549 = f43225;
        this.f66554 = new C21099();
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m34575() {
        C9383 c9383M47808 = m47808();
        if (this.f43227) {
            C5360 c5360 = new C5360();
            c5360.m11614(this.f43229);
            c5360.m11613(this.f43228, this.f43231, this.f43226, this.f43230);
            c5360.mo11615(c9383M47808, this);
        }
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۡ */
    public final void mo5176() {
        C21099 c21099;
        InputStream inputStream;
        C17823 c17823 = new C17823(this.f66548);
        C10054 c10054 = new C10054(c17823);
        try {
            C9383 c9383M47808 = m47808();
            while (m47800() && this.f66545 != null && (c21099 = this.f66554) != null && (inputStream = c21099.f66297) != null) {
                byte[] bArr = c17823.f53185;
                int i = inputStream.read(bArr, 14, (bArr.length - 14) - c9383M47808.m21847());
                if (i != 0) {
                    if (i == -1) {
                        m47806();
                        break;
                    }
                    if (this.f66546) {
                        break;
                    }
                    c10054.m23425();
                    c17823.m40448((byte) 94);
                    c17823.m40459(this.f66555);
                    c17823.m40459(i);
                    c17823.m40465(i);
                    c9383M47808.m21835(c10054, this, i);
                }
            }
        } catch (Exception unused) {
        }
        Thread thread = this.f66545;
        if (thread != null) {
            synchronized (thread) {
                thread.notifyAll();
            }
        }
        this.f66545 = null;
    }
}
