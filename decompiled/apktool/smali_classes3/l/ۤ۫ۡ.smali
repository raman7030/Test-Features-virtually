.class public final Ll/ۤ۫ۡ;
.super Ljava/lang/Object;
.source "LBKC"


# static fields
.field public static final ֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x42ff0000    # 127.5f

    .line 15
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    sput v0, Ll/ۤ۫ۡ;->֫:I

    return-void
.end method

.method public static ֫(Landroid/graphics/Bitmap;)F
    .locals 6

    .line 22
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 23
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 24
    new-instance v2, Ll/۫۫ۡ;

    invoke-direct {v2, p0}, Ll/۫۫ۡ;-><init>(Landroid/graphics/Bitmap;)V

    const/4 p0, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge p0, v0, :cond_2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_1

    .line 27
    invoke-virtual {v2, p0, v4}, Ll/۫۫ۡ;->֫(II)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v3, v3, 0x1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_2
    int-to-float p0, v3

    mul-int v0, v0, v1

    int-to-float v0, v0

    div-float/2addr p0, v0

    return p0
.end method

.method public static ֫(Landroid/graphics/Bitmap;FIII)V
    .locals 11

    .line 36
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 37
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 38
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    const v3, 0xffffff

    and-int/2addr v3, p4

    .line 39
    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->eraseColor(I)V

    add-int/lit8 v3, v0, -0x1

    add-int/lit8 v4, v1, -0x1

    .line 42
    new-instance v5, Ll/۫۫ۡ;

    invoke-direct {v5, p0}, Ll/۫۫ۡ;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v0, :cond_2

    .line 44
    invoke-virtual {v5, v7, v6}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_0

    add-int v8, v7, p2

    .line 45
    invoke-static {v2, v8, p3, p4}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;III)V

    .line 47
    :cond_0
    invoke-virtual {v5, v7, v4}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_1

    add-int v8, v7, p2

    add-int v9, v4, p3

    .line 48
    invoke-static {v2, v8, v9, p4}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;III)V

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v1, :cond_5

    .line 52
    invoke-virtual {v5, v6, v7}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_3

    add-int v8, v7, p3

    .line 53
    invoke-static {v2, p2, v8, p4}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;III)V

    .line 55
    :cond_3
    invoke-virtual {v5, v3, v7}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_4

    add-int v8, v3, p2

    add-int v9, v7, p3

    .line 56
    invoke-static {v2, v8, v9, p4}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;III)V

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    const/4 v6, 0x1

    :goto_2
    if-ge v6, v3, :cond_9

    const/4 v7, 0x1

    :goto_3
    if-ge v7, v4, :cond_8

    .line 61
    invoke-virtual {v5, v6, v7}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_7

    add-int/lit8 v8, v6, -0x1

    add-int/lit8 v9, v7, -0x1

    .line 62
    invoke-virtual {v5, v8, v9}, Ll/۫۫ۡ;->֫(II)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 63
    invoke-virtual {v5, v6, v9}, Ll/۫۫ۡ;->֫(II)Z

    move-result v10

    if-eqz v10, :cond_6

    add-int/lit8 v10, v6, 0x1

    .line 64
    invoke-virtual {v5, v10, v9}, Ll/۫۫ۡ;->֫(II)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 65
    invoke-virtual {v5, v8, v7}, Ll/۫۫ۡ;->֫(II)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 66
    invoke-virtual {v5, v10, v7}, Ll/۫۫ۡ;->֫(II)Z

    move-result v9

    if-eqz v9, :cond_6

    add-int/lit8 v9, v7, 0x1

    .line 67
    invoke-virtual {v5, v8, v9}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 68
    invoke-virtual {v5, v6, v9}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 69
    invoke-virtual {v5, v10, v9}, Ll/۫۫ۡ;->֫(II)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    add-int v8, v6, p2

    add-int v9, v7, p3

    .line 70
    invoke-static {v2, v8, v9, p4}, Ll/ۤ۫ۡ;->֫(Landroid/graphics/Bitmap;III)V

    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 76
    :cond_9
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object p2

    invoke-static {p2}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object p2

    .line 77
    invoke-static {p2, v2}, Landroid/renderscript/Allocation;->createFromBitmap(Landroid/renderscript/RenderScript;Landroid/graphics/Bitmap;)Landroid/renderscript/Allocation;

    move-result-object p3

    .line 78
    invoke-virtual {p3}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object p4

    invoke-static {p2, p4}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;)Landroid/renderscript/Allocation;

    move-result-object p4

    .line 79
    invoke-static {p2}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v3

    invoke-static {p2, v3}, Landroid/renderscript/ScriptIntrinsicBlur;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicBlur;

    move-result-object v3

    .line 80
    invoke-virtual {v3, p3}, Landroid/renderscript/ScriptIntrinsicBlur;->setInput(Landroid/renderscript/Allocation;)V

    .line 81
    invoke-virtual {v3, p1}, Landroid/renderscript/ScriptIntrinsicBlur;->setRadius(F)V

    .line 82
    invoke-virtual {v3, p4}, Landroid/renderscript/ScriptIntrinsicBlur;->forEach(Landroid/renderscript/Allocation;)V

    .line 83
    invoke-virtual {p4, v2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V

    .line 84
    invoke-virtual {p2}, Landroid/renderscript/RenderScript;->destroy()V

    const/4 p1, 0x0

    :goto_4
    if-ge p1, v0, :cond_e

    const/4 p2, 0x0

    :goto_5
    if-ge p2, v1, :cond_d

    .line 88
    invoke-virtual {p0, p1, p2}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result p3

    .line 89
    invoke-virtual {v2, p1, p2}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result p4

    ushr-int/lit8 v3, p3, 0x18

    .line 90
    sget v4, Ll/ۤ۫ۡ;->֫:I

    if-ge v3, v4, :cond_c

    .line 100
    invoke-static {p3}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-nez v3, :cond_a

    move p3, p4

    goto :goto_6

    .line 103
    :cond_a
    invoke-static {p4}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-nez v3, :cond_b

    goto :goto_6

    .line 35
    :cond_b
    invoke-static {p3, p4}, Ll/۟ۗ;->ۧ(II)I

    move-result p3

    .line 92
    :goto_6
    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Bitmap;->setPixel(III)V

    :cond_c
    add-int/lit8 p2, p2, 0x1

    goto :goto_5

    :cond_d
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    .line 96
    :cond_e
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    return-void
.end method

.method public static ֫(Landroid/graphics/Bitmap;III)V
    .locals 1

    if-ltz p1, :cond_0

    if-ltz p2, :cond_0

    .line 110
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 111
    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Bitmap;->setPixel(III)V

    :cond_0
    return-void
.end method
