package l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.ᩳۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17989 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f56102;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f56103;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f56104;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final SimpleDateFormat f56105;

    public C17989(String str, String str2, String str3, String str4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.f56102 = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2);
        this.f56103 = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(str3);
        this.f56105 = simpleDateFormat3;
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(str4);
        this.f56104 = simpleDateFormat4;
        simpleDateFormat.setLenient(false);
        simpleDateFormat2.setLenient(false);
        simpleDateFormat3.setLenient(false);
        simpleDateFormat4.setLenient(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m42036(long j, boolean z, boolean z2) {
        SimpleDateFormat simpleDateFormat;
        if (z) {
            if (z2) {
                simpleDateFormat = this.f56102;
            } else {
                simpleDateFormat = this.f56105;
            }
        } else if (z2) {
            simpleDateFormat = this.f56103;
        } else {
            simpleDateFormat = this.f56104;
        }
        return simpleDateFormat.format(Long.valueOf(j));
    }
}
