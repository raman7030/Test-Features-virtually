.class public final Ll/ܺܰ᩻;
.super Ljava/io/FilterInputStream;
.source "P77N"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:Ljava/io/IOException;

.field public ᩹:Ljava/lang/Error;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 0

    .line 5629
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method

.method private ֫(Ljava/io/IOException;)V
    .locals 1

    .line 5681
    iget-object v0, p0, Ll/ܺܰ᩻;->᩸:Ljava/io/IOException;

    if-nez v0, :cond_0

    .line 5682
    iput-object p1, p0, Ll/ܺܰ᩻;->᩸:Ljava/io/IOException;

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܺܰ᩻;)V
    .locals 1

    .line 5693
    iget-object v0, p0, Ll/ܺܰ᩻;->᩹:Ljava/lang/Error;

    if-nez v0, :cond_1

    .line 5696
    iget-object p0, p0, Ll/ܺܰ᩻;->᩸:Ljava/io/IOException;

    if-nez p0, :cond_0

    return-void

    .line 5697
    :cond_0
    throw p0

    .line 5694
    :cond_1
    throw v0
.end method


# virtual methods
.method public final read()I
    .locals 3

    .line 5635
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 5687
    iget-object v1, p0, Ll/ܺܰ᩻;->᩹:Ljava/lang/Error;

    if-nez v1, :cond_0

    .line 5688
    iput-object v0, p0, Ll/ܺܰ᩻;->᩹:Ljava/lang/Error;

    .line 5644
    :cond_0
    throw v0

    :catch_1
    move-exception v0

    .line 5640
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Workspace entry input failed"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v1}, Ll/ܺܰ᩻;->֫(Ljava/io/IOException;)V

    .line 5641
    throw v0

    :catch_2
    move-exception v0

    .line 5637
    invoke-direct {p0, v0}, Ll/ܺܰ᩻;->֫(Ljava/io/IOException;)V

    .line 5638
    throw v0
.end method

.method public final read([BII)I
    .locals 0

    .line 5651
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 5687
    iget-object p2, p0, Ll/ܺܰ᩻;->᩹:Ljava/lang/Error;

    if-nez p2, :cond_0

    .line 5688
    iput-object p1, p0, Ll/ܺܰ᩻;->᩹:Ljava/lang/Error;

    .line 5660
    :cond_0
    throw p1

    :catch_1
    move-exception p1

    .line 5656
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Workspace entry input failed"

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p2}, Ll/ܺܰ᩻;->֫(Ljava/io/IOException;)V

    .line 5657
    throw p1

    :catch_2
    move-exception p1

    .line 5653
    invoke-direct {p0, p1}, Ll/ܺܰ᩻;->֫(Ljava/io/IOException;)V

    .line 5654
    throw p1
.end method

.method public final skip(J)J
    .locals 1

    .line 5667
    :try_start_0
    invoke-super {p0, p1, p2}, Ljava/io/FilterInputStream;->skip(J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    .line 5687
    iget-object p2, p0, Ll/ܺܰ᩻;->᩹:Ljava/lang/Error;

    if-nez p2, :cond_0

    .line 5688
    iput-object p1, p0, Ll/ܺܰ᩻;->᩹:Ljava/lang/Error;

    .line 5676
    :cond_0
    throw p1

    :catch_1
    move-exception p1

    .line 5672
    new-instance p2, Ljava/io/IOException;

    const-string v0, "Workspace entry input failed"

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, p2}, Ll/ܺܰ᩻;->֫(Ljava/io/IOException;)V

    .line 5673
    throw p1

    :catch_2
    move-exception p1

    .line 5669
    invoke-direct {p0, p1}, Ll/ܺܰ᩻;->֫(Ljava/io/IOException;)V

    .line 5670
    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
