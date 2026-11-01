package p067l;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܺᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17662 extends AbstractC16321 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ThreadPoolExecutor f52747;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC16321 f52748;

    @Override // p067l.AbstractC16321
    /* JADX INFO: renamed from: ֫ */
    public final void mo30959(C24368 c24368) {
        ThreadPoolExecutor threadPoolExecutor = this.f52747;
        try {
            this.f52748.mo30959(c24368);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p067l.AbstractC16321
    /* JADX INFO: renamed from: ֫ */
    public final void mo30958(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f52747;
        try {
            this.f52748.mo30958(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public C17662(AbstractC16321 abstractC16321, ThreadPoolExecutor threadPoolExecutor) {
        this.f52748 = abstractC16321;
        this.f52747 = threadPoolExecutor;
    }
}
