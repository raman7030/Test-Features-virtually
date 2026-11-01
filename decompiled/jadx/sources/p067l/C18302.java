package p067l;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܽܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C18302 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final C9429 f54650;

    /* JADX INFO: renamed from: ۙ */
    public final C19644 f54651;

    /* JADX INFO: renamed from: ᩶ */
    public final long f54652;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f54653 = true;

    /* JADX INFO: renamed from: ᩹ */
    public final long f54654;

    public C18302(C19644 c19644, long j, long j2, C9429 c9429) {
        this.f54651 = c19644;
        this.f54654 = j;
        this.f54652 = j2;
        this.f54650 = c9429;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m41677() {
        long j;
        synchronized (this.f54651) {
            m41675();
            j = this.f54652;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17631 m41680(InterfaceC18588 interfaceC18588) throws Throwable {
        C9429 c9429;
        synchronized (this.f54651) {
            m41675();
            c9429 = this.f54650;
        }
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC18588);
        if (!interfaceC18588M40721.mo3924()) {
            m41676();
            C17631 c17631 = null;
            try {
                C17631 c17632 = new C17631(this.f54651.f59753, this.f54654, this.f54652, c9429.f25749, c9429.f25753);
                try {
                    c17632.m40157();
                    m41676();
                    if (interfaceC18588M40721.mo3924()) {
                        throw new C25008();
                    }
                    return c17632;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c17631 = c17632;
                    if (c17631 != null) {
                        try {
                            c17631.close();
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
            throw new C25008();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11598 m41679(int i, int i2, C12134 c12134) throws Throwable {
        C9429 c9429;
        synchronized (this.f54651) {
            m41675();
            C10927.m25190(this.f54650.m21940(), i, i2);
            c9429 = this.f54650;
        }
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(c12134);
        if (!interfaceC18588M40721.mo3924()) {
            m41676();
            C11598 c11598 = null;
            try {
                C11598 c11599 = new C11598(this.f54651.f59753, this.f54654, this.f54652, C19644.m44616(C21026.m47398(c9429.f25749, i, i2), interfaceC18588M40721), C15208.m34643(c9429.f25753, i, i2));
                try {
                    c11599.m26693();
                    m41676();
                    if (interfaceC18588M40721.mo3924()) {
                        throw new C25008();
                    }
                    return c11599;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c11598 = c11599;
                    if (c11598 != null) {
                        try {
                            c11598.close();
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
            throw new C25008();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m41676() {
        synchronized (this.f54651) {
            m41675();
        }
        this.f54651.m44657();
        synchronized (this.f54651) {
            m41675();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11598 m41678(int i, int i2, File file, C9508 c9508) throws Throwable {
        C9429 c9429;
        Throwable th;
        C11598 c11598;
        synchronized (this.f54651) {
            m41675();
            C10927.m25190(this.f54650.m21940(), i, i2);
            if (i2 > 33554432) {
                throw new C23256();
            }
            c9429 = this.f54650;
        }
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(c9508);
        if (interfaceC18588M40721.mo3924()) {
            throw new C25008();
        }
        C11598 c11599 = null;
        try {
            c11598 = new C11598(this.f54651.f59753, this.f54654, this.f54652, C21026.m47398(c9429.f25749, i, i2), C15208.m34643(c9429.f25753, i, i2));
            try {
                C11598 c11598M44573 = C19644.m44573(c11598, file, interfaceC18588M40721);
                c11599 = c11598M44573 != c11598 ? c11598 : null;
                try {
                    synchronized (this.f54651) {
                        m41675();
                    }
                    if (c11599 != null) {
                        c11599.close();
                    }
                    return c11598M44573;
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    c11598 = c11599;
                    c11599 = c11598M44573;
                    th = e;
                    if (c11599 != null) {
                        try {
                            c11599.close();
                        } catch (IOException e2) {
                            th.addSuppressed(e2);
                        }
                    }
                    if (c11598 == null) {
                        throw th;
                    }
                    try {
                        c11598.close();
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
            c11598 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m41675() {
        if (this.f54653) {
            long j = this.f54654;
            C19644 c19644 = this.f54651;
            if (j == c19644.f59760 && !c19644.f59751) {
                return;
            }
        }
        throw new IllegalStateException("VersionHandle is not active");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f54651) {
            if (this.f54653) {
                this.f54653 = false;
                this.f54651.f59761.remove(this);
                C19644.m44593(this.f54651.m44624());
            }
        }
    }
}
