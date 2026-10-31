.class public final Ll/ܶ֡᩵;
.super Ll/ۚ֡᩵;
.source "LA1L"


# instance fields
.field public ۜ:[B

.field public ۢ:Ljava/lang/String;

.field public ܳ:[B

.field public ܿ:[B

.field public ᩳ:Ljava/lang/String;

.field public ᩷:[B

.field public ᩻:[B


# direct methods
.method public constructor <init>(Ll/ᩴۡ᩵;Ll/۠֡᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    .line 31
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v6, 0x0

    .line 54
    iput-object v6, v0, Ll/ܶ֡᩵;->ܳ:[B

    .line 55
    iput-object v6, v0, Ll/ܶ֡᩵;->᩷:[B

    .line 56
    iput-object v6, v0, Ll/ܶ֡᩵;->᩻:[B

    const/4 v7, 0x1

    move-object/from16 v8, p2

    .line 395
    invoke-virtual {v8, v7}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v9

    const/4 v10, 0x2

    if-eqz v9, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    const/4 v9, 0x2

    :goto_0
    const v11, 0x2000200

    or-int/2addr v9, v11

    or-int v9, p7, v9

    .line 159
    invoke-virtual {v0, v9}, Ll/ۚ֡᩵;->ۧ(I)V

    .line 456
    iput-object v4, v0, Ll/ܶ֡᩵;->ᩳ:Ljava/lang/String;

    .line 476
    iput-object v5, v0, Ll/ܶ֡᩵;->ۢ:Ljava/lang/String;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    if-nez p8, :cond_2

    if-eqz v3, :cond_2

    .line 164
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_2

    .line 416
    :goto_1
    iput-object v6, v0, Ll/ܶ֡᩵;->ܿ:[B

    .line 436
    iput-object v6, v0, Ll/ܶ֡᩵;->ۜ:[B

    return-void

    .line 171
    :cond_2
    invoke-static/range {p4 .. p4}, Ll/᩵ۚ᩵;->֫(Ljava/lang/String;)[B

    move-result-object v6

    .line 174
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v9

    check-cast v9, Ll/ܰۡ᩵;

    invoke-virtual {v9}, Ll/ܰۡ᩵;->ۢ()I

    move-result v9

    const/16 v11, 0x8

    const/4 v12, 0x0

    if-eqz v9, :cond_23

    if-eq v9, v7, :cond_23

    if-eq v9, v10, :cond_21

    const/4 v7, 0x3

    const/4 v10, 0x4

    if-eq v9, v7, :cond_5

    if-eq v9, v10, :cond_5

    const/4 v7, 0x5

    if-eq v9, v7, :cond_5

    if-nez v3, :cond_3

    const/4 v1, 0x0

    goto :goto_2

    .line 680
    :cond_3
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v2

    invoke-static {v1, v3, v2}, Ll/᩵ۚ᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;[B)[B

    move-result-object v1

    .line 416
    :goto_2
    iput-object v1, v0, Ll/ܶ֡᩵;->ܿ:[B

    if-nez v6, :cond_4

    const/4 v1, 0x0

    goto :goto_3

    .line 770
    :cond_4
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v1

    invoke-static {v6, v1}, Ll/᩵ۚ᩵;->֫([B[B)[B

    move-result-object v1

    .line 436
    :goto_3
    iput-object v1, v0, Ll/ܶ֡᩵;->ۜ:[B

    return-void

    .line 225
    :cond_5
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ᩳ()[B

    move-result-object v3

    const/16 v7, 0xa

    if-eqz v3, :cond_9

    .line 46
    new-instance v9, Ljava/util/LinkedList;

    invoke-direct {v9}, Ljava/util/LinkedList;-><init>()V

    const/4 v10, 0x0

    :goto_4
    add-int/lit8 v13, v10, 0x4

    .line 49
    array-length v14, v3

    if-gt v13, v14, :cond_8

    .line 50
    invoke-static {v10, v3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v14

    add-int/lit8 v10, v10, 0x2

    .line 51
    invoke-static {v10, v3}, Ll/֫֡᩵;->֫(I[B)I

    move-result v10

    if-nez v14, :cond_7

    if-nez v10, :cond_6

    goto :goto_6

    .line 56
    :cond_6
    new-instance v1, Ll/᩵ۡ᩵;

    const-string v2, "Invalid avLen for AvEOL"

    .line 58
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    throw v1

    .line 62
    :cond_7
    new-array v15, v10, [B

    .line 63
    invoke-static {v3, v13, v15, v12, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    packed-switch v14, :pswitch_data_0

    .line 181
    new-instance v12, Ll/᩶֡᩵;

    invoke-direct {v12, v14, v15}, Ll/᩶֡᩵;-><init>(I[B)V

    goto :goto_5

    .line 179
    :pswitch_0
    new-instance v12, Ll/᩸֡᩵;

    .line 30
    invoke-direct {v12, v7, v15}, Ll/᩶֡᩵;-><init>(I[B)V

    goto :goto_5

    .line 175
    :pswitch_1
    new-instance v12, Ll/۬֡᩵;

    invoke-direct {v12, v15}, Ll/۬֡᩵;-><init>([B)V

    goto :goto_5

    .line 177
    :pswitch_2
    new-instance v12, Ll/ۗ֡᩵;

    invoke-direct {v12, v15}, Ll/ۗ֡᩵;-><init>([B)V

    goto :goto_5

    .line 173
    :pswitch_3
    new-instance v12, Ll/۫֡᩵;

    invoke-direct {v12, v15}, Ll/۫֡᩵;-><init>([B)V

    goto :goto_5

    .line 171
    :pswitch_4
    new-instance v12, Ll/᩹֡᩵;

    invoke-direct {v12, v15}, Ll/᩹֡᩵;-><init>([B)V

    .line 64
    :goto_5
    invoke-virtual {v9, v12}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/2addr v10, v13

    const/4 v12, 0x0

    goto :goto_4

    .line 69
    :cond_8
    new-instance v1, Ll/᩵ۡ᩵;

    const-string v2, "Missing AvEOL"

    .line 58
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 69
    throw v1

    :cond_9
    const/4 v9, 0x0

    :goto_6
    const/4 v3, 0x7

    if-nez v9, :cond_a

    goto :goto_7

    .line 84
    :cond_a
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩶֡᩵;

    .line 85
    invoke-virtual {v10}, Ll/᩶֡᩵;->ۧ()I

    move-result v10

    if-ne v10, v3, :cond_b

    const/4 v7, 0x1

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v7, 0x0

    :goto_8
    if-nez v7, :cond_e

    new-array v10, v11, [B

    .line 233
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v12

    check-cast v12, Ll/ܰۡ᩵;

    invoke-virtual {v12}, Ll/ܰۡ᩵;->ۤ()Ljava/security/SecureRandom;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/security/SecureRandom;->nextBytes([B)V

    if-eqz v4, :cond_d

    if-eqz v5, :cond_d

    if-eqz v6, :cond_d

    .line 718
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v12

    invoke-static {v4, v5, v6, v12, v10}, Ll/᩵ۚ᩵;->֫(Ljava/lang/String;Ljava/lang/String;[B[B[B)[B

    move-result-object v10

    goto :goto_9

    :cond_d
    const/4 v10, 0x0

    .line 416
    :goto_9
    iput-object v10, v0, Ll/ܶ֡᩵;->ܿ:[B

    goto :goto_a

    :cond_e
    const/16 v10, 0x18

    new-array v10, v10, [B

    iput-object v10, v0, Ll/ܶ֡᩵;->ܿ:[B

    :goto_a
    if-eqz v9, :cond_f

    .line 241
    invoke-virtual/range {p0 .. p0}, Ll/ۚ֡᩵;->ۧ()V

    .line 114
    :cond_f
    invoke-static {v6}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object v6

    .line 115
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 116
    invoke-static/range {p5 .. p5}, Ll/ۤ֨᩵;->ۧ(Ljava/lang/String;)[B

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 117
    invoke-virtual {v6}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    new-array v5, v11, [B

    .line 246
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v6

    check-cast v6, Ll/ܰۡ᩵;

    invoke-virtual {v6}, Ll/ܰۡ᩵;->ۤ()Ljava/security/SecureRandom;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 248
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    const-wide v14, 0xa9730b66800L

    add-long/2addr v12, v14

    const-wide/16 v14, 0x2710

    mul-long v12, v12, v14

    if-eqz v7, :cond_12

    .line 99
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 100
    :cond_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    .line 101
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩶֡᩵;

    .line 102
    invoke-virtual {v10}, Ll/᩶֡᩵;->ۧ()I

    move-result v12

    if-ne v12, v3, :cond_10

    goto :goto_b

    :cond_11
    const/4 v10, 0x0

    .line 250
    :goto_b
    check-cast v10, Ll/۫֡᩵;

    .line 60
    invoke-virtual {v10}, Ll/᩶֡᩵;->֫()[B

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v6, v3}, Ll/֫֡᩵;->ܽ(I[B)J

    move-result-wide v12

    .line 282
    :cond_12
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    check-cast v3, Ll/ܰۡ᩵;

    invoke-virtual {v3}, Ll/ܰۡ᩵;->᩻֫()Z

    move-result v3

    if-nez v3, :cond_13

    if-nez v9, :cond_13

    const/4 v2, 0x0

    goto/16 :goto_11

    :cond_13
    if-nez v9, :cond_14

    .line 285
    new-instance v9, Ljava/util/LinkedList;

    invoke-direct {v9}, Ljava/util/LinkedList;-><init>()V

    :cond_14
    const/16 v3, 0x10

    .line 288
    invoke-virtual {v0, v3}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_19

    .line 289
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    check-cast v3, Ll/ܰۡ᩵;

    invoke-virtual {v3}, Ll/ܰۡ᩵;->᩻֫()Z

    move-result v3

    if-nez v3, :cond_15

    if-eqz v7, :cond_19

    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_15
    const/16 v3, 0x10

    new-array v3, v3, [B

    .line 292
    iput-object v3, v0, Ll/ܶ֡᩵;->᩻:[B

    .line 99
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 100
    :cond_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    .line 101
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶֡᩵;

    .line 102
    invoke-virtual {v6}, Ll/᩶֡᩵;->ۧ()I

    move-result v7

    const/4 v10, 0x6

    if-ne v7, v10, :cond_16

    goto :goto_c

    :cond_17
    const/4 v6, 0x0

    .line 294
    :goto_c
    check-cast v6, Ll/᩹֡᩵;

    if-eqz v6, :cond_18

    .line 49
    invoke-virtual {v6}, Ll/᩶֡᩵;->֫()[B

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v6, v3}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v3

    goto :goto_d

    :cond_18
    const/4 v6, 0x0

    const/4 v3, 0x0

    :goto_d
    or-int/lit8 v3, v3, 0x2

    .line 299
    new-instance v7, Ll/᩹֡᩵;

    const/4 v10, 0x4

    new-array v10, v10, [B

    int-to-long v14, v3

    .line 55
    invoke-static {v14, v15, v6, v10}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 41
    invoke-direct {v7, v10}, Ll/᩹֡᩵;-><init>([B)V

    .line 299
    invoke-static {v9, v7}, Ll/ۙ֡᩵;->֫(Ljava/util/List;Ll/᩶֡᩵;)V

    goto :goto_e

    :cond_19
    const/4 v6, 0x0

    .line 302
    :goto_e
    new-instance v3, Ll/۫֡᩵;

    new-array v7, v11, [B

    .line 51
    invoke-static {v12, v13, v6, v7}, Ll/֫֡᩵;->ܽ(JI[B)V

    .line 41
    invoke-direct {v3, v7}, Ll/۫֡᩵;-><init>([B)V

    .line 302
    invoke-static {v9, v3}, Ll/ۙ֡᩵;->֫(Ljava/util/List;Ll/᩶֡᩵;)V

    if-eqz v2, :cond_1a

    .line 305
    new-instance v3, Ll/۬֡᩵;

    invoke-direct {v3, v2}, Ll/۬֡᩵;-><init>(Ljava/lang/String;)V

    invoke-static {v9, v3}, Ll/ۙ֡᩵;->֫(Ljava/util/List;Ll/᩶֡᩵;)V

    .line 309
    :cond_1a
    new-instance v2, Ll/᩶֡᩵;

    const/16 v3, 0x10

    new-array v3, v3, [B

    const/16 v6, 0xa

    invoke-direct {v2, v6, v3}, Ll/᩶֡᩵;-><init>(I[B)V

    invoke-static {v9, v2}, Ll/ۙ֡᩵;->֫(Ljava/util/List;Ll/᩶֡᩵;)V

    .line 310
    new-instance v2, Ll/ۗ֡᩵;

    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    new-array v6, v11, [B

    .line 42
    check-cast v3, Ll/ܰۡ᩵;

    invoke-virtual {v3}, Ll/ܰۡ᩵;->ۖ()[B

    move-result-object v3

    const/16 v7, 0x30

    new-array v10, v7, [B

    int-to-long v14, v7

    const/4 v7, 0x0

    .line 58
    invoke-static {v14, v15, v7, v10}, Ll/֫֡᩵;->ۧ(JI[B)V

    const-wide/16 v14, 0x0

    const/4 v8, 0x4

    .line 59
    invoke-static {v14, v15, v8, v10}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 60
    invoke-static {v6, v7, v10, v11, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v6, 0x20

    const/16 v8, 0x10

    .line 61
    invoke-static {v3, v7, v10, v8, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    invoke-direct {v2, v10}, Ll/ۗ֡᩵;-><init>([B)V

    .line 310
    invoke-static {v9, v2}, Ll/ۙ֡᩵;->֫(Ljava/util/List;Ll/᩶֡᩵;)V

    .line 145
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩶֡᩵;

    .line 146
    invoke-virtual {v6}, Ll/᩶֡᩵;->֫()[B

    move-result-object v6

    array-length v6, v6

    add-int/lit8 v6, v6, 0x4

    add-int/2addr v3, v6

    goto :goto_f

    :cond_1b
    add-int/lit8 v3, v3, 0x4

    .line 150
    new-array v2, v3, [B

    .line 152
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v6, 0x0

    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩶֡᩵;

    .line 153
    invoke-virtual {v7}, Ll/᩶֡᩵;->֫()[B

    move-result-object v8

    .line 154
    invoke-virtual {v7}, Ll/᩶֡᩵;->ۧ()I

    move-result v7

    int-to-long v9, v7

    invoke-static {v9, v10, v6, v2}, Ll/֫֡᩵;->֫(JI[B)V

    .line 155
    array-length v7, v8

    int-to-long v9, v7

    add-int/lit8 v7, v6, 0x2

    invoke-static {v9, v10, v7, v2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v7, v6, 0x4

    .line 156
    array-length v9, v8

    const/4 v10, 0x0

    invoke-static {v8, v10, v2, v7, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 157
    array-length v7, v8

    add-int/lit8 v7, v7, 0x4

    add-int/2addr v6, v7

    const-wide/16 v14, 0x0

    goto :goto_10

    .line 161
    :cond_1c
    invoke-static {v14, v15, v6, v2}, Ll/֫֡᩵;->֫(JI[B)V

    add-int/lit8 v6, v6, 0x2

    .line 162
    invoke-static {v14, v15, v6, v2}, Ll/֫֡᩵;->֫(JI[B)V

    :goto_11
    if-eqz v4, :cond_1f

    .line 736
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v3

    if-eqz v2, :cond_1d

    .line 57
    array-length v6, v2

    goto :goto_12

    :cond_1d
    const/4 v6, 0x0

    :goto_12
    add-int/lit8 v7, v6, 0x1c

    add-int/lit8 v8, v6, 0x20

    .line 58
    new-array v9, v8, [B

    const/16 v10, 0x101

    const/4 v14, 0x0

    .line 60
    invoke-static {v10, v14, v9}, Ll/ۗ֨᩵;->ۧ(II[B)V

    const/4 v10, 0x4

    .line 61
    invoke-static {v14, v10, v9}, Ll/ۗ֨᩵;->ۧ(II[B)V

    const-wide v14, 0xffffffffL

    and-long v0, v12, v14

    long-to-int v1, v0

    .line 126
    invoke-static {v1, v11, v9}, Ll/ۗ֨᩵;->ۧ(II[B)V

    const/16 v0, 0x20

    shr-long v0, v12, v0

    and-long/2addr v0, v14

    long-to-int v1, v0

    const/16 v0, 0xc

    .line 127
    invoke-static {v1, v0, v9}, Ll/ۗ֨᩵;->ۧ(II[B)V

    const/4 v0, 0x0

    const/16 v1, 0x10

    .line 63
    invoke-static {v5, v0, v9, v1, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v1, 0x18

    .line 64
    invoke-static {v0, v1, v9}, Ll/ۗ֨᩵;->ۧ(II[B)V

    if-eqz v2, :cond_1e

    const/16 v1, 0x1c

    .line 66
    invoke-static {v2, v0, v9, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    :cond_1e
    invoke-static {v0, v7, v9}, Ll/ۗ֨᩵;->ۧ(II[B)V

    .line 85
    invoke-static {v4}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object v1

    .line 86
    invoke-virtual {v1, v3}, Ljava/security/MessageDigest;->update([B)V

    .line 87
    invoke-virtual {v1, v9, v0, v8}, Ljava/security/MessageDigest;->update([BII)V

    .line 88
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 89
    array-length v2, v1

    add-int/2addr v2, v8

    new-array v2, v2, [B

    .line 90
    array-length v3, v1

    invoke-static {v1, v0, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 91
    array-length v1, v1

    invoke-static {v9, v0, v2, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_13

    :cond_1f
    const/4 v0, 0x0

    const/4 v2, 0x0

    :goto_13
    move-object/from16 v1, p0

    .line 436
    iput-object v2, v1, Ll/ܶ֡᩵;->ۜ:[B

    .line 256
    invoke-static {v4}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object v2

    .line 257
    iget-object v3, v1, Ll/ܶ֡᩵;->ۜ:[B

    const/16 v4, 0x10

    invoke-virtual {v2, v3, v0, v4}, Ljava/security/MessageDigest;->update([BII)V

    .line 258
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    const/high16 v2, 0x40000000    # 2.0f

    .line 260
    invoke-virtual {v1, v2}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v2

    if-eqz v2, :cond_20

    new-array v2, v4, [B

    .line 261
    iput-object v2, v1, Ll/ܶ֡᩵;->ܳ:[B

    .line 262
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v3

    check-cast v3, Ll/ܰۡ᩵;

    invoke-virtual {v3}, Ll/ܰۡ᩵;->ۤ()Ljava/security/SecureRandom;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-array v3, v4, [B

    .line 265
    invoke-static {v0}, Ll/ۙ֨᩵;->֫([B)Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0x10

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move/from16 p3, v4

    move/from16 p4, v5

    move-object/from16 p5, v3

    move/from16 p6, v6

    .line 266
    invoke-virtual/range {p1 .. p6}, Ljavax/crypto/Cipher;->update([BII[BI)I

    .line 530
    iput-object v3, v1, Ll/ܶ֡᩵;->᩷:[B

    return-void

    .line 269
    :cond_20
    iput-object v0, v1, Ll/ܶ֡᩵;->ܳ:[B

    return-void

    :cond_21
    move-object v1, v0

    if-nez v6, :cond_22

    const/4 v0, 0x0

    goto :goto_14

    .line 770
    :cond_22
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v0

    invoke-static {v6, v0}, Ll/᩵ۚ᩵;->֫([B[B)[B

    move-result-object v0

    .line 416
    :goto_14
    iput-object v0, v1, Ll/ܶ֡᩵;->ܿ:[B

    .line 436
    iput-object v0, v1, Ll/ܶ֡᩵;->ۜ:[B

    return-void

    :cond_23
    move-object v1, v0

    const/high16 v0, 0x80000

    .line 177
    invoke-virtual {v1, v0}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v0

    if-nez v0, :cond_26

    if-nez v3, :cond_24

    const/4 v0, 0x0

    goto :goto_15

    .line 680
    :cond_24
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v0

    move-object/from16 v2, p1

    invoke-static {v2, v3, v0}, Ll/᩵ۚ᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;[B)[B

    move-result-object v0

    .line 416
    :goto_15
    iput-object v0, v1, Ll/ܶ֡᩵;->ܿ:[B

    if-nez v6, :cond_25

    const/4 v0, 0x0

    goto :goto_16

    .line 770
    :cond_25
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v0

    invoke-static {v6, v0}, Ll/᩵ۚ᩵;->֫([B[B)[B

    move-result-object v0

    .line 436
    :goto_16
    iput-object v0, v1, Ll/ܶ֡᩵;->ۜ:[B

    return-void

    :cond_26
    move-object/from16 v2, p1

    const/16 v0, 0x18

    new-array v3, v0, [B

    .line 184
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v4

    check-cast v4, Ll/ܰۡ᩵;

    invoke-virtual {v4}, Ll/ܰۡ᩵;->ۤ()Ljava/security/SecureRandom;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v4, 0x0

    .line 185
    invoke-static {v3, v11, v0, v4}, Ljava/util/Arrays;->fill([BIIB)V

    .line 187
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v0

    invoke-static {v6, v0, v3}, Ll/᩵ۚ᩵;->ۧ([B[B[B)[B

    move-result-object v0

    .line 416
    iput-object v3, v1, Ll/ܶ֡᩵;->ܿ:[B

    .line 436
    iput-object v0, v1, Ll/ܶ֡᩵;->ۜ:[B

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 193
    invoke-virtual/range {p2 .. p2}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v5

    invoke-static {v5, v4, v0, v4, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 194
    invoke-static {v3, v4, v0, v11, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 196
    invoke-static {}, Ll/ۙ֨᩵;->֫()Ljava/security/MessageDigest;

    move-result-object v3

    .line 197
    invoke-virtual {v3, v6}, Ljava/security/MessageDigest;->update([B)V

    .line 198
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    .line 200
    invoke-static {v3}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object v3

    .line 201
    invoke-virtual {v3, v0}, Ljava/security/MessageDigest;->update([B)V

    .line 202
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    const/high16 v3, 0x40000000    # 2.0f

    .line 204
    invoke-virtual {v1, v3}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v3

    if-eqz v3, :cond_27

    const/16 v3, 0x10

    new-array v4, v3, [B

    .line 205
    iput-object v4, v1, Ll/ܶ֡᩵;->ܳ:[B

    .line 206
    invoke-interface/range {p1 .. p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v2

    check-cast v2, Ll/ܰۡ᩵;

    invoke-virtual {v2}, Ll/ܰۡ᩵;->ۤ()Ljava/security/SecureRandom;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-array v2, v3, [B

    .line 209
    invoke-static {v0}, Ll/ۙ֨᩵;->֫([B)Ljavax/crypto/Cipher;

    move-result-object v0

    const/4 v3, 0x0

    const/16 v5, 0x10

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v4

    move/from16 p3, v3

    move/from16 p4, v5

    move-object/from16 p5, v2

    move/from16 p6, v6

    .line 210
    invoke-virtual/range {p1 .. p6}, Ljavax/crypto/Cipher;->update([BII[BI)I

    .line 530
    iput-object v2, v1, Ll/ܶ֡᩵;->᩷:[B

    return-void

    .line 213
    :cond_27
    iput-object v0, v1, Ll/ܶ֡᩵;->ܳ:[B

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    const-string v0, ",user="

    const-string v1, ",workstation=null,lmResponse="

    const-string v2, "Type3Message[domain="

    .line 0
    iget-object v3, p0, Ll/ܶ֡᩵;->ᩳ:Ljava/lang/String;

    iget-object v4, p0, Ll/ܶ֡᩵;->ۢ:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes>"

    const-string v2, "<"

    const-string v3, "null"

    .line 660
    iget-object v4, p0, Ll/ܶ֡᩵;->ܿ:[B

    if-nez v4, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v4, v4

    .line 0
    invoke-static {v4, v1, v5}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v4

    .line 660
    :goto_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",ntResponse="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    iget-object v4, p0, Ll/ܶ֡᩵;->ۜ:[B

    if-nez v4, :cond_1

    move-object v4, v3

    goto :goto_1

    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v4, v4

    .line 0
    invoke-static {v4, v1, v5}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v4

    .line 661
    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ",sessionKey="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    iget-object v4, p0, Ll/ܶ֡᩵;->᩷:[B

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v2, v4

    .line 0
    invoke-static {v2, v1, v3}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v3

    .line 662
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",flags=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 663
    invoke-virtual {p0}, Ll/ۚ֡᩵;->֫()I

    move-result v1

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ll/۫֨᩵;->֫(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫([B[B)V
    .locals 1

    .line 326
    iget-object v0, p0, Ll/ܶ֡᩵;->ܳ:[B

    if-nez v0, :cond_0

    return-void

    .line 329
    :cond_0
    invoke-static {v0}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object v0

    .line 330
    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 331
    invoke-virtual {v0, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 332
    invoke-virtual {p0}, Ll/ܶ֡᩵;->ᩳ()[B

    move-result-object p1

    .line 333
    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 334
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    .line 546
    iput-object p1, p0, Ll/ܶ֡᩵;->᩻:[B

    return-void
.end method

.method public final ܽ()[B
    .locals 1

    .line 507
    iget-object v0, p0, Ll/ܶ֡᩵;->ܳ:[B

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x1

    .line 561
    invoke-virtual {v0, v1}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    const-string v3, "Cp850"

    :goto_0
    const-string v4, "UTF-16LE"

    .line 566
    iget-object v5, v0, Ll/ܶ֡᩵;->ᩳ:Ljava/lang/String;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_2

    if-eqz v1, :cond_1

    .line 567
    invoke-virtual {v5, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    goto :goto_1

    :cond_1
    invoke-virtual {v5, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v5

    .line 568
    :goto_1
    array-length v6, v5

    add-int/lit8 v6, v6, 0x40

    goto :goto_2

    :cond_2
    const/16 v6, 0x40

    move-object v5, v2

    .line 573
    :goto_2
    iget-object v7, v0, Ll/ܶ֡᩵;->ۢ:Ljava/lang/String;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    if-eqz v8, :cond_4

    if-eqz v1, :cond_3

    .line 574
    invoke-virtual {v7, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    .line 575
    :goto_3
    array-length v3, v1

    add-int/2addr v6, v3

    goto :goto_4

    :cond_4
    move-object v1, v2

    .line 538
    :goto_4
    iget-object v3, v0, Ll/ܶ֡᩵;->᩻:[B

    const/high16 v4, 0x2000000

    if-eqz v3, :cond_5

    add-int/lit8 v6, v6, 0x18

    goto :goto_5

    .line 588
    :cond_5
    invoke-virtual {v0, v4}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v7

    if-eqz v7, :cond_6

    add-int/lit8 v6, v6, 0x8

    :cond_6
    :goto_5
    const/4 v7, 0x0

    .line 593
    iget-object v8, v0, Ll/ܶ֡᩵;->ܿ:[B

    if-eqz v8, :cond_7

    array-length v9, v8

    goto :goto_6

    :cond_7
    const/4 v9, 0x0

    :goto_6
    add-int/2addr v6, v9

    .line 596
    iget-object v9, v0, Ll/ܶ֡᩵;->ۜ:[B

    if-eqz v9, :cond_8

    array-length v10, v9

    goto :goto_7

    :cond_8
    const/4 v10, 0x0

    :goto_7
    add-int/2addr v6, v10

    .line 599
    iget-object v10, v0, Ll/ܶ֡᩵;->᩷:[B

    if-eqz v10, :cond_9

    array-length v11, v10

    goto :goto_8

    :cond_9
    const/4 v11, 0x0

    :goto_8
    add-int/2addr v6, v11

    .line 601
    new-array v6, v6, [B

    .line 604
    sget-object v11, Ll/ۚ֡᩵;->ۧ:[B

    const/16 v12, 0x8

    invoke-static {v11, v7, v6, v7, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v7, 0x3

    .line 607
    invoke-static {v12, v7, v6}, Ll/ۚ֡᩵;->֫(II[B)V

    const/16 v7, 0xc

    .line 610
    invoke-static {v7, v6, v8}, Ll/ۚ֡᩵;->֫(I[B[B)I

    move-result v7

    const/16 v11, 0x14

    .line 612
    invoke-static {v11, v6, v9}, Ll/ۚ֡᩵;->֫(I[B[B)I

    move-result v11

    const/16 v12, 0x1c

    .line 614
    invoke-static {v12, v6, v5}, Ll/ۚ֡᩵;->֫(I[B[B)I

    move-result v12

    const/16 v13, 0x24

    .line 616
    invoke-static {v13, v6, v1}, Ll/ۚ֡᩵;->֫(I[B[B)I

    move-result v13

    const/16 v14, 0x2c

    .line 618
    invoke-static {v14, v6, v2}, Ll/ۚ֡᩵;->֫(I[B[B)I

    move-result v2

    const/16 v14, 0x34

    .line 620
    invoke-static {v14, v6, v10}, Ll/ۚ֡᩵;->֫(I[B[B)I

    move-result v14

    const/16 v15, 0x3c

    move-object/from16 v16, v10

    .line 623
    invoke-virtual/range {p0 .. p0}, Ll/ۚ֡᩵;->֫()I

    move-result v10

    invoke-static {v15, v10, v6}, Ll/ۚ֡᩵;->֫(II[B)V

    .line 626
    invoke-virtual {v0, v4}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 627
    sget-object v4, Ll/ۚ֡᩵;->ܽ:[B

    const/16 v10, 0x40

    const/4 v15, 0x0

    const/16 v0, 0x8

    invoke-static {v4, v15, v6, v10, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_9

    :cond_a
    const/16 v0, 0x40

    const/4 v15, 0x0

    if-eqz v3, :cond_b

    :goto_9
    const/16 v0, 0x48

    :cond_b
    if-eqz v3, :cond_c

    const/16 v4, 0x10

    .line 634
    invoke-static {v3, v15, v6, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, v0, 0x10

    .line 638
    :cond_c
    invoke-static {v0, v7, v6, v8}, Ll/ۚ֡᩵;->֫(II[B[B)I

    move-result v3

    add-int/2addr v0, v3

    .line 639
    invoke-static {v0, v11, v6, v9}, Ll/ۚ֡᩵;->֫(II[B[B)I

    move-result v3

    add-int/2addr v0, v3

    .line 640
    invoke-static {v0, v12, v6, v5}, Ll/ۚ֡᩵;->֫(II[B[B)I

    move-result v3

    add-int/2addr v0, v3

    .line 641
    invoke-static {v0, v13, v6, v1}, Ll/ۚ֡᩵;->֫(II[B[B)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x0

    .line 642
    invoke-static {v0, v2, v6, v1}, Ll/ۚ֡᩵;->֫(II[B[B)I

    move-result v1

    add-int/2addr v0, v1

    move-object/from16 v1, v16

    .line 643
    invoke-static {v0, v14, v6, v1}, Ll/ۚ֡᩵;->֫(II[B[B)I

    return-object v6
.end method
