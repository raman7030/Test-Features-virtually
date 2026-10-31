.class public final Ll/ܰܽۢ;
.super Ljava/lang/Object;
.source "38GN"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "L"

    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "["

    .line 116
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 117
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v0, 0x0

    .line 119
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x46

    if-eq v0, v1, :cond_7

    const/16 v1, 0x53

    if-eq v0, v1, :cond_6

    const/16 v1, 0x56

    if-eq v0, v1, :cond_5

    const/16 v1, 0x5a

    if-eq v0, v1, :cond_4

    const/16 v1, 0x49

    if-eq v0, v1, :cond_3

    const/16 v1, 0x4a

    if-eq v0, v1, :cond_2

    packed-switch v0, :pswitch_data_0

    .line 139
    new-instance v0, Ll/ۢ᩵ܺ;

    const-string v1, "Unknown type "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    throw v0

    :pswitch_0
    const-string p0, "double"

    return-object p0

    :pswitch_1
    const-string p0, "char"

    return-object p0

    :pswitch_2
    const-string p0, "byte"

    return-object p0

    :cond_2
    const-string p0, "long"

    return-object p0

    :cond_3
    const-string p0, "int"

    return-object p0

    :cond_4
    const-string p0, "boolean"

    return-object p0

    :cond_5
    const-string p0, "void"

    return-object p0

    :cond_6
    const-string p0, "short"

    return-object p0

    :cond_7
    const-string p0, "float"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ۡۧۢ;)Ljava/lang/String;
    .locals 4

    .line 78
    invoke-static {p0}, Ll/ܰܽۢ;->ۧ(Ll/ۡۧۢ;)Ljava/lang/String;

    move-result-object v0

    .line 147
    iget-object p0, p0, Ll/ۡۧۢ;->ᩳ:Ljava/lang/String;

    .line 79
    invoke-static {p0}, Ll/ܰܽۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, " = Java.use(\""

    const-string v2, "\");"

    const-string v3, "let "

    .line 0
    invoke-static {v3, v0, v1, p0, v2}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۡۧۢ;Ll/ܳۧۢ;Ljava/util/List;)Ljava/lang/String;
    .locals 3

    .line 286
    iget-object v0, p1, Ll/ܳۧۢ;->ᩳ:Ljava/lang/String;

    const-string v1, "[a-zA-Z]\\w*"

    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "field%X"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 286
    :goto_0
    iget-object p1, p1, Ll/ܳۧۢ;->ᩳ:Ljava/lang/String;

    .line 66
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۧۢ;

    .line 202
    iget-object v1, v1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    .line 67
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p2, "_"

    .line 0
    invoke-static {p2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 566
    :cond_2
    sget-object p2, Ll/ۤۘ֡;->֫:Ll/ۛۘ֡;

    invoke-virtual {p2, p1}, Ll/ۨۘ֡;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 73
    invoke-static {p0}, Ll/ܰܽۢ;->֫(Ll/ۡۧۢ;)Ljava/lang/String;

    move-result-object p2

    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\n"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " = "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ll/ܰܽۢ;->ۧ(Ll/ۡۧۢ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".value;"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۡۧۢ;Ll/᩻ۧۢ;Ljava/util/List;)Ljava/lang/String;
    .locals 12

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    new-instance v1, Ll/۬ᩳۢ;

    .line 206
    iget-object v2, p1, Ll/᩻ۧۢ;->֫:Ljava/lang/String;

    .line 16
    invoke-direct {v1, v2}, Ll/۬ᩳۢ;-><init>(Ljava/lang/CharSequence;)V

    .line 18
    :goto_0
    invoke-virtual {v1}, Ll/۬ᩳۢ;->֫()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 19
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 147
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 148
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1a

    .line 149
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v6, "["

    .line 150
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v7, 0x5b

    .line 152
    invoke-virtual {v4, v7}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v7

    add-int/2addr v7, v5

    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 154
    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v5, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_3

    :cond_2
    add-int/lit8 v7, v3, 0x1

    .line 164
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v9

    const/4 v10, 0x3

    const/4 v11, -0x1

    sparse-switch v9, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v9, "Ljava/util/Integer;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    goto/16 :goto_2

    :cond_3
    const/16 v11, 0xe

    goto/16 :goto_2

    :sswitch_1
    const-string v9, "Ljava/lang/Object;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto/16 :goto_2

    :cond_4
    const/16 v11, 0xd

    goto/16 :goto_2

    :sswitch_2
    const-string v9, "Ljava/lang/Class;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    goto/16 :goto_2

    :cond_5
    const/16 v11, 0xc

    goto/16 :goto_2

    :sswitch_3
    const-string v9, "Ljava/lang/String;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    goto/16 :goto_2

    :cond_6
    const/16 v11, 0xb

    goto/16 :goto_2

    :sswitch_4
    const-string v9, "Ljava/util/Long;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    goto/16 :goto_2

    :cond_7
    const/16 v11, 0xa

    goto/16 :goto_2

    :sswitch_5
    const-string v9, "Ljava/util/Byte;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    goto/16 :goto_2

    :cond_8
    const/16 v11, 0x9

    goto/16 :goto_2

    :sswitch_6
    const-string v9, "Ljava/lang/Throwable;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    goto/16 :goto_2

    :cond_9
    const/16 v11, 0x8

    goto/16 :goto_2

    :sswitch_7
    const-string v9, "Ljava/util/Short;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_2

    :cond_a
    const/4 v11, 0x7

    goto :goto_2

    :sswitch_8
    const-string v9, "Ljava/util/StringBuilder;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    goto :goto_2

    :cond_b
    const/4 v11, 0x6

    goto :goto_2

    :sswitch_9
    const-string v9, "Ljava/util/Float;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_2

    :cond_c
    const/4 v11, 0x5

    goto :goto_2

    :sswitch_a
    const-string v9, "Ljava/util/Boolean;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    goto :goto_2

    :cond_d
    const/4 v11, 0x4

    goto :goto_2

    :sswitch_b
    const-string v9, "Ljava/util/Character;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    goto :goto_2

    :cond_e
    const/4 v11, 0x3

    goto :goto_2

    :sswitch_c
    const-string v9, "Ljava/lang/Exception;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    goto :goto_2

    :cond_f
    const/4 v11, 0x2

    goto :goto_2

    :sswitch_d
    const-string v9, "Ljava/util/Iterator;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    goto :goto_2

    :cond_10
    const/4 v11, 0x1

    goto :goto_2

    :sswitch_e
    const-string v9, "Ljava/util/Double;"

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    goto :goto_2

    :cond_11
    const/4 v11, 0x0

    :goto_2
    packed-switch v11, :pswitch_data_0

    .line 0
    invoke-static {v5, v5, v4}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0x2f

    .line 212
    invoke-virtual {v4, v9}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v9

    add-int/2addr v9, v5

    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0x24

    .line 213
    invoke-virtual {v4, v9}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v9

    add-int/2addr v9, v5

    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v9, "[a-zA-Z]\\w*"

    .line 214
    invoke-virtual {v4, v9}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_12

    const-string v4, "arg"

    .line 0
    invoke-static {v7, v4}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_3

    :pswitch_0
    const-string v4, "num"

    goto/16 :goto_3

    :pswitch_1
    const-string v4, "obj"

    goto/16 :goto_3

    :pswitch_2
    const-string v4, "cls"

    goto/16 :goto_3

    :pswitch_3
    const-string v4, "str"

    goto/16 :goto_3

    :pswitch_4
    const-string v4, "l"

    goto/16 :goto_3

    :pswitch_5
    const-string v4, "b"

    goto/16 :goto_3

    :pswitch_6
    const-string v4, "th"

    goto/16 :goto_3

    :pswitch_7
    const-string v4, "sh"

    goto :goto_3

    :pswitch_8
    const-string v4, "sb"

    goto :goto_3

    :pswitch_9
    const-string v4, "f"

    goto :goto_3

    :pswitch_a
    const-string v4, "bool"

    goto :goto_3

    :pswitch_b
    const-string v4, "ch"

    goto :goto_3

    :pswitch_c
    const-string v4, "ex"

    goto :goto_3

    :pswitch_d
    const-string v4, "it"

    goto :goto_3

    :pswitch_e
    const-string v4, "d"

    goto :goto_3

    .line 217
    :cond_12
    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_13

    .line 219
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    .line 221
    :cond_13
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 222
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    :cond_14
    move-object v4, v5

    goto :goto_3

    .line 225
    :cond_15
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const-string v7, "Var"

    if-ge v5, v10, :cond_16

    .line 226
    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    .line 228
    :cond_16
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 229
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    .line 0
    invoke-static {v5, v7}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_3
    if-eqz v6, :cond_17

    const-string v5, "Arr"

    invoke-static {v4, v5}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 239
    :cond_17
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    .line 240
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 243
    :cond_18
    :goto_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_19

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 246
    :cond_19
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    .line 202
    :cond_1a
    iget-object v2, p1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    const-string v3, "<clinit>"

    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    const-string v2, ".classInitializer"

    goto :goto_6

    .line 202
    :cond_1b
    iget-object v2, p1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    const-string v3, "<init>"

    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    const-string v2, "[\"$init\"]"

    goto :goto_6

    .line 29
    :cond_1c
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "[\""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    iget-object v3, p1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    .line 566
    sget-object v4, Ll/ۤۘ֡;->֫:Ll/ۛۘ֡;

    invoke-virtual {v4, v3}, Ll/ۨۘ֡;->֫(Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\"]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 32
    :goto_6
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    invoke-static {p0}, Ll/ܰܽۢ;->֫(Ll/ۡۧۢ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-static {p0}, Ll/ܰܽۢ;->ۧ(Ll/ۡۧۢ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    iget-object v4, p1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    .line 85
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v6, 0x0

    :cond_1d
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻ۧۢ;

    .line 86
    iget-object v7, v7, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1d

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_1e
    const-string p2, ", "

    if-le v6, v5, :cond_21

    const-string v4, ".overload("

    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x1

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v4, :cond_1f

    const/4 v4, 0x0

    goto :goto_9

    .line 259
    :cond_1f
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    :goto_9
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "\'"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Ll/ܰܽۢ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 262
    invoke-static {v7, v6, v8}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_20
    const-string v0, ")"

    .line 37
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_21
    const-string v0, ".implementation = function ("

    .line 40
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 41
    invoke-static {v1, v3, v0}, Ll/ܰܽۢ;->֫(Ljava/util/ArrayList;Ljava/lang/StringBuilder;Ll/᩺ܽۢ;)V

    const-string v4, ") {\n"

    const-string v6, ""

    const-string v7, "    console.log(`"

    .line 0
    invoke-static {v3, v6, v4, v7}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v4, p0, Ll/ۡۧۢ;->ۧ:Ljava/lang/String;

    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    iget-object v8, p1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    .line 43
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " is called"

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_24

    const-string v8, ": "

    .line 45
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_23

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v5, :cond_22

    const/4 v5, 0x0

    goto :goto_b

    .line 259
    :cond_22
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    :goto_b
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "=${"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "}"

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 262
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_a

    .line 45
    :cond_23
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_24
    const-string p2, "`);\n"

    .line 47
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    iget-object p2, p1, Ll/᩻ۧۢ;->ܿ:Ljava/lang/String;

    const-string v5, "V"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const-string v5, ");\n"

    const-string v8, "("

    if-eqz p2, :cond_25

    const-string p0, "    this"

    .line 0
    invoke-static {v3, p0, v2, v8}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    invoke-static {v1, v3, v0}, Ll/ܰܽۢ;->֫(Ljava/util/ArrayList;Ljava/lang/StringBuilder;Ll/᩺ܽۢ;)V

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_25
    const-string p2, "    let result = this"

    .line 0
    invoke-static {v3, p2, v2, v8}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-static {v1, v3, v0}, Ll/ܰܽۢ;->֫(Ljava/util/ArrayList;Ljava/lang/StringBuilder;Ll/᩺ܽۢ;)V

    .line 0
    invoke-static {v3, v6, v5, v7}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object p0, p0, Ll/ۡۧۢ;->ۧ:Ljava/lang/String;

    .line 56
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    iget-object p0, p1, Ll/᩻ۧۢ;->ᩳ:Ljava/lang/String;

    const-string p1, " result=${result}`);\n"

    const-string p2, "    return result;\n"

    .line 0
    invoke-static {v3, p0, p1, p2}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_c
    const-string p0, "};"

    .line 59
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5d83aea2 -> :sswitch_e
        -0x52400c9f -> :sswitch_d
        -0x45c8c6f4 -> :sswitch_c
        -0x43218922 -> :sswitch_b
        -0x2c67df41 -> :sswitch_a
        -0x20cfd3f5 -> :sswitch_9
        -0x13964223 -> :sswitch_8
        -0xad8f215 -> :sswitch_7
        -0x7af31c5 -> :sswitch_6
        0x700b807 -> :sswitch_5
        0x7890113 -> :sswitch_4
        0x523beb0a -> :sswitch_3
        0x5a7e2503 -> :sswitch_2
        0x5f790d9c -> :sswitch_1
        0x7e00ae69 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/lang/StringBuilder;Ll/᩺ܽۢ;)V
    .locals 2

    .line 255
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p2, 0x1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    :cond_0
    const-string v1, ", "

    .line 259
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۧ(Ll/ۡۧۢ;)Ljava/lang/String;
    .locals 2

    .line 143
    iget-object p0, p0, Ll/ۡۧۢ;->ۧ:Ljava/lang/String;

    const-string v0, "[a-zA-Z]\\w*"

    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 98
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    const v0, 0xffff

    and-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "cls%X"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
