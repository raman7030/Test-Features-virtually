package l;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: l.ܺᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: EB24 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16092 extends AbstractC14681 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ThreadPoolExecutor f49584;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14681 f49585;

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ֫ */
    public final void mo28910(C23148 c23148) {
        ThreadPoolExecutor threadPoolExecutor = this.f49584;
        try {
            this.f49585.mo28910(c23148);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // l.AbstractC14681
    /* JADX INFO: renamed from: ֫ */
    public final void mo28909(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f49584;
        try {
            this.f49585.mo28909(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public C16092(AbstractC14681 abstractC14681, ThreadPoolExecutor threadPoolExecutor) {
        this.f49585 = abstractC14681;
        this.f49584 = threadPoolExecutor;
    }
}
