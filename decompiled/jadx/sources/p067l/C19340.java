package p067l;

/* JADX INFO: renamed from: l.ᩳۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U2T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19340 {

    /* JADX INFO: renamed from: ֫ */
    public C16870[] f57738;

    /* JADX INFO: renamed from: ۧ */
    public C5472[] f57739;

    /* JADX INFO: renamed from: ܽ */
    public final String[] f57740;

    /* JADX INFO: renamed from: ᩳ */
    public final String[] f57741;

    public C19340(C14645 c14645) {
        this.f57740 = new String[Math.min(c14645.f41810, 65535)];
        this.f57741 = new String[Math.min(c14645.f41829, 65535)];
        this.f57739 = new C5472[Math.min(c14645.f41812, 65535)];
        this.f57738 = new C16870[Math.min(c14645.f41820, 65535)];
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m44075(int i) {
        String[] strArr = this.f57740;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44078(int i, String str) {
        if (str.length() > 512) {
            return;
        }
        String[] strArr = this.f57740;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m44079(int i) {
        String[] strArr = this.f57741;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44081(int i, String str) {
        String[] strArr = this.f57741;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5472 m44080(C14645 c14645, int i) {
        C5472[] c5472Arr = this.f57739;
        if (i >= c5472Arr.length) {
            return new C5472(c14645, i);
        }
        C5472 c5472 = c5472Arr[i];
        if (c5472 != null) {
            return c5472;
        }
        C5472 c5473 = new C5472(c14645, i);
        c5472Arr[i] = c5473;
        return c5473;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16870 m44076(C14645 c14645, int i) {
        C16870[] c16870Arr = this.f57738;
        if (i >= c16870Arr.length) {
            return new C16870(c14645, i);
        }
        C16870 c16870 = c16870Arr[i];
        if (c16870 != null) {
            return c16870;
        }
        C16870 c16871 = new C16870(c14645, i);
        c16870Arr[i] = c16871;
        return c16871;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44077() {
        this.f57739 = null;
        this.f57738 = null;
    }
}
