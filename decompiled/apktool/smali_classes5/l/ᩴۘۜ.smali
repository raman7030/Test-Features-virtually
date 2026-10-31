.class public final Ll/ᩴۘۜ;
.super Ll/۬ᩴܺ;
.source "S6V7"


# instance fields
.field public final ֫:J

.field public final ۧ:J

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:J

.field public final ܿ:J

.field public final ᩳ:I


# direct methods
.method public constructor <init>(JJJLjava/lang/String;IJ)V
    .locals 0

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ᩴۘۜ;->ܿ:J

    iput-wide p3, p0, Ll/ᩴۘۜ;->ۧ:J

    iput-wide p5, p0, Ll/ᩴۘۜ;->֫:J

    iput-object p7, p0, Ll/ᩴۘۜ;->ܳ:Ljava/lang/String;

    iput p8, p0, Ll/ᩴۘۜ;->ᩳ:I

    iput-wide p9, p0, Ll/ᩴۘۜ;->ܽ:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 229
    instance-of v0, p1, Ll/ᩴۘۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ᩴۘۜ;

    iget v0, p0, Ll/ᩴۘۜ;->ᩳ:I

    iget v1, p1, Ll/ᩴۘۜ;->ᩳ:I

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/ᩴۘۜ;->ܿ:J

    iget-wide v2, p1, Ll/ᩴۘۜ;->ܿ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ᩴۘۜ;->ۧ:J

    iget-wide v2, p1, Ll/ᩴۘۜ;->ۧ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ᩴۘۜ;->֫:J

    iget-wide v2, p1, Ll/ᩴۘۜ;->֫:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ᩴۘۜ;->ܽ:J

    iget-wide v2, p1, Ll/ᩴۘۜ;->ܽ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/ᩴۘۜ;->ܳ:Ljava/lang/String;

    iget-object p1, p1, Ll/ᩴۘۜ;->ܳ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 6

    .line 229
    iget v0, p0, Ll/ᩴۘۜ;->ᩳ:I

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-wide v1, p0, Ll/ᩴۘۜ;->ܿ:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/ᩴۘۜ;->ۧ:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/ᩴۘۜ;->֫:J

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/ᩴۘۜ;->ܽ:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 229
    iget-object v1, p0, Ll/ᩴۘۜ;->ܳ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 229
    iget-wide v0, p0, Ll/ᩴۘۜ;->ܿ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v1, p0, Ll/ᩴۘۜ;->ۧ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-wide v2, p0, Ll/ᩴۘۜ;->֫:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget v3, p0, Ll/ᩴۘۜ;->ᩳ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-wide v4, p0, Ll/ᩴۘۜ;->ܽ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x6

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v1, 0x2

    aput-object v2, v5, v1

    const/4 v1, 0x3

    iget-object v2, p0, Ll/ᩴۘۜ;->ܳ:Ljava/lang/String;

    aput-object v2, v5, v1

    const/4 v1, 0x4

    aput-object v3, v5, v1

    const/4 v1, 0x5

    aput-object v4, v5, v1

    const-string v1, "number;byteStart;byteEnd;text;contentLength;column"

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
    const-class v4, Ll/ᩴۘۜ;

    invoke-static {v4, v2, v3}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 229
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

.method public final ֫()J
    .locals 2

    .line 229
    iget-wide v0, p0, Ll/ᩴۘۜ;->֫:J

    return-wide v0
.end method

.method public final ֫(I)Ll/ᩴۘۜ;
    .locals 13

    .line 231
    iget-object v0, p0, Ll/ᩴۘۜ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, p1, :cond_0

    return-object p0

    .line 232
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, p1

    if-lez v1, :cond_1

    .line 233
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    if-lez v1, :cond_2

    add-int/lit8 p1, v1, -0x1

    .line 234
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v2, 0xd

    if-ne p1, v2, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v2, 0xa

    if-ne p1, v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    .line 235
    :cond_2
    new-instance p1, Ll/ᩴۘۜ;

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    iget v2, p0, Ll/ᩴۘۜ;->ᩳ:I

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    .line 236
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->codePointCount(II)I

    move-result v0

    int-to-long v0, v0

    iget-wide v2, p0, Ll/ᩴۘۜ;->ܽ:J

    add-long v11, v2, v0

    iget-wide v3, p0, Ll/ᩴۘۜ;->ܿ:J

    iget-wide v5, p0, Ll/ᩴۘۜ;->ۧ:J

    iget-wide v7, p0, Ll/ᩴۘۜ;->֫:J

    move-object v2, p1

    invoke-direct/range {v2 .. v12}, Ll/ᩴۘۜ;-><init>(JJJLjava/lang/String;IJ)V

    return-object p1
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Ll/ᩴۘۜ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܳ()I
    .locals 1

    .line 229
    iget v0, p0, Ll/ᩴۘۜ;->ᩳ:I

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 229
    iget-wide v0, p0, Ll/ᩴۘۜ;->ۧ:J

    return-wide v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 229
    iget-wide v0, p0, Ll/ᩴۘۜ;->ܽ:J

    return-wide v0
.end method

.method public final ᩻()J
    .locals 2

    .line 229
    iget-wide v0, p0, Ll/ᩴۘۜ;->ܿ:J

    return-wide v0
.end method
