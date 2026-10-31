package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX INFO: renamed from: l.ܽ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes4.dex */
public class C16864 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18276 f51743;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16864 f51744;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f51745;

    public C16864(String str) {
        this.f51745 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16864 m39637(C17570 c17570, int i, int i2, char[] cArr) {
        C16864 c16864 = new C16864(this.f51745);
        byte[] bArr = new byte[i2];
        System.arraycopy(c17570.f53689, i, bArr, 0, i2);
        C18276 c18276 = new C18276();
        c18276.f56818 = bArr;
        c18276.f56819 = i2;
        c16864.f51743 = c18276;
        return c16864;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18276 m39638(C6987 c6987) {
        return this.f51743;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39636(C6281 c6281) {
        C6987 c6987 = c6281.f19440;
        int i = 0;
        for (C16864 c16864 = this; c16864 != null; c16864 = c16864.f51744) {
            c6281.m17326(c16864.f51745);
            if (c16864.f51743 == null) {
                c16864.f51743 = c16864.m39638(c6987);
            }
            i += c16864.f51743.f56819 + 6;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m39634(C6281 c6281, int i, int i2) {
        int i3;
        if ((i & 4096) == 0 || c6281.m17323() >= 49) {
            i3 = 0;
        } else {
            c6281.m17326("Synthetic");
            i3 = 6;
        }
        if (i2 != 0) {
            c6281.m17326("Signature");
            i3 += 8;
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 0) {
            return i3;
        }
        c6281.m17326("Deprecated");
        return i3 + 6;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39639(C6281 c6281, C18276 c18276) {
        C6987 c6987 = c6281.f19440;
        for (C16864 c16864 = this; c16864 != null; c16864 = c16864.f51744) {
            if (c16864.f51743 == null) {
                c16864.f51743 = c16864.m39638(c6987);
            }
            C18276 c18277 = c16864.f51743;
            c18276.m42618(c6281.m17326(c16864.f51745));
            c18276.m42616(c18277.f56819);
            c18276.m42613(0, c18277.f56819, c18277.f56818);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39635(C6281 c6281, int i, int i2, C18276 c18276) {
        if ((i & 4096) != 0 && c6281.m17323() < 49) {
            c18276.m42618(c6281.m17326("Synthetic"));
            c18276.m42616(0);
        }
        if (i2 != 0) {
            c18276.m42618(c6281.m17326("Signature"));
            c18276.m42616(2);
            c18276.m42618(i2);
        }
        if ((i & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c18276.m42618(c6281.m17326("Deprecated"));
            c18276.m42616(0);
        }
    }
}
