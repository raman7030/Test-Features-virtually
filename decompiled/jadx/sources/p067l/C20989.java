package p067l;

/* JADX INFO: renamed from: l.᩵ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7T2 */
/* JADX INFO: loaded from: classes4.dex */
public class C20989 {

    /* JADX INFO: renamed from: ֫ */
    public String f65900;

    /* JADX INFO: renamed from: ۧ */
    public final String f65901;

    public C20989(String str) {
        this.f65901 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m47322() {
        return this.f65901;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m47321() {
        if (this.f65900 == null) {
            String str = this.f65901;
            String lowerCase = str.toLowerCase();
            this.f65900 = lowerCase;
            if (lowerCase.length() != str.length()) {
                char[] charArray = str.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                }
                this.f65900 = new String(charArray);
            }
        }
        return this.f65900;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20989) {
            return this.f65901.equals(((C20989) obj).f65901);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65901.hashCode();
    }

    public final String toString() {
        return this.f65901;
    }
}
