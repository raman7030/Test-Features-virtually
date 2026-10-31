package l;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.᩶ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19985 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f64702;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3051 f64703;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20488 f64704;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4462 f64705;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f64706;

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
    }

    public C19985(C3051 c3051, IInArchive iInArchive) {
        this.f64703 = c3051;
        this.f64702 = iInArchive;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        C3051 c3051 = this.f64703;
        if (c3051.f9596) {
            return null;
        }
        boolean zBooleanValue = ((Boolean) this.f64702.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f64706 = zBooleanValue;
        if (zBooleanValue || extractAskMode != ExtractAskMode.EXTRACT) {
            return null;
        }
        C4462 c4462 = (C4462) c3051.f9595.get(Integer.valueOf(i));
        this.f64705 = c4462;
        if (c4462 == null) {
            return null;
        }
        C20488 c20488 = new C20488(c4462.f14227);
        this.f64704 = c20488;
        return c20488;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) {
        if (this.f64706) {
            return;
        }
        if (extractOperationResult == ExtractOperationResult.OK) {
            C7364 c7364 = new C7364(this.f64704.m46943());
            int i = this.f64705.f14225;
            if (i == 1 || i == 2) {
                C3695.m11250(this.f64705.f14224, C19883.f64215, true, new C21847(c7364));
            } else if (i == 3) {
                C3695.m11250(this.f64705.f14224, C19883.f64196, true, new C2949(3, c7364));
            } else {
                throw new RuntimeException();
            }
            synchronized (this.f64705) {
                this.f64705.notifyAll();
            }
            this.f64703.f9595.remove(Integer.valueOf(this.f64705.f14226));
            return;
        }
        C4462 c4462 = this.f64705;
        if (c4462 != null) {
            C3695.m11256(c4462.f14224);
            synchronized (this.f64705) {
                this.f64705.notifyAll();
            }
            this.f64703.f9595.remove(Integer.valueOf(this.f64705.f14226));
        }
    }
}
