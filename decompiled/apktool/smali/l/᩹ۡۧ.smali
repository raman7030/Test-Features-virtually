.class public final Ll/᩹ۡۧ;
.super Ll/ܶۡۧ;
.source "W8OQ"


# virtual methods
.method public final ֫(Ll/۠ۡۧ;Ljava/nio/ByteBuffer;)Ll/᩻᩵֫;
    .locals 16

    .line 54
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    const/16 v1, 0x74

    const/4 v2, 0x0

    if-ne v0, v1, :cond_7

    .line 56
    new-instance v0, Ll/ܽ֨֫;

    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    move-result v3

    invoke-direct {v0, v1, v3}, Ll/ܽ֨֫;-><init>([BI)V

    const/16 v1, 0xc

    .line 63
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ܿ(I)V

    .line 64
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v3

    .line 65
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܽ()I

    move-result v4

    add-int/2addr v4, v3

    const/4 v3, 0x4

    sub-int/2addr v4, v3

    const/16 v5, 0x2c

    .line 69
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 71
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    .line 75
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܳ(I)V

    const/16 v5, 0x10

    .line 78
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ܿ(I)V

    .line 80
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 81
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܽ()I

    move-result v7

    if-ge v7, v4, :cond_5

    const/16 v7, 0x30

    .line 86
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v7, 0x8

    .line 88
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v8

    .line 91
    invoke-virtual {v0, v3}, Ll/ܽ֨֫;->ܿ(I)V

    .line 93
    invoke-virtual {v0, v1}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 95
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܽ()I

    move-result v10

    add-int/2addr v10, v9

    move-object v9, v2

    move-object v11, v9

    .line 96
    :goto_1
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܽ()I

    move-result v12

    if-ge v12, v10, :cond_4

    .line 97
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    .line 98
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v13

    .line 99
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܽ()I

    move-result v14

    add-int/2addr v14, v13

    const/4 v15, 0x2

    if-ne v12, v15, :cond_2

    .line 103
    invoke-virtual {v0, v5}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    .line 105
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ܿ(I)V

    const/4 v13, 0x3

    if-ne v12, v13, :cond_3

    .line 109
    :cond_1
    invoke-virtual {v0}, Ll/ܽ֨֫;->ܽ()I

    move-result v12

    if-ge v12, v14, :cond_3

    .line 110
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v9

    .line 111
    sget-object v12, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 300
    new-array v13, v9, [B

    .line 301
    invoke-virtual {v0, v9, v13}, Ll/ܽ֨֫;->ۧ(I[B)V

    .line 302
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v13, v12}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 113
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v12

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v12, :cond_1

    .line 117
    invoke-virtual {v0, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v15

    .line 118
    invoke-virtual {v0, v15}, Ll/ܽ֨֫;->ܳ(I)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_2
    const/16 v15, 0x15

    if-ne v12, v15, :cond_3

    .line 124
    sget-object v11, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 300
    new-array v12, v13, [B

    .line 301
    invoke-virtual {v0, v13, v12}, Ll/ܽ֨֫;->ۧ(I[B)V

    .line 302
    new-instance v13, Ljava/lang/String;

    invoke-direct {v13, v12, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v11, v13

    :cond_3
    mul-int/lit8 v14, v14, 0x8

    .line 127
    invoke-virtual {v0, v14}, Ll/ܽ֨֫;->ᩳ(I)V

    goto :goto_1

    :cond_4
    mul-int/lit8 v10, v10, 0x8

    .line 130
    invoke-virtual {v0, v10}, Ll/ܽ֨֫;->ᩳ(I)V

    if-eqz v9, :cond_0

    if-eqz v11, :cond_0

    .line 133
    new-instance v7, Ll/᩸ۡۧ;

    invoke-virtual {v9, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Ll/᩸ۡۧ;-><init>(ILjava/lang/String;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 137
    :cond_5
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    new-instance v0, Ll/᩻᩵֫;

    invoke-direct {v0, v6}, Ll/᩻᩵֫;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_7
    :goto_3
    return-object v2
.end method
