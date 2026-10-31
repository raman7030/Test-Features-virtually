package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩻᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes.dex */
public final class C24017 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77831;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77832 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2951 f77833;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public OutputStream f77834;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2951 f77835;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2951 f77836;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19079 f77837;

    public C24017(C19079 c19079) {
        this.f77837 = c19079;
        AbstractC15440 abstractC15440M43940 = C19079.m43940(c19079, this.f77831);
        while (abstractC15440M43940.mo23120() && abstractC15440M43940.mo23127() >= 524288) {
            int i = this.f77831 + 1;
            this.f77831 = i;
            abstractC15440M43940 = C19079.m43940(c19079, i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2851 m52858(String str, C12953 c12953) throws IOException {
        C2951 c2951;
        int iM31518 = c12953.m31518();
        AbstractC15440 abstractC15440M43940 = C19079.m43940(this.f77837, this.f77831);
        int iMo23127 = this.f77832;
        if (iMo23127 == -1) {
            iMo23127 = abstractC15440M43940.mo23120() ? (int) abstractC15440M43940.mo23127() : 0;
        }
        if (iMo23127 > 0 && iMo23127 + iM31518 > 524288) {
            C0349.m1793(this.f77834);
            this.f77834 = null;
            this.f77832 = -1;
            int i = this.f77831 + 1;
            this.f77831 = i;
            abstractC15440M43940 = C19079.m43940(this.f77837, i);
            iMo23127 = abstractC15440M43940.mo23120() ? (int) abstractC15440M43940.mo23127() : 0;
        }
        if (this.f77831 > 65535) {
            throw new IOException("Too many smali cache data files");
        }
        if (this.f77834 == null) {
            this.f77834 = abstractC15440M43940.mo23555(true);
        }
        this.f77834.write(c12953.m31516(), 0, iM31518);
        this.f77834.flush();
        synchronized (this.f77837.f60073) {
            this.f77837.f60086.remove(Integer.valueOf(this.f77831));
        }
        C19079 c19079 = this.f77837;
        if (str.length() <= 20000) {
            if (this.f77833 == null) {
                this.f77833 = new C2951(c19079.f60072.mo23555(true));
            }
            c2951 = this.f77833;
        } else {
            if (this.f77835 == null) {
                this.f77835 = new C2951(c19079.f60085.mo23555(true));
            }
            c2951 = this.f77835;
        }
        if (str.length() <= 20000) {
            C12248.m29749(c2951, C5773.m16233(str));
            C5773.m16236(c2951, str);
        } else {
            C12248.m29746(c2951, C5773.m16233(str));
            C5773.m16236(c2951, str);
        }
        C12248.m29749(c2951, this.f77831);
        C12248.m29746(c2951, iMo23127);
        C12248.m29746(c2951, iM31518);
        c2951.flush();
        int i2 = iMo23127 + iM31518;
        this.f77832 = i2;
        int i3 = this.f77831;
        C2851 c2851 = new C2851(i3, iMo23127, iM31518);
        if (i2 >= 524288) {
            this.f77831 = i3 + 1;
            C0349.m1793(this.f77834);
            this.f77834 = null;
            this.f77832 = -1;
        }
        return c2851;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52860(String str) throws IOException {
        if (this.f77836 == null) {
            this.f77836 = new C2951(this.f77837.f60080.mo23555(true));
        }
        C2951 c2951 = this.f77836;
        C12248.m29746(c2951, C5773.m16233(str));
        C5773.m16236(c2951, str);
        this.f77836.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52859() {
        C0349.m1793(this.f77834);
        C0349.m1793(this.f77833);
        C0349.m1793(this.f77835);
        C0349.m1793(this.f77836);
        this.f77834 = null;
        this.f77833 = null;
        this.f77835 = null;
        this.f77836 = null;
        this.f77832 = -1;
    }
}
