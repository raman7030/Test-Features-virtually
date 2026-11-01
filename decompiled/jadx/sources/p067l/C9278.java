package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۟ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 4A2K */
/* JADX INFO: loaded from: classes3.dex */
public final class C9278 extends C11961 {

    /* JADX INFO: renamed from: ֫֫ */
    public C24030 f25231;

    @Override // p067l.C11961, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p067l.C11961
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C13972 mo21482() {
        return this.f25231.m53258();
    }

    public C9278(C24030 c24030, C5807 c5807) {
        super(c24030.m53263(), c5807);
        this.f25231 = c24030;
    }

    @Override // p067l.C11961, java.io.InputStream
    public final int available() throws IOException {
        int iM50285;
        C24030 c24030 = this.f25231;
        try {
            C13972 c13972M53258 = c24030.m53258();
            try {
                C5807 c5807M31755 = c13972M53258.m31755();
                try {
                    if (c5807M31755.m13076()) {
                        C4978 c4978 = new C4978(1130508, c5807M31755.m13070(), c13972M53258.m31752());
                        c4978.m10538(16);
                        c4978.m10537();
                        iM50285 = ((C21072) ((C6319) c5807M31755.m13063(c4978, null, EnumC2572.NO_RETRY)).m14446()).m47552();
                    } else {
                        C8981 c8981 = new C8981(c5807M31755.m13070(), c24030.m53259(), c13972M53258.m31754());
                        C22393 c22393 = new C22393(c5807M31755.m13070());
                        c5807M31755.m13063(c8981, c22393, EnumC2572.NO_RETRY);
                        if (c22393.m43253() != 1 && c22393.m43253() != 4) {
                            iM50285 = c22393.m50285();
                        }
                        c13972M53258.m31749();
                        c5807M31755.close();
                        c13972M53258.m31750();
                        return 0;
                    }
                    c5807M31755.close();
                    c13972M53258.m31750();
                    return iM50285;
                } catch (Throwable th) {
                    try {
                        c5807M31755.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c13972M53258.m31750();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (C5255 e) {
            throw C11961.m27370(e);
        }
    }
}
