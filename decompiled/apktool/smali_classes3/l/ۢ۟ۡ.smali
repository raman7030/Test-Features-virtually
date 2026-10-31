.class public final Ll/ۢ۟ۡ;
.super Ll/ܳ۟ۡ;
.source "OAR3"


# instance fields
.field public final ֫:J

.field public ۧ:J

.field public final synthetic ܽ:Ll/ۡ۟ۡ;


# direct methods
.method public constructor <init>(Ll/ۡ۟ۡ;J)V
    .locals 0

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 189
    iput-object p1, p0, Ll/ۢ۟ۡ;->ܽ:Ll/ۡ۟ۡ;

    .line 190
    iput-wide p2, p0, Ll/ۢ۟ۡ;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 6

    .line 232
    iget-wide v0, p0, Ll/ۢ۟ۡ;->֫:J

    iget-wide v2, p0, Ll/ۢ۟ۡ;->ۧ:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Ll/ۢ۟ۡ;->ܽ:Ll/ۡ۟ۡ;

    invoke-static {v2}, Ll/ۡ۟ۡ;->ܽ(Ll/ۡ۟ۡ;)Ll/۬ܰۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۬ܰۡ;->ܽ()J

    move-result-wide v2

    const-wide/16 v4, 0x8

    div-long/2addr v2, v4

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    return v1
.end method

.method public final ֫([BII)I
    .locals 6

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 204
    :cond_0
    iget-wide v1, p0, Ll/ۢ۟ۡ;->֫:J

    iget-wide v3, p0, Ll/ۢ۟ۡ;->ۧ:J

    sub-long/2addr v1, v3

    int-to-long v3, p3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    :goto_0
    if-ge v0, p3, :cond_4

    .line 208
    iget-object v1, p0, Ll/ۢ۟ۡ;->ܽ:Ll/ۡ۟ۡ;

    invoke-static {v1}, Ll/ۡ۟ۡ;->ܽ(Ll/ۡ۟ۡ;)Ll/۬ܰۡ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۬ܰۡ;->ᩳ()I

    move-result v2

    if-lez v2, :cond_1

    const/16 v2, 0x8

    .line 209
    invoke-static {v1, v2}, Ll/ۡ۟ۡ;->֫(Ll/ۡ۟ۡ;I)J

    move-result-wide v2

    long-to-int v3, v2

    int-to-byte v2, v3

    add-int v3, p2, v0

    .line 210
    invoke-static {v1}, Ll/ۡ۟ۡ;->ۧ(Ll/ۡ۟ۡ;)Ll/᩻۟ۡ;

    move-result-object v1

    invoke-virtual {v1, v2}, Ll/᩻۟ۡ;->֫(B)V

    aput-byte v2, p1, v3

    const/4 v1, 0x1

    goto :goto_2

    .line 213
    :cond_1
    invoke-static {v1}, Ll/ۡ۟ۡ;->֫(Ll/ۡ۟ۡ;)Ljava/io/InputStream;

    move-result-object v2

    add-int v3, p2, v0

    sub-int v4, p3, v0

    invoke-virtual {v2, p1, v3, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_3

    .line 217
    invoke-static {v1}, Ll/ۡ۟ۡ;->ۧ(Ll/ۡ۟ۡ;)Ll/᩻۟ۡ;

    move-result-object v1

    move v4, v3

    :goto_1
    add-int v5, v3, v2

    if-ge v4, v5, :cond_2

    .line 511
    aget-byte v5, p1, v4

    invoke-virtual {v1, v5}, Ll/᩻۟ۡ;->֫(B)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    move v1, v2

    .line 219
    :goto_2
    iget-wide v2, p0, Ll/ۢ۟ۡ;->ۧ:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/ۢ۟ۡ;->ۧ:J

    add-int/2addr v0, v1

    goto :goto_0

    .line 215
    :cond_3
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Truncated Deflate64 Stream"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return p3
.end method

.method public final ۧ()Z
    .locals 5

    .line 227
    iget-wide v0, p0, Ll/ۢ۟ۡ;->ۧ:J

    iget-wide v2, p0, Ll/ۢ۟ۡ;->֫:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Ll/ܺ۟ۡ;
    .locals 5

    .line 195
    iget-wide v0, p0, Ll/ۢ۟ۡ;->ۧ:J

    iget-wide v2, p0, Ll/ۢ۟ۡ;->֫:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    sget-object v0, Ll/ܺ۟ۡ;->ۗ:Ll/ܺ۟ۡ;

    return-object v0

    :cond_0
    sget-object v0, Ll/ܺ۟ۡ;->ۙ:Ll/ܺ۟ۡ;

    return-object v0
.end method
