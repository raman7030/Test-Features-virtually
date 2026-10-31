package l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩺ܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes2.dex */
public final class C23056 extends AbstractC18824 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f74170;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f74171;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f74172;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13883 f74173;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f74174;

    @Override // l.AbstractC18824
    /* JADX INFO: renamed from: ᩳ */
    public final synchronized void mo28808(long j, long j2) {
        if (this.f74173.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        int iM44456 = C19277.m44456(j, j2);
        if (iM44456 != this.f74174) {
            this.f74174 = iM44456;
            this.f74173.mo14152(iM44456);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23056(InterfaceC13883 interfaceC13883, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicReference atomicReference) {
        super(null);
        this.f74173 = interfaceC13883;
        this.f74170 = atomicBoolean;
        this.f74171 = atomicBoolean2;
        this.f74172 = atomicReference;
        this.f74174 = -1;
    }

    @Override // l.AbstractC18824
    public final ISequentialOutStream getStream(int i) {
        throw new IllegalStateException("Extraction stream requested in test mode");
    }

    @Override // l.AbstractC18824
    /* JADX INFO: renamed from: ۢ */
    public final ISequentialOutStream mo28807(int i) throws SevenZipException {
        InterfaceC13883 interfaceC13883 = this.f74173;
        if (interfaceC13883.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        AtomicBoolean atomicBoolean = this.f74170;
        atomicBoolean.set(false);
        this.f74171.set(interfaceC13883.mo7138(i));
        interfaceC13883.mo14155(i);
        if (interfaceC13883.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        atomicBoolean.set(true);
        return new C7037(interfaceC13883);
    }

    @Override // l.AbstractC18824
    /* JADX INFO: renamed from: ᩶֫ */
    public final void mo28809() {
        this.f74170.set(false);
        this.f74171.set(false);
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
        AtomicReference atomicReference;
        boolean andSet = this.f74170.getAndSet(false);
        boolean andSet2 = this.f74171.getAndSet(false);
        if (extractOperationResult != ExtractOperationResult.OK) {
            C16978 c16978 = new C16978(extractOperationResult, andSet2);
            do {
                atomicReference = this.f74172;
                if (atomicReference.compareAndSet(null, c16978)) {
                    break;
                }
            } while (atomicReference.get() == null);
            throw new SevenZipException(extractOperationResult.toString());
        }
        if (andSet) {
            InterfaceC13883 interfaceC13883 = this.f74173;
            if (interfaceC13883.mo1526()) {
                return;
            }
            interfaceC13883.mo14156();
        }
    }
}
