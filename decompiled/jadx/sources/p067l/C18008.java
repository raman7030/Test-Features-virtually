package p067l;

import java.util.concurrent.atomic.AtomicBoolean;
import net.p069sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ܽۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes5.dex */
public final class C18008 implements InterfaceC22530 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17337 f53766;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AtomicBoolean f53767;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C4598 f53768;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C10336 f53769;

    public C18008(C4598 c4598, C17337 c17337, AtomicBoolean atomicBoolean, C10336 c10336) {
        this.f53768 = c4598;
        this.f53766 = c17337;
        this.f53767 = atomicBoolean;
        this.f53769 = c10336;
    }

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ֫ */
    public final void mo20393(IInArchive iInArchive) {
        try {
            this.f53768.m9704(iInArchive, this.f53766);
        } catch (Throwable th) {
            C2700.m4192(iInArchive);
            throw th;
        }
    }

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ܽ */
    public final void mo20394() {
        this.f53767.set(true);
    }

    @Override // p067l.InterfaceC22530
    /* JADX INFO: renamed from: ֫ */
    public final void mo20392(AbstractC17043 abstractC17043) {
        this.f53766.m39317(abstractC17043);
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f53769.getAsBoolean();
    }
}
