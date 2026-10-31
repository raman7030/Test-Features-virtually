.class public final Ll/᩺ۚ;
.super Ljava/lang/Object;
.source "11CW"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ᩶:Ll/ܰۚ;

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/ܰۚ;Landroid/content/res/XmlResourceParser;)V
    .locals 2

    .line 648
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 640
    iput v0, p0, Ll/᩺ۚ;->᩹:I

    const/16 v0, 0x11

    .line 641
    iput v0, p0, Ll/᩺ۚ;->᩸:I

    .line 649
    iput-object p2, p0, Ll/᩺ۚ;->᩶:Ll/ܰۚ;

    .line 650
    invoke-static {p3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    sget-object p3, Ll/᩸᩸;->֨:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 651
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_2

    .line 653
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 655
    iget v1, p0, Ll/᩺ۚ;->᩹:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, Ll/᩺ۚ;->᩹:I

    goto :goto_1

    :cond_0
    if-nez v0, :cond_1

    .line 657
    iget v1, p0, Ll/᩺ۚ;->᩸:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Ll/᩺ۚ;->᩸:I

    :cond_1
    :goto_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 660
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 714
    iget-object p1, p0, Ll/᩺ۚ;->᩶:Ll/ܰۚ;

    invoke-static {p1}, Ll/ܰۚ;->ᩴ(Ll/ܰۚ;)Ll/۟ۚ;

    move-result-object v0

    invoke-static {v0}, Ll/۟ۚ;->ܽ(Ll/۟ۚ;)Ll/ۤۚ;

    move-result-object v0

    .line 715
    invoke-virtual {v0}, Ll/ۤۚ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 718
    :cond_0
    invoke-static {p1}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;)I

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, -0x1

    if-ne v1, v3, :cond_2

    .line 3549
    iget v1, v0, Ll/ۤۚ;->ۙ:I

    if-ne v1, v3, :cond_1

    .line 721
    invoke-static {p1}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۚ;->֫(I)V

    return-void

    .line 724
    :cond_1
    new-instance v3, Ll/ܰۚ;

    invoke-static {p1}, Ll/ܰۚ;->ᩴ(Ll/ܰۚ;)Ll/۟ۚ;

    move-result-object v4

    invoke-direct {v3, v4, p1}, Ll/ܰۚ;-><init>(Ll/۟ۚ;Ll/ܰۚ;)V

    .line 725
    invoke-static {v3, v1}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;I)V

    .line 726
    invoke-static {p1}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result p1

    invoke-static {v3, p1}, Ll/ܰۚ;->֫(Ll/ܰۚ;I)V

    .line 727
    invoke-virtual {v0, v3}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 1796
    invoke-virtual {v0, v2}, Ll/ۤۚ;->֫(F)V

    return-void

    .line 731
    :cond_2
    invoke-static {p1}, Ll/ܰۚ;->ᩴ(Ll/ܰۚ;)Ll/۟ۚ;

    move-result-object v1

    iget-object v1, v1, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    .line 732
    iget v4, p0, Ll/᩺ۚ;->᩸:I

    and-int/lit8 v5, v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v5, :cond_4

    and-int/lit16 v8, v4, 0x100

    if-eqz v8, :cond_3

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v8, 0x1

    :goto_1
    and-int/lit8 v9, v4, 0x10

    if-nez v9, :cond_6

    and-int/lit16 v10, v4, 0x1000

    if-eqz v10, :cond_5

    goto :goto_2

    :cond_5
    const/4 v7, 0x0

    :cond_6
    :goto_2
    if-eqz v8, :cond_9

    if-eqz v7, :cond_9

    .line 736
    invoke-static {p1}, Ll/ܰۚ;->ᩴ(Ll/ܰۚ;)Ll/۟ۚ;

    move-result-object v10

    iget-object v10, v10, Ll/۟ۚ;->ᩳ:Ll/ܰۚ;

    if-eq v10, p1, :cond_7

    .line 737
    invoke-virtual {v0, p1}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 3549
    :cond_7
    iget v10, v0, Ll/ۤۚ;->ۙ:I

    .line 739
    invoke-virtual {v0}, Ll/ۤۚ;->ۧ()I

    move-result v11

    if-eq v10, v11, :cond_a

    .line 3558
    iget v10, v0, Ll/ۤۚ;->ܽۧ:F

    const/high16 v11, 0x3f000000    # 0.5f

    cmpl-float v10, v10, v11

    if-lez v10, :cond_8

    goto :goto_3

    :cond_8
    const/4 v7, 0x0

    :cond_9
    move v6, v8

    :cond_a
    :goto_3
    if-ne p1, v1, :cond_b

    goto :goto_4

    .line 703
    :cond_b
    invoke-static {p1}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result v1

    .line 704
    invoke-static {p1}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;)I

    move-result v8

    if-ne v8, v3, :cond_c

    .line 706
    iget v3, v0, Ll/ۤۚ;->ۙ:I

    if-eq v3, v1, :cond_11

    goto :goto_4

    .line 708
    :cond_c
    iget v3, v0, Ll/ۤۚ;->ۙ:I

    if-eq v3, v8, :cond_d

    if-ne v3, v1, :cond_11

    :cond_d
    :goto_4
    if-eqz v6, :cond_e

    if-eqz v5, :cond_e

    .line 747
    invoke-virtual {v0, p1}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 1796
    invoke-virtual {v0, v2}, Ll/ۤۚ;->֫(F)V

    return-void

    :cond_e
    const/4 v1, 0x0

    if-eqz v7, :cond_f

    if-eqz v9, :cond_f

    .line 750
    invoke-virtual {v0, p1}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 1787
    invoke-virtual {v0, v1}, Ll/ۤۚ;->֫(F)V

    return-void

    :cond_f
    if-eqz v6, :cond_10

    and-int/lit16 v3, v4, 0x100

    if-eqz v3, :cond_10

    .line 753
    invoke-virtual {v0, p1}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 754
    invoke-virtual {v0, v2}, Ll/ۤۚ;->ۧ(F)V

    return-void

    :cond_10
    if-eqz v7, :cond_11

    and-int/lit16 v2, v4, 0x1000

    if-eqz v2, :cond_11

    .line 756
    invoke-virtual {v0, p1}, Ll/ۤۚ;->֫(Ll/ܰۚ;)V

    .line 757
    invoke-virtual {v0, v1}, Ll/ۤۚ;->ۧ(F)V

    :cond_11
    :goto_5
    return-void
.end method

.method public final ֫(Ll/ۤۚ;ILl/ܰۚ;)V
    .locals 6

    .line 664
    iget v0, p0, Ll/᩺ۚ;->᩹:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    goto :goto_5

    .line 669
    :cond_1
    invoke-static {p3}, Ll/ܰۚ;->ۧ(Ll/ܰۚ;)I

    move-result v0

    .line 670
    invoke-static {p3}, Ll/ܰۚ;->֫(Ll/ܰۚ;)I

    move-result p3

    if-ne v0, v1, :cond_2

    .line 672
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 676
    :cond_2
    iget v1, p0, Ll/᩺ۚ;->᩸:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    if-ne p2, v0, :cond_3

    const/4 v4, 0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    and-int/lit16 v5, v1, 0x100

    if-eqz v5, :cond_4

    if-ne p2, v0, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    or-int/2addr v4, v5

    if-eqz v2, :cond_5

    if-ne p2, v0, :cond_5

    const/4 v0, 0x1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    or-int/2addr v0, v4

    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_6

    if-ne p2, p3, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_7

    if-ne p2, p3, :cond_7

    const/4 v3, 0x1

    :cond_7
    or-int p2, v0, v3

    if-eqz p2, :cond_8

    .line 683
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    :goto_5
    return-void
.end method
