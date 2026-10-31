package net.sf.sevenzipjbinding;

/* JADX INFO: loaded from: classes.dex */
public interface IOutUpdateArchive extends IOutArchiveBase {
    ArchiveFormat getArchiveFormat();

    IInArchive getConnectedInArchive();

    void updateItems(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback iOutCreateCallback);
}
