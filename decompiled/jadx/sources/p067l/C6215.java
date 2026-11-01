package p067l;

/* JADX INFO: renamed from: l.ۘܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74I */
/* JADX INFO: loaded from: classes2.dex */
public final class C6215 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f15655;

    /* JADX INFO: renamed from: ۜ */
    public int f15658;

    /* JADX INFO: renamed from: ۢ */
    public String f15660;

    /* JADX INFO: renamed from: ۧ */
    public int f15661;

    /* JADX INFO: renamed from: ܽ */
    public int f15664;

    /* JADX INFO: renamed from: ܿ */
    public int f15665;

    /* JADX INFO: renamed from: ᩳ */
    public int f15666;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f15669;

    /* JADX INFO: renamed from: ᩻ */
    public int f15670;

    /* JADX INFO: renamed from: ܳ */
    public final C4874 f15662 = new C4874();

    /* JADX INFO: renamed from: ܺ */
    public final C4874 f15663 = new C4874();

    /* JADX INFO: renamed from: ᩴ */
    public final C4874 f15667 = new C4874();

    /* JADX INFO: renamed from: ۡ */
    public final C4874 f15659 = new C4874();

    /* JADX INFO: renamed from: ۘ */
    public final C4874 f15657 = new C4874();

    /* JADX INFO: renamed from: ۖ */
    public final C4874 f15656 = new C4874();

    /* JADX INFO: renamed from: ᩵ */
    public String f15668 = "";

    /* JADX WARN: Code duplicated, block: B:14:0x0019 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0024 A[RETURN] */
    /* JADX INFO: renamed from: ۧ */
    public static char m14069(char c, int i) {
        if (i == 1) {
            if (c == '/') {
                return '.';
            }
            return c;
        }
        if (i == 2) {
            if (c == '.') {
                return '/';
            }
            return c;
        }
        if (i == 3) {
            if (c == '/' || c == '$') {
                return '.';
            }
        } else if (i == 4 && (c == '.' || c == '/' || c == '$')) {
            return '/';
        }
        return c;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m14084(String str) {
        if (str == null) {
            str = "";
        }
        m14067(str, 0, str.length(), false);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m14082(String str) {
        if (str == null || str.length() < 2 || str.charAt(0) != 'L' || C9417.m21911(1, str) != ';') {
            m14084("");
            return false;
        }
        m14067(str, 1, str.length() - 1, true);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence m14070() {
        if (this.f15669) {
            return this.f15668;
        }
        String str = this.f15668;
        int i = this.f15665;
        int i2 = this.f15661;
        C4874 c4874 = this.f15662;
        c4874.m10338(i, i2, str);
        return c4874;
    }

    /* JADX INFO: renamed from: ۡ */
    public final CharSequence m14073() {
        if (!this.f15669 && !this.f15655) {
            return this.f15668;
        }
        String str = this.f15668;
        int i = this.f15665;
        int i2 = this.f15661;
        C4874 c4874 = this.f15667;
        c4874.m10337(i, i2, 2, str);
        return c4874;
    }

    /* JADX INFO: renamed from: ۜ */
    public final CharSequence m14072() {
        String str = this.f15668;
        int i = this.f15665;
        int i2 = this.f15661;
        C4874 c4874 = this.f15663;
        c4874.m10337(i, i2, 1, str);
        return c4874;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final CharSequence m14086() {
        String str = this.f15668;
        int i = this.f15665;
        int i2 = this.f15661;
        C4874 c4874 = this.f15659;
        c4874.m10337(i, i2, 3, str);
        return c4874;
    }

    /* JADX INFO: renamed from: ۢ */
    public final CharSequence m14074() {
        String str = this.f15668;
        int i = this.f15665 + this.f15666;
        int i2 = this.f15661;
        C4874 c4874 = this.f15657;
        c4874.m10337(i, i2, 1, str);
        return c4874;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final CharSequence m14085() {
        String str = this.f15668;
        int i = this.f15665 + this.f15666;
        int i2 = this.f15661;
        C4874 c4874 = this.f15656;
        c4874.m10337(i, i2, 3, str);
        return c4874;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m14075() {
        if (this.f15660 == null) {
            this.f15660 = m14070().toString();
        }
        return this.f15660;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m14071(String str) {
        char cCharAt;
        int i = this.f15664 + 2;
        if (str.length() == i) {
            int i2 = 0;
            while (i2 < i) {
                if (i2 == 0) {
                    cCharAt = 'L';
                } else {
                    cCharAt = i2 == this.f15664 + 1 ? ';' : this.f15668.charAt((this.f15665 + i2) - 1);
                }
                if (cCharAt == str.charAt(i2)) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m14076(String str) {
        char cCharAt;
        int i = this.f15664;
        if (1 <= i + 2 && str.length() <= i + 1) {
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = 1 + i2;
                if (i3 == 0) {
                    cCharAt = 'L';
                } else {
                    cCharAt = i3 == this.f15664 + 1 ? ';' : this.f15668.charAt((this.f15665 + i3) - 1);
                }
                if (cCharAt == str.charAt(i2)) {
                    i2 = i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m14078(String str) {
        return m14068(2, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m14080(String str) {
        return m14068(4, str);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m14077() {
        return this.f15658;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m14081() {
        return this.f15670;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m14083() {
        return this.f15666;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m14079() {
        return this.f15664;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14067(String str, int i, int i2, boolean z) {
        this.f15668 = str;
        this.f15669 = z;
        this.f15665 = i;
        this.f15661 = i2;
        this.f15664 = i2 - i;
        this.f15660 = z ? str : null;
        this.f15655 = false;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = i; i5 < i2; i5++) {
            char cCharAt = str.charAt(i5);
            int i6 = i5 - i;
            if (cCharAt == '.') {
                this.f15655 = true;
            }
            if (cCharAt == '/' || cCharAt == '.') {
                i3 = i6;
            }
            if (cCharAt == '/') {
                i4 = i6;
            }
        }
        this.f15666 = i3 + 1;
        this.f15658 = i4 >= 0 ? i4 + 2 : 0;
        this.f15670 = this.f15664 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m14068(int i, String str) {
        if (str.length() <= this.f15664) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (m14069(this.f15668.charAt(this.f15665 + i2), i) == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }
}
