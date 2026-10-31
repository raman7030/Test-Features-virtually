.class public final Ll/ۧܰ᩵;
.super Ljava/lang/Object;
.source "H4E0"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۖ:I

.field public final ۜ:Z

.field public final ۡ:Z

.field public final ۢ:Z

.field public final ۧ:Z

.field public final ܳ:I

.field public final ܺ:Z

.field public final ܽ:Z

.field public final ܿ:I

.field public final ᩳ:Z

.field public final ᩷:Z

.field public final ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 18
    new-instance v0, Ll/֫ܰ᩵;

    invoke-direct {v0}, Ll/֫ܰ᩵;-><init>()V

    const/4 v1, 0x1

    .line 290
    iput-boolean v1, v0, Ll/֫ܰ᩵;->ᩳ:Z

    .line 18
    invoke-virtual {v0}, Ll/֫ܰ᩵;->֫()Ll/ۧܰ᩵;

    .line 25
    new-instance v0, Ll/֫ܰ᩵;

    invoke-direct {v0}, Ll/֫ܰ᩵;-><init>()V

    .line 354
    iput-boolean v1, v0, Ll/֫ܰ᩵;->ܿ:Z

    .line 26
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const v2, 0x7fffffff

    int-to-long v3, v2

    .line 325
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v3

    const-wide/32 v5, 0x7fffffff

    cmp-long v1, v3, v5

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    long-to-int v2, v3

    .line 328
    :goto_0
    iput v2, v0, Ll/֫ܰ᩵;->ۧ:I

    .line 28
    invoke-virtual {v0}, Ll/֫ܰ᩵;->֫()Ll/ۧܰ᩵;

    return-void
.end method

.method public constructor <init>(Ll/֫ܰ᩵;)V
    .locals 2

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iget-boolean v0, p1, Ll/֫ܰ᩵;->ᩳ:Z

    iput-boolean v0, p0, Ll/ۧܰ᩵;->᩷:Z

    const/4 v0, 0x0

    .line 66
    iput-boolean v0, p0, Ll/ۧܰ᩵;->ۢ:Z

    .line 67
    iget v1, p1, Ll/֫ܰ᩵;->֫:I

    iput v1, p0, Ll/ۧܰ᩵;->ܿ:I

    const/4 v1, -0x1

    .line 68
    iput v1, p0, Ll/ۧܰ᩵;->ۖ:I

    .line 69
    iput-boolean v0, p0, Ll/ۧܰ᩵;->ܽ:Z

    .line 70
    iput-boolean v0, p0, Ll/ۧܰ᩵;->ᩳ:Z

    .line 71
    iput-boolean v0, p0, Ll/ۧܰ᩵;->ۜ:Z

    .line 72
    iget v1, p1, Ll/֫ܰ᩵;->ۧ:I

    iput v1, p0, Ll/ۧܰ᩵;->ܳ:I

    .line 73
    iget v1, p1, Ll/֫ܰ᩵;->ܽ:I

    iput v1, p0, Ll/ۧܰ᩵;->᩻:I

    .line 74
    iget-boolean p1, p1, Ll/֫ܰ᩵;->ܿ:Z

    iput-boolean p1, p0, Ll/ۧܰ᩵;->ܺ:Z

    .line 75
    iput-boolean v0, p0, Ll/ۧܰ᩵;->ۡ:Z

    .line 76
    iput-boolean v0, p0, Ll/ۧܰ᩵;->ۧ:Z

    return-void
.end method

.method public constructor <init>(ZZIIZZZIIZZZLjava/lang/String;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-boolean p1, p0, Ll/ۧܰ᩵;->᩷:Z

    .line 50
    iput-boolean p2, p0, Ll/ۧܰ᩵;->ۢ:Z

    .line 51
    iput p3, p0, Ll/ۧܰ᩵;->ܿ:I

    .line 52
    iput p4, p0, Ll/ۧܰ᩵;->ۖ:I

    .line 53
    iput-boolean p5, p0, Ll/ۧܰ᩵;->ܽ:Z

    .line 54
    iput-boolean p6, p0, Ll/ۧܰ᩵;->ᩳ:Z

    .line 55
    iput-boolean p7, p0, Ll/ۧܰ᩵;->ۜ:Z

    .line 56
    iput p8, p0, Ll/ۧܰ᩵;->ܳ:I

    .line 57
    iput p9, p0, Ll/ۧܰ᩵;->᩻:I

    .line 58
    iput-boolean p10, p0, Ll/ۧܰ᩵;->ܺ:Z

    .line 59
    iput-boolean p11, p0, Ll/ۧܰ᩵;->ۡ:Z

    .line 60
    iput-boolean p12, p0, Ll/ۧܰ᩵;->ۧ:Z

    .line 61
    iput-object p13, p0, Ll/ۧܰ᩵;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ۤܰ᩵;)Ll/ۧܰ᩵;
    .locals 21

    move-object/from16 v0, p0

    .line 169
    invoke-virtual/range {p0 .. p0}, Ll/ۤܰ᩵;->ۧ()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, -0x1

    const/4 v13, -0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, -0x1

    const/4 v9, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, -0x1

    const/4 v14, -0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    if-ge v2, v1, :cond_15

    .line 170
    invoke-virtual {v0, v2}, Ll/ۤܰ᩵;->֫(I)Ljava/lang/String;

    move-result-object v5

    move/from16 v18, v1

    .line 171
    invoke-virtual {v0, v2}, Ll/ۤܰ᩵;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    const-string v0, "Cache-Control"

    .line 173
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move-object v4, v1

    goto :goto_2

    :cond_1
    const-string v0, "Pragma"

    .line 180
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    :goto_1
    const/4 v3, 0x0

    :goto_2
    const/4 v0, 0x0

    .line 188
    :goto_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v0, v5, :cond_13

    const-string v5, "=,;"

    .line 190
    invoke-static {v0, v1, v5}, Ll/֨֫֡;->֫(ILjava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 191
    invoke-virtual {v1, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    move/from16 v19, v3

    .line 194
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v5, v3, :cond_5

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    move-object/from16 v20, v4

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_6

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x3b

    if-ne v3, v4, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 363
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v5, v3, :cond_3

    .line 364
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_2

    const/16 v4, 0x9

    if-eq v3, v4, :cond_2

    .line 202
    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v5, v3, :cond_4

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x22

    if-ne v3, v4, :cond_4

    add-int/lit8 v5, v5, 0x1

    const-string v3, "\""

    .line 205
    invoke-static {v5, v1, v3}, Ll/֨֫֡;->֫(ILjava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 206
    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_4
    const-string v3, ",;"

    .line 212
    invoke-static {v5, v1, v3}, Ll/֨֫֡;->֫(ILjava/lang/String;Ljava/lang/String;)I

    move-result v3

    .line 213
    invoke-virtual {v1, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_5
    move-object/from16 v20, v4

    :cond_6
    :goto_4
    add-int/lit8 v5, v5, 0x1

    const/4 v4, 0x0

    move v3, v5

    :goto_5
    const-string v5, "no-cache"

    .line 217
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto/16 :goto_6

    :cond_7
    const-string v5, "no-store"

    .line 219
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto/16 :goto_6

    :cond_8
    const-string v5, "max-age"

    .line 221
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v0, -0x1

    .line 222
    invoke-static {v0, v4}, Ll/֨֫֡;->֫(ILjava/lang/String;)I

    move-result v0

    move v8, v0

    goto/16 :goto_6

    :cond_9
    const-string v5, "s-maxage"

    .line 223
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/4 v0, -0x1

    .line 224
    invoke-static {v0, v4}, Ll/֨֫֡;->֫(ILjava/lang/String;)I

    move-result v0

    move v9, v0

    goto/16 :goto_6

    :cond_a
    const-string v5, "private"

    .line 225
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    const/4 v0, 0x1

    const/4 v10, 0x1

    goto :goto_6

    :cond_b
    const-string v5, "public"

    .line 227
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v0, 0x1

    const/4 v11, 0x1

    goto :goto_6

    :cond_c
    const-string v5, "must-revalidate"

    .line 229
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v0, 0x1

    const/4 v12, 0x1

    goto :goto_6

    :cond_d
    const-string v5, "max-stale"

    .line 231
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    const v0, 0x7fffffff

    .line 232
    invoke-static {v0, v4}, Ll/֨֫֡;->֫(ILjava/lang/String;)I

    move-result v0

    move v13, v0

    goto :goto_6

    :cond_e
    const-string v5, "min-fresh"

    .line 233
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    const/4 v0, -0x1

    .line 234
    invoke-static {v0, v4}, Ll/֨֫֡;->֫(ILjava/lang/String;)I

    move-result v0

    move v14, v0

    goto :goto_6

    :cond_f
    const-string v4, "only-if-cached"

    .line 235
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    const/4 v0, 0x1

    const/4 v15, 0x1

    goto :goto_6

    :cond_10
    const-string v4, "no-transform"

    .line 237
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_11

    const/4 v0, 0x1

    const/16 v16, 0x1

    goto :goto_6

    :cond_11
    const-string v4, "immutable"

    .line 239
    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    const/16 v17, 0x1

    :cond_12
    :goto_6
    move v0, v3

    move/from16 v3, v19

    move-object/from16 v4, v20

    goto/16 :goto_3

    :cond_13
    move/from16 v19, v3

    move-object/from16 v20, v4

    :cond_14
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v18

    goto/16 :goto_0

    :cond_15
    if-nez v3, :cond_16

    const/4 v4, 0x0

    :cond_16
    move-object/from16 v18, v4

    .line 248
    new-instance v0, Ll/ۧܰ᩵;

    move-object v5, v0

    invoke-direct/range {v5 .. v18}, Ll/ۧܰ᩵;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 254
    iget-object v0, p0, Ll/ۧܰ᩵;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 259
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    iget-boolean v1, p0, Ll/ۧܰ᩵;->᩷:Z

    if-eqz v1, :cond_1

    const-string v1, "no-cache, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    :cond_1
    iget-boolean v1, p0, Ll/ۧܰ᩵;->ۢ:Z

    if-eqz v1, :cond_2

    const-string v1, "no-store, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    :cond_2
    iget v1, p0, Ll/ۧܰ᩵;->ܿ:I

    const-string v2, ", "

    const/4 v3, -0x1

    if-eq v1, v3, :cond_3

    const-string v4, "max-age="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    :cond_3
    iget v1, p0, Ll/ۧܰ᩵;->ۖ:I

    if-eq v1, v3, :cond_4

    const-string v4, "s-maxage="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    :cond_4
    iget-boolean v1, p0, Ll/ۧܰ᩵;->ܽ:Z

    if-eqz v1, :cond_5

    const-string v1, "private, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    :cond_5
    iget-boolean v1, p0, Ll/ۧܰ᩵;->ᩳ:Z

    if-eqz v1, :cond_6

    const-string v1, "public, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    :cond_6
    iget-boolean v1, p0, Ll/ۧܰ᩵;->ۜ:Z

    if-eqz v1, :cond_7

    const-string v1, "must-revalidate, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    :cond_7
    iget v1, p0, Ll/ۧܰ᩵;->ܳ:I

    if-eq v1, v3, :cond_8

    const-string v4, "max-stale="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    :cond_8
    iget v1, p0, Ll/ۧܰ᩵;->᩻:I

    if-eq v1, v3, :cond_9

    const-string v3, "min-fresh="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    :cond_9
    iget-boolean v1, p0, Ll/ۧܰ᩵;->ܺ:Z

    if-eqz v1, :cond_a

    const-string v1, "only-if-cached, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    :cond_a
    iget-boolean v1, p0, Ll/ۧܰ᩵;->ۡ:Z

    if-eqz v1, :cond_b

    const-string v1, "no-transform, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    :cond_b
    iget-boolean v1, p0, Ll/ۧܰ᩵;->ۧ:Z

    if-eqz v1, :cond_c

    const-string v1, "immutable, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    :cond_c
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_d

    const-string v0, ""

    goto :goto_0

    .line 273
    :cond_d
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 255
    :goto_0
    iput-object v0, p0, Ll/ۧܰ᩵;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Ll/ۧܰ᩵;->ܽ:Z

    return v0
.end method

.method public final ۜ()Z
    .locals 1

    .line 92
    iget-boolean v0, p0, Ll/ۧܰ᩵;->ۢ:Z

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 115
    iget-boolean v0, p0, Ll/ۧܰ᩵;->ᩳ:Z

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 119
    iget-boolean v0, p0, Ll/ۧܰ᩵;->ۜ:Z

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 99
    iget v0, p0, Ll/ۧܰ᩵;->ܿ:I

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 127
    iget v0, p0, Ll/ۧܰ᩵;->᩻:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 123
    iget v0, p0, Ll/ۧܰ᩵;->ܳ:I

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 137
    iget-boolean v0, p0, Ll/ۧܰ᩵;->ܺ:Z

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 87
    iget-boolean v0, p0, Ll/ۧܰ᩵;->᩷:Z

    return v0
.end method
