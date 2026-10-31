.class public abstract Ll/ۢܽۘ;
.super Ljava/lang/Object;
.source "A9G4"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ᩶:J

.field public ᩸:[B

.field public ᩹:I


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public abstract ֫()I
.end method

.method public final ֫(Ll/֡֫ۘ;)V
    .locals 6

    const/4 v0, 0x0

    .line 67
    iput v0, p0, Ll/ۢܽۘ;->᩹:I

    .line 95
    iget-object v0, p0, Ll/ۢܽۘ;->᩸:[B

    const/high16 v1, 0x10000

    if-eqz v0, :cond_0

    array-length v0, v0

    if-eq v0, v1, :cond_1

    :cond_0
    new-array v0, v1, [B

    .line 96
    iput-object v0, p0, Ll/ۢܽۘ;->᩸:[B

    .line 98
    :cond_1
    iget-object v0, p0, Ll/ۢܽۘ;->᩸:[B

    .line 70
    :try_start_0
    invoke-virtual {p0, v0}, Ll/ۢܽۘ;->ۧ([B)I

    move-result v1

    .line 71
    invoke-virtual {p1, v1, v0}, Ll/ۤܰۖ;->֫(I[B)V

    .line 72
    iget-wide v2, p0, Ll/ۢܽۘ;->᩶:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/ۢܽۘ;->᩶:J

    .line 73
    iget p1, p0, Ll/ۢܽۘ;->᩹:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ۢܽۘ;->᩹:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 75
    new-instance v0, Ll/ۧۧۘ;

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 75
    throw v0
.end method

.method public final ֫(Ll/֡֫ۘ;I)V
    .locals 7

    const/4 v0, 0x0

    .line 52
    iput v0, p0, Ll/ۢܽۘ;->᩹:I

    .line 95
    iget-object v1, p0, Ll/ۢܽۘ;->᩸:[B

    const/high16 v2, 0x10000

    if-eqz v1, :cond_0

    array-length v1, v1

    if-eq v1, v2, :cond_1

    :cond_0
    new-array v1, v2, [B

    .line 96
    iput-object v1, p0, Ll/ۢܽۘ;->᩸:[B

    .line 98
    :cond_1
    iget-object v1, p0, Ll/ۢܽۘ;->᩸:[B

    :goto_0
    if-ge v0, p2, :cond_2

    .line 56
    :try_start_0
    invoke-virtual {p0, v1}, Ll/ۢܽۘ;->ۧ([B)I

    move-result v2

    .line 57
    invoke-virtual {p1, v2, v1}, Ll/ۤܰۖ;->֫(I[B)V

    .line 58
    iget-wide v3, p0, Ll/ۢܽۘ;->᩶:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/ۢܽۘ;->᩶:J

    .line 59
    iget v3, p0, Ll/ۢܽۘ;->᩹:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ۢܽۘ;->᩹:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 61
    new-instance p2, Ll/ۧۧۘ;

    .line 34
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 61
    throw p2

    :cond_2
    return-void
.end method

.method public abstract ۧ([B)I
.end method

.method public final ܽ()I
    .locals 1

    .line 88
    iget v0, p0, Ll/ۢܽۘ;->᩹:I

    return v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 84
    iget-wide v0, p0, Ll/ۢܽۘ;->᩶:J

    return-wide v0
.end method
