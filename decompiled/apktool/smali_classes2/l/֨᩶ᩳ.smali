.class public final Ll/֨᩶ᩳ;
.super Ljava/io/Reader;
.source "36TA"


# instance fields
.field public final ᩶:Ll/ۨ᩶ᩳ;

.field public ᩸:Z

.field public final ᩹:Ll/ۚ۬ᩳ;


# direct methods
.method public constructor <init>(Ll/ۨ᩶ᩳ;Ll/ۚ۬ᩳ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 42
    iput-object p1, p0, Ll/֨᩶ᩳ;->᩶:Ll/ۨ᩶ᩳ;

    .line 43
    iput-object p2, p0, Ll/֨᩶ᩳ;->᩹:Ll/ۚ۬ᩳ;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ll/֨۬ᩳ;)Ll/֨᩶ᩳ;
    .locals 5

    const-wide/32 v0, 0xc000

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 25
    :try_start_0
    invoke-virtual {p1, v0, v1}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_6

    .line 26
    :try_start_1
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    const/16 v4, 0x400

    invoke-direct {v1, p0, v4}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;I)V

    const/4 v3, 0x1

    .line 28
    invoke-static {v1, p1}, Ll/ۨ᩶ᩳ;->֫(Ljava/io/InputStream;Ll/֨۬ᩳ;)Ll/ۨ᩶ᩳ;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3

    .line 29
    :try_start_2
    new-instance v1, Ll/֨᩶ᩳ;

    invoke-direct {v1, p1, v0}, Ll/֨᩶ᩳ;-><init>(Ll/ۨ᩶ᩳ;Ll/ۚ۬ᩳ;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    :goto_0
    move-object v2, p1

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_2

    :catch_4
    move-exception v1

    goto :goto_2

    :catch_5
    move-exception v1

    goto :goto_2

    :catch_6
    move-exception p1

    goto :goto_1

    :catch_7
    move-exception p1

    goto :goto_1

    :catch_8
    move-exception p1

    :goto_1
    move-object v1, p1

    move-object v0, v2

    :goto_2
    if-eqz v2, :cond_0

    .line 32
    :try_start_3
    invoke-virtual {v2}, Ll/ۨ᩶ᩳ;->close()V

    goto :goto_5

    :catchall_0
    move-exception p0

    goto :goto_4

    :catch_9
    move-exception p0

    goto :goto_3

    :cond_0
    if-nez v3, :cond_2

    .line 33
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    .line 35
    :goto_3
    :try_start_4
    invoke-virtual {v1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v0, :cond_3

    goto :goto_6

    :goto_4
    if-eqz v0, :cond_1

    .line 36
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    :cond_1
    throw p0

    :cond_2
    :goto_5
    if-eqz v0, :cond_3

    :goto_6
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    .line 37
    :cond_3
    throw v1
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 50
    iget-object v0, p0, Ll/֨᩶ᩳ;->᩹:Ll/ۚ۬ᩳ;

    iget-boolean v1, p0, Ll/֨᩶ᩳ;->᩸:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 51
    iput-boolean v1, p0, Ll/֨᩶ᩳ;->᩸:Z

    .line 52
    :try_start_0
    iget-object v1, p0, Ll/֨᩶ᩳ;->᩶:Ll/ۨ᩶ᩳ;

    invoke-virtual {v1}, Ll/ۨ᩶ᩳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    throw v1
.end method

.method public final read()I
    .locals 1

    .line 46
    iget-object v0, p0, Ll/֨᩶ᩳ;->᩶:Ll/ۨ᩶ᩳ;

    invoke-virtual {v0}, Ll/ۨ᩶ᩳ;->read()I

    move-result v0

    return v0
.end method

.method public final read([CII)I
    .locals 1

    .line 47
    iget-object v0, p0, Ll/֨᩶ᩳ;->᩶:Ll/ۨ᩶ᩳ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۨ᩶ᩳ;->read([CII)I

    move-result p1

    return p1
.end method
