package l;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ᩴܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB6Q */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18824 extends C1184 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f59380;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f59381;

    public abstract ISequentialOutStream getStream(int i);

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final synchronized void setCompleted(long j) {
        this.f59380 = j;
        mo28808(j, this.f59381);
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final synchronized void setTotal(long j) {
        this.f59381 = j;
        mo28808(this.f59380, j);
    }

    /* JADX INFO: renamed from: ۢ */
    public abstract ISequentialOutStream mo28807(int i);

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo28808(long j, long j2);

    /* JADX INFO: renamed from: ᩶֫ */
    public abstract void mo28809();

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        if (extractAskMode == ExtractAskMode.TEST) {
            return mo28807(i);
        }
        if (extractAskMode != ExtractAskMode.EXTRACT) {
            mo28809();
            return null;
        }
        return getStream(i);
    }
}
