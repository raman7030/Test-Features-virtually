package p067l;

import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: l.ᩳۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5R0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19465 {

    /* JADX INFO: renamed from: ֫ */
    public final SimpleDateFormat f59299;

    /* JADX INFO: renamed from: ۧ */
    public final SimpleDateFormat f59300;

    /* JADX INFO: renamed from: ܽ */
    public final SimpleDateFormat f59301;

    /* JADX INFO: renamed from: ᩳ */
    public final SimpleDateFormat f59302;

    public C19465(String str, String str2, String str3, String str4) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.f59299 = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str2);
        this.f59300 = simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(str3);
        this.f59302 = simpleDateFormat3;
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(str4);
        this.f59301 = simpleDateFormat4;
        simpleDateFormat.setLenient(false);
        simpleDateFormat2.setLenient(false);
        simpleDateFormat3.setLenient(false);
        simpleDateFormat4.setLenient(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m44286(long j, boolean z, boolean z2) {
        SimpleDateFormat simpleDateFormat;
        if (z) {
            if (z2) {
                simpleDateFormat = this.f59299;
            } else {
                simpleDateFormat = this.f59302;
            }
        } else if (z2) {
            simpleDateFormat = this.f59300;
        } else {
            simpleDateFormat = this.f59301;
        }
        return simpleDateFormat.format(Long.valueOf(j));
    }
}
