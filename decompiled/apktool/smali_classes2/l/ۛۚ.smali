.class public final Ll/ۛۚ;
.super Ljava/lang/Object;
.source "B19H"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static ۧ֫:[Ljava/lang/String;


# instance fields
.field public ֫֫:F

.field public ۗ:I

.field public ۙ:Ll/ۡ֡;

.field public ۛ:[D

.field public ۟:F

.field public ۤ:[D

.field public ۨ:F

.field public ۫:F

.field public ۬:I

.field public ܰ:F

.field public ᩶:I

.field public ᩸:Ljava/util/LinkedHashMap;

.field public ᩹:F

.field public ᩺:F


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v4, "height"

    const-string v5, "pathRotate"

    const-string v0, "position"

    const-string v1, "x"

    const-string v2, "y"

    const-string v3, "width"

    .line 52
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۛۚ;->ۧ֫:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 54
    iput v0, p0, Ll/ۛۚ;->᩶:I

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 61
    iput v1, p0, Ll/ۛۚ;->۫:F

    const/4 v1, -0x1

    .line 63
    iput v1, p0, Ll/ۛۚ;->۬:I

    .line 65
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    .line 66
    iput v0, p0, Ll/ۛۚ;->ۗ:I

    const/16 v0, 0x12

    new-array v1, v0, [D

    .line 308
    iput-object v1, p0, Ll/ۛۚ;->ۛ:[D

    new-array v0, v0, [D

    .line 309
    iput-object v0, p0, Ll/ۛۚ;->ۤ:[D

    return-void
.end method

.method public static ֫(FF[F[I[D[D)V
    .locals 12

    move-object v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 572
    :goto_0
    array-length v8, v0

    const/4 v9, 0x1

    if-ge v3, v8, :cond_4

    .line 573
    aget-wide v10, p4, v3

    double-to-float v8, v10

    .line 574
    aget-wide v10, p5, v3

    .line 578
    aget v10, v0, v3

    if-eq v10, v9, :cond_3

    const/4 v9, 0x2

    if-eq v10, v9, :cond_2

    const/4 v9, 0x3

    if-eq v10, v9, :cond_1

    const/4 v9, 0x4

    if-eq v10, v9, :cond_0

    goto :goto_1

    :cond_0
    move v7, v8

    goto :goto_1

    :cond_1
    move v5, v8

    goto :goto_1

    :cond_2
    move v6, v8

    goto :goto_1

    :cond_3
    move v4, v8

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    mul-float v0, v1, v5

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v0, v3

    sub-float/2addr v4, v0

    mul-float v0, v1, v7

    div-float/2addr v0, v3

    sub-float/2addr v6, v0

    const/high16 v0, 0x3f800000    # 1.0f

    mul-float v5, v5, v0

    mul-float v7, v7, v0

    add-float/2addr v5, v4

    add-float/2addr v7, v6

    sub-float v3, v0, p0

    mul-float v3, v3, v4

    mul-float v5, v5, p0

    add-float/2addr v5, v3

    add-float/2addr v5, v1

    .line 629
    aput v5, p2, v2

    sub-float/2addr v0, p1

    mul-float v0, v0, v6

    mul-float v7, v7, p1

    add-float/2addr v7, v0

    add-float/2addr v7, v1

    .line 630
    aput v7, p2, v9

    return-void
.end method

.method public static ֫(FF)Z
    .locals 1

    .line 236
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sub-float/2addr p0, p1

    .line 239
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    move-result p0

    const p1, 0x358637bd    # 1.0E-6f

    cmpl-float p0, p0, p1

    if-lez p0, :cond_2

    goto :goto_1

    .line 237
    :cond_1
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p0

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eq p0, p1, :cond_2

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 38
    check-cast p1, Ll/ۛۚ;

    .line 676
    iget v0, p0, Ll/ۛۚ;->ۨ:F

    iget p1, p1, Ll/ۛۚ;->ۨ:F

    invoke-static {v0, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۛۚ;[ZZ)V
    .locals 4

    const/4 v0, 0x0

    .line 244
    aget-boolean v1, p2, v0

    iget v2, p0, Ll/ۛۚ;->ۨ:F

    iget v3, p1, Ll/ۛۚ;->ۨ:F

    invoke-static {v2, v3}, Ll/ۛۚ;->֫(FF)Z

    move-result v2

    or-int/2addr v1, v2

    aput-boolean v1, p2, v0

    const/4 v0, 0x1

    .line 245
    aget-boolean v1, p2, v0

    iget v2, p0, Ll/ۛۚ;->۟:F

    iget v3, p1, Ll/ۛۚ;->۟:F

    invoke-static {v2, v3}, Ll/ۛۚ;->֫(FF)Z

    move-result v2

    or-int/2addr v2, p3

    or-int/2addr v1, v2

    aput-boolean v1, p2, v0

    const/4 v0, 0x2

    .line 246
    aget-boolean v1, p2, v0

    iget v2, p0, Ll/ۛۚ;->֫֫:F

    iget v3, p1, Ll/ۛۚ;->֫֫:F

    invoke-static {v2, v3}, Ll/ۛۚ;->֫(FF)Z

    move-result v2

    or-int/2addr p3, v2

    or-int/2addr p3, v1

    aput-boolean p3, p2, v0

    const/4 p3, 0x3

    .line 247
    aget-boolean v0, p2, p3

    iget v1, p0, Ll/ۛۚ;->ܰ:F

    iget v2, p1, Ll/ۛۚ;->ܰ:F

    invoke-static {v1, v2}, Ll/ۛۚ;->֫(FF)Z

    move-result v1

    or-int/2addr v0, v1

    aput-boolean v0, p2, p3

    const/4 p3, 0x4

    .line 248
    aget-boolean v0, p2, p3

    iget v1, p0, Ll/ۛۚ;->᩹:F

    iget p1, p1, Ll/ۛۚ;->᩹:F

    invoke-static {v1, p1}, Ll/ۛۚ;->֫(FF)Z

    move-result p1

    or-int/2addr p1, v0

    aput-boolean p1, p2, p3

    return-void
.end method

.method public final ֫(Ll/᩷᩸;)V
    .locals 5

    .line 681
    iget-object v0, p1, Ll/᩷᩸;->ᩳ:Ll/ۡ᩸;

    iget-object v0, v0, Ll/ۡ᩸;->᩻:Ljava/lang/String;

    invoke-static {v0}, Ll/ۡ֡;->֫(Ljava/lang/String;)Ll/ۡ֡;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۚ;->ۙ:Ll/ۡ֡;

    .line 682
    iget-object v0, p1, Ll/᩷᩸;->ᩳ:Ll/ۡ᩸;

    iget v1, v0, Ll/ۡ᩸;->ܿ:I

    iput v1, p0, Ll/ۛۚ;->۬:I

    .line 683
    iget v1, v0, Ll/ۡ᩸;->ܳ:F

    iput v1, p0, Ll/ۛۚ;->۫:F

    .line 684
    iget v0, v0, Ll/ۡ᩸;->ܽ:I

    iput v0, p0, Ll/ۛۚ;->᩶:I

    .line 685
    iget-object v0, p1, Ll/᩷᩸;->ܿ:Ll/ܺ᩸;

    iget v0, v0, Ll/ܺ᩸;->ܽ:F

    .line 686
    iget-object v0, p1, Ll/᩷᩸;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 687
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 688
    iget-object v2, p1, Ll/᩷᩸;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰܶ;

    .line 689
    invoke-virtual {v2}, Ll/ܰܶ;->֫()Ll/᩺ܶ;

    move-result-object v3

    sget-object v4, Ll/᩺ܶ;->ۤ:Ll/᩺ܶ;

    if-eq v3, v4, :cond_0

    .line 690
    iget-object v3, p0, Ll/ۛۚ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫([I[D[FI)V
    .locals 9

    .line 253
    iget v0, p0, Ll/ۛۚ;->۟:F

    .line 254
    iget v1, p0, Ll/ۛۚ;->֫֫:F

    .line 255
    iget v2, p0, Ll/ۛۚ;->ܰ:F

    .line 256
    iget v3, p0, Ll/ۛۚ;->᩹:F

    const/4 v4, 0x0

    .line 258
    :goto_0
    array-length v5, p1

    const/4 v6, 0x1

    if-ge v4, v5, :cond_4

    .line 259
    aget-wide v7, p2, v4

    double-to-float v5, v7

    .line 261
    aget v7, p1, v4

    if-eq v7, v6, :cond_3

    const/4 v6, 0x2

    if-eq v7, v6, :cond_2

    const/4 v6, 0x3

    if-eq v7, v6, :cond_1

    const/4 v6, 0x4

    if-eq v7, v6, :cond_0

    goto :goto_1

    :cond_0
    move v3, v5

    goto :goto_1

    :cond_1
    move v2, v5

    goto :goto_1

    :cond_2
    move v1, v5

    goto :goto_1

    :cond_3
    move v0, v5

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr v2, p1

    add-float/2addr v2, v0

    const/4 p2, 0x0

    add-float/2addr v2, p2

    .line 276
    aput v2, p3, p4

    add-int/2addr p4, v6

    div-float/2addr v3, p1

    add-float/2addr v3, v1

    add-float/2addr v3, p2

    .line 277
    aput v3, p3, p4

    return-void
.end method
