package p067l;

import android.media.MediaCodec;
import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ᩴ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes4.dex */
public final class C20450 {

    /* JADX INFO: renamed from: ֫ */
    public static final C0907 f63165 = new C0907(500);

    /* JADX INFO: renamed from: ۧ */
    public static final String f63166 = Long.toHexString(System.currentTimeMillis()) + Long.toHexString(System.nanoTime());

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46137(long j, String str) {
        return C13823.m31492(str) && j >= 48128 && j % 188 == 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m46139(String str) {
        return C13823.m31492(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC22462 m46133(String str) {
        EnumC22462 enumC22462;
        C0907 c0907 = f63165;
        synchronized (c0907) {
            enumC22462 = (EnumC22462) c0907.m6785(str);
        }
        return enumC22462;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46136(String str, EnumC22462 enumC22462) {
        C0907 c0907 = f63165;
        synchronized (c0907) {
            c0907.m6786(str, enumC22462);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46127(String str, InterfaceC19370 interfaceC19370, long j) {
        if (j > 0) {
            return str;
        }
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(f63166);
        sbM17248.append(System.identityHashCode(interfaceC19370));
        return C16111.m36664(sbM17248.toString()).toLowerCase();
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC22462 m46132(InputStream inputStream) throws IOException {
        m46140();
        byte[] bArr = new byte[940];
        C23461.m52184(inputStream, bArr, 940);
        m46140();
        return m46134(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC22462 m46131(MediaDataSource mediaDataSource) throws IOException {
        byte[] bArr = new byte[940];
        int i = 0;
        while (i < 940) {
            m46140();
            int at = mediaDataSource.readAt(i, bArr, i, 940 - i);
            if (at <= 0) {
                throw new EOFException("Unexpected end of MPEG-TS probe source");
            }
            i += at;
        }
        return m46134(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC22462 m46134(byte[] bArr) {
        for (int i = 0; i < 188; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                if ((bArr[(i2 * 188) + i] & 255) != 71) {
                }
            }
            return EnumC22462.MPEG_TS;
        }
        return EnumC22462.NOT_MPEG_TS;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11733 m46130(AbstractC17043 abstractC17043, int i) {
        final C11062 c11062 = new C11062();
        final C13823 c13823M31490 = C13823.m31490(abstractC17043, true);
        try {
            return new C11733(C24292.m53619(C13823.m31489("ts-thumbnail-local:" + Integer.toHexString(System.identityHashCode(abstractC17043)), new InterfaceC7788() { // from class: l.ܳ᩸ۜ
                @Override // p067l.InterfaceC7788
                /* JADX INFO: renamed from: ֫ */
                public final InterfaceC9501 mo18032() throws IOException {
                    C13823 c13823 = c13823M31490;
                    C11062 c11063 = c11062;
                    try {
                        InterfaceC9501 interfaceC9501M31495 = c13823.m31495();
                        if (interfaceC9501M31495 != null) {
                            return new C5027(interfaceC9501M31495, c11063);
                        }
                        throw new IOException("Missing MPEG-TS thumbnail read handle");
                    } catch (IOException e) {
                        C11062.m25474(c11063);
                        throw new C17766(e);
                    }
                }
            }, true), i, new C25143()));
        } catch (IOException | RuntimeException e) {
            if (C11062.m25473(c11062)) {
                return C11733.f32766;
            }
            return m46129(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11733 m46128(final MediaDataSource mediaDataSource, int i) {
        C11733 c11733M46129;
        C11733 c11733M461210;
        try {
            final long size = mediaDataSource.getSize();
            if (size < 0) {
                return C11733.f32766;
            }
            final C11062 c11062 = new C11062();
            try {
                c11733M461210 = new C11733(C24292.m53619(C13823.m31489("ts-thumbnail:" + Integer.toHexString(System.identityHashCode(mediaDataSource)), new InterfaceC7788() { // from class: l.ۜ᩸ۜ
                    @Override // p067l.InterfaceC7788
                    /* JADX INFO: renamed from: ֫ */
                    public final InterfaceC9501 mo18032() {
                        return new C6368(mediaDataSource, size, c11062);
                    }
                }, true), i, new C25143()));
            } catch (IOException | RuntimeException e) {
                if (C11062.m25473(c11062)) {
                    c11733M461210 = C11733.f32766;
                } else {
                    c11733M461210 = m46129(e);
                }
            }
            return c11733M461210;
        } catch (IOException unused) {
            c11733M46129 = C11733.f32766;
            return c11733M46129;
        } catch (RuntimeException e2) {
            c11733M46129 = m46129(e2);
            return c11733M46129;
        } finally {
            C2700.m4192(mediaDataSource);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11733 m46129(Exception exc) {
        if (!Thread.currentThread().isInterrupted()) {
            for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
                if (!(cause instanceof InterruptedIOException) && !(cause instanceof C17766)) {
                    int i = C24292.f76943;
                    if (!(cause instanceof C5517)) {
                        if (cause instanceof MediaCodec.CodecException) {
                            MediaCodec.CodecException codecException = (MediaCodec.CodecException) cause;
                            if (codecException.isTransient() || codecException.isRecoverable()) {
                            }
                        }
                    }
                }
            }
            return C11733.f32767;
        }
        return C11733.f32766;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m46140() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS thumbnail decode was canceled");
        }
    }
}
