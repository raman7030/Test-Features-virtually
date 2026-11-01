package p067l;

/* JADX INFO: renamed from: l.ᩳ۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19542 {

    /* JADX INFO: renamed from: ֫ */
    public int f59491;

    /* JADX INFO: renamed from: ۧ */
    public String f59492;

    /* JADX INFO: renamed from: ܽ */
    public int f59493;

    /* JADX INFO: renamed from: ᩳ */
    public int f59494;

    public C19542(String str) {
        int length;
        this.f59492 = str;
        if (str.charAt(0) == '<') {
            this.f59493 = 1;
            int i = 1;
            do {
                int i2 = this.f59493;
                this.f59493 = i2 + 1;
                char cCharAt = str.charAt(i2);
                if (cCharAt == '<') {
                    i++;
                } else if (cCharAt == '>') {
                    i--;
                }
            } while (i > 0);
        }
        int iIndexOf = str.indexOf(40, this.f59493);
        if (iIndexOf >= 0) {
            length = str.indexOf(41, iIndexOf);
        } else {
            length = str.length();
        }
        this.f59491 = length;
        this.f59494 = iIndexOf >= 0 ? iIndexOf + 1 : this.f59493;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m44387() {
        return this.f59494 < this.f59491;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m44388() {
        String str;
        int i = this.f59494;
        while (true) {
            int i2 = this.f59494;
            str = this.f59492;
            if (str.charAt(i2) != '[') {
                break;
            }
            this.f59494++;
        }
        int i3 = this.f59494;
        this.f59494 = i3 + 1;
        char cCharAt = str.charAt(i3);
        if (cCharAt == '<') {
            m44386();
        } else if (cCharAt == 'L' || cCharAt == 'T') {
            while (true) {
                int i4 = this.f59494;
                this.f59494 = i4 + 1;
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 == ';') {
                    break;
                }
                if (cCharAt2 == '<') {
                    m44386();
                }
            }
        }
        return str.substring(i, this.f59494);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m44386() {
        int i = 1;
        do {
            int i2 = this.f59494;
            this.f59494 = i2 + 1;
            char cCharAt = this.f59492.charAt(i2);
            if (cCharAt == '<') {
                i++;
            } else if (cCharAt == '>') {
                i--;
            }
        } while (i > 0);
    }
}
