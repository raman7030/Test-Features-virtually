.class public final Ll/᩵ۚ;
.super Ljava/lang/Object;
.source "21CQ"


# instance fields
.field public ֡:I

.field public ֨:F

.field public ֫:Ll/᩷֡;

.field public ۖ:Ljava/util/ArrayList;

.field public ۗ:Landroid/view/View;

.field public ۘ:[Ll/ۘۚ;

.field public ۙ:[F

.field public ۚ:[Ll/᩷֡;

.field public ۜ:Ll/ᩴۚ;

.field public ۠:F

.field public ۡ:[I

.field public ۢ:[D

.field public ۧ:[I

.field public ܳ:Ljava/util/HashMap;

.field public ܶ:Ll/ۛۚ;

.field public ܺ:[D

.field public ܽ:[Ljava/lang/String;

.field public ܿ:I

.field public ᩳ:Ljava/util/HashMap;

.field public ᩴ:Ljava/util/ArrayList;

.field public ᩵:F

.field public ᩶:[F

.field public ᩷:I

.field public ᩸:Ll/ᩴۚ;

.field public ᩹:Ljava/util/HashMap;

.field public ᩻:Ll/ۛۚ;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 71
    iput v0, p0, Ll/᩵ۚ;->ܿ:I

    .line 72
    new-instance v1, Ll/ۛۚ;

    invoke-direct {v1}, Ll/ۛۚ;-><init>()V

    iput-object v1, p0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    .line 73
    new-instance v1, Ll/ۛۚ;

    invoke-direct {v1}, Ll/ۛۚ;-><init>()V

    iput-object v1, p0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    .line 75
    new-instance v1, Ll/ᩴۚ;

    invoke-direct {v1}, Ll/ᩴۚ;-><init>()V

    iput-object v1, p0, Ll/᩵ۚ;->᩸:Ll/ᩴۚ;

    .line 76
    new-instance v1, Ll/ᩴۚ;

    invoke-direct {v1}, Ll/ᩴۚ;-><init>()V

    iput-object v1, p0, Ll/᩵ۚ;->ۜ:Ll/ᩴۚ;

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 80
    iput v1, p0, Ll/᩵ۚ;->᩵:F

    const/4 v1, 0x0

    .line 81
    iput v1, p0, Ll/᩵ۚ;->֨:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 82
    iput v1, p0, Ll/᩵ۚ;->۠:F

    const/4 v1, 0x4

    new-array v1, v1, [F

    .line 90
    iput-object v1, p0, Ll/᩵ۚ;->᩶:[F

    .line 91
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/᩵ۚ;->ᩴ:Ljava/util/ArrayList;

    const/4 v1, 0x1

    new-array v1, v1, [F

    .line 92
    iput-object v1, p0, Ll/᩵ۚ;->ۙ:[F

    .line 94
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/᩵ۚ;->ۖ:Ljava/util/ArrayList;

    .line 99
    iput v0, p0, Ll/᩵ۚ;->֡:I

    .line 830
    iput-object p1, p0, Ll/᩵ۚ;->ۗ:Landroid/view/View;

    .line 831
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, Ll/᩵ۚ;->᩷:I

    .line 832
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    return-void
.end method

.method private ֫(Ll/ۛۚ;)V
    .locals 4

    .line 826
    iget-object v0, p0, Ll/᩵ۚ;->ۗ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iget-object v1, p0, Ll/᩵ۚ;->ۗ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    iget-object v2, p0, Ll/᩵ۚ;->ۗ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, Ll/᩵ۚ;->ۗ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    .line 668
    iput v0, p1, Ll/ۛۚ;->۟:F

    .line 669
    iput v1, p1, Ll/ۛۚ;->֫֫:F

    .line 670
    iput v2, p1, Ll/ۛۚ;->ܰ:F

    .line 671
    iput v3, p1, Ll/ۛۚ;->᩹:F

    return-void
.end method

.method private ۧ(F[F)F
    .locals 10

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    .line 877
    aput v1, p2, v2

    goto :goto_0

    .line 878
    :cond_0
    iget v3, p0, Ll/᩵ۚ;->۠:F

    float-to-double v4, v3

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    cmpl-double v8, v4, v6

    if-eqz v8, :cond_2

    .line 879
    iget v4, p0, Ll/᩵ۚ;->֨:F

    cmpg-float v5, p1, v4

    if-gez v5, :cond_1

    const/4 p1, 0x0

    :cond_1
    cmpl-float v5, p1, v4

    if-lez v5, :cond_2

    float-to-double v8, p1

    cmpg-double v5, v8, v6

    if-gez v5, :cond_2

    sub-float/2addr p1, v4

    mul-float p1, p1, v3

    .line 890
    :cond_2
    :goto_0
    iget-object v3, p0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    iget-object v3, v3, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    .line 893
    iget-object v4, p0, Ll/᩵ۚ;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/high16 v5, 0x7fc00000    # Float.NaN

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛۚ;

    .line 894
    iget-object v7, v6, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    if-eqz v7, :cond_3

    .line 895
    iget v8, v6, Ll/ۛۚ;->᩺:F

    cmpg-float v9, v8, p1

    if-gez v9, :cond_4

    move-object v3, v7

    move v0, v8

    goto :goto_1

    .line 899
    :cond_4
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 900
    iget v5, v6, Ll/ۛۚ;->᩺:F

    goto :goto_1

    :cond_5
    if-eqz v3, :cond_7

    .line 907
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    move v1, v5

    :goto_2
    sub-float/2addr p1, v0

    sub-float/2addr v1, v0

    div-float/2addr p1, v1

    float-to-double v4, p1

    .line 911
    invoke-virtual {v3, v4, v5}, Ll/ۡ֡;->֫(D)D

    move-result-wide v6

    double-to-float p1, v6

    mul-float p1, p1, v1

    add-float/2addr p1, v0

    if-eqz p2, :cond_7

    .line 914
    invoke-virtual {v3, v4, v5}, Ll/ۡ֡;->ۧ(D)D

    move-result-wide v0

    double-to-float v0, v0

    aput v0, p2, v2

    :cond_7
    return p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 821
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " start: x: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    iget v2, v1, Ll/ۛۚ;->۟:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " y: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v1, Ll/ۛۚ;->֫֫:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " end: x: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    iget v3, v1, Ll/ۛۚ;->۟:F

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v1, Ll/ۛۚ;->֫֫:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 3

    .line 1167
    iget-object v0, p0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    iget v0, v0, Ll/ۛۚ;->᩶:I

    .line 1168
    iget-object v1, p0, Ll/᩵ۚ;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۚ;

    .line 1169
    iget v2, v2, Ll/ۛۚ;->᩶:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    .line 1171
    :cond_0
    iget-object v1, p0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    iget v1, v1, Ll/ۛۚ;->᩶:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final ֫([F[I)I
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 338
    iget-object v1, p0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ll/᩷֡;->֫()[D

    move-result-object v1

    if-eqz p2, :cond_0

    .line 340
    iget-object v2, p0, Ll/᩵ۚ;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۚ;

    add-int/lit8 v5, v3, 0x1

    .line 341
    iget v4, v4, Ll/ۛۚ;->ۗ:I

    aput v4, p2, v3

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    const/4 v2, 0x0

    .line 346
    :goto_1
    array-length v3, v1

    if-ge p2, v3, :cond_1

    .line 347
    iget-object v3, p0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    aget-object v3, v3, v0

    aget-wide v4, v1, p2

    iget-object v6, p0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v3, v4, v5, v6}, Ll/᩷֡;->֫(D[D)V

    .line 348
    iget-object v3, p0, Ll/᩵ۚ;->ۡ:[I

    iget-object v4, p0, Ll/᩵ۚ;->ۢ:[D

    iget-object v5, p0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    invoke-virtual {v5, v3, v4, p1, v2}, Ll/ۛۚ;->֫([I[D[FI)V

    add-int/lit8 v2, v2, 0x2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 351
    :cond_1
    div-int/lit8 v2, v2, 0x2

    return v2

    :cond_2
    return v0
.end method

.method public final ֫(FFF[F)V
    .locals 10

    .line 1054
    iget-object v0, p0, Ll/᩵ۚ;->ۙ:[F

    invoke-direct {p0, p1, v0}, Ll/᩵ۚ;->ۧ(F[F)F

    move-result v1

    .line 1056
    iget-object v2, p0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    iget-object v3, p0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    const/4 v4, 0x0

    if-eqz v2, :cond_3

    .line 1057
    aget-object v2, v2, v4

    float-to-double v5, v1

    iget-object v1, p0, Ll/᩵ۚ;->ܺ:[D

    invoke-virtual {v2, v5, v6, v1}, Ll/᩷֡;->ۧ(D[D)V

    .line 1058
    iget-object v1, p0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    aget-object v1, v1, v4

    iget-object v2, p0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v1, v5, v6, v2}, Ll/᩷֡;->֫(D[D)V

    .line 1059
    aget v0, v0, v4

    .line 1060
    :goto_0
    iget-object v7, p0, Ll/᩵ۚ;->ܺ:[D

    array-length v1, v7

    if-ge v4, v1, :cond_0

    .line 1061
    aget-wide v1, v7, v4

    float-to-double v8, v0

    mul-double v1, v1, v8

    aput-wide v1, v7, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1064
    :cond_0
    iget-object v0, p0, Ll/᩵ۚ;->֫:Ll/᩷֡;

    if-eqz v0, :cond_2

    .line 1065
    iget-object v1, p0, Ll/᩵ۚ;->ۢ:[D

    array-length v2, v1

    if-lez v2, :cond_1

    .line 1066
    invoke-virtual {v0, v5, v6, v1}, Ll/᩷֡;->֫(D[D)V

    .line 1067
    iget-object v0, p0, Ll/᩵ۚ;->֫:Ll/᩷֡;

    iget-object v1, p0, Ll/᩵ۚ;->ܺ:[D

    invoke-virtual {v0, v5, v6, v1}, Ll/᩷֡;->ۧ(D[D)V

    .line 1068
    iget-object v4, p0, Ll/᩵ۚ;->ۡ:[I

    iget-object v5, p0, Ll/᩵ۚ;->ܺ:[D

    iget-object v6, p0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v0, p2

    move v1, p3

    move-object v2, p4

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    invoke-static/range {v0 .. v5}, Ll/ۛۚ;->֫(FF[F[I[D[D)V

    :cond_1
    return-void

    .line 1072
    :cond_2
    iget-object v4, p0, Ll/᩵ۚ;->ۡ:[I

    iget-object v5, p0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v0, p2

    move v1, p3

    move-object v2, p4

    move-object v3, v4

    move-object v4, v7

    invoke-static/range {v0 .. v5}, Ll/ۛۚ;->֫(FF[F[I[D[D)V

    return-void

    .line 1076
    :cond_3
    iget-object v0, p0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    iget v1, v0, Ll/ۛۚ;->۟:F

    iget v2, v3, Ll/ۛۚ;->۟:F

    sub-float/2addr v1, v2

    .line 1077
    iget v2, v0, Ll/ۛۚ;->֫֫:F

    iget v5, v3, Ll/ۛۚ;->֫֫:F

    sub-float/2addr v2, v5

    .line 1078
    iget v5, v0, Ll/ۛۚ;->ܰ:F

    iget v6, v3, Ll/ۛۚ;->ܰ:F

    sub-float/2addr v5, v6

    .line 1079
    iget v0, v0, Ll/ۛۚ;->᩹:F

    iget v3, v3, Ll/ۛۚ;->᩹:F

    sub-float/2addr v0, v3

    add-float/2addr v5, v1

    add-float/2addr v0, v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v6, v3, p2

    mul-float v6, v6, v1

    mul-float v5, v5, p2

    add-float/2addr v5, v6

    .line 1082
    aput v5, p4, v4

    sub-float/2addr v3, p3

    mul-float v3, v3, v2

    mul-float v0, v0, p3

    add-float/2addr v0, v3

    const/4 v1, 0x1

    .line 1083
    aput v0, p4, v1

    return-void
.end method

.method public final ֫(FIIFF[F)V
    .locals 18

    move-object/from16 v0, p0

    .line 1101
    iget-object v1, v0, Ll/᩵ۚ;->ۙ:[F

    move/from16 v2, p1

    invoke-direct {v0, v2, v1}, Ll/᩵ۚ;->ۧ(F[F)F

    move-result v2

    .line 1103
    iget-object v3, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const-string v4, "translationX"

    const/4 v5, 0x0

    if-nez v3, :cond_0

    move-object v3, v5

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵֨;

    .line 1104
    :goto_0
    iget-object v6, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const-string v7, "translationY"

    if-nez v6, :cond_1

    move-object v6, v5

    goto :goto_1

    :cond_1
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵֨;

    .line 1105
    :goto_1
    iget-object v8, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const-string v9, "rotation"

    if-nez v8, :cond_2

    move-object v8, v5

    goto :goto_2

    :cond_2
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩵֨;

    .line 1106
    :goto_2
    iget-object v10, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const-string v11, "scaleX"

    if-nez v10, :cond_3

    move-object v10, v5

    goto :goto_3

    :cond_3
    invoke-virtual {v10, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩵֨;

    .line 1107
    :goto_3
    iget-object v12, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const-string v13, "scaleY"

    if-nez v12, :cond_4

    move-object v12, v5

    goto :goto_4

    :cond_4
    invoke-virtual {v12, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩵֨;

    .line 1109
    :goto_4
    iget-object v14, v0, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-nez v14, :cond_5

    move-object v4, v5

    goto :goto_5

    :cond_5
    invoke-virtual {v14, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܳۚ;

    .line 1110
    :goto_5
    iget-object v14, v0, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-nez v14, :cond_6

    move-object v7, v5

    goto :goto_6

    :cond_6
    invoke-virtual {v14, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳۚ;

    .line 1111
    :goto_6
    iget-object v14, v0, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-nez v14, :cond_7

    move-object v9, v5

    goto :goto_7

    :cond_7
    invoke-virtual {v14, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ܳۚ;

    .line 1112
    :goto_7
    iget-object v14, v0, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-nez v14, :cond_8

    move-object v11, v5

    goto :goto_8

    :cond_8
    invoke-virtual {v14, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܳۚ;

    .line 1113
    :goto_8
    iget-object v14, v0, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-nez v14, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v14, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۚ;

    .line 1115
    :goto_9
    new-instance v13, Ll/᩵֡;

    .line 26
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 1116
    invoke-virtual {v13}, Ll/᩵֡;->֫()V

    .line 1117
    invoke-virtual {v13, v8, v2}, Ll/᩵֡;->֫(Ll/᩵֨;F)V

    .line 1118
    invoke-virtual {v13, v3, v6, v2}, Ll/᩵֡;->ۧ(Ll/᩵֨;Ll/᩵֨;F)V

    .line 1119
    invoke-virtual {v13, v10, v12, v2}, Ll/᩵֡;->֫(Ll/᩵֨;Ll/᩵֨;F)V

    .line 1120
    invoke-virtual {v13, v9, v2}, Ll/᩵֡;->֫(Ll/ܳۚ;F)V

    .line 1121
    invoke-virtual {v13, v4, v7, v2}, Ll/᩵֡;->ۧ(Ll/ܳۚ;Ll/ܳۚ;F)V

    .line 1122
    invoke-virtual {v13, v11, v5, v2}, Ll/᩵֡;->֫(Ll/ܳۚ;Ll/ܳۚ;F)V

    .line 1123
    iget-object v14, v0, Ll/᩵ۚ;->֫:Ll/᩷֡;

    iget-object v15, v0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    if-eqz v14, :cond_b

    .line 1124
    iget-object v1, v0, Ll/᩵ۚ;->ۢ:[D

    array-length v3, v1

    if-lez v3, :cond_a

    float-to-double v2, v2

    .line 1125
    invoke-virtual {v14, v2, v3, v1}, Ll/᩷֡;->֫(D[D)V

    .line 1126
    iget-object v1, v0, Ll/᩵ۚ;->֫:Ll/᩷֡;

    iget-object v4, v0, Ll/᩵ۚ;->ܺ:[D

    invoke-virtual {v1, v2, v3, v4}, Ll/᩷֡;->ۧ(D[D)V

    .line 1127
    iget-object v4, v0, Ll/᩵ۚ;->ۡ:[I

    iget-object v5, v0, Ll/᩵ۚ;->ܺ:[D

    iget-object v6, v0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v1, p4

    move/from16 v2, p5

    move-object/from16 v3, p6

    invoke-static/range {v1 .. v6}, Ll/ۛۚ;->֫(FF[F[I[D[D)V

    :cond_a
    move-object v1, v13

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p6

    .line 1129
    invoke-virtual/range {v1 .. v6}, Ll/᩵֡;->֫(FFII[F)V

    return-void

    .line 1132
    :cond_b
    iget-object v14, v0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    const/16 v16, 0x0

    if-eqz v14, :cond_d

    .line 1133
    invoke-direct {v0, v2, v1}, Ll/᩵ۚ;->ۧ(F[F)F

    move-result v2

    .line 1134
    iget-object v3, v0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    aget-object v3, v3, v16

    float-to-double v4, v2

    iget-object v2, v0, Ll/᩵ۚ;->ܺ:[D

    invoke-virtual {v3, v4, v5, v2}, Ll/᩷֡;->ۧ(D[D)V

    .line 1135
    iget-object v2, v0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    aget-object v2, v2, v16

    iget-object v3, v0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v2, v4, v5, v3}, Ll/᩷֡;->֫(D[D)V

    .line 1136
    aget v1, v1, v16

    const/4 v2, 0x0

    .line 1137
    :goto_a
    iget-object v5, v0, Ll/᩵ۚ;->ܺ:[D

    array-length v3, v5

    if-ge v2, v3, :cond_c

    .line 1138
    aget-wide v3, v5, v2

    float-to-double v6, v1

    mul-double v3, v3, v6

    aput-wide v3, v5, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    .line 1140
    :cond_c
    iget-object v4, v0, Ll/᩵ۚ;->ۡ:[I

    iget-object v6, v0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v1, p4

    move/from16 v2, p5

    move-object/from16 v3, p6

    invoke-static/range {v1 .. v6}, Ll/ۛۚ;->֫(FF[F[I[D[D)V

    move-object v1, v13

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p6

    .line 1142
    invoke-virtual/range {v1 .. v6}, Ll/᩵֡;->֫(FFII[F)V

    return-void

    .line 1147
    :cond_d
    iget-object v1, v0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    iget v14, v1, Ll/ۛۚ;->۟:F

    iget v0, v15, Ll/ۛۚ;->۟:F

    sub-float/2addr v14, v0

    .line 1148
    iget v0, v1, Ll/ۛۚ;->֫֫:F

    move-object/from16 p1, v5

    iget v5, v15, Ll/ۛۚ;->֫֫:F

    sub-float/2addr v0, v5

    .line 1149
    iget v5, v1, Ll/ۛۚ;->ܰ:F

    move-object/from16 v17, v11

    iget v11, v15, Ll/ۛۚ;->ܰ:F

    sub-float/2addr v5, v11

    .line 1150
    iget v1, v1, Ll/ۛۚ;->᩹:F

    iget v11, v15, Ll/ۛۚ;->᩹:F

    sub-float/2addr v1, v11

    add-float/2addr v5, v14

    add-float/2addr v1, v0

    const/high16 v11, 0x3f800000    # 1.0f

    sub-float v15, v11, p4

    mul-float v15, v15, v14

    mul-float v5, v5, p4

    add-float/2addr v5, v15

    .line 1153
    aput v5, p6, v16

    sub-float v11, v11, p5

    mul-float v11, v11, v0

    mul-float v1, v1, p5

    add-float/2addr v1, v11

    const/4 v0, 0x1

    .line 1154
    aput v1, p6, v0

    .line 1156
    invoke-virtual {v13}, Ll/᩵֡;->֫()V

    .line 1157
    invoke-virtual {v13, v8, v2}, Ll/᩵֡;->֫(Ll/᩵֨;F)V

    .line 1158
    invoke-virtual {v13, v3, v6, v2}, Ll/᩵֡;->ۧ(Ll/᩵֨;Ll/᩵֨;F)V

    .line 1159
    invoke-virtual {v13, v10, v12, v2}, Ll/᩵֡;->֫(Ll/᩵֨;Ll/᩵֨;F)V

    .line 1160
    invoke-virtual {v13, v9, v2}, Ll/᩵֡;->֫(Ll/ܳۚ;F)V

    .line 1161
    invoke-virtual {v13, v4, v7, v2}, Ll/᩵֡;->ۧ(Ll/ܳۚ;Ll/ܳۚ;F)V

    move-object/from16 v5, p1

    move-object/from16 v11, v17

    .line 1162
    invoke-virtual {v13, v11, v5, v2}, Ll/᩵֡;->֫(Ll/ܳۚ;Ll/ܳۚ;F)V

    move-object v1, v13

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p6

    .line 1163
    invoke-virtual/range {v1 .. v6}, Ll/᩵֡;->֫(FFII[F)V

    return-void
.end method

.method public final ֫(F[F)V
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move/from16 v2, p1

    .line 392
    invoke-direct {v0, v2, v1}, Ll/᩵ۚ;->ۧ(F[F)F

    move-result v1

    .line 393
    iget-object v2, v0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    float-to-double v4, v1

    iget-object v1, v0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v2, v4, v5, v1}, Ll/᩷֡;->֫(D[D)V

    .line 394
    iget-object v1, v0, Ll/᩵ۚ;->ۡ:[I

    iget-object v2, v0, Ll/᩵ۚ;->ۢ:[D

    .line 432
    iget-object v4, v0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    iget v5, v4, Ll/ۛۚ;->۟:F

    .line 433
    iget v6, v4, Ll/ۛۚ;->֫֫:F

    .line 434
    iget v7, v4, Ll/ۛۚ;->ܰ:F

    .line 435
    iget v4, v4, Ll/ۛۚ;->᩹:F

    const/4 v8, 0x0

    .line 450
    :goto_0
    array-length v9, v1

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-ge v8, v9, :cond_4

    .line 451
    aget-wide v14, v2, v8

    double-to-float v9, v14

    .line 453
    aget v14, v1, v8

    if-eq v14, v13, :cond_3

    if-eq v14, v12, :cond_2

    if-eq v14, v11, :cond_1

    if-eq v14, v10, :cond_0

    goto :goto_1

    :cond_0
    move v4, v9

    goto :goto_1

    :cond_1
    move v7, v9

    goto :goto_1

    :cond_2
    move v6, v9

    goto :goto_1

    :cond_3
    move v5, v9

    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    add-float/2addr v7, v5

    add-float/2addr v4, v6

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 486
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 489
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    const/4 v1, 0x0

    add-float/2addr v5, v1

    add-float/2addr v6, v1

    add-float/2addr v7, v1

    add-float/2addr v4, v1

    .line 537
    aput v5, p2, v3

    .line 538
    aput v6, p2, v13

    .line 539
    aput v7, p2, v12

    .line 540
    aput v6, p2, v11

    .line 541
    aput v7, p2, v10

    const/4 v1, 0x5

    .line 542
    aput v4, p2, v1

    const/4 v1, 0x6

    .line 543
    aput v5, p2, v1

    const/4 v1, 0x7

    .line 544
    aput v4, p2, v1

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 102
    iget-object v0, p0, Ll/᩵ۚ;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛۚ;

    return-void
.end method

.method public final ֫(IIJ)V
    .locals 33

    move-object/from16 v0, p0

    .line 475
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 476
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 477
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 478
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 479
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 491
    iget v5, v0, Ll/᩵ۚ;->֡:I

    iget-object v6, v0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    const/4 v7, -0x1

    if-eq v5, v7, :cond_0

    .line 492
    iput v5, v6, Ll/ۛۚ;->۬:I

    .line 495
    :cond_0
    iget-object v5, v0, Ll/᩵ۚ;->᩸:Ll/ᩴۚ;

    iget-object v8, v0, Ll/᩵ۚ;->ۜ:Ll/ᩴۚ;

    invoke-virtual {v5, v8, v2}, Ll/ᩴۚ;->֫(Ll/ᩴۚ;Ljava/util/HashSet;)V

    const/high16 v9, 0x7fc00000    # Float.NaN

    .line 501
    iget-object v10, v0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    iget-object v11, v0, Ll/᩵ۚ;->ᩴ:Ljava/util/ArrayList;

    iget-object v12, v0, Ll/᩵ۚ;->ۖ:Ljava/util/ArrayList;

    const/4 v13, 0x0

    if-eqz v12, :cond_18

    .line 502
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const/16 v16, 0x0

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_17

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v14, v17

    check-cast v14, Ll/ۚ֡;

    move-object/from16 v17, v15

    .line 503
    instance-of v15, v14, Ll/᩷ۚ;

    if-eqz v15, :cond_12

    .line 504
    check-cast v14, Ll/᩷ۚ;

    .line 505
    new-instance v15, Ll/ۛۚ;

    .line 124
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 54
    iput v13, v15, Ll/ۛۚ;->᩶:I

    .line 61
    iput v9, v15, Ll/ۛۚ;->۫:F

    .line 63
    iput v7, v15, Ll/ۛۚ;->۬:I

    .line 65
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v9, v15, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    .line 66
    iput v13, v15, Ll/ۛۚ;->ۗ:I

    const/16 v9, 0x12

    new-array v13, v9, [D

    .line 308
    iput-object v13, v15, Ll/ۛۚ;->ۛ:[D

    new-array v9, v9, [D

    .line 309
    iput-object v9, v15, Ll/ۛۚ;->ۤ:[D

    .line 125
    iget v9, v14, Ll/᩷ۚ;->ܺ:I

    const/4 v7, 0x1

    const/high16 v19, 0x42c80000    # 100.0f

    if-eq v9, v7, :cond_c

    const/4 v7, 0x2

    if-eq v9, v7, :cond_7

    .line 80
    iget v7, v14, Ll/ۚ֡;->ۧ:I

    int-to-float v7, v7

    div-float v7, v7, v19

    .line 82
    iput v7, v15, Ll/ۛۚ;->᩺:F

    .line 84
    iget v9, v14, Ll/᩷ۚ;->ܳ:I

    iput v9, v15, Ll/ۛۚ;->᩶:I

    .line 85
    iget v9, v14, Ll/᩷ۚ;->᩷:F

    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v7

    goto :goto_1

    :cond_1
    iget v9, v14, Ll/᩷ۚ;->᩷:F

    .line 86
    :goto_1
    iget v13, v14, Ll/᩷ۚ;->ۜ:F

    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    move-result v13

    if-eqz v13, :cond_2

    move v13, v7

    goto :goto_2

    :cond_2
    iget v13, v14, Ll/᩷ۚ;->ۜ:F

    :goto_2
    move-object/from16 v21, v8

    .line 87
    iget v8, v10, Ll/ۛۚ;->ܰ:F

    move-object/from16 v22, v5

    iget v5, v6, Ll/ۛۚ;->ܰ:F

    sub-float v19, v8, v5

    move-object/from16 v23, v12

    .line 88
    iget v12, v10, Ll/ۛۚ;->᩹:F

    move-object/from16 v24, v2

    iget v2, v6, Ll/ۛۚ;->᩹:F

    sub-float v25, v12, v2

    move-object/from16 v26, v4

    .line 90
    iget v4, v15, Ll/ۛۚ;->᩺:F

    iput v4, v15, Ll/ۛۚ;->ۨ:F

    .line 94
    iget v4, v6, Ll/ۛۚ;->۟:F

    const/high16 v20, 0x40000000    # 2.0f

    div-float v27, v5, v20

    add-float v27, v27, v4

    move-object/from16 v28, v1

    .line 95
    iget v1, v6, Ll/ۛۚ;->֫֫:F

    div-float v29, v2, v20

    add-float v29, v29, v1

    move-object/from16 v30, v3

    .line 96
    iget v3, v10, Ll/ۛۚ;->۟:F

    div-float v8, v8, v20

    add-float/2addr v8, v3

    .line 97
    iget v3, v10, Ll/ۛۚ;->֫֫:F

    div-float v12, v12, v20

    add-float/2addr v12, v3

    sub-float v8, v8, v27

    sub-float v12, v12, v29

    mul-float v3, v8, v7

    add-float/2addr v3, v4

    mul-float v19, v19, v9

    div-float v4, v19, v20

    sub-float/2addr v3, v4

    float-to-int v3, v3

    int-to-float v3, v3

    .line 100
    iput v3, v15, Ll/ۛۚ;->۟:F

    mul-float v3, v12, v7

    add-float/2addr v3, v1

    mul-float v25, v25, v13

    div-float v1, v25, v20

    sub-float/2addr v3, v1

    float-to-int v3, v3

    int-to-float v3, v3

    .line 101
    iput v3, v15, Ll/ۛۚ;->֫֫:F

    add-float v5, v5, v19

    float-to-int v3, v5

    int-to-float v3, v3

    .line 102
    iput v3, v15, Ll/ۛۚ;->ܰ:F

    add-float v2, v2, v25

    float-to-int v2, v2

    int-to-float v2, v2

    .line 103
    iput v2, v15, Ll/ۛۚ;->᩹:F

    .line 105
    iget v2, v14, Ll/᩷ۚ;->ۢ:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_3

    move v2, v7

    goto :goto_3

    :cond_3
    iget v2, v14, Ll/᩷ۚ;->ۢ:F

    :goto_3
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 106
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v3, 0x0

    goto :goto_4

    :cond_4
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 107
    :goto_4
    iget v5, v14, Ll/᩷ۚ;->ۡ:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_5

    :cond_5
    iget v7, v14, Ll/᩷ۚ;->ۡ:F

    :goto_5
    const/high16 v5, 0x7fc00000    # Float.NaN

    .line 108
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, 0x0

    goto :goto_6

    :cond_6
    const/high16 v5, 0x7fc00000    # Float.NaN

    :goto_6
    const/4 v9, 0x2

    .line 109
    iput v9, v15, Ll/ۛۚ;->ۗ:I

    .line 110
    iget v9, v6, Ll/ۛۚ;->۟:F

    mul-float v2, v2, v8

    add-float/2addr v2, v9

    mul-float v5, v5, v12

    add-float/2addr v5, v2

    sub-float/2addr v5, v4

    float-to-int v2, v5

    int-to-float v2, v2

    iput v2, v15, Ll/ۛۚ;->۟:F

    .line 111
    iget v2, v6, Ll/ۛۚ;->֫֫:F

    mul-float v8, v8, v3

    add-float/2addr v8, v2

    mul-float v12, v12, v7

    add-float/2addr v12, v8

    sub-float/2addr v12, v1

    float-to-int v1, v12

    int-to-float v1, v1

    iput v1, v15, Ll/ۛۚ;->֫֫:F

    .line 113
    iget-object v1, v14, Ll/᩷ۚ;->ۖ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۡ֡;->֫(Ljava/lang/String;)Ll/ۡ֡;

    move-result-object v1

    iput-object v1, v15, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    .line 114
    iget v1, v14, Ll/᩷ۚ;->᩻:I

    iput v1, v15, Ll/ۛۚ;->۬:I

    move-object v3, v6

    move-object v1, v11

    move-object v0, v14

    goto/16 :goto_10

    :cond_7
    move-object/from16 v28, v1

    move-object/from16 v24, v2

    move-object/from16 v30, v3

    move-object/from16 v26, v4

    move-object/from16 v22, v5

    move-object/from16 v21, v8

    move-object/from16 v23, v12

    .line 140
    iget v1, v14, Ll/ۚ֡;->ۧ:I

    int-to-float v1, v1

    div-float v1, v1, v19

    .line 142
    iput v1, v15, Ll/ۛۚ;->᩺:F

    .line 144
    iget v2, v14, Ll/᩷ۚ;->ܳ:I

    iput v2, v15, Ll/ۛۚ;->᩶:I

    .line 145
    iget v2, v14, Ll/᩷ۚ;->᩷:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_8

    move v2, v1

    goto :goto_7

    :cond_8
    iget v2, v14, Ll/᩷ۚ;->᩷:F

    .line 146
    :goto_7
    iget v3, v14, Ll/᩷ۚ;->ۜ:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_9

    move v3, v1

    goto :goto_8

    :cond_9
    iget v3, v14, Ll/᩷ۚ;->ۜ:F

    .line 148
    :goto_8
    iget v4, v10, Ll/ۛۚ;->ܰ:F

    iget v5, v6, Ll/ۛۚ;->ܰ:F

    sub-float v7, v4, v5

    .line 149
    iget v8, v10, Ll/ۛۚ;->᩹:F

    iget v9, v6, Ll/ۛۚ;->᩹:F

    sub-float v12, v8, v9

    .line 151
    iget v13, v15, Ll/ۛۚ;->᩺:F

    iput v13, v15, Ll/ۛۚ;->ۨ:F

    .line 155
    iget v13, v6, Ll/ۛۚ;->۟:F

    const/high16 v18, 0x40000000    # 2.0f

    div-float v19, v5, v18

    add-float v19, v19, v13

    .line 156
    iget v0, v6, Ll/ۛۚ;->֫֫:F

    div-float v20, v9, v18

    add-float v20, v20, v0

    move-object/from16 v25, v11

    .line 157
    iget v11, v10, Ll/ۛۚ;->۟:F

    div-float v4, v4, v18

    add-float/2addr v4, v11

    .line 158
    iget v11, v10, Ll/ۛۚ;->֫֫:F

    div-float v8, v8, v18

    add-float/2addr v8, v11

    sub-float v4, v4, v19

    sub-float v8, v8, v20

    mul-float v4, v4, v1

    add-float/2addr v4, v13

    mul-float v7, v7, v2

    div-float v2, v7, v18

    sub-float/2addr v4, v2

    float-to-int v2, v4

    int-to-float v2, v2

    .line 161
    iput v2, v15, Ll/ۛۚ;->۟:F

    mul-float v8, v8, v1

    add-float/2addr v8, v0

    mul-float v12, v12, v3

    div-float v0, v12, v18

    sub-float/2addr v8, v0

    float-to-int v0, v8

    int-to-float v0, v0

    .line 162
    iput v0, v15, Ll/ۛۚ;->֫֫:F

    add-float/2addr v5, v7

    float-to-int v0, v5

    int-to-float v0, v0

    .line 163
    iput v0, v15, Ll/ۛۚ;->ܰ:F

    add-float/2addr v9, v12

    float-to-int v0, v9

    int-to-float v0, v0

    .line 164
    iput v0, v15, Ll/ۛۚ;->᩹:F

    const/4 v0, 0x3

    .line 166
    iput v0, v15, Ll/ۛۚ;->ۗ:I

    .line 167
    iget v0, v14, Ll/᩷ۚ;->ۢ:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_a

    move/from16 v0, p1

    int-to-float v1, v0

    .line 168
    iget v2, v15, Ll/ۛۚ;->ܰ:F

    sub-float/2addr v1, v2

    float-to-int v1, v1

    .line 169
    iget v2, v14, Ll/᩷ۚ;->ۢ:F

    int-to-float v1, v1

    mul-float v2, v2, v1

    float-to-int v1, v2

    int-to-float v1, v1

    iput v1, v15, Ll/ۛۚ;->۟:F

    goto :goto_9

    :cond_a
    move/from16 v0, p1

    .line 171
    :goto_9
    iget v1, v14, Ll/᩷ۚ;->ۡ:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_b

    move/from16 v1, p2

    int-to-float v2, v1

    .line 172
    iget v3, v15, Ll/ۛۚ;->᩹:F

    sub-float/2addr v2, v3

    float-to-int v2, v2

    .line 173
    iget v3, v14, Ll/᩷ۚ;->ۡ:F

    int-to-float v2, v2

    mul-float v3, v3, v2

    float-to-int v2, v3

    int-to-float v2, v2

    iput v2, v15, Ll/ۛۚ;->֫֫:F

    goto :goto_a

    :cond_b
    move/from16 v1, p2

    .line 176
    :goto_a
    iget-object v2, v14, Ll/᩷ۚ;->ۖ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۡ֡;->֫(Ljava/lang/String;)Ll/ۡ֡;

    move-result-object v2

    iput-object v2, v15, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    .line 177
    iget v2, v14, Ll/᩷ۚ;->᩻:I

    iput v2, v15, Ll/ۛۚ;->۬:I

    move-object v3, v6

    move-object v0, v14

    goto/16 :goto_f

    :cond_c
    move/from16 v0, p1

    move-object/from16 v28, v1

    move-object/from16 v24, v2

    move-object/from16 v30, v3

    move-object/from16 v26, v4

    move-object/from16 v22, v5

    move-object/from16 v21, v8

    move-object/from16 v25, v11

    move-object/from16 v23, v12

    move/from16 v1, p2

    .line 182
    iget v2, v14, Ll/ۚ֡;->ۧ:I

    int-to-float v2, v2

    div-float v2, v2, v19

    .line 184
    iput v2, v15, Ll/ۛۚ;->᩺:F

    .line 186
    iget v3, v14, Ll/᩷ۚ;->ܳ:I

    iput v3, v15, Ll/ۛۚ;->᩶:I

    .line 187
    iget v3, v14, Ll/᩷ۚ;->᩷:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_d

    move v3, v2

    goto :goto_b

    :cond_d
    iget v3, v14, Ll/᩷ۚ;->᩷:F

    .line 188
    :goto_b
    iget v4, v14, Ll/᩷ۚ;->ۜ:F

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_e

    move v4, v2

    goto :goto_c

    :cond_e
    iget v4, v14, Ll/᩷ۚ;->ۜ:F

    .line 190
    :goto_c
    iget v5, v10, Ll/ۛۚ;->ܰ:F

    iget v7, v6, Ll/ۛۚ;->ܰ:F

    sub-float/2addr v5, v7

    .line 191
    iget v7, v10, Ll/ۛۚ;->᩹:F

    iget v8, v6, Ll/ۛۚ;->᩹:F

    sub-float/2addr v7, v8

    .line 193
    iget v8, v15, Ll/ۛۚ;->᩺:F

    iput v8, v15, Ll/ۛۚ;->ۨ:F

    .line 195
    iget v8, v14, Ll/᩷ۚ;->ۢ:F

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-eqz v8, :cond_f

    goto :goto_d

    :cond_f
    iget v2, v14, Ll/᩷ۚ;->ۢ:F

    .line 197
    :goto_d
    iget v8, v6, Ll/ۛۚ;->۟:F

    iget v9, v6, Ll/ۛۚ;->ܰ:F

    const/high16 v11, 0x40000000    # 2.0f

    div-float v12, v9, v11

    add-float/2addr v12, v8

    .line 198
    iget v13, v6, Ll/ۛۚ;->֫֫:F

    iget v0, v6, Ll/ۛۚ;->᩹:F

    div-float v18, v0, v11

    add-float v18, v18, v13

    .line 199
    iget v1, v10, Ll/ۛۚ;->۟:F

    move-object/from16 v19, v6

    iget v6, v10, Ll/ۛۚ;->ܰ:F

    div-float/2addr v6, v11

    add-float/2addr v6, v1

    .line 200
    iget v1, v10, Ll/ۛۚ;->֫֫:F

    move-object/from16 v20, v14

    iget v14, v10, Ll/ۛۚ;->᩹:F

    div-float/2addr v14, v11

    add-float/2addr v14, v1

    sub-float/2addr v6, v12

    sub-float v14, v14, v18

    mul-float v1, v6, v2

    add-float/2addr v8, v1

    mul-float v3, v3, v5

    div-float v5, v3, v11

    sub-float/2addr v8, v5

    float-to-int v8, v8

    int-to-float v8, v8

    .line 203
    iput v8, v15, Ll/ۛۚ;->۟:F

    mul-float v2, v2, v14

    add-float/2addr v13, v2

    mul-float v4, v4, v7

    div-float v7, v4, v11

    sub-float/2addr v13, v7

    float-to-int v8, v13

    int-to-float v8, v8

    .line 204
    iput v8, v15, Ll/ۛۚ;->֫֫:F

    add-float/2addr v9, v3

    float-to-int v3, v9

    int-to-float v3, v3

    .line 205
    iput v3, v15, Ll/ۛۚ;->ܰ:F

    add-float/2addr v0, v4

    float-to-int v0, v0

    int-to-float v0, v0

    .line 206
    iput v0, v15, Ll/ۛۚ;->᩹:F

    move-object/from16 v0, v20

    .line 207
    iget v3, v0, Ll/᩷ۚ;->ۡ:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_10

    const/4 v3, 0x0

    goto :goto_e

    :cond_10
    iget v3, v0, Ll/᩷ۚ;->ۡ:F

    :goto_e
    neg-float v4, v14

    mul-float v4, v4, v3

    mul-float v6, v6, v3

    const/4 v3, 0x1

    .line 213
    iput v3, v15, Ll/ۛۚ;->ۗ:I

    move-object/from16 v3, v19

    .line 214
    iget v8, v3, Ll/ۛۚ;->۟:F

    add-float/2addr v8, v1

    sub-float/2addr v8, v5

    float-to-int v1, v8

    int-to-float v1, v1

    .line 215
    iget v5, v3, Ll/ۛۚ;->֫֫:F

    add-float/2addr v5, v2

    sub-float/2addr v5, v7

    float-to-int v2, v5

    int-to-float v2, v2

    add-float/2addr v1, v4

    .line 216
    iput v1, v15, Ll/ۛۚ;->۟:F

    add-float/2addr v2, v6

    .line 217
    iput v2, v15, Ll/ۛۚ;->֫֫:F

    .line 219
    iget-object v1, v0, Ll/᩷ۚ;->ۖ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۡ֡;->֫(Ljava/lang/String;)Ll/ۡ֡;

    move-result-object v1

    iput-object v1, v15, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    .line 220
    iget v1, v0, Ll/᩷ۚ;->᩻:I

    iput v1, v15, Ll/ۛۚ;->۬:I

    :goto_f
    move-object/from16 v1, v25

    .line 444
    :goto_10
    invoke-static {v1, v15}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v2

    neg-int v2, v2

    add-int/lit8 v2, v2, -0x1

    .line 448
    invoke-virtual {v1, v2, v15}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 506
    iget v0, v0, Ll/ۢۚ;->ܿ:I

    const/4 v2, -0x1

    if-eq v0, v2, :cond_11

    move-object/from16 v2, p0

    .line 507
    iput v0, v2, Ll/᩵ۚ;->ܿ:I

    goto :goto_11

    :cond_11
    move-object/from16 v2, p0

    :goto_11
    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v28

    move-object/from16 v0, v30

    goto :goto_13

    :cond_12
    move-object/from16 v28, v1

    move-object/from16 v24, v2

    move-object/from16 v30, v3

    move-object/from16 v26, v4

    move-object/from16 v22, v5

    move-object v3, v6

    move-object/from16 v21, v8

    move-object v1, v11

    move-object/from16 v23, v12

    move-object v2, v0

    .line 509
    instance-of v0, v14, Ll/᩹֡;

    if-eqz v0, :cond_13

    move-object/from16 v0, v30

    .line 510
    invoke-virtual {v14, v0}, Ll/ۚ֡;->֫(Ljava/util/HashSet;)V

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v28

    goto :goto_13

    :cond_13
    move-object/from16 v0, v30

    .line 511
    instance-of v4, v14, Ll/ܺۚ;

    if-eqz v4, :cond_14

    move-object/from16 v4, v28

    .line 512
    invoke-virtual {v14, v4}, Ll/ۚ֡;->֫(Ljava/util/HashSet;)V

    goto :goto_12

    :cond_14
    move-object/from16 v4, v28

    .line 513
    instance-of v5, v14, Ll/ۘۚ;

    if-eqz v5, :cond_16

    if-nez v16, :cond_15

    .line 515
    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    :cond_15
    move-object/from16 v5, v16

    .line 517
    check-cast v14, Ll/ۘۚ;

    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v16, v5

    :goto_12
    move-object/from16 v6, v24

    move-object/from16 v5, v26

    goto :goto_13

    :cond_16
    move-object/from16 v5, v26

    .line 519
    invoke-virtual {v14, v5}, Ll/ۚ֡;->ۧ(Ljava/util/HashMap;)V

    move-object/from16 v6, v24

    .line 520
    invoke-virtual {v14, v6}, Ll/ۚ֡;->֫(Ljava/util/HashSet;)V

    :goto_13
    const/4 v7, -0x1

    const/4 v13, 0x0

    const/high16 v9, 0x7fc00000    # Float.NaN

    move-object v11, v1

    move-object v1, v4

    move-object v4, v5

    move-object/from16 v15, v17

    move-object/from16 v8, v21

    move-object/from16 v5, v22

    move-object/from16 v12, v23

    move-object/from16 v32, v3

    move-object v3, v0

    move-object v0, v2

    move-object v2, v6

    move-object/from16 v6, v32

    goto/16 :goto_0

    :cond_17
    move-object/from16 v22, v5

    move-object/from16 v21, v8

    move-object/from16 v23, v12

    move-object v5, v4

    move-object v4, v1

    move-object v1, v11

    move-object/from16 v32, v2

    move-object v2, v0

    move-object v0, v3

    move-object v3, v6

    move-object/from16 v6, v32

    move-object/from16 v7, v16

    goto :goto_14

    :cond_18
    move-object/from16 v22, v5

    move-object/from16 v21, v8

    move-object/from16 v23, v12

    move-object v5, v4

    move-object v4, v1

    move-object v1, v11

    move-object/from16 v32, v2

    move-object v2, v0

    move-object v0, v3

    move-object v3, v6

    move-object/from16 v6, v32

    const/4 v7, 0x0

    :goto_14
    if-eqz v7, :cond_19

    const/4 v8, 0x0

    new-array v8, v8, [Ll/ۘۚ;

    .line 528
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Ll/ۘۚ;

    iput-object v7, v2, Ll/᩵ۚ;->ۘ:[Ll/ۘۚ;

    .line 556
    :cond_19
    invoke-virtual {v6}, Ljava/util/HashSet;->isEmpty()Z

    move-result v7

    const-string v8, "rotation"

    const-string v9, "scaleY"

    const-string v11, "scaleX"

    const-string v12, "progress"

    const-string v13, "translationZ"

    const-string v14, "translationY"

    const-string v15, "translationX"

    move-object/from16 v30, v0

    const-string v0, "rotationY"

    move-object/from16 v16, v10

    const-string v10, "rotationX"

    const/16 v17, 0x5

    const/16 v18, 0x4

    move-object/from16 v19, v3

    const-string v3, "CUSTOM,"

    move-object/from16 v25, v1

    const-string v1, ","

    if-nez v7, :cond_34

    .line 557
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iput-object v7, v2, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    .line 558
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_15
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_2f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 p1, v7

    move-object/from16 v7, v20

    check-cast v7, Ljava/lang/String;

    .line 560
    invoke-virtual {v7, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_1d

    move-object/from16 v24, v6

    .line 561
    new-instance v6, Landroid/util/SparseArray;

    invoke-direct {v6}, Landroid/util/SparseArray;-><init>()V

    .line 562
    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v20

    const/16 v26, 0x1

    move-object/from16 p2, v3

    aget-object v3, v20, v26

    .line 563
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_16
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_1c

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    move-object/from16 v28, v4

    move-object/from16 v4, v26

    check-cast v4, Ll/ۚ֡;

    move-object/from16 v26, v5

    .line 564
    iget-object v5, v4, Ll/ۚ֡;->֫:Ljava/util/HashMap;

    if-nez v5, :cond_1a

    goto :goto_17

    .line 567
    :cond_1a
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰܶ;

    if-eqz v5, :cond_1b

    .line 569
    iget v4, v4, Ll/ۚ֡;->ۧ:I

    invoke-virtual {v6, v4, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_1b
    :goto_17
    move-object/from16 v5, v26

    move-object/from16 v4, v28

    goto :goto_16

    :cond_1c
    move-object/from16 v28, v4

    move-object/from16 v26, v5

    .line 75
    new-instance v3, Ll/ۧ֨;

    .line 259
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    .line 260
    invoke-virtual {v7, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aget-object v4, v4, v5

    .line 261
    iput-object v6, v3, Ll/ۧ֨;->ܳ:Landroid/util/SparseArray;

    goto/16 :goto_1a

    :cond_1d
    move-object/from16 p2, v3

    move-object/from16 v28, v4

    move-object/from16 v26, v5

    move-object/from16 v24, v6

    .line 79
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_18

    :sswitch_0
    const-string v3, "waveOffset"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1e

    goto/16 :goto_18

    :cond_1e
    const/16 v3, 0xf

    goto/16 :goto_19

    :sswitch_1
    const-string v3, "alpha"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1f

    goto/16 :goto_18

    :cond_1f
    const/16 v3, 0xe

    goto/16 :goto_19

    :sswitch_2
    const-string v3, "transitionPathRotate"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_20

    goto/16 :goto_18

    :cond_20
    const/16 v3, 0xd

    goto/16 :goto_19

    :sswitch_3
    const-string v3, "elevation"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    goto/16 :goto_18

    :cond_21
    const/16 v3, 0xc

    goto/16 :goto_19

    :sswitch_4
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    goto/16 :goto_18

    :cond_22
    const/16 v3, 0xb

    goto/16 :goto_19

    :sswitch_5
    const-string v3, "transformPivotY"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    goto/16 :goto_18

    :cond_23
    const/16 v3, 0xa

    goto/16 :goto_19

    :sswitch_6
    const-string v3, "transformPivotX"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_24

    goto/16 :goto_18

    :cond_24
    const/16 v3, 0x9

    goto/16 :goto_19

    :sswitch_7
    const-string v3, "waveVariesBy"

    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    goto :goto_18

    :cond_25
    const/16 v3, 0x8

    goto :goto_19

    :sswitch_8
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_26

    goto :goto_18

    :cond_26
    const/4 v3, 0x7

    goto :goto_19

    :sswitch_9
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    goto :goto_18

    :cond_27
    const/4 v3, 0x6

    goto :goto_19

    :sswitch_a
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    goto :goto_18

    :cond_28
    const/4 v3, 0x5

    goto :goto_19

    :sswitch_b
    invoke-virtual {v7, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_29

    goto :goto_18

    :cond_29
    const/4 v3, 0x4

    goto :goto_19

    :sswitch_c
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2a

    goto :goto_18

    :cond_2a
    const/4 v3, 0x3

    goto :goto_19

    :sswitch_d
    invoke-virtual {v7, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    goto :goto_18

    :cond_2b
    const/4 v3, 0x2

    goto :goto_19

    :sswitch_e
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2c

    goto :goto_18

    :cond_2c
    const/4 v3, 0x1

    goto :goto_19

    :sswitch_f
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2d

    goto :goto_18

    :cond_2d
    const/4 v3, 0x0

    goto :goto_19

    :goto_18
    const/4 v3, -0x1

    :goto_19
    packed-switch v3, :pswitch_data_0

    const/4 v3, 0x0

    goto/16 :goto_1a

    .line 101
    :pswitch_0
    new-instance v3, Ll/֫֨;

    .line 168
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 81
    :pswitch_1
    new-instance v3, Ll/֫֨;

    .line 168
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 95
    :pswitch_2
    new-instance v3, Ll/ᩳ֨;

    .line 207
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 83
    :pswitch_3
    new-instance v3, Ll/ܽ֨;

    .line 159
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 85
    :pswitch_4
    new-instance v3, Ll/ۜ֨;

    .line 175
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 93
    :pswitch_5
    new-instance v3, Ll/ܳ֨;

    .line 201
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 91
    :pswitch_6
    new-instance v3, Ll/ܿ֨;

    .line 195
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 103
    :pswitch_7
    new-instance v3, Ll/֫֨;

    .line 168
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 99
    :pswitch_8
    new-instance v3, Ll/ܺ֨;

    .line 224
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 97
    :pswitch_9
    new-instance v3, Ll/ۡ֨;

    .line 217
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 111
    :pswitch_a
    new-instance v3, Ll/᩻֨;

    .line 301
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    const/4 v4, 0x0

    .line 302
    iput-boolean v4, v3, Ll/᩻֨;->ܳ:Z

    goto :goto_1a

    .line 109
    :pswitch_b
    new-instance v3, Ll/ᩴ֨;

    .line 245
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 107
    :pswitch_c
    new-instance v3, Ll/ۘ֨;

    .line 238
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 105
    :pswitch_d
    new-instance v3, Ll/ۖ֨;

    .line 231
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 89
    :pswitch_e
    new-instance v3, Ll/ۢ֨;

    .line 189
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    goto :goto_1a

    .line 87
    :pswitch_f
    new-instance v3, Ll/᩷֨;

    .line 182
    invoke-direct {v3}, Ll/᩵֨;-><init>()V

    :goto_1a
    if-nez v3, :cond_2e

    goto :goto_1b

    .line 579
    :cond_2e
    invoke-virtual {v3, v7}, Ll/᩵֨;->֫(Ljava/lang/String;)V

    .line 580
    iget-object v4, v2, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v4, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1b
    move-object/from16 v7, p1

    move-object/from16 v3, p2

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v28

    goto/16 :goto_15

    :cond_2f
    move-object/from16 p2, v3

    move-object/from16 v28, v4

    move-object/from16 v26, v5

    move-object/from16 v24, v6

    if-eqz v23, :cond_31

    .line 583
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_30
    :goto_1c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_31

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ֡;

    .line 584
    instance-of v5, v4, Ll/۠֡;

    if-eqz v5, :cond_30

    .line 585
    iget-object v5, v2, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v4, v5}, Ll/ۚ֡;->֫(Ljava/util/HashMap;)V

    goto :goto_1c

    .line 589
    :cond_31
    iget-object v3, v2, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const/4 v4, 0x0

    move-object/from16 v5, v22

    invoke-virtual {v5, v4, v3}, Ll/ᩴۚ;->֫(ILjava/util/HashMap;)V

    .line 590
    iget-object v3, v2, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const/16 v4, 0x64

    move-object/from16 v5, v21

    invoke-virtual {v5, v4, v3}, Ll/ᩴۚ;->֫(ILjava/util/HashMap;)V

    .line 592
    iget-object v3, v2, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_33

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object/from16 v5, v26

    .line 594
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_32

    .line 595
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_1e

    :cond_32
    const/4 v6, 0x0

    .line 597
    :goto_1e
    iget-object v7, v2, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵֨;

    invoke-virtual {v4, v6}, Ll/᩵֨;->֫(I)V

    move-object/from16 v26, v5

    goto :goto_1d

    :cond_33
    move-object/from16 v5, v26

    goto :goto_1f

    :cond_34
    move-object/from16 p2, v3

    move-object/from16 v28, v4

    move-object/from16 v24, v6

    .line 602
    :goto_1f
    invoke-virtual/range {v28 .. v28}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4c

    .line 603
    iget-object v3, v2, Ll/᩵ۚ;->᩹:Ljava/util/HashMap;

    if-nez v3, :cond_35

    .line 604
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, v2, Ll/᩵ۚ;->᩹:Ljava/util/HashMap;

    .line 606
    :cond_35
    invoke-virtual/range {v28 .. v28}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_20
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_48

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 607
    iget-object v6, v2, Ll/᩵ۚ;->᩹:Ljava/util/HashMap;

    invoke-virtual {v6, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_36

    goto :goto_20

    :cond_36
    move-object/from16 v6, p2

    .line 612
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3a

    .line 613
    new-instance v7, Landroid/util/SparseArray;

    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    .line 614
    invoke-virtual {v4, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v20

    const/16 v21, 0x1

    move-object/from16 p1, v3

    aget-object v3, v20, v21

    .line 615
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_21
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_39

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 p2, v6

    move-object/from16 v6, v21

    check-cast v6, Ll/ۚ֡;

    move-object/from16 v26, v5

    .line 616
    iget-object v5, v6, Ll/ۚ֡;->֫:Ljava/util/HashMap;

    if-nez v5, :cond_37

    goto :goto_22

    .line 619
    :cond_37
    invoke-virtual {v5, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰܶ;

    if-eqz v5, :cond_38

    .line 621
    iget v6, v6, Ll/ۚ֡;->ۧ:I

    invoke-virtual {v7, v6, v5}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_38
    :goto_22
    move-object/from16 v6, p2

    move-object/from16 v5, v26

    goto :goto_21

    :cond_39
    move-object/from16 v26, v5

    move-object/from16 p2, v6

    .line 125
    new-instance v3, Ll/ۚ֨;

    .line 322
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    .line 318
    new-instance v5, Landroid/util/SparseArray;

    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    iput-object v5, v3, Ll/ۚ֨;->ᩴ:Landroid/util/SparseArray;

    .line 323
    invoke-virtual {v4, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aget-object v5, v5, v6

    iput-object v5, v3, Ll/ۚ֨;->ۡ:Ljava/lang/String;

    .line 324
    iput-object v7, v3, Ll/ۚ֨;->ۖ:Landroid/util/SparseArray;

    move-wide/from16 v5, p3

    goto/16 :goto_26

    :cond_3a
    move-object/from16 p1, v3

    move-object/from16 v26, v5

    move-object/from16 p2, v6

    .line 130
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_1

    goto/16 :goto_23

    :sswitch_10
    const-string v3, "alpha"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3b

    goto/16 :goto_23

    :cond_3b
    const/16 v3, 0xb

    goto/16 :goto_24

    :sswitch_11
    const-string v3, "transitionPathRotate"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3c

    goto/16 :goto_23

    :cond_3c
    const/16 v3, 0xa

    goto/16 :goto_24

    :sswitch_12
    const-string v3, "elevation"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3d

    goto/16 :goto_23

    :cond_3d
    const/16 v3, 0x9

    goto/16 :goto_24

    :sswitch_13
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3e

    goto :goto_23

    :cond_3e
    const/16 v3, 0x8

    goto :goto_24

    :sswitch_14
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3f

    goto :goto_23

    :cond_3f
    const/4 v3, 0x7

    goto :goto_24

    :sswitch_15
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_40

    goto :goto_23

    :cond_40
    const/4 v3, 0x6

    goto :goto_24

    :sswitch_16
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_41

    goto :goto_23

    :cond_41
    const/4 v3, 0x5

    goto :goto_24

    :sswitch_17
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_42

    goto :goto_23

    :cond_42
    const/4 v3, 0x4

    goto :goto_24

    :sswitch_18
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_43

    goto :goto_23

    :cond_43
    const/4 v3, 0x3

    goto :goto_24

    :sswitch_19
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_44

    goto :goto_23

    :cond_44
    const/4 v3, 0x2

    goto :goto_24

    :sswitch_1a
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_45

    goto :goto_23

    :cond_45
    const/4 v3, 0x1

    goto :goto_24

    :sswitch_1b
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_46

    goto :goto_23

    :cond_46
    const/4 v3, 0x0

    goto :goto_24

    :goto_23
    const/4 v3, -0x1

    :goto_24
    packed-switch v3, :pswitch_data_1

    move-wide/from16 v5, p3

    const/4 v3, 0x0

    goto :goto_26

    .line 132
    :pswitch_10
    new-instance v3, Ll/֡֨;

    .line 229
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 147
    :pswitch_11
    new-instance v3, Ll/۠֨;

    .line 261
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 135
    :pswitch_12
    new-instance v3, Ll/֨֨;

    .line 219
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 138
    :pswitch_13
    new-instance v3, Ll/᩸֨;

    .line 237
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 153
    :pswitch_14
    new-instance v3, Ll/ۗ֨;

    .line 281
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 150
    :pswitch_15
    new-instance v3, Ll/ۙ֨;

    .line 273
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 165
    :pswitch_16
    new-instance v3, Ll/ܶ֨;

    .line 389
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    const/4 v5, 0x0

    .line 390
    iput-boolean v5, v3, Ll/ܶ֨;->ۡ:Z

    goto :goto_25

    .line 162
    :pswitch_17
    new-instance v3, Ll/ۤ֨;

    .line 305
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 159
    :pswitch_18
    new-instance v3, Ll/۫֨;

    .line 297
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 156
    :pswitch_19
    new-instance v3, Ll/۬֨;

    .line 289
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 144
    :pswitch_1a
    new-instance v3, Ll/᩶֨;

    .line 253
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    goto :goto_25

    .line 141
    :pswitch_1b
    new-instance v3, Ll/᩹֨;

    .line 245
    invoke-direct {v3}, Ll/ۛ֨;-><init>()V

    :goto_25
    move-wide/from16 v5, p3

    .line 175
    iput-wide v5, v3, Ll/ۛ֨;->ܽ:J

    :goto_26
    if-nez v3, :cond_47

    goto :goto_27

    .line 632
    :cond_47
    invoke-virtual {v3, v4}, Ll/ۛ֨;->֫(Ljava/lang/String;)V

    .line 633
    iget-object v7, v2, Ll/᩵ۚ;->᩹:Ljava/util/HashMap;

    invoke-virtual {v7, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_27
    move-object/from16 v3, p1

    move-object/from16 v5, v26

    goto/16 :goto_20

    :cond_48
    move-object/from16 v26, v5

    if-eqz v23, :cond_4a

    .line 637
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_49
    :goto_28
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ֡;

    .line 638
    instance-of v4, v3, Ll/ܺۚ;

    if-eqz v4, :cond_49

    .line 639
    check-cast v3, Ll/ܺۚ;

    iget-object v4, v2, Ll/᩵ۚ;->᩹:Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Ll/ܺۚ;->ܽ(Ljava/util/HashMap;)V

    goto :goto_28

    .line 644
    :cond_4a
    iget-object v1, v2, Ll/᩵ۚ;->᩹:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v4, v26

    .line 646
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4b

    .line 647
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_2a

    :cond_4b
    const/4 v5, 0x0

    .line 649
    :goto_2a
    iget-object v6, v2, Ll/᩵ۚ;->᩹:Ljava/util/HashMap;

    invoke-virtual {v6, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ֨;

    invoke-virtual {v3, v5}, Ll/ۛ֨;->֫(I)V

    move-object/from16 v26, v4

    goto :goto_29

    .line 655
    :cond_4c
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v3, v1, 0x2

    new-array v4, v3, [Ll/ۛۚ;

    const/4 v5, 0x0

    .line 657
    aput-object v19, v4, v5

    add-int/lit8 v1, v1, 0x1

    .line 658
    aput-object v16, v4, v1

    .line 659
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_4d

    iget v1, v2, Ll/᩵ۚ;->ܿ:I

    const/4 v6, -0x1

    if-ne v1, v6, :cond_4d

    .line 660
    iput v5, v2, Ll/᩵ۚ;->ܿ:I

    .line 662
    :cond_4d
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x1

    :goto_2b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛۚ;

    add-int/lit8 v7, v5, 0x1

    .line 663
    aput-object v6, v4, v5

    move v5, v7

    goto :goto_2b

    .line 668
    :cond_4e
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v5, v16

    .line 669
    iget-object v5, v5, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_51

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    move-object/from16 p1, v5

    move-object/from16 v7, v19

    .line 670
    iget-object v5, v7, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v5, v6}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4f

    .line 671
    new-instance v5, Ljava/lang/StringBuilder;

    move-object/from16 v19, v7

    move-object/from16 v7, p2

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v7, v24

    invoke-virtual {v7, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_50

    .line 672
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2d

    :cond_4f
    move-object/from16 v19, v7

    move-object/from16 v7, v24

    :cond_50
    :goto_2d
    move-object/from16 v5, p1

    move-object/from16 v24, v7

    goto :goto_2c

    :cond_51
    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/String;

    .line 676
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iput-object v1, v2, Ll/᩵ۚ;->ܽ:[Ljava/lang/String;

    .line 680
    array-length v1, v1

    new-array v1, v1, [I

    iput-object v1, v2, Ll/᩵ۚ;->ۧ:[I

    const/4 v1, 0x0

    .line 681
    :goto_2e
    iget-object v5, v2, Ll/᩵ۚ;->ܽ:[Ljava/lang/String;

    array-length v6, v5

    if-ge v1, v6, :cond_54

    .line 682
    aget-object v5, v5, v1

    .line 683
    iget-object v6, v2, Ll/᩵ۚ;->ۧ:[I

    const/4 v7, 0x0

    aput v7, v6, v1

    const/4 v6, 0x0

    :goto_2f
    if-ge v6, v3, :cond_53

    .line 685
    aget-object v7, v4, v6

    iget-object v7, v7, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v7, v5}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_52

    .line 686
    iget-object v7, v2, Ll/᩵ۚ;->ۧ:[I

    aget v16, v7, v1

    aget-object v6, v4, v6

    iget-object v6, v6, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v6, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܰܶ;

    invoke-virtual {v5}, Ll/ܰܶ;->ܽ()I

    move-result v5

    add-int v5, v5, v16

    aput v5, v7, v1

    goto :goto_30

    :cond_52
    add-int/lit8 v6, v6, 0x1

    goto :goto_2f

    :cond_53
    :goto_30
    add-int/lit8 v1, v1, 0x1

    goto :goto_2e

    :cond_54
    const/4 v1, 0x0

    .line 691
    aget-object v1, v4, v1

    iget v1, v1, Ll/ۛۚ;->۬:I

    const/4 v6, -0x1

    if-eq v1, v6, :cond_55

    const/4 v1, 0x1

    goto :goto_31

    :cond_55
    const/4 v1, 0x0

    .line 692
    :goto_31
    array-length v5, v5

    add-int/lit8 v5, v5, 0x12

    new-array v6, v5, [Z

    const/4 v7, 0x1

    :goto_32
    if-ge v7, v3, :cond_56

    move-object/from16 p1, v10

    .line 694
    aget-object v10, v4, v7

    add-int/lit8 v16, v7, -0x1

    move-object/from16 p2, v0

    aget-object v0, v4, v16

    invoke-virtual {v10, v0, v6, v1}, Ll/ۛۚ;->֫(Ll/ۛۚ;[ZZ)V

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v10, p1

    move-object/from16 v0, p2

    goto :goto_32

    :cond_56
    move-object/from16 p2, v0

    move-object/from16 p1, v10

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_33
    if-ge v0, v5, :cond_58

    .line 699
    aget-boolean v7, v6, v0

    if-eqz v7, :cond_57

    add-int/lit8 v1, v1, 0x1

    :cond_57
    add-int/lit8 v0, v0, 0x1

    goto :goto_33

    .line 704
    :cond_58
    new-array v0, v1, [I

    iput-object v0, v2, Ll/᩵ۚ;->ۡ:[I

    .line 705
    new-array v0, v1, [D

    iput-object v0, v2, Ll/᩵ۚ;->ۢ:[D

    .line 706
    new-array v0, v1, [D

    iput-object v0, v2, Ll/᩵ۚ;->ܺ:[D

    const/4 v0, 0x1

    const/4 v1, 0x0

    :goto_34
    if-ge v0, v5, :cond_5a

    .line 710
    aget-boolean v7, v6, v0

    if-eqz v7, :cond_59

    .line 711
    iget-object v7, v2, Ll/᩵ۚ;->ۡ:[I

    add-int/lit8 v10, v1, 0x1

    aput v0, v7, v1

    move v1, v10

    :cond_59
    add-int/lit8 v0, v0, 0x1

    goto :goto_34

    .line 714
    :cond_5a
    iget-object v0, v2, Ll/᩵ۚ;->ۡ:[I

    array-length v0, v0

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v5, 0x1

    aput v0, v1, v5

    const/4 v0, 0x0

    aput v3, v1, v0

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[D

    .line 715
    new-array v5, v3, [D

    const/4 v6, 0x0

    :goto_35
    if-ge v6, v3, :cond_5d

    .line 718
    aget-object v7, v4, v6

    aget-object v10, v1, v6

    move-object/from16 v16, v15

    iget-object v15, v2, Ll/᩵ۚ;->ۡ:[I

    move-object/from16 v20, v14

    .line 634
    iget v14, v7, Ll/ۛۚ;->ۨ:F

    move-object/from16 v21, v13

    iget v13, v7, Ll/ۛۚ;->۟:F

    move-object/from16 v22, v12

    iget v12, v7, Ll/ۛۚ;->֫֫:F

    move-object/from16 v24, v11

    iget v11, v7, Ll/ۛۚ;->ܰ:F

    move-object/from16 v26, v9

    iget v9, v7, Ll/ۛۚ;->᩹:F

    iget v7, v7, Ll/ۛۚ;->۫:F

    move-object/from16 v27, v8

    const/4 v8, 0x6

    new-array v8, v8, [F

    const/16 v28, 0x0

    aput v14, v8, v28

    const/4 v14, 0x1

    aput v13, v8, v14

    const/4 v13, 0x2

    aput v12, v8, v13

    const/4 v12, 0x3

    aput v11, v8, v12

    aput v9, v8, v18

    aput v7, v8, v17

    const/4 v7, 0x0

    const/4 v9, 0x0

    .line 636
    :goto_36
    array-length v11, v15

    if-ge v7, v11, :cond_5c

    .line 637
    aget v11, v15, v7

    const/4 v12, 0x6

    if-ge v11, v12, :cond_5b

    add-int/lit8 v12, v9, 0x1

    .line 638
    aget v11, v8, v11

    float-to-double v13, v11

    aput-wide v13, v10, v9

    move v9, v12

    :cond_5b
    add-int/lit8 v7, v7, 0x1

    goto :goto_36

    .line 719
    :cond_5c
    aget-object v7, v4, v6

    iget v7, v7, Ll/ۛۚ;->᩺:F

    float-to-double v7, v7

    aput-wide v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v15, v16

    move-object/from16 v14, v20

    move-object/from16 v13, v21

    move-object/from16 v12, v22

    move-object/from16 v11, v24

    move-object/from16 v9, v26

    move-object/from16 v8, v27

    goto :goto_35

    :cond_5d
    move-object/from16 v27, v8

    move-object/from16 v26, v9

    move-object/from16 v24, v11

    move-object/from16 v22, v12

    move-object/from16 v21, v13

    move-object/from16 v20, v14

    move-object/from16 v16, v15

    const/4 v6, 0x0

    .line 722
    :goto_37
    iget-object v7, v2, Ll/᩵ۚ;->ۡ:[I

    array-length v8, v7

    if-ge v6, v8, :cond_5f

    .line 723
    aget v7, v7, v6

    const/4 v8, 0x6

    if-ge v7, v8, :cond_5e

    .line 725
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, v2, Ll/᩵ۚ;->ۡ:[I

    aget v8, v8, v6

    sget-object v9, Ll/ۛۚ;->ۧ֫:[Ljava/lang/String;

    aget-object v8, v9, v8

    const-string v9, " ["

    .line 0
    invoke-static {v7, v8, v9}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    :goto_38
    if-ge v8, v3, :cond_5e

    invoke-static {v7}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    .line 727
    aget-object v9, v1, v8

    aget-wide v10, v9, v6

    invoke-virtual {v7, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_38

    :cond_5e
    add-int/lit8 v6, v6, 0x1

    goto :goto_37

    .line 731
    :cond_5f
    iget-object v6, v2, Ll/᩵ۚ;->ܽ:[Ljava/lang/String;

    array-length v6, v6

    add-int/lit8 v6, v6, 0x1

    new-array v6, v6, [Ll/᩷֡;

    iput-object v6, v2, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    const/4 v6, 0x0

    .line 733
    :goto_39
    iget-object v7, v2, Ll/᩵ۚ;->ܽ:[Ljava/lang/String;

    array-length v8, v7

    if-ge v6, v8, :cond_65

    .line 737
    aget-object v7, v7, v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_3a
    if-ge v9, v3, :cond_64

    .line 740
    aget-object v12, v4, v9

    .line 644
    iget-object v12, v12, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v12, v7}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_63

    if-nez v11, :cond_60

    .line 742
    new-array v10, v3, [D

    .line 743
    aget-object v11, v4, v9

    .line 648
    iget-object v11, v11, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v11, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܰܶ;

    invoke-virtual {v11}, Ll/ܰܶ;->ܽ()I

    move-result v11

    const/4 v12, 0x2

    new-array v12, v12, [I

    const/4 v13, 0x1

    aput v11, v12, v13

    const/4 v11, 0x0

    aput v3, v12, v11

    .line 743
    invoke-static {v0, v12}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [[D

    .line 745
    :cond_60
    aget-object v12, v4, v9

    iget v13, v12, Ll/ۛۚ;->᩺:F

    float-to-double v13, v13

    aput-wide v13, v10, v8

    .line 746
    aget-object v13, v11, v8

    .line 652
    iget-object v12, v12, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v12, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܰܶ;

    .line 653
    invoke-virtual {v12}, Ll/ܰܶ;->ܽ()I

    move-result v14

    const/4 v15, 0x1

    if-ne v14, v15, :cond_62

    .line 654
    invoke-virtual {v12}, Ll/ܰܶ;->ۧ()F

    move-result v12

    float-to-double v14, v12

    const/4 v12, 0x0

    aput-wide v14, v13, v12

    :cond_61
    move-object/from16 p3, v7

    move-object/from16 p4, v10

    move-object/from16 v28, v11

    goto :goto_3c

    .line 657
    :cond_62
    invoke-virtual {v12}, Ll/ܰܶ;->ܽ()I

    move-result v14

    .line 658
    new-array v15, v14, [F

    .line 659
    invoke-virtual {v12, v15}, Ll/ܰܶ;->֫([F)V

    const/4 v12, 0x0

    const/16 v17, 0x0

    :goto_3b
    if-ge v12, v14, :cond_61

    add-int/lit8 v18, v17, 0x1

    move-object/from16 p3, v7

    .line 661
    aget v7, v15, v12

    move-object/from16 p4, v10

    move-object/from16 v28, v11

    float-to-double v10, v7

    aput-wide v10, v13, v17

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v7, p3

    move-object/from16 v10, p4

    move/from16 v17, v18

    move-object/from16 v11, v28

    goto :goto_3b

    :goto_3c
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v10, p4

    move-object/from16 v11, v28

    goto :goto_3d

    :cond_63
    move-object/from16 p3, v7

    :goto_3d
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v7, p3

    goto/16 :goto_3a

    .line 750
    :cond_64
    invoke-static {v10, v8}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object v7

    .line 751
    invoke-static {v11, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [[D

    .line 752
    iget-object v9, v2, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    add-int/lit8 v6, v6, 0x1

    iget v10, v2, Ll/᩵ۚ;->ܿ:I

    invoke-static {v10, v7, v8}, Ll/᩷֡;->֫(I[D[[D)Ll/᩷֡;

    move-result-object v7

    aput-object v7, v9, v6

    goto/16 :goto_39

    .line 755
    :cond_65
    iget-object v6, v2, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    iget v7, v2, Ll/᩵ۚ;->ܿ:I

    invoke-static {v7, v5, v1}, Ll/᩷֡;->֫(I[D[[D)Ll/᩷֡;

    move-result-object v1

    const/4 v5, 0x0

    aput-object v1, v6, v5

    .line 757
    aget-object v1, v4, v5

    iget v1, v1, Ll/ۛۚ;->۬:I

    const/4 v6, -0x1

    if-eq v1, v6, :cond_67

    .line 759
    new-array v1, v3, [I

    .line 760
    new-array v6, v3, [D

    const/4 v7, 0x2

    new-array v8, v7, [I

    const/4 v9, 0x1

    aput v7, v8, v9

    aput v3, v8, v5

    .line 761
    invoke-static {v0, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[D

    const/4 v5, 0x0

    :goto_3e
    if-ge v5, v3, :cond_66

    .line 763
    aget-object v7, v4, v5

    iget v8, v7, Ll/ۛۚ;->۬:I

    aput v8, v1, v5

    .line 764
    iget v8, v7, Ll/ۛۚ;->᩺:F

    float-to-double v8, v8

    aput-wide v8, v6, v5

    .line 765
    aget-object v8, v0, v5

    iget v9, v7, Ll/ۛۚ;->۟:F

    float-to-double v9, v9

    const/4 v11, 0x0

    aput-wide v9, v8, v11

    .line 766
    iget v7, v7, Ll/ۛۚ;->֫֫:F

    float-to-double v9, v7

    const/4 v7, 0x1

    aput-wide v9, v8, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_3e

    .line 769
    :cond_66
    invoke-static {v1, v6, v0}, Ll/᩷֡;->֫([I[D[[D)Ll/᩷֡;

    move-result-object v0

    iput-object v0, v2, Ll/᩵ۚ;->֫:Ll/᩷֡;

    .line 774
    :cond_67
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v2, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-eqz v23, :cond_83

    .line 776
    invoke-virtual/range {v30 .. v30}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/high16 v1, 0x7fc00000    # Float.NaN

    :goto_3f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_80

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "CUSTOM"

    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_68

    .line 98
    new-instance v4, Ll/ۗ֡;

    .line 282
    invoke-direct {v4}, Ll/ܳۚ;-><init>()V

    const/4 v5, 0x1

    new-array v5, v5, [F

    .line 283
    iput-object v5, v4, Ll/ۗ֡;->᩻:[F

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object v13, v4

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    goto/16 :goto_46

    .line 100
    :cond_68
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_2

    :goto_40
    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    goto/16 :goto_44

    :sswitch_1c
    const-string v4, "waveOffset"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_69

    goto :goto_40

    :cond_69
    const/16 v4, 0xd

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    const/16 v13, 0xd

    goto/16 :goto_45

    :sswitch_1d
    const-string v4, "alpha"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6a

    goto :goto_40

    :cond_6a
    const/16 v4, 0xc

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    const/16 v13, 0xc

    goto/16 :goto_45

    :sswitch_1e
    const-string v4, "transitionPathRotate"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6b

    goto :goto_40

    :cond_6b
    const/16 v4, 0xb

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    const/16 v13, 0xb

    goto/16 :goto_45

    :sswitch_1f
    const-string v4, "elevation"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6c

    goto :goto_40

    :cond_6c
    const/16 v4, 0xa

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    const/16 v13, 0xa

    goto/16 :goto_45

    :sswitch_20
    move-object/from16 v4, v27

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6d

    goto :goto_41

    :cond_6d
    const/16 v5, 0x9

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    const/16 v13, 0x9

    goto/16 :goto_45

    :sswitch_21
    move-object/from16 v4, v27

    const-string v5, "waveVariesBy"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6e

    :goto_41
    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    goto/16 :goto_44

    :cond_6e
    const/16 v5, 0x8

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    const/16 v13, 0x8

    goto/16 :goto_45

    :sswitch_22
    move-object/from16 v5, v26

    move-object/from16 v4, v27

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6f

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    goto/16 :goto_44

    :cond_6f
    const/4 v6, 0x7

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    const/4 v13, 0x7

    goto/16 :goto_45

    :sswitch_23
    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_70

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    goto/16 :goto_42

    :cond_70
    const/4 v7, 0x6

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    const/4 v13, 0x6

    goto/16 :goto_45

    :sswitch_24
    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_71

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    goto :goto_42

    :cond_71
    const/4 v8, 0x5

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    const/4 v13, 0x5

    goto/16 :goto_45

    :sswitch_25
    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_72

    move-object/from16 v9, v20

    goto :goto_42

    :cond_72
    const/4 v9, 0x4

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    const/4 v13, 0x4

    goto/16 :goto_45

    :sswitch_26
    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_73

    :goto_42
    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    goto/16 :goto_44

    :cond_73
    const/4 v10, 0x3

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    const/4 v13, 0x3

    goto/16 :goto_45

    :sswitch_27
    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_74

    move-object/from16 v11, p2

    goto :goto_43

    :cond_74
    const/4 v11, 0x2

    move-object/from16 v12, p1

    move-object/from16 v11, p2

    const/4 v13, 0x2

    goto :goto_45

    :sswitch_28
    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_75

    :goto_43
    move-object/from16 v12, p1

    goto :goto_44

    :cond_75
    const/4 v12, 0x1

    move-object/from16 v12, p1

    const/4 v13, 0x1

    goto :goto_45

    :sswitch_29
    move-object/from16 v12, p1

    move-object/from16 v11, p2

    move-object/from16 v10, v16

    move-object/from16 v9, v20

    move-object/from16 v8, v21

    move-object/from16 v7, v22

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v4, v27

    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_76

    goto :goto_44

    :cond_76
    const/4 v13, 0x0

    goto :goto_45

    :goto_44
    const/4 v13, -0x1

    :goto_45
    packed-switch v13, :pswitch_data_2

    const/4 v13, 0x0

    goto :goto_46

    .line 118
    :pswitch_1c
    new-instance v13, Ll/ۙ֡;

    .line 207
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 102
    :pswitch_1d
    new-instance v13, Ll/ۙ֡;

    .line 207
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 112
    :pswitch_1e
    new-instance v13, Ll/ۤ֡;

    .line 235
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 104
    :pswitch_1f
    new-instance v13, Ll/۫֡;

    .line 198
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 106
    :pswitch_20
    new-instance v13, Ll/ۨ֡;

    .line 214
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 120
    :pswitch_21
    new-instance v13, Ll/ۙ֡;

    .line 207
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 116
    :pswitch_22
    new-instance v13, Ll/֫ۚ;

    .line 252
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 114
    :pswitch_23
    new-instance v13, Ll/۟֡;

    .line 245
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 128
    :pswitch_24
    new-instance v13, Ll/ۛ֡;

    .line 292
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    const/4 v14, 0x0

    .line 293
    iput-boolean v14, v13, Ll/ۛ֡;->᩻:Z

    goto :goto_46

    .line 126
    :pswitch_25
    new-instance v13, Ll/ᩳۚ;

    .line 273
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 124
    :pswitch_26
    new-instance v13, Ll/ܽۚ;

    .line 266
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 122
    :pswitch_27
    new-instance v13, Ll/ۧۚ;

    .line 259
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 110
    :pswitch_28
    new-instance v13, Ll/ܰ֡;

    .line 228
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    goto :goto_46

    .line 108
    :pswitch_29
    new-instance v13, Ll/᩺֡;

    .line 221
    invoke-direct {v13}, Ll/ܳۚ;-><init>()V

    :goto_46
    if-nez v13, :cond_77

    move-object/from16 p1, v0

    move-object/from16 v27, v4

    move-object/from16 v26, v5

    move-object/from16 v24, v6

    move-object/from16 p2, v7

    move-object/from16 v30, v8

    move-object/from16 v18, v9

    goto/16 :goto_4d

    .line 51
    :cond_77
    iget v14, v13, Ll/ܳۚ;->ᩳ:I

    const/4 v15, 0x1

    if-ne v14, v15, :cond_7f

    .line 783
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v14

    if-eqz v14, :cond_7f

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/16 v14, 0x63

    int-to-float v14, v14

    const/high16 v15, 0x3f800000    # 1.0f

    div-float/2addr v15, v14

    const-wide/16 v16, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    move-object/from16 p1, v0

    move-object/from16 v27, v4

    move-wide/from16 v20, v16

    const/4 v0, 0x0

    :goto_47
    const/16 v4, 0x64

    if-ge v0, v4, :cond_7e

    int-to-float v4, v0

    mul-float v4, v4, v15

    move-object/from16 v26, v5

    move-object/from16 v24, v6

    float-to-double v5, v4

    move-wide/from16 v28, v5

    move-object/from16 v5, v19

    .line 277
    iget-object v6, v5, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    .line 280
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v18

    const/high16 v19, 0x7fc00000    # Float.NaN

    const/16 v22, 0x0

    :goto_48
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v30

    if-eqz v30, :cond_7a

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v30

    move-object/from16 p2, v7

    move-object/from16 v7, v30

    check-cast v7, Ll/ۛۚ;

    move-object/from16 v30, v8

    .line 281
    iget-object v8, v7, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    if-eqz v8, :cond_79

    move-object/from16 p3, v8

    .line 282
    iget v8, v7, Ll/ۛۚ;->᩺:F

    cmpg-float v31, v8, v4

    if-gez v31, :cond_78

    move-object/from16 v6, p3

    move/from16 v22, v8

    goto :goto_49

    .line 286
    :cond_78
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    move-result v8

    if-eqz v8, :cond_79

    .line 287
    iget v7, v7, Ll/ۛۚ;->᩺:F

    move/from16 v19, v7

    :cond_79
    :goto_49
    move-object/from16 v7, p2

    move-object/from16 v8, v30

    goto :goto_48

    :cond_7a
    move-object/from16 p2, v7

    move-object/from16 v30, v8

    if-eqz v6, :cond_7c

    .line 294
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_7b

    const/high16 v19, 0x3f800000    # 1.0f

    :cond_7b
    sub-float v4, v4, v22

    sub-float v19, v19, v22

    div-float v4, v4, v19

    float-to-double v7, v4

    .line 298
    invoke-virtual {v6, v7, v8}, Ll/ۡ֡;->֫(D)D

    move-result-wide v6

    double-to-float v4, v6

    mul-float v4, v4, v19

    add-float v4, v4, v22

    float-to-double v6, v4

    goto :goto_4a

    :cond_7c
    move-wide/from16 v6, v28

    .line 303
    :goto_4a
    iget-object v4, v2, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    const/4 v8, 0x0

    aget-object v4, v4, v8

    iget-object v8, v2, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v4, v6, v7, v8}, Ll/᩷֡;->֫(D[D)V

    .line 304
    iget-object v4, v2, Ll/᩵ۚ;->ۡ:[I

    iget-object v6, v2, Ll/᩵ۚ;->ۢ:[D

    const/4 v7, 0x0

    invoke-virtual {v5, v4, v6, v1, v7}, Ll/ۛۚ;->֫([I[D[FI)V

    if-lez v0, :cond_7d

    const/4 v4, 0x0

    float-to-double v6, v14

    const/4 v8, 0x1

    .line 306
    aget v8, v1, v8

    move-object/from16 v18, v9

    float-to-double v8, v8

    sub-double v8, v16, v8

    aget v14, v1, v4

    move-object/from16 v19, v5

    float-to-double v4, v14

    sub-double v4, v20, v4

    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v4

    add-double/2addr v4, v6

    double-to-float v14, v4

    goto :goto_4b

    :cond_7d
    move-object/from16 v19, v5

    move-object/from16 v18, v9

    :goto_4b
    const/4 v4, 0x0

    .line 308
    aget v4, v1, v4

    float-to-double v4, v4

    const/4 v6, 0x1

    .line 309
    aget v6, v1, v6

    float-to-double v6, v6

    add-int/lit8 v0, v0, 0x1

    move-wide/from16 v20, v4

    move-wide/from16 v16, v6

    move-object/from16 v9, v18

    move-object/from16 v6, v24

    move-object/from16 v5, v26

    move-object/from16 v8, v30

    move-object/from16 v7, p2

    goto/16 :goto_47

    :cond_7e
    move-object/from16 v26, v5

    move-object/from16 v24, v6

    move-object/from16 p2, v7

    move-object/from16 v30, v8

    move-object/from16 v18, v9

    move v1, v14

    goto :goto_4c

    :cond_7f
    move-object/from16 p1, v0

    move-object/from16 v27, v4

    move-object/from16 v26, v5

    move-object/from16 v24, v6

    move-object/from16 p2, v7

    move-object/from16 v30, v8

    move-object/from16 v18, v9

    .line 787
    :goto_4c
    invoke-virtual {v13, v3}, Ll/ܳۚ;->֫(Ljava/lang/String;)V

    .line 788
    iget-object v0, v2, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0, v3, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4d
    move-object/from16 v0, p1

    move-object/from16 v22, p2

    move-object/from16 v16, v10

    move-object/from16 p2, v11

    move-object/from16 p1, v12

    move-object/from16 v20, v18

    move-object/from16 v21, v30

    goto/16 :goto_3f

    .line 790
    :cond_80
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_81
    :goto_4e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_82

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ֡;

    .line 791
    instance-of v3, v1, Ll/᩹֡;

    if-eqz v3, :cond_81

    .line 792
    check-cast v1, Ll/᩹֡;

    iget-object v3, v2, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v1, v3}, Ll/᩹֡;->ܽ(Ljava/util/HashMap;)V

    goto :goto_4e

    .line 795
    :cond_82
    iget-object v0, v2, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_83

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۚ;

    .line 796
    invoke-virtual {v1}, Ll/ܳۚ;->֫()V

    goto :goto_4f

    :cond_83
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4a771f66 -> :sswitch_f
        -0x4a771f65 -> :sswitch_e
        -0x490b9c39 -> :sswitch_d
        -0x490b9c38 -> :sswitch_c
        -0x490b9c37 -> :sswitch_b
        -0x3bab3dd3 -> :sswitch_a
        -0x3621dfb2 -> :sswitch_9
        -0x3621dfb1 -> :sswitch_8
        -0x2f893320 -> :sswitch_7
        -0x2d5a2d1e -> :sswitch_6
        -0x2d5a2d1d -> :sswitch_5
        -0x266f082 -> :sswitch_4
        -0x42d1a3 -> :sswitch_3
        0x2382115 -> :sswitch_2
        0x589b15e -> :sswitch_1
        0x94e04ec -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x4a771f66 -> :sswitch_1b
        -0x4a771f65 -> :sswitch_1a
        -0x490b9c39 -> :sswitch_19
        -0x490b9c38 -> :sswitch_18
        -0x490b9c37 -> :sswitch_17
        -0x3bab3dd3 -> :sswitch_16
        -0x3621dfb2 -> :sswitch_15
        -0x3621dfb1 -> :sswitch_14
        -0x266f082 -> :sswitch_13
        -0x42d1a3 -> :sswitch_12
        0x2382115 -> :sswitch_11
        0x589b15e -> :sswitch_10
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x4a771f66 -> :sswitch_29
        -0x4a771f65 -> :sswitch_28
        -0x490b9c39 -> :sswitch_27
        -0x490b9c38 -> :sswitch_26
        -0x490b9c37 -> :sswitch_25
        -0x3bab3dd3 -> :sswitch_24
        -0x3621dfb2 -> :sswitch_23
        -0x3621dfb1 -> :sswitch_22
        -0x2f893320 -> :sswitch_21
        -0x266f082 -> :sswitch_20
        -0x42d1a3 -> :sswitch_1f
        0x2382115 -> :sswitch_1e
        0x589b15e -> :sswitch_1d
        0x94e04ec -> :sswitch_1c
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch
.end method

.method public final ֫(I[F)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    add-int/lit8 v3, v1, -0x1

    int-to-float v3, v3

    const/high16 v4, 0x3f800000    # 1.0f

    div-float v3, v4, v3

    .line 136
    iget-object v5, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const-string v6, "translationX"

    const/4 v7, 0x0

    if-nez v5, :cond_0

    move-object v5, v7

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩵֨;

    .line 137
    :goto_0
    iget-object v8, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    const-string v9, "translationY"

    if-nez v8, :cond_1

    move-object v8, v7

    goto :goto_1

    :cond_1
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩵֨;

    .line 138
    :goto_1
    iget-object v10, v0, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-nez v10, :cond_2

    move-object v6, v7

    goto :goto_2

    :cond_2
    invoke-virtual {v10, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܳۚ;

    .line 139
    :goto_2
    iget-object v10, v0, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-nez v10, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v10, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳۚ;

    :goto_3
    const/4 v9, 0x0

    :goto_4
    if-ge v9, v1, :cond_10

    int-to-float v10, v9

    mul-float v10, v10, v3

    .line 143
    iget v11, v0, Ll/᩵ۚ;->۠:F

    const/4 v12, 0x0

    cmpl-float v4, v11, v4

    if-eqz v4, :cond_5

    .line 144
    iget v4, v0, Ll/᩵ۚ;->֨:F

    cmpg-float v13, v10, v4

    if-gez v13, :cond_4

    const/4 v10, 0x0

    :cond_4
    cmpl-float v13, v10, v4

    if-lez v13, :cond_5

    float-to-double v13, v10

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    cmpg-double v17, v13, v15

    if-gez v17, :cond_5

    sub-float/2addr v10, v4

    mul-float v10, v10, v11

    :cond_5
    float-to-double v13, v10

    .line 154
    iget-object v4, v0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    iget-object v11, v4, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    .line 157
    iget-object v15, v0, Ll/᩵ۚ;->ᩴ:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const/high16 v16, 0x7fc00000    # Float.NaN

    :goto_5
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_8

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v1, v17

    check-cast v1, Ll/ۛۚ;

    move/from16 v17, v3

    .line 158
    iget-object v3, v1, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    if-eqz v3, :cond_7

    move-object/from16 v18, v3

    .line 159
    iget v3, v1, Ll/ۛۚ;->᩺:F

    cmpg-float v19, v3, v10

    if-gez v19, :cond_6

    move v12, v3

    move-object/from16 v11, v18

    goto :goto_6

    .line 163
    :cond_6
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 164
    iget v1, v1, Ll/ۛۚ;->᩺:F

    move/from16 v16, v1

    :cond_7
    :goto_6
    move/from16 v1, p1

    move/from16 v3, v17

    goto :goto_5

    :cond_8
    move/from16 v17, v3

    const/4 v1, 0x0

    if-eqz v11, :cond_a

    .line 171
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_9

    const/high16 v16, 0x3f800000    # 1.0f

    :cond_9
    sub-float v3, v10, v12

    sub-float v16, v16, v12

    div-float v3, v3, v16

    float-to-double v13, v3

    .line 175
    invoke-virtual {v11, v13, v14}, Ll/ۡ֡;->֫(D)D

    move-result-wide v13

    double-to-float v3, v13

    mul-float v3, v3, v16

    add-float/2addr v3, v12

    float-to-double v13, v3

    .line 180
    :cond_a
    iget-object v3, v0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    aget-object v1, v3, v1

    iget-object v3, v0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v1, v13, v14, v3}, Ll/᩷֡;->֫(D[D)V

    .line 181
    iget-object v1, v0, Ll/᩵ۚ;->֫:Ll/᩷֡;

    if-eqz v1, :cond_b

    .line 182
    iget-object v3, v0, Ll/᩵ۚ;->ۢ:[D

    array-length v11, v3

    if-lez v11, :cond_b

    .line 183
    invoke-virtual {v1, v13, v14, v3}, Ll/᩷֡;->֫(D[D)V

    .line 186
    :cond_b
    iget-object v1, v0, Ll/᩵ۚ;->ۡ:[I

    iget-object v3, v0, Ll/᩵ۚ;->ۢ:[D

    mul-int/lit8 v11, v9, 0x2

    invoke-virtual {v4, v1, v3, v2, v11}, Ll/ۛۚ;->֫([I[D[FI)V

    if-eqz v6, :cond_c

    .line 189
    aget v1, v2, v11

    invoke-virtual {v6, v10}, Ll/ܳۚ;->֫(F)F

    move-result v3

    add-float/2addr v3, v1

    aput v3, v2, v11

    goto :goto_7

    :cond_c
    if-eqz v5, :cond_d

    .line 191
    aget v1, v2, v11

    invoke-virtual {v5, v10}, Ll/᩵֨;->֫(F)F

    move-result v3

    add-float/2addr v3, v1

    aput v3, v2, v11

    :cond_d
    :goto_7
    if-eqz v7, :cond_e

    add-int/lit8 v11, v11, 0x1

    .line 194
    aget v1, v2, v11

    invoke-virtual {v7, v10}, Ll/ܳۚ;->֫(F)F

    move-result v3

    add-float/2addr v3, v1

    aput v3, v2, v11

    goto :goto_8

    :cond_e
    if-eqz v8, :cond_f

    add-int/lit8 v11, v11, 0x1

    .line 196
    aget v1, v2, v11

    invoke-virtual {v8, v10}, Ll/᩵֨;->֫(F)F

    move-result v3

    add-float/2addr v3, v1

    aput v3, v2, v11

    :cond_f
    :goto_8
    add-int/lit8 v9, v9, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    move/from16 v1, p1

    move/from16 v3, v17

    goto/16 :goto_4

    :cond_10
    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 5

    .line 839
    iget-object v0, p0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    const/4 v1, 0x0

    iput v1, v0, Ll/ۛۚ;->᩺:F

    .line 840
    iput v1, v0, Ll/ۛۚ;->ۨ:F

    .line 841
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    .line 668
    iput v1, v0, Ll/ۛۚ;->۟:F

    .line 669
    iput v2, v0, Ll/ۛۚ;->֫֫:F

    .line 670
    iput v3, v0, Ll/ۛۚ;->ܰ:F

    .line 671
    iput v4, v0, Ll/ۛۚ;->᩹:F

    .line 842
    iget-object v0, p0, Ll/᩵ۚ;->᩸:Ll/ᩴۚ;

    invoke-virtual {v0, p1}, Ll/ᩴۚ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 1

    .line 452
    iget-object v0, p0, Ll/᩵ۚ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ֫(Ll/ۚ֡;)V
    .locals 1

    .line 461
    iget-object v0, p0, Ll/᩵ۚ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܶ۠;Ll/ۘ᩸;)V
    .locals 5

    .line 857
    iget-object v0, p0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Ll/ۛۚ;->᩺:F

    .line 858
    iput v1, v0, Ll/ۛۚ;->ۨ:F

    .line 859
    invoke-direct {p0, v0}, Ll/᩵ۚ;->֫(Ll/ۛۚ;)V

    .line 860
    invoke-virtual {p1}, Ll/ܶ۠;->᩸()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Ll/ܶ۠;->᩹()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Ll/ܶ۠;->ܶ()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Ll/ܶ۠;->ۜ()I

    move-result v4

    int-to-float v4, v4

    .line 668
    iput v1, v0, Ll/ۛۚ;->۟:F

    .line 669
    iput v2, v0, Ll/ۛۚ;->֫֫:F

    .line 670
    iput v3, v0, Ll/ۛۚ;->ܰ:F

    .line 671
    iput v4, v0, Ll/ۛۚ;->᩹:F

    .line 861
    iget v1, p0, Ll/᩵ۚ;->᩷:I

    invoke-virtual {p2, v1}, Ll/ۘ᩸;->ܽ(I)Ll/᩷᩸;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۛۚ;->֫(Ll/᩷᩸;)V

    .line 863
    iget-object v0, p0, Ll/᩵ۚ;->ۜ:Ll/ᩴۚ;

    iget v1, p0, Ll/᩵ۚ;->᩷:I

    invoke-virtual {v0, p1, p2, v1}, Ll/ᩴۚ;->֫(Ll/ܶ۠;Ll/ۘ᩸;I)V

    return-void
.end method

.method public final ֫(FJLandroid/view/View;Ll/ܶ֡;)Z
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v7, p4

    const/4 v1, 0x0

    move/from16 v2, p1

    .line 932
    invoke-direct {v0, v2, v1}, Ll/᩵ۚ;->ۧ(F[F)F

    move-result v8

    .line 935
    iget-object v2, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    if-eqz v2, :cond_0

    .line 936
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩵֨;

    .line 937
    invoke-virtual {v3, v8, v7}, Ll/᩵֨;->֫(FLandroid/view/View;)V

    goto :goto_0

    .line 941
    :cond_0
    iget-object v2, v0, Ll/᩵ۚ;->᩹:Ljava/util/HashMap;

    const/4 v9, 0x0

    if-eqz v2, :cond_2

    .line 942
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v2, 0x0

    move-object v11, v1

    const/4 v12, 0x0

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨;

    .line 943
    instance-of v2, v1, Ll/۠֨;

    if-eqz v2, :cond_1

    .line 944
    move-object v11, v1

    check-cast v11, Ll/۠֨;

    goto :goto_1

    :cond_1
    move v2, v8

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    .line 947
    invoke-virtual/range {v1 .. v6}, Ll/ۛ֨;->ۧ(FJLandroid/view/View;Ll/ܶ֡;)Z

    move-result v1

    or-int/2addr v12, v1

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    move-object v11, v1

    .line 953
    :cond_3
    iget-object v1, v0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    iget-object v10, v0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    if-eqz v1, :cond_1c

    .line 954
    aget-object v1, v1, v9

    float-to-double v13, v8

    iget-object v2, v0, Ll/᩵ۚ;->ۢ:[D

    invoke-virtual {v1, v13, v14, v2}, Ll/᩷֡;->֫(D[D)V

    .line 955
    iget-object v1, v0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    aget-object v1, v1, v9

    iget-object v2, v0, Ll/᩵ۚ;->ܺ:[D

    invoke-virtual {v1, v13, v14, v2}, Ll/᩷֡;->ۧ(D[D)V

    .line 956
    iget-object v1, v0, Ll/᩵ۚ;->֫:Ll/᩷֡;

    if-eqz v1, :cond_4

    .line 957
    iget-object v2, v0, Ll/᩵ۚ;->ۢ:[D

    array-length v3, v2

    if-lez v3, :cond_4

    .line 958
    invoke-virtual {v1, v13, v14, v2}, Ll/᩷֡;->֫(D[D)V

    .line 959
    iget-object v1, v0, Ll/᩵ۚ;->֫:Ll/᩷֡;

    iget-object v2, v0, Ll/᩵ۚ;->ܺ:[D

    invoke-virtual {v1, v13, v14, v2}, Ll/᩷֡;->ۧ(D[D)V

    .line 962
    :cond_4
    iget-object v1, v0, Ll/᩵ۚ;->ۡ:[I

    iget-object v2, v0, Ll/᩵ۚ;->ۢ:[D

    iget-object v3, v0, Ll/᩵ۚ;->ܺ:[D

    .line 313
    iget v4, v10, Ll/ۛۚ;->۟:F

    .line 314
    iget v6, v10, Ll/ۛۚ;->֫֫:F

    .line 315
    iget v15, v10, Ll/ۛۚ;->ܰ:F

    .line 316
    iget v9, v10, Ll/ۛۚ;->᩹:F

    .line 329
    array-length v5, v1

    if-eqz v5, :cond_5

    iget-object v5, v10, Ll/ۛۚ;->ۛ:[D

    array-length v5, v5

    move/from16 v16, v4

    array-length v4, v1

    add-int/lit8 v4, v4, -0x1

    aget v4, v1, v4

    if-gt v5, v4, :cond_6

    .line 330
    array-length v4, v1

    add-int/lit8 v4, v4, -0x1

    aget v4, v1, v4

    add-int/lit8 v4, v4, 0x1

    .line 331
    new-array v5, v4, [D

    iput-object v5, v10, Ll/ۛۚ;->ۛ:[D

    .line 332
    new-array v4, v4, [D

    iput-object v4, v10, Ll/ۛۚ;->ۤ:[D

    goto :goto_2

    :cond_5
    move/from16 v16, v4

    .line 334
    :cond_6
    :goto_2
    iget-object v4, v10, Ll/ۛۚ;->ۛ:[D

    move/from16 v17, v6

    const-wide/high16 v5, 0x7ff8000000000000L    # Double.NaN

    invoke-static {v4, v5, v6}, Ljava/util/Arrays;->fill([DD)V

    const/4 v4, 0x0

    .line 335
    :goto_3
    array-length v5, v1

    if-ge v4, v5, :cond_7

    .line 336
    iget-object v5, v10, Ll/ۛۚ;->ۛ:[D

    aget v6, v1, v4

    aget-wide v18, v2, v4

    aput-wide v18, v5, v6

    .line 337
    iget-object v5, v10, Ll/ۛۚ;->ۤ:[D

    aget-wide v18, v3, v4

    aput-wide v18, v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    const/high16 v2, 0x7fc00000    # Float.NaN

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v18, 0x0

    move-wide/from16 v19, v13

    move/from16 v6, v17

    move/from16 v17, v15

    move v15, v9

    const/4 v9, 0x0

    .line 340
    :goto_4
    iget-object v13, v10, Ll/ۛۚ;->ۛ:[D

    array-length v14, v13

    if-ge v1, v14, :cond_f

    .line 341
    aget-wide v21, v13, v1

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->isNaN(D)Z

    move-result v13

    if-eqz v13, :cond_8

    goto :goto_7

    .line 345
    :cond_8
    iget-object v13, v10, Ll/ۛۚ;->ۛ:[D

    aget-wide v21, v13, v1

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->isNaN(D)Z

    move-result v13

    const-wide/16 v21, 0x0

    if-eqz v13, :cond_9

    :goto_5
    move-wide/from16 v13, v21

    goto :goto_6

    :cond_9
    iget-object v13, v10, Ll/ۛۚ;->ۛ:[D

    aget-wide v23, v13, v1

    add-double v21, v23, v21

    goto :goto_5

    :goto_6
    double-to-float v13, v13

    .line 346
    iget-object v14, v10, Ll/ۛۚ;->ۤ:[D

    move/from16 v21, v13

    aget-wide v13, v14, v1

    double-to-float v13, v13

    const/4 v14, 0x1

    if-eq v1, v14, :cond_e

    const/4 v14, 0x2

    if-eq v1, v14, :cond_d

    const/4 v14, 0x3

    if-eq v1, v14, :cond_c

    const/4 v14, 0x4

    if-eq v1, v14, :cond_b

    const/4 v13, 0x5

    if-eq v1, v13, :cond_a

    goto :goto_7

    :cond_a
    move/from16 v2, v21

    goto :goto_7

    :cond_b
    move v9, v13

    move/from16 v15, v21

    goto :goto_7

    :cond_c
    move v4, v13

    move/from16 v17, v21

    goto :goto_7

    :cond_d
    move v5, v13

    move/from16 v6, v21

    goto :goto_7

    :cond_e
    move v3, v13

    move/from16 v16, v21

    :goto_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 377
    :cond_f
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_11

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 378
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_10

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 379
    invoke-virtual {v7, v1}, Landroid/view/View;->setRotation(F)V

    :cond_10
    move-object/from16 v21, v10

    goto :goto_8

    :cond_11
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 382
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v13

    if-eqz v13, :cond_12

    const/4 v1, 0x0

    :cond_12
    const/high16 v13, 0x40000000    # 2.0f

    div-float/2addr v4, v13

    add-float/2addr v4, v3

    div-float/2addr v9, v13

    add-float/2addr v9, v5

    float-to-double v13, v1

    float-to-double v1, v2

    move-object/from16 v21, v10

    float-to-double v9, v9

    float-to-double v3, v4

    .line 391
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    add-double/2addr v3, v1

    add-double/2addr v3, v13

    double-to-float v1, v3

    .line 392
    invoke-virtual {v7, v1}, Landroid/view/View;->setRotation(F)V

    :goto_8
    const/high16 v1, 0x3f000000    # 0.5f

    add-float v2, v16, v1

    float-to-int v3, v2

    add-float/2addr v6, v1

    float-to-int v1, v6

    add-float v2, v2, v17

    float-to-int v2, v2

    add-float/2addr v6, v15

    float-to-int v4, v6

    sub-int v5, v2, v3

    sub-int v6, v4, v1

    .line 414
    invoke-virtual/range {p4 .. p4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    if-ne v5, v9, :cond_13

    invoke-virtual/range {p4 .. p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    if-eq v6, v9, :cond_14

    :cond_13
    const/high16 v9, 0x40000000    # 2.0f

    .line 417
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    .line 418
    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 420
    invoke-virtual {v7, v5, v6}, Landroid/view/View;->measure(II)V

    .line 423
    :cond_14
    invoke-virtual {v7, v3, v1, v2, v4}, Landroid/view/View;->layout(IIII)V

    .line 963
    iget-object v1, v0, Ll/᩵ۚ;->ᩳ:Ljava/util/HashMap;

    if-eqz v1, :cond_16

    .line 964
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_15
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵֨;

    .line 965
    instance-of v3, v2, Ll/ᩳ֨;

    if-eqz v3, :cond_15

    .line 966
    check-cast v2, Ll/ᩳ֨;

    iget-object v3, v0, Ll/᩵ۚ;->ܺ:[D

    const/4 v4, 0x0

    aget-wide v5, v3, v4

    const/4 v4, 0x1

    aget-wide v9, v3, v4

    .line 213
    invoke-virtual {v2, v8}, Ll/᩵֨;->֫(F)F

    move-result v2

    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    double-to-float v3, v3

    add-float/2addr v2, v3

    invoke-virtual {v7, v2}, Landroid/view/View;->setRotation(F)V

    goto :goto_9

    :cond_16
    if-eqz v11, :cond_17

    .line 972
    iget-object v1, v0, Ll/᩵ۚ;->ܺ:[D

    const/4 v2, 0x0

    aget-wide v9, v1, v2

    const/4 v2, 0x1

    aget-wide v13, v1, v2

    move-object v1, v11

    move v2, v8

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    .line 268
    invoke-virtual/range {v1 .. v6}, Ll/ۛ֨;->֫(FJLandroid/view/View;Ll/ܶ֡;)F

    move-result v1

    invoke-static {v13, v14, v9, v10}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v2

    double-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {v7, v1}, Landroid/view/View;->setRotation(F)V

    .line 269
    iget-boolean v1, v11, Ll/ۛ֨;->ܿ:Z

    or-int/2addr v1, v12

    move v12, v1

    :cond_17
    const/4 v1, 0x1

    .line 976
    :goto_a
    iget-object v2, v0, Ll/᩵ۚ;->ۚ:[Ll/᩷֡;

    array-length v3, v2

    if-ge v1, v3, :cond_18

    .line 977
    aget-object v2, v2, v1

    .line 978
    iget-object v3, v0, Ll/᩵ۚ;->᩶:[F

    move-wide/from16 v4, v19

    invoke-virtual {v2, v4, v5, v3}, Ll/᩷֡;->֫(D[F)V

    move-object/from16 v2, v21

    .line 979
    iget-object v6, v2, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    iget-object v9, v0, Ll/᩵ۚ;->ܽ:[Ljava/lang/String;

    add-int/lit8 v10, v1, -0x1

    aget-object v9, v9, v10

    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܰܶ;

    invoke-virtual {v6, v7, v3}, Ll/ܰܶ;->֫(Landroid/view/View;[F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    .line 982
    :cond_18
    iget-object v1, v0, Ll/᩵ۚ;->᩸:Ll/ᩴۚ;

    iget v2, v1, Ll/ᩴۚ;->ۤ:I

    if-nez v2, :cond_1b

    cmpg-float v2, v8, v18

    if-gtz v2, :cond_19

    .line 984
    iget v1, v1, Ll/ᩴۚ;->ᩳ֫:I

    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_b

    :cond_19
    const/high16 v2, 0x3f800000    # 1.0f

    .line 985
    iget-object v3, v0, Ll/᩵ۚ;->ۜ:Ll/ᩴۚ;

    cmpl-float v2, v8, v2

    if-ltz v2, :cond_1a

    .line 986
    iget v1, v3, Ll/ᩴۚ;->ᩳ֫:I

    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_b

    .line 987
    :cond_1a
    iget v2, v3, Ll/ᩴۚ;->ᩳ֫:I

    iget v1, v1, Ll/ᩴۚ;->ᩳ֫:I

    if-eq v2, v1, :cond_1b

    const/4 v1, 0x0

    .line 988
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 992
    :cond_1b
    :goto_b
    iget-object v1, v0, Ll/᩵ۚ;->ۘ:[Ll/ۘۚ;

    if-eqz v1, :cond_1f

    const/4 v1, 0x0

    .line 993
    :goto_c
    iget-object v2, v0, Ll/᩵ۚ;->ۘ:[Ll/ۘۚ;

    array-length v3, v2

    if-ge v1, v3, :cond_1f

    .line 994
    aget-object v2, v2, v1

    invoke-virtual {v2, v8, v7}, Ll/ۘۚ;->֫(FLandroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_1c
    move-object v2, v10

    const/high16 v1, 0x3f000000    # 0.5f

    .line 1000
    iget v3, v2, Ll/ۛۚ;->۟:F

    iget-object v4, v0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    iget v5, v4, Ll/ۛۚ;->۟:F

    invoke-static {v5, v3, v8, v3}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v3

    .line 1001
    iget v5, v2, Ll/ۛۚ;->֫֫:F

    iget v6, v4, Ll/ۛۚ;->֫֫:F

    invoke-static {v6, v5, v8, v5}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v5

    .line 1002
    iget v6, v2, Ll/ۛۚ;->ܰ:F

    iget v9, v4, Ll/ۛۚ;->ܰ:F

    invoke-static {v9, v6, v8, v6}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v10

    .line 1003
    iget v2, v2, Ll/ۛۚ;->᩹:F

    iget v4, v4, Ll/ۛۚ;->᩹:F

    invoke-static {v4, v2, v8, v2}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v11

    add-float/2addr v3, v1

    float-to-int v13, v3

    add-float/2addr v5, v1

    float-to-int v1, v5

    add-float/2addr v3, v10

    float-to-int v3, v3

    add-float/2addr v5, v11

    float-to-int v5, v5

    sub-int v10, v3, v13

    sub-int v11, v5, v1

    cmpl-float v6, v9, v6

    if-nez v6, :cond_1d

    cmpl-float v2, v4, v2

    if-eqz v2, :cond_1e

    :cond_1d
    const/high16 v2, 0x40000000    # 2.0f

    .line 1021
    invoke-static {v10, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 1022
    invoke-static {v11, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 1023
    invoke-virtual {v7, v4, v2}, Landroid/view/View;->measure(II)V

    .line 1025
    :cond_1e
    invoke-virtual {v7, v13, v1, v3, v5}, Landroid/view/View;->layout(IIII)V

    .line 1028
    :cond_1f
    iget-object v1, v0, Ll/᩵ۚ;->ܳ:Ljava/util/HashMap;

    if-eqz v1, :cond_21

    .line 1029
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳۚ;

    .line 1030
    instance-of v3, v2, Ll/ۤ֡;

    if-eqz v3, :cond_20

    .line 1031
    check-cast v2, Ll/ۤ֡;

    iget-object v3, v0, Ll/᩵ۚ;->ܺ:[D

    const/4 v4, 0x0

    aget-wide v4, v3, v4

    const/4 v6, 0x1

    aget-wide v9, v3, v6

    .line 241
    invoke-virtual {v2, v8}, Ll/ܳۚ;->֫(F)F

    move-result v2

    invoke-static {v9, v10, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v3

    double-to-float v3, v3

    add-float/2addr v2, v3

    invoke-virtual {v7, v2}, Landroid/view/View;->setRotation(F)V

    goto :goto_d

    .line 1034
    :cond_20
    invoke-virtual {v2, v8, v7}, Ll/ܳۚ;->֫(FLandroid/view/View;)V

    goto :goto_d

    :cond_21
    return v12
.end method

.method public final ۧ()F
    .locals 1

    .line 118
    iget-object v0, p0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    iget v0, v0, Ll/ۛۚ;->۟:F

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 468
    iput p1, p0, Ll/᩵ۚ;->֡:I

    return-void
.end method

.method public final ۧ(Ll/ܶ۠;Ll/ۘ᩸;)V
    .locals 5

    .line 846
    iget-object v0, p0, Ll/᩵ۚ;->ܶ:Ll/ۛۚ;

    const/4 v1, 0x0

    iput v1, v0, Ll/ۛۚ;->᩺:F

    .line 847
    iput v1, v0, Ll/ۛۚ;->ۨ:F

    .line 848
    invoke-direct {p0, v0}, Ll/᩵ۚ;->֫(Ll/ۛۚ;)V

    .line 849
    invoke-virtual {p1}, Ll/ܶ۠;->᩸()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Ll/ܶ۠;->᩹()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p1}, Ll/ܶ۠;->ܶ()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Ll/ܶ۠;->ۜ()I

    move-result v4

    int-to-float v4, v4

    .line 668
    iput v1, v0, Ll/ۛۚ;->۟:F

    .line 669
    iput v2, v0, Ll/ۛۚ;->֫֫:F

    .line 670
    iput v3, v0, Ll/ۛۚ;->ܰ:F

    .line 671
    iput v4, v0, Ll/ۛۚ;->᩹:F

    .line 850
    iget v1, p0, Ll/᩵ۚ;->᩷:I

    invoke-virtual {p2, v1}, Ll/ۘ᩸;->ܽ(I)Ll/᩷᩸;

    move-result-object v1

    .line 851
    invoke-virtual {v0, v1}, Ll/ۛۚ;->֫(Ll/᩷᩸;)V

    .line 852
    iget-object v0, v1, Ll/᩷᩸;->ᩳ:Ll/ۡ᩸;

    iget v0, v0, Ll/ۡ᩸;->ᩳ:F

    iput v0, p0, Ll/᩵ۚ;->᩵:F

    .line 853
    iget-object v0, p0, Ll/᩵ۚ;->᩸:Ll/ᩴۚ;

    iget v1, p0, Ll/᩵ۚ;->᩷:I

    invoke-virtual {v0, p1, p2, v1}, Ll/ᩴۚ;->֫(Ll/ܶ۠;Ll/ۘ᩸;I)V

    return-void
.end method

.method public final ܽ()F
    .locals 1

    .line 122
    iget-object v0, p0, Ll/᩵ۚ;->᩻:Ll/ۛۚ;

    iget v0, v0, Ll/ۛۚ;->֫֫:F

    return v0
.end method
