package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8R9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22888 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f73807;

    public C22888(String str, byte[] bArr) {
        super(str);
        this.f73807 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22888.class == obj.getClass()) {
            C22888 c22888 = (C22888) obj;
            if (this.f44734.equals(c22888.f44734) && Arrays.equals(this.f73807, c22888.f73807)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f73807) + C11010.m27349(527, 31, this.f44734);
    }
}
