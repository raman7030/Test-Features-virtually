package p067l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: renamed from: l.֫ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87ZM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3999 {

    /* JADX INFO: renamed from: ᩷ */
    public static C8349 f8709 = C8349.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ROOT);

    /* JADX INFO: renamed from: ֫ */
    public int f8710;

    /* JADX INFO: renamed from: ۜ */
    public int f8711;

    /* JADX INFO: renamed from: ܳ */
    public int f8713;

    /* JADX INFO: renamed from: ܿ */
    public int f8715;

    /* JADX INFO: renamed from: ᩳ */
    public int f8716;

    /* JADX INFO: renamed from: ᩻ */
    public long f8717;

    /* JADX INFO: renamed from: ܽ */
    public int f8714 = 0;

    /* JADX INFO: renamed from: ۧ */
    public String[] f8712 = null;

    /* JADX INFO: renamed from: ۧ */
    public static C3999 m7967(C17823 c17823) {
        int iM40464;
        C3999 c3999 = new C3999();
        int iM40465 = c17823.m40464();
        c3999.f8714 = iM40465;
        if ((iM40465 & 1) != 0) {
            c3999.f8717 = ((((long) c17823.m40464()) & 4294967295L) << 32) | (4294967295L & ((long) c17823.m40464()));
        }
        if ((c3999.f8714 & 2) != 0) {
            c3999.f8711 = c17823.m40464();
            c3999.f8716 = c17823.m40464();
        }
        if ((c3999.f8714 & 4) != 0) {
            c3999.f8713 = c17823.m40464();
        }
        if ((c3999.f8714 & 8) != 0) {
            c3999.f8710 = c17823.m40464();
        }
        if ((c3999.f8714 & 8) != 0) {
            c3999.f8715 = c17823.m40464();
        }
        if ((c3999.f8714 & Integer.MIN_VALUE) != 0 && (iM40464 = c17823.m40464()) > 0) {
            c3999.f8712 = new String[iM40464 * 2];
            for (int i = 0; i < iM40464; i++) {
                String[] strArr = c3999.f8712;
                int i2 = i * 2;
                byte[] bArrM40471 = c17823.m40471();
                byte[] bArr = C20764.f65273;
                int length = bArrM40471.length;
                Charset charset = StandardCharsets.UTF_8;
                strArr[i2] = new String(bArrM40471, 0, length, charset);
                byte[] bArrM40472 = c17823.m40471();
                c3999.f8712[i2 + 1] = new String(bArrM40472, 0, bArrM40472.length, charset);
            }
        }
        return c3999;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m7976() {
        int i = this.f8714;
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
            int length2 = this.f8712.length / 2;
            if (length2 > 0) {
                for (int i2 = 0; i2 < length2; i2++) {
                    int i3 = i2 * 2;
                    length = this.f8712[i3 + 1].length() + this.f8712[i3].length() + length + 4 + 4;
                }
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7972(C17823 c17823) {
        int length;
        c17823.m40459(this.f8714);
        if ((this.f8714 & 1) != 0) {
            c17823.m40451(this.f8717);
        }
        if ((this.f8714 & 2) != 0) {
            c17823.m40459(this.f8711);
            c17823.m40459(this.f8716);
        }
        if ((this.f8714 & 4) != 0) {
            c17823.m40459(this.f8713);
        }
        if ((this.f8714 & 8) != 0) {
            c17823.m40459(this.f8710);
        }
        if ((this.f8714 & 8) != 0) {
            c17823.m40459(this.f8715);
        }
        if ((this.f8714 & Integer.MIN_VALUE) == 0 || (length = this.f8712.length / 2) <= 0) {
            return;
        }
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String str = this.f8712[i2];
            byte[] bArr = C20764.f65273;
            Charset charset = StandardCharsets.UTF_8;
            c17823.m40470(C20764.m46886(str, charset));
            c17823.m40470(C20764.m46886(this.f8712[i2 + 1], charset));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7973(int i, int i2) {
        this.f8714 |= 2;
        this.f8711 = i;
        this.f8716 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7971(int i, int i2) {
        this.f8714 |= 8;
        this.f8710 = i;
        this.f8715 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7970(int i) {
        this.f8714 |= 4;
        this.f8713 = (i & 4095) | (this.f8713 & (-4096));
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m7968(int i) {
        return (this.f8714 & 4) != 0 && (this.f8713 & 61440) == i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m7977() {
        return m7968(32768);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m7974() {
        return m7968(16384);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m7975() {
        return m7968(40960);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7969() {
        return this.f8714;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(10);
        if (m7968(16384)) {
            sb2.append('d');
        } else if (m7968(40960)) {
            sb2.append('l');
        } else {
            sb2.append('-');
        }
        if ((this.f8713 & 256) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f8713 & 128) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        int i = this.f8713;
        if ((i & 2048) != 0) {
            sb2.append('s');
        } else if ((i & 64) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        if ((this.f8713 & 32) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f8713 & 16) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        int i2 = this.f8713;
        if ((i2 & 1024) != 0) {
            sb2.append('s');
        } else if ((i2 & 8) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        if ((this.f8713 & 4) != 0) {
            sb2.append('r');
        } else {
            sb2.append('-');
        }
        if ((this.f8713 & 2) != 0) {
            sb2.append('w');
        } else {
            sb2.append('-');
        }
        if ((this.f8713 & 1) != 0) {
            sb2.append('x');
        } else {
            sb2.append('-');
        }
        sb.append(sb2.toString());
        sb.append(" ");
        sb.append(this.f8711);
        sb.append(" ");
        sb.append(this.f8716);
        sb.append(" ");
        sb.append(this.f8717);
        sb.append(" ");
        sb.append(f8709.format(C3715.ofInstant(C6398.ofEpochSecond(((long) this.f8715) & 4294967295L), AbstractC7739.systemDefault())));
        return sb.toString();
    }
}
