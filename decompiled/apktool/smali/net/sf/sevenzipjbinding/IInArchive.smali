.class public interface abstract Lnet/sf/sevenzipjbinding/IInArchive;
.super Ljava/lang/Object;
.source "IInArchive.java"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract addAutoCloseable(Ljava/io/Closeable;)V
.end method

.method public abstract close()V
.end method

.method public abstract extract([IZLnet/sf/sevenzipjbinding/IArchiveExtractCallback;)V
.end method

.method public abstract extractSlow(ILnet/sf/sevenzipjbinding/ISequentialOutStream;)Lnet/sf/sevenzipjbinding/ExtractOperationResult;
.end method

.method public abstract extractSlow(ILnet/sf/sevenzipjbinding/ISequentialOutStream;Ljava/lang/String;)Lnet/sf/sevenzipjbinding/ExtractOperationResult;
.end method

.method public abstract getArchiveFormat()Lnet/sf/sevenzipjbinding/ArchiveFormat;
.end method

.method public abstract getArchiveProperty(Lnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;
.end method

.method public abstract getArchivePropertyInfo(I)Lnet/sf/sevenzipjbinding/PropertyInfo;
.end method

.method public abstract getConnectedOutArchive()Lnet/sf/sevenzipjbinding/IOutUpdateArchive;
.end method

.method public abstract getConnectedOutArchive7z()Lnet/sf/sevenzipjbinding/IOutUpdateArchive7z;
.end method

.method public abstract getConnectedOutArchiveBZip2()Lnet/sf/sevenzipjbinding/IOutUpdateArchiveBZip2;
.end method

.method public abstract getConnectedOutArchiveGZip()Lnet/sf/sevenzipjbinding/IOutUpdateArchiveGZip;
.end method

.method public abstract getConnectedOutArchiveTar()Lnet/sf/sevenzipjbinding/IOutUpdateArchiveTar;
.end method

.method public abstract getConnectedOutArchiveZip()Lnet/sf/sevenzipjbinding/IOutUpdateArchiveZip;
.end method

.method public abstract getFileName()Ljava/lang/String;
.end method

.method public abstract getFileSize()J
.end method

.method public abstract getFileTime()J
.end method

.method public abstract getNumberOfArchiveProperties()I
.end method

.method public abstract getNumberOfItems()I
.end method

.method public abstract getNumberOfProperties()I
.end method

.method public abstract getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;
.end method

.method public abstract getPropertyInfo(I)Lnet/sf/sevenzipjbinding/PropertyInfo;
.end method

.method public abstract getSimpleInterface()Ll/᩹᩺᩵;
.end method

.method public abstract getStringArchiveProperty(Lnet/sf/sevenzipjbinding/PropID;)Ljava/lang/String;
.end method

.method public abstract getStringProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/String;
.end method

.method public abstract setFileName(Ljava/lang/String;)V
.end method

.method public abstract setFileSize(J)V
.end method

.method public abstract setFileTime(J)V
.end method
