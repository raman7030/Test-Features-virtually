package l;

/* JADX INFO: renamed from: l.᩵ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7T2 */
/* JADX INFO: loaded from: classes4.dex */
public class C19592 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f63283;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f63284;

    public C19592(String str) {
        this.f63284 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m45027() {
        return this.f63284;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m45026() {
        if (this.f63283 == null) {
            String str = this.f63284;
            String lowerCase = str.toLowerCase();
            this.f63283 = lowerCase;
            if (lowerCase.length() != str.length()) {
                char[] charArray = str.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                }
                this.f63283 = new String(charArray);
            }
        }
        return this.f63283;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19592) {
            return this.f63284.equals(((C19592) obj).f63284);
        }
        return false;
    }

    public final int hashCode() {
        return this.f63284.hashCode();
    }

    public final String toString() {
        return this.f63284;
    }
}
