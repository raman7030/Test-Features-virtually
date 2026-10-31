.class public final Ll/ۨܶᩳ;
.super Ljava/lang/Object;
.source "B6QO"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩶:Ll/ۛܶᩳ;

.field public final ᩸:I

.field public final ᩹:Ll/֡ۗᩳ;


# direct methods
.method public constructor <init>(Ll/֡ۗᩳ;Ll/ۛܶᩳ;I)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ۨܶᩳ;->᩹:Ll/֡ۗᩳ;

    .line 28
    iput-object p2, p0, Ll/ۨܶᩳ;->᩶:Ll/ۛܶᩳ;

    .line 29
    iput p3, p0, Ll/ۨܶᩳ;->᩸:I

    return-void
.end method

.method public static ֫(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;I)Ll/ۨܶᩳ;
    .locals 1

    .line 108
    new-instance v0, Ll/ۨܶᩳ;

    invoke-static {p0, p1}, Ll/֡ۗᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;)Ll/֡ۗᩳ;

    move-result-object p0

    const/4 p1, 0x0

    invoke-direct {v0, p0, p1, p2}, Ll/ۨܶᩳ;-><init>(Ll/֡ۗᩳ;Ll/ۛܶᩳ;I)V

    return-object v0
.end method

.method public static ֫(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;Ll/֨۬ᩳ;ILl/ܿۖ᩷;)Ll/ۨܶᩳ;
    .locals 0

    .line 39
    invoke-static {p1, p2, p3, p4}, Ll/ۨܶᩳ;->֫(Ll/᩷۬ᩳ;Ll/֨۬ᩳ;ILl/ܿۖ᩷;)Ll/۫ܶᩳ;

    move-result-object p1

    .line 41
    :try_start_0
    invoke-static {p1}, Ll/۫ܶᩳ;->ۧ(Ll/۫ܶᩳ;)Ll/ۛܶᩳ;

    move-result-object p2

    invoke-static {p1}, Ll/۫ܶᩳ;->֫(Ll/۫ܶᩳ;)I

    move-result p3

    invoke-static {p3}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object p3

    invoke-static {p0, p2, p3}, Ll/֡ۗᩳ;->֫(Ll/᩻۬ᩳ;Ll/᩷۬ᩳ;Ljava/nio/charset/Charset;)Ll/֡ۗᩳ;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_2

    .line 42
    :try_start_1
    invoke-static {p4}, Ll/ۨܶᩳ;->֫(Ll/ܿۖ᩷;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4

    .line 44
    :try_start_2
    new-instance p2, Ll/ۨܶᩳ;

    invoke-static {p1}, Ll/۫ܶᩳ;->ۧ(Ll/۫ܶᩳ;)Ll/ۛܶᩳ;

    move-result-object p3

    invoke-static {p1}, Ll/۫ܶᩳ;->֫(Ll/۫ܶᩳ;)I

    move-result p4

    invoke-direct {p2, p0, p3, p4}, Ll/ۨܶᩳ;-><init>(Ll/֡ۗᩳ;Ll/ۛܶᩳ;I)V

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    .line 367
    :goto_0
    invoke-virtual {p0}, Ll/֡ۗᩳ;->ܽ()V

    .line 43
    throw p2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    goto :goto_1

    :catch_4
    move-exception p0

    .line 46
    :goto_1
    :try_start_3
    invoke-static {p1}, Ll/۫ܶᩳ;->ۧ(Ll/۫ܶᩳ;)Ll/ۛܶᩳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۛܶᩳ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    goto :goto_2

    :catch_5
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 47
    :goto_2
    throw p0
.end method

.method public static ֫(Ll/᩷۬ᩳ;Ll/֨۬ᩳ;ILl/ܿۖ᩷;)Ll/۫ܶᩳ;
    .locals 8

    .line 67
    instance-of v0, p3, Ll/֫᩵ᩳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 68
    :cond_0
    new-instance v0, Ll/᩺ᩴᩳ;

    invoke-direct {v0, p0, p3}, Ll/᩺ᩴᩳ;-><init>(Ll/᩷۬ᩳ;Ll/ܿۖ᩷;)V

    move-object p0, v0

    .line 74
    :goto_0
    invoke-static {p3}, Ll/ۨܶᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 75
    invoke-interface {p0}, Ll/᩷۬ᩳ;->identity()Ll/ۜ۬ᩳ;

    move-result-object v0

    const-wide/32 v1, 0x8100

    .line 145
    invoke-virtual {p1, v1, v2}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p1

    const/4 v1, 0x0

    const v2, 0x8000

    :try_start_0
    new-array v3, v2, [B

    .line 80
    invoke-static {p3}, Ll/ۨܶᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 81
    invoke-interface {p0}, Ll/᩷۬ᩳ;->֫()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v4, 0x0

    :goto_1
    const/4 v5, -0x1

    if-ge v4, v2, :cond_3

    .line 84
    :try_start_1
    invoke-static {p3}, Ll/ۨܶᩳ;->֫(Ll/ܿۖ᩷;)V

    const/16 v6, 0x400

    sub-int v7, v2, v4

    .line 85
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 86
    invoke-virtual {p0, v3, v4, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    if-ne v7, v5, :cond_1

    goto :goto_2

    :cond_1
    if-lez v7, :cond_2

    if-gt v7, v6, :cond_2

    add-int/2addr v4, v7

    goto :goto_1

    .line 88
    :cond_2
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Text input made invalid progress"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 91
    :cond_3
    :goto_2
    invoke-static {p3}, Ll/ۨܶᩳ;->֫(Ll/ܿۖ᩷;)V

    if-nez v4, :cond_4

    .line 371
    sget p2, Ll/ܳ᩷ܽ;->᩵:I

    goto :goto_4

    :cond_4
    if-eq p2, v5, :cond_5

    goto :goto_4

    .line 373
    :cond_5
    invoke-static {v4, v3}, Ll/ܽۘᩳ;->֫(I[B)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_6

    const/4 p2, -0x1

    goto :goto_3

    .line 374
    :cond_6
    invoke-static {p2}, Ll/ܳ᩷ܽ;->֫(Ljava/lang/String;)I

    move-result p2

    :goto_3
    if-ne p2, v5, :cond_7

    .line 375
    invoke-static {v4, v3}, Ll/ܳ᩷ܽ;->ۧ(I[B)I

    move-result p2

    .line 93
    :cond_7
    :goto_4
    new-instance p3, Ll/ۛܶᩳ;

    new-instance v2, Ll/ۤܶᩳ;

    invoke-direct {v2, p0, v3, v4, p1}, Ll/ۤܶᩳ;-><init>(Ljava/io/InputStream;[BILl/ۚ۬ᩳ;)V

    invoke-direct {p3, v0, v2}, Ll/ۛܶᩳ;-><init>(Ll/ۜ۬ᩳ;Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    :try_start_2
    new-instance p0, Ll/۫ܶᩳ;

    invoke-direct {p0, p3, p2}, Ll/۫ܶᩳ;-><init>(Ll/ۛܶᩳ;I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_a

    :catch_0
    move-exception p0

    goto :goto_5

    :catch_1
    move-exception p0

    goto :goto_5

    :catch_2
    move-exception p0

    :goto_5
    move-object p1, v1

    goto :goto_7

    :catch_3
    move-exception p2

    goto :goto_6

    :catch_4
    move-exception p2

    goto :goto_6

    :catch_5
    move-exception p2

    :goto_6
    move-object v1, p0

    move-object p0, p2

    goto :goto_7

    :catchall_1
    move-exception p0

    goto :goto_9

    :catch_6
    move-exception p0

    goto :goto_7

    :catch_7
    move-exception p0

    goto :goto_7

    :catch_8
    move-exception p0

    :goto_7
    if-eqz v1, :cond_8

    .line 98
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_8

    :catch_9
    move-exception p2

    .line 99
    :try_start_4
    invoke-virtual {p0, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 100
    :cond_8
    :goto_8
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_9
    move-object v1, p1

    :goto_a
    if-eqz v1, :cond_9

    .line 102
    invoke-virtual {v1}, Ll/ۚ۬ᩳ;->close()V

    .line 103
    :cond_9
    throw p0
.end method

.method public static ֫(Ll/ܿۖ᩷;)V
    .locals 1

    .line 112
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Text loading is canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/᩷۬ᩳ;Ll/֨۬ᩳ;ILl/ܿۖ᩷;)Ll/۬ܶᩳ;
    .locals 2

    .line 53
    invoke-static {p0, p1, p2, p3}, Ll/ۨܶᩳ;->֫(Ll/᩷۬ᩳ;Ll/֨۬ᩳ;ILl/ܿۖ᩷;)Ll/۫ܶᩳ;

    move-result-object p0

    .line 55
    :try_start_0
    new-instance p2, Ll/۬ܶᩳ;

    new-instance p3, Ll/۠ۙᩳ;

    invoke-static {p0}, Ll/۫ܶᩳ;->ۧ(Ll/۫ܶᩳ;)Ll/ۛܶᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛܶᩳ;->֫()Ljava/io/InputStream;

    move-result-object v0

    invoke-static {p0}, Ll/۫ܶᩳ;->֫(Ll/۫ܶᩳ;)I

    move-result v1

    .line 56
    invoke-static {v1}, Ll/ܳ᩷ܽ;->֫(I)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {p3, v0, v1, p1}, Ll/۠ۙᩳ;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;)V

    invoke-static {p0}, Ll/۫ܶᩳ;->֫(Ll/۫ܶᩳ;)I

    move-result p1

    invoke-direct {p2, p3, p1}, Ll/۬ܶᩳ;-><init>(Ll/۠ۙᩳ;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 58
    :goto_0
    :try_start_1
    invoke-static {p0}, Ll/۫ܶᩳ;->ۧ(Ll/۫ܶᩳ;)Ll/ۛܶᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۛܶᩳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    :catch_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 59
    :goto_1
    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 131
    iget-object v0, p0, Ll/ۨܶᩳ;->᩹:Ll/֡ۗᩳ;

    .line 367
    invoke-virtual {v0}, Ll/֡ۗᩳ;->ܽ()V

    .line 132
    iget-object v0, p0, Ll/ۨܶᩳ;->᩶:Ll/ۛܶᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۛܶᩳ;->close()V

    :cond_0
    return-void
.end method

.method public final ֫()Ljava/lang/Throwable;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۨܶᩳ;->᩹:Ll/֡ۗᩳ;

    invoke-virtual {v0}, Ll/֡ۗᩳ;->ᩳ()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ll/ۚۙᩳ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۨܶᩳ;->᩹:Ll/֡ۗᩳ;

    invoke-virtual {v0}, Ll/֡ۗᩳ;->ۜ()Ll/ۚۙᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/᩺ܶᩳ;
    .locals 9

    .line 116
    new-instance v8, Ll/᩺ܶᩳ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    iget v2, p0, Ll/ۨܶᩳ;->᩸:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Ll/᩺ܶᩳ;-><init>(IIZILl/ܶ᩵ܿ;Ll/۫ܽܽ;Ljava/util/Map;)V

    return-object v8
.end method

.method public final ᩳ()Ll/ᩴۗᩳ;
    .locals 6

    .line 125
    iget-object v0, p0, Ll/ۨܶᩳ;->᩹:Ll/֡ۗᩳ;

    invoke-virtual {v0}, Ll/֡ۗᩳ;->ۜ()Ll/ۚۙᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۚۙᩳ;->᩷()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    invoke-virtual {v0}, Ll/֡ۗᩳ;->᩻()Ll/ᩴۗᩳ;

    move-result-object v0

    return-object v0

    :cond_0
    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Ll/֡ۗᩳ;->֫(I)Ll/ᩴۗᩳ;

    move-result-object v0

    return-object v0
.end method
