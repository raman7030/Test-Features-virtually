.class public final Ll/֫ܰۡ;
.super Ll/۬ᩴܺ;
.source "A5XF"


# instance fields
.field public final ֫:Z

.field public final ۧ:J

.field public final ܳ:Z

.field public final ܽ:I

.field public final ܿ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(JIJJZZ)V
    .locals 0

    .line 1920
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/֫ܰۡ;->ᩳ:J

    iput p3, p0, Ll/֫ܰۡ;->ܽ:I

    iput-wide p4, p0, Ll/֫ܰۡ;->ۧ:J

    iput-wide p6, p0, Ll/֫ܰۡ;->ܿ:J

    iput-boolean p8, p0, Ll/֫ܰۡ;->ܳ:Z

    iput-boolean p9, p0, Ll/֫ܰۡ;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ܰۡ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֫ܰۡ;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/֫ܰۡ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֫ܰۡ;->ۧ:J

    return-wide v0
.end method

.method public static bridge synthetic ܳ(Ll/֫ܰۡ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֫ܰۡ;->ܳ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/֫ܰۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ܰۡ;->ܽ:I

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/֫ܰۡ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֫ܰۡ;->ܿ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/֫ܰۡ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/֫ܰۡ;->ᩳ:J

    return-wide v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1920
    instance-of v0, p1, Ll/֫ܰۡ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/֫ܰۡ;

    iget-boolean v0, p0, Ll/֫ܰۡ;->ܳ:Z

    iget-boolean v1, p1, Ll/֫ܰۡ;->ܳ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/֫ܰۡ;->֫:Z

    iget-boolean v1, p1, Ll/֫ܰۡ;->֫:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/֫ܰۡ;->ܽ:I

    iget v1, p1, Ll/֫ܰۡ;->ܽ:I

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/֫ܰۡ;->ᩳ:J

    iget-wide v2, p1, Ll/֫ܰۡ;->ᩳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/֫ܰۡ;->ۧ:J

    iget-wide v2, p1, Ll/֫ܰۡ;->ۧ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/֫ܰۡ;->ܿ:J

    iget-wide v2, p1, Ll/֫ܰۡ;->ܿ:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 0
    iget-boolean v0, p0, Ll/֫ܰۡ;->ܳ:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/֫ܰۡ;->֫:Z

    if-eqz v2, :cond_1

    const/16 v1, 0x4cf

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 1920
    iget v1, p0, Ll/֫ܰۡ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-wide v1, p0, Ll/֫ܰۡ;->ᩳ:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/֫ܰۡ;->ۧ:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/֫ܰۡ;->ܿ:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1920
    iget-wide v0, p0, Ll/֫ܰۡ;->ᩳ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget v1, p0, Ll/֫ܰۡ;->ܽ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-wide v2, p0, Ll/֫ܰۡ;->ۧ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Ll/֫ܰۡ;->ܿ:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-boolean v4, p0, Ll/֫ܰۡ;->ܳ:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v5, p0, Ll/֫ܰۡ;->֫:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/4 v6, 0x6

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    aput-object v1, v6, v0

    const/4 v1, 0x2

    aput-object v2, v6, v1

    const/4 v1, 0x3

    aput-object v3, v6, v1

    const/4 v1, 0x4

    aput-object v4, v6, v1

    const/4 v1, 0x5

    aput-object v5, v6, v1

    const-string v1, "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    new-array v1, v7, [Ljava/lang/String;

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
    const-class v4, Ll/֫ܰۡ;

    invoke-static {v4, v2, v3}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 1920
    :goto_1
    array-length v3, v1

    if-ge v7, v3, :cond_2

    aget-object v3, v1, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v6, v7

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v3, v1

    sub-int/2addr v3, v0

    if-eq v7, v3, :cond_1

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
