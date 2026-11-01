package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.ۖۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8R0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4538 extends AbstractC16607 {

    /* JADX INFO: renamed from: ۘ */
    public C17277 f10166;

    /* JADX INFO: renamed from: ᩴ */
    public C8363 f10167;

    @Override // p067l.AbstractC16607
    /* JADX INFO: renamed from: ֫ */
    public final void mo9593(boolean z) {
        super.mo9593(z);
        if (z) {
            this.f10167 = null;
            this.f10166 = null;
        }
    }

    @Override // p067l.AbstractC16607
    /* JADX INFO: renamed from: ֫ */
    public final long mo9592(C19203 c19203) {
        if (c19203.m43728()[0] != -1) {
            return -1L;
        }
        int i = (c19203.m43728()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            c19203.m43724(4);
            c19203.m43722();
        }
        int iM12662 = C5681.m12662(i, c19203);
        c19203.m43730(0);
        return iM12662;
    }

    @Override // p067l.AbstractC16607
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9594(C19203 c19203, long j, C3196 c3196) {
        byte[] bArrM43728 = c19203.m43728();
        C8363 c8363 = this.f10167;
        if (c8363 == null) {
            C8363 c8364 = new C8363(bArrM43728, 17);
            this.f10167 = c8364;
            C3601 c3601M23918 = c8364.m19378(Arrays.copyOfRange(bArrM43728, 9, c19203.m43729()), null).m23918();
            c3601M23918.m6694("audio/ogg");
            c3196.f6200 = c3601M23918.m6672();
            return true;
        }
        byte b = bArrM43728[0];
        if ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) == 3) {
            C12387 c12387M34474 = C15068.m34474(c19203);
            C8363 c8363M19377 = c8363.m19377(c12387M34474);
            this.f10167 = c8363M19377;
            this.f10166 = new C17277(c8363M19377, c12387M34474);
            return true;
        }
        if (b != -1) {
            return true;
        }
        C17277 c17277 = this.f10166;
        if (c17277 != null) {
            c17277.m39127(j);
            c3196.f6201 = this.f10166;
        }
        c3196.f6200.getClass();
        return false;
    }
}
