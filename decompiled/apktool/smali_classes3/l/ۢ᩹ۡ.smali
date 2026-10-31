.class public final Ll/ۢ᩹ۡ;
.super Ljava/lang/Object;
.source "J8FY"

# interfaces
.implements Ll/᩹֡ۘ;


# direct methods
.method public static ֫(III)V
    .locals 3

    const-string v0, "Start index ("

    if-ltz p1, :cond_2

    const-string v1, ")"

    if-gt p1, p2, :cond_1

    if-gt p2, p0, :cond_0

    return-void

    .line 77
    :cond_0
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string v0, "End index ("

    const-string v2, ") is greater than array length ("

    .line 0
    invoke-static {v0, p2, v2, v1, p0}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 77
    invoke-direct {p1, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 76
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v2, ") is greater than end index ("

    .line 0
    invoke-static {v0, p1, v2, v1, p2}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 75
    :cond_2
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p2, ") is negative"

    .line 0
    invoke-static {p1, v0, p2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 75
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/view/View;)V
    .locals 4

    const v0, 0x7f0a0420

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Rect;

    .line 19
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public static ֫(Landroid/view/View;IIII)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    :cond_0
    if-ne p2, v0, :cond_1

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    :cond_1
    if-ne p3, v0, :cond_2

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p3

    :cond_2
    if-ne p4, v0, :cond_3

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p4

    .line 54
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public static ۧ(III)V
    .locals 4

    const-string v0, ") is negative"

    if-ltz p1, :cond_2

    if-ltz p2, :cond_1

    sub-int v0, p0, p1

    if-gt p2, v0, :cond_0

    return-void

    .line 105
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Last index ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-long v2, p1

    int-to-long p1, p2

    add-long/2addr v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ") is greater than array length ("

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 104
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Length ("

    .line 0
    invoke-static {p2, p1, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 103
    :cond_2
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    const-string p2, "Offset ("

    .line 0
    invoke-static {p1, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 103
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Landroid/view/View;)V
    .locals 5

    .line 13
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    const v1, 0x7f0a0420

    .line 14
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public ֫(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;
    .locals 1

    .line 22
    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Integer;

    .line 39
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    int-to-float v0, p2

    .line 40
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sub-int/2addr p3, p2

    int-to-float p2, p3

    mul-float p1, p1, p2

    add-float/2addr p1, v0

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
