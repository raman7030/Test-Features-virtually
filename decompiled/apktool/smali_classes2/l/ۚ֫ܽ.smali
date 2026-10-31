.class public final Ll/ۚ֫ܽ;
.super Ljava/lang/Object;
.source "OAMZ"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;)V
    .locals 3

    .line 36
    iget v0, p1, Landroid/graphics/Rect;->left:I

    iget v1, p1, Landroid/graphics/Rect;->top:I

    iget v2, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput v0, p0, Ll/ۚ֫ܽ;->ۧ:I

    .line 32
    iput v1, p0, Ll/ۚ֫ܽ;->ᩳ:I

    .line 33
    iput v2, p0, Ll/ۚ֫ܽ;->ܽ:I

    .line 34
    iput p1, p0, Ll/ۚ֫ܽ;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-nez p1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 169
    :goto_0
    const-class v2, Ll/ۚ֫ܽ;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    if-eqz p1, :cond_7

    .line 75
    check-cast p1, Ll/ۚ֫ܽ;

    .line 77
    iget v1, p0, Ll/ۚ֫ܽ;->ۧ:I

    iget v3, p1, Ll/ۚ֫ܽ;->ۧ:I

    if-eq v1, v3, :cond_3

    return v2

    .line 78
    :cond_3
    iget v1, p0, Ll/ۚ֫ܽ;->ᩳ:I

    iget v3, p1, Ll/ۚ֫ܽ;->ᩳ:I

    if-eq v1, v3, :cond_4

    return v2

    .line 79
    :cond_4
    iget v1, p0, Ll/ۚ֫ܽ;->ܽ:I

    iget v3, p1, Ll/ۚ֫ܽ;->ܽ:I

    if-eq v1, v3, :cond_5

    return v2

    .line 80
    :cond_5
    iget v1, p0, Ll/ۚ֫ܽ;->֫:I

    iget p1, p1, Ll/ۚ֫ܽ;->֫:I

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0

    .line 75
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type androidx.window.core.Bounds"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hashCode()I
    .locals 2

    .line 87
    iget v0, p0, Ll/ۚ֫ܽ;->ۧ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۚ֫ܽ;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 88
    iget v1, p0, Ll/ۚ֫ܽ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 89
    iget v1, p0, Ll/ۚ֫ܽ;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bounds { ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۚ֫ܽ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۚ֫ܽ;->ᩳ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ۚ֫ܽ;->ܽ:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۚ֫ܽ;->֫:I

    const-string v2, "] }"

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 2

    .line 53
    iget v0, p0, Ll/ۚ֫ܽ;->֫:I

    iget v1, p0, Ll/ۚ֫ܽ;->ᩳ:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 31
    iget v0, p0, Ll/ۚ֫ܽ;->ۧ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 32
    iget v0, p0, Ll/ۚ֫ܽ;->ᩳ:I

    return v0
.end method

.method public final ܿ()Landroid/graphics/Rect;
    .locals 5

    .line 41
    new-instance v0, Landroid/graphics/Rect;

    iget v1, p0, Ll/ۚ֫ܽ;->ܽ:I

    iget v2, p0, Ll/ۚ֫ܽ;->֫:I

    iget v3, p0, Ll/ۚ֫ܽ;->ۧ:I

    iget v4, p0, Ll/ۚ֫ܽ;->ᩳ:I

    invoke-direct {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 47
    iget v0, p0, Ll/ۚ֫ܽ;->ܽ:I

    iget v1, p0, Ll/ۚ֫ܽ;->ۧ:I

    sub-int/2addr v0, v1

    return v0
.end method
