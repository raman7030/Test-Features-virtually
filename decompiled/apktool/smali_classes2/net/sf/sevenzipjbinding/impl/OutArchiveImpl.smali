.class public Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;
.super Ljava/lang/Object;
.source "OutArchiveImpl.java"

# interfaces
.implements Lnet/sf/sevenzipjbinding/IOutArchive;


# instance fields
.field public archiveFormat:Lnet/sf/sevenzipjbinding/ArchiveFormat;

.field public closed:Z

.field public compressionLevel:I

.field public inArchive:Lnet/sf/sevenzipjbinding/IInArchive;

.field public jbindingSession:J

.field public sevenZipArchiveInstance:J

.field public trace:Z

.field public tracePrintStream:Ljava/io/PrintStream;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 43
    iput v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->compressionLevel:I

    return-void
.end method

.method private doUpdateItems(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILnet/sf/sevenzipjbinding/IOutCreateCallback;)V
    .locals 0

    .line 108
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->applyFeatures()V

    .line 109
    invoke-direct {p0, p1, p2, p3}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->nativeUpdateItems(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILjava/lang/Object;)V

    return-void
.end method

.method private native nativeClose()V
.end method

.method private native nativeUpdateItems(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILjava/lang/Object;)V
.end method

.method private final traceMessage(Ljava/lang/String;)V
    .locals 1

    .line 130
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->trace:Z

    if-eqz v0, :cond_1

    .line 131
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->tracePrintStream:Ljava/io/PrintStream;

    if-nez v0, :cond_0

    .line 132
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void

    .line 134
    :cond_0
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public applyFeatures()V
    .locals 2

    .line 57
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->ensureOpened()V

    .line 58
    iget v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->compressionLevel:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 59
    invoke-virtual {p0, v0}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->nativeSetLevel(I)V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    .line 85
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->closed:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 88
    iput-boolean v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->closed:Z

    .line 89
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->inArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 92
    :cond_1
    invoke-direct {p0}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->nativeClose()V

    return-void
.end method

.method public createArchive(Lnet/sf/sevenzipjbinding/IOutStream;ILnet/sf/sevenzipjbinding/IOutCreateCallback;)V
    .locals 0

    .line 29
    invoke-virtual {p0, p1, p2, p3}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->createArchive(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILnet/sf/sevenzipjbinding/IOutCreateCallback;)V

    return-void
.end method

.method public createArchive(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILnet/sf/sevenzipjbinding/IOutCreateCallback;)V
    .locals 0

    .line 117
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->ensureOpened()V

    .line 118
    invoke-direct {p0, p1, p2, p3}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->doUpdateItems(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILnet/sf/sevenzipjbinding/IOutCreateCallback;)V

    return-void
.end method

.method public ensureOpened()V
    .locals 2

    .line 168
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->closed:Z

    if-nez v0, :cond_1

    .line 171
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->inArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    if-eqz v0, :cond_0

    .line 172
    check-cast v0, Lnet/sf/sevenzipjbinding/impl/InArchiveImpl;

    invoke-virtual {v0}, Lnet/sf/sevenzipjbinding/impl/InArchiveImpl;->ensureOpened()V

    :cond_0
    return-void

    .line 169
    :cond_1
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v1, "OutArchive closed"

    invoke-direct {v0, v1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public featureSetLevel(I)V
    .locals 0

    .line 53
    iput p1, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->compressionLevel:I

    return-void
.end method

.method public getArchiveFormat()Lnet/sf/sevenzipjbinding/ArchiveFormat;
    .locals 1

    .line 67
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->archiveFormat:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    return-object v0
.end method

.method public getConnectedInArchive()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1

    .line 125
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->inArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    return-object v0
.end method

.method public getTracePrintStream()Ljava/io/PrintStream;
    .locals 1

    .line 150
    iget-object v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->tracePrintStream:Ljava/io/PrintStream;

    return-object v0
.end method

.method public isTrace()Z
    .locals 1

    .line 164
    iget-boolean v0, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->trace:Z

    return v0
.end method

.method public native nativeSet7z(IIILjava/lang/String;)V
.end method

.method public native nativeSetLevel(I)V
.end method

.method public setArchiveFormat(Lnet/sf/sevenzipjbinding/ArchiveFormat;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->archiveFormat:Lnet/sf/sevenzipjbinding/ArchiveFormat;

    return-void
.end method

.method public setInArchive(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->inArchive:Lnet/sf/sevenzipjbinding/IInArchive;

    return-void
.end method

.method public setLevel(I)V
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->featureSetLevel(I)V

    return-void
.end method

.method public setTrace(Z)V
    .locals 0

    .line 157
    iput-boolean p1, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->trace:Z

    return-void
.end method

.method public setTracePrintStream(Ljava/io/PrintStream;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->tracePrintStream:Ljava/io/PrintStream;

    return-void
.end method

.method public updateItems(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILnet/sf/sevenzipjbinding/IOutCreateCallback;)V
    .locals 0

    .line 102
    invoke-virtual {p0}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->ensureOpened()V

    .line 103
    invoke-direct {p0, p1, p2, p3}, Lnet/sf/sevenzipjbinding/impl/OutArchiveImpl;->doUpdateItems(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILnet/sf/sevenzipjbinding/IOutCreateCallback;)V

    return-void
.end method
