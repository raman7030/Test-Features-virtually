package p067l;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.ۖ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4799 extends AbstractC5196 {

    /* JADX INFO: renamed from: ۗ */
    public long f10882;

    /* JADX INFO: renamed from: ۙ */
    public C13439 f10883;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f10884;

    public void shutdown() {
    }

    /* JADX INFO: renamed from: ᩴ */
    public long m10127() {
        C13439 c13439 = this.f10883;
        if (c13439 == null || c13439.m30583()) {
            return C14849.FOREVER_NS;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m10130() {
        AbstractC8822 abstractC8822;
        C13439 c13439 = this.f10883;
        if (c13439 == null || (abstractC8822 = (AbstractC8822) c13439.m30584()) == null) {
            return false;
        }
        abstractC8822.run();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10124(AbstractC8822 abstractC8822) {
        C13439 c13439 = this.f10883;
        if (c13439 == null) {
            c13439 = new C13439();
            this.f10883 = c13439;
        }
        c13439.m30582(abstractC8822);
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m10128() {
        return this.f10882 >= Blake2xsDigest.MAX_NUMBER_BLOCKS;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final boolean m10129() {
        C13439 c13439 = this.f10883;
        if (c13439 != null) {
            return c13439.m30583();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10125(boolean z) {
        this.f10882 += z ? Blake2xsDigest.MAX_NUMBER_BLOCKS : 1L;
        if (z) {
            return;
        }
        this.f10884 = true;
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m10126() {
        long j = this.f10882 - Blake2xsDigest.MAX_NUMBER_BLOCKS;
        this.f10882 = j;
        if (j <= 0 && this.f10884) {
            shutdown();
        }
    }
}
