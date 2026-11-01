package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩺ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8R9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24121 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f76538;

    public C24121(String str, byte[] bArr) {
        super(str);
        this.f76538 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C24121.class == obj.getClass()) {
            C24121 c24121 = (C24121) obj;
            if (this.f47841.equals(c24121.f47841) && Arrays.equals(this.f76538, c24121.f76538)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f76538) + C12832.m29411(527, 31, this.f47841);
    }
}
