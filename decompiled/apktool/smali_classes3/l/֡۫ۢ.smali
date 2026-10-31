.class public final Ll/֡۫ۢ;
.super Ll/ۛܿ֡;
.source "46P2"


# instance fields
.field public final ֫:Z

.field public final ۜ:Ll/ᩴۙۢ;

.field public final ۡ:Ljava/util/ArrayList;

.field public final ۢ:Ljava/lang/CharSequence;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ܳ:Ll/ᩳ۫ۢ;

.field public final ܺ:I

.field public ܽ:[B

.field public ܿ:[I

.field public ᩳ:[J

.field public final ᩷:Ljava/util/ArrayList;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ll/֫ܳ֡;Ll/ᩴۙۢ;ILl/ᩳ۫ۢ;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡۫ۢ;->ۧ:Ljava/util/ArrayList;

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡۫ۢ;->᩷:Ljava/util/ArrayList;

    const/4 v0, -0x1

    .line 33
    iput v0, p0, Ll/֡۫ۢ;->᩻:I

    .line 37
    iput-object p1, p0, Ll/֡۫ۢ;->ۢ:Ljava/lang/CharSequence;

    .line 39
    invoke-virtual {p2}, Ll/֫ܳ֡;->ᩳ()Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    .line 40
    iput-object p3, p0, Ll/֡۫ۢ;->ۜ:Ll/ᩴۙۢ;

    .line 41
    iput-object p5, p0, Ll/֡۫ۢ;->ܳ:Ll/ᩳ۫ۢ;

    if-nez p5, :cond_0

    .line 42
    sget-object p2, Ll/ᩴۙۢ;->᩶:Ll/ᩴۙۢ;

    if-eq p3, p2, :cond_0

    invoke-static {p1}, Ll/ᩳ۫ۢ;->֫(Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/֡۫ۢ;->֫:Z

    .line 43
    iput p4, p0, Ll/֡۫ۢ;->ܺ:I

    return-void
.end method

.method private ֫(IIZ)V
    .locals 12

    .line 284
    iget-object v0, p0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/16 v2, 0x58

    const/16 v3, 0x5a

    const/16 v4, 0x59

    const/16 v5, 0x5c

    const/16 v6, 0x5b

    if-ne v1, v6, :cond_0

    const/16 v7, 0x5c

    goto :goto_0

    :cond_0
    if-ne v1, v4, :cond_1

    const/16 v7, 0x5a

    goto :goto_0

    :cond_1
    const/16 v7, 0x58

    .line 287
    :goto_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡ܳ֡;

    invoke-interface {v8}, Ll/֡ܳ֡;->getType()I

    move-result v8

    const/4 v9, 0x0

    if-ne v8, v7, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    const/4 v8, 0x3

    if-eqz v7, :cond_7

    .line 288
    invoke-virtual {p0, p1}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v10

    if-ne v10, p2, :cond_7

    .line 289
    invoke-virtual {p0, p1, p2}, Ll/֡۫ۢ;->ۧ(II)Z

    move-result p3

    const/16 v1, 0x8d

    if-eqz p3, :cond_4

    add-int/lit8 p1, p2, -0x1

    .line 291
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ܳ֡;

    .line 292
    invoke-interface {p1}, Ll/֡ܳ֡;->getType()I

    move-result p3

    if-ne p3, v1, :cond_3

    .line 293
    invoke-interface {p1}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۠۫ۢ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 v8, 0x2

    .line 292
    :cond_3
    invoke-direct {p0, p2, v8}, Ll/֡۫ۢ;->ܽ(II)V

    return-void

    .line 294
    :cond_4
    invoke-direct {p0, p1, p2}, Ll/֡۫ۢ;->ᩳ(II)Z

    move-result p3

    if-eqz p3, :cond_6

    :goto_2
    add-int/lit8 p1, p1, 0x1

    if-ge p1, p2, :cond_5

    .line 297
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֡ܳ֡;

    invoke-interface {p3}, Ll/֡ܳ֡;->getType()I

    move-result p3

    if-ne p3, v1, :cond_5

    goto :goto_2

    .line 298
    :cond_5
    iget-object p3, p0, Ll/֡۫ۢ;->ܿ:[I

    aget v0, p3, p1

    add-int/lit8 v0, v0, 0x1

    aput v0, p3, p1

    .line 299
    aget p1, p3, p2

    add-int/lit8 p1, p1, -0x1

    aput p1, p3, p2

    .line 300
    invoke-direct {p0, p2}, Ll/֡۫ۢ;->ᩳ(I)V

    return-void

    .line 301
    :cond_6
    invoke-direct {p0, p2, v8}, Ll/֡۫ۢ;->ܽ(II)V

    return-void

    :cond_7
    if-ne v1, v6, :cond_8

    const/4 v1, 0x1

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_3
    if-eqz p3, :cond_9

    .line 306
    invoke-virtual {p0, p1}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v1

    invoke-direct {p0, v1}, Ll/֡۫ۢ;->ᩳ(I)V

    .line 307
    iget-object v1, p0, Ll/֡۫ۢ;->ܿ:[I

    invoke-virtual {p0, p1}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v8

    aget v10, v1, v8

    add-int/lit8 v10, v10, 0x1

    aput v10, v1, v8

    if-eqz v7, :cond_c

    .line 308
    invoke-direct {p0, p2}, Ll/֡۫ۢ;->ᩳ(I)V

    iget-object v1, p0, Ll/֡۫ۢ;->ܿ:[I

    aget v7, v1, p2

    add-int/lit8 v7, v7, -0x1

    aput v7, v1, p2

    goto :goto_5

    .line 310
    :cond_9
    invoke-virtual {p0, p1}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v10

    if-eqz v1, :cond_a

    const/4 v11, 0x1

    goto :goto_4

    :cond_a
    const/4 v11, 0x3

    :goto_4
    invoke-direct {p0, v10, v11}, Ll/֡۫ۢ;->ܽ(II)V

    if-eqz v7, :cond_c

    if-eqz v1, :cond_b

    const/4 v8, 0x1

    .line 311
    :cond_b
    invoke-direct {p0, p2, v8}, Ll/֡۫ۢ;->ܽ(II)V

    :cond_c
    :goto_5
    add-int/lit8 p1, p1, 0x1

    if-ge p1, p2, :cond_14

    .line 316
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v1

    if-eq v1, v6, :cond_d

    if-eq v1, v4, :cond_d

    const/16 v7, 0x57

    if-ne v1, v7, :cond_e

    :cond_d
    add-int/lit8 v9, v9, 0x1

    :cond_e
    if-eq v1, v5, :cond_f

    if-eq v1, v3, :cond_f

    if-ne v1, v2, :cond_10

    :cond_f
    add-int/lit8 v9, v9, -0x1

    :cond_10
    if-nez v9, :cond_13

    const/16 v7, 0x5e

    if-eq v1, v7, :cond_11

    const/16 v7, 0x5d

    if-ne v1, v7, :cond_13

    .line 320
    :cond_11
    invoke-virtual {p0, p1}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v1

    if-eqz p3, :cond_12

    invoke-direct {p0, v1}, Ll/֡۫ۢ;->ᩳ(I)V

    goto :goto_6

    :cond_12
    invoke-direct {p0, v1}, Ll/֡۫ۢ;->ܿ(I)V

    :cond_13
    :goto_6
    goto :goto_5

    :cond_14
    return-void
.end method

.method private ܳ(II)V
    .locals 2

    .line 147
    iget-object v0, p0, Ll/֡۫ۢ;->ܽ:[B

    aget-byte v1, v0, p1

    int-to-byte p2, p2

    or-int/2addr p2, v1

    int-to-byte p2, p2

    aput-byte p2, v0, p1

    return-void
.end method

.method private ܽ(II)V
    .locals 2

    .line 145
    iget-object v0, p0, Ll/֡۫ۢ;->ܽ:[B

    aget-byte v1, v0, p1

    and-int/lit8 v1, v1, -0x4

    or-int/2addr p2, v1

    int-to-byte p2, p2

    aput-byte p2, v0, p1

    return-void
.end method

.method private ܿ(I)V
    .locals 2

    if-ltz p1, :cond_0

    .line 336
    iget-object v0, p0, Ll/֡۫ۢ;->ܽ:[B

    array-length v0, v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p0, p1}, Ll/֡۫ۢ;->֫(I)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ll/֡۫ۢ;->ܽ(II)V

    :cond_0
    return-void
.end method

.method private ܿ(II)Z
    .locals 3

    add-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    :goto_0
    if-ge p1, p2, :cond_3

    .line 271
    iget-object v1, p0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    .line 272
    invoke-interface {v1}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/۠۫ۢ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    .line 274
    :cond_0
    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v0

    const/16 v2, 0x8d

    if-ne v0, v2, :cond_1

    add-int/lit8 v0, p1, 0x1

    const/16 v1, 0x10

    .line 275
    invoke-direct {p0, v0, v1}, Ll/֡۫ۢ;->ܳ(II)V

    goto :goto_1

    .line 276
    :cond_1
    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    const/16 v0, 0x20

    .line 277
    invoke-direct {p0, p1, v0}, Ll/֡۫ۢ;->ܳ(II)V

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    return v0
.end method

.method private ᩳ(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 335
    iget-object v0, p0, Ll/֡۫ۢ;->ܽ:[B

    array-length v0, v0

    if-ge p1, v0, :cond_0

    const/4 v0, 0x2

    invoke-direct {p0, p1, v0}, Ll/֡۫ۢ;->ܽ(II)V

    :cond_0
    return-void
.end method

.method private ᩳ(II)Z
    .locals 3

    const/4 v0, 0x1

    add-int/2addr p1, v0

    :goto_0
    if-ge p1, p2, :cond_2

    .line 354
    iget-object v1, p0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫(I)I
    .locals 1

    .line 144
    iget-object v0, p0, Ll/֡۫ۢ;->ܽ:[B

    aget-byte p1, v0, p1

    and-int/lit8 p1, p1, 0x3

    return p1
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 16

    move-object/from16 v0, p0

    .line 48
    iget-object v1, v0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    .line 49
    new-array v4, v2, [B

    iput-object v4, v0, Ll/֡۫ۢ;->ܽ:[B

    .line 50
    new-array v4, v2, [I

    iput-object v4, v0, Ll/֡۫ۢ;->ܿ:[I

    .line 51
    new-array v2, v2, [J

    iput-object v2, v0, Ll/֡۫ۢ;->ᩳ:[J

    const/4 v2, 0x0

    .line 52
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, -0x1

    if-ge v2, v4, :cond_2

    .line 53
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 54
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܳ֡;

    .line 56
    iget-object v6, v0, Ll/֡۫ۢ;->ᩳ:[J

    add-int/lit8 v7, v2, 0x1

    aget-wide v8, v6, v2

    invoke-interface {v4}, Ll/֡ܳ֡;->getType()I

    move-result v2

    const/16 v10, 0x8d

    if-eq v2, v10, :cond_1

    .line 57
    invoke-interface {v4}, Ll/֡ܳ֡;->getType()I

    move-result v2

    if-ne v2, v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v4}, Ll/֡ܳ֡;->ܿ()I

    move-result v2

    invoke-interface {v4}, Ll/֡ܳ֡;->ᩳ()I

    move-result v4

    sub-int/2addr v2, v4

    int-to-long v4, v2

    const-wide/16 v10, 0x2

    add-long/2addr v4, v10

    goto :goto_2

    :cond_1
    :goto_1
    const-wide/16 v4, 0x0

    :goto_2
    add-long/2addr v8, v4

    aput-wide v8, v6, v7

    move v2, v7

    goto :goto_0

    .line 91
    :cond_2
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x4

    if-eqz v4, :cond_35

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖ۫ۢ;

    .line 92
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 151
    iget v7, v4, Ll/ۖ۫ۢ;->ۜ:I

    iget v8, v4, Ll/ۖ۫ۢ;->ᩳ:I

    iget v9, v4, Ll/ۖ۫ۢ;->᩷:I

    iget v10, v4, Ll/ۖ۫ۢ;->ܽ:I

    const/16 v11, 0x5d

    const/16 v12, 0x48

    if-ne v10, v12, :cond_5

    if-ltz v7, :cond_5

    .line 152
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v7, v12, :cond_5

    .line 153
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/֡ܳ֡;

    invoke-interface {v12}, Ll/֡ܳ֡;->getType()I

    move-result v12

    if-ne v12, v11, :cond_3

    invoke-direct {v0, v7, v5}, Ll/֡۫ۢ;->ܳ(II)V

    goto :goto_4

    .line 155
    :cond_3
    invoke-virtual {v0, v7}, Ll/֡۫ۢ;->ܽ(I)I

    move-result v11

    if-ltz v11, :cond_4

    .line 156
    invoke-direct {v0, v11, v6}, Ll/֡۫ۢ;->ܳ(II)V

    .line 157
    :cond_4
    invoke-direct {v0, v7}, Ll/֡۫ۢ;->ᩳ(I)V

    :cond_5
    :goto_4
    if-ltz v7, :cond_34

    if-lt v9, v7, :cond_34

    .line 160
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lt v9, v6, :cond_6

    goto/16 :goto_17

    :cond_6
    const/4 v6, -0x3

    const/16 v11, 0x2b

    const/16 v12, 0x18

    .line 161
    iget v13, v0, Ll/֡۫ۢ;->ܺ:I

    const/4 v14, 0x2

    const/4 v15, 0x3

    if-eq v10, v6, :cond_1f

    const/4 v6, -0x2

    if-eq v10, v6, :cond_1f

    if-eq v10, v3, :cond_18

    if-eq v10, v14, :cond_1f

    if-eq v10, v5, :cond_15

    const/16 v3, 0x9

    const/16 v5, 0x33

    if-eq v10, v3, :cond_12

    const/16 v3, 0xe

    if-eq v10, v3, :cond_15

    if-eq v10, v12, :cond_18

    const/16 v3, 0x1e

    if-eq v10, v3, :cond_15

    const/16 v3, 0x28

    if-eq v10, v3, :cond_11

    if-eq v10, v11, :cond_11

    const/16 v3, 0x2f

    if-eq v10, v3, :cond_15

    const/16 v3, 0x39

    if-eq v10, v3, :cond_d

    const/16 v3, 0x42

    if-eq v10, v3, :cond_15

    const/16 v3, 0x44

    if-eq v10, v3, :cond_7

    const/16 v3, 0x11

    if-eq v10, v3, :cond_1f

    const/16 v3, 0x12

    if-eq v10, v3, :cond_18

    const/16 v3, 0x32

    if-eq v10, v3, :cond_15

    if-eq v10, v5, :cond_12

    const/16 v3, 0x36

    if-eq v10, v3, :cond_7

    const/16 v3, 0x37

    if-eq v10, v3, :cond_d

    const/16 v3, 0x3f

    if-eq v10, v3, :cond_1f

    const/16 v3, 0x40

    if-eq v10, v3, :cond_18

    goto/16 :goto_12

    :cond_7
    move v3, v7

    :goto_5
    if-gt v3, v9, :cond_c

    .line 198
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳ֡;

    invoke-interface {v5}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/16 v6, 0x91

    if-eq v5, v6, :cond_8

    const/16 v8, 0x8f

    if-eq v5, v8, :cond_8

    const/16 v8, 0x90

    const/16 v11, 0x40

    if-ne v5, v8, :cond_9

    goto :goto_6

    :cond_8
    const/16 v8, 0x90

    const/16 v11, 0x40

    .line 200
    :goto_6
    invoke-direct {v0, v3, v11}, Ll/֡۫ۢ;->ܳ(II)V

    :cond_9
    const/4 v12, 0x7

    if-eq v5, v12, :cond_a

    if-eq v5, v6, :cond_a

    if-ne v5, v8, :cond_b

    :cond_a
    add-int/lit8 v5, v3, 0x1

    .line 202
    invoke-direct {v0, v5, v11}, Ll/֡۫ۢ;->ܳ(II)V

    :cond_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_c
    const/4 v3, 0x0

    :goto_7
    const/16 v5, 0x40

    .line 204
    iget v6, v4, Ll/ۖ۫ۢ;->ܳ:I

    if-ge v3, v6, :cond_20

    .line 205
    invoke-virtual {v4, v3}, Ll/ۖ۫ۢ;->֫(I)I

    move-result v6

    .line 206
    invoke-direct {v0, v6, v5}, Ll/֡۫ۢ;->ܳ(II)V

    add-int/lit8 v6, v6, 0x1

    .line 207
    invoke-direct {v0, v6, v5}, Ll/֡۫ۢ;->ܳ(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 183
    :cond_d
    invoke-virtual {v0, v7}, Ll/֡۫ۢ;->ܽ(I)I

    move-result v3

    .line 185
    invoke-virtual {v0, v7}, Ll/֡۫ۢ;->֫(I)I

    move-result v5

    if-eq v5, v14, :cond_10

    if-ltz v3, :cond_f

    .line 186
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳ֡;

    invoke-interface {v5}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/16 v6, 0x87

    if-eq v5, v6, :cond_e

    .line 187
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֡ܳ֡;

    invoke-interface {v5}, Ll/֡ܳ֡;->getType()I

    move-result v5

    const/16 v6, 0x1d

    if-eq v5, v6, :cond_e

    .line 188
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֡ܳ֡;

    invoke-interface {v3}, Ll/֡ܳ֡;->getType()I

    move-result v3

    const/16 v5, 0x1c

    if-ne v3, v5, :cond_f

    :cond_e
    const/4 v3, 0x1

    goto :goto_8

    :cond_f
    const/4 v3, 0x3

    .line 186
    :goto_8
    invoke-direct {v0, v7, v3}, Ll/֡۫ۢ;->ܽ(II)V

    .line 190
    :cond_10
    invoke-virtual {v0, v7}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v3

    invoke-direct {v0, v3, v15}, Ll/֡۫ۢ;->ܽ(II)V

    .line 191
    invoke-direct {v0, v9, v15}, Ll/֡۫ۢ;->ܽ(II)V

    .line 193
    iget-boolean v3, v4, Ll/ۖ۫ۢ;->᩻:Z

    if-eqz v3, :cond_20

    invoke-virtual {v0, v9}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v3

    invoke-direct {v0, v9, v3}, Ll/֡۫ۢ;->ܿ(II)Z

    goto/16 :goto_12

    .line 178
    :cond_11
    invoke-direct {v0, v7}, Ll/֡۫ۢ;->ܿ(I)V

    .line 179
    invoke-virtual {v0, v9}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v3

    invoke-direct {v0, v3}, Ll/֡۫ۢ;->ܿ(I)V

    add-int/lit8 v3, v7, 0x1

    :goto_9
    if-gt v3, v9, :cond_20

    .line 180
    invoke-direct {v0, v3, v15}, Ll/֡۫ۢ;->ܽ(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_12
    if-eq v10, v5, :cond_14

    .line 337
    iget-object v3, v0, Ll/֡۫ۢ;->ᩳ:[J

    add-int/lit8 v5, v9, 0x1

    aget-wide v5, v3, v5

    aget-wide v11, v3, v7

    sub-long/2addr v5, v11

    .line 164
    div-int/lit8 v3, v13, 0x2

    int-to-long v11, v3

    cmp-long v3, v5, v11

    if-gtz v3, :cond_14

    invoke-direct {v0, v7, v9}, Ll/֡۫ۢ;->ᩳ(II)Z

    move-result v3

    if-eqz v3, :cond_13

    goto :goto_a

    :cond_13
    const/4 v3, 0x0

    goto :goto_b

    :cond_14
    :goto_a
    const/4 v3, 0x1

    .line 163
    :goto_b
    invoke-direct {v0, v7, v9, v3}, Ll/֡۫ۢ;->֫(IIZ)V

    goto/16 :goto_12

    .line 337
    :cond_15
    iget-object v3, v0, Ll/֡۫ۢ;->ᩳ:[J

    add-int/lit8 v5, v9, 0x1

    aget-wide v5, v3, v5

    aget-wide v11, v3, v7

    sub-long/2addr v5, v11

    int-to-long v11, v13

    cmp-long v3, v5, v11

    if-gtz v3, :cond_17

    .line 166
    invoke-direct {v0, v7, v9}, Ll/֡۫ۢ;->ᩳ(II)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_c

    :cond_16
    const/4 v3, 0x0

    goto :goto_d

    :cond_17
    :goto_c
    const/4 v3, 0x1

    :goto_d
    invoke-direct {v0, v7, v9, v3}, Ll/֡۫ۢ;->֫(IIZ)V

    goto :goto_12

    .line 168
    :cond_18
    invoke-direct {v0, v7}, Ll/֡۫ۢ;->ᩳ(I)V

    const/4 v3, 0x1

    if-ne v10, v3, :cond_1e

    const/16 v3, 0x15

    if-eq v8, v3, :cond_19

    const/16 v3, 0x16

    if-ne v8, v3, :cond_1e

    :cond_19
    const/16 v3, 0x5d

    .line 170
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v3

    if-ltz v3, :cond_1a

    const/4 v3, 0x1

    goto :goto_e

    :cond_1a
    const/4 v3, 0x0

    .line 171
    :goto_e
    iget-boolean v5, v4, Ll/ۖ۫ۢ;->֫:Z

    if-nez v5, :cond_1c

    if-eqz v3, :cond_1b

    goto :goto_f

    .line 172
    :cond_1b
    iget-object v3, v0, Ll/֡۫ۢ;->ܿ:[I

    aget v5, v3, v7

    const/4 v6, 0x1

    add-int/2addr v5, v6

    aput v5, v3, v7

    invoke-virtual {v0, v9}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v5

    aget v11, v3, v5

    sub-int/2addr v11, v6

    aput v11, v3, v5

    goto :goto_11

    :cond_1c
    :goto_f
    const/4 v6, 0x1

    if-eqz v3, :cond_1d

    const/4 v3, 0x3

    goto :goto_10

    :cond_1d
    const/4 v3, 0x1

    .line 171
    :goto_10
    invoke-direct {v0, v7, v3}, Ll/֡۫ۢ;->ܽ(II)V

    goto :goto_11

    :cond_1e
    const/4 v6, 0x1

    :goto_11
    if-ne v10, v6, :cond_20

    if-ne v8, v6, :cond_20

    .line 175
    invoke-direct {v0, v7, v6}, Ll/֡۫ۢ;->ܽ(II)V

    goto :goto_12

    :cond_1f
    const/4 v3, 0x1

    .line 162
    invoke-direct {v0, v7, v9, v3}, Ll/֡۫ۢ;->֫(IIZ)V

    :cond_20
    :goto_12
    const/16 v3, 0x29

    if-eq v10, v3, :cond_21

    const/16 v3, 0x3a

    if-ne v10, v3, :cond_22

    :cond_21
    const/4 v3, 0x0

    .line 212
    :goto_13
    iget v5, v4, Ll/ۖ۫ۢ;->ܳ:I

    if-ge v3, v5, :cond_22

    .line 213
    invoke-virtual {v4, v3}, Ll/ۖ۫ۢ;->֫(I)I

    move-result v5

    invoke-direct {v0, v5}, Ll/֡۫ۢ;->ܿ(I)V

    .line 214
    invoke-virtual {v4, v3}, Ll/ۖ۫ۢ;->֫(I)I

    move-result v5

    invoke-virtual {v0, v5}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v5

    invoke-direct {v0, v5}, Ll/֡۫ۢ;->ܿ(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_22
    const/16 v3, 0xf

    if-eq v10, v3, :cond_23

    const/16 v3, 0x40

    if-eq v10, v3, :cond_23

    const/16 v3, 0x12

    if-eq v10, v3, :cond_23

    const/16 v3, 0x43

    if-ne v10, v3, :cond_24

    :cond_23
    const/4 v3, 0x0

    .line 218
    :goto_14
    iget v5, v4, Ll/ۖ۫ۢ;->ܳ:I

    if-ge v3, v5, :cond_24

    invoke-virtual {v4, v3}, Ll/ۖ۫ۢ;->֫(I)I

    move-result v5

    invoke-direct {v0, v5, v15}, Ll/֡۫ۢ;->ܽ(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    :cond_24
    const/16 v3, 0x22

    const/16 v5, 0x5b

    if-ne v10, v3, :cond_25

    const/16 v3, 0x2b

    .line 220
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v3

    if-ltz v3, :cond_25

    .line 221
    invoke-virtual {v4, v5, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v3

    const/16 v6, 0x5c

    invoke-virtual {v4, v6, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v6

    if-ltz v3, :cond_25

    if-ltz v6, :cond_25

    const/4 v8, 0x1

    .line 222
    invoke-direct {v0, v3, v6, v8}, Ll/֡۫ۢ;->֫(IIZ)V

    :cond_25
    const/16 v3, 0x3b

    if-eq v10, v3, :cond_26

    const/16 v3, 0x3c

    if-ne v10, v3, :cond_29

    .line 337
    :cond_26
    iget-object v3, v0, Ll/֡۫ۢ;->ᩳ:[J

    add-int/lit8 v6, v9, 0x1

    aget-wide v11, v3, v6

    aget-wide v6, v3, v7

    sub-long/2addr v11, v6

    int-to-long v6, v13

    cmp-long v3, v11, v6

    if-lez v3, :cond_29

    const/4 v3, 0x0

    const/4 v6, -0x1

    .line 226
    :goto_15
    iget v7, v4, Ll/ۖ۫ۢ;->ܳ:I

    if-ge v3, v7, :cond_28

    .line 227
    invoke-virtual {v4, v3}, Ll/ۖ۫ۢ;->֫(I)I

    move-result v7

    if-ltz v7, :cond_27

    .line 228
    invoke-direct {v0, v7}, Ll/֡۫ۢ;->ᩳ(I)V

    if-gez v6, :cond_27

    move v6, v7

    :cond_27
    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    :cond_28
    if-ltz v6, :cond_29

    .line 230
    iget-object v3, v0, Ll/֡۫ۢ;->ܿ:[I

    aget v7, v3, v6

    add-int/lit8 v7, v7, 0x1

    aput v7, v3, v6

    invoke-virtual {v0, v9}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v6

    aget v7, v3, v6

    add-int/lit8 v7, v7, -0x1

    aput v7, v3, v6

    :cond_29
    const/16 v3, 0x15

    if-ne v10, v3, :cond_2b

    const/16 v3, 0x12

    .line 233
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v3

    if-ltz v3, :cond_2b

    .line 234
    invoke-virtual {v0, v3}, Ll/֡۫ۢ;->ܽ(I)I

    move-result v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ܳ֡;

    invoke-interface {v6}, Ll/֡ܳ֡;->getType()I

    move-result v6

    const/16 v7, 0x5c

    if-ne v6, v7, :cond_2a

    const/4 v14, 0x1

    :cond_2a
    invoke-direct {v0, v3, v14}, Ll/֡۫ۢ;->ܽ(II)V

    :cond_2b
    const/16 v3, 0x19

    if-ne v10, v3, :cond_2d

    const/16 v3, 0xa

    .line 237
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v3

    const/16 v6, 0x15

    invoke-virtual {v4, v6, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v6

    if-ltz v3, :cond_2c

    .line 238
    invoke-direct {v0, v3}, Ll/֡۫ۢ;->ܿ(I)V

    :cond_2c
    if-ltz v6, :cond_2d

    .line 239
    invoke-direct {v0, v6}, Ll/֡۫ۢ;->ܿ(I)V

    :cond_2d
    const/16 v3, 0x14

    if-ne v10, v3, :cond_2e

    .line 241
    invoke-virtual {v0, v9}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v3

    invoke-direct {v0, v3}, Ll/֡۫ۢ;->ᩳ(I)V

    :cond_2e
    const/16 v3, 0x17

    if-ne v10, v3, :cond_30

    .line 243
    invoke-virtual {v4, v5, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v3

    const/16 v5, 0x5c

    invoke-virtual {v4, v5, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v5

    if-ltz v3, :cond_30

    if-gez v5, :cond_2f

    move v5, v9

    :cond_2f
    const/4 v6, 0x1

    .line 244
    invoke-direct {v0, v3, v5, v6}, Ll/֡۫ۢ;->֫(IIZ)V

    goto :goto_16

    :cond_30
    const/4 v6, 0x1

    :goto_16
    const/16 v3, 0x18

    if-ne v10, v3, :cond_31

    .line 246
    iget v3, v4, Ll/ۖ۫ۢ;->ۧ:I

    if-ltz v3, :cond_31

    .line 247
    iget-object v5, v0, Ll/֡۫ۢ;->ܿ:[I

    aget v7, v5, v3

    add-int/2addr v7, v6

    aput v7, v5, v3

    .line 248
    invoke-virtual {v0, v9}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v3

    aget v7, v5, v3

    sub-int/2addr v7, v6

    aput v7, v5, v3

    :cond_31
    const/16 v3, 0x16

    if-ne v10, v3, :cond_32

    const/16 v3, 0x11

    .line 250
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v3

    if-ltz v3, :cond_32

    const/16 v3, 0x26

    .line 251
    invoke-virtual {v4, v3, v1}, Ll/ۖ۫ۢ;->֫(ILjava/util/List;)I

    move-result v3

    if-ltz v3, :cond_32

    .line 252
    invoke-direct {v0, v3}, Ll/֡۫ۢ;->ܿ(I)V

    :cond_32
    const/16 v3, 0x48

    if-eq v10, v3, :cond_33

    const/16 v3, 0x41

    if-ne v10, v3, :cond_34

    .line 254
    :cond_33
    invoke-virtual {v0, v9}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v3

    invoke-direct {v0, v3}, Ll/֡۫ۢ;->ᩳ(I)V

    :cond_34
    :goto_17
    const/4 v3, 0x1

    goto/16 :goto_3

    .line 95
    :cond_35
    iget-object v2, v0, Ll/֡۫ۢ;->ۜ:Ll/ᩴۙۢ;

    sget-object v3, Ll/ᩴۙۢ;->ۙ:Ll/ᩴۙۢ;

    const/4 v4, -0x5

    if-ne v2, v3, :cond_38

    .line 96
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_36
    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_38

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖ۫ۢ;

    .line 97
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 98
    iget v7, v3, Ll/ۖ۫ۢ;->ܽ:I

    const/16 v8, 0x3a

    if-ne v7, v8, :cond_36

    iget v7, v3, Ll/ۖ۫ۢ;->ᩳ:I

    const/16 v8, 0x2a

    if-ne v7, v8, :cond_36

    iget v7, v3, Ll/ۖ۫ۢ;->ۜ:I

    if-ltz v7, :cond_36

    iget v8, v3, Ll/ۖ۫ۢ;->᩷:I

    if-lt v8, v7, :cond_36

    .line 99
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lt v8, v7, :cond_37

    goto :goto_18

    .line 100
    :cond_37
    iget v7, v3, Ll/ۖ۫ۢ;->᩷:I

    invoke-virtual {v0, v7}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v7

    .line 102
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֡ܳ֡;

    invoke-interface {v8}, Ll/֡ܳ֡;->getType()I

    move-result v8

    const/16 v9, 0x73

    if-ne v8, v9, :cond_36

    iget v8, v3, Ll/ۖ۫ۢ;->᩷:I

    invoke-direct {v0, v8, v7}, Ll/֡۫ۢ;->ܿ(II)Z

    move-result v7

    if-eqz v7, :cond_36

    .line 103
    iget v3, v3, Ll/ۖ۫ۢ;->᩷:I

    .line 148
    iget-object v7, v0, Ll/֡۫ۢ;->ܽ:[B

    aget-byte v8, v7, v3

    int-to-byte v9, v4

    and-int/2addr v8, v9

    int-to-byte v8, v8

    aput-byte v8, v7, v3

    goto :goto_18

    :cond_38
    const/4 v2, 0x0

    .line 107
    :goto_19
    iget-object v3, v0, Ll/֡۫ۢ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    iget-object v8, v0, Ll/֡۫ۢ;->᩷:Ljava/util/ArrayList;

    const/16 v9, 0x10

    if-ge v2, v7, :cond_3c

    .line 108
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡܳ֡;

    .line 322
    iget-object v7, v3, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    .line 109
    invoke-interface {v7}, Ll/֡ܳ֡;->ܽ()I

    move-result v7

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 328
    iget-object v3, v3, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    if-nez v3, :cond_39

    .line 110
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    goto :goto_1a

    :cond_39
    invoke-interface {v3}, Ll/֡ܳ֡;->ܽ()I

    move-result v3

    :goto_1a
    move v8, v7

    .line 112
    :goto_1b
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    add-int/lit8 v11, v3, 0x1

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    if-gt v8, v10, :cond_3a

    invoke-direct {v0, v8, v9}, Ll/֡۫ۢ;->ܳ(II)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1b

    :cond_3a
    add-int/lit8 v7, v7, -0x1

    const/4 v8, 0x0

    .line 113
    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    :goto_1c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-gt v7, v8, :cond_3b

    .line 148
    iget-object v8, v0, Ll/֡۫ۢ;->ܽ:[B

    aget-byte v9, v8, v7

    int-to-byte v10, v4

    and-int/2addr v9, v10

    int-to-byte v9, v9

    aput-byte v9, v8, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1c

    :cond_3b
    add-int/lit8 v2, v2, 0x1

    goto :goto_19

    :cond_3c
    const/4 v2, 0x0

    .line 115
    :goto_1d
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v2, v7, :cond_42

    .line 116
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ܳ֡;

    invoke-interface {v7}, Ll/֡ܳ֡;->getType()I

    move-result v7

    const/16 v10, 0x91

    const/16 v11, 0x8f

    const/16 v12, 0x90

    if-eq v7, v10, :cond_3d

    if-eq v7, v11, :cond_3d

    const/16 v11, 0x40

    if-ne v7, v12, :cond_3e

    goto :goto_1e

    :cond_3d
    const/16 v11, 0x40

    .line 119
    :goto_1e
    invoke-direct {v0, v2, v11}, Ll/֡۫ۢ;->ܳ(II)V

    :cond_3e
    const/4 v13, 0x7

    if-eq v7, v10, :cond_3f

    if-eq v7, v13, :cond_3f

    if-ne v7, v12, :cond_40

    :cond_3f
    add-int/lit8 v10, v2, 0x1

    .line 121
    invoke-direct {v0, v10, v11}, Ll/֡۫ۢ;->ܳ(II)V

    :cond_40
    const/16 v10, 0x8e

    if-ne v7, v10, :cond_41

    .line 123
    invoke-direct {v0, v2, v9}, Ll/֡۫ۢ;->ܳ(II)V

    add-int/lit8 v7, v2, 0x1

    .line 124
    invoke-direct {v0, v7, v9}, Ll/֡۫ۢ;->ܳ(II)V

    :cond_41
    add-int/lit8 v2, v2, 0x1

    goto :goto_1d

    :cond_42
    const/4 v2, 0x0

    .line 127
    :goto_1f
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v2, v7, :cond_49

    .line 128
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 129
    invoke-virtual {v0, v2, v6}, Ll/֡۫ۢ;->֫(II)Z

    move-result v7

    if-nez v7, :cond_43

    invoke-virtual {v0, v2, v5}, Ll/֡۫ۢ;->֫(II)Z

    move-result v7

    if-nez v7, :cond_43

    goto :goto_23

    .line 130
    :cond_43
    invoke-virtual {v0, v2}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v7

    .line 131
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֡ܳ֡;

    invoke-interface {v10}, Ll/֡ܳ֡;->getType()I

    move-result v10

    const/16 v11, 0x5c

    const/4 v12, -0x1

    if-eq v10, v11, :cond_45

    if-ne v10, v12, :cond_44

    goto :goto_20

    :cond_44
    const/4 v10, 0x0

    goto :goto_21

    :cond_45
    :goto_20
    const/4 v10, 0x1

    :goto_21
    move v11, v2

    :goto_22
    if-eqz v10, :cond_46

    if-gt v11, v7, :cond_46

    .line 134
    invoke-virtual {v0, v11, v9}, Ll/֡۫ۢ;->֫(II)Z

    move-result v10

    xor-int/lit8 v10, v10, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_22

    :cond_46
    if-nez v10, :cond_47

    .line 148
    iget-object v7, v0, Ll/֡۫ۢ;->ܽ:[B

    aget-byte v11, v7, v2

    const/16 v12, -0x9

    int-to-byte v12, v12

    and-int/2addr v11, v12

    int-to-byte v11, v11

    aput-byte v11, v7, v2

    :cond_47
    if-eqz v10, :cond_48

    iget-object v7, v0, Ll/֡۫ۢ;->ܽ:[B

    aget-byte v10, v7, v2

    int-to-byte v11, v4

    and-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, v7, v2

    :cond_48
    :goto_23
    add-int/lit8 v2, v2, 0x1

    goto :goto_1f

    :cond_49
    const/4 v1, 0x0

    .line 139
    iput-object v1, v0, Ll/֡۫ۢ;->ᩳ:[J

    .line 140
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 141
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(Ll/ᩳ۫ۢ;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 260
    :goto_0
    iget-object v1, p0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 261
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    .line 262
    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v2

    const/16 v3, 0x2c

    if-ne v2, v3, :cond_2

    invoke-interface {v1}, Ll/֡ܳ֡;->ᩳ()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ᩳ۫ۢ;->ۧ(I)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 263
    :cond_1
    invoke-virtual {p0, v0}, Ll/֡۫ۢ;->ۧ(I)I

    move-result v1

    invoke-direct {p0, v0, v1}, Ll/֡۫ۢ;->ܿ(II)Z

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public final ֫(Ll/ᩴܳ֡;Ljava/lang/Object;IILjava/lang/String;Ll/ۖܳ֡;)V
    .locals 2

    .line 64
    iget-boolean p3, p0, Ll/֡۫ۢ;->֫:Z

    iget-object p4, p0, Ll/֡۫ۢ;->᩷:Ljava/util/ArrayList;

    iget-object p5, p0, Ll/֡۫ۢ;->ۧ:Ljava/util/ArrayList;

    if-eqz p3, :cond_0

    instance-of p3, p2, Ll/֡ܳ֡;

    if-eqz p3, :cond_0

    move-object p3, p2

    check-cast p3, Ll/֡ܳ֡;

    invoke-interface {p3}, Ll/֡ܳ֡;->ܽ()I

    move-result p6

    iget v0, p0, Ll/֡۫ۢ;->᩻:I

    if-le p6, v0, :cond_0

    .line 66
    invoke-interface {p3}, Ll/֡ܳ֡;->ܽ()I

    move-result p3

    iput p3, p0, Ll/֡۫ۢ;->᩻:I

    .line 67
    invoke-virtual {p5}, Ljava/util/ArrayList;->clear()V

    .line 68
    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    .line 70
    :cond_0
    invoke-virtual {p5}, Ljava/util/ArrayList;->size()I

    move-result p3

    const/16 p6, 0x40

    if-ge p3, p6, :cond_6

    .line 71
    check-cast p1, Ll/ۗ۬ۢ;

    invoke-virtual {p1}, Ll/ۢܳ֡;->ۖ()Ll/ۡܳ֡;

    move-result-object p1

    move-object p3, p1

    :goto_0
    if-eqz p1, :cond_2

    .line 76
    instance-of p3, p1, Ll/֫۬ۢ;

    if-nez p3, :cond_3

    instance-of p3, p1, Ll/ۧۗۢ;

    if-nez p3, :cond_3

    instance-of p3, p1, Ll/ۖ۬ۢ;

    if-eqz p3, :cond_1

    goto :goto_1

    .line 115
    :cond_1
    iget-object p3, p1, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    move-object v1, p3

    move-object p3, p1

    move-object p1, v1

    goto :goto_0

    :cond_2
    move-object p1, p3

    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    .line 82
    invoke-virtual {p5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object p1, p0, Ll/֡۫ۢ;->ۜ:Ll/ᩴۙۢ;

    sget-object p3, Ll/ᩴۙۢ;->᩶:Ll/ᩴۙۢ;

    const/4 p5, -0x1

    if-ne p1, p3, :cond_4

    instance-of p1, p2, Ll/֡ܳ֡;

    if-eqz p1, :cond_4

    .line 84
    check-cast p2, Ll/֡ܳ֡;

    .line 85
    invoke-interface {p2}, Ll/֡ܳ֡;->getType()I

    move-result p1

    if-ne p1, p5, :cond_4

    invoke-interface {p2}, Ll/֡ܳ֡;->ܽ()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 84
    :goto_2
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    return-void

    .line 70
    :cond_6
    new-instance p1, Ll/᩵۫ۢ;

    .line 360
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 70
    throw p1
.end method

.method public final ֫(II)Z
    .locals 1

    .line 146
    iget-object v0, p0, Ll/֡۫ۢ;->ܽ:[B

    aget-byte p1, v0, p1

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(I)I
    .locals 2

    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 326
    iget-object v0, p0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    invoke-interface {v1}, Ll/֡ܳ֡;->ۧ()I

    move-result v1

    if-nez v1, :cond_0

    .line 327
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public final ۧ(II)Z
    .locals 4

    const/4 v0, 0x1

    add-int/2addr p1, v0

    :goto_0
    if-ge p1, p2, :cond_3

    .line 341
    iget-object v1, p0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡ܳ֡;

    .line 342
    invoke-interface {v1}, Ll/֡ܳ֡;->getType()I

    move-result v2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    goto :goto_1

    .line 344
    :cond_0
    invoke-interface {v1}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v1

    const-string v2, "@ts-"

    .line 345
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "#__PURE__"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "@__PURE__"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "sourceURL="

    .line 346
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "sourceMappingURL="

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "eslint"

    .line 347
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "prettier"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "istanbul"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(I)I
    .locals 1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_1

    .line 331
    iget-object v0, p0, Ll/֡۫ۢ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ܳ֡;

    invoke-interface {v0}, Ll/֡ܳ֡;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return p1
.end method
