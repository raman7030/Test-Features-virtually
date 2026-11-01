package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8NB */
/* JADX INFO: loaded from: classes5.dex */
public final class C22306 extends AbstractC16269 {

    /* JADX INFO: renamed from: ۧ */
    public final int f70443;

    /* JADX INFO: renamed from: ܳ */
    public final int f70444;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f70445;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f70446;

    /* JADX INFO: renamed from: ᩳ */
    public final int f70447;

    public C22306(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.f70444 = i;
        this.f70443 = i2;
        this.f70447 = i3;
        this.f70445 = iArr;
        this.f70446 = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22306.class == obj.getClass()) {
            C22306 c22306 = (C22306) obj;
            if (this.f70444 == c22306.f70444 && this.f70443 == c22306.f70443 && this.f70447 == c22306.f70447 && Arrays.equals(this.f70445, c22306.f70445) && Arrays.equals(this.f70446, c22306.f70446)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f70446) + ((Arrays.hashCode(this.f70445) + ((((((this.f70444 + 527) * 31) + this.f70443) * 31) + this.f70447) * 31)) * 31);
    }
}
