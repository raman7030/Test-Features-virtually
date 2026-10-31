package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87ZM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1716 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C6292 f5931 = C6292.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ROOT);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5932;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f5933;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f5935;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f5937;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f5938;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f5939;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5936 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String[] f5934 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1716 m5757(C16261 c16261) {
        int iM38250;
        C1716 c1716 = new C1716();
        int iM38251 = c16261.m38250();
        c1716.f5936 = iM38251;
        if ((iM38251 & 1) != 0) {
            c1716.f5939 = ((((long) c16261.m38250()) & 4294967295L) << 32) | (4294967295L & ((long) c16261.m38250()));
        }
        if ((c1716.f5936 & 2) != 0) {
            c1716.f5933 = c16261.m38250();
            c1716.f5938 = c16261.m38250();
        }
        if ((c1716.f5936 & 4) != 0) {
            c1716.f5935 = c16261.m38250();
        }
        if ((c1716.f5936 & 8) != 0) {
            c1716.f5932 = c16261.m38250();
        }
        if ((c1716.f5936 & 8) != 0) {
            c1716.f5937 = c16261.m38250();
        }
        if ((c1716.f5936 & Integer.MIN_VALUE) != 0 && (iM38250 = c16261.m38250()) > 0) {
            c1716.f5934 = new String[iM38250 * 2];
            for (int i = 0; i < iM38250; i++) {
                String[] strArr = c1716.f5934;
                int i2 = i * 2;
                byte[] bArrM38257 = c16261.m38257();
                byte[] bArr = C19356.f62660;
                int length = bArrM38257.length;
                Charset charset = StandardCharsets.UTF_8;
                strArr[i2] = new String(bArrM38257, 0, length, charset);
                byte[] bArrM38258 = c16261.m38257();
                c1716.f5934[i2 + 1] = new String(bArrM38258, 0, bArrM38258.length, charset);
            }
        }
        return c1716;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m5766() {
        int i = this.f5936;
        int length = (i & 1) != 0 ? 12 : 4;
        if ((i & 2) != 0) {
            length += 8;
        }
        if ((i & 4) != 0) {
            length += 4;
        }
        if ((i & 8) != 0) {
            length += 8;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            length += 4;
            int length2 = this.f5934.length / 2;
            if (length2 > 0) {
                for (int i2 = 0; i2 < length2; i2++) {
                    int i3 = i2 * 2;
                    length = this.f5934[i3 + 1].length() + this.f5934[i3].length() + length + 4 + 4;
                }
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5762(C16261 c16261) {
        int length;
        c16261.m38245(this.f5936);
        if ((this.f5936 & 1) != 0) {
            c16261.m38237(this.f5939);
        }
        if ((this.f5936 & 2) != 0) {
            c16261.m38245(this.f5933);
            c16261.m38245(this.f5938);
        }
        if ((this.f5936 & 4) != 0) {
            c16261.m38245(this.f5935);
        }
        if ((this.f5936 & 8) != 0) {
            c16261.m38245(this.f5932);
        }
        if ((this.f5936 & 8) != 0) {
            c16261.m38245(this.f5937);
        }
        if ((this.f5936 & Integer.MIN_VALUE) == 0 || (length = this.f5934.length / 2) <= 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String str = this.f5934[i2];
            byte[] bArr = C19356.f62660;
            Charset charset = StandardCharsets.UTF_8;
            c16261.m38256(C19356.m44592(str, charset));
            c16261.m38256(C19356.m44592(this.f5934[i2 + 1], charset));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5763(int i, int i2) {
        this.f5936 |= 2;
        this.f5933 = i;
        this.f5938 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5761(int i, int i2) {
        this.f5936 |= 8;
        this.f5932 = i;
        this.f5937 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5760(int i) {
        this.f5936 |= 4;
        this.f5935 = (i & 4095) | (this.f5935 & (-4096));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m5758(int i) {
        return (this.f5936 & 4) != 0 && (this.f5935 & 61440) == i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m5767() {
        return m5758(32768);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5764() {
        return m5758(16384);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m5765() {
        return m5758(40960);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5759() {
        return this.f5936;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        if (m5758(16384)) {
            sb2.append('d');
        } else if (m5758(40960)) {
            sb2.append('l');
        } else {
            sb2.append('-');
        }
        if ((this.f5935 & 256) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f5935 & 128) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        int i = this.f5935;
        if ((i & 2048) != 0) {
            sb2.append('s');
        } else if ((i & 64) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        if ((this.f5935 & 32) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f5935 & 16) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        int i2 = this.f5935;
        if ((i2 & 1024) != 0) {
            sb2.append('s');
        } else if ((i2 & 8) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        if ((this.f5935 & 4) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f5935 & 2) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        if ((this.f5935 & 1) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        sb.append(sb2.toString());
        sb.append(" ");
        sb.append(this.f5933);
        sb.append(" ");
        sb.append(this.f5938);
        sb.append(" ");
        sb.append(this.f5939);
        sb.append(" ");
        sb.append(f5931.format(C1416.ofInstant(C4239.ofEpochSecond(((long) this.f5937) & 4294967295L), AbstractC5650.systemDefault())));
        return sb.toString();
    }
}
