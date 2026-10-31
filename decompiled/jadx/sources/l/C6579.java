package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۜۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6579 extends AbstractC2162 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC20691 f20282;

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ֫ */
    public final void mo14152(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6579(RunnableC20691 runnableC20691, C2346 c2346) {
        super(c2346);
        this.f20282 = runnableC20691;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14155(int i) {
        RunnableC20691 runnableC20691 = this.f20282;
        runnableC20691.f66654 = (InterfaceC17889) runnableC20691.f66650.get(i);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo14153() {
        RunnableC20691 runnableC20691 = this.f20282;
        final InterfaceC17889 interfaceC17889 = runnableC20691.f66654;
        int iMin = (int) Math.min(1048576L, interfaceC17889.getSize());
        if (iMin < 1024) {
            iMin = 1024;
        }
        final C9742 c9742 = new C9742(iMin);
        InterfaceC10405 interfaceC10405M52568 = C23852.m52568(c9742.m24728());
        runnableC20691.f66649 = interfaceC10405M52568;
        ExecutorService executorService = runnableC20691.f66651;
        final InterfaceC23094 interfaceC23094 = runnableC20691.f66652;
        runnableC20691.f66653 = executorService.submit(new Runnable() { // from class: l.᩻ۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC23094 interfaceC23095 = interfaceC23094;
                InterfaceC17889 interfaceC178810 = interfaceC17889;
                InputStream inputStreamMo12307 = C23852.m52567(c9742.m24729()).mo12307();
                try {
                    interfaceC23095.mo8530(interfaceC178810, inputStreamMo12307);
                } catch (Throwable th) {
                    C0349.m1793(inputStreamMo12307);
                    if (interfaceC23095.mo8531(th instanceof IOException ? th : new IOException(th))) {
                        return;
                    }
                    this.f75470.f20282.f66655 = true;
                }
            }
        });
        return new C23674(interfaceC10405M52568);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩹ */
    public final void mo14156() {
        RunnableC20691 runnableC20691 = this.f20282;
        InterfaceC10405 interfaceC10405 = runnableC20691.f66649;
        if (interfaceC10405 != null) {
            C0349.m1793(interfaceC10405);
            runnableC20691.f66649 = null;
        }
        Future future = runnableC20691.f66653;
        if (future != null) {
            try {
                future.get(1L, TimeUnit.HOURS);
            } catch (Exception unused) {
            }
            runnableC20691.f66653 = null;
        }
    }

    @Override // l.AbstractC2162, l.InterfaceC13883
    /* JADX INFO: renamed from: ۤ */
    public final void mo7139() {
        mo14156();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܽ */
    public final void mo14154() {
        this.f20282.f66655 = true;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        RunnableC20691 runnableC20691 = this.f20282;
        return runnableC20691.f66655 || runnableC20691.f66652.mo1526();
    }
}
