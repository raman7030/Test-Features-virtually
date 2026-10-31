.class public final Ll/۟᩹ܽ;
.super Landroid/widget/BaseAdapter;
.source "P676"


# instance fields
.field public ۗ:Landroid/graphics/Bitmap;

.field public ۙ:Landroid/graphics/Bitmap;

.field public final synthetic ۤ:Ll/᩷᩶ܽ;

.field public ۫:Landroid/graphics/Bitmap;

.field public ۬:Landroid/graphics/Bitmap;

.field public ᩶:Landroid/graphics/Bitmap;

.field public ᩸:Landroid/graphics/Bitmap;

.field public ᩹:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;)V
    .locals 14

    .line 1334
    iput-object p1, p0, Ll/۟᩹ܽ;->ۤ:Ll/᩷᩶ܽ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 1320
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 1321
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    const/high16 v1, 0x42000000    # 32.0f

    .line 1335
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    const/high16 v3, 0x41800000    # 16.0f

    .line 1336
    invoke-static {v3}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v3

    const/high16 v4, 0x41700000    # 15.0f

    .line 1337
    invoke-static {v4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v4

    .line 1338
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1339
    sget-boolean v5, Ll/᩹֡᩷;->۟:Z

    if-eqz v5, :cond_0

    const/high16 v5, 0x40200000    # 2.5f

    const/high16 v6, 0x50000000

    const/high16 v7, 0x3f800000    # 1.0f

    .line 1340
    invoke-virtual {v0, v5, v7, v7, v6}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 1342
    :cond_0
    sget-object v5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 1343
    sget-object v5, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const/high16 v5, 0x41a00000    # 20.0f

    .line 1344
    invoke-static {v5}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1349
    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v5

    .line 1350
    iget v6, v5, Landroid/graphics/Paint$FontMetrics;->bottom:F

    iget v5, v5, Landroid/graphics/Paint$FontMetrics;->top:F

    sub-float/2addr v6, v5

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    int-to-float v4, v4

    sub-float v5, v4, v5

    sub-float/2addr v5, v6

    const-string v10, "M"

    const-string v11, "J"

    const-string v6, "C"

    const-string v7, "S"

    const-string v8, "I"

    const-string v9, "F"

    .line 1354
    filled-new-array/range {v6 .. v11}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x6

    new-array v8, v7, [Landroid/graphics/Bitmap;

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v7, :cond_1

    .line 1357
    invoke-static {p1}, Ll/᩷᩶ܽ;->ܽ(Ll/᩷᩶ܽ;)[Ll/᩸ۖܳ;

    move-result-object v7

    aget-object v7, v7, v10

    invoke-virtual {v7}, Ll/᩸ۖܳ;->֫()I

    move-result v7

    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 1358
    invoke-static {p1}, Ll/᩷᩶ܽ;->ܽ(Ll/᩷᩶ܽ;)[Ll/᩸ۖܳ;

    move-result-object v7

    aget-object v7, v7, v10

    invoke-virtual {v7}, Ll/᩸ۖܳ;->ۧ()I

    move-result v7

    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 1359
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v1, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 1360
    new-instance v11, Landroid/graphics/Canvas;

    invoke-direct {v11, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    int-to-float v12, v3

    .line 1361
    invoke-virtual {v11, v12, v12, v4, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1362
    aget-object v13, v6, v10

    invoke-virtual {v11, v13, v12, v5, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1363
    aput-object v7, v8, v10

    add-int/lit8 v10, v10, 0x1

    const/4 v7, 0x6

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 1365
    aget-object v2, v8, v9

    iput-object v2, p0, Ll/۟᩹ܽ;->᩸:Landroid/graphics/Bitmap;

    .line 1366
    aget-object p1, v8, p1

    iput-object p1, p0, Ll/۟᩹ܽ;->۫:Landroid/graphics/Bitmap;

    const/4 p1, 0x2

    .line 1367
    aget-object v2, v8, p1

    iput-object v2, p0, Ll/۟᩹ܽ;->᩹:Landroid/graphics/Bitmap;

    const/4 v2, 0x3

    .line 1368
    aget-object v2, v8, v2

    iput-object v2, p0, Ll/۟᩹ܽ;->᩶:Landroid/graphics/Bitmap;

    const/4 v2, 0x4

    .line 1369
    aget-object v2, v8, v2

    iput-object v2, p0, Ll/۟᩹ܽ;->۬:Landroid/graphics/Bitmap;

    const/4 v2, 0x5

    .line 1370
    aget-object v2, v8, v2

    iput-object v2, p0, Ll/۟᩹ܽ;->ۗ:Landroid/graphics/Bitmap;

    .line 1372
    sget-object v2, Ll/᩶ۖܳ;->֫ۧ:Ll/᩸ۖܳ;

    invoke-virtual {v2}, Ll/᩸ۖܳ;->֫()I

    move-result v5

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 1373
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v1, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v5

    iput-object v5, p0, Ll/۟᩹ܽ;->ۙ:Landroid/graphics/Bitmap;

    .line 1374
    new-instance v5, Landroid/graphics/Canvas;

    iget-object v6, p0, Ll/۟᩹ܽ;->ۙ:Landroid/graphics/Bitmap;

    invoke-direct {v5, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    int-to-float v6, v3

    .line 1375
    invoke-virtual {v5, v6, v6, v4, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const v0, 0x7f080121

    .line 1377
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sub-int/2addr v1, v3

    .line 1378
    div-int/2addr v1, p1

    add-int/2addr v3, v1

    .line 1379
    invoke-virtual {v0, v1, v1, v3, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1380
    invoke-virtual {v2}, Ll/᩸ۖܳ;->ۧ()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 1381
    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 3

    .line 1386
    iget-object v0, p0, Ll/۟᩹ܽ;->ۤ:Ll/᩷᩶ܽ;

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩳ᩶ܽ;->ᩳ()Ll/ۜ᩶ܽ;

    move-result-object v1

    .line 1387
    sget-object v2, Ll/ܶ᩹ܽ;->֫:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_0

    .line 1399
    :pswitch_0
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۜ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۛ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v1

    return v0

    .line 1395
    :pswitch_1
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-boolean v1, v1, Ll/ᩳ᩶ܽ;->֫֫:Z

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    if-eqz v1, :cond_0

    iget v0, v0, Ll/ᩳ᩶ܽ;->ܰ:I

    return v0

    :cond_0
    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۢ֫:[Ll/ۨۙ֡;

    array-length v0, v0

    return v0

    .line 1405
    :pswitch_2
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩶ܽ;

    iget-object v0, v0, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 1401
    :pswitch_3
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩷֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ᩳ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v1

    return v0

    :pswitch_4
    const/4 v0, 0x4

    return v0

    .line 1403
    :pswitch_5
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ܳ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩶ܽ;

    iget-object v0, v0, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 1391
    :pswitch_6
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    if-nez v1, :cond_1

    goto :goto_0

    .line 1393
    :cond_1
    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v1, v1, Ll/᩻᩶ܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v0}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v0, v0, Ll/᩻᩶ܽ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/2addr v0, v1

    return v0

    :pswitch_7
    const/4 v0, 0x2

    return v0

    :goto_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    const/4 v0, 0x0

    .line 1422
    iget-object v1, p0, Ll/۟᩹ܽ;->ۤ:Ll/᩷᩶ܽ;

    if-nez p2, :cond_0

    .line 1423
    invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    const v2, 0x7f0d014f

    invoke-virtual {p2, v2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    const p3, 0x7f0a05e4

    .line 1424
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    .line 1425
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const v2, 0x7f0a0278

    .line 1426
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 1427
    invoke-virtual {p3, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const p3, 0x7f0a05ef

    .line 1428
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {v2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1430
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 1435
    invoke-virtual {p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 1436
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 1437
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/16 v4, 0x8

    .line 1438
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1439
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ᩳ᩶ܽ;->ᩳ()Ll/ۜ᩶ܽ;

    move-result-object v5

    .line 1440
    sget-object v6, Ll/ܶ᩹ܽ;->֫:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_2

    .line 1488
    :pswitch_0
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1489
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۜ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 1490
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۛ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۜ֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr p1, v1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۜ֫:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ܶ֡;

    .line 1491
    iget-object v0, p1, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 200
    iget-object v0, v0, Ll/ᩴۙ֡;->۬:Ll/ۨۙ֡;

    .line 1491
    invoke-virtual {v0}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1492
    iget-object p1, p1, Ll/᩺ܶ֡;->᩹:Ll/ᩴۙ֡;

    .line 193
    iget-object p1, p1, Ll/ᩴۙ֡;->۫:Ll/᩺ۙ֡;

    .line 1492
    invoke-virtual {p1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1493
    iget-object p1, p0, Ll/۟᩹ܽ;->᩶:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    .line 1464
    :pswitch_1
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۢ֫:[Ll/ۨۙ֡;

    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v3

    iget-boolean v3, v3, Ll/ᩳ᩶ܽ;->֫֫:Z

    if-eqz v3, :cond_2

    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩺:[I

    aget p1, v1, p1

    :cond_2
    aget-object p1, v0, p1

    invoke-virtual {p1}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1465
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    return-object p2

    .line 1513
    :pswitch_2
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1514
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->᩻֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩶ܽ;

    iget-object v0, v0, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰܶ֡;

    .line 1515
    iget-object v0, p1, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 231
    iget-object v0, v0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    .line 1515
    invoke-virtual {v0}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1516
    iget-object p1, p1, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 224
    iget-object p1, p1, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    .line 1516
    invoke-virtual {p1}, Ll/۬ۙ֡;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1517
    iget-object p1, p0, Ll/۟᩹ܽ;->۬:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    .line 1497
    :pswitch_3
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1498
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->᩷֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_3

    .line 1499
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ᩳ֫:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->᩷֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr p1, v1

    goto :goto_1

    :cond_3
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->᩷֫:Ljava/util/ArrayList;

    :goto_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰܶ֡;

    .line 1500
    iget-object v0, p1, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 231
    iget-object v0, v0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    .line 1500
    invoke-virtual {v0}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1501
    iget-object p1, p1, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 224
    iget-object p1, p1, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    .line 1501
    invoke-virtual {p1}, Ll/۬ۙ֡;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1502
    iget-object p1, p0, Ll/۟᩹ܽ;->۬:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    :pswitch_4
    if-eqz p1, :cond_7

    if-eq p1, v6, :cond_6

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x3

    if-eq p1, v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const p1, 0x7f12022e

    .line 1482
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(I)V

    .line 1483
    iget-object p1, p0, Ll/۟᩹ܽ;->ۗ:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    :cond_5
    const p1, 0x7f12061c

    .line 1478
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(I)V

    .line 1479
    iget-object p1, p0, Ll/۟᩹ܽ;->۬:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    :cond_6
    const p1, 0x7f120389

    .line 1474
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(I)V

    .line 1475
    iget-object p1, p0, Ll/۟᩹ܽ;->᩶:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    :cond_7
    const p1, 0x7f12016f

    .line 1470
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(I)V

    .line 1471
    iget-object p1, p0, Ll/۟᩹ܽ;->᩹:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    .line 1506
    :pswitch_5
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ܳ֫:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩶ܽ;

    iget-object v0, v0, Ll/֡᩶ܽ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧ᩸֡;

    invoke-virtual {p1}, Ll/ۧ᩸֡;->᩷()Ll/᩺ۙ֡;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object p1

    .line 1507
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v6

    invoke-virtual {p1, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 1508
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1509
    iget-object p1, p0, Ll/۟᩹ܽ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    .line 1454
    :pswitch_6
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v0, v0, Ll/᩻᩶ܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_8

    .line 1455
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v0, v0, Ll/᩻᩶ܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻᩶ܽ;

    iget-object p1, p1, Ll/᩻᩶ܽ;->᩶:Ljava/lang/String;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1456
    iget-object p1, p0, Ll/۟᩹ܽ;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    .line 1458
    :cond_8
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v0, v0, Ll/᩻᩶ܽ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr p1, v0

    .line 1459
    invoke-static {v1}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v0, v0, Ll/᩻᩶ܽ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1460
    iget-object p1, p0, Ll/۟᩹ܽ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    :pswitch_7
    if-eqz p1, :cond_a

    if-eq p1, v6, :cond_9

    goto :goto_2

    :cond_9
    const p1, 0x7f120a00

    .line 1448
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(I)V

    .line 1449
    iget-object p1, p0, Ll/۟᩹ܽ;->۫:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-object p2

    :cond_a
    const p1, 0x7f120170

    .line 1444
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(I)V

    .line 1445
    iget-object p1, p0, Ll/۟᩹ܽ;->᩸:Landroid/graphics/Bitmap;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :goto_2
    return-object p2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
