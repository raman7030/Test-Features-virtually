package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ܽ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes4.dex */
public class C18396 {

    /* JADX INFO: renamed from: ֫ */
    public C19738 f54923;

    /* JADX INFO: renamed from: ۧ */
    public C18396 f54924;

    /* JADX INFO: renamed from: ܽ */
    public final String f54925;

    public C18396(String str) {
        this.f54925 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public C18396 m41873(C19067 c19067, int i, int i2, char[] cArr) {
        C18396 c18396 = new C18396(this.f54925);
        byte[] bArr = new byte[i2];
        System.arraycopy(c19067.f56879, i, bArr, 0, i2);
        C19738 c19738 = new C19738();
        c19738.f60035 = bArr;
        c19738.f60036 = i2;
        c18396.f54923 = c19738;
        return c18396;
    }

    /* JADX INFO: renamed from: ֫ */
    public C19738 m41874(C9009 c9009) {
        return this.f54923;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m41872(C8338 c8338) {
        C9009 c9009 = c8338.f22303;
        int i = 0;
        for (C18396 c18396 = this; c18396 != null; c18396 = c18396.f54924) {
            c8338.m19265(c18396.f54925);
            if (c18396.f54923 == null) {
                c18396.f54923 = c18396.m41874(c9009);
            }
            i += c18396.f54923.f60036 + 6;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m41870(C8338 c8338, int i, int i2) {
        int i3;
        if ((i & 4096) == 0 || c8338.m19262() >= 49) {
            i3 = 0;
        } else {
            c8338.m19265("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            c8338.m19265("Signature");
            i3 += 8;
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 0) {
            return i3;
        }
        c8338.m19265("Deprecated");
        return i3 + 6;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41875(C8338 c8338, C19738 c19738) {
        C9009 c9009 = c8338.f22303;
        for (C18396 c18396 = this; c18396 != null; c18396 = c18396.f54924) {
            if (c18396.f54923 == null) {
                c18396.f54923 = c18396.m41874(c9009);
            }
            C19738 c19739 = c18396.f54923;
            c19738.m44877(c8338.m19265(c18396.f54925));
            c19738.m44875(c19739.f60036);
            c19738.m44872(0, c19739.f60036, c19739.f60035);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41871(C8338 c8338, int i, int i2, C19738 c19738) {
        if ((i & 4096) != 0 && c8338.m19262() < 49) {
            c19738.m44877(c8338.m19265("Synthetic"));
            c19738.m44875(0);
        }
        if (i2 != 0) {
            c19738.m44877(c8338.m19265("Signature"));
            c19738.m44875(2);
            c19738.m44877(i2);
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c19738.m44877(c8338.m19265("Deprecated"));
            c19738.m44875(0);
        }
    }
}
