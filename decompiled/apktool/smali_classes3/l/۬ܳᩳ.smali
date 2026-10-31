.class public final Ll/۬ܳᩳ;
.super Ljava/lang/Object;
.source "4B3Z"


# direct methods
.method public static ֫(Ll/᩹ܳᩳ;Ll/ۙܳᩳ;)V
    .locals 4

    .line 33
    invoke-interface {p1}, Ll/ۙܳᩳ;->ۘ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 37
    :try_start_0
    invoke-static {}, Ll/ۖ᩻ᩳ;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 40
    invoke-static {}, Lnet/sf/sevenzipjbinding/SevenZip;->ܿ()Lnet/sf/sevenzipjbinding/IOutCreateArchive7z;

    move-result-object v2
    :try_end_0
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 41
    :try_start_1
    iget v3, p0, Ll/᩹ܳᩳ;->᩶:I

    invoke-interface {v2, v3}, Lnet/sf/sevenzipjbinding/IOutFeatureSetLevel;->setLevel(I)V

    .line 42
    iget-boolean v3, p0, Ll/᩹ܳᩳ;->᩸:Z

    invoke-interface {v2, v3}, Lnet/sf/sevenzipjbinding/IOutFeatureSetEncryptHeader;->setHeaderEncryption(Z)V

    const/4 v3, -0x1

    .line 43
    invoke-interface {v2, v3}, Lnet/sf/sevenzipjbinding/IOutFeatureSetMultithreading;->setThreadCount(I)V

    .line 44
    invoke-interface {p1}, Ll/ۙܳᩳ;->֨֫()Ll/᩵᩺᩵;

    move-result-object v1

    .line 71
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 72
    new-instance v0, Ll/᩸ܳᩳ;

    invoke-direct {v0, p1}, Ll/᩸ܳᩳ;-><init>(Ll/ۙܳᩳ;)V

    goto :goto_0

    .line 85
    :cond_0
    new-instance v3, Ll/ܶܳᩳ;

    invoke-direct {v3, p1, v0}, Ll/ܶܳᩳ;-><init>(Ll/ۙܳᩳ;Ljava/lang/String;)V

    move-object v0, v3

    .line 46
    :goto_0
    iget p0, p0, Ll/᩹ܳᩳ;->᩹:I

    invoke-interface {v2, v1, p0, v0}, Lnet/sf/sevenzipjbinding/IOutCreateArchive;->createArchive(Lnet/sf/sevenzipjbinding/ISequentialOutStream;ILnet/sf/sevenzipjbinding/IOutCreateCallback;)V
    :try_end_1
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 57
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void

    :catchall_0
    move-exception p0

    move-object v0, v1

    move-object v1, v2

    goto :goto_2

    :catch_0
    move-exception p0

    move-object v0, v1

    move-object v1, v2

    goto :goto_1

    .line 38
    :cond_1
    :try_start_2
    new-instance p0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-static {}, Ll/ۖ᩻ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Lnet/sf/sevenzipjbinding/SevenZipException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p0

    move-object v0, v1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, v1

    .line 48
    :goto_1
    :try_start_3
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz p1, :cond_4

    if-eqz v1, :cond_2

    .line 54
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 56
    :cond_2
    invoke-static {v0}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 57
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    :cond_3
    return-void

    .line 51
    :cond_4
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p0

    :goto_2
    if-eqz v1, :cond_5

    .line 54
    invoke-static {v1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 56
    :cond_5
    invoke-static {v0}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 57
    invoke-static {v0}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 59
    :cond_6
    throw p0
.end method
