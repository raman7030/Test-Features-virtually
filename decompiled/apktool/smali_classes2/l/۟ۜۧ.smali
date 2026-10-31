.class public final Ll/۟ۜۧ;
.super Ljava/lang/Object;
.source "88HU"


# instance fields
.field public final ֫:I

.field public final ۜ:Ljava/util/ArrayList;

.field public final ۡ:F

.field public final ۢ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܺ:I

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;IIIIIIIIIFLjava/lang/String;)V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p1, p0, Ll/۟ۜۧ;->ۜ:Ljava/util/ArrayList;

    .line 175
    iput p2, p0, Ll/۟ۜۧ;->ۢ:I

    .line 176
    iput p3, p0, Ll/۟ۜۧ;->ܺ:I

    .line 177
    iput p4, p0, Ll/۟ۜۧ;->᩻:I

    .line 178
    iput p5, p0, Ll/۟ۜۧ;->ۧ:I

    .line 179
    iput p6, p0, Ll/۟ۜۧ;->֫:I

    .line 180
    iput p7, p0, Ll/۟ۜۧ;->ܿ:I

    .line 181
    iput p8, p0, Ll/۟ۜۧ;->ᩳ:I

    .line 182
    iput p9, p0, Ll/۟ۜۧ;->ܳ:I

    .line 183
    iput p10, p0, Ll/۟ۜۧ;->᩷:I

    .line 184
    iput p11, p0, Ll/۟ۜۧ;->ۡ:F

    .line 185
    iput-object p12, p0, Ll/۟ۜۧ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ᩳ֨֫;)Ll/۟ۜۧ;
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x4

    .line 44
    :try_start_0
    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 45
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    const/4 v3, 0x3

    and-int/2addr v2, v3

    add-int/lit8 v6, v2, 0x1

    if-eq v6, v3, :cond_3

    .line 49
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    and-int/lit8 v2, v2, 0x1f

    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v2, :cond_0

    .line 189
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v8

    .line 190
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v9

    .line 191
    invoke-virtual {v0, v8}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 192
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v10

    invoke-static {v9, v8, v10}, Ll/ᩳۚ֫;->֫(II[B)[B

    move-result-object v8

    .line 52
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->֨()I

    move-result v7

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_1

    .line 189
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v9

    .line 190
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ᩳ()I

    move-result v10

    .line 191
    invoke-virtual {v0, v9}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 192
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v11

    invoke-static {v10, v9, v11}, Ll/ᩳۚ֫;->֫(II[B)[B

    move-result-object v9

    .line 56
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    if-lez v2, :cond_2

    .line 71
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    .line 74
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    array-length v0, v0

    .line 73
    invoke-static {v1, v0, v2}, Ll/ܽ۠֫;->ܽ(II[B)Ll/ۧ۠֫;

    move-result-object v0

    .line 75
    iget v1, v0, Ll/ۧ۠֫;->֨:I

    .line 76
    iget v2, v0, Ll/ۧ۠֫;->ۢ:I

    .line 77
    iget v4, v0, Ll/ۧ۠֫;->ۧ:I

    add-int/lit8 v4, v4, 0x8

    .line 78
    iget v7, v0, Ll/ۧ۠֫;->֫:I

    add-int/lit8 v7, v7, 0x8

    .line 79
    iget v8, v0, Ll/ۧ۠֫;->ᩳ:I

    .line 80
    iget v9, v0, Ll/ۧ۠֫;->ܽ:I

    .line 81
    iget v10, v0, Ll/ۧ۠֫;->ܿ:I

    .line 82
    iget v11, v0, Ll/ۧ۠֫;->ܺ:I

    .line 83
    iget v12, v0, Ll/ۧ۠֫;->ᩴ:F

    .line 84
    iget v13, v0, Ll/ۧ۠֫;->᩵:I

    iget v15, v0, Ll/ۧ۠֫;->ܳ:I

    iget v0, v0, Ll/ۧ۠֫;->ۡ:I

    .line 85
    sget v16, Ll/ᩳۚ֫;->֫:I

    const/16 v16, 0x0

    const-string v14, "avc1.%02X%02X%02X"

    .line 312
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v13, v3, v16

    const/4 v13, 0x1

    aput-object v15, v3, v13

    const/4 v13, 0x2

    aput-object v0, v3, v13

    .line 311
    invoke-static {v14, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v16, v0

    move v13, v10

    move v14, v11

    move v15, v12

    move v10, v7

    move v11, v8

    move v12, v9

    move v7, v1

    move v8, v2

    move v9, v4

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/16 v10, 0x10

    const/high16 v11, 0x3f800000    # 1.0f

    move-object/from16 v16, v0

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, -0x1

    const/16 v14, 0x10

    const/high16 v15, 0x3f800000    # 1.0f

    .line 89
    :goto_2
    new-instance v0, Ll/۟ۜۧ;

    move-object v4, v0

    invoke-direct/range {v4 .. v16}, Ll/۟ۜۧ;-><init>(Ljava/util/ArrayList;IIIIIIIIIFLjava/lang/String;)V

    return-object v0

    .line 47
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    const-string v1, "Error parsing AVC config"

    .line 103
    invoke-static {v1, v0}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object v0

    throw v0
.end method
