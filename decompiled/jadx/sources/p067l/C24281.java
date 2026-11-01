package p067l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.p069sf.sevenzipjbinding.ExtractOperationResult;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩺ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes2.dex */
public final class C24281 extends AbstractC20259 {

    /* JADX INFO: renamed from: ֫֫ */
    public final /* synthetic */ AtomicBoolean f76912;

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ AtomicBoolean f76913;

    /* JADX INFO: renamed from: ۧ֫ */
    public final /* synthetic */ AtomicReference f76914;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC15563 f76915;

    /* JADX INFO: renamed from: ᩺ */
    public int f76916;

    @Override // p067l.AbstractC20259
    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void mo30855(long j, long j2) {
        if (this.f76915.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        int iM46750 = C20689.m46750(j, j2);
        if (iM46750 != this.f76916) {
            this.f76916 = iM46750;
            this.f76915.mo16033(iM46750);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24281(InterfaceC15563 interfaceC15563, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicReference atomicReference) {
        super(null);
        this.f76915 = interfaceC15563;
        this.f76912 = atomicBoolean;
        this.f76913 = atomicBoolean2;
        this.f76914 = atomicReference;
        this.f76916 = -1;
    }

    @Override // p067l.AbstractC20259
    public final ISequentialOutStream getStream(int i) {
        throw new IllegalStateException("Extraction stream requested in test mode");
    }

    @Override // p067l.AbstractC20259
    /* JADX INFO: renamed from: ۢ */
    public final ISequentialOutStream mo30854(int i) throws SevenZipException {
        InterfaceC15563 interfaceC15563 = this.f76915;
        if (interfaceC15563.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        AtomicBoolean atomicBoolean = this.f76912;
        atomicBoolean.set(false);
        this.f76913.set(interfaceC15563.mo9233(i));
        interfaceC15563.mo16036(i);
        if (interfaceC15563.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        atomicBoolean.set(true);
        return new C9057(interfaceC15563);
    }

    @Override // p067l.AbstractC20259
    /* JADX INFO: renamed from: ᩶֫ */
    public final void mo30856() {
        this.f76912.set(false);
        this.f76913.set(false);
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
        AtomicReference atomicReference;
        boolean andSet = this.f76912.getAndSet(false);
        boolean andSet2 = this.f76913.getAndSet(false);
        if (extractOperationResult != ExtractOperationResult.OK) {
            C18505 c18505 = new C18505(extractOperationResult, andSet2);
            do {
                atomicReference = this.f76914;
                if (atomicReference.compareAndSet(null, c18505)) {
                    break;
                }
            } while (atomicReference.get() == null);
            throw new SevenZipException(extractOperationResult.toString());
        }
        if (andSet) {
            InterfaceC15563 interfaceC15563 = this.f76915;
            if (interfaceC15563.mo3924()) {
                return;
            }
            interfaceC15563.mo16037();
        }
    }
}
