.class public final Ll/ۖۤۜ;
.super Ll/۬ᩴܺ;
.source "D8GL"


# instance fields
.field public final ֫:Ll/ۖ֨ۜ;

.field public final ۜ:I

.field public final ۡ:J

.field public final ۢ:Ll/֨۠ۜ;

.field public final ۧ:Ll/᩻۬ۜ;

.field public final ܳ:Z

.field public final ܽ:Ll/ܶ۠֫;

.field public final ܿ:I

.field public final ᩳ:Ll/ܽۚۜ;

.field public final ᩷:J

.field public final ᩻:Ll/ܶ۠֫;


# direct methods
.method public constructor <init>(IJIJZLl/ۖ֨ۜ;Ll/ܶ۠֫;Ll/ܶ۠֫;Ll/᩻۬ۜ;Ll/֨۠ۜ;Ll/ܽۚۜ;)V
    .locals 0

    .line 5570
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۖۤۜ;->ܿ:I

    iput-wide p2, p0, Ll/ۖۤۜ;->ۡ:J

    iput p4, p0, Ll/ۖۤۜ;->ۜ:I

    iput-wide p5, p0, Ll/ۖۤۜ;->᩷:J

    iput-boolean p7, p0, Ll/ۖۤۜ;->ܳ:Z

    iput-object p8, p0, Ll/ۖۤۜ;->֫:Ll/ۖ֨ۜ;

    iput-object p9, p0, Ll/ۖۤۜ;->ܽ:Ll/ܶ۠֫;

    iput-object p10, p0, Ll/ۖۤۜ;->᩻:Ll/ܶ۠֫;

    iput-object p11, p0, Ll/ۖۤۜ;->ۧ:Ll/᩻۬ۜ;

    iput-object p12, p0, Ll/ۖۤۜ;->ۢ:Ll/֨۠ۜ;

    iput-object p13, p0, Ll/ۖۤۜ;->ᩳ:Ll/ܽۚۜ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 5570
    instance-of v0, p1, Ll/ۖۤۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۖۤۜ;

    iget-boolean v0, p0, Ll/ۖۤۜ;->ܳ:Z

    iget-boolean v1, p1, Ll/ۖۤۜ;->ܳ:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۖۤۜ;->ܿ:I

    iget v1, p1, Ll/ۖۤۜ;->ܿ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۖۤۜ;->ۜ:I

    iget v1, p1, Ll/ۖۤۜ;->ۜ:I

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/ۖۤۜ;->ۡ:J

    iget-wide v2, p1, Ll/ۖۤۜ;->ۡ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ۖۤۜ;->᩷:J

    iget-wide v2, p1, Ll/ۖۤۜ;->᩷:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/ۖۤۜ;->֫:Ll/ۖ֨ۜ;

    iget-object v1, p1, Ll/ۖۤۜ;->֫:Ll/ۖ֨ۜ;

    invoke-virtual {v0, v1}, Ll/ۖ֨ۜ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖۤۜ;->ܽ:Ll/ܶ۠֫;

    iget-object v1, p1, Ll/ۖۤۜ;->ܽ:Ll/ܶ۠֫;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖۤۜ;->᩻:Ll/ܶ۠֫;

    iget-object v1, p1, Ll/ۖۤۜ;->᩻:Ll/ܶ۠֫;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖۤۜ;->ۧ:Ll/᩻۬ۜ;

    iget-object v1, p1, Ll/ۖۤۜ;->ۧ:Ll/᩻۬ۜ;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖۤۜ;->ۢ:Ll/֨۠ۜ;

    iget-object v1, p1, Ll/ۖۤۜ;->ۢ:Ll/֨۠ۜ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۖۤۜ;->ᩳ:Ll/ܽۚۜ;

    iget-object p1, p1, Ll/ۖۤۜ;->ᩳ:Ll/ܽۚۜ;

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

    .line 0
    iget-boolean v0, p0, Ll/ۖۤۜ;->ܳ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 5570
    iget v1, p0, Ll/ۖۤۜ;->ܿ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۖۤۜ;->ۜ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-wide v1, p0, Ll/ۖۤۜ;->ۡ:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/ۖۤۜ;->᩷:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 5570
    iget-object v1, p0, Ll/ۖۤۜ;->֫:Ll/ۖ֨ۜ;

    invoke-virtual {v1}, Ll/ۖ֨ۜ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ۖۤۜ;->ܽ:Ll/ܶ۠֫;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۖۤۜ;->᩻:Ll/ܶ۠֫;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ۖۤۜ;->ۧ:Ll/᩻۬ۜ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۖۤۜ;->ۢ:Ll/֨۠ۜ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ۖۤۜ;->ᩳ:Ll/ܽۚۜ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 5570
    iget v0, p0, Ll/ۖۤۜ;->ܿ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-wide v1, p0, Ll/ۖۤۜ;->ۡ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget v2, p0, Ll/ۖۤۜ;->ۜ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-wide v3, p0, Ll/ۖۤۜ;->᩷:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-boolean v4, p0, Ll/ۖۤۜ;->ܳ:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/16 v5, 0xb

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

    const/4 v1, 0x5

    iget-object v2, p0, Ll/ۖۤۜ;->֫:Ll/ۖ֨ۜ;

    aput-object v2, v5, v1

    const/4 v1, 0x6

    iget-object v2, p0, Ll/ۖۤۜ;->ܽ:Ll/ܶ۠֫;

    aput-object v2, v5, v1

    const/4 v1, 0x7

    iget-object v2, p0, Ll/ۖۤۜ;->᩻:Ll/ܶ۠֫;

    aput-object v2, v5, v1

    const/16 v1, 0x8

    iget-object v2, p0, Ll/ۖۤۜ;->ۧ:Ll/᩻۬ۜ;

    aput-object v2, v5, v1

    const/16 v1, 0x9

    iget-object v2, p0, Ll/ۖۤۜ;->ۢ:Ll/֨۠ۜ;

    aput-object v2, v5, v1

    const/16 v1, 0xa

    iget-object v2, p0, Ll/ۖۤۜ;->ᩳ:Ll/ܽۚۜ;

    aput-object v2, v5, v1

    const-string v1, "generation;requestId;mediaToken;positionMs;gestureMode;actual;directFactory;mediaFactory;cacheSession;rangeProbeSession;fileFactory"

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
    const-class v4, Ll/ۖۤۜ;

    invoke-static {v4, v2, v3}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 5570
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

.method public final ֡()J
    .locals 2

    .line 5570
    iget-wide v0, p0, Ll/ۖۤۜ;->ۡ:J

    return-wide v0
.end method

.method public final ֫()Ll/ۖ֨ۜ;
    .locals 1

    .line 5570
    iget-object v0, p0, Ll/ۖۤۜ;->֫:Ll/ۖ֨ۜ;

    return-object v0
.end method

.method public final ۖ()Ll/ܶ۠֫;
    .locals 1

    .line 5570
    iget-object v0, p0, Ll/ۖۤۜ;->᩻:Ll/ܶ۠֫;

    return-object v0
.end method

.method public final ۘ()I
    .locals 1

    .line 5570
    iget v0, p0, Ll/ۖۤۜ;->ۜ:I

    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 5570
    iget-boolean v0, p0, Ll/ۖۤۜ;->ܳ:Z

    return v0
.end method

.method public final ܳ()Ll/ܽۚۜ;
    .locals 1

    .line 5570
    iget-object v0, p0, Ll/ۖۤۜ;->ᩳ:Ll/ܽۚۜ;

    return-object v0
.end method

.method public final ܽ()Ll/᩻۬ۜ;
    .locals 1

    .line 5570
    iget-object v0, p0, Ll/ۖۤۜ;->ۧ:Ll/᩻۬ۜ;

    return-object v0
.end method

.method public final ᩳ()Ll/ܶ۠֫;
    .locals 1

    .line 5570
    iget-object v0, p0, Ll/ۖۤۜ;->ܽ:Ll/ܶ۠֫;

    return-object v0
.end method

.method public final ᩴ()J
    .locals 2

    .line 5570
    iget-wide v0, p0, Ll/ۖۤۜ;->᩷:J

    return-wide v0
.end method

.method public final ᩵()Ll/֨۠ۜ;
    .locals 1

    .line 5570
    iget-object v0, p0, Ll/ۖۤۜ;->ۢ:Ll/֨۠ۜ;

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 5570
    iget v0, p0, Ll/ۖۤۜ;->ܿ:I

    return v0
.end method
