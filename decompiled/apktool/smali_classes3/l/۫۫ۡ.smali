.class public final Ll/۫۫ۡ;
.super Ljava/lang/Object;
.source "CBJR"


# instance fields
.field public final ֫:[Z

.field public final ۧ:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 12

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 15
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 16
    iput v8, p0, Ll/۫۫ۡ;->ۧ:I

    mul-int v0, v8, v9

    .line 17
    new-array v0, v0, [Z

    iput-object v0, p0, Ll/۫۫ۡ;->֫:[Z

    .line 18
    new-array v10, v8, [I

    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v9, :cond_2

    const/4 v4, 0x0

    const/4 v7, 0x1

    const/4 v2, 0x0

    move-object v0, p1

    move-object v1, v10

    move v3, v8

    move v5, v11

    move v6, v8

    .line 20
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    mul-int v0, v11, v8

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v8, :cond_1

    .line 23
    aget v2, v10, v1

    .line 24
    iget-object v3, p0, Ll/۫۫ۡ;->֫:[Z

    add-int v4, v0, v1

    ushr-int/lit8 v2, v2, 0x18

    sget v5, Ll/ۤ۫ۡ;->֫:I

    if-lt v2, v5, :cond_0

    const/4 v2, 0x1

    goto :goto_2

    :cond_0
    const/4 v2, 0x0

    :goto_2
    aput-boolean v2, v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(II)Z
    .locals 1

    .line 30
    iget v0, p0, Ll/۫۫ۡ;->ۧ:I

    mul-int p2, p2, v0

    add-int/2addr p2, p1

    iget-object p1, p0, Ll/۫۫ۡ;->֫:[Z

    aget-boolean p1, p1, p2

    return p1
.end method
