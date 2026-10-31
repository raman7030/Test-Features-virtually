.class public final Ll/ۘ᩸ۜ;
.super Ljava/lang/Object;
.source "H74N"

# interfaces
.implements Ll/۟ܰۜ;


# instance fields
.field public final ᩶:Ll/ۡ᩸ۜ;

.field public final ᩸:Landroid/media/MediaDataSource;

.field public final ᩹:J


# direct methods
.method public constructor <init>(Landroid/media/MediaDataSource;JLl/ۡ᩸ۜ;)V
    .locals 0

    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 339
    iput-object p1, p0, Ll/ۘ᩸ۜ;->᩸:Landroid/media/MediaDataSource;

    .line 340
    iput-wide p2, p0, Ll/ۘ᩸ۜ;->᩹:J

    .line 341
    iput-object p4, p0, Ll/ۘ᩸ۜ;->᩶:Ll/ۡ᩸ۜ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final length()J
    .locals 2

    .line 346
    iget-wide v0, p0, Ll/ۘ᩸ۜ;->᩹:J

    return-wide v0
.end method

.method public final ۧ(J[BII)V
    .locals 8

    .line 352
    iget-object v0, p0, Ll/ۘ᩸ۜ;->᩶:Ll/ۡ᩸ۜ;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_2

    if-ltz p5, :cond_2

    iget-wide v1, p0, Ll/ۘ᩸ۜ;->᩹:J

    int-to-long v3, p5

    sub-long/2addr v1, v3

    cmp-long v3, p1, v1

    if-gtz v3, :cond_2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p5, :cond_1

    .line 357
    invoke-static {}, Ll/ᩴ᩸ۜ;->ۧ()V

    .line 360
    :try_start_0
    iget-object v2, p0, Ll/ۘ᩸ۜ;->᩸:Landroid/media/MediaDataSource;

    int-to-long v3, v1

    add-long/2addr v3, p1

    add-int v6, p4, v1

    sub-int v7, p5, v1

    move-object v5, p3

    invoke-virtual/range {v2 .. v7}, Landroid/media/MediaDataSource;->readAt(J[BII)I

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-lez v2, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    .line 370
    :cond_0
    invoke-static {v0}, Ll/ۡ᩸ۜ;->ۧ(Ll/ۡ᩸ۜ;)V

    .line 371
    new-instance p1, Ll/ܺ᩸ۜ;

    new-instance p2, Ljava/io/EOFException;

    const-string p3, "Unexpected end of MPEG-TS thumbnail source"

    invoke-direct {p2, p3}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ll/ܺ᩸ۜ;-><init>(Ljava/io/IOException;)V

    throw p1

    :catch_0
    move-exception p1

    .line 366
    invoke-static {v0}, Ll/ۡ᩸ۜ;->ۧ(Ll/ۡ᩸ۜ;)V

    .line 367
    new-instance p2, Ll/ܺ᩸ۜ;

    invoke-direct {p2, p1}, Ll/ܺ᩸ۜ;-><init>(Ljava/io/IOException;)V

    throw p2

    :cond_1
    return-void

    .line 353
    :cond_2
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "MPEG-TS thumbnail read exceeds source length"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
