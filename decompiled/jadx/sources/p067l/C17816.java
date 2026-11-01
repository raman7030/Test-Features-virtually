package p067l;

import net.p069sf.sevenzipjbinding.ExtractAskMode;
import net.p069sf.sevenzipjbinding.ExtractOperationResult;
import net.p069sf.sevenzipjbinding.IArchiveExtractCallback;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ܺ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6A */
/* JADX INFO: loaded from: classes5.dex */
public class C17816 implements IArchiveExtractCallback {

    /* JADX INFO: renamed from: ᩸ */
    public ExtractOperationResult f53170;

    /* JADX INFO: renamed from: ᩹ */
    public ISequentialOutStream f53171;

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.p069sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
    }

    @Override // net.p069sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
    }

    public C17816(ISequentialOutStream iSequentialOutStream) {
        this.f53171 = iSequentialOutStream;
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) {
        this.f53170 = extractOperationResult;
    }

    @Override // net.p069sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        if (extractAskMode.equals(ExtractAskMode.EXTRACT)) {
            return this.f53171;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ExtractOperationResult m40437() {
        return this.f53170;
    }
}
