.class public final Ll/᩻ۙܳ;
.super Ll/۬ᩴܺ;
.source "N7SN"


# instance fields
.field public final ֫:Z

.field public final ۜ:J

.field public final ۡ:Z

.field public final ۢ:Z

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:J

.field public final ܺ:Ll/ۢۙܳ;

.field public final ܽ:Ll/ۡۙܳ;

.field public final ܿ:J

.field public final ᩳ:Z

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۡۙܳ;ZZJJJJLl/ۢۙܳ;Ljava/lang/String;ZZ)V
    .locals 3

    move-object v0, p0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    move v1, p3

    iput-boolean v1, v0, Ll/᩻ۙܳ;->ۡ:Z

    move v1, p4

    iput-boolean v1, v0, Ll/᩻ۙܳ;->֫:Z

    move-wide v1, p5

    iput-wide v1, v0, Ll/᩻ۙܳ;->᩻:J

    move-wide v1, p7

    iput-wide v1, v0, Ll/᩻ۙܳ;->ܿ:J

    move-wide v1, p9

    iput-wide v1, v0, Ll/᩻ۙܳ;->ۜ:J

    move-wide v1, p11

    iput-wide v1, v0, Ll/᩻ۙܳ;->ܳ:J

    move-object/from16 v1, p13

    iput-object v1, v0, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    move-object/from16 v1, p14

    iput-object v1, v0, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    move/from16 v1, p15

    iput-boolean v1, v0, Ll/᩻ۙܳ;->ᩳ:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Ll/᩻ۙܳ;->ۢ:Z

    return-void
.end method

.method public static ֫(Ljava/util/List;)[B
    .locals 12

    .line 59
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x64

    if-gt v0, v1, :cond_b

    .line 62
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 63
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 64
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۙܳ;

    .line 157
    iget-wide v3, v2, Ll/᩻ۙܳ;->ܿ:J

    iget-object v5, v2, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 158
    iget-object v5, v2, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 159
    iget-object v5, v2, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    invoke-virtual {v5}, Ll/ۡۙܳ;->ܿ()I

    move-result v5

    shl-int/lit8 v5, v5, 0x5

    .line 160
    iget-wide v6, v2, Ll/᩻ۙܳ;->᩻:J

    const-wide/16 v8, -0x1

    cmp-long v10, v6, v8

    if-nez v10, :cond_1

    cmp-long v11, v3, v8

    if-eqz v11, :cond_2

    :cond_1
    or-int/lit8 v5, v5, 0x1

    .line 163
    :cond_2
    iget-boolean v11, v2, Ll/᩻ۙܳ;->ۡ:Z

    if-eqz v11, :cond_3

    or-int/lit8 v5, v5, 0x2

    .line 166
    :cond_3
    iget-boolean v11, v2, Ll/᩻ۙܳ;->֫:Z

    if-eqz v11, :cond_4

    or-int/lit8 v5, v5, 0x4

    .line 169
    :cond_4
    iget-boolean v11, v2, Ll/᩻ۙܳ;->ᩳ:Z

    if-eqz v11, :cond_5

    or-int/lit8 v5, v5, 0x8

    .line 172
    :cond_5
    iget-boolean v2, v2, Ll/᩻ۙܳ;->ۢ:Z

    if-eqz v2, :cond_6

    or-int/lit8 v5, v5, 0x10

    .line 175
    :cond_6
    invoke-virtual {v0, v5}, Ll/ۤۜܽ;->writeByte(I)V

    if-nez v10, :cond_7

    cmp-long v2, v3, v8

    if-eqz v2, :cond_0

    .line 177
    :cond_7
    invoke-virtual {v0, v6, v7}, Ll/ۤۜܽ;->ۧ(J)V

    .line 178
    invoke-virtual {v0, v3, v4}, Ll/ۤۜܽ;->ۧ(J)V

    goto :goto_0

    :cond_8
    const v1, 0x46535452

    .line 67
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x2

    .line 68
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 69
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 70
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۙܳ;

    .line 71
    iget-wide v2, v1, Ll/᩻ۙܳ;->ۜ:J

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 72
    iget-wide v2, v1, Ll/᩻ۙܳ;->ܳ:J

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 73
    iget-object v1, v1, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    if-nez v1, :cond_9

    const/4 v1, 0x0

    goto :goto_2

    :cond_9
    invoke-virtual {v1}, Ll/ۢۙܳ;->ۧ()I

    move-result v1

    :goto_2
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_1

    .line 75
    :cond_a
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p0

    return-object p0

    .line 60
    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Too many file search records"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ([B)Ljava/util/List;
    .locals 30

    move-object/from16 v0, p0

    if-eqz v0, :cond_16

    .line 35
    array-length v1, v0

    if-nez v1, :cond_0

    goto/16 :goto_b

    .line 38
    :cond_0
    new-instance v1, Ll/۬ۜܽ;

    invoke-direct {v1, v0}, Ll/۬ۜܽ;-><init>([B)V

    .line 41
    :try_start_0
    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/16 v2, 0x64

    if-le v0, v2, :cond_1

    .line 43
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 45
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const-wide/16 v5, 0x0

    const-wide/16 v7, -0x1

    const/4 v9, 0x1

    if-ge v4, v0, :cond_a

    .line 133
    invoke-virtual {v1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v11

    .line 134
    invoke-virtual {v1}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v24

    .line 135
    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v9

    and-int/lit16 v10, v9, 0xff

    and-int/lit8 v12, v9, 0x1

    if-eqz v12, :cond_2

    const/4 v12, 0x1

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    :goto_1
    and-int/lit8 v13, v9, 0x2

    if-eqz v13, :cond_3

    const/4 v13, 0x1

    goto :goto_2

    :cond_3
    const/4 v13, 0x0

    :goto_2
    and-int/lit8 v14, v9, 0x4

    if-eqz v14, :cond_4

    const/4 v14, 0x1

    goto :goto_3

    :cond_4
    const/4 v14, 0x0

    :goto_3
    and-int/lit8 v15, v9, 0x8

    if-eqz v15, :cond_5

    const/4 v15, 0x1

    const/16 v25, 0x1

    goto :goto_4

    :cond_5
    const/4 v15, 0x0

    const/16 v25, 0x0

    :goto_4
    and-int/lit8 v9, v9, 0x10

    if-eqz v9, :cond_6

    const/4 v9, 0x1

    const/16 v26, 0x1

    goto :goto_5

    :cond_6
    const/4 v9, 0x0

    const/16 v26, 0x0

    :goto_5
    shr-int/lit8 v9, v10, 0x5

    and-int/lit8 v9, v9, 0x7

    .line 141
    invoke-static {v9}, Ll/ۡۙܳ;->֫(I)Ll/ۡۙܳ;

    move-result-object v9

    if-eqz v12, :cond_7

    .line 143
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v15

    goto :goto_6

    :cond_7
    move-wide v15, v7

    :goto_6
    if-eqz v12, :cond_8

    .line 144
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v7

    :cond_8
    cmp-long v10, v15, v5

    if-ltz v10, :cond_9

    cmp-long v5, v15, v7

    if-nez v5, :cond_9

    const-wide v5, 0x7fffffffffffffffL

    cmp-long v10, v7, v5

    if-eqz v10, :cond_9

    const-wide/16 v5, 0x1

    add-long/2addr v7, v5

    :cond_9
    move-wide/from16 v17, v7

    .line 149
    new-instance v5, Ll/᩻ۙܳ;

    const-wide/16 v21, -0x1

    const/16 v23, 0x0

    const-wide/16 v19, -0x1

    move-object v10, v5

    move-object v12, v9

    invoke-direct/range {v10 .. v26}, Ll/᩻ۙܳ;-><init>(Ljava/lang/String;Ll/ۡۙܳ;ZZJJJJLl/ۢۙܳ;Ljava/lang/String;ZZ)V

    .line 47
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 83
    :cond_a
    invoke-virtual {v1}, Ll/۬ۜܽ;->available()J

    move-result-wide v10

    cmp-long v0, v10, v5

    if-nez v0, :cond_b

    goto/16 :goto_a

    .line 87
    :cond_b
    :try_start_1
    invoke-virtual {v1}, Ll/۬ۜܽ;->available()J

    move-result-wide v4

    const-wide/16 v10, 0x6

    cmp-long v0, v4, v10

    if-ltz v0, :cond_15

    invoke-virtual {v1}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const v4, 0x46535452

    if-eq v0, v4, :cond_c

    goto/16 :goto_a

    .line 90
    :cond_c
    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    .line 91
    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v4

    and-int/lit16 v4, v4, 0xff

    const/4 v5, 0x2

    if-eq v0, v9, :cond_d

    if-ne v0, v5, :cond_15

    .line 92
    :cond_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v4, v6, :cond_15

    .line 93
    invoke-virtual {v1}, Ll/۬ۜܽ;->available()J

    move-result-wide v10

    int-to-long v12, v4

    if-ne v0, v9, :cond_e

    const-wide/16 v14, 0x10

    goto :goto_7

    :cond_e
    const-wide/16 v14, 0x11

    :goto_7
    mul-long v12, v12, v14

    cmp-long v6, v10, v12

    if-eqz v6, :cond_f

    goto/16 :goto_a

    .line 96
    :cond_f
    new-array v6, v4, [J

    .line 97
    new-array v9, v4, [J

    .line 98
    new-array v10, v4, [Ll/ۢۙܳ;

    const/4 v11, 0x0

    :goto_8
    if-ge v11, v4, :cond_13

    .line 100
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v12

    aput-wide v12, v6, v11

    .line 101
    invoke-virtual {v1}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v12

    aput-wide v12, v9, v11

    if-lt v0, v5, :cond_10

    .line 103
    invoke-virtual {v1}, Ll/۬ۜܽ;->readByte()B

    move-result v12

    and-int/lit16 v12, v12, 0xff

    invoke-static {v12}, Ll/ۢۙܳ;->֫(I)Ll/ۢۙܳ;

    move-result-object v12

    aput-object v12, v10, v11

    .line 105
    :cond_10
    aget-wide v12, v6, v11

    aget-wide v14, v9, v11

    cmp-long v16, v12, v7

    if-ltz v16, :cond_15

    cmp-long v17, v14, v7

    if-gez v17, :cond_11

    goto :goto_a

    :cond_11
    if-eqz v16, :cond_12

    if-eqz v17, :cond_12

    cmp-long v16, v12, v14

    if-gez v16, :cond_15

    :cond_12
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    .line 109
    :cond_13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_9
    if-ge v3, v4, :cond_14

    .line 111
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۙܳ;

    aget-wide v20, v6, v3

    aget-wide v22, v9, v3

    aget-object v24, v10, v3

    .line 186
    new-instance v5, Ll/᩻ۙܳ;

    iget-object v12, v1, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    iget-object v13, v1, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    iget-boolean v14, v1, Ll/᩻ۙܳ;->ۡ:Z

    iget-boolean v15, v1, Ll/᩻ۙܳ;->֫:Z

    iget-wide v7, v1, Ll/᩻ۙܳ;->᩻:J

    move-object/from16 p0, v9

    move-object/from16 v28, v10

    iget-wide v9, v1, Ll/᩻ۙܳ;->ܿ:J

    iget-object v11, v1, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    move/from16 v29, v4

    iget-boolean v4, v1, Ll/᩻ۙܳ;->ᩳ:Z

    iget-boolean v1, v1, Ll/᩻ۙܳ;->ۢ:Z

    move-object/from16 v25, v11

    move-object v11, v5

    move-wide/from16 v16, v7

    move-wide/from16 v18, v9

    move/from16 v26, v4

    move/from16 v27, v1

    invoke-direct/range {v11 .. v27}, Ll/᩻ۙܳ;-><init>(Ljava/lang/String;Ll/ۡۙܳ;ZZJJJJLl/ۢۙܳ;Ljava/lang/String;ZZ)V

    .line 111
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v9, p0

    move-object/from16 v10, v28

    move/from16 v4, v29

    goto :goto_9

    :cond_14
    return-object v0

    :catch_0
    :cond_15
    :goto_a
    return-object v2

    .line 50
    :catch_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 36
    :cond_16
    :goto_b
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private ᩹()Z
    .locals 5

    .line 216
    iget-boolean v0, p0, Ll/᩻ۙܳ;->֫:Z

    if-eqz v0, :cond_1

    iget-wide v0, p0, Ll/᩻ۙܳ;->᩻:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/᩻ۙܳ;->ܿ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    if-nez v0, :cond_0

    iget-wide v0, p0, Ll/᩻ۙܳ;->ۜ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/᩻ۙܳ;->ܳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    .line 217
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 20
    instance-of v0, p1, Ll/᩻ۙܳ;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩻ۙܳ;

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۡ:Z

    iget-boolean v1, p1, Ll/᩻ۙܳ;->ۡ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/᩻ۙܳ;->֫:Z

    iget-boolean v1, p1, Ll/᩻ۙܳ;->֫:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ᩳ:Z

    iget-boolean v1, p1, Ll/᩻ۙܳ;->ᩳ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۢ:Z

    iget-boolean v1, p1, Ll/᩻ۙܳ;->ۢ:Z

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/᩻ۙܳ;->᩻:J

    iget-wide v2, p1, Ll/᩻ۙܳ;->᩻:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/᩻ۙܳ;->ܿ:J

    iget-wide v2, p1, Ll/᩻ۙܳ;->ܿ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/᩻ۙܳ;->ۜ:J

    iget-wide v2, p1, Ll/᩻ۙܳ;->ۜ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/᩻ۙܳ;->ܳ:J

    iget-wide v2, p1, Ll/᩻ۙܳ;->ܳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    iget-object v1, p1, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    iget-object v1, p1, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    iget-object v1, p1, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 7

    .line 0
    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۡ:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const/16 v2, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/᩻ۙܳ;->֫:Z

    if-eqz v3, :cond_1

    const/16 v3, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v3, 0x4d5

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/᩻ۙܳ;->ᩳ:Z

    if-eqz v3, :cond_2

    const/16 v3, 0x4cf

    goto :goto_2

    :cond_2
    const/16 v3, 0x4d5

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/᩻ۙܳ;->ۢ:Z

    if-eqz v3, :cond_3

    const/16 v1, 0x4cf

    :cond_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Ll/᩻ۙܳ;->᩻:J

    const/16 v1, 0x20

    ushr-long v5, v3, v1

    xor-long/2addr v3, v5

    long-to-int v4, v3

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Ll/᩻ۙܳ;->ܿ:J

    ushr-long v5, v3, v1

    xor-long/2addr v3, v5

    long-to-int v4, v3

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Ll/᩻ۙܳ;->ۜ:J

    ushr-long v5, v3, v1

    xor-long/2addr v3, v5

    long-to-int v4, v3

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Ll/᩻ۙܳ;->ܳ:J

    ushr-long v5, v3, v1

    xor-long/2addr v3, v5

    long-to-int v1, v3

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/᩶ᩴᩳ;->֫(IILjava/lang/String;)I

    move-result v0

    .line 20
    iget-object v1, p0, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    .line 20
    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۡ:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v1, p0, Ll/᩻ۙܳ;->֫:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-wide v2, p0, Ll/᩻ۙܳ;->᩻:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Ll/᩻ۙܳ;->ܿ:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-wide v4, p0, Ll/᩻ۙܳ;->ۜ:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iget-wide v5, p0, Ll/᩻ۙܳ;->ܳ:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-boolean v6, p0, Ll/᩻ۙܳ;->ᩳ:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-boolean v7, p0, Ll/᩻ۙܳ;->ۢ:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    const/16 v8, 0xc

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    iget-object v10, p0, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    aput-object v10, v8, v9

    const/4 v10, 0x1

    iget-object v11, p0, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    aput-object v11, v8, v10

    const/4 v11, 0x2

    aput-object v0, v8, v11

    const/4 v0, 0x3

    aput-object v1, v8, v0

    const/4 v0, 0x4

    aput-object v2, v8, v0

    const/4 v0, 0x5

    aput-object v3, v8, v0

    const/4 v0, 0x6

    aput-object v4, v8, v0

    const/4 v0, 0x7

    aput-object v5, v8, v0

    const/16 v0, 0x8

    iget-object v1, p0, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    aput-object v1, v8, v0

    const/16 v0, 0x9

    iget-object v1, p0, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    aput-object v1, v8, v0

    const/16 v0, 0xa

    aput-object v6, v8, v0

    const/16 v0, 0xb

    aput-object v7, v8, v0

    const-string v0, "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex"

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    new-array v0, v9, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "FileSearchInputRecord["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v2, v0

    if-ge v9, v2, :cond_2

    aget-object v2, v0, v9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v8, v9

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v2, v0

    sub-int/2addr v2, v10

    if-eq v9, v2, :cond_1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۢ:Z

    return v0
.end method

.method public final ֫()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Ll/᩻ۙܳ;->֫:Z

    return v0
.end method

.method public final ֫(Ll/᩻ۙܳ;)Z
    .locals 5

    .line 194
    iget-object v0, p1, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    iget-object v1, p0, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 195
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    iget-object v1, p1, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    if-ne v0, v1, :cond_5

    :cond_0
    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۡ:Z

    iget-boolean v1, p1, Ll/᩻ۙܳ;->ۡ:Z

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 199
    :cond_1
    invoke-direct {p0}, Ll/᩻ۙܳ;->᩹()Z

    move-result v0

    .line 200
    invoke-direct {p1}, Ll/᩻ۙܳ;->᩹()Z

    move-result v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_4

    .line 203
    iget-wide v0, p0, Ll/᩻ۙܳ;->᩻:J

    iget-wide v2, p1, Ll/᩻ۙܳ;->᩻:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_5

    iget-wide v0, p0, Ll/᩻ۙܳ;->ܿ:J

    iget-wide v2, p1, Ll/᩻ۙܳ;->ܿ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_5

    iget-object v0, p1, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    iget-object v1, p0, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    if-ne v1, v0, :cond_5

    if-nez v1, :cond_3

    iget-wide v0, p0, Ll/᩻ۙܳ;->ۜ:J

    iget-wide v2, p1, Ll/᩻ۙܳ;->ۜ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_5

    iget-wide v0, p0, Ll/᩻ۙܳ;->ܳ:J

    iget-wide v2, p1, Ll/᩻ۙܳ;->ܳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_5

    :cond_3
    iget-object v0, p1, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    .line 208
    iget-object v1, p0, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 209
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ᩳ:Z

    iget-boolean v1, p1, Ll/᩻ۙܳ;->ᩳ:Z

    if-ne v0, v1, :cond_5

    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۢ:Z

    iget-boolean p1, p1, Ll/᩻ۙܳ;->ۢ:Z

    if-ne v0, p1, :cond_5

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۖ()J
    .locals 2

    .line 20
    iget-wide v0, p0, Ll/᩻ۙܳ;->ܳ:J

    return-wide v0
.end method

.method public final ۘ()J
    .locals 2

    .line 20
    iget-wide v0, p0, Ll/᩻ۙܳ;->᩻:J

    return-wide v0
.end method

.method public final ۜ()J
    .locals 2

    .line 20
    iget-wide v0, p0, Ll/᩻ۙܳ;->ܿ:J

    return-wide v0
.end method

.method public final ܳ()Ll/ۡۙܳ;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    return-object v0
.end method

.method public final ܶ()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Ll/᩻ۙܳ;->ۡ:Z

    return v0
.end method

.method public final ܽ()Landroid/text/SpannableStringBuilder;
    .locals 13

    .line 225
    iget-object v0, p0, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    const/16 v1, 0xa

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    .line 226
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    const v3, 0x7f1205b1

    .line 227
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    .line 228
    :cond_0
    invoke-direct {v4, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 229
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    .line 230
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, " ["

    .line 231
    invoke-virtual {v4, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    iget-object v5, p0, Ll/᩻ۙܳ;->ܽ:Ll/ۡۙܳ;

    invoke-virtual {v5}, Ll/ۡۙܳ;->֫()I

    move-result v5

    invoke-static {v5}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    const-string v5, "]"

    invoke-virtual {v0, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 233
    :cond_1
    iget-boolean v0, p0, Ll/᩻ۙܳ;->֫:Z

    if-eqz v0, :cond_7

    .line 234
    iget-wide v5, p0, Ll/᩻ۙܳ;->ܿ:J

    iget-wide v7, p0, Ll/᩻ۙܳ;->᩻:J

    const-string v0, ": "

    const-wide/16 v9, -0x1

    cmp-long v11, v7, v9

    if-nez v11, :cond_2

    cmp-long v11, v5, v9

    if-eqz v11, :cond_3

    .line 235
    :cond_2
    invoke-virtual {v4, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object v11

    const v12, 0x7f1207be

    invoke-static {v12}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v11

    .line 236
    invoke-virtual {v11, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v11

    invoke-static {v7, v8, v5, v6}, Ll/᩷ۙܳ;->ۧ(JJ)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 238
    :cond_3
    iget-wide v5, p0, Ll/᩻ۙܳ;->ܳ:J

    iget-wide v7, p0, Ll/᩻ۙܳ;->ۜ:J

    iget-object v11, p0, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    if-nez v11, :cond_4

    cmp-long v12, v7, v9

    if-nez v12, :cond_4

    cmp-long v12, v5, v9

    if-eqz v12, :cond_6

    .line 239
    :cond_4
    invoke-virtual {v4, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object v9

    const v10, 0x7f1203be

    invoke-static {v10}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v9

    .line 240
    invoke-virtual {v9, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v9

    if-nez v11, :cond_5

    invoke-static {v7, v8, v5, v6}, Ll/ۢۙܳ;->֫(JJ)Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    .line 241
    :cond_5
    invoke-virtual {v11}, Ll/ۢۙܳ;->֫()Ljava/lang/String;

    move-result-object v5

    .line 240
    :goto_0
    invoke-virtual {v9, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 243
    :cond_6
    iget-object v5, p0, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_7

    .line 244
    invoke-virtual {v4, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object v6

    const v7, 0x7f1203bd

    invoke-static {v7}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v6

    .line 245
    invoke-virtual {v6, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    const/16 v6, 0x32

    invoke-static {v6, v5}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 248
    :cond_7
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    if-ge v3, v0, :cond_8

    .line 249
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    sget v1, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    const/16 v2, 0x21

    invoke-virtual {v4, v0, v3, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 250
    new-instance v0, Landroid/text/style/RelativeSizeSpan;

    const v1, 0x3f59999a    # 0.85f

    invoke-direct {v0, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    invoke-virtual {v4, v0, v3, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_8
    return-object v4
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/᩻ۙܳ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()J
    .locals 2

    .line 20
    iget-wide v0, p0, Ll/᩻ۙܳ;->ۜ:J

    return-wide v0
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/᩻ۙܳ;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩸()Ll/ۢۙܳ;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/᩻ۙܳ;->ܺ:Ll/ۢۙܳ;

    return-object v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Ll/᩻ۙܳ;->ᩳ:Z

    return v0
.end method
