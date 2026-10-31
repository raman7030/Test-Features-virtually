package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8NB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20978 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f67757;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f67758;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f67759;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f67760;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f67761;

    public C20978(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.f67758 = i;
        this.f67757 = i2;
        this.f67761 = i3;
        this.f67759 = iArr;
        this.f67760 = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20978.class == obj.getClass()) {
            C20978 c20978 = (C20978) obj;
            if (this.f67758 == c20978.f67758 && this.f67757 == c20978.f67757 && this.f67761 == c20978.f67761 && Arrays.equals(this.f67759, c20978.f67759) && Arrays.equals(this.f67760, c20978.f67760)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f67760) + ((Arrays.hashCode(this.f67759) + ((((((this.f67758 + 527) * 31) + this.f67757) * 31) + this.f67761) * 31)) * 31);
    }
}
