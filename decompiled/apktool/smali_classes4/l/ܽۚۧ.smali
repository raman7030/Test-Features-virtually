.class public final Ll/ܽۚۧ;
.super Ljava/lang/Object;
.source "W8S5"

# interfaces
.implements Ll/֨᩷ۧ;


# instance fields
.field public final ֫:Ll/֫ۚۧ;

.field public ۜ:Ll/۟֡ۧ;

.field public final ۡ:Ll/ۢ֨֫;

.field public final ۢ:Landroid/util/SparseArray;

.field public ۧ:Z

.field public ܳ:J

.field public ܽ:Z

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩷:Ll/ᩳ֨֫;

.field public ᩻:Ll/᩸᩷ۧ;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 80
    new-instance v0, Ll/ۢ֨֫;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۢ֨֫;-><init>(J)V

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object v0, p0, Ll/ܽۚۧ;->ۡ:Ll/ۢ֨֫;

    .line 85
    new-instance v0, Ll/ᩳ֨֫;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Ll/ᩳ֨֫;-><init>(I)V

    iput-object v0, p0, Ll/ܽۚۧ;->᩷:Ll/ᩳ֨֫;

    .line 86
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ll/ܽۚۧ;->ۢ:Landroid/util/SparseArray;

    .line 87
    new-instance v0, Ll/֫ۚۧ;

    invoke-direct {v0}, Ll/֫ۚۧ;-><init>()V

    iput-object v0, p0, Ll/ܽۚۧ;->֫:Ll/֫ۚۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 176
    iget-object v3, v0, Ll/ܽۚۧ;->᩻:Ll/᩸᩷ۧ;

    invoke-static {v3}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 178
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getLength()J

    move-result-wide v10

    .line 179
    iget-object v3, v0, Ll/ܽۚۧ;->֫:Ll/֫ۚۧ;

    const-wide/16 v12, -0x1

    cmp-long v14, v10, v12

    if-eqz v14, :cond_0

    .line 180
    invoke-virtual {v3}, Ll/֫ۚۧ;->ܽ()Z

    move-result v4

    if-nez v4, :cond_0

    .line 181
    invoke-virtual {v3, v1, v2}, Ll/֫ۚۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result v1

    return v1

    .line 297
    :cond_0
    iget-boolean v4, v0, Ll/ܽۚۧ;->ܿ:Z

    const/4 v15, 0x1

    if-nez v4, :cond_2

    .line 298
    iput-boolean v15, v0, Ll/ܽۚۧ;->ܿ:Z

    .line 299
    invoke-virtual {v3}, Ll/֫ۚۧ;->֫()J

    move-result-wide v4

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v8, v4, v6

    if-eqz v8, :cond_1

    .line 300
    new-instance v8, Ll/۟֡ۧ;

    .line 302
    invoke-virtual {v3}, Ll/֫ۚۧ;->ۧ()Ll/ۢ֨֫;

    move-result-object v5

    .line 303
    invoke-virtual {v3}, Ll/֫ۚۧ;->֫()J

    move-result-wide v6

    move-object v4, v8

    move-object v3, v8

    move-wide v8, v10

    invoke-direct/range {v4 .. v9}, Ll/۟֡ۧ;-><init>(Ll/ۢ֨֫;JJ)V

    iput-object v3, v0, Ll/ܽۚۧ;->ۜ:Ll/۟֡ۧ;

    .line 305
    iget-object v4, v0, Ll/ܽۚۧ;->᩻:Ll/᩸᩷ۧ;

    invoke-virtual {v3}, Ll/᩻᩷ۧ;->֫()Ll/֫᩷ۧ;

    move-result-object v3

    invoke-interface {v4, v3}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    goto :goto_0

    .line 307
    :cond_1
    iget-object v4, v0, Ll/ܽۚۧ;->᩻:Ll/᩸᩷ۧ;

    new-instance v5, Ll/᩷ۢۧ;

    invoke-virtual {v3}, Ll/֫ۚۧ;->֫()J

    move-result-wide v6

    invoke-direct {v5, v6, v7}, Ll/᩷ۢۧ;-><init>(J)V

    invoke-interface {v4, v5}, Ll/᩸᩷ۧ;->֫(Ll/ۢۢۧ;)V

    .line 184
    :cond_2
    :goto_0
    iget-object v3, v0, Ll/ܽۚۧ;->ۜ:Ll/۟֡ۧ;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ll/᩻᩷ۧ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 185
    iget-object v3, v0, Ll/ܽۚۧ;->ۜ:Ll/۟֡ۧ;

    invoke-virtual {v3, v1, v2}, Ll/᩻᩷ۧ;->֫(Ll/۠᩷ۧ;Ll/᩻ۢۧ;)I

    move-result v1

    return v1

    .line 188
    :cond_3
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ۧ()V

    if-eqz v14, :cond_4

    .line 190
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->ܽ()J

    move-result-wide v2

    sub-long/2addr v10, v2

    goto :goto_1

    :cond_4
    move-wide v10, v12

    :goto_1
    cmp-long v2, v10, v12

    if-eqz v2, :cond_5

    const-wide/16 v2, 0x4

    cmp-long v4, v10, v2

    if-gez v4, :cond_5

    goto :goto_2

    .line 195
    :cond_5
    iget-object v2, v0, Ll/ܽۚۧ;->᩷:Ll/ᩳ֨֫;

    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-interface {v1, v15, v5, v4, v3}, Ll/۠᩷ۧ;->ۧ(ZII[B)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_2

    .line 199
    :cond_6
    invoke-virtual {v2, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 200
    invoke-virtual {v2}, Ll/ᩳ֨֫;->᩻()I

    move-result v3

    const/16 v4, 0x1b9

    if-ne v3, v4, :cond_7

    :goto_2
    const/4 v1, -0x1

    return v1

    :cond_7
    const/16 v4, 0x1ba

    if-ne v3, v4, :cond_8

    .line 205
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    const/16 v4, 0xa

    invoke-interface {v1, v5, v4, v3}, Ll/۠᩷ۧ;->֫(II[B)V

    const/16 v3, 0x9

    .line 208
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 211
    invoke-virtual {v2}, Ll/ᩳ֨֫;->֨()I

    move-result v2

    and-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, 0xe

    .line 214
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    return v5

    :cond_8
    const/16 v4, 0x1bb

    const/4 v6, 0x2

    const/4 v7, 0x6

    if-ne v3, v4, :cond_9

    .line 218
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-interface {v1, v5, v6, v3}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 221
    invoke-virtual {v2, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 222
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۗ()I

    move-result v2

    add-int/2addr v2, v7

    .line 223
    invoke-interface {v1, v2}, Ll/۠᩷ۧ;->ܽ(I)V

    return v5

    :cond_9
    and-int/lit16 v4, v3, -0x100

    shr-int/lit8 v4, v4, 0x8

    if-eq v4, v15, :cond_a

    .line 226
    invoke-interface {v1, v15}, Ll/۠᩷ۧ;->ܽ(I)V

    return v5

    :cond_a
    and-int/lit16 v4, v3, 0xff

    .line 235
    iget-object v8, v0, Ll/ܽۚۧ;->ۢ:Landroid/util/SparseArray;

    invoke-virtual {v8, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۧۚۧ;

    .line 236
    iget-boolean v10, v0, Ll/ܽۚۧ;->ۧ:Z

    if-nez v10, :cond_10

    if-nez v9, :cond_e

    const/16 v10, 0xbd

    const-string v11, "video/mp2p"

    if-ne v4, v10, :cond_b

    .line 243
    new-instance v3, Ll/ᩳ֡ۧ;

    invoke-direct {v3, v11}, Ll/ᩳ֡ۧ;-><init>(Ljava/lang/String;)V

    .line 244
    iput-boolean v15, v0, Ll/ܽۚۧ;->ܽ:Z

    .line 245
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    iput-wide v10, v0, Ll/ܽۚۧ;->ܳ:J

    goto :goto_3

    :cond_b
    and-int/lit16 v10, v3, 0xe0

    const/16 v12, 0xc0

    const/4 v13, 0x0

    if-ne v10, v12, :cond_c

    .line 247
    new-instance v3, Ll/ۙ֡ۧ;

    .line 68
    invoke-direct {v3, v13, v5, v11}, Ll/ۙ֡ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 248
    iput-boolean v15, v0, Ll/ܽۚۧ;->ܽ:Z

    .line 249
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    iput-wide v10, v0, Ll/ܽۚۧ;->ܳ:J

    goto :goto_3

    :cond_c
    and-int/lit16 v3, v3, 0xf0

    const/16 v10, 0xe0

    if-ne v3, v10, :cond_d

    .line 251
    new-instance v3, Ll/ۘ֡ۧ;

    .line 79
    invoke-direct {v3, v13, v11}, Ll/ۘ֡ۧ;-><init>(Ll/֨ۚۧ;Ljava/lang/String;)V

    .line 252
    iput-boolean v15, v0, Ll/ܽۚۧ;->ᩳ:Z

    .line 253
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    iput-wide v10, v0, Ll/ܽۚۧ;->ܳ:J

    goto :goto_3

    :cond_d
    move-object v3, v13

    :goto_3
    if-eqz v3, :cond_e

    .line 256
    new-instance v9, Ll/᩵ۚۧ;

    const/16 v10, 0x100

    invoke-direct {v9, v4, v10}, Ll/᩵ۚۧ;-><init>(II)V

    .line 257
    iget-object v10, v0, Ll/ܽۚۧ;->᩻:Ll/᩸᩷ۧ;

    invoke-interface {v3, v10, v9}, Ll/ܺ֡ۧ;->֫(Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V

    .line 258
    new-instance v9, Ll/ۧۚۧ;

    iget-object v10, v0, Ll/ܽۚۧ;->ۡ:Ll/ۢ֨֫;

    invoke-direct {v9, v3, v10}, Ll/ۧۚۧ;-><init>(Ll/ܺ֡ۧ;Ll/ۢ֨֫;)V

    .line 259
    invoke-virtual {v8, v4, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 263
    :cond_e
    iget-boolean v3, v0, Ll/ܽۚۧ;->ܽ:Z

    if-eqz v3, :cond_f

    iget-boolean v3, v0, Ll/ܽۚۧ;->ᩳ:Z

    if-eqz v3, :cond_f

    .line 264
    iget-wide v3, v0, Ll/ܽۚۧ;->ܳ:J

    const-wide/16 v10, 0x2000

    add-long/2addr v3, v10

    goto :goto_4

    :cond_f
    const-wide/32 v3, 0x100000

    .line 266
    :goto_4
    invoke-interface/range {p1 .. p1}, Ll/۠᩷ۧ;->getPosition()J

    move-result-wide v10

    cmp-long v8, v10, v3

    if-lez v8, :cond_10

    .line 267
    iput-boolean v15, v0, Ll/ܽۚۧ;->ۧ:Z

    .line 268
    iget-object v3, v0, Ll/ܽۚۧ;->᩻:Ll/᩸᩷ۧ;

    invoke-interface {v3}, Ll/᩸᩷ۧ;->ܳ()V

    .line 273
    :cond_10
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v3

    invoke-interface {v1, v5, v6, v3}, Ll/۠᩷ۧ;->֫(II[B)V

    .line 274
    invoke-virtual {v2, v5}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 275
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۗ()I

    move-result v3

    add-int/2addr v3, v7

    if-nez v9, :cond_11

    .line 280
    invoke-interface {v1, v3}, Ll/۠᩷ۧ;->ܽ(I)V

    return v5

    .line 282
    :cond_11
    invoke-virtual {v2, v3}, Ll/ᩳ֨֫;->ܽ(I)V

    .line 284
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ܽ()[B

    move-result-object v4

    invoke-interface {v1, v4, v5, v3}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 285
    invoke-virtual {v2, v7}, Ll/ᩳ֨֫;->ܿ(I)V

    .line 286
    invoke-virtual {v9, v2}, Ll/ۧۚۧ;->֫(Ll/ᩳ֨֫;)V

    .line 287
    invoke-virtual {v2}, Ll/ᩳ֨֫;->ۧ()I

    move-result v1

    invoke-virtual {v2, v1}, Ll/ᩳ֨֫;->ᩳ(I)V

    return v5
.end method

.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(JJ)V
    .locals 6

    .line 146
    iget-object p1, p0, Ll/ܽۚۧ;->ۡ:Ll/ۢ֨֫;

    invoke-virtual {p1}, Ll/ۢ֨֫;->ܽ()J

    move-result-wide v0

    const/4 p2, 0x0

    const/4 v2, 0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 148
    invoke-virtual {p1}, Ll/ۢ֨֫;->֫()J

    move-result-wide v0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_1

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-eqz v5, :cond_1

    cmp-long v3, v0, p3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    move v0, v2

    :cond_2
    if-eqz v0, :cond_3

    .line 158
    invoke-virtual {p1, p3, p4}, Ll/ۢ֨֫;->ᩳ(J)V

    .line 161
    :cond_3
    iget-object p1, p0, Ll/ܽۚۧ;->ۜ:Ll/۟֡ۧ;

    if-eqz p1, :cond_4

    .line 162
    invoke-virtual {p1, p3, p4}, Ll/᩻᩷ۧ;->֫(J)V

    .line 164
    :cond_4
    :goto_2
    iget-object p1, p0, Ll/ܽۚۧ;->ۢ:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p2, p3, :cond_5

    .line 165
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧۚۧ;

    invoke-virtual {p1}, Ll/ۧۚۧ;->֫()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public final ֫(Ll/᩸᩷ۧ;)V
    .locals 0

    .line 136
    iput-object p1, p0, Ll/ܽۚۧ;->᩻:Ll/᩸᩷ۧ;

    return-void
.end method

.method public final ֫(Ll/۠᩷ۧ;)Z
    .locals 9

    const/16 v0, 0xe

    new-array v1, v0, [B

    .line 95
    check-cast p1, Ll/ܺ᩷ۧ;

    const/4 v2, 0x0

    .line 157
    invoke-virtual {p1, v2, v2, v0, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 98
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v3, 0x1

    aget-byte v4, v1, v3

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v0, v4

    const/4 v4, 0x2

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x8

    shl-int/2addr v5, v6

    or-int/2addr v0, v5

    const/4 v5, 0x3

    aget-byte v7, v1, v5

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v0, v7

    const/16 v7, 0x1ba

    if-eq v7, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    .line 106
    aget-byte v7, v1, v0

    and-int/lit16 v7, v7, 0xc4

    const/16 v8, 0x44

    if-eq v7, v8, :cond_1

    goto :goto_0

    :cond_1
    const/4 v7, 0x6

    .line 110
    aget-byte v7, v1, v7

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_2

    goto :goto_0

    .line 114
    :cond_2
    aget-byte v7, v1, v6

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_3

    goto :goto_0

    :cond_3
    const/16 v0, 0x9

    .line 118
    aget-byte v0, v1, v0

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_4

    goto :goto_0

    :cond_4
    const/16 v0, 0xc

    .line 122
    aget-byte v0, v1, v0

    and-int/2addr v0, v5

    if-eq v0, v5, :cond_5

    goto :goto_0

    :cond_5
    const/16 v0, 0xd

    .line 126
    aget-byte v0, v1, v0

    and-int/lit8 v0, v0, 0x7

    .line 178
    invoke-virtual {p1, v0, v2}, Ll/ܺ᩷ۧ;->ۧ(IZ)Z

    .line 157
    invoke-virtual {p1, v2, v2, v5, v1}, Ll/ܺ᩷ۧ;->ۧ(ZII[B)Z

    .line 130
    aget-byte p1, v1, v2

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x10

    aget-byte v0, v1, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v6

    or-int/2addr p1, v0

    aget-byte v0, v1, v4

    and-int/lit16 v0, v0, 0xff

    or-int/2addr p1, v0

    if-ne v3, p1, :cond_6

    return v3

    :cond_6
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
