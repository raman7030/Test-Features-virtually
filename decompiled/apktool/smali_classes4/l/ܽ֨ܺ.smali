.class public Ll/ܽ֨ܺ;
.super Ljava/lang/Object;
.source "SB7W"


# instance fields
.field public ֫:Ll/۫᩵ܺ;

.field public ۧ:Ljava/util/HashMap;

.field public ܽ:Ll/ۢۚܺ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 94
    iput-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    .line 104
    new-instance v0, Ll/۫᩵ܺ;

    invoke-direct {v0}, Ll/۫᩵ܺ;-><init>()V

    iput-object v0, p0, Ll/ܽ֨ܺ;->֫:Ll/۫᩵ܺ;

    .line 107
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܽ֨ܺ;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;)Ll/ܽ֨ܺ;
    .locals 2

    .line 149
    new-instance v0, Ll/ۗ֨ܺ;

    invoke-direct {v0}, Ll/ۗ֨ܺ;-><init>()V

    const/4 v1, 0x0

    .line 577
    invoke-virtual {v0, p0, v1}, Ll/ۗ֨ܺ;->֫(Ljava/io/InputStream;Z)Ll/ܽ֨ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۘۚܺ;Ljava/lang/String;)Ll/᩵ۚܺ;
    .locals 3

    .line 2352
    move-object v0, p0

    check-cast v0, Ll/᩵ۚܺ;

    .line 2353
    iget-object v1, v0, Ll/᩵ۚܺ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 2355
    :cond_0
    invoke-interface {p0}, Ll/ۘۚܺ;->getChildren()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۚۚܺ;

    .line 2357
    instance-of v1, v0, Ll/᩵ۚܺ;

    if-nez v1, :cond_2

    goto :goto_0

    .line 2359
    :cond_2
    move-object v1, v0

    check-cast v1, Ll/᩵ۚܺ;

    .line 2360
    iget-object v2, v1, Ll/᩵ۚܺ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v1

    .line 2362
    :cond_3
    instance-of v1, v0, Ll/ۘۚܺ;

    if-eqz v1, :cond_1

    .line 2364
    check-cast v0, Ll/ۘۚܺ;

    invoke-static {v0, p1}, Ll/ܽ֨ܺ;->֫(Ll/ۘۚܺ;Ljava/lang/String;)Ll/᩵ۚܺ;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "\""

    .line 962
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 965
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v1, "\\\""

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string v0, "\'"

    .line 967
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 970
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v1, "\\\'"

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :cond_1
    :goto_0
    const-string v0, "\\\n"

    const-string v1, ""

    .line 973
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "\\A"

    const-string v1, "\n"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/io/InputStream;)Ll/ܽ֨ܺ;
    .locals 2

    .line 156
    new-instance v0, Ll/ۗ֨ܺ;

    invoke-direct {v0}, Ll/ۗ֨ܺ;-><init>()V

    const/4 v1, 0x1

    .line 157
    invoke-virtual {v0, p0, v1}, Ll/ۗ֨ܺ;->֫(Ljava/io/InputStream;Z)Ll/ܽ֨ܺ;

    move-result-object p0

    return-object p0
.end method

.method private ᩻()Ll/ܿ֡ܺ;
    .locals 8

    .line 979
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    iget-object v1, v0, Ll/ۢۚܺ;->֡:Ll/֨֡ܺ;

    .line 980
    iget-object v0, v0, Ll/ۢۚܺ;->᩵:Ll/֨֡ܺ;

    const/high16 v2, -0x40800000    # -1.0f

    if-eqz v1, :cond_5

    .line 982
    invoke-virtual {v1}, Ll/֨֡ܺ;->ܽ()Z

    move-result v3

    if-nez v3, :cond_5

    iget-object v3, v1, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    sget-object v4, Ll/۟ۚܺ;->ۤ:Ll/۟ۚܺ;

    if-eq v3, v4, :cond_5

    sget-object v5, Ll/۟ۚܺ;->᩶:Ll/۟ۚܺ;

    if-eq v3, v5, :cond_5

    sget-object v6, Ll/۟ۚܺ;->ۙ:Ll/۟ۚܺ;

    if-ne v3, v6, :cond_0

    goto :goto_2

    :cond_0
    const/high16 v3, 0x42c00000    # 96.0f

    .line 985
    invoke-virtual {v1, v3}, Ll/֨֡ܺ;->֫(F)F

    move-result v1

    if-eqz v0, :cond_3

    .line 989
    invoke-virtual {v0}, Ll/֨֡ܺ;->ܽ()Z

    move-result v7

    if-nez v7, :cond_2

    iget-object v7, v0, Ll/֨֡ܺ;->᩸:Ll/۟ۚܺ;

    if-eq v7, v4, :cond_2

    if-eq v7, v5, :cond_2

    if-ne v7, v6, :cond_1

    goto :goto_0

    .line 992
    :cond_1
    invoke-virtual {v0, v3}, Ll/֨֡ܺ;->֫(F)F

    move-result v0

    goto :goto_1

    .line 990
    :cond_2
    :goto_0
    new-instance v0, Ll/ܿ֡ܺ;

    invoke-direct {v0, v2, v2, v2, v2}, Ll/ܿ֡ܺ;-><init>(FFFF)V

    return-object v0

    .line 996
    :cond_3
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    iget-object v0, v0, Ll/᩸ۚܺ;->ᩴ:Ll/ܿ֡ܺ;

    if-eqz v0, :cond_4

    .line 997
    iget v2, v0, Ll/ܿ֡ܺ;->֫:F

    mul-float v2, v2, v1

    iget v0, v0, Ll/ܿ֡ܺ;->ᩳ:F

    div-float v0, v2, v0

    goto :goto_1

    :cond_4
    move v0, v1

    .line 1002
    :goto_1
    new-instance v2, Ll/ܿ֡ܺ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, v1, v0}, Ll/ܿ֡ܺ;-><init>(FFFF)V

    return-object v2

    .line 983
    :cond_5
    :goto_2
    new-instance v0, Ll/ܿ֡ܺ;

    invoke-direct {v0, v2, v2, v2, v2}, Ll/ܿ֡ܺ;-><init>(FFFF)V

    return-object v0
.end method


# virtual methods
.method public final ֫(II)Landroid/graphics/Picture;
    .locals 5

    .line 437
    new-instance v0, Landroid/graphics/Picture;

    invoke-direct {v0}, Landroid/graphics/Picture;-><init>()V

    .line 438
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v1

    .line 441
    new-instance v2, Ll/ᩳ֡ܺ;

    invoke-direct {v2}, Ll/ᩳ֡ܺ;-><init>()V

    int-to-float p1, p1

    int-to-float p2, p2

    .line 203
    new-instance v3, Ll/ܿ֡ܺ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4, p1, p2}, Ll/ܿ֡ܺ;-><init>(FFFF)V

    iput-object v3, v2, Ll/ᩳ֡ܺ;->֫:Ll/ܿ֡ܺ;

    .line 445
    new-instance p1, Ll/ᩴ֨ܺ;

    const/4 p2, 0x0

    invoke-direct {p1, v1, p2}, Ll/ᩴ֨ܺ;-><init>(Landroid/graphics/Canvas;Z)V

    .line 447
    invoke-virtual {p1, p0, v2}, Ll/ᩴ֨ܺ;->֫(Ll/ܽ֨ܺ;Ll/ᩳ֡ܺ;)V

    .line 449
    invoke-virtual {v0}, Landroid/graphics/Picture;->endRecording()V

    return-object v0
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 1018
    iget-object v0, p0, Ll/ܽ֨ܺ;->֫:Ll/۫᩵ܺ;

    invoke-virtual {v0}, Ll/۫᩵ܺ;->֫()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/᩵ۚܺ;
    .locals 2

    if-nez p1, :cond_0

    goto :goto_2

    .line 950
    :cond_0
    invoke-static {p1}, Ll/ܽ֨ܺ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 951
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_5

    const-string v0, "#"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 953
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 2335
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 2337
    :cond_1
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    iget-object v0, v0, Ll/᩵ۚܺ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2338
    iget-object p1, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    goto :goto_1

    .line 2340
    :cond_2
    iget-object v0, p0, Ll/ܽ֨ܺ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2341
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩵ۚܺ;

    goto :goto_1

    .line 2344
    :cond_3
    iget-object v1, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    invoke-static {v1, p1}, Ll/ܽ֨ܺ;->֫(Ll/ۘۚܺ;Ljava/lang/String;)Ll/᩵ۚܺ;

    move-result-object v1

    .line 2345
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :cond_5
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(F)V
    .locals 2

    .line 780
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    if-eqz v0, :cond_0

    .line 783
    new-instance v1, Ll/֨֡ܺ;

    invoke-direct {v1, p1}, Ll/֨֡ܺ;-><init>(F)V

    iput-object v1, v0, Ll/ۢۚܺ;->᩵:Ll/֨֡ܺ;

    return-void

    .line 781
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SVG document is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(FF)V
    .locals 3

    .line 826
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    if-eqz v0, :cond_0

    .line 829
    new-instance v1, Ll/ܿ֡ܺ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, p1, p2}, Ll/ܿ֡ܺ;-><init>(FFFF)V

    iput-object v1, v0, Ll/᩸ۚܺ;->ᩴ:Ll/ܿ֡ܺ;

    return-void

    .line 827
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "SVG document is empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Landroid/graphics/Canvas;)V
    .locals 5

    .line 539
    new-instance v0, Ll/ᩳ֡ܺ;

    invoke-direct {v0}, Ll/ᩳ֡ܺ;-><init>()V

    .line 214
    iget-object v1, v0, Ll/ᩳ֡ܺ;->֫:Ll/ܿ֡ܺ;

    if-eqz v1, :cond_0

    goto :goto_0

    .line 542
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v2

    int-to-float v2, v2

    .line 203
    new-instance v3, Ll/ܿ֡ܺ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4, v1, v2}, Ll/ܿ֡ܺ;-><init>(FFFF)V

    iput-object v3, v0, Ll/ᩳ֡ܺ;->֫:Ll/ܿ֡ܺ;

    .line 545
    :goto_0
    new-instance v1, Ll/ᩴ֨ܺ;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Ll/ᩴ֨ܺ;-><init>(Landroid/graphics/Canvas;Z)V

    .line 547
    invoke-virtual {v1, p0, v0}, Ll/ᩴ֨ܺ;->֫(Ll/ܽ֨ܺ;Ll/ᩳ֡ܺ;)V

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V
    .locals 5

    .line 514
    new-instance v0, Ll/ᩳ֡ܺ;

    invoke-direct {v0}, Ll/ᩳ֡ܺ;-><init>()V

    .line 517
    iget v1, p2, Landroid/graphics/RectF;->left:F

    iget v2, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p2

    .line 203
    new-instance v4, Ll/ܿ֡ܺ;

    invoke-direct {v4, v1, v2, v3, p2}, Ll/ܿ֡ܺ;-><init>(FFFF)V

    iput-object v4, v0, Ll/ᩳ֡ܺ;->֫:Ll/ܿ֡ܺ;

    .line 522
    new-instance p2, Ll/ᩴ֨ܺ;

    const/4 v1, 0x1

    invoke-direct {p2, p1, v1}, Ll/ᩴ֨ܺ;-><init>(Landroid/graphics/Canvas;Z)V

    .line 524
    invoke-virtual {p2, p0, v0}, Ll/ᩴ֨ܺ;->֫(Ll/ܽ֨ܺ;Ll/ᩳ֡ܺ;)V

    return-void
.end method

.method public final ֫(Ll/ۢۚܺ;)V
    .locals 0

    .line 941
    iput-object p1, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    return-void
.end method

.method public final ֫(Ll/۫᩵ܺ;)V
    .locals 1

    .line 1012
    iget-object v0, p0, Ll/ܽ֨ܺ;->֫:Ll/۫᩵ܺ;

    invoke-virtual {v0, p1}, Ll/۫᩵ܺ;->֫(Ll/۫᩵ܺ;)V

    return-void
.end method

.method public final ۧ()F
    .locals 2

    .line 763
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    if-eqz v0, :cond_0

    .line 766
    invoke-direct {p0}, Ll/ܽ֨ܺ;->᩻()Ll/ܿ֡ܺ;

    move-result-object v0

    iget v0, v0, Ll/ܿ֡ܺ;->֫:F

    return v0

    .line 764
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(F)V
    .locals 2

    .line 723
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    if-eqz v0, :cond_0

    .line 726
    new-instance v1, Ll/֨֡ܺ;

    invoke-direct {v1, p1}, Ll/֨֡ܺ;-><init>(F)V

    iput-object v1, v0, Ll/ۢۚܺ;->֡:Ll/֨֡ܺ;

    return-void

    .line 724
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "SVG document is empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܳ()Z
    .locals 1

    .line 1024
    iget-object v0, p0, Ll/ܽ֨ܺ;->֫:Ll/۫᩵ܺ;

    invoke-virtual {v0}, Ll/۫᩵ܺ;->ۧ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ܽ()Landroid/graphics/RectF;
    .locals 5

    .line 842
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    if-eqz v0, :cond_1

    .line 845
    iget-object v0, v0, Ll/᩸ۚܺ;->ᩴ:Ll/ܿ֡ܺ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 1070
    :cond_0
    new-instance v1, Landroid/graphics/RectF;

    iget v2, v0, Ll/ܿ֡ܺ;->ۧ:F

    iget v3, v0, Ll/ܿ֡ܺ;->ܽ:F

    invoke-virtual {v0}, Ll/ܿ֡ܺ;->֫()F

    move-result v4

    invoke-virtual {v0}, Ll/ܿ֡ܺ;->ۧ()F

    move-result v0

    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    return-object v1

    .line 843
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܿ()Ll/ۢۚܺ;
    .locals 1

    .line 935
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    return-object v0
.end method

.method public final ᩳ()F
    .locals 2

    .line 706
    iget-object v0, p0, Ll/ܽ֨ܺ;->ܽ:Ll/ۢۚܺ;

    if-eqz v0, :cond_0

    .line 709
    invoke-direct {p0}, Ll/ܽ֨ܺ;->᩻()Ll/ܿ֡ܺ;

    move-result-object v0

    iget v0, v0, Ll/ܿ֡ܺ;->ᩳ:F

    return v0

    .line 707
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SVG document is empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
