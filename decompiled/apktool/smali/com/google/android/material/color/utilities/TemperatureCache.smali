.class public final Lcom/google/android/material/color/utilities/TemperatureCache;
.super Ljava/lang/Object;
.source "TemperatureCache.java"


# instance fields
.field public final input:Lcom/google/android/material/color/utilities/Hct;

.field public precomputedComplement:Lcom/google/android/material/color/utilities/Hct;

.field public precomputedHctsByHue:Ljava/util/List;

.field public precomputedHctsByTemp:Ljava/util/List;

.field public precomputedTempsByHct:Ljava/util/Map;


# direct methods
.method public static synthetic $r8$lambda$VKoHiU00a9ybz_sbHTTerV8DYaI(Lcom/google/android/material/color/utilities/TemperatureCache;Lcom/google/android/material/color/utilities/Hct;)Ljava/lang/Double;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/google/android/material/color/utilities/TemperatureCache;->lambda$getHctsByTemp$0(Lcom/google/android/material/color/utilities/Hct;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public constructor <init>(Lcom/google/android/material/color/utilities/Hct;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    return-void
.end method

.method private getColdest()Lcom/google/android/material/color/utilities/Hct;
    .locals 2

    .line 256
    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByTemp()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/color/utilities/Hct;

    return-object v0
.end method

.method private getHctsByHue()Ljava/util/List;
    .locals 9

    .line 265
    iget-object v0, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->precomputedHctsByHue:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    .line 268
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-wide/16 v1, 0x0

    :goto_0
    const-wide v3, 0x4076800000000000L    # 360.0

    cmpg-double v5, v1, v3

    if-gtz v5, :cond_1

    .line 270
    iget-object v3, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v3}, Lcom/google/android/material/color/utilities/Hct;->getChroma()D

    move-result-wide v5

    iget-object v3, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v3}, Lcom/google/android/material/color/utilities/Hct;->getTone()D

    move-result-wide v7

    move-wide v3, v1

    invoke-static/range {v3 .. v8}, Lcom/google/android/material/color/utilities/Hct;->from(DDD)Lcom/google/android/material/color/utilities/Hct;

    move-result-object v3

    .line 271
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v1, v3

    goto :goto_0

    .line 273
    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->precomputedHctsByHue:Ljava/util/List;

    return-object v0
.end method

.method private getHctsByTemp()Ljava/util/List;
    .locals 3

    .line 289
    iget-object v0, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->precomputedHctsByTemp:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    .line 293
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByHue()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 294
    iget-object v1, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 295
    new-instance v1, Ll/ۙ֫ۖ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ۙ֫ۖ;-><init>(ILjava/lang/Object;)V

    new-instance v2, Lcom/google/android/material/color/utilities/TemperatureCache$$ExternalSyntheticLambda1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 296
    invoke-static {v1, v2}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    .line 297
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 298
    iput-object v0, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->precomputedHctsByTemp:Ljava/util/List;

    return-object v0
.end method

.method private getTempsByHct()Ljava/util/Map;
    .locals 5

    .line 304
    iget-object v0, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->precomputedTempsByHct:Ljava/util/Map;

    if-eqz v0, :cond_0

    return-object v0

    .line 308
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByHue()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 309
    iget-object v1, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 312
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/color/utilities/Hct;

    .line 313
    invoke-static {v2}, Lcom/google/android/material/color/utilities/TemperatureCache;->rawTemperature(Lcom/google/android/material/color/utilities/Hct;)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 316
    :cond_1
    iput-object v1, p0, Lcom/google/android/material/color/utilities/TemperatureCache;->precomputedTempsByHct:Ljava/util/Map;

    return-object v1
.end method

.method private getWarmest()Lcom/google/android/material/color/utilities/Hct;
    .locals 2

    .line 322
    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByTemp()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByTemp()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/color/utilities/Hct;

    return-object v0
.end method

.method public static isBetween(DDD)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    cmpg-double v2, p2, p4

    if-gez v2, :cond_1

    cmpg-double v2, p2, p0

    if-gtz v2, :cond_0

    cmpg-double p2, p0, p4

    if-gtz p2, :cond_0

    return v1

    :cond_0
    return v0

    :cond_1
    cmpg-double v2, p2, p0

    if-lez v2, :cond_3

    cmpg-double p2, p0, p4

    if-gtz p2, :cond_2

    goto :goto_0

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method private synthetic lambda$getHctsByTemp$0(Lcom/google/android/material/color/utilities/Hct;)Ljava/lang/Double;
    .locals 1

    .line 296
    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getTempsByHct()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    return-object p1
.end method

.method public static rawTemperature(Lcom/google/android/material/color/utilities/Hct;)D
    .locals 7

    .line 245
    invoke-virtual {p0}, Lcom/google/android/material/color/utilities/Hct;->toInt()I

    move-result p0

    invoke-static {p0}, Lcom/google/android/material/color/utilities/ColorUtils;->labFromArgb(I)[D

    move-result-object p0

    const/4 v0, 0x2

    .line 246
    aget-wide v1, p0, v0

    const/4 v3, 0x1

    aget-wide v4, p0, v3

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesDouble(D)D

    move-result-wide v1

    .line 247
    aget-wide v3, p0, v3

    aget-wide v5, p0, v0

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v3

    const-wide v5, 0x3ff11eb851eb851fL    # 1.07

    .line 250
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    const-wide v5, 0x3f947ae147ae147bL    # 0.02

    mul-double v3, v3, v5

    const-wide/high16 v5, 0x4049000000000000L    # 50.0

    sub-double/2addr v1, v5

    .line 251
    invoke-static {v1, v2}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesDouble(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    mul-double v0, v0, v3

    const-wide/high16 v2, -0x4020000000000000L    # -0.5

    add-double/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public getAnalogousColors()Ljava/util/List;
    .locals 2

    const/4 v0, 0x5

    const/16 v1, 0xc

    .line 111
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/color/utilities/TemperatureCache;->getAnalogousColors(II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getAnalogousColors(II)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 127
    iget-object v3, v0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v3}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    long-to-int v4, v3

    .line 128
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByHue()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/material/color/utilities/Hct;

    .line 129
    invoke-virtual {v0, v3}, Lcom/google/android/material/color/utilities/TemperatureCache;->getRelativeTemperature(Lcom/google/android/material/color/utilities/Hct;)D

    move-result-wide v5

    .line 131
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 132
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-wide v11, v8

    :goto_0
    const/16 v13, 0x168

    if-ge v10, v13, :cond_0

    add-int v13, v4, v10

    .line 136
    invoke-static {v13}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesInt(I)I

    move-result v13

    .line 137
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByHue()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/material/color/utilities/Hct;

    .line 138
    invoke-virtual {v0, v13}, Lcom/google/android/material/color/utilities/TemperatureCache;->getRelativeTemperature(Lcom/google/android/material/color/utilities/Hct;)D

    move-result-wide v13

    sub-double v5, v13, v5

    .line 139
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    add-double/2addr v11, v5

    add-int/lit8 v10, v10, 0x1

    move-wide v5, v13

    goto :goto_0

    :cond_0
    int-to-double v5, v2

    div-double/2addr v11, v5

    .line 147
    invoke-virtual {v0, v3}, Lcom/google/android/material/color/utilities/TemperatureCache;->getRelativeTemperature(Lcom/google/android/material/color/utilities/Hct;)D

    move-result-wide v5

    const/4 v3, 0x1

    .line 148
    :goto_1
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v10, v2, :cond_5

    add-int v10, v4, v3

    .line 149
    invoke-static {v10}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesInt(I)I

    move-result v10

    .line 150
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByHue()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/material/color/utilities/Hct;

    .line 151
    invoke-virtual {v0, v10}, Lcom/google/android/material/color/utilities/TemperatureCache;->getRelativeTemperature(Lcom/google/android/material/color/utilities/Hct;)D

    move-result-wide v14

    sub-double v5, v14, v5

    .line 152
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    add-double/2addr v8, v5

    .line 155
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    int-to-double v5, v5

    mul-double v5, v5, v11

    cmpl-double v16, v8, v5

    if-ltz v16, :cond_1

    const/4 v5, 0x1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    const/4 v6, 0x1

    :goto_3
    if-eqz v5, :cond_3

    .line 166
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v5, v2, :cond_3

    .line 167
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/2addr v5, v6

    move-wide/from16 v17, v14

    int-to-double v13, v5

    mul-double v13, v13, v11

    cmpl-double v5, v8, v13

    if-ltz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_4

    :cond_2
    const/4 v5, 0x0

    :goto_4
    add-int/lit8 v6, v6, 0x1

    move-wide/from16 v14, v17

    const/16 v13, 0x168

    goto :goto_3

    :cond_3
    move-wide/from16 v17, v14

    add-int/lit8 v3, v3, 0x1

    const/16 v5, 0x168

    if-le v3, v5, :cond_4

    .line 176
    :goto_5
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v3, v2, :cond_5

    .line 177
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    move-wide/from16 v5, v17

    const/16 v13, 0x168

    goto :goto_1

    .line 183
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 184
    iget-object v3, v0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    int-to-double v3, v1

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v5

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    div-double/2addr v3, v5

    .line 186
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v3, v3

    const/4 v4, 0x1

    :goto_6
    add-int/lit8 v5, v3, 0x1

    if-ge v4, v5, :cond_8

    rsub-int/lit8 v5, v4, 0x0

    :goto_7
    if-gez v5, :cond_6

    .line 190
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/2addr v5, v6

    goto :goto_7

    .line 192
    :cond_6
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lt v5, v6, :cond_7

    .line 193
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v6

    rem-int/2addr v5, v6

    .line 195
    :cond_7
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/material/color/utilities/Hct;

    const/4 v6, 0x0

    invoke-virtual {v2, v6, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_8
    sub-int/2addr v1, v3

    const/4 v3, 0x1

    :goto_8
    if-ge v3, v1, :cond_b

    move v4, v3

    :goto_9
    if-gez v4, :cond_9

    .line 202
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_9

    .line 204
    :cond_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lt v4, v5, :cond_a

    .line 205
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v5

    rem-int/2addr v4, v5

    .line 207
    :cond_a
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_b
    return-object v2
.end method

.method public getComplement()Lcom/google/android/material/color/utilities/Hct;
    .locals 26

    move-object/from16 v0, p0

    .line 68
    iget-object v1, v0, Lcom/google/android/material/color/utilities/TemperatureCache;->precomputedComplement:Lcom/google/android/material/color/utilities/Hct;

    if-eqz v1, :cond_0

    return-object v1

    .line 72
    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getColdest()Lcom/google/android/material/color/utilities/Hct;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    move-result-wide v8

    .line 73
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getTempsByHct()Ljava/util/Map;

    move-result-object v1

    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getColdest()Lcom/google/android/material/color/utilities/Hct;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    .line 75
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getWarmest()Lcom/google/android/material/color/utilities/Hct;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    move-result-wide v12

    .line 76
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getTempsByHct()Ljava/util/Map;

    move-result-object v1

    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getWarmest()Lcom/google/android/material/color/utilities/Hct;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    sub-double v14, v1, v10

    .line 78
    iget-object v1, v0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v1}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    move-result-wide v2

    move-wide v4, v8

    move-wide v6, v12

    invoke-static/range {v2 .. v7}, Lcom/google/android/material/color/utilities/TemperatureCache;->isBetween(DDD)Z

    move-result v1

    if-eqz v1, :cond_1

    move-wide/from16 v16, v12

    goto :goto_0

    :cond_1
    move-wide/from16 v16, v8

    :goto_0
    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-wide v8, v12

    .line 83
    :goto_1
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByHue()Ljava/util/List;

    move-result-object v1

    iget-object v2, v0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v2}, Lcom/google/android/material/color/utilities/Hct;->getHue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v3, v2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/color/utilities/Hct;

    .line 85
    iget-object v2, v0, Lcom/google/android/material/color/utilities/TemperatureCache;->input:Lcom/google/android/material/color/utilities/Hct;

    invoke-virtual {v0, v2}, Lcom/google/android/material/color/utilities/TemperatureCache;->getRelativeTemperature(Lcom/google/android/material/color/utilities/Hct;)D

    move-result-wide v2

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    sub-double v18, v12, v2

    const-wide v2, 0x408f400000000000L    # 1000.0

    const-wide/16 v4, 0x0

    move-wide/from16 v20, v2

    move-wide/from16 v22, v4

    :goto_2
    const-wide v2, 0x4076800000000000L    # 360.0

    cmpg-double v4, v22, v2

    if-gtz v4, :cond_5

    mul-double v2, v12, v22

    add-double v2, v2, v16

    .line 89
    invoke-static {v2, v3}, Lcom/google/android/material/color/utilities/MathUtils;->sanitizeDegreesDouble(D)D

    move-result-wide v24

    move-wide/from16 v2, v24

    move-wide/from16 v4, v16

    move-wide v6, v8

    .line 90
    invoke-static/range {v2 .. v7}, Lcom/google/android/material/color/utilities/TemperatureCache;->isBetween(DDD)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    .line 93
    :cond_3
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getHctsByHue()Ljava/util/List;

    move-result-object v2

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    long-to-int v4, v3

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/color/utilities/Hct;

    .line 94
    invoke-direct/range {p0 .. p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getTempsByHct()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    sub-double/2addr v3, v10

    div-double/2addr v3, v14

    sub-double v3, v18, v3

    .line 95
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(D)D

    move-result-wide v3

    cmpg-double v5, v3, v20

    if-gez v5, :cond_4

    move-object v1, v2

    move-wide/from16 v20, v3

    :cond_4
    :goto_3
    add-double v22, v22, v12

    goto :goto_2

    .line 101
    :cond_5
    iput-object v1, v0, Lcom/google/android/material/color/utilities/TemperatureCache;->precomputedComplement:Lcom/google/android/material/color/utilities/Hct;

    return-object v1
.end method

.method public getRelativeTemperature(Lcom/google/android/material/color/utilities/Hct;)D
    .locals 6

    .line 220
    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getTempsByHct()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getWarmest()Lcom/google/android/material/color/utilities/Hct;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getTempsByHct()Ljava/util/Map;

    move-result-object v2

    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getColdest()Lcom/google/android/material/color/utilities/Hct;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    sub-double/2addr v0, v2

    .line 221
    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getTempsByHct()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getTempsByHct()Ljava/util/Map;

    move-result-object p1

    invoke-direct {p0}, Lcom/google/android/material/color/utilities/TemperatureCache;->getColdest()Lcom/google/android/material/color/utilities/Hct;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    sub-double/2addr v2, v4

    const-wide/16 v4, 0x0

    cmpl-double p1, v0, v4

    if-nez p1, :cond_0

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    return-wide v0

    :cond_0
    div-double/2addr v2, v0

    return-wide v2
.end method
