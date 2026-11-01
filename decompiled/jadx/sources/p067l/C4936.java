package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۖᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAZI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4936 {

    /* JADX INFO: renamed from: ֫ */
    public int f11236;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16964 f11237;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC16964 f11238;

    /* JADX INFO: renamed from: ܿ */
    public final C17575 f11239;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f11240;

    public C4936(C17575 c17575, AbstractC16964 abstractC16964, AbstractC16964 abstractC16965, byte[] bArr, int i) {
        this.f11239 = c17575;
        this.f11237 = abstractC16964;
        this.f11238 = abstractC16965;
        this.f11240 = bArr;
        this.f11236 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4936)) {
            return false;
        }
        C4936 c4936 = (C4936) obj;
        return this.f11239.equals(c4936.f11239) && this.f11237 == c4936.f11237 && this.f11238 == c4936.f11238 && Arrays.equals(this.f11240, c4936.f11240) && this.f11236 == c4936.f11236;
    }
}
