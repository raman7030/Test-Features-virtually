.class public final Ll/ᩴۨᩳ;
.super Ll/۬ᩴܺ;
.source "X68P"


# instance fields
.field public final ֫:Z

.field public final ۖ:Z

.field public final ۜ:F

.field public final ۡ:Z

.field public final ۢ:Ljava/lang/Object;

.field public final ۧ:Z

.field public final ܳ:F

.field public final ܺ:I

.field public final ܽ:Ljava/lang/Object;

.field public final ܿ:Z

.field public final ᩳ:Z

.field public final ᩷:I

.field public final ᩻:F


# direct methods
.method public constructor <init>(Landroid/graphics/Typeface;FFFIZZZZZZILl/ܶۜܿ;)V
    .locals 0

    .line 3395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴۨᩳ;->ۢ:Ljava/lang/Object;

    iput p2, p0, Ll/ᩴۨᩳ;->᩻:F

    iput p3, p0, Ll/ᩴۨᩳ;->ܳ:F

    iput p4, p0, Ll/ᩴۨᩳ;->ۜ:F

    iput p5, p0, Ll/ᩴۨᩳ;->᩷:I

    iput-boolean p6, p0, Ll/ᩴۨᩳ;->֫:Z

    iput-boolean p7, p0, Ll/ᩴۨᩳ;->ۡ:Z

    iput-boolean p8, p0, Ll/ᩴۨᩳ;->ᩳ:Z

    iput-boolean p9, p0, Ll/ᩴۨᩳ;->ܿ:Z

    iput-boolean p10, p0, Ll/ᩴۨᩳ;->ۧ:Z

    iput-boolean p11, p0, Ll/ᩴۨᩳ;->ۖ:Z

    iput p12, p0, Ll/ᩴۨᩳ;->ܺ:I

    iput-object p13, p0, Ll/ᩴۨᩳ;->ܽ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 3395
    instance-of v0, p1, Ll/ᩴۨᩳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ᩴۨᩳ;

    iget-boolean v0, p0, Ll/ᩴۨᩳ;->֫:Z

    iget-boolean v1, p1, Ll/ᩴۨᩳ;->֫:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ᩴۨᩳ;->ۡ:Z

    iget-boolean v1, p1, Ll/ᩴۨᩳ;->ۡ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ᩴۨᩳ;->ᩳ:Z

    iget-boolean v1, p1, Ll/ᩴۨᩳ;->ᩳ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ᩴۨᩳ;->ܿ:Z

    iget-boolean v1, p1, Ll/ᩴۨᩳ;->ܿ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ᩴۨᩳ;->ۧ:Z

    iget-boolean v1, p1, Ll/ᩴۨᩳ;->ۧ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ᩴۨᩳ;->ۖ:Z

    iget-boolean v1, p1, Ll/ᩴۨᩳ;->ۖ:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ᩴۨᩳ;->᩷:I

    iget v1, p1, Ll/ᩴۨᩳ;->᩷:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ᩴۨᩳ;->ܺ:I

    iget v1, p1, Ll/ᩴۨᩳ;->ܺ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ᩴۨᩳ;->᩻:F

    iget v1, p1, Ll/ᩴۨᩳ;->᩻:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ll/ᩴۨᩳ;->ܳ:F

    iget v1, p1, Ll/ᩴۨᩳ;->ܳ:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Ll/ᩴۨᩳ;->ۜ:F

    iget v1, p1, Ll/ᩴۨᩳ;->ۜ:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩴۨᩳ;->ۢ:Ljava/lang/Object;

    iget-object v1, p1, Ll/ᩴۨᩳ;->ۢ:Ljava/lang/Object;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴۨᩳ;->ܽ:Ljava/lang/Object;

    iget-object p1, p1, Ll/ᩴۨᩳ;->ܽ:Ljava/lang/Object;

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
    iget-boolean v0, p0, Ll/ᩴۨᩳ;->֫:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ᩴۨᩳ;->ۡ:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v2, 0x4d5

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ᩴۨᩳ;->ᩳ:Z

    if-eqz v2, :cond_2

    const/16 v2, 0x4cf

    goto :goto_2

    :cond_2
    const/16 v2, 0x4d5

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ᩴۨᩳ;->ܿ:Z

    if-eqz v2, :cond_3

    const/16 v2, 0x4cf

    goto :goto_3

    :cond_3
    const/16 v2, 0x4d5

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ᩴۨᩳ;->ۧ:Z

    if-eqz v2, :cond_4

    const/16 v2, 0x4cf

    goto :goto_4

    :cond_4
    const/16 v2, 0x4d5

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Ll/ᩴۨᩳ;->ۖ:Z

    if-eqz v2, :cond_5

    const/16 v1, 0x4cf

    :cond_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 3395
    iget v1, p0, Ll/ᩴۨᩳ;->᩷:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ᩴۨᩳ;->ܺ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget v1, p0, Ll/ᩴۨᩳ;->᩻:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ll/ᩴۨᩳ;->ܳ:F

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ᩴۨᩳ;->ۜ:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 3395
    iget-object v0, p0, Ll/ᩴۨᩳ;->ۢ:Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ᩴۨᩳ;->ܽ:Ljava/lang/Object;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 14

    .line 3395
    iget v0, p0, Ll/ᩴۨᩳ;->᩻:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget v1, p0, Ll/ᩴۨᩳ;->ܳ:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v2, p0, Ll/ᩴۨᩳ;->ۜ:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v3, p0, Ll/ᩴۨᩳ;->᩷:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-boolean v4, p0, Ll/ᩴۨᩳ;->֫:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-boolean v5, p0, Ll/ᩴۨᩳ;->ۡ:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v6, p0, Ll/ᩴۨᩳ;->ᩳ:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-boolean v7, p0, Ll/ᩴۨᩳ;->ܿ:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-boolean v8, p0, Ll/ᩴۨᩳ;->ۧ:Z

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-boolean v9, p0, Ll/ᩴۨᩳ;->ۖ:Z

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    iget v10, p0, Ll/ᩴۨᩳ;->ܺ:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/16 v11, 0xd

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    iget-object v13, p0, Ll/ᩴۨᩳ;->ۢ:Ljava/lang/Object;

    aput-object v13, v11, v12

    const/4 v13, 0x1

    aput-object v0, v11, v13

    const/4 v0, 0x2

    aput-object v1, v11, v0

    const/4 v0, 0x3

    aput-object v2, v11, v0

    const/4 v0, 0x4

    aput-object v3, v11, v0

    const/4 v0, 0x5

    aput-object v4, v11, v0

    const/4 v0, 0x6

    aput-object v5, v11, v0

    const/4 v0, 0x7

    aput-object v6, v11, v0

    const/16 v0, 0x8

    aput-object v7, v11, v0

    const/16 v0, 0x9

    aput-object v8, v11, v0

    const/16 v0, 0xa

    aput-object v9, v11, v0

    const/16 v0, 0xb

    aput-object v10, v11, v0

    const/16 v0, 0xc

    iget-object v1, p0, Ll/ᩴۨᩳ;->ܽ:Ljava/lang/Object;

    aput-object v1, v11, v0

    const-string v0, "typeface;size;scale;skew;tabSize;ascii;unicode;lineNumbers;lineNumbersLeft;fixedNumbers;wrapArrows;wrap;language"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v12, [Ljava/lang/String;

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
    const-class v3, Ll/ᩴۨᩳ;

    invoke-static {v3, v1, v2}, Ll/ۘ᩺ۘ;->֫(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 3395
    :goto_1
    array-length v2, v0

    if-ge v12, v2, :cond_2

    aget-object v2, v0, v12

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v11, v12

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v2, v0

    sub-int/2addr v2, v13

    if-eq v12, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
