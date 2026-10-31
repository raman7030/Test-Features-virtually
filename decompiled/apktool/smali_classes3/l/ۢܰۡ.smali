.class public final Ll/ۢܰۡ;
.super Ljava/lang/Object;
.source "G4GB"


# instance fields
.field public final ֫:Ll/ۡ᩺ۡ;

.field public ۧ:Z

.field public final synthetic ܽ:Ll/ۡܰۡ;

.field public final ᩳ:Ll/ᩳܰۡ;


# direct methods
.method public constructor <init>(Ll/ᩳܰۡ;Ll/ۡܰۡ;)V
    .locals 1

    .line 470
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۢܰۡ;->ܽ:Ll/ۡܰۡ;

    const/4 v0, 0x1

    .line 468
    iput-boolean v0, p0, Ll/ۢܰۡ;->ۧ:Z

    .line 471
    invoke-static {p2}, Ll/ۡܰۡ;->֫(Ll/ۡܰۡ;)Ll/ۡ᩺ۡ;

    move-result-object p2

    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۢܰۡ;->֫:Ll/ۡ᩺ۡ;

    .line 472
    iput-object p1, p0, Ll/ۢܰۡ;->ᩳ:Ll/ᩳܰۡ;

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 487
    iget-object v0, p0, Ll/ۢܰۡ;->֫:Ll/ۡ᩺ۡ;

    iget-wide v0, v0, Ll/ۡ᩺ۡ;->ۛ:J

    return-wide v0
.end method

.method public final ֫(Ljava/lang/String;)J
    .locals 11

    .line 494
    iget-object v0, p0, Ll/ۢܰۡ;->ܽ:Ll/ۡܰۡ;

    invoke-static {v0}, Ll/ۡܰۡ;->ᩳ(Ll/ۡܰۡ;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    .line 497
    iget-boolean v1, p0, Ll/ۢܰۡ;->ۧ:Z

    iget-object v2, p0, Ll/ۢܰۡ;->ᩳ:Ll/ᩳܰۡ;

    if-eqz v1, :cond_0

    .line 498
    invoke-virtual {v2}, Ll/ᩳܰۡ;->᩻()Ll/۠ۖܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/۠ۖܽ;->ۡ()Ll/᩻ۖܽ;

    move-result-object v1

    .line 499
    :try_start_0
    new-instance v10, Ll/۫ܰۡ;

    invoke-virtual {v1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v7

    const/4 v9, 0x0

    const-wide/16 v5, 0x0

    move-object v3, v10

    move-object v4, v1

    .line 17
    invoke-direct/range {v3 .. v9}, Ll/۫ܰۡ;-><init>(Ll/۠ۖܽ;JJZ)V

    .line 499
    invoke-virtual {v0, v10}, Ll/ۡܰۡ;->֫(Ljava/io/InputStream;)V

    .line 500
    invoke-virtual {v0}, Ll/ۡܰۡ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 501
    invoke-virtual {v1}, Ll/᩻ۖܽ;->close()V

    const/4 v1, 0x0

    .line 502
    iput-boolean v1, p0, Ll/ۢܰۡ;->ۧ:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 498
    :try_start_1
    invoke-virtual {v1}, Ll/᩻ۖܽ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1

    .line 504
    :cond_0
    :goto_1
    invoke-virtual {v2, p1}, Ll/ᩳܰۡ;->᩷(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object p1

    .line 505
    new-instance v1, Ll/ۡ᩺ۡ;

    invoke-static {v0}, Ll/ۡܰۡ;->ۧ(Ll/ۡܰۡ;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ll/ۡ᩺ۡ;-><init>(Ll/ۗ᩺ۡ;Ljava/nio/charset/Charset;)V

    .line 506
    invoke-static {v1}, Ll/ۡܰۡ;->֫(Ll/ۡ᩺ۡ;)V

    .line 507
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܺ()I

    move-result v2

    iput v2, v1, Ll/ۡ᩺ۡ;->۫:I

    .line 508
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۖ()J

    move-result-wide v2

    iget-object v4, p0, Ll/ۢܰۡ;->֫:Ll/ۡ᩺ۡ;

    iget-wide v5, v4, Ll/ۡ᩺ۡ;->ۤ:J

    add-long/2addr v2, v5

    iput-wide v2, v1, Ll/ۡ᩺ۡ;->ۛ:J

    iput-wide v2, v1, Ll/ۡ᩺ۡ;->ۨ:J

    .line 509
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v2

    iget-wide v5, v4, Ll/ۡ᩺ۡ;->ۤ:J

    add-long/2addr v2, v5

    iput-wide v2, v1, Ll/ۡ᩺ۡ;->ۤ:J

    .line 510
    invoke-static {v0}, Ll/ۡܰۡ;->ܽ(Ll/ۡܰۡ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    iget-wide v0, v1, Ll/ۡ᩺ۡ;->ۛ:J

    iget-wide v2, v4, Ll/ۡ᩺ۡ;->ۛ:J

    sub-long/2addr v0, v2

    return-wide v0

    .line 495
    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Virtual entry is not supported in split mode"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֨᩸ܿ;)V
    .locals 12

    .line 476
    iget-object v0, p0, Ll/ۢܰۡ;->ܽ:Ll/ۡܰۡ;

    iget-object v1, p0, Ll/ۢܰۡ;->ᩳ:Ll/ᩳܰۡ;

    invoke-virtual {v1}, Ll/ᩳܰۡ;->᩻()Ll/۠ۖܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/۠ۖܽ;->ۡ()Ll/᩻ۖܽ;

    move-result-object v1

    .line 477
    :try_start_0
    invoke-virtual {v1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v9

    .line 478
    new-instance v11, Ll/۫ܰۡ;

    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    move-object v2, v11

    move-object v3, v1

    move-wide v6, v9

    .line 17
    invoke-direct/range {v2 .. v8}, Ll/۫ܰۡ;-><init>(Ll/۠ۖܽ;JJZ)V

    .line 479
    invoke-virtual {v0}, Ll/ۡܰۡ;->֫()Ljava/io/OutputStream;

    move-result-object v2

    .line 480
    invoke-static {v11, v2, v9, v10, p1}, Ll/ܳ֡ܿ;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;JLl/ۚ᩸ܿ;)V

    .line 481
    invoke-virtual {v0}, Ll/ۡܰۡ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 482
    invoke-virtual {v1}, Ll/᩻ۖܽ;->close()V

    const/4 p1, 0x0

    .line 483
    iput-boolean p1, p0, Ll/ۢܰۡ;->ۧ:Z

    return-void

    :catchall_0
    move-exception p1

    .line 476
    :try_start_1
    invoke-virtual {v1}, Ll/᩻ۖܽ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method
