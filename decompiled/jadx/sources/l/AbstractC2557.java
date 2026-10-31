package l;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.ۖ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2557 extends AbstractC2975 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f8092;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11648 f8093;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8094;

    public void shutdown() {
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long m8095() {
        C11648 c11648 = this.f8093;
        if (c11648 == null || c11648.m28535()) {
            return C13132.FOREVER_NS;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m8098() {
        AbstractC6790 abstractC6790;
        C11648 c11648 = this.f8093;
        if (c11648 == null || (abstractC6790 = (AbstractC6790) c11648.m28536()) == null) {
            return false;
        }
        abstractC6790.run();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8092(AbstractC6790 abstractC6790) {
        C11648 c11648 = this.f8093;
        if (c11648 == null) {
            c11648 = new C11648();
            this.f8093 = c11648;
        }
        c11648.m28534(abstractC6790);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m8096() {
        return this.f8092 >= Blake2xsDigest.MAX_NUMBER_BLOCKS;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m8097() {
        C11648 c11648 = this.f8093;
        if (c11648 != null) {
            return c11648.m28535();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8093(boolean z) {
        this.f8092 += z ? Blake2xsDigest.MAX_NUMBER_BLOCKS : 1L;
        if (z) {
            return;
        }
        this.f8094 = true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m8094() {
        long j = this.f8092 - Blake2xsDigest.MAX_NUMBER_BLOCKS;
        this.f8092 = j;
        if (j <= 0 && this.f8094) {
            shutdown();
        }
    }
}
