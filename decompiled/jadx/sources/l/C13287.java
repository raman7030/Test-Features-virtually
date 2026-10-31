package l;

/* JADX INFO: renamed from: l.۬ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C13287 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39777;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f39778;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f39779;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f39780;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32249(String str) {
        if (this.f39779 == null) {
            this.f39779 = str;
        }
        if ("\r\n".equals(str)) {
            this.f39778++;
        } else if ("\r".equals(str)) {
            this.f39777++;
        } else {
            this.f39780++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32248() {
        int i;
        String str = this.f39779;
        if (str == null) {
            return "\n";
        }
        String str2 = "\r\n";
        if ("\r\n".equals(str)) {
            i = this.f39778;
        } else if ("\r".equals(str)) {
            i = this.f39777;
        } else {
            i = this.f39780;
        }
        int i2 = this.f39780;
        if (i2 > i) {
            str = "\n";
            i = i2;
        }
        int i3 = this.f39778;
        if (i3 > i) {
            i = i3;
        } else {
            str2 = str;
        }
        return this.f39777 > i ? "\r" : str2;
    }
}
