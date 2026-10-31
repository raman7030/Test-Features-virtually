package l;

/* JADX INFO: renamed from: l.᩻᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB99 */
/* JADX INFO: loaded from: classes.dex */
public final class C23906 extends RuntimeException {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f77295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f77296;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f77297;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f77298;

    public C23906(C6973 c6973, String str, boolean z) {
        this.f77298 = c6973.f21501;
        this.f77296 = c6973.f21500;
        this.f77297 = z;
        this.f77295 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f77297;
        String str = this.f77295;
        int i = this.f77298;
        if (z) {
            return "Parse error [" + i + ":eol] " + str;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Parse error [", ":");
        sbM32308.append(this.f77296);
        sbM32308.append("] ");
        sbM32308.append(str);
        return sbM32308.toString();
    }
}
