.class public final Ll/᩻ܰۢ;
.super Ljava/lang/Object;
.source "Z6OZ"


# instance fields
.field public final ֫:[Z

.field public final ۧ:[I

.field public final ܽ:[Z

.field public final ᩳ:[Z


# direct methods
.method public constructor <init>(Ll/ۡܳ֡;ILl/ۖܰۢ;)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    .line 17
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-array v2, v1, [Z

    iput-object v2, v0, Ll/᩻ܰۢ;->ᩳ:[Z

    .line 19
    new-array v2, v1, [Z

    iput-object v2, v0, Ll/᩻ܰۢ;->ܽ:[Z

    .line 20
    new-array v2, v1, [I

    iput-object v2, v0, Ll/᩻ܰۢ;->ۧ:[I

    .line 21
    new-array v1, v1, [Z

    iput-object v1, v0, Ll/᩻ܰۢ;->֫:[Z

    .line 22
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    move-object/from16 v2, p1

    .line 23
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 24
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1f

    .line 25
    invoke-virtual/range {p3 .. p3}, Ll/ۖܰۢ;->֫()V

    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡܳ֡;

    .line 27
    invoke-virtual {v2}, Ll/᩵ܳ֡;->ۧ()I

    move-result v3

    const/16 v4, 0xa2

    if-eq v3, v4, :cond_1e

    const/16 v4, 0xa7

    if-ne v3, v4, :cond_1

    goto/16 :goto_c

    :cond_1
    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 32
    :goto_1
    invoke-virtual {v2}, Ll/ۡܳ֡;->getChildCount()I

    move-result v5

    if-ge v4, v5, :cond_0

    .line 33
    invoke-virtual {v2, v4}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v5

    .line 34
    instance-of v6, v5, Ll/ۡܳ֡;

    if-eqz v6, :cond_2

    check-cast v5, Ll/ۡܳ֡;

    .line 35
    invoke-virtual {v1, v5}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    goto/16 :goto_b

    .line 36
    :cond_2
    instance-of v6, v5, Ll/ۘ᩷֡;

    if-eqz v6, :cond_1d

    check-cast v5, Ll/ۘ᩷֡;

    .line 37
    invoke-interface {v5}, Ll/ۘ᩷֡;->֫()Ll/֡ܳ֡;

    move-result-object v5

    .line 44
    iget-object v6, v0, Ll/᩻ܰۢ;->ᩳ:[Z

    iget-object v7, v0, Ll/᩻ܰۢ;->ܽ:[Z

    invoke-interface {v5}, Ll/֡ܳ֡;->ܽ()I

    move-result v8

    .line 45
    invoke-virtual {v2}, Ll/᩵ܳ֡;->ۧ()I

    move-result v9

    .line 46
    invoke-interface {v5}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v5

    .line 48
    iget-object v10, v0, Ll/᩻ܰۢ;->֫:[Z

    const/16 v11, 0x6d

    const/4 v12, 0x1

    const-string v13, "if"

    const/16 v14, 0x8b

    if-eq v9, v11, :cond_6

    if-eq v9, v14, :cond_5

    const/16 v11, 0xb2

    if-eq v9, v11, :cond_3

    const/16 v11, 0x75

    if-eq v9, v11, :cond_5

    const/16 v11, 0x76

    if-eq v9, v11, :cond_5

    packed-switch v9, :pswitch_data_0

    goto :goto_2

    :cond_3
    const-string v11, "async"

    .line 59
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_8

    const-string v15, "for"

    .line 60
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    iget-object v15, v2, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v15}, Ll/֡ܳ֡;->getText()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    :cond_4
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_3

    .line 58
    :cond_5
    :pswitch_0
    iget-object v11, v2, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v11}, Ll/֡ܳ֡;->ܽ()I

    move-result v11

    if-eq v8, v11, :cond_8

    invoke-virtual {v2, v3}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v11

    instance-of v11, v11, Ll/ۡܳ֡;

    if-eqz v11, :cond_7

    goto :goto_3

    .line 61
    :cond_6
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    const-string v11, "else"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v11, 0x0

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v11, 0x1

    .line 62
    :goto_4
    aput-boolean v11, v10, v8

    const-string v10, "+"

    .line 64
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    const-string v10, "-"

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    const-string v10, "~"

    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    :cond_9
    const/16 v10, 0x8a

    if-ne v9, v10, :cond_a

    .line 65
    aput-boolean v12, v7, v8

    goto/16 :goto_b

    :cond_a
    const-string v10, "*"

    .line 66
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const/16 v13, 0x3f

    if-nez v11, :cond_b

    const-string v11, "**"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    :cond_b
    const/16 v11, 0x89

    if-eq v9, v11, :cond_c

    if-eq v9, v14, :cond_c

    if-eq v9, v13, :cond_c

    .line 68
    aput-boolean v12, v7, v8

    goto/16 :goto_b

    .line 69
    :cond_c
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    if-ne v9, v13, :cond_d

    .line 70
    aput-boolean v12, v6, v8

    goto/16 :goto_b

    :cond_d
    const-string v10, "@"

    .line 71
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    const/16 v10, 0x22

    if-ne v9, v10, :cond_e

    .line 72
    aput-boolean v12, v7, v8

    goto/16 :goto_b

    :cond_e
    const-string v10, ":"

    .line 73
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_f

    const/16 v10, 0x8f

    if-ne v9, v10, :cond_f

    .line 74
    aput-boolean v12, v6, v8

    .line 75
    aput-boolean v12, v7, v8

    goto/16 :goto_b

    :cond_f
    const-string v10, "="

    .line 76
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_15

    const/16 v5, 0xbb

    if-eq v9, v5, :cond_11

    const/16 v5, 0xbc

    if-eq v9, v5, :cond_11

    const/16 v5, 0x64

    if-ne v9, v5, :cond_10

    goto :goto_5

    :cond_10
    const/4 v5, 0x0

    goto :goto_6

    :cond_11
    :goto_5
    const/4 v5, 0x1

    :goto_6
    const/16 v10, 0x35

    if-ne v9, v10, :cond_14

    .line 115
    iget-object v5, v2, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    .line 82
    invoke-virtual {v5, v3}, Ll/ۡܳ֡;->֫(I)Ll/ܺ᩷֡;

    move-result-object v5

    .line 84
    instance-of v9, v5, Ll/ܺܽۡ;

    if-eqz v9, :cond_13

    check-cast v5, Ll/ܺܽۡ;

    .line 3619
    const-class v9, Ll/ۙܰۢ;

    invoke-virtual {v5, v9, v3}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object v5

    check-cast v5, Ll/ۙܰۢ;

    if-nez v5, :cond_12

    goto :goto_7

    :cond_12
    const/4 v12, 0x0

    :cond_13
    :goto_7
    move v5, v12

    .line 86
    :cond_14
    aput-boolean v5, v6, v8

    .line 87
    aput-boolean v5, v7, v8

    goto/16 :goto_b

    :cond_15
    const-string v10, "/"

    .line 88
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_17

    const/16 v10, 0x29

    if-eq v9, v10, :cond_16

    const/16 v10, 0x2a

    if-eq v9, v10, :cond_16

    const/16 v10, 0x95

    if-eq v9, v10, :cond_16

    const/16 v10, 0x96

    if-ne v9, v10, :cond_17

    .line 91
    :cond_16
    aput-boolean v12, v7, v8

    goto :goto_b

    :cond_17
    const-string v7, "("

    .line 92
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_18

    const-string v7, "["

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1d

    :cond_18
    const/16 v5, 0xc5

    const/16 v7, 0x8d

    if-eq v9, v7, :cond_1a

    if-eq v9, v5, :cond_1a

    const/16 v10, 0x26

    if-eq v9, v10, :cond_1a

    const/16 v10, 0x24

    if-eq v9, v10, :cond_1a

    const/16 v10, 0x61

    if-eq v9, v10, :cond_1a

    const/16 v10, 0x66

    if-eq v9, v10, :cond_1a

    const/16 v10, 0xc1

    if-eq v9, v10, :cond_1a

    const/16 v10, 0xc4

    if-ne v9, v10, :cond_19

    goto :goto_8

    :cond_19
    const/4 v10, 0x0

    goto :goto_9

    :cond_1a
    :goto_8
    const/4 v10, 0x1

    .line 93
    :goto_9
    aput-boolean v10, v6, v8

    const/16 v10, 0xb5

    if-ne v9, v10, :cond_1d

    .line 115
    iget-object v9, v2, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    .line 99
    invoke-virtual {v9}, Ll/᩵ܳ֡;->ۧ()I

    move-result v9

    if-eq v9, v7, :cond_1c

    if-ne v9, v5, :cond_1b

    goto :goto_a

    :cond_1b
    const/4 v12, 0x0

    .line 100
    :cond_1c
    :goto_a
    aput-boolean v12, v6, v8

    :cond_1d
    :goto_b
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 29
    :cond_1e
    :goto_c
    iget-object v3, v0, Ll/᩻ܰۢ;->ۧ:[I

    iget-object v4, v2, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {v4}, Ll/֡ܳ֡;->ܽ()I

    move-result v4

    iget-object v2, v2, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    invoke-interface {v2}, Ll/֡ܳ֡;->ܽ()I

    move-result v2

    aput v2, v3, v4

    goto/16 :goto_0

    :cond_1f
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7a
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
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
