package p067l;

import net.p069sf.sevenzipjbinding.ExtractAskMode;
import net.p069sf.sevenzipjbinding.IArchiveExtractCallback;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ᩴܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB6Q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20259 extends C3494 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ۛ */
    public long f62607;

    /* JADX INFO: renamed from: ۨ */
    public long f62608;

    public abstract ISequentialOutStream getStream(int i);

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.p069sf.sevenzipjbinding.IProgress
    public final synchronized void setCompleted(long j) {
        this.f62607 = j;
        mo30855(j, this.f62608);
    }

    @Override // net.p069sf.sevenzipjbinding.IProgress
    public final synchronized void setTotal(long j) {
        this.f62608 = j;
        mo30855(this.f62607, j);
    }

    /* JADX INFO: renamed from: ۢ */
    public abstract ISequentialOutStream mo30854(int i);

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo30855(long j, long j2);

    /* JADX INFO: renamed from: ᩶֫ */
    public abstract void mo30856();

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        if (extractAskMode == ExtractAskMode.TEST) {
            return mo30854(i);
        }
        if (extractAskMode != ExtractAskMode.EXTRACT) {
            mo30856();
            return null;
        }
        return getStream(i);
    }
}
