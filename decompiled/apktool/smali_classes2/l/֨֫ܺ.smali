.class public final Ll/֨֫ܺ;
.super Ljava/lang/Object;
.source "PAUU"

# interfaces
.implements Ll/ܽۧܺ;


# instance fields
.field public final ֫:Ll/ܽۧܺ;

.field public final ۧ:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ll/ܽۧܺ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Ll/֨֫ܺ;->ۧ:Ljava/lang/Class;

    .line 31
    iput-object p2, p0, Ll/֨֫ܺ;->֫:Ll/ܽۧܺ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    .line 36
    iget-object v3, v2, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    const-string v4, "[]"

    if-nez v0, :cond_1

    .line 39
    iget v0, v3, Ll/ۜۧܺ;->᩶:I

    sget-object v2, Ll/᩷ۧܺ;->ۜ֫:Ll/᩷ۧܺ;

    iget v2, v2, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_0

    .line 40
    invoke-virtual {v3, v4}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 42
    :cond_0
    invoke-virtual {v3}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 48
    :cond_1
    instance-of v5, v0, [Z

    const/16 v6, 0x5d

    const/16 v7, 0x2c

    const/16 v8, 0x5b

    const/4 v9, 0x0

    if-eqz v5, :cond_5

    .line 49
    check-cast v0, [Z

    .line 50
    invoke-virtual {v3, v8}, Ll/ۜۧܺ;->write(I)V

    .line 51
    :goto_0
    array-length v2, v0

    if-ge v9, v2, :cond_4

    if-eqz v9, :cond_2

    .line 53
    invoke-virtual {v3, v7}, Ll/ۜۧܺ;->write(I)V

    .line 55
    :cond_2
    aget-boolean v2, v0, v9

    if-eqz v2, :cond_3

    const-string v2, "true"

    goto :goto_1

    :cond_3
    const-string v2, "false"

    .line 662
    :goto_1
    invoke-virtual {v3, v2}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 57
    :cond_4
    invoke-virtual {v3, v6}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 61
    :cond_5
    instance-of v5, v0, [B

    if-eqz v5, :cond_f

    .line 62
    check-cast v0, [B

    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    array-length v2, v0

    .line 330
    iget v4, v3, Ll/ۜۧܺ;->᩶:I

    sget-object v5, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v5, v5, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v4, v5

    if-eqz v4, :cond_6

    const/4 v4, 0x1

    goto :goto_2

    :cond_6
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_7

    const/16 v5, 0x27

    goto :goto_3

    :cond_7
    const/16 v5, 0x22

    :goto_3
    if-nez v2, :cond_9

    if-eqz v4, :cond_8

    const-string v0, "\'\'"

    goto :goto_4

    :cond_8
    const-string v0, "\"\""

    .line 335
    :goto_4
    invoke-virtual {v3, v0}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 339
    :cond_9
    sget-object v4, Ll/۟۟ۡ;->ܶ:[C

    .line 341
    div-int/lit8 v6, v2, 0x3

    mul-int/lit8 v6, v6, 0x3

    add-int/lit8 v7, v2, -0x1

    .line 342
    div-int/lit8 v8, v7, 0x3

    add-int/lit8 v8, v8, 0x1

    const/4 v10, 0x2

    shl-int/2addr v8, v10

    .line 344
    iget v11, v3, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v8, v11

    add-int/lit8 v12, v8, 0x2

    .line 346
    iget-object v13, v3, Ll/ۜۧܺ;->᩸:[C

    array-length v13, v13

    if-le v12, v13, :cond_a

    .line 377
    invoke-virtual {v3, v12}, Ll/ۜۧܺ;->ۧ(I)V

    .line 379
    :cond_a
    iput v12, v3, Ll/ۜۧܺ;->᩹:I

    .line 380
    iget-object v12, v3, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v13, v11, 0x1

    aput-char v5, v12, v11

    const/4 v11, 0x0

    :goto_5
    if-ge v11, v6, :cond_b

    add-int/lit8 v12, v11, 0x1

    .line 385
    aget-byte v14, v0, v11

    and-int/lit16 v14, v14, 0xff

    shl-int/lit8 v14, v14, 0x10

    add-int/lit8 v15, v11, 0x2

    aget-byte v12, v0, v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v12, v12, 0x8

    or-int/2addr v12, v14

    add-int/lit8 v11, v11, 0x3

    aget-byte v14, v0, v15

    and-int/lit16 v14, v14, 0xff

    or-int/2addr v12, v14

    .line 388
    iget-object v14, v3, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v15, v13, 0x1

    ushr-int/lit8 v16, v12, 0x12

    and-int/lit8 v16, v16, 0x3f

    aget-char v16, v4, v16

    aput-char v16, v14, v13

    add-int/lit8 v16, v13, 0x2

    ushr-int/lit8 v17, v12, 0xc

    and-int/lit8 v17, v17, 0x3f

    .line 389
    aget-char v17, v4, v17

    aput-char v17, v14, v15

    add-int/lit8 v15, v13, 0x3

    ushr-int/lit8 v17, v12, 0x6

    and-int/lit8 v17, v17, 0x3f

    .line 390
    aget-char v17, v4, v17

    aput-char v17, v14, v16

    add-int/lit8 v13, v13, 0x4

    and-int/lit8 v12, v12, 0x3f

    .line 391
    aget-char v12, v4, v12

    aput-char v12, v14, v15

    goto :goto_5

    :cond_b
    sub-int/2addr v2, v6

    if-lez v2, :cond_e

    .line 398
    aget-byte v6, v0, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v6, v6, 0xa

    if-ne v2, v10, :cond_c

    aget-byte v0, v0, v7

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v9, v0, 0x2

    :cond_c
    or-int v0, v6, v9

    .line 401
    iget-object v6, v3, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v7, v8, -0x3

    shr-int/lit8 v9, v0, 0xc

    aget-char v9, v4, v9

    aput-char v9, v6, v7

    add-int/lit8 v7, v8, -0x2

    ushr-int/lit8 v9, v0, 0x6

    and-int/lit8 v9, v9, 0x3f

    .line 402
    aget-char v9, v4, v9

    aput-char v9, v6, v7

    add-int/lit8 v7, v8, -0x1

    const/16 v9, 0x3d

    if-ne v2, v10, :cond_d

    and-int/lit8 v0, v0, 0x3f

    .line 403
    aget-char v0, v4, v0

    goto :goto_6

    :cond_d
    const/16 v0, 0x3d

    :goto_6
    aput-char v0, v6, v7

    .line 404
    aput-char v9, v6, v8

    .line 406
    :cond_e
    iget-object v0, v3, Ll/ۜۧܺ;->᩸:[C

    add-int/lit8 v8, v8, 0x1

    aput-char v5, v0, v8

    return-void

    .line 67
    :cond_f
    instance-of v5, v0, [C

    if-eqz v5, :cond_10

    .line 68
    check-cast v0, [C

    .line 69
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v3, v2}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    return-void

    .line 73
    :cond_10
    instance-of v5, v0, [D

    const/4 v10, -0x1

    if-eqz v5, :cond_15

    .line 74
    check-cast v0, [D

    .line 75
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ne v2, v10, :cond_11

    .line 80
    invoke-virtual {v3, v4}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    return-void

    .line 84
    :cond_11
    invoke-virtual {v3, v8}, Ll/ۜۧܺ;->write(I)V

    :goto_7
    if-ge v9, v2, :cond_13

    .line 86
    aget-wide v4, v0, v9

    .line 88
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v8

    if-eqz v8, :cond_12

    .line 89
    invoke-virtual {v3}, Ll/ۜۧܺ;->֫()V

    goto :goto_8

    .line 91
    :cond_12
    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    .line 94
    :goto_8
    invoke-virtual {v3, v7}, Ll/ۜۧܺ;->write(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    .line 97
    :cond_13
    aget-wide v4, v0, v2

    .line 99
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 100
    invoke-virtual {v3}, Ll/ۜۧܺ;->֫()V

    goto :goto_9

    .line 102
    :cond_14
    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    .line 105
    :goto_9
    invoke-virtual {v3, v6}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 109
    :cond_15
    instance-of v5, v0, [F

    if-eqz v5, :cond_1a

    .line 110
    check-cast v0, [F

    .line 111
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ne v2, v10, :cond_16

    .line 116
    invoke-virtual {v3, v4}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    return-void

    .line 120
    :cond_16
    invoke-virtual {v3, v8}, Ll/ۜۧܺ;->write(I)V

    :goto_a
    if-ge v9, v2, :cond_18

    .line 122
    aget v4, v0, v9

    .line 124
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_17

    .line 125
    invoke-virtual {v3}, Ll/ۜۧܺ;->֫()V

    goto :goto_b

    .line 127
    :cond_17
    invoke-static {v4}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    .line 130
    :goto_b
    invoke-virtual {v3, v7}, Ll/ۜۧܺ;->write(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    .line 133
    :cond_18
    aget v0, v0, v2

    .line 135
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_19

    .line 136
    invoke-virtual {v3}, Ll/ۜۧܺ;->֫()V

    goto :goto_c

    .line 138
    :cond_19
    invoke-static {v0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    .line 141
    :goto_c
    invoke-virtual {v3, v6}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 145
    :cond_1a
    instance-of v4, v0, [I

    if-eqz v4, :cond_1d

    .line 146
    check-cast v0, [I

    .line 148
    invoke-virtual {v3, v8}, Ll/ۜۧܺ;->write(I)V

    .line 149
    :goto_d
    array-length v2, v0

    if-ge v9, v2, :cond_1c

    if-eqz v9, :cond_1b

    .line 151
    invoke-virtual {v3, v7}, Ll/ۜۧܺ;->write(I)V

    .line 153
    :cond_1b
    aget v2, v0, v9

    invoke-virtual {v3, v2}, Ll/ۜۧܺ;->writeInt(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_d

    .line 155
    :cond_1c
    invoke-virtual {v3, v6}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 159
    :cond_1d
    instance-of v4, v0, [J

    if-eqz v4, :cond_20

    .line 160
    check-cast v0, [J

    .line 162
    invoke-virtual {v3, v8}, Ll/ۜۧܺ;->write(I)V

    .line 163
    :goto_e
    array-length v2, v0

    if-ge v9, v2, :cond_1f

    if-eqz v9, :cond_1e

    .line 165
    invoke-virtual {v3, v7}, Ll/ۜۧܺ;->write(I)V

    .line 167
    :cond_1e
    aget-wide v4, v0, v9

    invoke-virtual {v3, v4, v5}, Ll/ۜۧܺ;->ۧ(J)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_e

    .line 169
    :cond_1f
    invoke-virtual {v3, v6}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 173
    :cond_20
    instance-of v4, v0, [S

    if-eqz v4, :cond_23

    .line 174
    check-cast v0, [S

    .line 175
    invoke-virtual {v3, v8}, Ll/ۜۧܺ;->write(I)V

    .line 176
    :goto_f
    array-length v2, v0

    if-ge v9, v2, :cond_22

    if-eqz v9, :cond_21

    .line 178
    invoke-virtual {v3, v7}, Ll/ۜۧܺ;->write(I)V

    .line 180
    :cond_21
    aget-short v2, v0, v9

    invoke-virtual {v3, v2}, Ll/ۜۧܺ;->writeInt(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_f

    .line 182
    :cond_22
    invoke-virtual {v3, v6}, Ll/ۜۧܺ;->write(I)V

    return-void

    .line 186
    :cond_23
    move-object v4, v0

    check-cast v4, [Ljava/lang/Object;

    .line 187
    array-length v5, v4

    .line 189
    iget-object v9, v2, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    move-object/from16 v10, p3

    .line 190
    invoke-virtual {v2, v9, v0, v10}, Ll/ۛ֫ܺ;->֫(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 193
    :try_start_0
    invoke-virtual {v3, v8}, Ll/ۜۧܺ;->write(I)V

    const/4 v8, 0x0

    :goto_10
    if-ge v8, v5, :cond_29

    if-eqz v8, :cond_24

    .line 196
    invoke-virtual {v3, v7}, Ll/ۜۧܺ;->write(I)V

    .line 198
    :cond_24
    aget-object v10, v4, v8

    if-nez v10, :cond_27

    .line 201
    sget-object v10, Ll/᩷ۧܺ;->ۢ֫:Ll/᩷ۧܺ;

    .line 109
    iget v11, v3, Ll/ۜۧܺ;->᩶:I

    iget v10, v10, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v10, v11

    if-eqz v10, :cond_25

    const/4 v10, 0x1

    goto :goto_11

    :cond_25
    const/4 v10, 0x0

    :goto_11
    if-eqz v10, :cond_26

    .line 201
    instance-of v10, v0, [Ljava/lang/String;

    if-eqz v10, :cond_26

    const-string v10, ""

    .line 202
    invoke-virtual {v3, v10}, Ll/ۜۧܺ;->֫(Ljava/lang/String;)V

    goto :goto_12

    :cond_26
    const-string v10, "null"

    .line 204
    invoke-virtual {v3, v10}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    goto :goto_12

    .line 206
    :cond_27
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    iget-object v12, v1, Ll/֨֫ܺ;->ۧ:Ljava/lang/Class;

    const/4 v13, 0x0

    if-ne v11, v12, :cond_28

    .line 207
    iget-object v11, v1, Ll/֨֫ܺ;->֫:Ll/ܽۧܺ;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v2, v10, v12, v13}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_12

    .line 209
    :cond_28
    iget-object v11, v2, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v11, v12}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v11

    .line 210
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v2, v10, v12, v13}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :goto_12
    add-int/lit8 v8, v8, 0x1

    goto :goto_10

    .line 213
    :cond_29
    invoke-virtual {v3, v6}, Ll/ۜۧܺ;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    iput-object v9, v2, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    return-void

    :catchall_0
    move-exception v0

    iput-object v9, v2, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 216
    throw v0
.end method
