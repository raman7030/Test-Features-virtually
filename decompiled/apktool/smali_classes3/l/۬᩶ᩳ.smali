.class public final Ll/۬᩶ᩳ;
.super Ljava/lang/Object;
.source "56R4"


# direct methods
.method public static ֫(Ll/۬ۜܽ;Ll/۟᩹ᩳ;)Ll/ۗ᩶ᩳ;
    .locals 6

    .line 20
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܽ()I

    move-result v0

    const v1, -0x7d8c8e8

    const/16 v2, 0x2000

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    const/4 v0, 0x4

    .line 89
    invoke-virtual {p0, v0}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 22
    invoke-virtual {p0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    .line 23
    sget-object p1, Ll/۟᩹ᩳ;->֫:Ll/۟᩹ᩳ;

    :cond_0
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ll/۟᩹ᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 24
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    new-array p1, v3, [Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ۜ۠ᩴ;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    new-instance p1, Ll/֨۬ᩳ;

    const-wide/32 v0, 0x100000

    invoke-direct {p1, v0, v1}, Ll/֨۬ᩳ;-><init>(J)V

    invoke-static {p0, p1}, Ll/ܺ᩶ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;)Ll/ܺ᩶ᩳ;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܺ᩶ᩳ;->length()I

    move-result v0

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    new-array v0, v2, [C

    .line 27
    :goto_0
    invoke-virtual {p0, v0, v3, v2}, Ll/ܺ᩶ᩳ;->read([CII)I

    move-result v1

    const/4 v4, -0x1

    if-eq v1, v4, :cond_1

    invoke-virtual {p1, v0, v3, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 28
    :cond_1
    new-instance v0, Ll/ۗ᩶ᩳ;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ll/ܺ᩶ᩳ;->֫()I

    move-result v1

    invoke-direct {v0, p1, v1}, Ll/ۗ᩶ᩳ;-><init>(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    :try_start_2
    invoke-virtual {p0}, Ll/ܺ᩶ᩳ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catchall_0
    move-exception p1

    .line 24
    :try_start_3
    invoke-virtual {p0}, Ll/ܺ᩶ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p0

    .line 29
    new-instance p1, Ljava/io/UncheckedIOException;

    invoke-direct {p1, p0}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw p1

    .line 32
    :cond_2
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object p0

    .line 33
    new-instance p1, Ll/᩹᩶ᩳ;

    .line 37
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array v1, v0, [C

    const/4 v2, 0x0

    .line 35
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_3

    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    add-int v5, v2, v4

    .line 37
    invoke-virtual {p0, v2, v5, v1, v3}, Ljava/lang/String;->getChars(II[CI)V

    .line 38
    invoke-virtual {p1, v1, v4}, Ll/᩹᩶ᩳ;->֫([CI)V

    move v2, v5

    goto :goto_2

    .line 41
    :cond_3
    new-instance v0, Ll/ۗ᩶ᩳ;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/᩹᩶ᩳ;->֫(I)I

    move-result p1

    invoke-direct {v0, p0, p1}, Ll/ۗ᩶ᩳ;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method
