.class public final Ll/ܽ֫ܿ;
.super Ll/۬ᩴܺ;
.source "S4H6"


# instance fields
.field public final ֫:Z

.field public final ۧ:I

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IZZ)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ֫ܿ;->ܽ:Ljava/lang/String;

    iput-boolean p3, p0, Ll/ܽ֫ܿ;->ᩳ:Z

    iput-boolean p4, p0, Ll/ܽ֫ܿ;->֫:Z

    iput p2, p0, Ll/ܽ֫ܿ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 55
    instance-of v0, p1, Ll/ܽ֫ܿ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܽ֫ܿ;

    iget-boolean v0, p0, Ll/ܽ֫ܿ;->ᩳ:Z

    iget-boolean v1, p1, Ll/ܽ֫ܿ;->ᩳ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ܽ֫ܿ;->֫:Z

    iget-boolean v1, p1, Ll/ܽ֫ܿ;->֫:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܽ֫ܿ;->ۧ:I

    iget v1, p1, Ll/ܽ֫ܿ;->ۧ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܽ֫ܿ;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܽ֫ܿ;->ܽ:Ljava/lang/String;

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
    .locals 3

    .line 0
    iget-boolean v0, p0, Ll/ܽ֫ܿ;->ᩳ:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ܽ֫ܿ;->֫:Z

    if-eqz v2, :cond_1

    const/16 v1, 0x4cf

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 55
    iget v1, p0, Ll/ܽ֫ܿ;->ۧ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ܽ֫ܿ;->ܽ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final size()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ܽ֫ܿ;->ۧ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 55
    iget-boolean v0, p0, Ll/ܽ֫ܿ;->ᩳ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v1, p0, Ll/ܽ֫ܿ;->֫:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget v2, p0, Ll/ܽ֫ܿ;->ۧ:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Ll/ܽ֫ܿ;->ܽ:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v5, 0x1

    aput-object v0, v3, v5

    const/4 v0, 0x2

    aput-object v1, v3, v0

    const/4 v0, 0x3

    aput-object v2, v3, v0

    const-string v0, "text;warning;searching;size"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v4, [Ljava/lang/String;

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
    const-class v6, Ll/ܽ֫ܿ;

    invoke-static {v6, v1, v2}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 55
    :goto_1
    array-length v2, v0

    if-ge v4, v2, :cond_2

    aget-object v2, v0, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v3, v4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v2, v0

    sub-int/2addr v2, v5

    if-eq v4, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Ll/ܽ֫ܿ;->֫:Z

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ܽ֫ܿ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 55
    iget-boolean v0, p0, Ll/ܽ֫ܿ;->ᩳ:Z

    return v0
.end method
