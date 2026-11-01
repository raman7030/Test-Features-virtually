package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۜۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8621 extends AbstractC4424 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ RunnableC22033 f23160;

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ֫ */
    public final void mo16033(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8621(RunnableC22033 runnableC22033, C4598 c4598) {
        super(c4598);
        this.f23160 = runnableC22033;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16036(int i) {
        RunnableC22033 runnableC22033 = this.f23160;
        runnableC22033.f69336 = (InterfaceC19370) runnableC22033.f69332.get(i);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo16034() {
        RunnableC22033 runnableC22033 = this.f23160;
        final InterfaceC19370 interfaceC19370 = runnableC22033.f69336;
        int iMin = (int) Math.min(1048576L, interfaceC19370.getSize());
        if (iMin < 1024) {
            iMin = 1024;
        }
        final C11627 c11627 = new C11627(iMin);
        InterfaceC12257 interfaceC12257M54977 = C25037.m54977(c11627.m26742());
        runnableC22033.f69331 = interfaceC12257M54977;
        ExecutorService executorService = runnableC22033.f69333;
        final InterfaceC24317 interfaceC24317 = runnableC22033.f69334;
        runnableC22033.f69335 = executorService.submit(new Runnable() { // from class: l.᩻ۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC24317 interfaceC24318 = interfaceC24317;
                InterfaceC19370 interfaceC19371 = interfaceC19370;
                InputStream inputStreamMo14212 = C25037.m54976(c11627.m26743()).mo14212();
                try {
                    interfaceC24318.mo10593(interfaceC19371, inputStreamMo14212);
                } catch (Throwable th) {
                    C2700.m4192(inputStreamMo14212);
                    if (interfaceC24318.mo10594(th instanceof IOException ? th : new IOException(th))) {
                        return;
                    }
                    this.f78217.f23160.f69337 = true;
                }
            }
        });
        return new C24868(interfaceC12257M54977);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩹ */
    public final void mo16037() {
        RunnableC22033 runnableC22033 = this.f23160;
        InterfaceC12257 interfaceC12257 = runnableC22033.f69331;
        if (interfaceC12257 != null) {
            C2700.m4192(interfaceC12257);
            runnableC22033.f69331 = null;
        }
        Future future = runnableC22033.f69335;
        if (future != null) {
            try {
                future.get(1L, TimeUnit.HOURS);
            } catch (Exception unused) {
            }
            runnableC22033.f69335 = null;
        }
    }

    @Override // p067l.AbstractC4424, p067l.InterfaceC15563
    /* JADX INFO: renamed from: ۤ */
    public final void mo9234() {
        mo16037();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܽ */
    public final void mo16035() {
        this.f23160.f69337 = true;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        RunnableC22033 runnableC22033 = this.f23160;
        return runnableC22033.f69337 || runnableC22033.f69334.mo3924();
    }
}
