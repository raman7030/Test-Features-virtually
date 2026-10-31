.class public final Ll/ۖۡۧ;
.super Ljava/lang/Object;
.source "P8UK"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public ֫:Ll/᩸᩷ۧ;

.field public final ۜ:Ll/ᩳ֨֫;

.field public ۢ:I

.field public ۧ:Ll/۠᩷ۧ;

.field public ܳ:Ll/᩵ۡۧ;

.field public ܽ:I

.field public ܿ:Ll/ܰۖۧ;

.field public ᩳ:Ll/ۖܺۧ;

.field public ᩷:I

.field public ᩻:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    new-instance v0, Ll/ᩳ֨֫;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ۖۡۧ;->ۜ:Ll/ᩳ֨֫;

    const-wide/16 v0, -0x1

    .line 96
    iput-wide v0, p0, Ll/ۖۡۧ;->᩻:J

    return-void
.end method

.method private ֫(Ll/ܺ᩷ۧ;)I
    .locals 4

    .line 177
    iget-object v0, p0, Ll/ۖۡۧ;->ۜ:Ll/ᩳ֨֫;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 178
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    const/4 v3, 0x0

    .line 157
    invoke-virtual {p1, v3, v3, v1, v2}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 179
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۗ()I

    move-result p1

    return p1
.end method

.method private ۧ()V
    .locals 4

    .line 263
    iget-object v0, p0, Ll/ۖۡۧ;->֫:Ll/᩸᩷ۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    invoke-interface {v0}, Ll/᩸᩷ۧ;->ܳ()V

    .line 264
    iget-object v0, p0, Ll/ۖۡۧ;->֫:Ll/᩸᩷ۧ;

    new-instance v1, Ll/᩷ۢۧ;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {v0, v1}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    const/4 v0, 0x6

    .line 265
    iput v0, p0, Ll/ۖۡۧ;->ۢ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 122
    iget v3, v0, Ll/ۖۡۧ;->ۢ:I

    const-wide/16 v4, -0x1

    iget-object v6, v0, Ll/ۖۡۧ;->ۜ:Ll/ᩳ֨֫;

    const/4 v7, 0x4

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_17

    if-eq v3, v9, :cond_16

    if-eq v3, v8, :cond_a

    const/4 v4, 0x5

    if-eq v3, v7, :cond_5

    if-eq v3, v4, :cond_1

    const/4 v1, 0x6

    if-ne v3, v1, :cond_0

    const/4 v1, -0x1

    return v1

    .line 155
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 140
    :cond_1
    iget-object v3, v0, Ll/ۖۡۧ;->ܳ:Ll/᩵ۡۧ;

    if-eqz v3, :cond_2

    iget-object v3, v0, Ll/ۖۡۧ;->ۧ:Ll/۠᩷ۧ;

    if-eq v1, v3, :cond_3

    .line 141
    :cond_2
    iput-object v1, v0, Ll/ۖۡۧ;->ۧ:Ll/۠᩷ۧ;

    .line 142
    new-instance v3, Ll/᩵ۡۧ;

    iget-wide v4, v0, Ll/ۖۡۧ;->᩻:J

    invoke-direct {v3, v1, v4, v5}, Ll/᩵ۡۧ;-><init>(Ll/۠᩷ۧ;J)V

    iput-object v3, v0, Ll/ۖۡۧ;->ܳ:Ll/᩵ۡۧ;

    .line 146
    :cond_3
    iget-object v1, v0, Ll/ۖۡۧ;->ܿ:Ll/ܰۖۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    iget-object v3, v0, Ll/ۖۡۧ;->ܳ:Ll/᩵ۡۧ;

    invoke-virtual {v1, v3, v2}, Ll/ܰۖۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result v1

    if-ne v1, v9, :cond_4

    .line 149
    iget-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    iget-wide v5, v0, Ll/ۖۡۧ;->᩻:J

    add-long/2addr v3, v5

    iput-wide v3, v2, Ll/᩻ۢۧ;->֫:J

    :cond_4
    return v1

    .line 133
    :cond_5
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v11

    iget-wide v13, v0, Ll/ۖۡۧ;->᩻:J

    cmp-long v3, v11, v13

    if-eqz v3, :cond_6

    .line 134
    iput-wide v13, v2, Ll/᩻ۢۧ;->֫:J

    return v9

    .line 235
    :cond_6
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v2

    .line 234
    invoke-interface {v1, v9, v10, v9, v2}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result v2

    if-nez v2, :cond_7

    .line 237
    invoke-direct/range {p0 .. p0}, Ll/ۖۡۧ;->ۧ()V

    return v10

    .line 239
    :cond_7
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    .line 240
    iget-object v2, v0, Ll/ۖۡۧ;->ܿ:Ll/ܰۖۧ;

    if-nez v2, :cond_8

    .line 241
    new-instance v2, Ll/ܰۖۧ;

    sget-object v3, Ll/ۜᩴۧ;->֫:Ll/ۜᩴۧ;

    const/16 v5, 0x8

    invoke-direct {v2, v3, v5}, Ll/ܰۖۧ;-><init>(Ll/ۜᩴۧ;I)V

    iput-object v2, v0, Ll/ۖۡۧ;->ܿ:Ll/ܰۖۧ;

    .line 245
    :cond_8
    new-instance v2, Ll/᩵ۡۧ;

    iget-wide v5, v0, Ll/ۖۡۧ;->᩻:J

    invoke-direct {v2, v1, v5, v6}, Ll/᩵ۡۧ;-><init>(Ll/۠᩷ۧ;J)V

    iput-object v2, v0, Ll/ۖۡۧ;->ܳ:Ll/᩵ۡۧ;

    .line 247
    iget-object v1, v0, Ll/ۖۡۧ;->ܿ:Ll/ܰۖۧ;

    invoke-virtual {v1, v2}, Ll/ܰۖۧ;->֫(Ll/۠᩷ۧ;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 248
    iget-object v1, v0, Ll/ۖۡۧ;->ܿ:Ll/ܰۖۧ;

    new-instance v2, Ll/ۚۡۧ;

    iget-wide v5, v0, Ll/ۖۡۧ;->᩻:J

    iget-object v3, v0, Ll/ۖۡۧ;->֫:Ll/᩸᩷ۧ;

    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    invoke-direct {v2, v5, v6, v3}, Ll/ۚۡۧ;-><init>(JLl/᩸᩷ۧ;)V

    .line 248
    invoke-virtual {v1, v2}, Ll/ܰۖۧ;->֫(Ll/᩸᩷ۧ;)V

    .line 258
    iget-object v1, v0, Ll/ۖۡۧ;->ᩳ:Ll/ۖܺۧ;

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    iget-object v2, v0, Ll/ۖۡۧ;->֫:Ll/᩸᩷ۧ;

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v3, 0x400

    .line 270
    invoke-interface {v2, v3, v7}, Ll/᩸᩷ۧ;->֫(II)Ll/᩵ۢۧ;

    move-result-object v2

    .line 271
    new-instance v3, Ll/֨ᩴ֫;

    invoke-direct {v3}, Ll/֨ᩴ֫;-><init>()V

    const-string v5, "image/jpeg"

    .line 273
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->ۧ(Ljava/lang/String;)V

    new-instance v5, Ll/᩻᩵֫;

    new-array v6, v9, [Ll/ܳ᩵֫;

    aput-object v1, v6, v10

    invoke-direct {v5, v6}, Ll/᩻᩵֫;-><init>([Ll/ܳ᩵֫;)V

    .line 274
    invoke-virtual {v3, v5}, Ll/֨ᩴ֫;->֫(Ll/᩻᩵֫;)V

    .line 275
    invoke-virtual {v3}, Ll/֨ᩴ֫;->֫()Ll/۠ᩴ֫;

    move-result-object v1

    .line 271
    invoke-interface {v2, v1}, Ll/᩵ۢۧ;->֫(Ll/۠ᩴ֫;)V

    .line 259
    iput v4, v0, Ll/ۖۡۧ;->ۢ:I

    return v10

    .line 252
    :cond_9
    invoke-direct/range {p0 .. p0}, Ll/ۖۡۧ;->ۧ()V

    return v10

    .line 212
    :cond_a
    iget v2, v0, Ll/ۖۡۧ;->ܽ:I

    const v3, 0xffe1

    if-ne v2, v3, :cond_14

    .line 213
    new-instance v2, Ll/ᩳ֨֫;

    iget v3, v0, Ll/ۖۡۧ;->᩷:I

    invoke-direct {v2, v3}, Ll/ᩳ֨֫;-><init>(I)V

    .line 214
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    iget v6, v0, Ll/ۖۡۧ;->᩷:I

    invoke-interface {v1, v3, v10, v6}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 215
    iget-object v3, v0, Ll/ۖۡۧ;->ᩳ:Ll/ۖܺۧ;

    if-nez v3, :cond_15

    const-string v3, "http://ns.adobe.com/xap/1.0/"

    .line 216
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 217
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩵()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_15

    .line 219
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v6

    cmp-long v1, v6, v4

    if-nez v1, :cond_b

    goto/16 :goto_2

    .line 302
    :cond_b
    invoke-static {v2}, Ll/֨ۡۧ;->֫(Ljava/lang/String;)Ll/ᩴۡۧ;

    move-result-object v1

    if-nez v1, :cond_c

    goto/16 :goto_2

    .line 81
    :cond_c
    iget-object v2, v1, Ll/ᩴۡۧ;->֫:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v3, v8, :cond_d

    goto :goto_2

    .line 95
    :cond_d
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v9

    const/4 v8, 0x0

    move-wide v12, v4

    move-wide v14, v12

    move-wide/from16 v18, v14

    move-wide/from16 v20, v18

    :goto_0
    if-ltz v3, :cond_11

    .line 96
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۘۡۧ;

    const-string v11, "video/mp4"

    .line 97
    iget-object v10, v9, Ll/ۘۡۧ;->ۧ:Ljava/lang/String;

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    if-nez v3, :cond_e

    .line 102
    iget-wide v9, v9, Ll/ۘۡۧ;->ܽ:J

    sub-long/2addr v6, v9

    const-wide/16 v9, 0x0

    goto :goto_1

    .line 104
    :cond_e
    iget-wide v9, v9, Ll/ۘۡۧ;->֫:J

    sub-long v9, v6, v9

    :goto_1
    if-eqz v8, :cond_f

    cmp-long v11, v9, v6

    if-eqz v11, :cond_f

    sub-long v20, v6, v9

    const/4 v8, 0x0

    move-wide/from16 v18, v9

    :cond_f
    if-nez v3, :cond_10

    move-wide v14, v6

    move-wide v12, v9

    :cond_10
    add-int/lit8 v3, v3, -0x1

    move-wide v6, v9

    const/4 v10, 0x0

    goto :goto_0

    :cond_11
    cmp-long v2, v18, v4

    if-eqz v2, :cond_13

    cmp-long v2, v20, v4

    if-eqz v2, :cond_13

    cmp-long v2, v12, v4

    if-eqz v2, :cond_13

    cmp-long v2, v14, v4

    if-nez v2, :cond_12

    goto :goto_2

    .line 123
    :cond_12
    new-instance v2, Ll/ۖܺۧ;

    iget-wide v3, v1, Ll/ᩴۡۧ;->ۧ:J

    move-object v11, v2

    move-wide/from16 v16, v3

    invoke-direct/range {v11 .. v21}, Ll/ۖܺۧ;-><init>(JJJJJ)V

    goto :goto_3

    :cond_13
    :goto_2
    const/4 v2, 0x0

    .line 219
    :goto_3
    iput-object v2, v0, Ll/ۖۡۧ;->ᩳ:Ll/ۖܺۧ;

    if-eqz v2, :cond_15

    .line 221
    iget-wide v1, v2, Ll/ۖܺۧ;->ܿ:J

    iput-wide v1, v0, Ll/ۖۡۧ;->᩻:J

    goto :goto_4

    .line 226
    :cond_14
    iget v2, v0, Ll/ۖۡۧ;->᩷:I

    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    :cond_15
    :goto_4
    const/4 v2, 0x0

    .line 228
    iput v2, v0, Ll/ۖۡۧ;->ۢ:I

    return v2

    :cond_16
    const/4 v2, 0x0

    .line 205
    invoke-virtual {v6, v8}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 206
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-interface {v1, v3, v2, v8}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 207
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    sub-int/2addr v1, v8

    iput v1, v0, Ll/ۖۡۧ;->᩷:I

    .line 208
    iput v8, v0, Ll/ۖۡۧ;->ۢ:I

    return v2

    :cond_17
    const/4 v2, 0x0

    .line 190
    invoke-virtual {v6, v8}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 191
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-interface {v1, v3, v2, v8}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 192
    invoke-virtual {v6}, Ll/ᩳ֨֫;->ۗ()I

    move-result v1

    iput v1, v0, Ll/ۖۡۧ;->ܽ:I

    const v3, 0xffda

    if-ne v1, v3, :cond_19

    .line 194
    iget-wide v8, v0, Ll/ۖۡۧ;->᩻:J

    cmp-long v1, v8, v4

    if-eqz v1, :cond_18

    .line 195
    iput v7, v0, Ll/ۖۡۧ;->ۢ:I

    return v2

    .line 197
    :cond_18
    invoke-direct/range {p0 .. p0}, Ll/ۖۡۧ;->ۧ()V

    return v2

    :cond_19
    const v2, 0xffd0

    if-lt v1, v2, :cond_1a

    const v2, 0xffd9

    if-le v1, v2, :cond_1b

    :cond_1a
    const v2, 0xff01

    if-eq v1, v2, :cond_1b

    .line 200
    iput v9, v0, Ll/ۖۡۧ;->ۢ:I

    :cond_1b
    const/4 v1, 0x0

    return v1
.end method

.method public final ֫()V
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ۖۡۧ;->ܿ:Ll/ܰۖۧ;

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public final ֫(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    .line 162
    iput p1, p0, Ll/ۖۡۧ;->ۢ:I

    const/4 p1, 0x0

    .line 163
    iput-object p1, p0, Ll/ۖۡۧ;->ܿ:Ll/ܰۖۧ;

    return-void

    .line 164
    :cond_0
    iget v0, p0, Ll/ۖۡۧ;->ۢ:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    .line 165
    iget-object v0, p0, Ll/ۖۡۧ;->ܿ:Ll/ܰۖۧ;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ܰۖۧ;->֫(JJ)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 0

    .line 116
    iput-object p1, p0, Ll/ۖۡۧ;->֫:Ll/᩸᩷ۧ;

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 4

    .line 102
    check-cast p1, Ll/ܺ᩷ۧ;

    invoke-direct {p0, p1}, Ll/ۖۡۧ;->֫(Ll/ܺ᩷ۧ;)I

    move-result v0

    const v1, 0xffd8

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    invoke-direct {p0, p1}, Ll/ۖۡۧ;->֫(Ll/ܺ᩷ۧ;)I

    move-result v0

    iput v0, p0, Ll/ۖۡۧ;->ܽ:I

    const v1, 0xffe0

    if-ne v0, v1, :cond_1

    .line 183
    iget-object v0, p0, Ll/ۖۡۧ;->ۜ:Ll/ᩳ֨֫;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 184
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    .line 157
    invoke-virtual {p1, v2, v2, v1, v3}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 185
    invoke-virtual {v0}, Ll/ᩳ֨֫;->ۗ()I

    move-result v0

    sub-int/2addr v0, v1

    .line 178
    invoke-virtual {p1, v0, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    .line 109
    invoke-direct {p0, p1}, Ll/ۖۡۧ;->֫(Ll/ܺ᩷ۧ;)I

    move-result p1

    iput p1, p0, Ll/ۖۡۧ;->ܽ:I

    .line 111
    :cond_1
    iget p1, p0, Ll/ۖۡۧ;->ܽ:I

    const v0, 0xffe1

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public final ܳ()Ljava/util/List;
    .locals 1

    .line 89
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/֨᩷ۧ;
    .locals 0

    return-object p0
.end method
