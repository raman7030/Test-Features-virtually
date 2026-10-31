.class public final Ll/᩷ܽܽ;
.super Ljava/lang/Object;
.source "6AO6"


# direct methods
.method public static ֫(Ll/ۚۖܽ;)Ljava/lang/String;
    .locals 20

    .line 49
    new-instance v0, Ll/ܺܽܽ;

    invoke-direct {v0}, Ll/ܺܽܽ;-><init>()V

    const-string v1, "utf-8"

    move-object/from16 v2, p0

    .line 50
    invoke-virtual {v0, v2, v1}, Ll/ܺܽܽ;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    new-instance v2, Ljava/util/Stack;

    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    .line 56
    :goto_0
    invoke-virtual {v0}, Ll/ܺܽܽ;->next()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_9

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    goto :goto_1

    .line 144
    :cond_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 145
    new-instance v3, Ll/᩵ܽܽ;

    invoke-virtual {v0}, Ll/ܺܽܽ;->getText()Ljava/lang/String;

    move-result-object v4

    .line 156
    invoke-direct {v3, v4}, Ll/֡ܽܽ;-><init>(Ljava/lang/String;)V

    .line 146
    invoke-virtual {v2}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܽܽ;

    invoke-virtual {v4, v3}, Ll/֡ܽܽ;->֫(Ll/֡ܽܽ;)V

    goto :goto_1

    .line 138
    :cond_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    .line 139
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    :cond_2
    :goto_1
    move-object/from16 v16, v0

    move-object/from16 v18, v1

    move-object/from16 p0, v2

    goto/16 :goto_5

    .line 59
    :cond_3
    new-instance v3, Ll/֡ܽܽ;

    invoke-virtual {v0}, Ll/ܺܽܽ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ll/֡ܽܽ;-><init>(Ljava/lang/String;)V

    .line 60
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    .line 61
    invoke-virtual {v2}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܽܽ;

    invoke-virtual {v4, v3}, Ll/֡ܽܽ;->֫(Ll/֡ܽܽ;)V

    goto :goto_2

    .line 63
    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    :goto_2
    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    invoke-virtual {v0}, Ll/ܺܽܽ;->getAttributeCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_2

    .line 68
    invoke-virtual {v0, v5}, Ll/ܺܽܽ;->֫(I)I

    move-result v6

    .line 69
    invoke-virtual {v0, v5}, Ll/ܺܽܽ;->getAttributeName(I)Ljava/lang/String;

    move-result-object v7

    .line 70
    invoke-virtual {v0, v5}, Ll/ܺܽܽ;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "-null"

    const-string v10, "-interned"

    const-string v11, "-hex"

    const-string v12, "-base64"

    const-string v13, "0x"

    const-string v14, "-0x"

    const-string v15, "-"

    move-object/from16 v16, v0

    const-string v0, "-float"

    move-object/from16 p0, v2

    const-string v2, "-double"

    move/from16 v17, v4

    const-string v4, "-bool"

    move-object/from16 v18, v1

    const-string v1, "-int"

    move/from16 v19, v5

    const-string v5, "-long"

    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_4

    .line 0
    :sswitch_0
    invoke-static {v7, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_4

    :sswitch_1
    invoke-static {v7, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_4

    :sswitch_2
    invoke-static {v7, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_4

    :sswitch_3
    invoke-static {v7, v5}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 116
    invoke-virtual {v8, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v8, v0}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_4

    .line 119
    :cond_5
    invoke-virtual {v13, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto/16 :goto_4

    .line 0
    :sswitch_4
    invoke-static {v7, v5}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_4

    :sswitch_5
    const/4 v0, 0x1

    invoke-static {v7, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 105
    invoke-virtual {v8, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v8, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    .line 108
    :cond_6
    invoke-virtual {v13, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_4

    .line 0
    :sswitch_6
    invoke-static {v7, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :sswitch_7
    invoke-static {v7, v12}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :sswitch_8
    invoke-static {v7, v11}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    :sswitch_9
    invoke-static {v7, v10}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    .line 77
    :sswitch_a
    invoke-virtual {v7, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    const-string v9, "-str"

    if-nez v6, :cond_7

    .line 78
    invoke-virtual {v7, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 79
    invoke-virtual {v7, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 80
    invoke-virtual {v7, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 81
    invoke-virtual {v7, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 82
    invoke-virtual {v7, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 83
    invoke-virtual {v7, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 84
    invoke-virtual {v7, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 85
    invoke-virtual {v7, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 86
    invoke-virtual {v7, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 88
    :cond_7
    invoke-virtual {v7, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_4

    .line 0
    :sswitch_b
    invoke-static {v7, v9}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, ""

    .line 133
    :cond_8
    :goto_4
    invoke-virtual {v3, v7, v8}, Ll/֡ܽܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v5, v19, 0x1

    move-object/from16 v2, p0

    move-object/from16 v0, v16

    move/from16 v4, v17

    move-object/from16 v1, v18

    goto/16 :goto_3

    :goto_5
    move-object/from16 v2, p0

    move-object/from16 v0, v16

    move-object/from16 v1, v18

    goto/16 :goto_0

    :cond_9
    move-object/from16 v18, v1

    const-string v0, "\n"

    .line 152
    invoke-static {v1, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x30 -> :sswitch_9
        0x40 -> :sswitch_8
        0x50 -> :sswitch_7
        0x60 -> :sswitch_6
        0x70 -> :sswitch_5
        0x80 -> :sswitch_4
        0x90 -> :sswitch_3
        0xa0 -> :sswitch_2
        0xb0 -> :sswitch_1
        0xc0 -> :sswitch_0
        0xd0 -> :sswitch_0
    .end sparse-switch
.end method
