.class public final Ll/ܺᩴܽ;
.super Ljava/lang/Object;
.source "R6PB"


# instance fields
.field public final ֫:Ljava/util/IdentityHashMap;

.field public final ۜ:Ljava/util/ArrayList;

.field public final ۢ:I

.field public final ۧ:Z

.field public ܳ:Z

.field public ܽ:[I

.field public ܿ:Z

.field public ᩳ:[I

.field public final ᩷:[Z

.field public final ᩻:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(IZ)V
    .locals 1

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺᩴܽ;->᩻:Ljava/util/ArrayList;

    .line 143
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺᩴܽ;->ۜ:Ljava/util/ArrayList;

    .line 144
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ܺᩴܽ;->֫:Ljava/util/IdentityHashMap;

    const/16 v0, 0x80

    new-array v0, v0, [I

    .line 148
    iput-object v0, p0, Ll/ܺᩴܽ;->ᩳ:[I

    .line 154
    iput p1, p0, Ll/ܺᩴܽ;->ۢ:I

    .line 155
    iput-boolean p2, p0, Ll/ܺᩴܽ;->ۧ:Z

    .line 156
    new-array p1, p1, [Z

    iput-object p1, p0, Ll/ܺᩴܽ;->᩷:[Z

    return-void
.end method

.method private ֫(Ljava/lang/Object;)I
    .locals 2

    .line 643
    iget-object v0, p0, Ll/ܺᩴܽ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 644
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return v1
.end method

.method private ֫(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 636
    iget v0, p0, Ll/ܺᩴܽ;->ۢ:I

    if-ge p1, v0, :cond_0

    return-void

    .line 637
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Regex program encountered an invalid local register"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(IILl/ۖ֨ܽ;I)V
    .locals 1

    .line 380
    iget-object v0, p3, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {p0, p1, p2, v0}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 381
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, p1, 0x2

    iget-object p3, p3, Ll/ۖ֨ܽ;->ۧ:[I

    invoke-virtual {p3}, [I->clone()Ljava/lang/Object;

    move-result-object p3

    invoke-direct {p0, p3}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result p3

    aput p3, p2, v0

    .line 382
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 p1, p1, 0x3

    aput p4, p2, p1

    return-void
.end method

.method private ֫(IILl/ۛۚܽ;)V
    .locals 1

    .line 650
    invoke-virtual {p0, p3}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result p3

    .line 651
    iget-object v0, p0, Ll/ܺᩴܽ;->ᩳ:[I

    aput p2, v0, p1

    add-int/lit8 p1, p1, 0x1

    .line 652
    aput p3, v0, p1

    return-void
.end method

.method private ֫(IILl/ۜۚܽ;)V
    .locals 2

    .line 391
    iget-object v0, p3, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {p0, p1, p2, v0}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 392
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, p1, 0x2

    iget-object v1, p3, Ll/ۜۚܽ;->ܽ:Ll/ۧۚܽ;

    invoke-direct {p0, v1}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v1

    aput v1, p2, v0

    .line 393
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 p1, p1, 0x3

    iget p3, p3, Ll/ۜۚܽ;->ۧ:I

    aput p3, p2, p1

    return-void
.end method

.method private ֫(IILl/۬ۚܽ;)V
    .locals 3

    .line 397
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/۬ۚܽ;

    if-eq v0, v1, :cond_0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ll/᩸ۚܽ;

    if-ne v0, v2, :cond_4

    :cond_0
    iget v0, p3, Ll/۬ۚܽ;->᩻:I

    const/4 v2, -0x1

    if-lt v0, v2, :cond_4

    .line 401
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, v1, :cond_2

    iget v0, p3, Ll/۬ۚܽ;->᩻:I

    if-ltz v0, :cond_2

    const/16 v0, 0x9

    if-ne p2, v0, :cond_1

    const/16 p2, 0x12

    goto :goto_0

    :cond_1
    const/16 p2, 0x13

    .line 402
    :cond_2
    :goto_0
    iget-object v0, p3, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {p0, p1, p2, v0}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 403
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, p1, 0x2

    iget v1, p3, Ll/۬ۚܽ;->ܳ:I

    invoke-direct {p0, v1}, Ll/ܺᩴܽ;->֫(I)V

    aput v1, p2, v0

    .line 404
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, p1, 0x3

    iget v1, p3, Ll/۬ۚܽ;->ۧ:I

    invoke-direct {p0, v1}, Ll/ܺᩴܽ;->֫(I)V

    aput v1, p2, v0

    .line 405
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, p1, 0x4

    iget v1, p3, Ll/۬ۚܽ;->ܿ:I

    aput v1, p2, v0

    add-int/lit8 v0, p1, 0x5

    .line 406
    iget v1, p3, Ll/۬ۚܽ;->ᩳ:I

    aput v1, p2, v0

    .line 407
    iget-object p2, p3, Ll/۬ۚܽ;->ܽ:Ll/ۛۚܽ;

    invoke-virtual {p0, p2}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result p2

    .line 408
    iget-object v0, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, p1, 0x6

    aput p2, v0, v1

    .line 409
    iget p2, p3, Ll/۬ۚܽ;->᩻:I

    if-ltz p2, :cond_3

    add-int/lit8 p1, p1, 0x7

    aput p2, v0, p1

    :cond_3
    return-void

    .line 399
    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Regex program does not support this loop kind"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(ILl/ۛۚܽ;IZ)V
    .locals 1

    const/16 v0, 0x10

    .line 359
    iget-object p2, p2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {p0, p1, v0, p2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 360
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, p1, 0x2

    aput p3, p2, v0

    add-int/lit8 p1, p1, 0x3

    .line 361
    aput p4, p2, p1

    return-void
.end method

.method private ֫(ILl/ۛۚܽ;Ll/ۛۚܽ;IIIZ)V
    .locals 1

    const/16 v0, 0x16

    .line 367
    iget-object p2, p2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {p0, p1, v0, p2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 369
    iget-object p2, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, p1, 0x2

    aput p4, p2, v0

    .line 371
    invoke-virtual {p0, p3}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result p2

    .line 372
    iget-object p3, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 p4, p1, 0x3

    aput p2, p3, p4

    add-int/lit8 p2, p1, 0x4

    .line 373
    aput p5, p3, p2

    add-int/lit8 p2, p1, 0x5

    .line 374
    aput p6, p3, p2

    add-int/lit8 p1, p1, 0x6

    .line 375
    aput p7, p3, p1

    return-void
.end method

.method private ֫(ILl/ۛۚܽ;Ll/ۛۚܽ;Ll/ۡ۠ܽ;)V
    .locals 1

    const/16 v0, 0x19

    .line 351
    iget-object p2, p2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {p0, p1, v0, p2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 352
    invoke-virtual {p0, p3}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result p2

    .line 353
    iget-object p3, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, p1, 0x2

    invoke-direct {p0, p4}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result p4

    aput p4, p3, v0

    .line 354
    iget-object p3, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 p1, p1, 0x3

    aput p2, p3, p1

    const/4 p1, 0x1

    .line 355
    iput-boolean p1, p0, Ll/ܺᩴܽ;->ܳ:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛۚܽ;)I
    .locals 7

    if-eqz p1, :cond_3

    .line 163
    iget-object v0, p0, Ll/ܺᩴܽ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    .line 164
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 165
    :cond_0
    iget-object v1, p0, Ll/ܺᩴܽ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const v3, 0xffffffe

    if-ge v2, v3, :cond_2

    .line 168
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    mul-int/lit8 v2, v2, 0x8

    .line 169
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p1, v2, 0x8

    .line 172
    iget-object v0, p0, Ll/ܺᩴܽ;->ᩳ:[I

    array-length v1, v0

    if-le p1, v1, :cond_1

    int-to-long v3, p1

    .line 173
    array-length p1, v0

    int-to-long v0, p1

    const-wide/16 v5, 0x2

    mul-long v0, v0, v5

    .line 174
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/32 v3, 0x7ffffff7

    .line 173
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p1, v0

    .line 175
    iget-object v0, p0, Ll/ܺᩴܽ;->ᩳ:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Ll/ܺᩴܽ;->ᩳ:[I

    .line 177
    :cond_1
    iget-object p1, p0, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v0, v2, 0x1

    const/4 v1, -0x1

    aput v1, p1, v0

    return v2

    .line 166
    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Regex program is too large"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 161
    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Regex program encountered a missing node"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۛۚܽ;I)V
    .locals 17

    move-object/from16 v8, p0

    move-object/from16 v2, p1

    move/from16 v1, p2

    .line 183
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 184
    const-class v3, Ll/ܶۚܽ;

    const/4 v4, 0x0

    if-ne v0, v3, :cond_0

    .line 185
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    aput v4, v0, v1

    return-void

    .line 186
    :cond_0
    sget-object v3, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    if-ne v2, v3, :cond_1

    .line 188
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    const/16 v2, 0x17

    aput v2, v0, v1

    return-void

    .line 189
    :cond_1
    const-class v3, Ll/᩶ۚܽ;

    if-ne v0, v3, :cond_2

    .line 190
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    const/16 v2, 0x18

    aput v2, v0, v1

    return-void

    .line 191
    :cond_2
    const-class v3, Ll/ܰۚܽ;

    if-ne v0, v3, :cond_3

    .line 192
    move-object v0, v2

    check-cast v0, Ll/ܰۚܽ;

    iget-object v3, v0, Ll/ܰۚܽ;->ۧ:Ll/ۛۚܽ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v7}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;Ll/ۛۚܽ;IIIZ)V

    return-void

    .line 193
    :cond_3
    const-class v3, Ll/ۤۚܽ;

    if-ne v0, v3, :cond_4

    .line 194
    move-object v0, v2

    check-cast v0, Ll/ۤۚܽ;

    iget-object v3, v0, Ll/ۤۚܽ;->ۧ:Ll/ۛۚܽ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v7}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;Ll/ۛۚܽ;IIIZ)V

    return-void

    .line 195
    :cond_4
    const-class v3, Ll/᩺ۚܽ;

    const-class v5, Ll/֨֡ܽ;

    const-class v6, Ll/۠֡ܽ;

    const/4 v7, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x2

    if-eq v0, v5, :cond_3c

    if-eq v0, v6, :cond_3c

    const-class v11, Ll/ۨۚܽ;

    if-eq v0, v11, :cond_3c

    if-ne v0, v3, :cond_5

    goto/16 :goto_5

    .line 202
    :cond_5
    const-class v3, Ll/ۧ֨ܽ;

    if-ne v0, v3, :cond_6

    move-object v5, v2

    check-cast v5, Ll/ۧ֨ܽ;

    iget-object v6, v5, Ll/ۧ֨ܽ;->ܽ:Ll/֫֨ܽ;

    sget-object v11, Ll/֫֨ܽ;->᩶:Ll/֫֨ܽ;

    if-ne v6, v11, :cond_6

    .line 203
    iget-object v3, v5, Ll/ۧ֨ܽ;->ۧ:Ll/ۛۚܽ;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v7}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;Ll/ۛۚܽ;IIIZ)V

    return-void

    :cond_6
    if-ne v0, v3, :cond_7

    .line 205
    move-object v0, v2

    check-cast v0, Ll/ۧ֨ܽ;

    .line 206
    iget-object v3, v0, Ll/ۧ֨ܽ;->ۧ:Ll/ۛۚܽ;

    new-instance v4, Ll/ۡ۠ܽ;

    iget-object v10, v0, Ll/ۧ֨ܽ;->ܽ:Ll/֫֨ܽ;

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, -0x1

    const/4 v14, 0x0

    move-object v9, v4

    invoke-direct/range {v9 .. v16}, Ll/ۡ۠ܽ;-><init>(Ll/֫֨ܽ;IIIIZZ)V

    invoke-direct {v8, v1, v2, v3, v4}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;Ll/ۛۚܽ;Ll/ۡ۠ܽ;)V

    return-void

    .line 207
    :cond_7
    const-class v3, Ll/᩷ۚܽ;

    if-ne v0, v3, :cond_8

    .line 208
    move-object v0, v2

    check-cast v0, Ll/᩷ۚܽ;

    .line 209
    iget-object v3, v0, Ll/᩷ۚܽ;->ۧ:Ll/ۛۚܽ;

    new-instance v4, Ll/ۡ۠ܽ;

    iget-object v10, v0, Ll/᩷ۚܽ;->ܿ:Ll/֫֨ܽ;

    iget v11, v0, Ll/᩷ۚܽ;->ᩳ:I

    iget v12, v0, Ll/᩷ۚܽ;->ܽ:I

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v13, -0x1

    const/4 v14, 0x0

    move-object v9, v4

    invoke-direct/range {v9 .. v16}, Ll/ۡ۠ܽ;-><init>(Ll/֫֨ܽ;IIIIZZ)V

    invoke-direct {v8, v1, v2, v3, v4}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;Ll/ۛۚܽ;Ll/ۡ۠ܽ;)V

    return-void

    .line 211
    :cond_8
    const-class v3, Ll/֡ۚܽ;

    if-ne v0, v3, :cond_9

    .line 212
    move-object v0, v2

    check-cast v0, Ll/֡ۚܽ;

    .line 213
    iget v3, v0, Ll/֡ۚܽ;->᩻:I

    invoke-direct {v8, v3}, Ll/ܺᩴܽ;->֫(I)V

    iget-object v4, v8, Ll/ܺᩴܽ;->᩷:[Z

    aput-boolean v9, v4, v3

    .line 214
    iget-object v3, v0, Ll/֡ۚܽ;->ۧ:Ll/ۛۚܽ;

    new-instance v4, Ll/ۡ۠ܽ;

    iget-object v10, v0, Ll/֡ۚܽ;->ۜ:Ll/֫֨ܽ;

    iget v11, v0, Ll/֡ۚܽ;->ܿ:I

    iget v12, v0, Ll/֡ۚܽ;->ᩳ:I

    iget v13, v0, Ll/֡ۚܽ;->᩻:I

    iget v14, v0, Ll/֡ۚܽ;->ܳ:I

    const/4 v15, 0x0

    iget-boolean v0, v0, Ll/֡ۚܽ;->ܽ:Z

    move-object v9, v4

    move/from16 v16, v0

    invoke-direct/range {v9 .. v16}, Ll/ۡ۠ܽ;-><init>(Ll/֫֨ܽ;IIIIZZ)V

    invoke-direct {v8, v1, v2, v3, v4}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;Ll/ۛۚܽ;Ll/ۡ۠ܽ;)V

    return-void

    .line 216
    :cond_9
    const-class v3, Ll/֡֡ܽ;

    const/16 v5, 0x22

    if-ne v0, v3, :cond_a

    .line 217
    iget-object v0, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v5, v0}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 218
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v3, v1, 0x2

    check-cast v2, Ll/֡֡ܽ;

    iget v2, v2, Ll/֡֡ܽ;->ۧ:I

    aput v2, v0, v3

    add-int/lit8 v1, v1, 0x3

    .line 219
    aput v4, v0, v1

    return-void

    .line 220
    :cond_a
    const-class v3, Ll/ܰ֡ܽ;

    if-ne v0, v3, :cond_c

    .line 221
    move-object v0, v2

    check-cast v0, Ll/ܰ֡ܽ;

    .line 222
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v5, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 223
    iget-object v2, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v3, v1, 0x2

    iget v4, v0, Ll/ܰ֡ܽ;->ܽ:I

    aput v4, v2, v3

    add-int/lit8 v1, v1, 0x3

    .line 224
    iget-boolean v0, v0, Ll/ܰ֡ܽ;->ۧ:Z

    if-eqz v0, :cond_b

    const/4 v9, 0x2

    :cond_b
    aput v9, v2, v1

    return-void

    .line 225
    :cond_c
    const-class v3, Ll/᩹ۚܽ;

    if-ne v0, v3, :cond_d

    const/16 v0, 0x23

    .line 226
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v0, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    return-void

    .line 227
    :cond_d
    const-class v3, Ll/ܿ۠ܽ;

    if-ne v0, v3, :cond_e

    const/16 v0, 0x24

    .line 228
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v0, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    return-void

    .line 229
    :cond_e
    const-class v3, Ll/᩵ۚܽ;

    if-ne v0, v3, :cond_f

    const/16 v0, 0x25

    .line 230
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v0, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    return-void

    .line 231
    :cond_f
    const-class v3, Ll/ᩳ۠ܽ;

    if-ne v0, v3, :cond_10

    const/16 v0, 0x27

    .line 232
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v0, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    return-void

    .line 233
    :cond_10
    const-class v3, Ll/ۛ֡ܽ;

    iget-boolean v5, v8, Ll/ܺᩴܽ;->ۧ:Z

    if-ne v0, v3, :cond_13

    .line 234
    move-object v0, v2

    check-cast v0, Ll/ۛ֡ܽ;

    if-eqz v5, :cond_11

    const/4 v3, 0x0

    goto :goto_0

    .line 235
    :cond_11
    invoke-static {v0}, Ll/۬᩵ܽ;->֫(Ll/ۛ֡ܽ;)Ll/۬᩵ܽ;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_12

    .line 237
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    const/16 v2, 0x11

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x2

    .line 238
    invoke-direct {v8, v3}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v2

    aput v2, v0, v1

    return-void

    :cond_12
    const/16 v3, 0xf

    .line 240
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v3, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 241
    iget-object v2, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x2

    new-instance v3, Ll/ۗ᩵ܽ;

    iget v4, v0, Ll/ۛ֡ܽ;->ۧ:I

    iget-boolean v0, v0, Ll/ۛ֡ܽ;->ܽ:Z

    invoke-direct {v3, v4, v0}, Ll/ۗ᩵ܽ;-><init>(IZ)V

    invoke-direct {v8, v3}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v0

    aput v0, v2, v1

    return-void

    .line 243
    :cond_13
    const-class v3, Ll/ۚ֡ܽ;

    if-ne v0, v3, :cond_14

    .line 244
    invoke-direct {v8, v1, v2, v4, v4}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;IZ)V

    .line 245
    iput-boolean v9, v8, Ll/ܺᩴܽ;->ܿ:Z

    return-void

    .line 246
    :cond_14
    const-class v3, Ll/ۖۚܽ;

    if-ne v0, v3, :cond_15

    .line 247
    invoke-direct {v8, v1, v2, v9, v4}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;IZ)V

    return-void

    .line 248
    :cond_15
    const-class v3, Ll/۟֡ܽ;

    if-ne v0, v3, :cond_16

    .line 249
    invoke-direct {v8, v1, v2, v10, v4}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;IZ)V

    return-void

    .line 250
    :cond_16
    const-class v3, Ll/۟֨ܽ;

    if-ne v0, v3, :cond_17

    .line 251
    invoke-direct {v8, v1, v2, v7, v4}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;IZ)V

    return-void

    .line 252
    :cond_17
    const-class v3, Ll/ۢۚܽ;

    const/4 v6, 0x4

    if-ne v0, v3, :cond_18

    .line 253
    move-object v0, v2

    check-cast v0, Ll/ۢۚܽ;

    iget-boolean v0, v0, Ll/ۢۚܽ;->ۧ:Z

    invoke-direct {v8, v1, v2, v6, v0}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;IZ)V

    return-void

    .line 254
    :cond_18
    const-class v3, Ll/֫۠ܽ;

    const/4 v11, 0x5

    if-ne v0, v3, :cond_19

    .line 255
    move-object v0, v2

    check-cast v0, Ll/֫۠ܽ;

    iget-boolean v0, v0, Ll/֫۠ܽ;->ۧ:Z

    invoke-direct {v8, v1, v2, v11, v0}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;IZ)V

    return-void

    .line 256
    :cond_19
    const-class v3, Ll/۠ۚܽ;

    const/4 v12, 0x6

    if-ne v0, v3, :cond_1a

    .line 257
    invoke-direct {v8, v1, v2, v12, v4}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;IZ)V

    return-void

    .line 258
    :cond_1a
    const-class v3, Ll/ۗۚܽ;

    if-ne v0, v3, :cond_1b

    const/16 v0, 0x2a

    .line 259
    iget-object v3, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v0, v3}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 260
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x2

    invoke-static/range {p1 .. p1}, Ll/ܳ۠ܽ;->֫(Ll/ۛۚܽ;)Ll/᩻֨ܽ;

    move-result-object v2

    invoke-direct {v8, v2}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v2

    aput v2, v0, v1

    return-void

    .line 261
    :cond_1b
    const-class v3, Ll/᩶֡ܽ;

    if-ne v0, v3, :cond_1c

    .line 262
    move-object v0, v2

    check-cast v0, Ll/᩻ۚܽ;

    .line 386
    iget-object v2, v0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v9, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 387
    iget-object v2, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x2

    iget-object v0, v0, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-direct {v8, v0}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v0

    aput v0, v2, v1

    return-void

    .line 263
    :cond_1c
    const-class v3, Ll/۫ۚܽ;

    if-ne v0, v3, :cond_1d

    const/16 v0, 0x26

    .line 264
    iget-object v3, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v0, v3}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 265
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x2

    invoke-static/range {p1 .. p1}, Ll/ܳ۠ܽ;->ۧ(Ll/ۛۚܽ;)Ll/ۧۚܽ;

    move-result-object v2

    invoke-direct {v8, v2}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v2

    aput v2, v0, v1

    return-void

    .line 266
    :cond_1d
    const-class v3, Ll/᩻ۚܽ;

    if-eq v0, v3, :cond_3b

    const-class v3, Ll/ۡۚܽ;

    if-eq v0, v3, :cond_3b

    const-class v3, Ll/ۧ۠ܽ;

    if-eq v0, v3, :cond_3b

    const-class v3, Ll/ۖ֡ܽ;

    if-ne v0, v3, :cond_1e

    goto/16 :goto_4

    .line 269
    :cond_1e
    const-class v3, Ll/ۢ֨ܽ;

    if-ne v0, v3, :cond_1f

    .line 270
    move-object v0, v2

    check-cast v0, Ll/ۢ֨ܽ;

    .line 271
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v7, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 272
    iget-object v2, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x2

    iget-object v0, v0, Ll/ۖ֨ܽ;->ۧ:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {v8, v0}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v0

    aput v0, v2, v1

    return-void

    .line 273
    :cond_1f
    const-class v3, Ll/ۡ֨ܽ;

    if-ne v0, v3, :cond_20

    const/16 v0, 0x1c

    .line 274
    check-cast v2, Ll/ۖ֨ܽ;

    invoke-direct {v8, v1, v0, v2, v9}, Ll/ܺᩴܽ;->֫(IILl/ۖ֨ܽ;I)V

    return-void

    .line 275
    :cond_20
    const-class v3, Ll/ᩴ֨ܽ;

    if-ne v0, v3, :cond_21

    const/16 v0, 0x1d

    .line 276
    check-cast v2, Ll/ۖ֨ܽ;

    invoke-direct {v8, v1, v0, v2, v10}, Ll/ܺᩴܽ;->֫(IILl/ۖ֨ܽ;I)V

    return-void

    .line 277
    :cond_21
    const-class v3, Ll/ۘ֨ܽ;

    if-ne v0, v3, :cond_22

    const/16 v0, 0x1e

    .line 278
    check-cast v2, Ll/ۖ֨ܽ;

    invoke-direct {v8, v1, v0, v2, v7}, Ll/ܺᩴܽ;->֫(IILl/ۖ֨ܽ;I)V

    return-void

    .line 279
    :cond_22
    const-class v3, Ll/ܺ֨ܽ;

    if-ne v0, v3, :cond_23

    const/16 v0, 0x1f

    .line 280
    check-cast v2, Ll/ۖ֨ܽ;

    invoke-direct {v8, v1, v0, v2, v6}, Ll/ܺᩴܽ;->֫(IILl/ۖ֨ܽ;I)V

    return-void

    .line 281
    :cond_23
    const-class v3, Ll/᩵֨ܽ;

    if-ne v0, v3, :cond_24

    const/16 v0, 0x20

    .line 282
    check-cast v2, Ll/ۖ֨ܽ;

    invoke-direct {v8, v1, v0, v2, v11}, Ll/ܺᩴܽ;->֫(IILl/ۖ֨ܽ;I)V

    return-void

    .line 283
    :cond_24
    const-class v3, Ll/ۙ֡ܽ;

    if-ne v0, v3, :cond_25

    .line 284
    move-object v0, v2

    check-cast v0, Ll/ۜۚܽ;

    invoke-direct {v8, v1, v6, v0}, Ll/ܺᩴܽ;->֫(IILl/ۜۚܽ;)V

    return-void

    .line 285
    :cond_25
    const-class v3, Ll/ۜۚܽ;

    if-eq v0, v3, :cond_3a

    const-class v3, Ll/ܺۚܽ;

    if-eq v0, v3, :cond_3a

    const-class v3, Ll/ܽ۠ܽ;

    if-ne v0, v3, :cond_26

    goto/16 :goto_3

    .line 288
    :cond_26
    const-class v3, Ll/ۘ֡ܽ;

    if-ne v0, v3, :cond_27

    const/16 v0, 0x21

    .line 290
    check-cast v2, Ll/ۜۚܽ;

    invoke-direct {v8, v1, v0, v2}, Ll/ܺᩴܽ;->֫(IILl/ۜۚܽ;)V

    return-void

    .line 291
    :cond_27
    const-class v3, Ll/ۨ֡ܽ;

    if-ne v0, v3, :cond_2a

    .line 292
    move-object v0, v2

    check-cast v0, Ll/ۨ֡ܽ;

    .line 293
    iget v2, v0, Ll/ۨ֡ܽ;->ܿ:I

    new-array v3, v2, [I

    :goto_1
    if-ge v4, v2, :cond_29

    .line 295
    iget-object v5, v0, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v5, v5, v4

    if-nez v5, :cond_28

    iget-object v5, v0, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    iget-object v5, v5, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    :cond_28
    invoke-virtual {v8, v5}, Ll/ܺᩴܽ;->֫(Ll/ۛۚܽ;)I

    move-result v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 297
    :cond_29
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    aput v12, v0, v1

    add-int/lit8 v1, v1, 0x2

    .line 298
    invoke-direct {v8, v3}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v2

    aput v2, v0, v1

    return-void

    .line 299
    :cond_2a
    const-class v3, Ll/᩺֡ܽ;

    const/16 v4, 0xb

    if-ne v0, v3, :cond_2b

    .line 300
    iget-object v0, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v4, v0}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    return-void

    .line 301
    :cond_2b
    const-class v3, Ll/ۚۚܽ;

    if-eq v0, v3, :cond_37

    const-class v3, Ll/۬֡ܽ;

    if-ne v0, v3, :cond_2c

    goto/16 :goto_2

    .line 305
    :cond_2c
    const-class v3, Ll/֨ۚܽ;

    if-ne v0, v3, :cond_2e

    .line 306
    move-object v0, v2

    check-cast v0, Ll/֨ۚܽ;

    .line 307
    iget-boolean v3, v0, Ll/֨ۚܽ;->ᩳ:Z

    if-eqz v3, :cond_2d

    const/16 v4, 0x8

    :cond_2d
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v4, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 308
    iget-boolean v2, v0, Ll/֨ۚܽ;->ᩳ:Z

    if-eqz v2, :cond_39

    .line 309
    iget-object v2, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v3, v1, 0x2

    iget v4, v0, Ll/֨ۚܽ;->ܽ:I

    invoke-direct {v8, v4}, Ll/ܺᩴܽ;->֫(I)V

    aput v4, v2, v3

    .line 310
    iget-object v2, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x3

    iget v0, v0, Ll/֨ۚܽ;->ۧ:I

    aput v0, v2, v1

    return-void

    .line 312
    :cond_2e
    const-class v3, Ll/۟ۚܽ;

    const-class v4, Ll/᩸ۚܽ;

    if-ne v0, v3, :cond_34

    .line 313
    move-object v0, v2

    check-cast v0, Ll/۟ۚܽ;

    iget-object v0, v0, Ll/۟ۚܽ;->ۧ:Ll/۬ۚܽ;

    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v2, v4, :cond_2f

    const/16 v2, 0x1a

    .line 315
    invoke-direct {v8, v1, v2, v0}, Ll/ܺᩴܽ;->֫(IILl/۬ۚܽ;)V

    return-void

    :cond_2f
    const/16 v2, 0x9

    if-eqz v5, :cond_30

    .line 319
    invoke-direct {v8, v1, v2, v0}, Ll/ܺᩴܽ;->֫(IILl/۬ۚܽ;)V

    return-void

    .line 322
    :cond_30
    invoke-static {v0}, Ll/ۤ᩵ܽ;->֫(Ll/۬ۚܽ;)Ll/ۤ᩵ܽ;

    move-result-object v3

    if-eqz v3, :cond_31

    .line 324
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    const/16 v2, 0x15

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x2

    .line 325
    invoke-direct {v8, v3}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v2

    aput v2, v0, v1

    return-void

    .line 328
    :cond_31
    invoke-static {v0}, Ll/ᩳ֡ܽ;->֫(Ll/۬ۚܽ;)Ll/ᩳ֡ܽ;

    move-result-object v3

    if-nez v3, :cond_33

    .line 330
    invoke-static {v0}, Ll/ۘ۠ܽ;->֫(Ll/۬ۚܽ;)Ll/ۘ۠ܽ;

    move-result-object v3

    if-nez v3, :cond_32

    .line 332
    invoke-direct {v8, v1, v2, v0}, Ll/ܺᩴܽ;->֫(IILl/۬ۚܽ;)V

    return-void

    .line 334
    :cond_32
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    const/16 v2, 0x14

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x2

    .line 335
    invoke-direct {v8, v3}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v2

    aput v2, v0, v1

    return-void

    :cond_33
    const/16 v2, 0xe

    .line 338
    iget-object v0, v0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v2, v0}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 339
    iget-object v0, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v8, v3}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v2

    aput v2, v0, v1

    return-void

    :cond_34
    if-ne v0, v4, :cond_35

    const/16 v0, 0x1b

    .line 342
    check-cast v2, Ll/۬ۚܽ;

    invoke-direct {v8, v1, v0, v2}, Ll/ܺᩴܽ;->֫(IILl/۬ۚܽ;)V

    return-void

    .line 343
    :cond_35
    const-class v3, Ll/۬ۚܽ;

    if-ne v0, v3, :cond_36

    const/16 v0, 0xa

    .line 344
    check-cast v2, Ll/۬ۚܽ;

    invoke-direct {v8, v1, v0, v2}, Ll/ܺᩴܽ;->֫(IILl/۬ۚܽ;)V

    return-void

    .line 346
    :cond_36
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Regex program does not support node: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 302
    :cond_37
    :goto_2
    move-object v0, v2

    check-cast v0, Ll/ۚۚܽ;

    .line 303
    iget-boolean v3, v0, Ll/ۚۚܽ;->ܽ:Z

    if-eqz v3, :cond_38

    const/4 v4, 0x7

    :cond_38
    iget-object v2, v2, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v4, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 304
    iget-boolean v2, v0, Ll/ۚۚܽ;->ܽ:Z

    if-eqz v2, :cond_39

    iget-object v2, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x2

    iget v0, v0, Ll/ۚۚܽ;->ۧ:I

    invoke-direct {v8, v0}, Ll/ܺᩴܽ;->֫(I)V

    aput v0, v2, v1

    :cond_39
    return-void

    .line 287
    :cond_3a
    :goto_3
    move-object v0, v2

    check-cast v0, Ll/ۜۚܽ;

    invoke-direct {v8, v1, v11, v0}, Ll/ܺᩴܽ;->֫(IILl/ۜۚܽ;)V

    return-void

    .line 268
    :cond_3b
    :goto_4
    move-object v0, v2

    check-cast v0, Ll/᩻ۚܽ;

    .line 386
    iget-object v2, v0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    invoke-direct {v8, v1, v10, v2}, Ll/ܺᩴܽ;->֫(IILl/ۛۚܽ;)V

    .line 387
    iget-object v2, v8, Ll/ܺᩴܽ;->ᩳ:[I

    add-int/lit8 v1, v1, 0x2

    iget-object v0, v0, Ll/᩻ۚܽ;->ۧ:Ll/ۧۚܽ;

    invoke-direct {v8, v0}, Ll/ܺᩴܽ;->֫(Ljava/lang/Object;)I

    move-result v0

    aput v0, v2, v1

    return-void

    .line 197
    :cond_3c
    :goto_5
    move-object v9, v2

    check-cast v9, Ll/֨֡ܽ;

    if-eq v0, v5, :cond_3e

    if-ne v0, v6, :cond_3d

    goto :goto_6

    :cond_3d
    const/4 v5, 0x0

    goto :goto_7

    :cond_3e
    :goto_6
    const/4 v5, 0x1

    :goto_7
    if-eq v0, v6, :cond_40

    if-ne v0, v3, :cond_3f

    goto :goto_8

    :cond_3f
    const/4 v10, 0x0

    goto :goto_9

    :cond_40
    :goto_8
    const/4 v0, 0x1

    const/4 v10, 0x1

    .line 200
    :goto_9
    iget-object v3, v9, Ll/֨֡ܽ;->ۧ:Ll/ۛۚܽ;

    if-eqz v5, :cond_41

    const/4 v0, 0x2

    const/4 v4, 0x2

    goto :goto_a

    :cond_41
    const/4 v4, 0x3

    :goto_a
    iget v5, v9, Ll/֨֡ܽ;->ᩳ:I

    iget v6, v9, Ll/֨֡ܽ;->ܽ:I

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    move v7, v10

    invoke-direct/range {v0 .. v7}, Ll/ܺᩴܽ;->֫(ILl/ۛۚܽ;Ll/ۛۚܽ;IIIZ)V

    return-void
.end method
