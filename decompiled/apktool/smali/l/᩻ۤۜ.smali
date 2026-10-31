.class public final Ll/᩻ۤۜ;
.super Ll/۬ᩴܺ;
.source "D8GL"


# instance fields
.field public final ֫:Ljava/lang/CharSequence;

.field public final ۧ:Ll/᩺᩵֫;

.field public final ܽ:I

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/᩺᩵֫;Ljava/util/List;Ljava/lang/String;I)V
    .locals 0

    .line 2854
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۤۜ;->ۧ:Ll/᩺᩵֫;

    iput-object p2, p0, Ll/᩻ۤۜ;->ᩳ:Ljava/util/List;

    iput-object p3, p0, Ll/᩻ۤۜ;->֫:Ljava/lang/CharSequence;

    iput p4, p0, Ll/᩻ۤۜ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 2854
    instance-of v0, p1, Ll/᩻ۤۜ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩻ۤۜ;

    iget v0, p0, Ll/᩻ۤۜ;->ܽ:I

    iget v1, p1, Ll/᩻ۤۜ;->ܽ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/᩻ۤۜ;->ۧ:Ll/᩺᩵֫;

    iget-object v1, p1, Ll/᩻ۤۜ;->ۧ:Ll/᩺᩵֫;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻ۤۜ;->ᩳ:Ljava/util/List;

    iget-object v1, p1, Ll/᩻ۤۜ;->ᩳ:Ljava/util/List;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻ۤۜ;->֫:Ljava/lang/CharSequence;

    iget-object p1, p1, Ll/᩻ۤۜ;->֫:Ljava/lang/CharSequence;

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
    .locals 2

    .line 2854
    iget v0, p0, Ll/᩻ۤۜ;->ܽ:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/᩻ۤۜ;->ۧ:Ll/᩺᩵֫;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/᩻ۤۜ;->ᩳ:Ljava/util/List;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/᩻ۤۜ;->֫:Ljava/lang/CharSequence;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 2854
    iget v0, p0, Ll/᩻ۤۜ;->ܽ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/᩻ۤۜ;->ۧ:Ll/᩺᩵֫;

    aput-object v3, v1, v2

    const/4 v3, 0x1

    iget-object v4, p0, Ll/᩻ۤۜ;->ᩳ:Ljava/util/List;

    aput-object v4, v1, v3

    const/4 v4, 0x2

    iget-object v5, p0, Ll/᩻ۤۜ;->֫:Ljava/lang/CharSequence;

    aput-object v5, v1, v4

    const/4 v4, 0x3

    aput-object v0, v1, v4

    const-string v0, "group;supportedTrackIndices;displayName;logicalIndex"

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
    const-class v6, Ll/᩻ۤۜ;

    invoke-static {v6, v4, v5}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 2854
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

.method public final ֫()Ljava/lang/CharSequence;
    .locals 1

    .line 2854
    iget-object v0, p0, Ll/᩻ۤۜ;->֫:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 2854
    iget-object v0, p0, Ll/᩻ۤۜ;->ᩳ:Ljava/util/List;

    return-object v0
.end method

.method public final ܽ()Ll/᩺᩵֫;
    .locals 1

    .line 2854
    iget-object v0, p0, Ll/᩻ۤۜ;->ۧ:Ll/᩺᩵֫;

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 2854
    iget v0, p0, Ll/᩻ۤۜ;->ܽ:I

    return v0
.end method
