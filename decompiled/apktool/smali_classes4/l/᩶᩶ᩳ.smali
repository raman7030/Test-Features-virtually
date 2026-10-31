.class public final Ll/᩶᩶ᩳ;
.super Ljava/lang/Object;
.source "66T2"


# direct methods
.method public static ֫(Ljava/io/Reader;Ll/᩸۬ᩳ;ILl/᩹᩶ᩳ;)Ll/ۨ᩹ᩳ;
    .locals 9

    if-ltz p2, :cond_4

    .line 21
    new-instance v0, Ll/ۜ᩹ᩳ;

    invoke-direct {v0, p1}, Ll/ۜ᩹ᩳ;-><init>(Ll/᩸۬ᩳ;)V

    const/16 v1, 0x400

    .line 22
    iget v2, p1, Ll/᩸۬ᩳ;->ۗ:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 23
    new-instance v2, Ll/᩺᩹ᩳ;

    invoke-direct {v2, p1, v1}, Ll/᩺᩹ᩳ;-><init>(Ll/᩸۬ᩳ;I)V

    .line 24
    :try_start_0
    invoke-virtual {v2}, Ll/᩺᩹ᩳ;->֫()[C

    move-result-object p1

    :goto_0
    const/4 v3, 0x0

    .line 26
    invoke-virtual {p0, p1, v3, v1}, Ljava/io/Reader;->read([CII)I

    move-result v3

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    .line 27
    invoke-virtual {v0}, Ll/ۜ᩹ᩳ;->֫()Ll/ۨ᩹ᩳ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-virtual {v2}, Ll/᩺᩹ᩳ;->close()V

    return-object p0

    :cond_0
    if-lez v3, :cond_3

    if-gt v3, v1, :cond_3

    .line 29
    :try_start_1
    invoke-virtual {v0}, Ll/ۜ᩹ᩳ;->ۧ()I

    move-result v4

    int-to-long v4, v4

    int-to-long v6, v3

    add-long/2addr v4, v6

    int-to-long v6, p2

    cmp-long v8, v4, v6

    if-gtz v8, :cond_2

    if-eqz p3, :cond_1

    .line 30
    invoke-virtual {p3, p1, v3}, Ll/᩹᩶ᩳ;->֫([CI)V

    .line 31
    :cond_1
    invoke-virtual {v0, p1, v3}, Ll/ۜ᩹ᩳ;->֫([CI)V

    goto :goto_0

    .line 29
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Legacy text exceeds migration coordinate limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 28
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Legacy text reader made invalid progress"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    .line 23
    :try_start_2
    invoke-virtual {v2}, Ll/᩺᩹ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0

    .line 20
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid legacy text length limit"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
