package p067l;

import android.os.Bundle;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: renamed from: l.᩺ۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36NN */
/* JADX INFO: loaded from: classes.dex */
public final class C23989 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C15271 f76191;

    /* JADX INFO: renamed from: ۙ */
    public final CharSequence f76192;

    /* JADX INFO: renamed from: ᩶ */
    public final C8467 f76193;

    /* JADX INFO: renamed from: ᩸ */
    public final int f76194;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f76195;

    public C23989(C15271 c15271, int i, CharSequence charSequence, C8467 c8467) {
        this.f76191 = c15271;
        this.f76194 = i;
        this.f76192 = charSequence;
        this.f76193 = c8467;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53160(Writer writer) throws IOException {
        int i = 0;
        while (true) {
            C15271 c15271 = this.f76191;
            if (i >= c15271.m34768()) {
                return;
            }
            if (i == this.f76194) {
                m53157(writer, this.f76192);
            } else {
                C9729 c9729M34758 = c15271.m34758(i, this.f76193);
                try {
                    m53157(writer, c9729M34758);
                    c9729M34758.close();
                } catch (Throwable th) {
                    try {
                        c9729M34758.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53161() {
        for (int i = 0; i < this.f76191.m34768(); i++) {
            if (i != this.f76194) {
                synchronized (this.f76191) {
                    if (this.f76191.f43573[i]) {
                        InterfaceC22097 interfaceC22097M34766 = this.f76191.m34766(i);
                        C8467 c8467 = this.f76193;
                        C13693 c13693M31105 = C13693.m31105(interfaceC22097M34766, c8467.f22723, c8467.f22725, c8467.f22724, 8388608, new C13261(), (String) null);
                        try {
                            c13693M31105.f38639.mo3998(false);
                            Bundle bundleM46652 = c13693M31105.f38632.f34416.f22201.m46652();
                            bundleM46652.putBoolean("changed", false);
                            C14443 c14443M54760 = c13693M31105.f38639.mo3999().m54760();
                            try {
                                C12332 c12332 = c13693M31105.f38632;
                                C14343 c14343M19162 = c12332.f34416.m19162(c14443M54760, bundleM46652, c12332.f34415, this.f76191.m34770(), true, 8388608);
                                c14443M54760.close();
                                this.f76191.m34766(i);
                                c13693M31105.m31126(bundleM46652, c13693M31105.f38632.f34415, c14343M19162, this.f76193, new C13261());
                                c13693M31105.m31121(c13693M31105.f38639.mo3999().m54774()).m12907();
                                c13693M31105.m31120().m12907();
                            } catch (Throwable th) {
                                try {
                                    c14443M54760.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            c13693M31105.m31120().m12907();
                            throw th3;
                        }
                    }
                }
            }
        }
        synchronized (this.f76191.f43579) {
            synchronized (this.f76191) {
                for (int i2 = 0; i2 < this.f76191.m34768(); i2++) {
                    if (i2 != this.f76194) {
                        this.f76191.f43573[i2] = false;
                    }
                }
                this.f76191.f43580.putBoolean("changed", this.f76191.f43573[this.f76194]);
            }
            this.f76191.m34757();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53158() {
        return this.f76194;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9729 m53159(int i) {
        if (i == this.f76194) {
            throw new IllegalArgumentException("Active page already has a captured read");
        }
        return this.f76191.m34758(i, this.f76193);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53157(Writer writer, CharSequence charSequence) throws IOException {
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
        synchronized (this.f76191) {
            if (this.f76195) {
                return;
            }
            this.f76195 = true;
            this.f76191.f43576--;
            if (this.f76191.f43576 == 0) {
                this.f76191.f43581.m12889((Object) null);
            }
        }
    }
}
