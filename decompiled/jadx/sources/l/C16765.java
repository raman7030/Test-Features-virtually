package l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C16765 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C7429 f51468;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18177 f51469;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f51470;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51471 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f51472;

    public C16765(C18177 c18177, long j, long j2, C7429 c7429) {
        this.f51469 = c18177;
        this.f51472 = j;
        this.f51470 = j2;
        this.f51468 = c7429;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m39441() {
        long j;
        synchronized (this.f51469) {
            m39439();
            j = this.f51470;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16059 m39444(InterfaceC17066 interfaceC17066) throws Throwable {
        C7429 c7429;
        synchronized (this.f51469) {
            m39439();
            c7429 = this.f51468;
        }
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(interfaceC17066);
        if (!interfaceC17066M38504.mo1526()) {
            m39440();
            C16059 c16059 = null;
            try {
                C16059 c160510 = new C16059(this.f51469.f56540, this.f51472, this.f51470, c7429.f22836, c7429.f22840);
                try {
                    c160510.m37969();
                    m39440();
                    if (interfaceC17066M38504.mo1526()) {
                        throw new C23821();
                    }
                    return c160510;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c16059 = c160510;
                    if (c16059 != null) {
                        try {
                            c16059.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new C23821();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9711 m39443(int i, int i2, C10275 c10275) throws Throwable {
        C7429 c7429;
        synchronized (this.f51469) {
            m39439();
            C9005.m23246(this.f51468.m19966(), i, i2);
            c7429 = this.f51468;
        }
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(c10275);
        if (!interfaceC17066M38504.mo1526()) {
            m39440();
            C9711 c9711 = null;
            try {
                C9711 c9712 = new C9711(this.f51469.f56540, this.f51472, this.f51470, C18177.m42355(C19631.m45102(c7429.f22836, i, i2), interfaceC17066M38504), C13510.m32541(c7429.f22840, i, i2));
                try {
                    c9712.m24679();
                    m39440();
                    if (interfaceC17066M38504.mo1526()) {
                        throw new C23821();
                    }
                    return c9712;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c9711 = c9712;
                    if (c9711 != null) {
                        try {
                            c9711.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    throw e;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Error e4) {
                e = e4;
            } catch (RuntimeException e5) {
                e = e5;
            }
        } else {
            throw new C23821();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m39440() {
        synchronized (this.f51469) {
            m39439();
        }
        this.f51469.m42396();
        synchronized (this.f51469) {
            m39439();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9711 m39442(int i, int i2, File file, C7512 c7512) throws Throwable {
        C7429 c7429;
        Throwable th;
        C9711 c9711;
        synchronized (this.f51469) {
            m39439();
            C9005.m23246(this.f51468.m19966(), i, i2);
            if (i2 > 33554432) {
                throw new C21978();
            }
            c7429 = this.f51468;
        }
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(c7512);
        if (interfaceC17066M38504.mo1526()) {
            throw new C23821();
        }
        C9711 c9712 = null;
        try {
            c9711 = new C9711(this.f51469.f56540, this.f51472, this.f51470, C19631.m45102(c7429.f22836, i, i2), C13510.m32541(c7429.f22840, i, i2));
            try {
                C9711 c9711M42312 = C18177.m42312(c9711, file, interfaceC17066M38504);
                c9712 = c9711M42312 != c9711 ? c9711 : null;
                try {
                    synchronized (this.f51469) {
                        m39439();
                    }
                    if (c9712 != null) {
                        c9712.close();
                    }
                    return c9711M42312;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c9711 = c9712;
                    c9712 = c9711M42312;
                    th = e;
                    if (c9712 != null) {
                        try {
                            c9712.close();
                        } catch (IOException e2) {
                            th.addSuppressed(e2);
                        }
                    }
                    if (c9711 == null) {
                        throw th;
                    }
                    try {
                        c9711.close();
                        throw th;
                    } catch (IOException e3) {
                        th.addSuppressed(e3);
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Error e5) {
                e = e5;
            } catch (RuntimeException e6) {
                e = e6;
            }
        } catch (IOException | Error | RuntimeException e7) {
            th = e7;
            c9711 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m39439() {
        if (this.f51471) {
            long j = this.f51472;
            C18177 c18177 = this.f51469;
            if (j == c18177.f56547 && !c18177.f56538) {
                return;
            }
        }
        throw new IllegalStateException("VersionHandle is not active");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f51469) {
            if (this.f51471) {
                this.f51471 = false;
                this.f51469.f56548.remove(this);
                C18177.m42332(this.f51469.m42363());
            }
        }
    }
}
