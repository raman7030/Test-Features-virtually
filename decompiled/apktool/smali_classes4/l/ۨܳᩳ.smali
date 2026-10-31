.class public final Ll/ۨܳᩳ;
.super Ll/ᩴܳᩳ;
.source "8B3M"


# instance fields
.field public final synthetic ֫֫:Lnet/sf/sevenzipjbinding/IInArchive;

.field public final synthetic ۟:Ll/ܰܳᩳ;

.field public final synthetic ۧ֫:[Lnet/sf/sevenzipjbinding/ISequentialOutStream;

.field public ܰ:Z

.field public ᩺:I


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/ܰܳᩳ;Lnet/sf/sevenzipjbinding/IInArchive;[Lnet/sf/sevenzipjbinding/ISequentialOutStream;)V
    .locals 0

    .line 58
    iput-object p2, p0, Ll/ۨܳᩳ;->۟:Ll/ܰܳᩳ;

    iput-object p3, p0, Ll/ۨܳᩳ;->֫֫:Lnet/sf/sevenzipjbinding/IInArchive;

    iput-object p4, p0, Ll/ۨܳᩳ;->ۧ֫:[Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    .line 18
    invoke-direct {p0, p1}, Ll/֨ܳᩳ;-><init>(Ll/ۗܺ᩷;)V

    const/4 p1, -0x1

    .line 68
    iput p1, p0, Ll/ۨܳᩳ;->᩺:I

    return-void
.end method


# virtual methods
.method public final cryptoGetTextPassword()Ljava/lang/String;
    .locals 3

    .line 61
    iget-object v0, p0, Ll/ۨܳᩳ;->۟:Ll/ܰܳᩳ;

    invoke-interface {v0}, Ll/ܰܳᩳ;->᩻֫()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-super {p0}, Ll/֨ܳᩳ;->cryptoGetTextPassword()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 62
    :cond_0
    invoke-interface {v0}, Ll/ܰܳᩳ;->᩸()Ljava/lang/String;

    move-result-object v1

    .line 63
    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    .line 64
    :cond_1
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Archive password interaction required"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final getStream(I)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 5

    .line 73
    iget-object v0, p0, Ll/ۨܳᩳ;->ۧ֫:[Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    iget-object v1, p0, Ll/ۨܳᩳ;->۟:Ll/ܰܳᩳ;

    invoke-interface {v1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v2

    const-string v3, "Canceled"

    if-nez v2, :cond_3

    .line 76
    iget-object v2, p0, Ll/ۨܳᩳ;->֫֫:Lnet/sf/sevenzipjbinding/IInArchive;

    sget-object v4, Lnet/sf/sevenzipjbinding/PropID;->IS_FOLDER:Lnet/sf/sevenzipjbinding/PropID;

    invoke-interface {v2, p1, v4}, Lnet/sf/sevenzipjbinding/IInArchive;->getProperty(ILnet/sf/sevenzipjbinding/PropID;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, p0, Ll/ۨܳᩳ;->ܰ:Z

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 78
    invoke-interface {v1, p1}, Ll/ܰܳᩳ;->ܳ(I)V

    return-object v4

    .line 81
    :cond_0
    invoke-interface {v1, p1}, Ll/ܰܳᩳ;->᩷(I)V

    .line 82
    invoke-interface {v1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_2

    .line 86
    :try_start_0
    invoke-interface {v1}, Ll/ܰܳᩳ;->ܳ()Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v0, v2
    :try_end_0
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_1

    return-object v4

    .line 96
    :cond_1
    new-instance v0, Ll/ۛܳᩳ;

    invoke-direct {v0, v1, p1}, Ll/ۛܳᩳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception p1

    .line 90
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_0
    move-exception p1

    .line 88
    throw p1

    .line 83
    :cond_2
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {p1, v3}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 74
    :cond_3
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {p1, v3}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setOperationResult(Lnet/sf/sevenzipjbinding/ExtractOperationResult;)V
    .locals 5

    .line 117
    iget-boolean v0, p0, Ll/ۨܳᩳ;->ܰ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 120
    :cond_0
    iget-object v0, p0, Ll/ۨܳᩳ;->ۧ֫:[Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    instance-of v3, v2, Ljava/io/Closeable;

    iget-object v4, p0, Ll/ۨܳᩳ;->۟:Ll/ܰܳᩳ;

    if-eqz v3, :cond_2

    check-cast v2, Ljava/io/Closeable;

    .line 121
    sget-object v3, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    if-ne p1, v3, :cond_1

    invoke-interface {v4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3

    if-nez v3, :cond_1

    .line 124
    :try_start_0
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 126
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 129
    :cond_1
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 133
    :cond_2
    :goto_0
    aget-object v2, v0, v1

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    .line 135
    aput-object v2, v0, v1

    const/4 v1, 0x1

    .line 138
    :cond_3
    sget-object v0, Lnet/sf/sevenzipjbinding/ExtractOperationResult;->OK:Lnet/sf/sevenzipjbinding/ExtractOperationResult;

    if-eq p1, v0, :cond_5

    if-eqz v1, :cond_4

    .line 140
    invoke-interface {v4}, Ll/ܰܳᩳ;->ۤ()V

    .line 142
    :cond_4
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 144
    :cond_5
    invoke-interface {v4}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-nez p1, :cond_6

    .line 145
    invoke-interface {v4}, Ll/ܰܳᩳ;->᩹()V

    :cond_6
    :goto_1
    return-void
.end method

.method public final ۢ(I)Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 1

    const/4 p1, 0x0

    .line 106
    iput-boolean p1, p0, Ll/ۨܳᩳ;->ܰ:Z

    .line 107
    new-instance p1, Ll/ۧ۬֫;

    const/4 v0, 0x3

    invoke-direct {p1, v0}, Ll/ۧ۬֫;-><init>(I)V

    return-object p1
.end method

.method public final ᩳ(JJ)V
    .locals 2

    .line 151
    iget-object v0, p0, Ll/ۨܳᩳ;->۟:Ll/ܰܳᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    .line 154
    invoke-static {p1, p2, p3, p4}, Ll/᩵ۛۡ;->֫(JJ)I

    move-result p1

    .line 155
    iget p2, p0, Ll/ۨܳᩳ;->᩺:I

    if-eq p1, p2, :cond_0

    .line 156
    iput p1, p0, Ll/ۨܳᩳ;->᩺:I

    .line 157
    invoke-interface {v0, p1}, Ll/ܰܳᩳ;->֫(I)V

    :cond_0
    return-void

    .line 152
    :cond_1
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p2, "Canceled"

    invoke-direct {p1, p2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ᩶֫()V
    .locals 1

    const/4 v0, 0x1

    .line 112
    iput-boolean v0, p0, Ll/ۨܳᩳ;->ܰ:Z

    return-void
.end method

.method public final ᩸֫()Z
    .locals 1

    .line 163
    invoke-super {p0}, Ll/֨ܳᩳ;->᩸֫()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۨܳᩳ;->۟:Ll/ܰܳᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
