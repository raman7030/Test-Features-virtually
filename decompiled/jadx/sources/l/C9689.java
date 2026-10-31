package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8SO */
/* JADX INFO: loaded from: classes4.dex */
public final class C9689 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f29300;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f29301;

    public C9689(String str, byte[] bArr) {
        super("PRIV");
        this.f29300 = str;
        this.f29301 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9689.class == obj.getClass()) {
            C9689 c9689 = (C9689) obj;
            if (C11003.equals(this.f29300, c9689.f29300) && Arrays.equals(this.f29301, c9689.f29301)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f29300;
        return Arrays.hashCode(this.f29301) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // l.AbstractC14626
    public final String toString() {
        return this.f44734 + ": owner=" + this.f29300;
    }
}
