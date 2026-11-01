package net.p069sf.sevenzipjbinding;

/* JADX INFO: loaded from: classes.dex */
public interface IArchiveExtractCallback extends IProgress {
    ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode);

    void prepareOperation(ExtractAskMode extractAskMode);

    void setOperationResult(ExtractOperationResult extractOperationResult);
}
