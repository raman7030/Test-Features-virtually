.class public final Ll/ۡ᩸ᩳ;
.super Ll/۬ᩴܺ;
.source "Q92M"


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(JJJJJ)V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ۡ᩸ᩳ;->֫:J

    iput-wide p3, p0, Ll/ۡ᩸ᩳ;->ۧ:J

    iput-wide p5, p0, Ll/ۡ᩸ᩳ;->ܿ:J

    iput-wide p7, p0, Ll/ۡ᩸ᩳ;->ܽ:J

    iput-wide p9, p0, Ll/ۡ᩸ᩳ;->ᩳ:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJJI)V
    .locals 0

    .line 0
    invoke-direct/range {p0 .. p10}, Ll/ۡ᩸ᩳ;-><init>(JJJJJ)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۡ᩸ᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->ۧ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ۡ᩸ᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->ܽ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/ۡ᩸ᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->ᩳ:J

    return-wide v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 128
    instance-of v0, p1, Ll/ۡ᩸ᩳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۡ᩸ᩳ;

    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->֫:J

    iget-wide v2, p1, Ll/ۡ᩸ᩳ;->֫:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->ۧ:J

    iget-wide v2, p1, Ll/ۡ᩸ᩳ;->ۧ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->ܿ:J

    iget-wide v2, p1, Ll/ۡ᩸ᩳ;->ܿ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->ܽ:J

    iget-wide v2, p1, Ll/ۡ᩸ᩳ;->ܽ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->ᩳ:J

    iget-wide v2, p1, Ll/ۡ᩸ᩳ;->ᩳ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 7

    .line 0
    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->֫:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Ll/ۡ᩸ᩳ;->ۧ:J

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v0, v3

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Ll/ۡ᩸ᩳ;->ܿ:J

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v0, v3

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Ll/ۡ᩸ᩳ;->ܽ:J

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v0, v3

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Ll/ۡ᩸ᩳ;->ᩳ:J

    ushr-long v5, v3, v2

    xor-long v2, v3, v5

    long-to-int v0, v2

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 128
    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Ll/ۡ᩸ᩳ;->ۧ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-wide v2, p0, Ll/ۡ᩸ᩳ;->ܿ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Ll/ۡ᩸ᩳ;->ܽ:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p0, Ll/ۡ᩸ᩳ;->ᩳ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v1, 0x2

    aput-object v2, v5, v1

    const/4 v1, 0x3

    aput-object v3, v5, v1

    const/4 v1, 0x4

    aput-object v4, v5, v1

    const-string v1, "bytes;chars;words;chinese;lines"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    new-array v1, v6, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "["

    .line 0
    const-class v4, Ll/ۡ᩸ᩳ;

    invoke-static {v4, v2, v3}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 128
    :goto_1
    array-length v3, v1

    if-ge v6, v3, :cond_2

    aget-object v3, v1, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v5, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v3, v1

    sub-int/2addr v3, v0

    if-eq v6, v3, :cond_1

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 7

    .line 129
    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Ll/ۡ᩸ᩳ;->ۧ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-wide v2, p0, Ll/ۡ᩸ᩳ;->ܿ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Ll/ۡ᩸ᩳ;->ܽ:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p0, Ll/ۡ᩸ᩳ;->ᩳ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    const v0, 0x7f12060f

    invoke-static {v0, v5}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۡ᩸ᩳ;)Ll/ۡ᩸ᩳ;
    .locals 14

    .line 131
    new-instance v11, Ll/ۡ᩸ᩳ;

    iget-wide v0, p0, Ll/ۡ᩸ᩳ;->֫:J

    iget-wide v2, p1, Ll/ۡ᩸ᩳ;->֫:J

    add-long v1, v0, v2

    iget-wide v3, p0, Ll/ۡ᩸ᩳ;->ۧ:J

    iget-wide v5, p1, Ll/ۡ᩸ᩳ;->ۧ:J

    add-long/2addr v3, v5

    iget-wide v5, p0, Ll/ۡ᩸ᩳ;->ܿ:J

    iget-wide v7, p1, Ll/ۡ᩸ᩳ;->ܿ:J

    add-long/2addr v5, v7

    iget-wide v7, p0, Ll/ۡ᩸ᩳ;->ܽ:J

    iget-wide v9, p1, Ll/ۡ᩸ᩳ;->ܽ:J

    add-long/2addr v7, v9

    iget-wide v9, p0, Ll/ۡ᩸ᩳ;->ᩳ:J

    iget-wide v12, p1, Ll/ۡ᩸ᩳ;->ᩳ:J

    add-long/2addr v9, v12

    const-wide/16 v12, 0x1

    sub-long/2addr v9, v12

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Ll/ۡ᩸ᩳ;-><init>(JJJJJ)V

    return-object v11
.end method
