.class public final Ll/ᩴۙ᩻;
.super Ll/۬ᩴܺ;
.source "9AHU"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Ljava/util/Map;

.field public final ܽ:J

.field public final ᩳ:Ll/᩻ܰۡ;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Map;Ll/᩻ܰۡ;J)V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۙ᩻;->֫:Ljava/util/List;

    iput-object p2, p0, Ll/ᩴۙ᩻;->ۧ:Ljava/util/Map;

    iput-object p3, p0, Ll/ᩴۙ᩻;->ᩳ:Ll/᩻ܰۡ;

    iput-wide p4, p0, Ll/ᩴۙ᩻;->ܽ:J

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴۙ᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۙ᩻;->֫:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴۙ᩻;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۙ᩻;->ۧ:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩴۙ᩻;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩴۙ᩻;->ܽ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴۙ᩻;)Ll/᩻ܰۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۙ᩻;->ᩳ:Ll/᩻ܰۡ;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 102
    instance-of v0, p1, Ll/ᩴۙ᩻;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ᩴۙ᩻;

    iget-wide v0, p0, Ll/ᩴۙ᩻;->ܽ:J

    iget-wide v2, p1, Ll/ᩴۙ᩻;->ܽ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/ᩴۙ᩻;->֫:Ljava/util/List;

    iget-object v1, p1, Ll/ᩴۙ᩻;->֫:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴۙ᩻;->ۧ:Ljava/util/Map;

    iget-object v1, p1, Ll/ᩴۙ᩻;->ۧ:Ljava/util/Map;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴۙ᩻;->ᩳ:Ll/᩻ܰۡ;

    iget-object p1, p1, Ll/ᩴۙ᩻;->ᩳ:Ll/᩻ܰۡ;

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
    .locals 5

    const/16 v0, 0x20

    .line 0
    iget-wide v1, p0, Ll/ᩴۙ᩻;->ܽ:J

    ushr-long v3, v1, v0

    xor-long v0, v1, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 102
    iget-object v0, p0, Ll/ᩴۙ᩻;->֫:Ljava/util/List;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ᩴۙ᩻;->ۧ:Ljava/util/Map;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/ᩴۙ᩻;->ᩳ:Ll/᩻ܰۡ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 102
    iget-wide v0, p0, Ll/ᩴۙ᩻;->ܽ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ᩴۙ᩻;->֫:Ljava/util/List;

    aput-object v3, v1, v2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ᩴۙ᩻;->ۧ:Ljava/util/Map;

    aput-object v4, v1, v3

    const/4 v4, 0x2

    iget-object v5, p0, Ll/ᩴۙ᩻;->ᩳ:Ll/᩻ܰۡ;

    aput-object v5, v1, v4

    const/4 v4, 0x3

    aput-object v0, v1, v4

    const-string v0, "entries;entryMap;fileTree;fileTime"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v0, v2, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "["

    .line 0
    const-class v6, Ll/ᩴۙ᩻;

    invoke-static {v6, v4, v5}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 102
    :goto_1
    array-length v5, v0

    if-ge v2, v5, :cond_2

    aget-object v5, v0, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v1, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v0

    sub-int/2addr v5, v3

    if-eq v2, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
