package p067l;

/* JADX INFO: renamed from: l.᩸᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4W0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23198 {

    /* JADX INFO: renamed from: ֫ */
    public final int f72881;

    /* JADX INFO: renamed from: ۧ */
    public final int f72882;

    /* JADX INFO: renamed from: ܽ */
    public final String f72883;

    public C23198(String str, int i, int i2) {
        str.getClass();
        this.f72883 = str;
        this.f72882 = i;
        this.f72881 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m51680(int i) {
        int i2;
        int i3 = this.f72882;
        if (i3 >= 0 && (i2 = this.f72881) <= i && i3 <= i2) {
            String str = this.f72883;
            int iIndexOf = str.indexOf(59);
            if (iIndexOf == -1) {
                return C9196.m21157(str);
            }
            if (C9196.m21157(str.substring(0, iIndexOf))) {
                boolean z = true;
                while (z) {
                    int i4 = iIndexOf + 1;
                    int iIndexOf2 = str.indexOf(61, i4);
                    if (iIndexOf2 != -1) {
                        String strSubstring = str.substring(i4, iIndexOf2);
                        int iIndexOf3 = str.indexOf(59, iIndexOf2 + 1);
                        if (iIndexOf3 == -1) {
                            z = false;
                        }
                        if (C9196.m21157(strSubstring)) {
                            iIndexOf = iIndexOf3;
                        }
                    } else {
                        z = false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C23198.class == obj.getClass()) {
            C23198 c23198 = (C23198) obj;
            if (this.f72882 == c23198.f72882 && this.f72881 == c23198.f72881 && this.f72883.equals(c23198.f72883)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f72883.hashCode() * 31) + this.f72882) * 31) + this.f72881;
    }

    public final String toString() {
        return "Style{value='" + this.f72883 + "', start=" + this.f72882 + ", end=" + this.f72881 + '}';
    }
}
