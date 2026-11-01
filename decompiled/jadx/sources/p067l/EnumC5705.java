package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0655am;

/* JADX INFO: renamed from: l.ۗ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69SE */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5705 {
    s(C0655am.f2274aB, "Secure delete", 1),
    u(C0655am.f2280aH, "Allow undelete", 2),
    S("S", "Synchronous file updates", 8),
    D("D", "Synchronous dir updates", 65536),
    i(C0655am.f2275aC, "Immutable", 16),
    a(C0655am.f2320av, "Append only", 32),
    d("d", "No dump", 64),
    A("A", "No atime", 128),
    c(C0655am.f2278aF, "Compression", 4),
    E("E", "Encrypted", 2048),
    j("j", "Journal data", 16384),
    I("I", "Indexed directory", 4096),
    t(C0655am.f2281aI, "No tail-merging", 32768),
    T("T", "Top of dir hierarchy", WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT),
    e("e", "Extents", 524288),
    C("C", "No COW", 8388608),
    F("F", "Case-insensitive (casefold)", 1073741824),
    N("N", "Inline data in inode", 268435456),
    P("P", "Project hierarchy", 536870912),
    V("V", "Verity", 1048576);


    /* JADX INFO: renamed from: ᩶ */
    public final int f13960;

    /* JADX INFO: renamed from: ᩸ */
    public final String f13961;

    /* JADX INFO: renamed from: ᩹ */
    public final String f13962;

    EnumC5705(String str, String str2, int i2) {
        this.f13962 = str;
        this.f13961 = str2;
        this.f13960 = i2;
    }
}
