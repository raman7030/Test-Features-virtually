.class public final Ll/ۢ֫᩷;
.super Ljava/lang/Object;
.source "19LE"


# instance fields
.field public ֫:Landroid/graphics/Bitmap;

.field public ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    .line 28
    invoke-direct {p0, p1}, Ll/ۢ֫᩷;->֫([B)V

    const/4 v0, 0x0

    .line 29
    array-length v1, p1

    invoke-static {p1, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    return-void

    .line 31
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Decode bitmap failed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫([I)Ljava/util/ArrayList;
    .locals 7

    .line 319
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 320
    array-length v1, p0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    .line 324
    aget v5, p0, v3

    .line 325
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    if-nez v6, :cond_0

    const/4 v5, 0x0

    :cond_0
    const/high16 v6, -0x1000000

    if-ne v5, v6, :cond_1

    if-nez v4, :cond_2

    const/4 v2, 0x1

    move v2, v3

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    if-nez v5, :cond_3

    if-eqz v4, :cond_2

    .line 336
    new-instance v4, Ll/ۙ۟ۜ;

    invoke-direct {v4, v2, v3}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x0

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    return-object p0

    :cond_4
    if-eqz v4, :cond_5

    .line 343
    new-instance p0, Ll/ۙ۟ۜ;

    invoke-direct {p0, v2, v1}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object v0
.end method

.method private ֫([B)V
    .locals 6

    .line 36
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p1}, Ll/۬ۜܽ;-><init>([B)V

    const p1, 0x474e5089

    .line 37
    invoke-static {v0, p1}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    const p1, 0xa1a0a0d

    .line 38
    invoke-static {v0, p1}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    const/4 p1, 0x0

    .line 40
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    .line 41
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۘ()I

    move-result v1

    .line 42
    new-instance v2, Ll/ܳ֫᩷;

    invoke-direct {v2}, Ll/ܳ֫᩷;-><init>()V

    .line 43
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    iput v3, v2, Ll/ܳ֫᩷;->ܽ:I

    .line 211
    new-array v3, v1, [B

    .line 212
    invoke-virtual {v0, v1, v3}, Ll/۬ۜܽ;->֫(I[B)V

    .line 44
    iput-object v3, v2, Ll/ܳ֫᩷;->ۧ:[B

    .line 45
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۘ()I

    move-result v1

    iput v1, v2, Ll/ܳ֫᩷;->֫:I

    .line 46
    iget-object v1, p0, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    iget v1, v2, Ll/ܳ֫᩷;->ܽ:I

    const v2, 0x54414449

    if-ne v1, v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    return-void

    .line 52
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Data chunk not found"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ljava/io/BufferedOutputStream;)V
    .locals 16

    move-object/from16 v0, p0

    .line 79
    iget-object v1, v0, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    .line 80
    iget-object v2, v0, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    add-int/lit8 v3, v1, 0x2

    add-int/lit8 v4, v2, 0x2

    .line 81
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 82
    new-instance v10, Landroid/graphics/Canvas;

    invoke-direct {v10, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 83
    new-instance v11, Landroid/graphics/Paint;

    invoke-direct {v11}, Landroid/graphics/Paint;-><init>()V

    const/4 v4, 0x0

    .line 84
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 85
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 86
    iget-object v4, v0, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v10, v4, v5, v5, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 87
    invoke-virtual {v10, v5, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 88
    invoke-virtual/range {p0 .. p0}, Ll/ۢ֫᩷;->ᩳ()Ll/۫۟ۜ;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 89
    iget-object v12, v4, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    iget-object v13, v4, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    iget-object v14, v4, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    const/high16 v4, -0x1000000

    .line 90
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 91
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙ۟ۜ;

    .line 92
    iget v5, v4, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v5, v5

    iget v4, v4, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v7, v4

    const/4 v8, 0x0

    const/high16 v6, -0x40800000    # -1.0f

    move-object v4, v10

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۙ۟ۜ;

    .line 95
    iget v5, v4, Ll/ۙ۟ۜ;->᩹:I

    int-to-float v6, v5

    iget v4, v4, Ll/ۙ۟ۜ;->᩸:I

    int-to-float v8, v4

    const/high16 v5, -0x40800000    # -1.0f

    const/4 v7, 0x0

    move-object v4, v10

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 188
    :cond_1
    invoke-static {v14, v13, v1, v2}, Ll/۫۟ۜ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v12, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 99
    iget v4, v12, Landroid/graphics/Rect;->left:I

    int-to-float v5, v4

    int-to-float v6, v2

    iget v4, v12, Landroid/graphics/Rect;->right:I

    sub-int v4, v1, v4

    int-to-float v7, v4

    add-int/lit8 v4, v2, 0x1

    int-to-float v8, v4

    move-object v4, v10

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    int-to-float v5, v1

    .line 100
    iget v4, v12, Landroid/graphics/Rect;->top:I

    int-to-float v6, v4

    add-int/lit8 v4, v1, 0x1

    int-to-float v7, v4

    iget v4, v12, Landroid/graphics/Rect;->bottom:I

    sub-int v4, v2, v4

    int-to-float v8, v4

    move-object v4, v10

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 103
    :cond_2
    invoke-virtual/range {p0 .. p0}, Ll/ۢ֫᩷;->ܿ()Ll/ܿ֫᩷;

    move-result-object v12

    if-eqz v12, :cond_3

    const/high16 v4, -0x10000

    .line 105
    invoke-virtual {v11, v4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v13, v2

    .line 106
    iget v4, v12, Ll/ܿ֫᩷;->ۧ:I

    int-to-float v7, v4

    add-int/lit8 v4, v2, 0x1

    int-to-float v14, v4

    const/4 v5, 0x0

    move-object v4, v10

    move v6, v13

    move v8, v14

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 107
    iget v4, v12, Ll/ܿ֫᩷;->ܽ:I

    sub-int v4, v1, v4

    int-to-float v5, v4

    int-to-float v15, v1

    move-object v4, v10

    move v7, v15

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int/lit8 v1, v1, 0x1

    int-to-float v1, v1

    .line 108
    iget v4, v12, Ll/ܿ֫᩷;->ᩳ:I

    int-to-float v8, v4

    const/4 v6, 0x0

    move-object v4, v10

    move v5, v15

    move v7, v1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 109
    iget v4, v12, Ll/ܿ֫᩷;->ᩳ:I

    sub-int/2addr v2, v4

    int-to-float v6, v2

    move-object v4, v10

    move v8, v13

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 111
    :cond_3
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    move-object/from16 v4, p1

    invoke-virtual {v3, v1, v2, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    return-void
.end method

.method public final ֫(Ll/۫۟ۜ;)V
    .locals 5

    .line 132
    iget-object v0, p0, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Ll/۫۟ۜ;->֫(Landroid/graphics/Bitmap;)V

    .line 133
    iget-object v0, p0, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0}, Ll/۫۟ۜ;->ۧ(Landroid/graphics/Bitmap;)V

    .line 134
    iget-object v0, p0, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const v3, 0x6354706e

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֫᩷;

    .line 135
    iget v4, v2, Ll/ܳ֫᩷;->ܽ:I

    if-ne v4, v3, :cond_0

    .line 136
    invoke-virtual {p1}, Ll/۫۟ۜ;->֫()[B

    move-result-object p1

    iput-object p1, v2, Ll/ܳ֫᩷;->ۧ:[B

    .line 137
    invoke-virtual {v2}, Ll/ܳ֫᩷;->֫()V

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 141
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 142
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֫᩷;

    iget v2, v2, Ll/ܳ֫᩷;->ܽ:I

    const v4, 0x54414449

    if-ne v2, v4, :cond_2

    .line 143
    new-instance v2, Ll/ܳ֫᩷;

    invoke-direct {v2}, Ll/ܳ֫᩷;-><init>()V

    .line 144
    iput v3, v2, Ll/ܳ֫᩷;->ܽ:I

    .line 145
    invoke-virtual {p1}, Ll/۫۟ۜ;->֫()[B

    move-result-object p1

    iput-object p1, v2, Ll/ܳ֫᩷;->ۧ:[B

    .line 146
    invoke-virtual {v2}, Ll/ܳ֫᩷;->֫()V

    .line 147
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ܿ֫᩷;)V
    .locals 5

    .line 166
    iget-object v0, p0, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    if-nez p1, :cond_0

    .line 167
    new-instance p1, Ll/᩷֫᩷;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Ll/᩷֫᩷;-><init>(I)V

    invoke-static {v0, p1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void

    .line 170
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const v3, 0x624c706e

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֫᩷;

    .line 171
    iget v4, v2, Ll/ܳ֫᩷;->ܽ:I

    if-ne v4, v3, :cond_1

    .line 172
    invoke-virtual {p1}, Ll/ܿ֫᩷;->֫()[B

    move-result-object p1

    iput-object p1, v2, Ll/ܳ֫᩷;->ۧ:[B

    .line 173
    invoke-virtual {v2}, Ll/ܳ֫᩷;->֫()V

    return-void

    :cond_2
    const/4 v1, 0x0

    .line 177
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 178
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֫᩷;

    iget v2, v2, Ll/ܳ֫᩷;->ܽ:I

    const v4, 0x54414449

    if-ne v2, v4, :cond_3

    .line 179
    new-instance v2, Ll/ܳ֫᩷;

    invoke-direct {v2}, Ll/ܳ֫᩷;-><init>()V

    .line 180
    iput v3, v2, Ll/ܳ֫᩷;->ܽ:I

    .line 181
    invoke-virtual {p1}, Ll/ܿ֫᩷;->֫()[B

    move-result-object p1

    iput-object p1, v2, Ll/ܳ֫᩷;->ۧ:[B

    .line 182
    invoke-virtual {v2}, Ll/ܳ֫᩷;->֫()V

    .line 183
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final ֫()Z
    .locals 29

    move-object/from16 v1, p0

    .line 199
    iget-object v0, v1, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ֫᩷;

    .line 200
    iget v3, v3, Ll/ܳ֫᩷;->ܽ:I

    const v5, 0x6354706e

    if-ne v3, v5, :cond_0

    goto/16 :goto_5

    .line 204
    :cond_1
    iget-object v2, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    .line 205
    iget-object v3, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    const/4 v13, 0x3

    if-lt v2, v13, :cond_12

    if-ge v3, v13, :cond_2

    goto/16 :goto_5

    .line 210
    :cond_2
    iget-object v5, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {v5, v4, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v5

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_5

    .line 213
    :cond_3
    iget-object v5, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    add-int/lit8 v14, v3, -0x1

    invoke-virtual {v5, v4, v14}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v5

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_5

    .line 216
    :cond_4
    iget-object v5, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    add-int/lit8 v15, v2, -0x1

    invoke-virtual {v5, v15, v4}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v5

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_5

    .line 219
    :cond_5
    iget-object v5, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {v5, v15, v14}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v5

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    if-eqz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    add-int/lit8 v12, v2, -0x2

    .line 222
    new-array v11, v12, [I

    add-int/lit8 v10, v3, -0x2

    .line 223
    new-array v9, v10, [I

    .line 224
    iget-object v5, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/4 v7, 0x0

    const/16 v18, 0x1

    move-object v6, v11

    move v8, v2

    move-object/from16 v24, v9

    move/from16 v9, v18

    move/from16 v25, v10

    move/from16 v10, v16

    move-object/from16 v26, v11

    move v11, v12

    move/from16 v27, v12

    move/from16 v12, v17

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 225
    iget-object v5, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    const/16 v21, 0x1

    const/16 v22, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move-object/from16 v16, v5

    move-object/from16 v17, v24

    move/from16 v23, v25

    invoke-virtual/range {v16 .. v23}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 226
    invoke-static/range {v26 .. v26}, Ll/ۢ֫᩷;->֫([I)Ljava/util/ArrayList;

    move-result-object v12

    .line 227
    invoke-static/range {v24 .. v24}, Ll/ۢ֫᩷;->֫([I)Ljava/util/ArrayList;

    move-result-object v11

    if-eqz v12, :cond_12

    if-nez v11, :cond_7

    goto/16 :goto_5

    .line 231
    :cond_7
    iget-object v5, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    const/4 v9, 0x1

    const/16 v16, 0x1

    const/4 v7, 0x0

    move-object/from16 v6, v26

    move v8, v2

    move v10, v14

    move-object v14, v11

    move/from16 v11, v27

    move-object/from16 v28, v12

    move/from16 v12, v16

    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 232
    iget-object v5, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    const/16 v20, 0x1

    const/16 v21, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x1

    move v6, v15

    move-object v15, v5

    move-object/from16 v16, v24

    move/from16 v19, v6

    move/from16 v22, v25

    invoke-virtual/range {v15 .. v22}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 233
    new-instance v5, Ll/ܿ֫᩷;

    invoke-direct {v5}, Ll/ܿ֫᩷;-><init>()V

    .line 235
    invoke-static/range {v26 .. v26}, Ll/᩹۬ᩴ;->stream([I)Ll/ۧ᩺ᩴ;

    move-result-object v6

    new-instance v7, Ll/᩻֫᩷;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-interface {v6, v7}, Ll/ۧ᩺ᩴ;->allMatch(Ljava/util/function/IntPredicate;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto/16 :goto_5

    .line 238
    :cond_8
    invoke-static/range {v24 .. v24}, Ll/᩹۬ᩴ;->stream([I)Ll/ۧ᩺ᩴ;

    move-result-object v6

    new-instance v7, Ll/ۜ֫᩷;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    invoke-interface {v6, v7}, Ll/ۧ᩺ᩴ;->allMatch(Ljava/util/function/IntPredicate;)Z

    move-result v6

    if-eqz v6, :cond_9

    goto/16 :goto_5

    :cond_9
    const/4 v6, 0x0

    :goto_0
    const/high16 v7, -0x10000

    const/4 v8, 0x1

    move/from16 v9, v27

    if-ge v6, v9, :cond_a

    .line 242
    aget v10, v26, v6

    if-ne v10, v7, :cond_a

    .line 243
    aput v4, v26, v6

    .line 244
    iget v7, v5, Ll/ܿ֫᩷;->ۧ:I

    add-int/2addr v7, v8

    iput v7, v5, Ll/ܿ֫᩷;->ۧ:I

    add-int/lit8 v6, v6, 0x1

    move/from16 v27, v9

    goto :goto_0

    :cond_a
    sub-int/2addr v2, v13

    :goto_1
    if-ltz v2, :cond_b

    .line 250
    aget v6, v26, v2

    if-ne v6, v7, :cond_b

    .line 251
    aput v4, v26, v2

    .line 252
    iget v6, v5, Ll/ܿ֫᩷;->ܽ:I

    add-int/2addr v6, v8

    iput v6, v5, Ll/ܿ֫᩷;->ܽ:I

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_b
    const/4 v2, 0x0

    move/from16 v6, v25

    :goto_2
    if-ge v2, v6, :cond_c

    .line 258
    aget v10, v24, v2

    if-ne v10, v7, :cond_c

    .line 259
    aput v4, v24, v2

    .line 260
    iget v10, v5, Ll/ܿ֫᩷;->ᩳ:I

    add-int/2addr v10, v8

    iput v10, v5, Ll/ܿ֫᩷;->ᩳ:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_c
    sub-int/2addr v3, v13

    :goto_3
    if-ltz v3, :cond_d

    .line 266
    aget v2, v24, v3

    if-ne v2, v7, :cond_d

    .line 267
    aput v4, v24, v3

    .line 268
    iget v2, v5, Ll/ܿ֫᩷;->֫:I

    add-int/2addr v2, v8

    iput v2, v5, Ll/ܿ֫᩷;->֫:I

    add-int/lit8 v3, v3, -0x1

    goto :goto_3

    .line 33
    :cond_d
    iget v2, v5, Ll/ܿ֫᩷;->ۧ:I

    if-nez v2, :cond_e

    iget v2, v5, Ll/ܿ֫᩷;->ᩳ:I

    if-nez v2, :cond_e

    iget v2, v5, Ll/ܿ֫᩷;->ܽ:I

    if-nez v2, :cond_e

    iget v2, v5, Ll/ܿ֫᩷;->֫:I

    if-nez v2, :cond_e

    const/4 v5, 0x0

    .line 276
    :cond_e
    invoke-static/range {v26 .. v26}, Ll/ۢ֫᩷;->֫([I)Ljava/util/ArrayList;

    move-result-object v2

    .line 277
    invoke-static/range {v24 .. v24}, Ll/ۢ֫᩷;->֫([I)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v2, :cond_12

    if-eqz v3, :cond_12

    .line 278
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-gt v7, v8, :cond_12

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-le v7, v8, :cond_f

    goto/16 :goto_5

    .line 282
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-eq v7, v10, :cond_10

    goto/16 :goto_5

    .line 285
    :cond_10
    new-instance v7, Ll/۫۟ۜ;

    invoke-direct {v7}, Ll/۫۟ۜ;-><init>()V

    .line 286
    iget-object v10, v7, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    move-object/from16 v11, v28

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 287
    iget-object v10, v7, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 288
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_11

    .line 192
    iget-object v2, v7, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    iget-object v3, v7, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    iget-object v10, v7, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {v3, v10, v9, v6}, Ll/۫۟ۜ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_4

    .line 291
    :cond_11
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ۟ۜ;

    .line 292
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ۟ۜ;

    .line 293
    iget-object v10, v7, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    iget v11, v2, Ll/ۙ۟ۜ;->᩹:I

    iput v11, v10, Landroid/graphics/Rect;->left:I

    .line 294
    iget v2, v2, Ll/ۙ۟ۜ;->᩸:I

    sub-int v12, v9, v2

    iput v12, v10, Landroid/graphics/Rect;->right:I

    .line 295
    iget v2, v3, Ll/ۙ۟ۜ;->᩹:I

    iput v2, v10, Landroid/graphics/Rect;->top:I

    .line 296
    iget v2, v3, Ll/ۙ۟ۜ;->᩸:I

    sub-int v2, v6, v2

    iput v2, v10, Landroid/graphics/Rect;->bottom:I

    .line 298
    :goto_4
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v9, v6, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 299
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 300
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 301
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 302
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 303
    iget-object v4, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    const/high16 v9, -0x40800000    # -1.0f

    invoke-virtual {v3, v4, v9, v9, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 304
    iput-object v2, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    .line 306
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 307
    iget-object v3, v1, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    sget-object v4, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v6, 0x64

    invoke-virtual {v3, v4, v6, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 308
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 309
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ۢ֫᩷;->֫([B)V

    .line 310
    invoke-virtual {v1, v7}, Ll/ۢ֫᩷;->֫(Ll/۫۟ۜ;)V

    .line 311
    invoke-virtual {v1, v5}, Ll/ۢ֫᩷;->֫(Ll/ܿ֫᩷;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v8

    :catch_0
    move-exception v0

    .line 313
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :cond_12
    :goto_5
    return v4
.end method

.method public final ۧ()[B
    .locals 4

    .line 58
    iget-object v0, p0, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/16 v2, 0x8

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܳ֫᩷;

    .line 59
    iget-object v3, v3, Ll/ܳ֫᩷;->ۧ:[B

    array-length v3, v3

    add-int/lit8 v3, v3, 0xc

    add-int/2addr v2, v3

    goto :goto_0

    .line 61
    :cond_0
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1, v2}, Ll/ۤۜܽ;-><init>(I)V

    const v2, 0x474e5089

    .line 68
    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    const v2, 0xa1a0a0d

    .line 69
    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳ֫᩷;

    .line 71
    iget-object v3, v2, Ll/ܳ֫᩷;->ۧ:[B

    array-length v3, v3

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->ۧ(I)V

    .line 72
    iget v3, v2, Ll/ܳ֫᩷;->ܽ:I

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 73
    iget-object v3, v2, Ll/ܳ֫᩷;->ۧ:[B

    invoke-virtual {v1, v3}, Ll/ۤۜܽ;->write([B)V

    .line 74
    iget v2, v2, Ll/ܳ֫᩷;->֫:I

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->ۧ(I)V

    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v1}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 3

    .line 190
    iget-object v0, p0, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ֫᩷;

    .line 191
    iget v1, v1, Ll/ܳ֫᩷;->ܽ:I

    const v2, 0x6354706e

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Landroid/graphics/Bitmap;
    .locals 1

    .line 349
    iget-object v0, p0, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final ܿ()Ll/ܿ֫᩷;
    .locals 4

    .line 155
    iget-object v0, p0, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ֫᩷;

    .line 156
    iget v2, v1, Ll/ܳ֫᩷;->ܽ:I

    const v3, 0x624c706e

    if-ne v2, v3, :cond_0

    .line 157
    new-instance v0, Ll/ܿ֫᩷;

    invoke-direct {v0}, Ll/ܿ֫᩷;-><init>()V

    .line 158
    iget-object v1, v1, Ll/ܳ֫᩷;->ۧ:[B

    .line 15
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, v1}, Ll/۬ۜܽ;-><init>([B)V

    .line 16
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, v0, Ll/ܿ֫᩷;->ۧ:I

    .line 17
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, v0, Ll/ܿ֫᩷;->ᩳ:I

    .line 18
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, v0, Ll/ܿ֫᩷;->ܽ:I

    .line 19
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    iput v1, v0, Ll/ܿ֫᩷;->֫:I

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩳ()Ll/۫۟ۜ;
    .locals 11

    .line 116
    iget-object v0, p0, Ll/ۢ֫᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ֫᩷;

    .line 117
    iget v2, v1, Ll/ܳ֫᩷;->ܽ:I

    const v3, 0x6354706e

    if-ne v2, v3, :cond_0

    .line 118
    new-instance v0, Ll/۫۟ۜ;

    invoke-direct {v0}, Ll/۫۟ۜ;-><init>()V

    .line 119
    iget-object v1, v1, Ll/ܳ֫᩷;->ۧ:[B

    .line 38
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, v1}, Ll/۬ۜܽ;-><init>([B)V

    const/4 v1, 0x1

    .line 39
    invoke-virtual {v2, v1}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 40
    invoke-virtual {v2}, Ll/۬ۜܽ;->readByte()B

    move-result v1

    .line 41
    invoke-virtual {v2}, Ll/۬ۜܽ;->readByte()B

    move-result v3

    .line 42
    invoke-virtual {v2}, Ll/۬ۜܽ;->readByte()B

    move-result v4

    .line 43
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    .line 44
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    .line 45
    iget-object v7, v0, Ll/۫۟ۜ;->ۧ:Landroid/graphics/Rect;

    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v8

    iput v8, v7, Landroid/graphics/Rect;->left:I

    .line 46
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v8

    iput v8, v7, Landroid/graphics/Rect;->right:I

    .line 47
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v8

    iput v8, v7, Landroid/graphics/Rect;->top:I

    .line 48
    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v8

    iput v8, v7, Landroid/graphics/Rect;->bottom:I

    .line 49
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v7

    int-to-long v8, v5

    .line 50
    invoke-virtual {v2, v8, v9}, Ll/۬ۜܽ;->seek(J)V

    .line 51
    div-int/lit8 v1, v1, 0x2

    :goto_0
    if-lez v1, :cond_1

    .line 52
    iget-object v5, v0, Ll/۫۟ۜ;->ܽ:Ljava/util/ArrayList;

    new-instance v8, Ll/ۙ۟ۜ;

    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v9

    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v10

    invoke-direct {v8, v9, v10}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    int-to-long v5, v6

    .line 54
    invoke-virtual {v2, v5, v6}, Ll/۬ۜܽ;->seek(J)V

    .line 55
    div-int/lit8 v3, v3, 0x2

    :goto_1
    if-lez v3, :cond_2

    .line 56
    iget-object v1, v0, Ll/۫۟ۜ;->ᩳ:Ljava/util/ArrayList;

    new-instance v5, Ll/ۙ۟ۜ;

    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v6

    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v8

    invoke-direct {v5, v6, v8}, Ll/ۙ۟ۜ;-><init>(II)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    int-to-long v5, v7

    .line 58
    invoke-virtual {v2, v5, v6}, Ll/۬ۜܽ;->seek(J)V

    .line 59
    new-array v1, v4, [I

    iput-object v1, v0, Ll/۫۟ۜ;->֫:[I

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v4, :cond_3

    .line 61
    iget-object v3, v0, Ll/۫۟ۜ;->֫:[I

    invoke-virtual {v2}, Ll/۬ۜܽ;->ۘ()I

    move-result v5

    aput v5, v3, v1

    add-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    goto :goto_2

    .line 120
    :cond_3
    iget-object v1, p0, Ll/ۢ֫᩷;->֫:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ll/۫۟ۜ;->֫(Landroid/graphics/Bitmap;)V

    return-object v0

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method
