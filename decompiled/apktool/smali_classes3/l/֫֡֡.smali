.class public final Ll/֫֡֡;
.super Ll/ܺ֨֡;
.source "Y8XU"


# virtual methods
.method public final ֫(Ll/᩵᩵֡;Ll/ᩴ֨֡;)Ll/᩷᩵֡;
    .locals 16

    .line 207
    move-object/from16 v0, p2

    check-cast v0, Ll/ۘ᩵֡;

    invoke-virtual {v0}, Ll/ۘ᩵֡;->֫()Ll/ۖ֨֡;

    move-result-object v1

    .line 209
    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->ܽ()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    if-lt v2, v4, :cond_0

    goto/16 :goto_8

    .line 212
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->ᩳ()I

    move-result v2

    .line 213
    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->ۧ()I

    move-result v5

    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->ܽ()I

    move-result v6

    add-int/2addr v6, v5

    .line 214
    invoke-virtual {v0}, Ll/ۘ᩵֡;->ۧ()Ll/ᩳ֨֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩳ֨֡;->ᩳ()Z

    move-result v0

    .line 216
    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->getLine()Ll/ܽ֨֡;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܽ֨֡;->֫()Ljava/lang/CharSequence;

    move-result-object v5

    .line 116
    invoke-interface {v5, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    const/16 v8, 0x2a

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/16 v11, 0x20

    const/16 v12, 0x9

    if-eq v7, v8, :cond_4

    const/16 v8, 0x2b

    if-eq v7, v8, :cond_4

    const/16 v8, 0x2d

    if-eq v7, v8, :cond_4

    .line 138
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v7

    const/4 v8, 0x0

    move v13, v2

    :goto_0
    if-ge v13, v7, :cond_5

    .line 140
    invoke-interface {v5, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    const/16 v15, 0x29

    if-eq v14, v15, :cond_2

    const/16 v15, 0x2e

    if-eq v14, v15, :cond_2

    packed-switch v14, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    add-int/lit8 v8, v8, 0x1

    if-le v8, v12, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    if-lt v8, v10, :cond_5

    add-int/lit8 v7, v13, 0x1

    .line 176
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v7, v8, :cond_3

    .line 177
    invoke-interface {v5, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-eq v8, v12, :cond_3

    if-eq v8, v11, :cond_3

    goto :goto_1

    .line 160
    :cond_3
    invoke-interface {v5, v2, v13}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    .line 161
    new-instance v13, Ll/ܶۚ֡;

    invoke-direct {v13}, Ll/ܶۚ֡;-><init>()V

    .line 162
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v13, v8}, Ll/ܶۚ֡;->֫(Ljava/lang/Integer;)V

    .line 163
    invoke-static {v14}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v13, v8}, Ll/ܶۚ֡;->֫(Ljava/lang/String;)V

    .line 164
    new-instance v8, Ll/ܽ֡֡;

    invoke-direct {v8, v13, v7}, Ll/ܽ֡֡;-><init>(Ll/ᩴۚ֡;I)V

    goto :goto_2

    :cond_4
    add-int/lit8 v8, v2, 0x1

    .line 176
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-ge v8, v13, :cond_6

    .line 177
    invoke-interface {v5, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-eq v13, v12, :cond_6

    if-eq v13, v11, :cond_6

    :cond_5
    :goto_1
    move-object v8, v3

    goto :goto_2

    .line 123
    :cond_6
    new-instance v13, Ll/ܰ֡֡;

    invoke-direct {v13}, Ll/ܰ֡֡;-><init>()V

    .line 124
    invoke-static {v7}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13, v7}, Ll/ܰ֡֡;->֫(Ljava/lang/String;)V

    .line 125
    new-instance v7, Ll/ܽ֡֡;

    invoke-direct {v7, v13, v8}, Ll/ܽ֡֡;-><init>(Ll/ᩴۚ֡;I)V

    move-object v8, v7

    :goto_2
    if-nez v8, :cond_7

    goto :goto_6

    .line 71
    :cond_7
    iget-object v7, v8, Ll/ܽ֡֡;->ۧ:Ll/ᩴۚ֡;

    .line 73
    iget v8, v8, Ll/ܽ֡֡;->֫:I

    sub-int v2, v8, v2

    add-int/2addr v2, v6

    .line 82
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v6

    move v13, v2

    :goto_3
    if-ge v8, v6, :cond_a

    .line 84
    invoke-interface {v5, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    if-ne v14, v12, :cond_8

    .line 8
    rem-int/lit8 v14, v13, 0x4

    rsub-int/lit8 v14, v14, 0x4

    add-int/2addr v14, v13

    move v13, v14

    goto :goto_4

    :cond_8
    if-ne v14, v11, :cond_9

    add-int/lit8 v13, v13, 0x1

    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_9
    const/4 v5, 0x1

    goto :goto_5

    :cond_a
    const/4 v5, 0x0

    :goto_5
    if-nez v0, :cond_c

    .line 97
    instance-of v0, v7, Ll/ܶۚ֡;

    if-eqz v0, :cond_b

    move-object v0, v7

    check-cast v0, Ll/ܶۚ֡;

    .line 98
    invoke-virtual {v0}, Ll/ܶۚ֡;->ۡ()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v0, v10, :cond_b

    goto :goto_6

    :cond_b
    if-nez v5, :cond_c

    :goto_6
    move-object v0, v3

    goto :goto_7

    :cond_c
    if-eqz v5, :cond_d

    sub-int v0, v13, v2

    if-le v0, v4, :cond_e

    :cond_d
    add-int/lit8 v13, v2, 0x1

    .line 112
    :cond_e
    new-instance v0, Ll/ۧ֡֡;

    invoke-direct {v0, v7, v13}, Ll/ۧ֡֡;-><init>(Ll/ᩴۚ֡;I)V

    :goto_7
    if-nez v0, :cond_f

    :goto_8
    return-object v3

    .line 217
    :cond_f
    iget-object v2, v0, Ll/ۧ֡֡;->ۧ:Ll/ᩴۚ֡;

    .line 221
    iget v0, v0, Ll/ۧ֡֡;->֫:I

    .line 222
    new-instance v3, Ll/ܿ֡֡;

    .line 223
    invoke-virtual/range {p1 .. p1}, Ll/᩵᩵֡;->ۧ()I

    move-result v4

    sub-int v4, v0, v4

    invoke-direct {v3, v4}, Ll/ܿ֡֡;-><init>(I)V

    .line 226
    instance-of v4, v1, Ll/ᩳ֡֡;

    if-eqz v4, :cond_13

    .line 227
    check-cast v1, Ll/ᩳ֡֡;

    invoke-virtual {v1}, Ll/ᩳ֡֡;->ܿ()Ll/ۨ֡֡;

    move-result-object v1

    check-cast v1, Ll/ᩴۚ֡;

    .line 194
    instance-of v4, v1, Ll/ܰ֡֡;

    if-eqz v4, :cond_10

    instance-of v4, v2, Ll/ܰ֡֡;

    if-eqz v4, :cond_10

    .line 195
    check-cast v1, Ll/ܰ֡֡;

    invoke-virtual {v1}, Ll/ܰ֡֡;->ۢ()Ljava/lang/String;

    move-result-object v1

    move-object v4, v2

    check-cast v4, Ll/ܰ֡֡;

    invoke-virtual {v4}, Ll/ܰ֡֡;->ۢ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_9

    .line 196
    :cond_10
    instance-of v4, v1, Ll/ܶۚ֡;

    if-eqz v4, :cond_11

    instance-of v4, v2, Ll/ܶۚ֡;

    if-eqz v4, :cond_11

    .line 197
    check-cast v1, Ll/ܶۚ֡;

    .line 198
    invoke-virtual {v1}, Ll/ܶۚ֡;->ۢ()Ljava/lang/String;

    move-result-object v1

    move-object v4, v2

    check-cast v4, Ll/ܶۚ֡;

    invoke-virtual {v4}, Ll/ܶۚ֡;->ۢ()Ljava/lang/String;

    move-result-object v4

    .line 197
    invoke-static {v1, v4}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    goto :goto_9

    :cond_11
    const/4 v1, 0x0

    :goto_9
    if-nez v1, :cond_12

    goto :goto_a

    :cond_12
    new-array v1, v10, [Ll/ۖ֨֡;

    aput-object v3, v1, v9

    .line 17
    new-instance v2, Ll/᩷᩵֡;

    invoke-direct {v2, v1}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 236
    invoke-virtual {v2, v0}, Ll/᩷᩵֡;->֫(I)Ll/᩷᩵֡;

    return-object v2

    .line 229
    :cond_13
    :goto_a
    new-instance v1, Ll/ᩳ֡֡;

    invoke-direct {v1, v2}, Ll/ᩳ֡֡;-><init>(Ll/ᩴۚ֡;)V

    .line 232
    invoke-virtual {v2, v10}, Ll/ᩴۚ֡;->֫(Z)V

    const/4 v2, 0x2

    new-array v2, v2, [Ll/ۖ֨֡;

    aput-object v1, v2, v9

    aput-object v3, v2, v10

    .line 17
    new-instance v1, Ll/᩷᩵֡;

    invoke-direct {v1, v2}, Ll/᩷᩵֡;-><init>([Ll/ۖ֨֡;)V

    .line 234
    invoke-virtual {v1, v0}, Ll/᩷᩵֡;->֫(I)Ll/᩷᩵֡;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
