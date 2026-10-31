package l;

/* JADX INFO: renamed from: l.ᩳۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U2T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17858 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15259[] f54540;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C3266[] f54541;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String[] f54542;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String[] f54543;

    public C17858(C12918 c12918) {
        this.f54542 = new String[Math.min(c12918.f38769, 65535)];
        this.f54543 = new String[Math.min(c12918.f38788, 65535)];
        this.f54541 = new C3266[Math.min(c12918.f38771, 65535)];
        this.f54540 = new C15259[Math.min(c12918.f38779, 65535)];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41829(int i) {
        String[] strArr = this.f54542;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41832(int i, String str) {
        if (str.length() > 512) {
            return;
        }
        String[] strArr = this.f54542;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m41833(int i) {
        String[] strArr = this.f54543;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41835(int i, String str) {
        String[] strArr = this.f54543;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3266 m41834(C12918 c12918, int i) {
        C3266[] c3266Arr = this.f54541;
        if (i >= c3266Arr.length) {
            return new C3266(c12918, i);
        }
        C3266 c3266 = c3266Arr[i];
        if (c3266 != null) {
            return c3266;
        }
        C3266 c3267 = new C3266(c12918, i);
        c3266Arr[i] = c3267;
        return c3267;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15259 m41830(C12918 c12918, int i) {
        C15259[] c15259Arr = this.f54540;
        if (i >= c15259Arr.length) {
            return new C15259(c12918, i);
        }
        C15259 c15259 = c15259Arr[i];
        if (c15259 != null) {
            return c15259;
        }
        C15259 c152510 = new C15259(c12918, i);
        c15259Arr[i] = c152510;
        return c152510;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41831() {
        this.f54541 = null;
        this.f54540 = null;
    }
}
