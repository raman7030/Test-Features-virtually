package p067l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l.ۧ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B32G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12710 implements InterfaceC4699 {

    /* JADX INFO: renamed from: ᩸ */
    public static ExecutorService f35696;

    /* JADX INFO: renamed from: ֫ */
    public static char m29221(int i) {
        int i2 = i & 61440;
        if (i2 == 4096) {
            return 'p';
        }
        if (i2 == 8192) {
            return 'c';
        }
        if (i2 == 16384) {
            return 'd';
        }
        if (i2 == 24576) {
            return 'b';
        }
        if (i2 == 32768) {
            return '-';
        }
        if (i2 != 40960) {
            return i2 != 49152 ? '?' : 's';
        }
        return 'l';
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean[] m29226(int i) {
        return new boolean[]{(i & 256) != 0, (i & 128) != 0, (i & 64) != 0, (i & 32) != 0, (i & 16) != 0, (i & 8) != 0, (i & 4) != 0, (i & 2) != 0, (i & 1) != 0, (i & 2048) != 0, (i & 1024) != 0, (i & 512) != 0};
    }

    /* JADX INFO: renamed from: ֫ */
    public static synchronized Executor m29223() {
        if (f35696 == null) {
            String str = C5792.f14228;
            f35696 = Executors.newSingleThreadExecutor(new ThreadFactoryC17190("ExoPlayer:BackgroundExecutor"));
        }
        return f35696;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29224(Throwable th, Throwable th2) {
        C13045.m29867(th, "<this>");
        C13045.m29867(th2, "exception");
        if (th != th2) {
            C12414.f34685.mo31340(th, th2);
        }
    }

    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public void mo4126(C17613 c17613) {
        int iM31222 = ((C13731) c17613.m40106()).m31222();
        byte[] bArr = (byte[]) ((C13731) c17613.m40106()).m31229();
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ iM31222);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m29225(int i) {
        StringBuilder sb = new StringBuilder(9);
        sb.append((i & 256) != 0 ? 'r' : '-');
        sb.append((i & 128) != 0 ? 'w' : '-');
        if ((i & 2048) != 0) {
            sb.append((i & 64) != 0 ? 's' : 'S');
        } else {
            sb.append((i & 64) != 0 ? 'x' : '-');
        }
        sb.append((i & 32) != 0 ? 'r' : '-');
        sb.append((i & 16) != 0 ? 'w' : '-');
        if ((i & 1024) != 0) {
            sb.append((i & 8) != 0 ? 's' : 'S');
        } else {
            sb.append((i & 8) != 0 ? 'x' : '-');
        }
        sb.append((i & 4) == 0 ? '-' : 'r');
        sb.append((i & 2) == 0 ? '-' : 'w');
        if ((i & 512) != 0) {
            sb.append((i & 1) != 0 ? 't' : 'T');
        } else {
            sb.append((i & 1) != 0 ? 'x' : '-');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX INFO: renamed from: ֫ */
    public static int m29222(String str) {
        boolean z;
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char cCharAt6;
        char cCharAt7;
        char cCharAt8;
        if (str.length() != 9) {
            throw new IllegalArgumentException(str);
        }
        int i = 0;
        char cCharAt9 = str.charAt(0);
        boolean z2 = true;
        if (cCharAt9 != 'r') {
            z = cCharAt9 != '-';
            cCharAt = str.charAt(1);
            if (cCharAt == 'w') {
                i |= 128;
            } else if (cCharAt != '-') {
                z = true;
            }
            cCharAt2 = str.charAt(2);
            if (cCharAt2 == 's') {
                i |= 2112;
            } else if (cCharAt2 == 'S') {
                i |= 2048;
            } else if (cCharAt2 == 'x') {
                i |= 64;
            } else if (cCharAt2 != '-') {
                z = true;
            }
            cCharAt3 = str.charAt(3);
            if (cCharAt3 == 'r') {
                i |= 32;
            } else if (cCharAt3 != '-') {
                z = true;
            }
            cCharAt4 = str.charAt(4);
            if (cCharAt4 == 'w') {
                i |= 16;
            } else if (cCharAt4 != '-') {
                z = true;
            }
            cCharAt5 = str.charAt(5);
            if (cCharAt5 == 's') {
                i |= 1032;
            } else if (cCharAt5 == 'S') {
                i |= 1024;
            } else if (cCharAt5 == 'x') {
                i |= 8;
            } else if (cCharAt5 != '-') {
                z = true;
            }
            cCharAt6 = str.charAt(6);
            if (cCharAt6 == 'r') {
                i |= 4;
            } else if (cCharAt6 != '-') {
                z = true;
            }
            cCharAt7 = str.charAt(7);
            if (cCharAt7 == 'w') {
                i |= 2;
            } else if (cCharAt7 != '-') {
                z = true;
            }
            cCharAt8 = str.charAt(8);
            if (cCharAt8 == 't') {
                i |= 513;
            } else if (cCharAt8 == 'T') {
                i |= 512;
            } else {
                if (cCharAt8 == 'x') {
                    if (cCharAt8 == '-') {
                    }
                    if (z2) {
                        throw new IllegalArgumentException(str);
                    }
                    return i;
                }
                i |= 1;
            }
            z2 = z;
            if (z2) {
                return i;
            }
            throw new IllegalArgumentException(str);
        }
        i = 256;
        cCharAt = str.charAt(1);
        if (cCharAt == 'w') {
            i |= 128;
        } else if (cCharAt != '-') {
            z = true;
        }
        cCharAt2 = str.charAt(2);
        if (cCharAt2 == 's') {
            i |= 2112;
        } else if (cCharAt2 == 'S') {
            i |= 2048;
        } else if (cCharAt2 == 'x') {
            i |= 64;
        } else if (cCharAt2 != '-') {
            z = true;
        }
        cCharAt3 = str.charAt(3);
        if (cCharAt3 == 'r') {
            i |= 32;
        } else if (cCharAt3 != '-') {
            z = true;
        }
        cCharAt4 = str.charAt(4);
        if (cCharAt4 == 'w') {
            i |= 16;
        } else if (cCharAt4 != '-') {
            z = true;
        }
        cCharAt5 = str.charAt(5);
        if (cCharAt5 == 's') {
            i |= 1032;
        } else if (cCharAt5 == 'S') {
            i |= 1024;
        } else if (cCharAt5 == 'x') {
            i |= 8;
        } else if (cCharAt5 != '-') {
            z = true;
        }
        cCharAt6 = str.charAt(6);
        if (cCharAt6 == 'r') {
            i |= 4;
        } else if (cCharAt6 != '-') {
            z = true;
        }
        cCharAt7 = str.charAt(7);
        if (cCharAt7 == 'w') {
            i |= 2;
        } else if (cCharAt7 != '-') {
            z = true;
        }
        cCharAt8 = str.charAt(8);
        if (cCharAt8 == 't') {
            i |= 513;
        } else if (cCharAt8 == 'T') {
            i |= 512;
        } else {
            if (cCharAt8 == 'x') {
                if (cCharAt8 == '-') {
                }
                if (z2) {
                    return i;
                }
                throw new IllegalArgumentException(str);
            }
            i |= 1;
        }
        z2 = z;
        if (z2) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }
}
