package p067l;

/* JADX INFO: renamed from: l.ᩳܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes4.dex */
public final class C19672 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f59805;

    /* JADX INFO: renamed from: ۧ */
    public int f59806;

    /* JADX INFO: renamed from: ܳ */
    public final String f59807;

    /* JADX INFO: renamed from: ܽ */
    public int f59808;

    /* JADX INFO: renamed from: ܿ */
    public final char[] f59809;

    /* JADX INFO: renamed from: ᩳ */
    public int f59810;

    /* JADX INFO: renamed from: ᩻ */
    public final C19001 f59811;

    public C19672(String str, C19001 c19001) {
        this.f59807 = str;
        this.f59811 = c19001;
        int[] iArr = new int[str.length()];
        int i = 0;
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            while (i > 0 && str.charAt(i) != cCharAt) {
                i = iArr[i - 1];
            }
            if (str.charAt(i) == cCharAt) {
                i++;
            }
            iArr[i2] = i;
        }
        this.f59805 = iArr;
        this.f59809 = new char[str.length()];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44681() {
        m44680(0);
        this.f59810 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44682(char c) {
        String str;
        int i = this.f59808;
        char[] cArr = this.f59809;
        if (i == cArr.length) {
            throw new IllegalStateException("Separator matcher buffer is full");
        }
        int length = this.f59806 + i;
        if (length >= cArr.length) {
            length -= cArr.length;
        }
        cArr[length] = c;
        this.f59808 = i + 1;
        while (true) {
            int i2 = this.f59810;
            str = this.f59807;
            if (i2 <= 0 || str.charAt(i2) == c) {
                break;
            }
            this.f59810 = this.f59805[this.f59810 - 1];
        }
        if (str.charAt(this.f59810) == c) {
            this.f59810++;
        }
        if (this.f59810 != str.length()) {
            m44680(this.f59810);
            return;
        }
        this.f59806 = 0;
        this.f59808 = 0;
        this.f59811.m43144(str);
        this.f59810 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m44680(int i) {
        while (true) {
            int i2 = this.f59808;
            if (i2 <= i) {
                return;
            }
            if (i2 == 0) {
                throw new IllegalStateException("Separator matcher buffer is empty");
            }
            int i3 = this.f59806;
            char[] cArr = this.f59809;
            char c = cArr[i3];
            int i4 = i3 + 1;
            if (i4 == cArr.length) {
                i4 = 0;
            }
            this.f59806 = i4;
            this.f59808 = i2 - 1;
            this.f59811.m43143(c);
        }
    }
}
