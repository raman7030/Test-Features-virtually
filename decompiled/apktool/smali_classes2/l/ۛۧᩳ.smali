.class public final Ll/ۛۧᩳ;
.super Ljava/lang/Object;
.source "81VV"


# direct methods
.method public static ֫(Ll/ۨ᩶᩻;)V
    .locals 0

    .line 20
    sput-object p0, Ll/ۗܽᩳ;->ܽ:Ll/ۨ᩶᩻;

    return-void
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/ۨۧᩳ;Ll/۬ۧᩳ;)V
    .locals 10

    .line 32
    invoke-virtual {p2}, Ll/ۨۧᩳ;->ᩳ()Ll/۬ܿᩳ;

    move-result-object v7

    .line 33
    invoke-virtual {p2}, Ll/ۨۧᩳ;->ܳ()Ll/۠ۧᩳ;

    move-result-object v0

    .line 34
    invoke-virtual {p2}, Ll/ۨۧᩳ;->᩻()Ljava/lang/String;

    move-result-object v3

    .line 35
    invoke-virtual {p2}, Ll/ۨۧᩳ;->ܽ()Z

    move-result p2

    .line 37
    :try_start_0
    iget-boolean v1, v0, Ll/۠ۧᩳ;->᩸:Z

    .line 38
    iget-boolean v2, v0, Ll/۠ۧᩳ;->᩹:Z

    .line 39
    iget-boolean v8, v0, Ll/۠ۧᩳ;->᩶:Z

    if-nez v1, :cond_1

    if-nez v2, :cond_1

    if-eqz v8, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_1
    :goto_0
    if-nez v2, :cond_3

    if-nez v8, :cond_3

    .line 45
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 47
    :try_start_1
    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩶()Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "AndroidManifest.xml"

    .line 48
    invoke-virtual {v0, v4}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 50
    invoke-virtual {v0, v4}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v4

    invoke-static {v4}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object v4

    invoke-static {v4}, Ll/᩹ۨۡ;->ᩳ(Ll/ܶۨۡ;)I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v5, 0x1e

    if-lt v4, v5, :cond_2

    const/4 v2, 0x1

    .line 56
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    goto :goto_2

    :catchall_0
    move-exception p0

    .line 45
    :try_start_3
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0

    :cond_3
    :goto_2
    move v9, v2

    if-eqz v1, :cond_6

    if-nez v9, :cond_4

    if-eqz v8, :cond_5

    :cond_4
    if-eqz p3, :cond_5

    .line 60
    new-instance p2, Ll/۫ۧᩳ;

    invoke-direct {p2, p3}, Ll/۫ۧᩳ;-><init>(Ll/۬ۧᩳ;)V

    move-object p3, p2

    :cond_5
    move-object v0, p0

    move-object v1, p1

    move-object v2, v7

    move v4, v9

    move v5, v8

    move-object v6, p3

    .line 62
    invoke-static/range {v0 .. v6}, Ll/ۗܽᩳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/۬ܿᩳ;Ljava/lang/String;ZZLl/۬ۧᩳ;)V

    goto/16 :goto_6

    :cond_6
    const/4 v0, 0x0

    if-eqz p3, :cond_7

    .line 65
    new-instance v1, Ll/ۤۧᩳ;

    .line 175
    invoke-direct {v1, p3}, Ll/۫ۧᩳ;-><init>(Ll/۬ۧᩳ;)V

    .line 176
    invoke-interface {p3, v9, v8}, Ll/۬ۧᩳ;->֫(ZZ)V

    .line 177
    iput-boolean v0, v1, Ll/۫ۧᩳ;->᩸:Z

    move-object p3, v1

    :cond_7
    if-eqz p2, :cond_e

    const-string p2, "r"

    .line 68
    invoke-virtual {p0, p2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    .line 69
    :try_start_5
    new-instance v1, Ll/ᩴᩳᩳ;

    invoke-direct {v1, p2}, Ll/ᩴᩳᩳ;-><init>(Ll/᩻ۖܽ;)V

    .line 70
    invoke-virtual {v1}, Ll/ᩴᩳᩳ;->᩻()Z

    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    if-nez v1, :cond_d

    .line 73
    :try_start_6
    invoke-virtual {p2}, Ll/᩻ۖܽ;->close()V

    .line 74
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 446
    :try_start_7
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 76
    :try_start_8
    new-instance v2, Ll/᩻ܽᩳ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v3

    invoke-direct {v2, v3, v4, p3}, Ll/᩻ܽᩳ;-><init>(JLl/۬ۧᩳ;)V

    const/16 p0, 0x5000

    new-array p0, p0, [B

    .line 79
    :cond_8
    invoke-virtual {p2, p0}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_9

    .line 80
    invoke-virtual {v1, p0, v0, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 81
    invoke-virtual {v2, v3}, Ll/᩻ܽᩳ;->֫(I)V

    if-eqz p3, :cond_8

    .line 82
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eqz v3, :cond_8

    .line 86
    :try_start_9
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    :try_start_a
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 98
    invoke-virtual {v7}, Ll/۬ܿᩳ;->֡()V

    return-void

    :cond_9
    if-eqz v1, :cond_a

    .line 86
    :try_start_b
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :cond_a
    :try_start_c
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    goto :goto_6

    :catchall_2
    move-exception p0

    if-eqz v1, :cond_b

    .line 74
    :try_start_d
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    :try_start_e
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_b
    :goto_3
    throw p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :catchall_4
    move-exception p0

    if-eqz p2, :cond_c

    :try_start_f
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    goto :goto_4

    :catchall_5
    move-exception p1

    :try_start_10
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_c
    :goto_4
    throw p0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 71
    :cond_d
    :try_start_11
    new-instance p0, Ll/֫ۛۡ;

    const p1, 0x7f120b45

    invoke-direct {p0, p1}, Ll/֫ۛۡ;-><init>(I)V

    throw p0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    :catchall_6
    move-exception p0

    .line 68
    :try_start_12
    invoke-virtual {p2}, Ll/᩻ۖܽ;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    goto :goto_5

    :catchall_7
    move-exception p1

    :try_start_13
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p0

    .line 88
    :cond_e
    invoke-static {p0, p1, p3}, Ll/ۗܽᩳ;->֫(Ll/ܶ᩵ܿ;Ll/ܶ᩵ܿ;Ll/۬ۧᩳ;)V

    :goto_6
    if-eqz p3, :cond_f

    .line 91
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    if-eqz p0, :cond_f

    .line 98
    invoke-virtual {v7}, Ll/۬ܿᩳ;->֡()V

    return-void

    :cond_f
    if-nez v9, :cond_10

    if-eqz v8, :cond_11

    .line 95
    :cond_10
    :try_start_14
    invoke-static {p1, v7, v9, v8, p3}, Ll/ۢᩳᩳ;->֫(Ll/ܶ᩵ܿ;Ll/۬ܿᩳ;ZZLl/۬ۧᩳ;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 98
    :cond_11
    invoke-virtual {v7}, Ll/۬ܿᩳ;->֡()V

    return-void

    :catchall_8
    move-exception p0

    invoke-virtual {v7}, Ll/۬ܿᩳ;->֡()V

    .line 99
    throw p0
.end method

.method public static ֫(Ll/᩵ۡ᩷;)V
    .locals 0

    .line 28
    sput-object p0, Ll/ۗܽᩳ;->ۧ:Ll/᩵ۡ᩷;

    return-void
.end method

.method public static ֫(Z)V
    .locals 0

    .line 24
    sput-boolean p0, Ll/ۗܽᩳ;->֫:Z

    return-void
.end method
