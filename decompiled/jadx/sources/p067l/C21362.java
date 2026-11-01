package p067l;

import net.p069sf.sevenzipjbinding.ExtractAskMode;
import net.p069sf.sevenzipjbinding.ExtractOperationResult;
import net.p069sf.sevenzipjbinding.IArchiveExtractCallback;
import net.p069sf.sevenzipjbinding.IInArchive;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.᩶ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21362 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ IInArchive f67342;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C5268 f67343;

    /* JADX INFO: renamed from: ᩶ */
    public C21841 f67344;

    /* JADX INFO: renamed from: ᩸ */
    public C6609 f67345;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f67346;

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.p069sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
    }

    @Override // net.p069sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
    }

    public C21362(C5268 c5268, IInArchive iInArchive) {
        this.f67343 = c5268;
        this.f67342 = iInArchive;
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        C5268 c5268 = this.f67343;
        if (c5268.f12397) {
            return null;
        }
        boolean zBooleanValue = ((Boolean) this.f67342.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f67346 = zBooleanValue;
        if (zBooleanValue || extractAskMode != ExtractAskMode.EXTRACT) {
            return null;
        }
        C6609 c6609 = (C6609) c5268.f12396.get(Integer.valueOf(i));
        this.f67345 = c6609;
        if (c6609 == null) {
            return null;
        }
        C21841 c21841 = new C21841(c6609.f17051);
        this.f67344 = c21841;
        return c21841;
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) {
        if (this.f67346) {
            return;
        }
        if (extractOperationResult == ExtractOperationResult.OK) {
            C9367 c9367 = new C9367(this.f67344.m49266());
            int i = this.f67345.f17049;
            if (i == 1 || i == 2) {
                C5880.m13196(this.f67345.f17048, C21265.f66851, true, new C23132(c9367));
            } else if (i == 3) {
                C5880.m13196(this.f67345.f17048, C21265.f66832, true, new C5171(3, c9367));
            } else {
                throw new RuntimeException();
            }
            synchronized (this.f67345) {
                this.f67345.notifyAll();
            }
            this.f67343.f12396.remove(Integer.valueOf(this.f67345.f17050));
            return;
        }
        C6609 c6609 = this.f67345;
        if (c6609 != null) {
            C5880.m13202(c6609.f17048);
            synchronized (this.f67345) {
                this.f67345.notifyAll();
            }
            this.f67343.f12396.remove(Integer.valueOf(this.f67345.f17050));
        }
    }
}
