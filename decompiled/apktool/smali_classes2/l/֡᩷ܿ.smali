.class public final Ll/֡᩷ܿ;
.super Ljava/lang/Object;
.source "37JR"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/᩶۫᩷;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/֡᩷ܿ;->֫:Ljava/lang/String;

    return-void
.end method

.method private ֫(Ljava/lang/String;IILjava/lang/String;)Z
    .locals 5

    const-string v0, "MT"

    .line 173
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    .line 174
    invoke-static {v1, p1}, Ll/᩵ۖܿ;->ܽ(ILjava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v2, v0

    .line 176
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x3e

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3c

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3d

    if-eq v3, v4, :cond_1

    const/16 v4, 0x21

    if-ne v3, v4, :cond_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 179
    :cond_2
    invoke-static {v2, p1}, Ll/᩵ۖܿ;->ܽ(ILjava/lang/String;)I

    move-result v3

    if-le v0, v1, :cond_3

    if-le v2, v0, :cond_3

    if-le v3, v2, :cond_3

    .line 181
    invoke-static {v3, p1}, Ll/᩵ۖܿ;->ᩳ(ILjava/lang/String;)I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ne v1, v4, :cond_3

    .line 193
    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 194
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 196
    invoke-static {p2, p1}, Ll/᩵ۖܿ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_3
    add-int/lit8 p2, p2, 0x1

    .line 185
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, "Missing condition after #"

    .line 186
    invoke-virtual {p1, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    const-string p4, "Invalid condition: "

    .line 188
    invoke-virtual {p4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 190
    :goto_2
    new-instance p4, Ll/ۘۜܿ;

    iget-object v0, p0, Ll/֡᩷ܿ;->֫:Ljava/lang/String;

    invoke-direct {p4, v0, p2, p3, p1}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    throw p4
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 19
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    new-instance v3, Ljava/util/Stack;

    invoke-direct {v3}, Ljava/util/Stack;-><init>()V

    .line 22
    new-instance v4, Ll/᩵᩷ܿ;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct {v4, v5, v6, v7, v6}, Ll/᩵᩷ܿ;-><init>(Ljava/lang/String;IZZ)V

    invoke-virtual {v3, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, v0

    .line 25
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v9

    const-string v10, "\n"

    iget-object v11, v8, Ll/֡᩷ܿ;->֫:Ljava/lang/String;

    if-gt v4, v9, :cond_1e

    const/16 v9, 0xa

    .line 26
    invoke-virtual {v1, v9, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v9

    if-gez v9, :cond_0

    .line 28
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v9

    .line 30
    :cond_0
    invoke-virtual {v1, v4, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    add-int/2addr v7, v9

    .line 32
    invoke-static {v6, v4}, Ll/᩵ۖܿ;->ܽ(ILjava/lang/String;)I

    move-result v6

    .line 33
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v6, v9, :cond_1

    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v12, 0x23

    if-ne v9, v12, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    add-int/lit8 v12, v6, 0x1

    move v13, v12

    if-eqz v9, :cond_2

    .line 37
    :goto_2
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v14

    if-ge v13, v14, :cond_2

    .line 38
    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v15, 0x61

    if-lt v14, v15, :cond_2

    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    move-result v14

    const/16 v15, 0x7a

    if-gt v14, v15, :cond_2

    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_2
    if-eqz v9, :cond_3

    .line 42
    invoke-virtual {v4, v12, v13}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v14

    goto :goto_3

    :cond_3
    const-string v14, ""

    :goto_3
    const-string v15, "if"

    .line 204
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    move/from16 v17, v7

    const-string v7, "error"

    move-object/from16 v18, v8

    const-string v8, "endif"

    const-string v1, "else"

    move/from16 v19, v9

    const-string v9, "elif"

    if-nez v16, :cond_5

    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_5

    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_5

    .line 205
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_5

    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_4

    goto :goto_4

    :cond_4
    move-object v8, v0

    move v7, v12

    goto/16 :goto_10

    .line 210
    :cond_5
    :goto_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v13, v0, :cond_6

    move/from16 v16, v12

    goto :goto_6

    .line 213
    :cond_6
    invoke-static {v13, v4}, Ll/᩵ۖܿ;->ܽ(ILjava/lang/String;)I

    move-result v0

    if-le v0, v13, :cond_1a

    move/from16 v16, v12

    .line 218
    :goto_5
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v0, v12, :cond_7

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-static {v12}, Ll/᩵ۖܿ;->֫(C)Z

    move-result v12

    if-nez v12, :cond_7

    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 214
    :cond_7
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v12

    if-ne v0, v12, :cond_19

    :goto_6
    const/4 v0, 0x0

    .line 44
    invoke-virtual {v4, v0, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-virtual {v4, v13}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 47
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v12, -0x1

    sparse-switch v6, :sswitch_data_0

    goto :goto_7

    :sswitch_0
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_7

    :cond_8
    const/4 v12, 0x4

    goto :goto_7

    :sswitch_1
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_7

    :cond_9
    const/4 v12, 0x3

    goto :goto_7

    :sswitch_2
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_7

    :cond_a
    const/4 v12, 0x2

    goto :goto_7

    :sswitch_3
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_7

    :cond_b
    const/4 v12, 0x1

    goto :goto_7

    :sswitch_4
    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_7

    :cond_c
    const/4 v12, 0x0

    :goto_7
    packed-switch v12, :pswitch_data_0

    :goto_8
    move-object/from16 v8, p0

    goto/16 :goto_e

    .line 124
    :pswitch_0
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵᩷ܿ;

    .line 125
    iget-boolean v1, v1, Ll/᩵᩷ܿ;->ᩳ:Z

    if-eqz v1, :cond_e

    .line 126
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v0, "#error"

    .line 130
    :cond_d
    new-instance v1, Ll/᩵ۤۡ;

    .line 14
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 130
    throw v1

    :cond_e
    const-string v1, "//#error"

    .line 0
    invoke-static {v2, v0, v1, v4, v10}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_8

    .line 103
    :pswitch_1
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v6, 0x1

    if-le v1, v6, :cond_10

    .line 111
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    .line 118
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 119
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "//#endif\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_f
    add-int/lit8 v5, v5, 0x1

    .line 115
    new-instance v0, Ll/ۘۜܿ;

    const-string v1, "Unexpected content after #endif"

    invoke-direct {v0, v11, v5, v13, v1}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    throw v0

    :cond_10
    add-int/lit8 v5, v5, 0x1

    .line 107
    new-instance v0, Ll/ۘۜܿ;

    const-string v1, "Unexpected #endif"

    move/from16 v7, v16

    invoke-direct {v0, v11, v5, v7, v1}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    throw v0

    :pswitch_2
    move/from16 v7, v16

    const/4 v1, 0x1

    .line 77
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    if-le v6, v1, :cond_13

    .line 85
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 92
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵᩷ܿ;

    .line 93
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵᩷ܿ;

    .line 96
    iget-boolean v4, v4, Ll/᩵᩷ܿ;->ᩳ:Z

    if-eqz v4, :cond_11

    iget-boolean v1, v1, Ll/᩵᩷ܿ;->֫:Z

    if-nez v1, :cond_11

    const/4 v1, 0x1

    goto :goto_9

    :cond_11
    const/4 v1, 0x0

    .line 97
    :goto_9
    new-instance v4, Ll/᩵᩷ܿ;

    add-int/lit8 v6, v5, 0x1

    const/4 v7, 0x1

    invoke-direct {v4, v14, v6, v1, v7}, Ll/᩵᩷ܿ;-><init>(Ljava/lang/String;IZZ)V

    invoke-virtual {v3, v4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "//#else\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_8

    :cond_12
    add-int/lit8 v5, v5, 0x1

    .line 89
    new-instance v0, Ll/ۘۜܿ;

    const-string v1, "Unexpected content after #else"

    invoke-direct {v0, v11, v5, v13, v1}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    throw v0

    :cond_13
    add-int/lit8 v5, v5, 0x1

    .line 81
    new-instance v0, Ll/ۘۜܿ;

    const-string v1, "Unexpected #else"

    invoke-direct {v0, v11, v5, v7, v1}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    throw v0

    :pswitch_3
    move/from16 v7, v16

    const/4 v1, 0x1

    .line 58
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    if-le v6, v1, :cond_17

    .line 64
    invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵᩷ܿ;

    .line 65
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵᩷ܿ;

    .line 67
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, p0

    invoke-direct {v8, v7, v5, v13, v14}, Ll/֡᩷ܿ;->֫(Ljava/lang/String;IILjava/lang/String;)Z

    move-result v7

    .line 69
    iget-boolean v6, v6, Ll/᩵᩷ܿ;->ᩳ:Z

    if-eqz v6, :cond_14

    iget-boolean v6, v1, Ll/᩵᩷ܿ;->֫:Z

    if-nez v6, :cond_14

    if-eqz v7, :cond_14

    const/4 v6, 0x1

    goto :goto_a

    :cond_14
    const/4 v6, 0x0

    .line 70
    :goto_a
    iget-boolean v1, v1, Ll/᩵᩷ܿ;->֫:Z

    if-nez v1, :cond_16

    if-eqz v7, :cond_15

    goto :goto_b

    :cond_15
    const/4 v1, 0x0

    goto :goto_c

    :cond_16
    :goto_b
    const/4 v1, 0x1

    .line 71
    :goto_c
    new-instance v7, Ll/᩵᩷ܿ;

    add-int/lit8 v9, v5, 0x1

    invoke-direct {v7, v14, v9, v6, v1}, Ll/᩵᩷ܿ;-><init>(Ljava/lang/String;IZZ)V

    invoke-virtual {v3, v7}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "//#elif"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_e

    :cond_17
    move-object/from16 v8, p0

    add-int/lit8 v5, v5, 0x1

    .line 62
    new-instance v0, Ll/ۘۜܿ;

    const-string v1, "Unexpected #elif"

    invoke-direct {v0, v11, v5, v7, v1}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    throw v0

    :pswitch_4
    move-object/from16 v8, p0

    .line 49
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v8, v1, v5, v13, v14}, Ll/֡᩷ܿ;->֫(Ljava/lang/String;IILjava/lang/String;)Z

    move-result v1

    .line 50
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵᩷ܿ;

    .line 51
    iget-boolean v6, v6, Ll/᩵᩷ܿ;->ᩳ:Z

    if-eqz v6, :cond_18

    if-eqz v1, :cond_18

    const/4 v6, 0x1

    goto :goto_d

    :cond_18
    const/4 v6, 0x0

    .line 53
    :goto_d
    new-instance v7, Ll/᩵᩷ܿ;

    add-int/lit8 v9, v5, 0x1

    invoke-direct {v7, v14, v9, v6, v1}, Ll/᩵᩷ܿ;-><init>(Ljava/lang/String;IZZ)V

    invoke-virtual {v3, v7}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "//#if"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_e
    move-object/from16 v18, v8

    goto :goto_11

    :cond_19
    move-object/from16 v8, p0

    move/from16 v7, v16

    goto :goto_f

    :cond_1a
    move-object/from16 v8, p0

    move v7, v12

    :goto_f
    move-object/from16 v18, v8

    :goto_10
    if-nez v19, :cond_1c

    .line 147
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵᩷ܿ;

    .line 148
    iget-boolean v0, v0, Ll/᩵᩷ܿ;->ᩳ:Z

    if-eqz v0, :cond_1b

    .line 149
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_11

    :cond_1b
    const-string v0, "//"

    .line 0
    invoke-static {v2, v0, v4, v10}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_11
    add-int/lit8 v5, v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object/from16 v1, p1

    move-object v0, v8

    move/from16 v4, v17

    move-object/from16 v8, v18

    goto/16 :goto_0

    :cond_1c
    add-int/lit8 v5, v5, 0x1

    move v0, v7

    .line 218
    :goto_12
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1d

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ll/᩵ۖܿ;->֫(C)Z

    move-result v1

    if-nez v1, :cond_1d

    add-int/lit8 v0, v0, 0x1

    goto :goto_12

    .line 141
    :cond_1d
    invoke-virtual {v4, v7, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unknown directive: #"

    .line 0
    invoke-static {v1, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 143
    new-instance v1, Ll/ۘۜܿ;

    invoke-direct {v1, v11, v5, v6, v0}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    throw v1

    :cond_1e
    move-object v8, v0

    .line 156
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_20

    move-object/from16 v0, p1

    .line 165
    invoke-virtual {v0, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1f

    .line 166
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 169
    :cond_1f
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 157
    :cond_20
    invoke-virtual {v3}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵᩷ܿ;

    .line 158
    iget v1, v0, Ll/᩵᩷ܿ;->ܽ:I

    .line 160
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unclosed #"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll/᩵᩷ܿ;->ۧ:Ljava/lang/String;

    const-string v3, " block"

    .line 0
    invoke-static {v2, v0, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 161
    new-instance v2, Ll/ۘۜܿ;

    const/4 v3, 0x0

    invoke-direct {v2, v11, v1, v3, v0}, Ll/ۘۜܿ;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    throw v2

    :sswitch_data_0
    .sparse-switch
        0xd1d -> :sswitch_4
        0x2f8c04 -> :sswitch_3
        0x2f8d39 -> :sswitch_2
        0x5c2cb38 -> :sswitch_1
        0x5c4d208 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
