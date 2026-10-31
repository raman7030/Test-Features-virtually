.class public final Ll/ۗۢۜ;
.super Ljava/io/OutputStream;
.source "K6XC"


# instance fields
.field public final ᩶:Ljava/io/FilterOutputStream;

.field public ᩸:J

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ljava/io/FilterOutputStream;)V
    .locals 1

    .line 300
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const/4 v0, 0x1

    .line 298
    iput-boolean v0, p0, Ll/ۗۢۜ;->᩹:Z

    .line 301
    iput-object p1, p0, Ll/ۗۢۜ;->᩶:Ljava/io/FilterOutputStream;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۗۢۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۗۢۜ;->᩸:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/ۗۢۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۗۢۜ;->᩹:Z

    return p0
.end method


# virtual methods
.method public final flush()V
    .locals 2

    const/4 v0, 0x0

    .line 335
    :try_start_0
    iget-object v1, p0, Ll/ۗۢۜ;->᩶:Ljava/io/FilterOutputStream;

    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 340
    iput-boolean v0, p0, Ll/ۗۢۜ;->᩹:Z

    .line 341
    throw v1

    :catch_1
    move-exception v1

    .line 337
    iput-boolean v0, p0, Ll/ۗۢۜ;->᩹:Z

    .line 338
    throw v1
.end method

.method public final write(I)V
    .locals 5

    const/4 v0, 0x0

    .line 307
    :try_start_0
    iget-object v1, p0, Ll/ۗۢۜ;->᩶:Ljava/io/FilterOutputStream;

    invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write(I)V

    .line 308
    iget-wide v1, p0, Ll/ۗۢۜ;->᩸:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۗۢۜ;->᩸:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 313
    iput-boolean v0, p0, Ll/ۗۢۜ;->᩹:Z

    .line 314
    throw p1

    :catch_1
    move-exception p1

    .line 310
    iput-boolean v0, p0, Ll/ۗۢۜ;->᩹:Z

    .line 311
    throw p1
.end method

.method public final write([BII)V
    .locals 3

    const/4 v0, 0x0

    .line 321
    :try_start_0
    iget-object v1, p0, Ll/ۗۢۜ;->᩶:Ljava/io/FilterOutputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 322
    iget-wide p1, p0, Ll/ۗۢۜ;->᩸:J

    int-to-long v1, p3

    add-long/2addr p1, v1

    iput-wide p1, p0, Ll/ۗۢۜ;->᩸:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 327
    iput-boolean v0, p0, Ll/ۗۢۜ;->᩹:Z

    .line 328
    throw p1

    :catch_1
    move-exception p1

    .line 324
    iput-boolean v0, p0, Ll/ۗۢۜ;->᩹:Z

    .line 325
    throw p1
.end method
