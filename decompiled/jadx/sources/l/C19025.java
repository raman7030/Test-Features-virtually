package l;

import android.media.MediaCodec;
import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ᩴ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74N */
/* JADX INFO: loaded from: classes4.dex */
public final class C19025 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1315 f59936 = new C1315(500);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f59937 = Long.toHexString(System.currentTimeMillis()) + Long.toHexString(System.nanoTime());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43869(long j, String str) {
        return C12053.m29430(str) && j >= 48128 && j % 188 == 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m43871(String str) {
        return C12053.m29430(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21142 m43865(String str) {
        EnumC21142 enumC21142;
        C1315 c1315 = f59936;
        synchronized (c1315) {
            enumC21142 = (EnumC21142) c1315.m4553(str);
        }
        return enumC21142;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43868(String str, EnumC21142 enumC21142) {
        C1315 c1315 = f59936;
        synchronized (c1315) {
            c1315.m4554(str, enumC21142);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43859(String str, InterfaceC17889 interfaceC17889, long j) {
        if (j > 0) {
            return str;
        }
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(f59937);
        sbM15339.append(System.identityHashCode(interfaceC17889));
        return C14460.m34530(sbM15339.toString()).toLowerCase();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21142 m43864(InputStream inputStream) throws IOException {
        m43872();
        byte[] bArr = new byte[940];
        C22194.m49857(inputStream, bArr, 940);
        m43872();
        return m43866(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21142 m43863(MediaDataSource mediaDataSource) throws IOException {
        byte[] bArr = new byte[940];
        int i = 0;
        while (i < 940) {
            m43872();
            int at = mediaDataSource.readAt(i, bArr, i, 940 - i);
            if (at <= 0) {
                throw new EOFException("Unexpected end of MPEG-TS probe source");
            }
            i += at;
        }
        return m43866(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21142 m43866(byte[] bArr) {
        for (int i = 0; i < 188; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                if ((bArr[(i2 * 188) + i] & 255) != 71) {
                }
            }
            return EnumC21142.MPEG_TS;
        }
        return EnumC21142.NOT_MPEG_TS;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9853 m43862(AbstractC15440 abstractC15440, int i) {
        final C9147 c9147 = new C9147();
        final C12053 c12053M29428 = C12053.m29428(abstractC15440, true);
        try {
            return new C9853(C23068.m51226(C12053.m29427("ts-thumbnail-local:" + Integer.toHexString(System.identityHashCode(abstractC15440)), new InterfaceC5703() { // from class: l.ܳ᩸ۜ
                @Override // l.InterfaceC5703
                /* JADX INFO: renamed from: ֫ */
                public final InterfaceC7505 mo16113() throws IOException {
                    C12053 c12053 = c12053M29428;
                    C9147 c9148 = c9147;
                    try {
                        InterfaceC7505 interfaceC7505M29433 = c12053.m29433();
                        if (interfaceC7505M29433 != null) {
                            return new C2797(interfaceC7505M29433, c9148);
                        }
                        throw new IOException("Missing MPEG-TS thumbnail read handle");
                    } catch (IOException e) {
                        C9147.m23523(c9148);
                        throw new C16201(e);
                    }
                }
            }, true), i, new C23963()));
        } catch (IOException | RuntimeException e) {
            if (C9147.m23522(c9147)) {
                return C9853.f29813;
            }
            return m43861(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9853 m43860(final MediaDataSource mediaDataSource, int i) {
        C9853 c9853M43861;
        C9853 c9853M43862;
        try {
            final long size = mediaDataSource.getSize();
            if (size < 0) {
                return C9853.f29813;
            }
            final C9147 c9147 = new C9147();
            try {
                c9853M43862 = new C9853(C23068.m51226(C12053.m29427("ts-thumbnail:" + Integer.toHexString(System.identityHashCode(mediaDataSource)), new InterfaceC5703() { // from class: l.ۜ᩸ۜ
                    @Override // l.InterfaceC5703
                    /* JADX INFO: renamed from: ֫ */
                    public final InterfaceC7505 mo16113() {
                        return new C4208(mediaDataSource, size, c9147);
                    }
                }, true), i, new C23963()));
            } catch (IOException | RuntimeException e) {
                if (C9147.m23522(c9147)) {
                    c9853M43862 = C9853.f29813;
                } else {
                    c9853M43862 = m43861(e);
                }
            }
            return c9853M43862;
        } catch (IOException unused) {
            c9853M43861 = C9853.f29813;
            return c9853M43861;
        } catch (RuntimeException e2) {
            c9853M43861 = m43861(e2);
            return c9853M43861;
        } finally {
            C0349.m1793(mediaDataSource);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9853 m43861(Exception exc) {
        if (!Thread.currentThread().isInterrupted()) {
            for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
                if (!(cause instanceof InterruptedIOException) && !(cause instanceof C16201)) {
                    int i = C23068.f74198;
                    if (!(cause instanceof C3313)) {
                        if (cause instanceof MediaCodec.CodecException) {
                            MediaCodec.CodecException codecException = (MediaCodec.CodecException) cause;
                            if (codecException.isTransient() || codecException.isRecoverable()) {
                            }
                        }
                    }
                }
            }
            return C9853.f29814;
        }
        return C9853.f29813;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m43872() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS thumbnail decode was canceled");
        }
    }
}
