package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C11577 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final String f32250;

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f32251;

    public C11577(String str, byte[] bArr) {
        super("PRIV");
        this.f32250 = str;
        this.f32251 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11577.class == obj.getClass()) {
            C11577 c11577 = (C11577) obj;
            if (C12826.equals(this.f32250, c11577.f32250) && Arrays.equals(this.f32251, c11577.f32251)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f32250;
        return Arrays.hashCode(this.f32251) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // p067l.AbstractC16269
    public final String toString() {
        return this.f47841 + ": owner=" + this.f32250;
    }
}
