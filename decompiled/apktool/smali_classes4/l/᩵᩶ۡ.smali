.class public final Ll/᩵᩶ۡ;
.super Ljava/lang/Object;
.source "Z81J"


# direct methods
.method public static ֫(I)Ljava/lang/String;
    .locals 5

    const/high16 v0, -0x1000000

    and-int v1, p0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const v4, 0xffffff

    if-eq v1, v0, :cond_0

    and-int v0, p0, v4

    .line 268
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    ushr-int/lit8 p0, p0, 0x18

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v3

    aput-object p0, v1, v2

    const-string p0, "#%06X%02X"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    and-int/2addr p0, v4

    .line 271
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p0, v0, v3

    const-string p0, "#%06X"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܶ᩹ۡ;)Ljava/lang/String;
    .locals 8

    .line 17
    new-instance v0, Ll/᩺ۖܽ;

    invoke-direct {v0}, Ll/᩺ۖܽ;-><init>()V

    .line 18
    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 20
    iget-object p0, p0, Ll/ܶ᩹ۡ;->۫:Ll/۠᩹ۡ;

    iget-object p0, p0, Ll/۠᩹ۡ;->ܺ:Ll/֨᩹ۡ;

    .line 22
    iget v2, p0, Ll/֨᩹ۡ;->ۧ:F

    .line 23
    iget v3, p0, Ll/֨᩹ۡ;->֫:F

    .line 24
    iget v4, p0, Ll/֨᩹ۡ;->ᩴ:F

    .line 25
    iget v5, p0, Ll/֨᩹ۡ;->ۘ:F

    .line 28
    iget-object p0, p0, Ll/֨᩹ۡ;->ۢ:Ll/᩵᩹ۡ;

    const-string v6, "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"

    .line 31
    invoke-virtual {v1, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const-string v6, "<svg xmlns=\"http://www.w3.org/2000/svg\""

    .line 32
    invoke-virtual {v1, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 33
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, " width=\""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 34
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, " height=\""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 35
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, " viewBox=\"0 0 "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, ">"

    .line 36
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 39
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    invoke-static {p0, v2}, Ll/᩵᩶ۡ;->֫(Ll/᩵᩹ۡ;Ljava/util/ArrayList;)V

    .line 43
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "  <defs>"

    .line 44
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 45
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘ᩹ۡ;

    const-string v5, "clip"

    .line 0
    invoke-static {v3, v5}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 48
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "    <clipPath id=\""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\">"

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 49
    iget-object v4, v4, Ll/ۚ᩹ۡ;->ܽ:Ljava/lang/String;

    .line 50
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 51
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "      <path d=\""

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\" />"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_0
    const-string v4, "    </clipPath>"

    .line 53
    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const-string v3, "  </defs>"

    .line 55
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_2
    const/4 v3, 0x1

    .line 59
    invoke-static {p0, v1, v3, v2}, Ll/᩵᩶ۡ;->֫(Ll/᩵᩹ۡ;Ljava/io/PrintWriter;ILjava/util/ArrayList;)V

    const-string p0, "</svg>"

    .line 61
    invoke-virtual {v1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 62
    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    .line 64
    invoke-virtual {v0}, Ll/᩺ۖܽ;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩵᩹ۡ;Ljava/io/PrintWriter;ILjava/util/ArrayList;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 80
    invoke-virtual/range {p0 .. p0}, Ll/᩵᩹ۡ;->ۧ()Ljava/lang/String;

    move-result-object v3

    .line 81
    iget v4, v0, Ll/᩵᩹ۡ;->ۢ:F

    .line 82
    iget v5, v0, Ll/᩵᩹ۡ;->ۡ:F

    .line 83
    iget v6, v0, Ll/᩵᩹ۡ;->ܳ:F

    .line 84
    iget v7, v0, Ll/᩵᩹ۡ;->᩻:F

    .line 85
    iget v8, v0, Ll/᩵᩹ۡ;->ۜ:F

    .line 86
    iget v9, v0, Ll/᩵᩹ۡ;->ᩳ:F

    .line 87
    iget v10, v0, Ll/᩵᩹ۡ;->ܿ:F

    .line 90
    iget-object v0, v0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    .line 91
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_0
    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 95
    instance-of v14, v13, Ll/ۘ᩹ۡ;

    if-eqz v14, :cond_0

    check-cast v13, Ll/ۘ᩹ۡ;

    .line 97
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v13

    if-ltz v13, :cond_0

    .line 99
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 106
    :cond_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v12, :cond_3

    cmpl-float v12, v4, v15

    if-nez v12, :cond_3

    cmpl-float v12, v5, v15

    if-nez v12, :cond_3

    cmpl-float v12, v6, v15

    if-nez v12, :cond_3

    cmpl-float v12, v7, v13

    if-nez v12, :cond_3

    cmpl-float v12, v8, v13

    if-nez v12, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-gt v12, v14, :cond_3

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-lez v12, :cond_2

    goto :goto_1

    :cond_2
    const/4 v12, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v12, 0x1

    :goto_2
    const-string v14, "\""

    if-eqz v12, :cond_f

    .line 109
    invoke-static/range {p2 .. p2}, Ll/᩵᩶ۡ;->ۧ(I)Ljava/lang/String;

    move-result-object v13

    .line 110
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "<g"

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1, v13}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 112
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_4

    .line 113
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v15, " id=\""

    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 116
    :cond_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    const/4 v3, 0x0

    .line 117
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 118
    new-instance v13, Ljava/lang/StringBuilder;

    const-string v15, " clip-path=\"url(#clip"

    invoke-direct {v13, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")\""

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 122
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const-string v13, ")"

    const-string v15, " "

    const/16 v16, 0x0

    cmpl-float v17, v4, v16

    if-nez v17, :cond_7

    cmpl-float v17, v5, v16

    if-eqz v17, :cond_6

    goto :goto_3

    :cond_6
    move/from16 v17, v12

    goto :goto_4

    :cond_7
    :goto_3
    move/from16 v17, v12

    .line 125
    new-instance v12, Ljava/lang/StringBuilder;

    const-string v2, "translate("

    invoke-direct {v12, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    const/4 v2, 0x0

    cmpl-float v4, v6, v2

    if-eqz v4, :cond_a

    const-string v4, "rotate("

    cmpl-float v5, v9, v2

    if-nez v5, :cond_9

    cmpl-float v5, v10, v2

    if-eqz v5, :cond_8

    goto :goto_5

    .line 132
    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 130
    :cond_9
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_6
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v4, v7, v2

    if-nez v4, :cond_b

    cmpl-float v4, v8, v2

    if-eqz v4, :cond_c

    .line 137
    :cond_b
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "scale("

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    :cond_c
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    .line 141
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, " transform=\""

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_d
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_e
    const-string v2, ">"

    .line 144
    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v2, p2, 0x1

    .line 147
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    :goto_8
    if-ge v4, v3, :cond_10

    .line 148
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    .line 149
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v7, v2, 0x1

    invoke-static {v2}, Ll/᩵᩶ۡ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "<g clip-path=\"url(#clip"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")\">"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    move v2, v7

    goto :goto_8

    :cond_f
    move/from16 v17, v12

    move/from16 v2, p2

    .line 154
    :cond_10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 155
    instance-of v4, v3, Ll/ᩴ᩹ۡ;

    if-eqz v4, :cond_19

    check-cast v3, Ll/ᩴ᩹ۡ;

    .line 174
    invoke-static {v2}, Ll/᩵᩶ۡ;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    .line 175
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "<path"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 178
    iget-object v4, v3, Ll/ۚ᩹ۡ;->ܽ:Ljava/lang/String;

    .line 179
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_11

    .line 180
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, " d=\""

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 184
    :cond_11
    iget-object v4, v3, Ll/ᩴ᩹ۡ;->ܳ:Ll/᩻ۗ;

    invoke-virtual {v4}, Ll/᩻ۗ;->֫()I

    move-result v4

    if-eqz v4, :cond_12

    .line 186
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, " fill=\""

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ll/᩵᩶ۡ;->֫(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 190
    :cond_12
    iget-object v4, v3, Ll/ᩴ᩹ۡ;->ۜ:Ll/᩻ۗ;

    invoke-virtual {v4}, Ll/᩻ۗ;->֫()I

    move-result v4

    if-eqz v4, :cond_13

    .line 192
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, " stroke=\""

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Ll/᩵᩶ۡ;->֫(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 196
    :cond_13
    iget v4, v3, Ll/ᩴ᩹ۡ;->ܺ:F

    const/4 v5, 0x0

    cmpl-float v6, v4, v5

    if-lez v6, :cond_14

    .line 198
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, " stroke-width=\""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 202
    :cond_14
    iget-object v4, v3, Ll/ᩴ᩹ۡ;->᩷:Landroid/graphics/Paint$Cap;

    if-eqz v4, :cond_15

    .line 204
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v6, "butt"

    .line 205
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    .line 206
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, " stroke-linecap=\""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 211
    :cond_15
    iget-object v4, v3, Ll/ᩴ᩹ۡ;->ۢ:Landroid/graphics/Paint$Join;

    if-eqz v4, :cond_16

    .line 213
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v6, "miter"

    .line 214
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_16

    .line 215
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, " stroke-linejoin=\""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 220
    :cond_16
    iget v4, v3, Ll/ᩴ᩹ۡ;->ܿ:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v7, v4, v6

    if-eqz v7, :cond_17

    .line 222
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, " fill-opacity=\""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 226
    :cond_17
    iget v3, v3, Ll/ᩴ᩹ۡ;->᩻:F

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v6, v3, v4

    if-eqz v6, :cond_18

    .line 228
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, " stroke-opacity=\""

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    :cond_18
    const-string v3, " />"

    .line 231
    invoke-virtual {v1, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto/16 :goto_9

    :cond_19
    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    .line 157
    instance-of v6, v3, Ll/᩵᩹ۡ;

    if-eqz v6, :cond_1a

    check-cast v3, Ll/᩵᩹ۡ;

    move-object/from16 v6, p3

    .line 158
    invoke-static {v3, v1, v2, v6}, Ll/᩵᩶ۡ;->֫(Ll/᩵᩹ۡ;Ljava/io/PrintWriter;ILjava/util/ArrayList;)V

    goto/16 :goto_9

    :cond_1a
    move-object/from16 v6, p3

    goto/16 :goto_9

    :cond_1b
    if-eqz v17, :cond_1d

    .line 163
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const-string v3, "</g>"

    if-nez v0, :cond_1c

    .line 164
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v4, 0x1

    :goto_a
    if-ge v4, v0, :cond_1c

    .line 165
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2}, Ll/᩵᩶ۡ;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_1c
    add-int/lit8 v2, v2, -0x1

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2}, Ll/᩵᩶ۡ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :cond_1d
    return-void
.end method

.method public static ֫(Ll/᩵᩹ۡ;Ljava/util/ArrayList;)V
    .locals 2

    .line 69
    iget-object p0, p0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡᩹ۡ;

    .line 70
    instance-of v1, v0, Ll/ۘ᩹ۡ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۘ᩹ۡ;

    .line 71
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 72
    :cond_1
    instance-of v1, v0, Ll/᩵᩹ۡ;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩵᩹ۡ;

    .line 73
    invoke-static {v0, p1}, Ll/᩵᩶ۡ;->֫(Ll/᩵᩹ۡ;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ۧ(I)Ljava/lang/String;
    .locals 3

    .line 257
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    const-string v2, "  "

    .line 259
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 261
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
