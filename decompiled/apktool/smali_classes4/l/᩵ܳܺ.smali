.class public final Ll/᩵ܳܺ;
.super Ljava/lang/Object;
.source "TBAU"


# instance fields
.field public final ֫:Ll/᩵ܿܺ;

.field public final ۧ:Ll/۬ۡܺ;

.field public final ܽ:[I


# direct methods
.method public constructor <init>(Ll/۬ۡܺ;[ILl/᩵ܿܺ;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    .line 77
    iput-object p1, p0, Ll/᩵ܳܺ;->ۧ:Ll/۬ۡܺ;

    .line 78
    iput-object p2, p0, Ll/᩵ܳܺ;->ܽ:[I

    .line 79
    iput-object p3, p0, Ll/᩵ܳܺ;->֫:Ll/᩵ܿܺ;

    return-void

    .line 74
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "addresses == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "order == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/۠ܿܺ;
    .locals 17

    move-object/from16 v0, p0

    .line 141
    iget-object v1, v0, Ll/᩵ܳܺ;->ܽ:[I

    array-length v2, v1

    .line 142
    iget-object v3, v0, Ll/᩵ܳܺ;->ۧ:Ll/۬ۡܺ;

    invoke-virtual {v3}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object v3

    .line 143
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    sget-object v5, Ll/ۚܿܺ;->᩶:Ll/ۚܿܺ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v7, v6

    const/4 v8, 0x0

    .line 149
    :goto_0
    iget-object v9, v0, Ll/᩵ܳܺ;->֫:Ll/᩵ܿܺ;

    if-ge v8, v2, :cond_c

    .line 150
    aget v10, v1, v8

    invoke-virtual {v3, v10}, Ll/ܿۡܺ;->ܿ(I)Ll/ܽۡܺ;

    move-result-object v10

    .line 152
    invoke-virtual {v10}, Ll/ܽۡܺ;->ۧ()Z

    move-result v11

    if-nez v11, :cond_0

    move-object/from16 v16, v1

    goto/16 :goto_7

    .line 235
    :cond_0
    invoke-virtual {v10}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v11

    .line 236
    invoke-virtual {v11}, Ll/᩷ᩴܺ;->size()I

    move-result v12

    .line 237
    invoke-virtual {v10}, Ll/ܽۡܺ;->ܳ()I

    move-result v13

    .line 238
    invoke-virtual {v10}, Ll/ܽۡܺ;->ܿ()Ll/ܺۡܺ;

    move-result-object v14

    invoke-virtual {v14}, Ll/ܺۡܺ;->ܽ()Ll/ۧۖܺ;

    move-result-object v14

    .line 239
    invoke-interface {v14}, Ll/ۧۖܺ;->size()I

    move-result v15

    if-nez v15, :cond_1

    .line 242
    sget-object v11, Ll/ۚܿܺ;->᩶:Ll/ۚܿܺ;

    move-object/from16 v16, v1

    goto :goto_5

    :cond_1
    const/4 v0, -0x1

    if-ne v13, v0, :cond_2

    if-ne v12, v15, :cond_3

    :cond_2
    if-eq v13, v0, :cond_4

    add-int/lit8 v0, v15, 0x1

    if-ne v12, v0, :cond_3

    .line 248
    invoke-virtual {v11, v15}, Ll/᩷ᩴܺ;->get(I)I

    move-result v0

    if-ne v13, v0, :cond_3

    goto :goto_1

    .line 254
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "shouldn\'t happen: weird successors list"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-ge v0, v15, :cond_6

    .line 263
    invoke-interface {v14, v0}, Ll/ۧۖܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object v12

    .line 264
    sget-object v13, Ll/۟ܺܺ;->ܶ֫:Ll/۟ܺܺ;

    invoke-virtual {v12, v13}, Ll/۟ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    add-int/lit8 v15, v0, 0x1

    goto :goto_3

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 270
    :cond_6
    :goto_3
    new-instance v0, Ll/ۚܿܺ;

    .line 39
    invoke-direct {v0, v15}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v12, 0x0

    :goto_4
    if-ge v12, v15, :cond_7

    .line 273
    new-instance v13, Ll/۫ܺܺ;

    move-object/from16 v16, v1

    invoke-interface {v14, v12}, Ll/ۧۖܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object v1

    invoke-direct {v13, v1}, Ll/۫ܺܺ;-><init>(Ll/۟ܺܺ;)V

    .line 274
    invoke-virtual {v11, v12}, Ll/᩷ᩴܺ;->get(I)I

    move-result v1

    invoke-virtual {v9, v1}, Ll/᩵ܿܺ;->֫(I)Ll/ܶܿܺ;

    move-result-object v1

    .line 275
    invoke-virtual {v1}, Ll/ۙܿܺ;->ܿ()I

    move-result v1

    invoke-virtual {v0, v12, v13, v1}, Ll/ۚܿܺ;->֫(ILl/۫ܺܺ;I)V

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, v16

    goto :goto_4

    :cond_7
    move-object/from16 v16, v1

    .line 278
    invoke-virtual {v0}, Ll/ᩴᩴܺ;->ܺ()V

    move-object v11, v0

    .line 163
    :goto_5
    invoke-virtual {v5}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-nez v0, :cond_8

    goto :goto_6

    .line 171
    :cond_8
    invoke-virtual {v5, v11}, Ll/ܿᩴܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    if-eqz v6, :cond_9

    .line 328
    invoke-virtual {v9, v6}, Ll/᩵ܿܺ;->ۧ(Ll/ܽۡܺ;)Ll/ܶܿܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۙܿܺ;->ܿ()I

    move-result v0

    .line 329
    invoke-virtual {v9, v10}, Ll/᩵ܿܺ;->֫(Ll/ܽۡܺ;)Ll/ܶܿܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۙܿܺ;->ܿ()I

    move-result v1

    sub-int/2addr v1, v0

    const v0, 0xffff

    if-gt v1, v0, :cond_a

    move-object v7, v10

    goto :goto_7

    .line 320
    :cond_9
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "start == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 188
    :cond_a
    invoke-virtual {v5}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-eqz v0, :cond_b

    .line 298
    invoke-virtual {v9, v6}, Ll/᩵ܿܺ;->ۧ(Ll/ܽۡܺ;)Ll/ܶܿܺ;

    move-result-object v0

    .line 301
    invoke-virtual {v9, v7}, Ll/᩵ܿܺ;->֫(Ll/ܽۡܺ;)Ll/ܶܿܺ;

    move-result-object v1

    .line 303
    new-instance v6, Ll/֨ܿܺ;

    invoke-virtual {v0}, Ll/ۙܿܺ;->ܿ()I

    move-result v0

    .line 304
    invoke-virtual {v1}, Ll/ۙܿܺ;->ܿ()I

    move-result v1

    invoke-direct {v6, v0, v1, v5}, Ll/֨ܿܺ;-><init>(IILl/ۚܿܺ;)V

    .line 192
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_6
    move-object v6, v10

    move-object v7, v6

    move-object v5, v11

    :goto_7
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    goto/16 :goto_0

    .line 200
    :cond_c
    invoke-virtual {v5}, Ll/ܿᩴܺ;->size()I

    move-result v0

    if-eqz v0, :cond_d

    .line 298
    invoke-virtual {v9, v6}, Ll/᩵ܿܺ;->ۧ(Ll/ܽۡܺ;)Ll/ܶܿܺ;

    move-result-object v0

    .line 301
    invoke-virtual {v9, v7}, Ll/᩵ܿܺ;->֫(Ll/ܽۡܺ;)Ll/ܶܿܺ;

    move-result-object v1

    .line 303
    new-instance v2, Ll/֨ܿܺ;

    invoke-virtual {v0}, Ll/ۙܿܺ;->ܿ()I

    move-result v0

    .line 304
    invoke-virtual {v1}, Ll/ۙܿܺ;->ܿ()I

    move-result v1

    invoke-direct {v2, v0, v1, v5}, Ll/֨ܿܺ;-><init>(IILl/ۚܿܺ;)V

    .line 205
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_e

    .line 213
    sget-object v0, Ll/۠ܿܺ;->᩶:Ll/۠ܿܺ;

    return-object v0

    .line 216
    :cond_e
    new-instance v1, Ll/۠ܿܺ;

    .line 39
    invoke-direct {v1, v0}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v2, 0x0

    :goto_8
    if-ge v2, v0, :cond_f

    .line 219
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ܿܺ;

    invoke-virtual {v1, v2, v3}, Ll/ܿᩴܺ;->֫(ILl/֨ܿܺ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    .line 222
    :cond_f
    invoke-virtual {v1}, Ll/ᩴᩴܺ;->ܺ()V

    return-object v1
.end method

.method public final ۧ()Ljava/util/HashSet;
    .locals 8

    .line 114
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 115
    iget-object v1, p0, Ll/᩵ܳܺ;->ۧ:Ll/۬ۡܺ;

    invoke-virtual {v1}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ll/ܿᩴܺ;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 119
    invoke-virtual {v1, v3}, Ll/ܿᩴܺ;->get(I)Ll/ܽۡܺ;

    move-result-object v4

    .line 120
    invoke-virtual {v4}, Ll/ܽۡܺ;->ܿ()Ll/ܺۡܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܺۡܺ;->ܽ()Ll/ۧۖܺ;

    move-result-object v4

    .line 121
    invoke-interface {v4}, Ll/ۧۖܺ;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_0

    .line 124
    invoke-interface {v4, v6}, Ll/ۧۖܺ;->getType(I)Ll/۟ܺܺ;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ܽ()Z
    .locals 5

    .line 95
    iget-object v0, p0, Ll/᩵ܳܺ;->ۧ:Ll/۬ۡܺ;

    invoke-virtual {v0}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 99
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/ܽۡܺ;

    move-result-object v4

    .line 100
    invoke-virtual {v4}, Ll/ܽۡܺ;->ܿ()Ll/ܺۡܺ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܺۡܺ;->ܽ()Ll/ۧۖܺ;

    move-result-object v4

    .line 101
    invoke-interface {v4}, Ll/ۧۖܺ;->size()I

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method
