.class public final Ll/۫۠ۧ;
.super Ljava/lang/Object;
.source "V2SC"


# instance fields
.field public final ֫:Landroid/graphics/Bitmap;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܳ:Ljava/util/ArrayList;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 616
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 604
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۫۠ۧ;->ܳ:Ljava/util/ArrayList;

    const/16 v1, 0x10

    .line 606
    iput v1, p0, Ll/۫۠ۧ;->ܽ:I

    const/16 v1, 0x3100

    .line 607
    iput v1, p0, Ll/۫۠ۧ;->ᩳ:I

    const/4 v1, -0x1

    .line 608
    iput v1, p0, Ll/۫۠ۧ;->ܿ:I

    .line 610
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/۫۠ۧ;->ۧ:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    .line 617
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 620
    sget-object v2, Ll/ۨ۠ۧ;->ܳ:Ll/ۤ۠ۧ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    iput-object p1, p0, Ll/۫۠ۧ;->֫:Landroid/graphics/Bitmap;

    .line 625
    sget-object p1, Ll/᩺۠ۧ;->᩻:Ll/᩺۠ۧ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 626
    sget-object p1, Ll/᩺۠ۧ;->᩷:Ll/᩺۠ۧ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    sget-object p1, Ll/᩺۠ۧ;->ܿ:Ll/᩺۠ۧ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 628
    sget-object p1, Ll/᩺۠ۧ;->ܳ:Ll/᩺۠ۧ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    sget-object p1, Ll/᩺۠ۧ;->ۜ:Ll/᩺۠ۧ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 630
    sget-object p1, Ll/᩺۠ۧ;->ᩳ:Ll/᩺۠ۧ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 618
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Bitmap is not valid"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ۨ۠ۧ;
    .locals 12

    .line 793
    iget-object v0, p0, Ll/۫۠ۧ;->֫:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_5

    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    .line 915
    iget v3, p0, Ll/۫۠ۧ;->ᩳ:I

    if-lez v3, :cond_0

    .line 916
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    mul-int v5, v5, v4

    if-le v5, v3, :cond_1

    int-to-double v1, v3

    int-to-double v3, v5

    div-double/2addr v1, v3

    .line 918
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    goto :goto_0

    .line 920
    :cond_0
    iget v3, p0, Ll/۫۠ۧ;->ܿ:I

    if-lez v3, :cond_1

    .line 921
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-le v4, v3, :cond_1

    int-to-double v1, v3

    int-to-double v3, v4

    div-double/2addr v1, v3

    :cond_1
    :goto_0
    const-wide/16 v3, 0x0

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_2

    move-object v1, v0

    goto :goto_1

    .line 933
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    int-to-double v3, v3

    mul-double v3, v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    .line 934
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    int-to-double v4, v4

    mul-double v4, v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    const/4 v2, 0x0

    .line 932
    invoke-static {v0, v3, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 817
    :goto_1
    new-instance v10, Ll/ۗ۠ۧ;

    .line 885
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 886
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    mul-int v2, v8, v9

    .line 887
    new-array v11, v2, [I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, v1

    move-object v3, v11

    move v5, v8

    .line 888
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 820
    iget-object v2, p0, Ll/۫۠ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v3, v3, [Ll/ۤ۠ۧ;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/ۤ۠ۧ;

    :goto_2
    iget v3, p0, Ll/۫۠ۧ;->ܽ:I

    invoke-direct {v10, v11, v3, v2}, Ll/ۗ۠ۧ;-><init>([II[Ll/ۤ۠ۧ;)V

    if-eq v1, v0, :cond_4

    .line 824
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 841
    :cond_4
    new-instance v0, Ll/ۨ۠ۧ;

    iget-object v1, p0, Ll/۫۠ۧ;->ܳ:Ljava/util/ArrayList;

    iget-object v2, v10, Ll/ۗ۠ۧ;->ᩳ:Ljava/util/ArrayList;

    invoke-direct {v0, v2, v1}, Ll/ۨ۠ۧ;-><init>(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 843
    invoke-virtual {v0}, Ll/ۨ۠ۧ;->֫()V

    return-object v0

    .line 837
    :cond_5
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method
