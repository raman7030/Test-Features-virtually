package p067l;

/* JADX INFO: renamed from: l.۬ᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C14997 {

    /* JADX INFO: renamed from: ֫ */
    public int f42844;

    /* JADX INFO: renamed from: ۧ */
    public int f42845;

    /* JADX INFO: renamed from: ܽ */
    public String f42846;

    /* JADX INFO: renamed from: ᩳ */
    public int f42847;

    /* JADX INFO: renamed from: ֫ */
    public final void m34350(String str) {
        if (this.f42846 == null) {
            this.f42846 = str;
        }
        if ("\r\n".equals(str)) {
            this.f42845++;
        } else if ("\r".equals(str)) {
            this.f42844++;
        } else {
            this.f42847++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m34349() {
        int i;
        String str = this.f42846;
        if (str == null) {
            return "\n";
        }
        String str2 = "\r\n";
        if ("\r\n".equals(str)) {
            i = this.f42845;
        } else if ("\r".equals(str)) {
            i = this.f42844;
        } else {
            i = this.f42847;
        }
        int i2 = this.f42847;
        if (i2 > i) {
            str = "\n";
            i = i2;
        }
        int i3 = this.f42845;
        if (i3 > i) {
            i = i3;
        } else {
            str2 = str;
        }
        return this.f42844 > i ? "\r" : str2;
    }
}
