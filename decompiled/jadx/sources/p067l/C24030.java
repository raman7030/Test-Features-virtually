package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A20 */
/* JADX INFO: loaded from: classes.dex */
public final class C24030 implements InterfaceC15312 {

    /* JADX INFO: renamed from: ܰ */
    public static final InterfaceC4410 f76314 = C13128.m30022(C24030.class);

    /* JADX INFO: renamed from: ۗ */
    public volatile boolean f76315 = true;

    /* JADX INFO: renamed from: ۙ */
    public C9278 f76316;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f76317;

    /* JADX INFO: renamed from: ۤ */
    public final C13302 f76318;

    /* JADX INFO: renamed from: ۨ */
    public C5807 f76319;

    /* JADX INFO: renamed from: ۫ */
    public C3795 f76320;

    /* JADX INFO: renamed from: ۬ */
    public final int f76321;

    /* JADX INFO: renamed from: ᩶ */
    public C13972 f76322;

    /* JADX INFO: renamed from: ᩸ */
    public final int f76323;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f76324;

    /* JADX INFO: renamed from: ᩺ */
    public final String f76325;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        boolean zIsOpen = isOpen();
        this.f76315 = false;
        C9278 c9278 = this.f76316;
        if (c9278 != null) {
            c9278.getClass();
            this.f76316 = null;
        }
        C3795 c3795 = this.f76320;
        if (c3795 != null) {
            c3795.getClass();
            this.f76320 = null;
        }
        try {
            if (zIsOpen) {
                this.f76322.m31750();
            } else {
                C13972 c13972 = this.f76322;
                if (c13972 != null) {
                    c13972.m31750();
                }
            }
            this.f76322 = null;
            C5807 c5807 = this.f76319;
            if (c5807 != null) {
                c5807.m13077();
            }
        } catch (Throwable th) {
            C5807 c5808 = this.f76319;
            if (c5808 != null) {
                c5808.m13077();
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC15312
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC15312 mo34851() {
        if (InterfaceC15312.class.isAssignableFrom(C24030.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C13972 m53258() {
        if (!this.f76315) {
            throw new C5255("Pipe handle already closed");
        }
        if (!isOpen()) {
            C5807 c5807M53261 = m53261();
            try {
                if (c5807M53261.m13076()) {
                    C13972 c13972M33449 = this.f76318.m33449(this.f76325, 0, this.f76323, 7, 128, 0);
                    this.f76322 = c13972M33449;
                    c13972M33449.m31748();
                    c5807M53261.close();
                    return c13972M33449;
                }
                if (this.f76325.startsWith("\\pipe\\")) {
                    c5807M53261.m13063(new C17697(this.f76325, c5807M53261.m13070()), new C4958(c5807M53261.m13070()), new EnumC2572[0]);
                }
                if (c5807M53261.m13065(16) || this.f76325.startsWith("\\pipe\\")) {
                    this.f76322 = this.f76318.m33448(this.f76321, this.f76323, 7, 128, 0);
                } else {
                    this.f76322 = this.f76318.m33449("\\pipe" + this.f76325, this.f76321, this.f76323, 7, 128, 0);
                }
                C13972 c13972 = this.f76322;
                c13972.m31748();
                c5807M53261.close();
                return c13972;
            } catch (Throwable th) {
                try {
                    c5807M53261.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        f76314.mo9196("Pipe already open");
        C13972 c13973 = this.f76322;
        c13973.m31748();
        return c13973;
    }

    public C24030(C13302 c13302) {
        this.f76318 = c13302;
        this.f76317 = (c13302.m30371() & 512) == 512;
        this.f76324 = false;
        this.f76321 = (c13302.m30371() & (-65281)) | 32;
        this.f76323 = (c13302.m30371() & 7) | WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f76325 = c13302.f41801.m43775();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C13302 m53263() {
        return this.f76318;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C5807 m53261() {
        if (this.f76319 == null) {
            this.f76319 = this.f76318.m33461();
        }
        C5807 c5807 = this.f76319;
        c5807.m13064();
        return c5807;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m53259() {
        return this.f76325;
    }

    public final boolean isOpen() {
        C13972 c13972;
        return this.f76315 && (c13972 = this.f76322) != null && c13972.m31751();
    }

    @Override // p067l.InterfaceC15312
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo34850() {
        if (!this.f76315) {
            return true;
        }
        C13972 c13972 = this.f76322;
        return (c13972 == null || c13972.m31751()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C9278 m53262() throws C5255 {
        if (!this.f76315) {
            throw new C5255("Already closed");
        }
        C9278 c9278 = this.f76316;
        if (c9278 != null) {
            return c9278;
        }
        C5807 c5807M53261 = m53261();
        try {
            this.f76316 = new C9278(this, c5807M53261);
            c5807M53261.close();
            return this.f76316;
        } catch (Throwable th) {
            try {
                c5807M53261.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final C3795 m53260() throws C5255 {
        if (!this.f76315) {
            throw new C5255("Already closed");
        }
        C3795 c3795 = this.f76320;
        if (c3795 != null) {
            return c3795;
        }
        C5807 c5807M53261 = m53261();
        try {
            this.f76320 = new C3795(this, c5807M53261);
            c5807M53261.close();
            return this.f76320;
        } catch (Throwable th) {
            try {
                c5807M53261.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p067l.InterfaceC15312
    /* JADX INFO: renamed from: ֫ */
    public final int mo34848(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        C13972 c13972M53258 = m53258();
        try {
            C5807 c5807M31755 = c13972M53258.m31755();
            try {
                if (c5807M31755.m13076()) {
                    C4978 c4978 = new C4978(c5807M31755.m13070(), c13972M53258.m31752(), bArr2);
                    c4978.m10537();
                    c4978.m10535(new C21231(bArr, i, i2));
                    c4978.m10538(i3);
                    int iM14448 = ((C6319) c5807M31755.m13063(c4978, null, EnumC2572.NO_RETRY)).m14448();
                    c5807M31755.close();
                    c13972M53258.m31750();
                    return iM14448;
                }
                if (this.f76317) {
                    C11664 c11664 = new C11664(c5807M31755.m13070(), c13972M53258.m31754(), bArr, i, i2);
                    C10993 c10993 = new C10993(c5807M31755.m13070(), bArr2);
                    if ((this.f76318.m30371() & 1536) == 1536) {
                        c11664.m44786();
                    }
                    c5807M31755.m13063(c11664, c10993, EnumC2572.NO_RETRY);
                    int iM25376 = c10993.m25376();
                    c5807M31755.close();
                    c13972M53258.m31750();
                    return iM25376;
                }
                if (this.f76324) {
                    c5807M31755.m13063(new C17697(this.f76325, c5807M31755.m13070()), new C4958(c5807M31755.m13070()), new EnumC2572[0]);
                    C25074 c25074 = new C25074(c5807M31755.m13070(), bArr2);
                    c5807M31755.m13063(new C16356(c5807M31755.m13070(), this.f76325, bArr, i, i2), c25074, new EnumC2572[0]);
                    int iM55046 = c25074.m55046();
                    c5807M31755.close();
                    c13972M53258.m31750();
                    return iM55046;
                }
                C3795 c3795M53260 = m53260();
                C9278 c9278M53262 = m53262();
                c3795M53260.m18343(i, bArr, i2, 0);
                c9278M53262.getClass();
                int iM27372 = c9278M53262.m27372(0, bArr2.length, bArr2);
                c5807M31755.close();
                c13972M53258.m31750();
                return iM27372;
            } catch (Throwable th) {
                try {
                    c5807M31755.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c13972M53258.m31750();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // p067l.InterfaceC15312
    /* JADX INFO: renamed from: ܽ */
    public final int mo34852(int i, int i2, byte[] bArr) {
        return m53262().m27372(i, i2, bArr);
    }

    @Override // p067l.InterfaceC15312
    /* JADX INFO: renamed from: ֫ */
    public final void mo34849(int i, int i2, byte[] bArr) throws IOException {
        m53260().m18343(i, bArr, i2, 1);
    }
}
