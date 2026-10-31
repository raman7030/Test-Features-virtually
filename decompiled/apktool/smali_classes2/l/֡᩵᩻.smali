.class public final Ll/֡᩵᩻;
.super Ljava/lang/Object;
.source "R8AK"

# interfaces
.implements Ll/֨᩷᩻;


# instance fields
.field public final ۗ:Ll/ۗᩴ᩻;

.field public final ۙ:Ll/ܰᩴ᩻;

.field public final ۬:Ll/֫᩵᩻;

.field public ᩶:Ll/ᩴ᩵᩻;

.field public ᩸:Z

.field public ᩹:J


# direct methods
.method public constructor <init>(Ll/ܳ᩵᩻;Ll/֫᩵᩻;Ll/ۗᩴ᩻;Ll/ܰᩴ᩻;)V
    .locals 0

    .line 1328
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1329
    iput-object p1, p0, Ll/֡᩵᩻;->᩶:Ll/ᩴ᩵᩻;

    .line 1330
    iput-object p2, p0, Ll/֡᩵᩻;->۬:Ll/֫᩵᩻;

    .line 1331
    iput-object p3, p0, Ll/֡᩵᩻;->ۗ:Ll/ۗᩴ᩻;

    .line 1332
    iput-object p4, p0, Ll/֡᩵᩻;->ۙ:Ll/ܰᩴ᩻;

    return-void
.end method

.method public static synthetic ֫(Ll/֡᩵᩻;[BII)Ljava/lang/Integer;
    .locals 7

    .line 1350
    iget-object v0, p0, Ll/֡᩵᩻;->ۗ:Ll/ۗᩴ᩻;

    invoke-virtual {v0}, Ll/ۗᩴ᩻;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ᩴ᩵᩻;

    iput-object v1, p0, Ll/֡᩵᩻;->᩶:Ll/ᩴ᩵᩻;

    .line 1351
    iget-wide v2, p0, Ll/֡᩵᩻;->᩹:J

    move-object v4, p1

    move v5, p2

    move v6, p3

    invoke-interface/range {v1 .. v6}, Ll/ᩴ᩵᩻;->֫(J[BII)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1397
    iget-boolean v0, p0, Ll/֡᩵᩻;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 1402
    :cond_0
    :try_start_0
    iget-object v0, p0, Ll/֡᩵᩻;->᩶:Ll/ᩴ᩵᩻;

    invoke-interface {v0}, Ll/ᩴ᩵᩻;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1407
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/֡᩵᩻;->ۙ:Ll/ܰᩴ᩻;

    invoke-virtual {v1}, Ll/ܰᩴ᩻;->run()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 1409
    invoke-static {v0, v1}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    :goto_1
    const/4 v1, 0x1

    .line 1411
    iput-boolean v1, p0, Ll/֡᩵᩻;->᩸:Z

    if-nez v0, :cond_1

    :goto_2
    return-void

    .line 1413
    :cond_1
    throw v0
.end method

.method public final read([BII)I
    .locals 7

    .line 1421
    iget-boolean v0, p0, Ll/֡᩵᩻;->᩸:Z

    if-nez v0, :cond_1

    .line 1341
    array-length v0, p1

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromIndexSize(III)I

    .line 1344
    :try_start_0
    iget-object v1, p0, Ll/֡᩵᩻;->᩶:Ll/ᩴ᩵᩻;

    iget-wide v2, p0, Ll/֡᩵᩻;->᩹:J

    move-object v4, p1

    move v5, p2

    move v6, p3

    invoke-interface/range {v1 .. v6}, Ll/ᩴ᩵᩻;->֫(J[BII)I

    move-result p1
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۧۧۘ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 1349
    new-instance v1, Ll/᩵᩵᩻;

    invoke-direct {v1, p0, p1, p2, p3}, Ll/᩵᩵᩻;-><init>(Ll/֡᩵᩻;[BII)V

    iget-object p1, p0, Ll/֡᩵᩻;->۬:Ll/֫᩵᩻;

    iget-object p1, p1, Ll/֫᩵᩻;->֫:Ll/ۙ᩵᩻;

    invoke-static {p1, v0, v1}, Ll/ۙ᩵᩻;->֫(Ll/ۙ᩵᩻;Ll/ۧۧۘ;Ll/ܺ᩵᩻;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    if-lez p1, :cond_0

    .line 1355
    iget-wide p2, p0, Ll/֡᩵᩻;->᩹:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/֡᩵᩻;->᩹:J

    :cond_0
    return p1

    :catch_1
    move-exception p1

    .line 1347
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 1422
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final seek(J)V
    .locals 0

    .line 1373
    iput-wide p1, p0, Ll/֡᩵᩻;->᩹:J

    return-void
.end method

.method public final synthetic ֫([B)I
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۚ᩷᩻;->֫(Ll/֨᩷᩻;[B)I

    move-result p1

    return p1
.end method
