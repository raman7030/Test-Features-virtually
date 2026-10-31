.class public final Ll/᩵᩹ۡ;
.super Ll/֡᩹ۡ;
.source "UBKO"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public ۜ:F

.field public ۡ:F

.field public ۢ:F

.field public ۧ:Ljava/lang/String;

.field public ܳ:F

.field public final ܽ:Landroid/graphics/Matrix;

.field public ܿ:F

.field public ᩳ:F

.field public final ᩷:Landroid/graphics/Matrix;

.field public ᩻:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1091
    invoke-direct {p0}, Ll/֡᩹ۡ;-><init>()V

    .line 1030
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/᩵᩹ۡ;->᩷:Landroid/graphics/Matrix;

    .line 1034
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 1036
    iput v0, p0, Ll/᩵᩹ۡ;->ܳ:F

    .line 1037
    iput v0, p0, Ll/᩵᩹ۡ;->ᩳ:F

    .line 1038
    iput v0, p0, Ll/᩵᩹ۡ;->ܿ:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1039
    iput v1, p0, Ll/᩵᩹ۡ;->᩻:F

    .line 1040
    iput v1, p0, Ll/᩵᩹ۡ;->ۜ:F

    .line 1041
    iput v0, p0, Ll/᩵᩹ۡ;->ۢ:F

    .line 1042
    iput v0, p0, Ll/᩵᩹ۡ;->ۡ:F

    .line 1046
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/᩵᩹ۡ;->ܽ:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 1049
    iput-object v0, p0, Ll/᩵᩹ۡ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/᩵᩹ۡ;Ll/ۖ᩵;)V
    .locals 6

    .line 1051
    invoke-direct {p0}, Ll/֡᩹ۡ;-><init>()V

    .line 1030
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/᩵᩹ۡ;->᩷:Landroid/graphics/Matrix;

    .line 1034
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 1036
    iput v0, p0, Ll/᩵᩹ۡ;->ܳ:F

    .line 1037
    iput v0, p0, Ll/᩵᩹ۡ;->ᩳ:F

    .line 1038
    iput v0, p0, Ll/᩵᩹ۡ;->ܿ:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1039
    iput v1, p0, Ll/᩵᩹ۡ;->᩻:F

    .line 1040
    iput v1, p0, Ll/᩵᩹ۡ;->ۜ:F

    .line 1041
    iput v0, p0, Ll/᩵᩹ۡ;->ۢ:F

    .line 1042
    iput v0, p0, Ll/᩵᩹ۡ;->ۡ:F

    .line 1046
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Ll/᩵᩹ۡ;->ܽ:Landroid/graphics/Matrix;

    const/4 v3, 0x0

    .line 1049
    iput-object v3, p0, Ll/᩵᩹ۡ;->ۧ:Ljava/lang/String;

    .line 1052
    iget v3, p1, Ll/᩵᩹ۡ;->ܳ:F

    iput v3, p0, Ll/᩵᩹ۡ;->ܳ:F

    .line 1053
    iget v3, p1, Ll/᩵᩹ۡ;->ᩳ:F

    iput v3, p0, Ll/᩵᩹ۡ;->ᩳ:F

    .line 1054
    iget v3, p1, Ll/᩵᩹ۡ;->ܿ:F

    iput v3, p0, Ll/᩵᩹ۡ;->ܿ:F

    .line 1055
    iget v3, p1, Ll/᩵᩹ۡ;->᩻:F

    iput v3, p0, Ll/᩵᩹ۡ;->᩻:F

    .line 1056
    iget v3, p1, Ll/᩵᩹ۡ;->ۜ:F

    iput v3, p0, Ll/᩵᩹ۡ;->ۜ:F

    .line 1057
    iget v3, p1, Ll/᩵᩹ۡ;->ۢ:F

    iput v3, p0, Ll/᩵᩹ۡ;->ۢ:F

    .line 1058
    iget v3, p1, Ll/᩵᩹ۡ;->ۡ:F

    iput v3, p0, Ll/᩵᩹ۡ;->ۡ:F

    .line 1060
    iget-object v3, p1, Ll/᩵᩹ۡ;->ۧ:Ljava/lang/String;

    iput-object v3, p0, Ll/᩵᩹ۡ;->ۧ:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 1063
    invoke-virtual {p2, v3, p0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1066
    :cond_0
    iget-object v3, p1, Ll/᩵᩹ۡ;->ܽ:Landroid/graphics/Matrix;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 1068
    iget-object p1, p1, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 1069
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 1070
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 1071
    instance-of v4, v3, Ll/᩵᩹ۡ;

    if-eqz v4, :cond_1

    .line 1072
    check-cast v3, Ll/᩵᩹ۡ;

    .line 1073
    iget-object v4, p0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    new-instance v5, Ll/᩵᩹ۡ;

    invoke-direct {v5, v3, p2}, Ll/᩵᩹ۡ;-><init>(Ll/᩵᩹ۡ;Ll/ۖ᩵;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 1076
    :cond_1
    instance-of v4, v3, Ll/ᩴ᩹ۡ;

    if-eqz v4, :cond_2

    .line 1077
    new-instance v4, Ll/ᩴ᩹ۡ;

    check-cast v3, Ll/ᩴ᩹ۡ;

    .line 1436
    invoke-direct {v4, v3}, Ll/ۚ᩹ۡ;-><init>(Ll/ۚ᩹ۡ;)V

    .line 1418
    iput v0, v4, Ll/ᩴ᩹ۡ;->ܺ:F

    .line 1421
    iput v1, v4, Ll/ᩴ᩹ۡ;->᩻:F

    .line 1422
    iput v1, v4, Ll/ᩴ᩹ۡ;->ܿ:F

    .line 1423
    iput v0, v4, Ll/ᩴ᩹ۡ;->ᩴ:F

    .line 1424
    iput v1, v4, Ll/ᩴ᩹ۡ;->ۖ:F

    .line 1425
    iput v0, v4, Ll/ᩴ᩹ۡ;->ۘ:F

    .line 1427
    sget-object v5, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    iput-object v5, v4, Ll/ᩴ᩹ۡ;->᩷:Landroid/graphics/Paint$Cap;

    .line 1428
    sget-object v5, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    iput-object v5, v4, Ll/ᩴ᩹ۡ;->ۢ:Landroid/graphics/Paint$Join;

    const/high16 v5, 0x40800000    # 4.0f

    .line 1429
    iput v5, v4, Ll/ᩴ᩹ۡ;->ۡ:F

    .line 1439
    iget-object v5, v3, Ll/ᩴ᩹ۡ;->ۜ:Ll/᩻ۗ;

    iput-object v5, v4, Ll/ᩴ᩹ۡ;->ۜ:Ll/᩻ۗ;

    .line 1440
    iget v5, v3, Ll/ᩴ᩹ۡ;->ܺ:F

    iput v5, v4, Ll/ᩴ᩹ۡ;->ܺ:F

    .line 1441
    iget v5, v3, Ll/ᩴ᩹ۡ;->᩻:F

    iput v5, v4, Ll/ᩴ᩹ۡ;->᩻:F

    .line 1442
    iget-object v5, v3, Ll/ᩴ᩹ۡ;->ܳ:Ll/᩻ۗ;

    iput-object v5, v4, Ll/ᩴ᩹ۡ;->ܳ:Ll/᩻ۗ;

    .line 1443
    iget v5, v3, Ll/ۚ᩹ۡ;->֫:I

    iput v5, v4, Ll/ۚ᩹ۡ;->֫:I

    .line 1444
    iget v5, v3, Ll/ᩴ᩹ۡ;->ܿ:F

    iput v5, v4, Ll/ᩴ᩹ۡ;->ܿ:F

    .line 1445
    iget v5, v3, Ll/ᩴ᩹ۡ;->ᩴ:F

    iput v5, v4, Ll/ᩴ᩹ۡ;->ᩴ:F

    .line 1446
    iget v5, v3, Ll/ᩴ᩹ۡ;->ۖ:F

    iput v5, v4, Ll/ᩴ᩹ۡ;->ۖ:F

    .line 1447
    iget v5, v3, Ll/ᩴ᩹ۡ;->ۘ:F

    iput v5, v4, Ll/ᩴ᩹ۡ;->ۘ:F

    .line 1449
    iget-object v5, v3, Ll/ᩴ᩹ۡ;->᩷:Landroid/graphics/Paint$Cap;

    iput-object v5, v4, Ll/ᩴ᩹ۡ;->᩷:Landroid/graphics/Paint$Cap;

    .line 1450
    iget-object v5, v3, Ll/ᩴ᩹ۡ;->ۢ:Landroid/graphics/Paint$Join;

    iput-object v5, v4, Ll/ᩴ᩹ۡ;->ۢ:Landroid/graphics/Paint$Join;

    .line 1451
    iget v3, v3, Ll/ᩴ᩹ۡ;->ۡ:F

    iput v3, v4, Ll/ᩴ᩹ۡ;->ۡ:F

    goto :goto_1

    .line 1078
    :cond_2
    instance-of v4, v3, Ll/ۘ᩹ۡ;

    if-eqz v4, :cond_4

    .line 1079
    new-instance v4, Ll/ۘ᩹ۡ;

    check-cast v3, Ll/ۘ᩹ۡ;

    .line 1365
    invoke-direct {v4, v3}, Ll/ۚ᩹ۡ;-><init>(Ll/ۚ᩹ۡ;)V

    .line 1083
    :goto_1
    iget-object v3, p0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1084
    iget-object v3, v4, Ll/ۚ᩹ۡ;->ᩳ:Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 1085
    invoke-virtual {p2, v3, v4}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 1081
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown object in the tree!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤۨۡ;Ll/۫ܽܽ;)V
    .locals 3

    .line 1103
    sget-object v0, Ll/ۖ᩺ۧ;->ۧ:[I

    invoke-static {p1, v0, p2}, Ll/᩸۬ۡ;->֫(Ll/ۤۨۡ;[ILl/۫ܽܽ;)Ll/ܶ۬ۡ;

    move-result-object p2

    .line 1116
    iget v0, p0, Ll/᩵᩹ۡ;->ܳ:F

    const-string v1, "http://schemas.android.com/apk/res/android"

    const-string v2, "rotation"

    .line 96
    invoke-virtual {p1, v1, v2}, Ll/ۤۨۡ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v2, 0x5

    .line 91
    invoke-virtual {p2, v0, v2}, Ll/ܶ۬ۡ;->ۧ(FI)F

    move-result v0

    .line 1116
    :cond_0
    iput v0, p0, Ll/᩵᩹ۡ;->ܳ:F

    const/4 v0, 0x1

    .line 1119
    iget v2, p0, Ll/᩵᩹ۡ;->ᩳ:F

    invoke-virtual {p2, v2, v0}, Ll/ܶ۬ۡ;->ۧ(FI)F

    move-result v0

    iput v0, p0, Ll/᩵᩹ۡ;->ᩳ:F

    const/4 v0, 0x2

    .line 1120
    iget v2, p0, Ll/᩵᩹ۡ;->ܿ:F

    invoke-virtual {p2, v2, v0}, Ll/ܶ۬ۡ;->ۧ(FI)F

    move-result v0

    iput v0, p0, Ll/᩵᩹ۡ;->ܿ:F

    .line 1123
    iget v0, p0, Ll/᩵᩹ۡ;->᩻:F

    const-string v2, "scaleX"

    .line 96
    invoke-virtual {p1, v1, v2}, Ll/ۤۨۡ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v2, 0x3

    .line 91
    invoke-virtual {p2, v0, v2}, Ll/ܶ۬ۡ;->ۧ(FI)F

    move-result v0

    .line 1123
    :cond_1
    iput v0, p0, Ll/᩵᩹ۡ;->᩻:F

    .line 1127
    iget v0, p0, Ll/᩵᩹ۡ;->ۜ:F

    const-string v2, "scaleY"

    .line 96
    invoke-virtual {p1, v1, v2}, Ll/ۤۨۡ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v2, 0x4

    .line 91
    invoke-virtual {p2, v0, v2}, Ll/ܶ۬ۡ;->ۧ(FI)F

    move-result v0

    .line 1127
    :cond_2
    iput v0, p0, Ll/᩵᩹ۡ;->ۜ:F

    .line 1130
    iget v0, p0, Ll/᩵᩹ۡ;->ۢ:F

    const-string v2, "translateX"

    .line 96
    invoke-virtual {p1, v1, v2}, Ll/ۤۨۡ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const/4 v2, 0x6

    .line 91
    invoke-virtual {p2, v0, v2}, Ll/ܶ۬ۡ;->ۧ(FI)F

    move-result v0

    .line 1130
    :cond_3
    iput v0, p0, Ll/᩵᩹ۡ;->ۢ:F

    .line 1132
    iget v0, p0, Ll/᩵᩹ۡ;->ۡ:F

    const-string v2, "translateY"

    .line 96
    invoke-virtual {p1, v1, v2}, Ll/ۤۨۡ;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    const/4 p1, 0x7

    .line 91
    invoke-virtual {p2, v0, p1}, Ll/ܶ۬ۡ;->ۧ(FI)F

    move-result v0

    .line 1132
    :cond_4
    iput v0, p0, Ll/᩵᩹ۡ;->ۡ:F

    const/4 p1, 0x0

    .line 1136
    invoke-virtual {p2, p1}, Ll/ܶ۬ۡ;->֫(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 1138
    iput-object p1, p0, Ll/᩵᩹ۡ;->ۧ:Ljava/lang/String;

    .line 1147
    :cond_5
    iget-object p1, p0, Ll/᩵᩹ۡ;->ܽ:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 1148
    iget p2, p0, Ll/᩵᩹ۡ;->ᩳ:F

    neg-float p2, p2

    iget v0, p0, Ll/᩵᩹ۡ;->ܿ:F

    neg-float v0, v0

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 1149
    iget p2, p0, Ll/᩵᩹ۡ;->᩻:F

    iget v0, p0, Ll/᩵᩹ۡ;->ۜ:F

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 1150
    iget p2, p0, Ll/᩵᩹ۡ;->ܳ:F

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0, v0}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 1151
    iget p2, p0, Ll/᩵᩹ۡ;->ۢ:F

    iget v0, p0, Ll/᩵᩹ۡ;->ᩳ:F

    add-float/2addr p2, v0

    iget v0, p0, Ll/᩵᩹ۡ;->ۡ:F

    iget v1, p0, Ll/᩵᩹ۡ;->ܿ:F

    add-float/2addr v0, v1

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method public final ֫()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1248
    :goto_0
    iget-object v2, p0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 1249
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡᩹ۡ;

    invoke-virtual {v2}, Ll/֡᩹ۡ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ֫([I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1259
    :goto_0
    iget-object v2, p0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_0

    .line 1260
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡᩹ۡ;

    invoke-virtual {v2, p1}, Ll/֡᩹ۡ;->֫([I)Z

    move-result v2

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 1095
    iget-object v0, p0, Ll/᩵᩹ۡ;->ۧ:Ljava/lang/String;

    return-object v0
.end method
