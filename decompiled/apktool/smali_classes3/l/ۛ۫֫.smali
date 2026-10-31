.class public final Ll/ۛ۫֫;
.super Ll/֨֡֫;
.source "18H2"


# instance fields
.field public ۢ:[I

.field public ᩷:[I


# virtual methods
.method public final ֫(Ljava/nio/ByteBuffer;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 88
    iget-object v2, v0, Ll/ۛ۫֫;->᩷:[I

    .line 155
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    move-result v3

    .line 90
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->limit()I

    move-result v4

    sub-int v5, v4, v3

    .line 91
    iget-object v6, v0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v6, v6, Ll/ᩴ֡֫;->֫:I

    div-int/2addr v5, v6

    .line 92
    iget-object v6, v0, Ll/֨֡֫;->ܿ:Ll/ᩴ֡֫;

    iget v6, v6, Ll/ᩴ֡֫;->֫:I

    mul-int v5, v5, v6

    .line 93
    invoke-virtual {v0, v5}, Ll/֨֡֫;->֫(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    :goto_0
    if-ge v3, v4, :cond_e

    .line 95
    array-length v6, v2

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v6, :cond_d

    aget v8, v2, v7

    .line 96
    iget-object v9, v0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v9, v9, Ll/ᩴ֡֫;->ܽ:I

    invoke-static {v9}, Ll/ۘ֨֫;->ܽ(I)I

    move-result v9

    mul-int v9, v9, v8

    add-int/2addr v9, v3

    .line 97
    iget-object v8, v0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v8, v8, Ll/ᩴ֡֫;->ܽ:I

    const/4 v10, 0x2

    if-eq v8, v10, :cond_c

    const/4 v10, 0x3

    if-eq v8, v10, :cond_b

    const/4 v11, 0x4

    if-eq v8, v11, :cond_a

    const/16 v11, 0x15

    if-eq v8, v11, :cond_2

    const/16 v11, 0x16

    if-eq v8, v11, :cond_1

    const/high16 v11, 0x10000000

    if-eq v8, v11, :cond_c

    const/high16 v11, 0x50000000

    if-eq v8, v11, :cond_2

    const/high16 v10, 0x60000000

    if-ne v8, v10, :cond_0

    goto :goto_2

    .line 117
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected encoding: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v3, v3, Ll/ᩴ֡֫;->ܽ:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 111
    :cond_1
    :goto_2
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    goto/16 :goto_9

    .line 3492
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v8

    sget-object v11, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v8, v11, :cond_3

    move v8, v9

    goto :goto_3

    :cond_3
    add-int/lit8 v8, v9, 0x2

    :goto_3
    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    add-int/lit8 v12, v9, 0x1

    .line 3493
    invoke-virtual {v1, v12}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v12

    .line 3494
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v13

    if-ne v13, v11, :cond_4

    add-int/lit8 v9, v9, 0x2

    :cond_4
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v9

    shl-int/lit8 v8, v8, 0x18

    const/high16 v13, -0x1000000

    and-int/2addr v8, v13

    shl-int/lit8 v12, v12, 0x10

    const/high16 v14, 0xff0000

    and-int/2addr v12, v14

    or-int/2addr v8, v12

    shl-int/lit8 v9, v9, 0x8

    const v12, 0xff00

    and-int/2addr v9, v12

    or-int/2addr v8, v9

    shr-int/lit8 v8, v8, 0x8

    and-int v9, v8, v13

    if-eqz v9, :cond_6

    const/high16 v9, -0x800000    # Float.NEGATIVE_INFINITY

    and-int v13, v8, v9

    if-ne v13, v9, :cond_5

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v9, 0x1

    .line 3512
    :goto_5
    new-instance v13, Ljava/lang/StringBuilder;

    const v15, 0xff00

    const-string v12, "Value out of range of 24-bit integer: "

    invoke-direct {v13, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3514
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 3512
    invoke-static {v12, v9}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 3515
    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    move-result v9

    if-lt v9, v10, :cond_7

    const/4 v12, 0x1

    goto :goto_6

    :cond_7
    const/4 v12, 0x0

    :goto_6
    invoke-static {v12}, Ll/᩺֡֫;->֫(Z)V

    .line 3517
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v9

    if-ne v9, v11, :cond_8

    and-int v9, v8, v14

    shr-int/lit8 v9, v9, 0x10

    goto :goto_7

    :cond_8
    and-int/lit16 v9, v8, 0xff

    :goto_7
    int-to-byte v9, v9

    and-int v10, v8, v15

    shr-int/lit8 v10, v10, 0x8

    int-to-byte v10, v10

    .line 3522
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v12

    if-ne v12, v11, :cond_9

    and-int/lit16 v8, v8, 0xff

    goto :goto_8

    :cond_9
    and-int/2addr v8, v14

    shr-int/lit8 v8, v8, 0x10

    :goto_8
    int-to-byte v8, v8

    .line 3525
    invoke-virtual {v5, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_9

    .line 114
    :cond_a
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->getFloat(I)F

    move-result v8

    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    goto :goto_9

    .line 99
    :cond_b
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v8

    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_9

    .line 103
    :cond_c
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v8

    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    :goto_9
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 120
    :cond_d
    iget-object v6, v0, Ll/֨֡֫;->ܽ:Ll/ᩴ֡֫;

    iget v6, v6, Ll/ᩴ֡֫;->֫:I

    add-int/2addr v3, v6

    goto/16 :goto_0

    .line 122
    :cond_e
    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 123
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-void
.end method

.method public final ֫([I)V
    .locals 0

    .line 53
    iput-object p1, p0, Ll/ۛ۫֫;->ۢ:[I

    return-void
.end method

.method public final ۜ()V
    .locals 1

    const/4 v0, 0x0

    .line 133
    iput-object v0, p0, Ll/ۛ۫֫;->᩷:[I

    .line 134
    iput-object v0, p0, Ll/ۛ۫֫;->ۢ:[I

    return-void
.end method

.method public final ۧ(Ll/ᩴ֡֫;)Ll/ᩴ֡֫;
    .locals 6

    .line 59
    iget v0, p1, Ll/ᩴ֡֫;->ܽ:I

    iget-object v1, p0, Ll/ۛ۫֫;->ۢ:[I

    if-nez v1, :cond_0

    .line 61
    sget-object p1, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    return-object p1

    .line 64
    :cond_0
    iget v2, p1, Ll/ᩴ֡֫;->ۧ:I

    invoke-static {v0}, Ll/ۘ֨֫;->ۜ(I)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 68
    array-length v3, v1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    .line 69
    :goto_1
    array-length v5, v1

    if-ge v4, v5, :cond_4

    .line 70
    aget v5, v1, v4

    if-ge v5, v2, :cond_3

    if-eq v5, v4, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    or-int/2addr v3, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 72
    :cond_3
    new-instance v0, Ll/᩵֡֫;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Channel map ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") trying to access non-existent input channel."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/᩵֡֫;-><init>(Ljava/lang/String;Ll/ᩴ֡֫;)V

    throw v0

    :cond_4
    if-eqz v3, :cond_5

    .line 81
    new-instance v2, Ll/ᩴ֡֫;

    iget p1, p1, Ll/ᩴ֡֫;->ᩳ:I

    array-length v1, v1

    invoke-direct {v2, p1, v1, v0}, Ll/ᩴ֡֫;-><init>(III)V

    return-object v2

    .line 83
    :cond_5
    sget-object p1, Ll/ᩴ֡֫;->ܿ:Ll/ᩴ֡֫;

    return-object p1

    .line 65
    :cond_6
    new-instance v0, Ll/᩵֡֫;

    invoke-direct {v0, p1}, Ll/᩵֡֫;-><init>(Ll/ᩴ֡֫;)V

    throw v0
.end method

.method public final ܳ()V
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۛ۫֫;->ۢ:[I

    iput-object v0, p0, Ll/ۛ۫֫;->᩷:[I

    return-void
.end method
