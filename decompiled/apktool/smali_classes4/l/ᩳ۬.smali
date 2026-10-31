.class public final Ll/ᩳ۬;
.super Ljava/lang/Object;
.source "T30P"


# static fields
.field public static final ֫:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ᩳ۬;->֫:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static ֫(Landroid/text/TextPaint;Ljava/lang/String;)Z
    .locals 9

    .line 53
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 54
    invoke-static {p0, p1}, Ll/ܽ۬;->֫(Landroid/graphics/Paint;Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 56
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    .line 58
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\udb3f\udffd"

    .line 63
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    const-string v5, "m"

    .line 64
    invoke-virtual {p0, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    .line 66
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v6

    const/4 v7, 0x0

    cmpl-float v8, v6, v7

    if-nez v8, :cond_2

    goto :goto_1

    .line 73
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {p1, v2, v8}, Ljava/lang/String;->codePointCount(II)I

    move-result v8

    if-le v8, v1, :cond_5

    const/high16 v8, 0x40000000    # 2.0f

    mul-float v5, v5, v8

    cmpl-float v5, v6, v5

    if-lez v5, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_4

    .line 93
    invoke-virtual {p1, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v8, v5

    .line 94
    invoke-virtual {p0, p1, v5, v8}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    move-result v5

    add-float/2addr v7, v5

    move v5, v8

    goto :goto_0

    :cond_4
    cmpl-float v5, v6, v7

    if-ltz v5, :cond_5

    :goto_1
    return v2

    :cond_5
    cmpl-float v4, v6, v4

    if-eqz v4, :cond_6

    :goto_2
    return v1

    .line 149
    :cond_6
    sget-object v4, Ll/ᩳ۬;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤۤ;

    if-nez v5, :cond_7

    .line 151
    new-instance v5, Ll/ۤۤ;

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    new-instance v7, Landroid/graphics/Rect;

    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {v5, v6, v7}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_3

    .line 154
    :cond_7
    iget-object v4, v5, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 155
    iget-object v4, v5, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Rect;

    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    .line 110
    :goto_3
    iget-object v4, v5, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    iget-object v5, v5, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v5, Landroid/graphics/Rect;

    const/4 v6, 0x2

    invoke-virtual {p0, v3, v2, v6, v5}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 111
    move-object v3, v4

    check-cast v3, Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v2, v0, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 112
    invoke-virtual {v5, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, v1

    return p0
.end method
