package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩺ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36NN */
/* JADX INFO: loaded from: classes.dex */
public final class C22749 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13576 f73465;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharSequence f73466;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6417 f73467;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f73468;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73469;

    public C22749(C13576 c13576, int i, CharSequence charSequence, C6417 c6417) {
        this.f73465 = c13576;
        this.f73468 = i;
        this.f73466 = charSequence;
        this.f73467 = c6417;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50827(Writer writer) throws IOException {
        int i = 0;
        while (true) {
            C13576 c13576 = this.f73465;
            if (i >= c13576.m32656()) {
                return;
            }
            if (i == this.f73468) {
                m50824(writer, this.f73466);
            } else {
                C7744 c7744M32646 = c13576.m32646(i, this.f73467);
                try {
                    m50824(writer, c7744M32646);
                    c7744M32646.close();
                } catch (Throwable th) {
                    try {
                        c7744M32646.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50828() {
        for (int i = 0; i < this.f73465.m32656(); i++) {
            if (i != this.f73468) {
                synchronized (this.f73465) {
                    if (this.f73465.f40496[i]) {
                        InterfaceC20758 interfaceC20758M32654 = this.f73465.m32654(i);
                        C6417 c6417 = this.f73467;
                        C11915 c11915M29053 = C11915.m29053(interfaceC20758M32654, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, new C11461(), (String) null);
                        try {
                            c11915M29053.f35630.mo1600(false);
                            Bundle bundleM44358 = c11915M29053.f35623.f31452.f19337.m44358();
                            bundleM44358.putBoolean("changed", false);
                            C12704 c12704M52357 = c11915M29053.f35630.mo1601().m52357();
                            try {
                                C10483 c10483 = c11915M29053.f35623;
                                C12599 c12599M17224 = c10483.f31452.m17224(c12704M52357, bundleM44358, c10483.f31451, this.f73465.m32658(), true, 8388608);
                                c12704M52357.close();
                                this.f73465.m32654(i);
                                c11915M29053.m29074(bundleM44358, c11915M29053.f35623.f31451, c12599M17224, this.f73467, new C11461());
                                c11915M29053.m29069(c11915M29053.f35630.mo1601().m52371()).m10930();
                                c11915M29053.m29068().m10930();
                            } catch (Throwable th) {
                                try {
                                    c12704M52357.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            c11915M29053.m29068().m10930();
                            throw th3;
                        }
                    }
                }
            }
        }
        synchronized (this.f73465.f40502) {
            synchronized (this.f73465) {
                for (int i2 = 0; i2 < this.f73465.m32656(); i2++) {
                    if (i2 != this.f73468) {
                        this.f73465.f40496[i2] = false;
                    }
                }
                this.f73465.f40503.putBoolean("changed", this.f73465.f40496[this.f73468]);
            }
            this.f73465.m32645();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50825() {
        return this.f73468;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7744 m50826(int i) {
        if (i == this.f73468) {
            throw new IllegalArgumentException("Active page already has a captured read");
        }
        return this.f73465.m32646(i, this.f73467);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50824(Writer writer, CharSequence charSequence) throws IOException {
        char[] cArr = new char[32768];
        int i = 0;
        while (i < charSequence.length()) {
            int iMin = Math.min(32768, charSequence.length() - i);
            for (int i2 = 0; i2 < iMin; i2++) {
                cArr[i2] = charSequence.charAt(i + i2);
            }
            writer.write(cArr, 0, iMin);
            i += iMin;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f73465) {
            if (this.f73469) {
                return;
            }
            this.f73469 = true;
            this.f73465.f40499--;
            if (this.f73465.f40499 == 0) {
                this.f73465.f40504.m10912((Object) null);
            }
        }
    }
}
