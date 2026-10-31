package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ۗ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69SE */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3510 {
    s(am.aB, "Secure delete", 1),
    u(am.aH, "Allow undelete", 2),
    S("S", "Synchronous file updates", 8),
    D("D", "Synchronous dir updates", 65536),
    i(am.aC, "Immutable", 16),
    a(am.av, "Append only", 32),
    d("d", "No dump", 64),
    A("A", "No atime", 128),
    c(am.aF, "Compression", 4),
    E("E", "Encrypted", 2048),
    j("j", "Journal data", 16384),
    I("I", "Indexed directory", 4096),
    t(am.aI, "No tail-merging", 32768),
    T("T", "Top of dir hierarchy", WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT),
    e("e", "Extents", 524288),
    C("C", "No COW", 8388608),
    F("F", "Case-insensitive (casefold)", 1073741824),
    N("N", "Inline data in inode", 268435456),
    P("P", "Project hierarchy", 536870912),
    V("V", "Verity", 1048576);


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f11155;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f11156;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f11157;

    EnumC3510(String str, String str2, int i2) {
        this.f11157 = str;
        this.f11156 = str2;
        this.f11155 = i2;
    }
}
