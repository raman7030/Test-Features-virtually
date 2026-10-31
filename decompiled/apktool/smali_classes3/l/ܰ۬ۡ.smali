.class public final Ll/ܰ۬ۡ;
.super Ljava/lang/Object;
.source "G9BC"


# static fields
.field public static final ֫:[[C

.field public static ۧ:Ljava/util/BitSet;

.field public static ܽ:Ljava/util/BitSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const/4 v0, 0x2

    new-array v1, v0, [C

    .line 16
    fill-array-data v1, :array_0

    new-array v2, v0, [C

    fill-array-data v2, :array_1

    new-array v3, v0, [C

    fill-array-data v3, :array_2

    new-array v4, v0, [C

    fill-array-data v4, :array_3

    new-array v5, v0, [C

    fill-array-data v5, :array_4

    new-array v6, v0, [C

    fill-array-data v6, :array_5

    new-array v7, v0, [C

    fill-array-data v7, :array_6

    new-array v8, v0, [C

    fill-array-data v8, :array_7

    new-array v9, v0, [C

    fill-array-data v9, :array_8

    new-array v10, v0, [C

    fill-array-data v10, :array_9

    new-array v11, v0, [C

    fill-array-data v11, :array_a

    const/16 v12, 0xb

    new-array v12, v12, [[C

    const/4 v13, 0x0

    aput-object v1, v12, v13

    const/4 v1, 0x1

    aput-object v2, v12, v1

    aput-object v3, v12, v0

    const/4 v0, 0x3

    aput-object v4, v12, v0

    const/4 v0, 0x4

    aput-object v5, v12, v0

    const/4 v0, 0x5

    aput-object v6, v12, v0

    const/4 v0, 0x6

    aput-object v7, v12, v0

    const/4 v0, 0x7

    aput-object v8, v12, v0

    const/16 v0, 0x8

    aput-object v9, v12, v0

    const/16 v0, 0x9

    aput-object v10, v12, v0

    const/16 v0, 0xa

    aput-object v11, v12, v0

    sput-object v12, Ll/ܰ۬ۡ;->֫:[[C

    return-void

    :array_0
    .array-data 2
        0x300s
        0x10ffs
    .end array-data

    :array_1
    .array-data 2
        0x1300s
        0x13ffs
    .end array-data

    :array_2
    .array-data 2
        0x1700s
        0x1dffs
    .end array-data

    :array_3
    .array-data 2
        0x2000s
        0x20ffs
    .end array-data

    :array_4
    .array-data 2
        0x2c00s
        0x2dffs
    .end array-data

    :array_5
    .array-data 2
        0x3000s
        0x30ffs
    .end array-data

    :array_6
    .array-data 2
        -0x5a00s
        -0x5901s
    .end array-data

    :array_7
    .array-data 2
        -0x5800s
        -0x5401s
    .end array-data

    :array_8
    .array-data 2
        -0x940s
        -0x931s
    .end array-data

    :array_9
    .array-data 2
        -0x4f0s
        -0x4e1s
    .end array-data

    :array_a
    .array-data 2
        -0x200s
        -0x1d3s
    .end array-data
.end method

.method public static ֫()V
    .locals 2

    .line 79
    new-instance v0, Ljava/util/BitSet;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    sput-object v0, Ll/ܰ۬ۡ;->ܽ:Ljava/util/BitSet;

    sput-object v0, Ll/ܰ۬ۡ;->ۧ:Ljava/util/BitSet;

    return-void
.end method

.method public static ֫(I)Z
    .locals 2

    const/16 v0, 0x300

    if-lt p0, v0, :cond_1

    const v1, 0xfe2d

    if-le p0, v1, :cond_0

    goto :goto_0

    .line 124
    :cond_0
    sget-object v1, Ll/ܰ۬ۡ;->ܽ:Ljava/util/BitSet;

    sub-int/2addr p0, v0

    invoke-virtual {v1, p0}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static declared-synchronized ۧ()V
    .locals 17

    .line 2
    const-class v0, Ll/ܰ۬ۡ;

    move-object/from16 v16, v0

    .line 3
    monitor-enter v16

    .line 33
    :try_start_0
    sget-object v0, Ll/ܰ۬ۡ;->ۧ:Ljava/util/BitSet;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 34
    monitor-exit v16

    return-void

    .line 37
    :cond_0
    :try_start_1
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 38
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->scaledDensity:F

    const/high16 v3, 0x41700000    # 15.0f

    mul-float v2, v2, v3

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    const-string v2, "a"

    .line 39
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    const v3, 0x3f8ccccd    # 1.1f

    mul-float v2, v2, v3

    const/16 v3, 0x14

    new-array v4, v3, [C

    .line 41
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v5

    .line 42
    new-instance v6, Ljava/util/BitSet;

    const v7, 0xfb2e

    invoke-direct {v6, v7}, Ljava/util/BitSet;-><init>(I)V

    .line 43
    new-instance v8, Ljava/util/BitSet;

    invoke-direct {v8, v7}, Ljava/util/BitSet;-><init>(I)V

    .line 44
    sget-object v7, Ll/ܰ۬ۡ;->֫:[[C

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    const/16 v11, 0xb

    if-ge v10, v11, :cond_4

    aget-object v11, v7, v10

    .line 45
    aget-char v12, v11, v9

    .line 46
    aget-char v11, v11, v1

    :goto_1
    if-gt v12, v11, :cond_3

    .line 48
    invoke-virtual {v5, v12}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result v13

    if-nez v13, :cond_1

    goto :goto_2

    .line 51
    :cond_1
    invoke-static {v4, v12}, Ljava/util/Arrays;->fill([CC)V

    const/16 v13, 0x61

    aput-char v13, v4, v9

    .line 53
    invoke-virtual {v0, v4, v9, v3}, Landroid/graphics/Paint;->measureText([CII)F

    move-result v13

    cmpg-float v13, v13, v2

    if-gez v13, :cond_2

    add-int/lit16 v13, v12, -0x300

    .line 54
    invoke-virtual {v6, v13}, Ljava/util/BitSet;->set(I)V

    .line 55
    invoke-virtual {v0, v4, v1, v1}, Landroid/graphics/Paint;->measureText([CII)F

    move-result v14

    const/4 v15, 0x0

    cmpl-float v14, v14, v15

    if-lez v14, :cond_2

    .line 56
    invoke-virtual {v8, v13}, Ljava/util/BitSet;->set(I)V

    :cond_2
    :goto_2
    add-int/lit8 v12, v12, 0x1

    int-to-char v12, v12

    goto :goto_1

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 61
    :cond_4
    sput-object v6, Ll/ܰ۬ۡ;->ۧ:Ljava/util/BitSet;

    .line 62
    sput-object v8, Ll/ܰ۬ۡ;->ܽ:Ljava/util/BitSet;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    monitor-exit v16

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public static ۧ(I)Z
    .locals 2

    const/16 v0, 0x300

    if-lt p0, v0, :cond_1

    const/16 v1, 0x3ff

    if-gt p0, v1, :cond_1

    .line 104
    sget-object v1, Ll/ܰ۬ۡ;->ۧ:Ljava/util/BitSet;

    if-nez v1, :cond_0

    .line 106
    invoke-static {}, Ll/ܰ۬ۡ;->ۧ()V

    .line 107
    sget-object v1, Ll/ܰ۬ۡ;->ۧ:Ljava/util/BitSet;

    :cond_0
    sub-int/2addr p0, v0

    .line 109
    invoke-virtual {v1, p0}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(I)Z
    .locals 2

    const/16 v0, 0x300

    if-lt p0, v0, :cond_2

    const v1, 0xfe2d

    if-le p0, v1, :cond_0

    goto :goto_0

    .line 89
    :cond_0
    sget-object v1, Ll/ܰ۬ۡ;->ۧ:Ljava/util/BitSet;

    if-nez v1, :cond_1

    .line 91
    invoke-static {}, Ll/ܰ۬ۡ;->ۧ()V

    .line 92
    sget-object v1, Ll/ܰ۬ۡ;->ۧ:Ljava/util/BitSet;

    :cond_1
    sub-int/2addr p0, v0

    .line 94
    invoke-virtual {v1, p0}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
