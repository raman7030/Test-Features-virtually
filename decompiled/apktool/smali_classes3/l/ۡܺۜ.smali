.class public final Ll/ۡܺۜ;
.super Ll/۬ᩴܺ;
.source "46W4"


# instance fields
.field public final ֫:Z

.field public final ۜ:J

.field public final ۡ:Z

.field public final ۢ:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:J

.field public final ܽ:Z

.field public final ܿ:Ljava/lang/Long;

.field public final ᩳ:Z

.field public final ᩷:Z

.field public final ᩻:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZZJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZZ)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡܺۜ;->ۢ:Ljava/lang/String;

    iput-boolean p2, p0, Ll/ۡܺۜ;->ۡ:Z

    iput-boolean p3, p0, Ll/ۡܺۜ;->ᩳ:Z

    iput-boolean p4, p0, Ll/ۡܺۜ;->᩷:Z

    iput-wide p5, p0, Ll/ۡܺۜ;->ۜ:J

    iput-wide p7, p0, Ll/ۡܺۜ;->ܳ:J

    iput-object p9, p0, Ll/ۡܺۜ;->᩻:Ljava/lang/Long;

    iput-object p10, p0, Ll/ۡܺۜ;->ܿ:Ljava/lang/Long;

    iput-object p11, p0, Ll/ۡܺۜ;->ۧ:Ljava/lang/String;

    iput-boolean p12, p0, Ll/ۡܺۜ;->ܽ:Z

    iput-boolean p13, p0, Ll/ۡܺۜ;->֫:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡܺۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡܺۜ;->֫:Z

    return p0
.end method

.method public static bridge synthetic ۜ(Ll/ۡܺۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡܺۜ;->ۜ:J

    return-wide v0
.end method

.method public static bridge synthetic ۡ(Ll/ۡܺۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡܺۜ;->ۡ:Z

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/ۡܺۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܺۜ;->ۢ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۡܺۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܺۜ;->ۧ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۡܺۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۡܺۜ;->ܳ:J

    return-wide v0
.end method

.method public static bridge synthetic ܽ(Ll/ۡܺۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡܺۜ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۡܺۜ;)Ljava/lang/Long;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܺۜ;->ܿ:Ljava/lang/Long;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۡܺۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡܺۜ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ۡܺۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡܺۜ;->᩷:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ۡܺۜ;)Ljava/lang/Long;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡܺۜ;->᩻:Ljava/lang/Long;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 37
    instance-of v0, p1, Ll/ۡܺۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۡܺۜ;

    iget-boolean v0, p0, Ll/ۡܺۜ;->ۡ:Z

    iget-boolean v1, p1, Ll/ۡܺۜ;->ۡ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۡܺۜ;->ᩳ:Z

    iget-boolean v1, p1, Ll/ۡܺۜ;->ᩳ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۡܺۜ;->᩷:Z

    iget-boolean v1, p1, Ll/ۡܺۜ;->᩷:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۡܺۜ;->ܽ:Z

    iget-boolean v1, p1, Ll/ۡܺۜ;->ܽ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۡܺۜ;->֫:Z

    iget-boolean v1, p1, Ll/ۡܺۜ;->֫:Z

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/ۡܺۜ;->ۜ:J

    iget-wide v2, p1, Ll/ۡܺۜ;->ۜ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/ۡܺۜ;->ܳ:J

    iget-wide v2, p1, Ll/ۡܺۜ;->ܳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/ۡܺۜ;->ۢ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۡܺۜ;->ۢ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۡܺۜ;->᩻:Ljava/lang/Long;

    iget-object v1, p1, Ll/ۡܺۜ;->᩻:Ljava/lang/Long;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۡܺۜ;->ܿ:Ljava/lang/Long;

    iget-object v1, p1, Ll/ۡܺۜ;->ܿ:Ljava/lang/Long;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۡܺۜ;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۡܺۜ;->ۧ:Ljava/lang/String;

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
    .locals 7

    .line 0
    iget-boolean v0, p0, Ll/ۡܺۜ;->ۡ:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const/16 v2, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/ۡܺۜ;->ᩳ:Z

    if-eqz v3, :cond_1

    const/16 v3, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v3, 0x4d5

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/ۡܺۜ;->᩷:Z

    if-eqz v3, :cond_2

    const/16 v3, 0x4cf

    goto :goto_2

    :cond_2
    const/16 v3, 0x4d5

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/ۡܺۜ;->ܽ:Z

    if-eqz v3, :cond_3

    const/16 v3, 0x4cf

    goto :goto_3

    :cond_3
    const/16 v3, 0x4d5

    :goto_3
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/ۡܺۜ;->֫:Z

    if-eqz v3, :cond_4

    const/16 v1, 0x4cf

    :cond_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Ll/ۡܺۜ;->ۜ:J

    const/16 v1, 0x20

    ushr-long v5, v3, v1

    xor-long/2addr v3, v5

    long-to-int v4, v3

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Ll/ۡܺۜ;->ܳ:J

    ushr-long v5, v3, v1

    xor-long/2addr v3, v5

    long-to-int v1, v3

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۡܺۜ;->ۢ:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 37
    iget-object v1, p0, Ll/ۡܺۜ;->᩻:Ljava/lang/Long;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ۡܺۜ;->ܿ:Ljava/lang/Long;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ۡܺۜ;->ۧ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 37
    iget-boolean v0, p0, Ll/ۡܺۜ;->ۡ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v1, p0, Ll/ۡܺۜ;->ᩳ:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-boolean v2, p0, Ll/ۡܺۜ;->᩷:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-wide v3, p0, Ll/ۡܺۜ;->ۜ:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p0, Ll/ۡܺۜ;->ܳ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iget-boolean v5, p0, Ll/ۡܺۜ;->ܽ:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v6, p0, Ll/ۡܺۜ;->֫:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v7, 0xb

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    iget-object v9, p0, Ll/ۡܺۜ;->ۢ:Ljava/lang/String;

    aput-object v9, v7, v8

    const/4 v9, 0x1

    aput-object v0, v7, v9

    const/4 v0, 0x2

    aput-object v1, v7, v0

    const/4 v0, 0x3

    aput-object v2, v7, v0

    const/4 v0, 0x4

    aput-object v3, v7, v0

    const/4 v0, 0x5

    aput-object v4, v7, v0

    const/4 v0, 0x6

    iget-object v1, p0, Ll/ۡܺۜ;->᩻:Ljava/lang/Long;

    aput-object v1, v7, v0

    const/4 v0, 0x7

    iget-object v1, p0, Ll/ۡܺۜ;->ܿ:Ljava/lang/Long;

    aput-object v1, v7, v0

    const/16 v0, 0x8

    iget-object v1, p0, Ll/ۡܺۜ;->ۧ:Ljava/lang/String;

    aput-object v1, v7, v0

    const/16 v0, 0x9

    aput-object v5, v7, v0

    const/16 v0, 0xa

    aput-object v6, v7, v0

    const-string v0, "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v8, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "["

    .line 0
    const-class v3, Ll/ۡܺۜ;

    invoke-static {v3, v1, v2}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 37
    :goto_1
    array-length v2, v0

    if-ge v8, v2, :cond_2

    aget-object v2, v0, v8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v7, v8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v2, v0

    sub-int/2addr v2, v9

    if-eq v8, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
