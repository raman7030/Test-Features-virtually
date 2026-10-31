.class public final Ll/ᩳܽܿ;
.super Ll/۬ᩴܺ;
.source "35OM"


# instance fields
.field public final ֫:I

.field public final ۧ:Z

.field public final ܽ:Z

.field public final ܿ:Z

.field public final ᩳ:Ll/ۢ۫ۡ;


# direct methods
.method public constructor <init>(Ll/ۢ۫ۡ;ZIZZ)V
    .locals 0

    .line 854
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܽܿ;->ᩳ:Ll/ۢ۫ۡ;

    iput-boolean p2, p0, Ll/ᩳܽܿ;->ܽ:Z

    iput p3, p0, Ll/ᩳܽܿ;->֫:I

    iput-boolean p4, p0, Ll/ᩳܽܿ;->ܿ:Z

    iput-boolean p5, p0, Ll/ᩳܽܿ;->ۧ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳܽܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩳܽܿ;->֫:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ᩳܽܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳܽܿ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ᩳܽܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳܽܿ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ᩳܽܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳܽܿ;->ܿ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩳܽܿ;)Ll/ۢ۫ۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳܽܿ;->ᩳ:Ll/ۢ۫ۡ;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 854
    instance-of v0, p1, Ll/ᩳܽܿ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ᩳܽܿ;

    iget-boolean v0, p0, Ll/ᩳܽܿ;->ܽ:Z

    iget-boolean v1, p1, Ll/ᩳܽܿ;->ܽ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ᩳܽܿ;->ܿ:Z

    iget-boolean v1, p1, Ll/ᩳܽܿ;->ܿ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ᩳܽܿ;->ۧ:Z

    iget-boolean v1, p1, Ll/ᩳܽܿ;->ۧ:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ᩳܽܿ;->֫:I

    iget v1, p1, Ll/ᩳܽܿ;->֫:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ᩳܽܿ;->ᩳ:Ll/ۢ۫ۡ;

    iget-object p1, p1, Ll/ᩳܽܿ;->ᩳ:Ll/ۢ۫ۡ;

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
    iget-boolean v0, p0, Ll/ᩳܽܿ;->ܽ:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ᩳܽܿ;->ܿ:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v2, 0x4d5

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ᩳܽܿ;->ۧ:Z

    if-eqz v2, :cond_2

    const/16 v1, 0x4cf

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 854
    iget v1, p0, Ll/ᩳܽܿ;->֫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ᩳܽܿ;->ᩳ:Ll/ۢ۫ۡ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 854
    iget-boolean v0, p0, Ll/ᩳܽܿ;->ܽ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget v1, p0, Ll/ᩳܽܿ;->֫:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-boolean v2, p0, Ll/ᩳܽܿ;->ܿ:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-boolean v3, p0, Ll/ᩳܽܿ;->ۧ:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Ll/ᩳܽܿ;->ᩳ:Ll/ۢ۫ۡ;

    aput-object v6, v4, v5

    const/4 v6, 0x1

    aput-object v0, v4, v6

    const/4 v0, 0x2

    aput-object v1, v4, v0

    const/4 v0, 0x3

    aput-object v2, v4, v0

    const/4 v0, 0x4

    aput-object v3, v4, v0

    const-string v0, "painter;keepWord;arrowWidth;startArrow;endArrow"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v5, [Ljava/lang/String;

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
    const-class v3, Ll/ᩳܽܿ;

    invoke-static {v3, v1, v2}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 854
    :goto_1
    array-length v2, v0

    if-ge v5, v2, :cond_2

    aget-object v2, v0, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v4, v5

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v2, v0

    sub-int/2addr v2, v6

    if-eq v5, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
