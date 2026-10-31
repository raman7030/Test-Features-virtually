package l;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܰ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C13680 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f40830;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7331 f40831;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10678 f40832;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f40833;

    public C13680(C10678 c10678, C7331 c7331) {
        this.f40832 = c10678;
        this.f40831 = c7331;
        this.f40833 = c7331.f22523 ? null : new boolean[c10678.f32145];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32920() {
        C7331 c7331 = this.f40831;
        if (c7331.f22522 != this) {
            return;
        }
        int i = 0;
        while (true) {
            C10678 c10678 = this.f40832;
            if (i < c10678.f32145) {
                try {
                    c10678.f32135.mo39432(c7331.f22524[i]);
                } catch (IOException unused) {
                }
                i++;
            } else {
                c7331.f22522 = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5508 m32917(int i) {
        synchronized (this.f40832) {
            if (this.f40830) {
                throw new IllegalStateException();
            }
            C7331 c7331 = this.f40831;
            if (c7331.f22522 != this) {
                return C23852.m52564();
            }
            if (!c7331.f22523) {
                this.f40833[i] = true;
            }
            try {
                return new C22853(this, this.f40832.f32135.mo39428(c7331.f22524[i]));
            } catch (FileNotFoundException unused) {
                return C23852.m52564();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32919() {
        synchronized (this.f40832) {
            if (this.f40830) {
                throw new IllegalStateException();
            }
            if (this.f40831.f22522 == this) {
                this.f40832.m26799(this, true);
            }
            this.f40830 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32918() {
        synchronized (this.f40832) {
            if (this.f40830) {
                throw new IllegalStateException();
            }
            if (this.f40831.f22522 == this) {
                this.f40832.m26799(this, false);
            }
            this.f40830 = true;
        }
    }
}
