package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۖۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8R0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2283 extends AbstractC14982 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C15687 f7380;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C6307 f7381;

    @Override // l.AbstractC14982
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7525(boolean z) {
        super.mo7525(z);
        if (z) {
            this.f7381 = null;
            this.f7380 = null;
        }
    }

    @Override // l.AbstractC14982
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo7524(C17714 c17714) {
        if (c17714.m41482()[0] != -1) {
            return -1L;
        }
        int i = (c17714.m41482()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c17714.m41478(4);
            c17714.m41476();
        }
        int iM10667 = C3485.m10667(i, c17714);
        c17714.m41484(0);
        return iM10667;
    }

    @Override // l.AbstractC14982
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo7526(C17714 c17714, long j, C0871 c0871) {
        byte[] bArrM41482 = c17714.m41482();
        C6307 c6307 = this.f7381;
        if (c6307 == null) {
            C6307 c6308 = new C6307(bArrM41482, 17);
            this.f7381 = c6308;
            C1297 c1297M21948 = c6308.m17438(Arrays.copyOfRange(bArrM41482, 9, c17714.m41483()), null).m21948();
            c1297M21948.m4462("audio/ogg");
            c0871.f3427 = c1297M21948.m4440();
            return true;
        }
        byte b = bArrM41482[0];
        if ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) == 3) {
            C10541 c10541M32373 = C13362.m32373(c17714);
            C6307 c6307M17437 = c6307.m17437(c10541M32373);
            this.f7381 = c6307M17437;
            this.f7380 = new C15687(c6307M17437, c10541M32373);
            return true;
        }
        if (b != -1) {
            return true;
        }
        C15687 c15687 = this.f7380;
        if (c15687 != null) {
            c15687.m36961(j);
            c0871.f3428 = this.f7380;
        }
        c0871.f3427.getClass();
        return false;
    }
}
