.class public final Ll/᩹ۢ᩻;
.super Ll/۬ᩴܺ;
.source "KAHM"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Z

.field public final ܽ:J

.field public final ᩳ:J


# direct methods
.method public constructor <init>(ZJJLjava/lang/String;)V
    .locals 0

    .line 359
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/᩹ۢ᩻;->ۧ:Z

    iput-wide p2, p0, Ll/᩹ۢ᩻;->ᩳ:J

    iput-wide p4, p0, Ll/᩹ۢ᩻;->ܽ:J

    iput-object p6, p0, Ll/᩹ۢ᩻;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 359
    instance-of v0, p1, Ll/᩹ۢ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩹ۢ᩻;

    iget-boolean v0, p0, Ll/᩹ۢ᩻;->ۧ:Z

    iget-boolean v1, p1, Ll/᩹ۢ᩻;->ۧ:Z

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/᩹ۢ᩻;->ᩳ:J

    iget-wide v2, p1, Ll/᩹ۢ᩻;->ᩳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/᩹ۢ᩻;->ܽ:J

    iget-wide v2, p1, Ll/᩹ۢ᩻;->ܽ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/᩹ۢ᩻;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/᩹ۢ᩻;->֫:Ljava/lang/String;

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
    iget-boolean v0, p0, Ll/᩹ۢ᩻;->ۧ:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/᩹ۢ᩻;->ᩳ:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ll/᩹ۢ᩻;->ܽ:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 359
    iget-object v1, p0, Ll/᩹ۢ᩻;->֫:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 359
    iget-boolean v0, p0, Ll/᩹ۢ᩻;->ۧ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-wide v1, p0, Ll/᩹ۢ᩻;->ᩳ:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-wide v2, p0, Ll/᩹ۢ᩻;->ܽ:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v1, 0x2

    aput-object v2, v3, v1

    const/4 v1, 0x3

    iget-object v2, p0, Ll/᩹ۢ᩻;->֫:Ljava/lang/String;

    aput-object v2, v3, v1

    const-string v1, "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    new-array v1, v4, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/᩹ۢ᩻;

    invoke-static {v6, v2, v5}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 359
    :goto_1
    array-length v5, v1

    if-ge v4, v5, :cond_2

    aget-object v5, v1, v4

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v3, v4

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v1

    sub-int/2addr v5, v0

    if-eq v4, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v4, v4, 0x1

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

    .line 359
    iget-wide v0, p0, Ll/᩹ۢ᩻;->ܽ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 359
    iget-wide v0, p0, Ll/᩹ۢ᩻;->ᩳ:J

    return-wide v0
.end method
