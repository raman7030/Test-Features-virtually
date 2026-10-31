.class public final Ll/۫᩹ۡ;
.super Ljava/lang/Object;
.source "7553"


# static fields
.field public static final ֫:[F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [F

    .line 31
    sput-object v0, Ll/۫᩹ۡ;->֫:[F

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/۬᩹ۡ;)[Ll/ۖ᩶ۡ;
    .locals 18

    .line 184
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 185
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 189
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    sget-object v6, Ll/۫᩹ۡ;->֫:[F

    if-ge v3, v5, :cond_14

    .line 169
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v7, 0x65

    const/16 v8, 0x7a

    const/16 v9, 0x61

    const/16 v10, 0x45

    const/16 v11, 0x5a

    const/16 v12, 0x41

    if-ge v3, v5, :cond_2

    .line 170
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-gt v12, v5, :cond_0

    if-gt v5, v11, :cond_0

    if-ne v5, v10, :cond_2

    :cond_0
    if-gt v9, v5, :cond_1

    if-gt v5, v8, :cond_1

    if-eq v5, v7, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 191
    :cond_2
    :goto_2
    invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 192
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    .line 111
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v10, v8, :cond_12

    if-ne v10, v11, :cond_3

    goto/16 :goto_f

    :cond_3
    if-eq v10, v9, :cond_5

    if-ne v10, v12, :cond_4

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v6, 0x1

    .line 117
    :goto_4
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    new-array v8, v8, [F

    .line 122
    new-instance v9, Ll/ۗ᩹ۡ;

    .line 33
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 123
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v10

    const/4 v11, 0x1

    const/4 v12, 0x0

    :goto_5
    if-ge v11, v10, :cond_10

    .line 132
    sget-object v13, Ll/۬᩹ۡ;->᩶:Ll/۬᩹ۡ;

    move-object/from16 v14, p1

    if-ne v14, v13, :cond_7

    if-eqz v6, :cond_7

    rem-int/lit8 v13, v12, 0x7

    const/4 v15, 0x3

    if-eq v13, v15, :cond_6

    rem-int/lit8 v13, v12, 0x7

    const/4 v15, 0x4

    if-ne v13, v15, :cond_7

    :cond_6
    const/4 v13, 0x1

    goto :goto_6

    :cond_7
    const/4 v13, 0x0

    .line 60
    :goto_6
    invoke-static {v9, v2}, Ll/ۗ᩹ۡ;->֫(Ll/ۗ᩹ۡ;Z)V

    const/4 v2, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v17, v10

    move v2, v11

    const/16 p0, 0x0

    .line 65
    :goto_7
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v10

    if-ge v2, v10, :cond_d

    .line 68
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v14, 0x20

    if-eq v10, v14, :cond_b

    const/16 v14, 0x45

    if-eq v10, v14, :cond_a

    const/16 v14, 0x65

    if-eq v10, v14, :cond_a

    packed-switch v10, :pswitch_data_0

    goto :goto_8

    :pswitch_0
    if-eqz v16, :cond_8

    goto :goto_a

    :cond_8
    const/4 v10, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x1

    goto :goto_9

    :pswitch_1
    if-eq v2, v11, :cond_9

    if-nez v15, :cond_9

    goto :goto_a

    :cond_9
    :goto_8
    move/from16 v10, p0

    goto :goto_b

    :cond_a
    const/4 v10, 0x1

    const/4 v15, 0x1

    :goto_9
    move/from16 v10, p0

    goto :goto_c

    :cond_b
    :pswitch_2
    const/4 v10, 0x1

    .line 73
    invoke-static {v9, v10}, Ll/ۗ᩹ۡ;->֫(Ll/ۗ᩹ۡ;Z)V

    :goto_a
    const/4 v10, 0x1

    :goto_b
    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_c
    if-nez v10, :cond_d

    if-eqz v13, :cond_c

    if-le v2, v11, :cond_c

    goto :goto_d

    :cond_c
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v14, p1

    move/from16 p0, v10

    goto :goto_7

    .line 99
    :cond_d
    :goto_d
    invoke-static {v9, v2}, Ll/ۗ᩹ۡ;->֫(Ll/ۗ᩹ۡ;I)V

    .line 137
    invoke-static {v9}, Ll/ۗ᩹ۡ;->֫(Ll/ۗ᩹ۡ;)I

    move-result v2

    if-ge v11, v2, :cond_e

    add-int/lit8 v10, v12, 0x1

    .line 140
    invoke-virtual {v5, v11, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v11

    aput v11, v8, v12

    move v12, v10

    .line 143
    :cond_e
    invoke-static {v9}, Ll/ۗ᩹ۡ;->ۧ(Ll/ۗ᩹ۡ;)Z

    move-result v10

    if-eqz v10, :cond_f

    add-int/lit8 v2, v2, 0x1

    :cond_f
    move v11, v2

    const/4 v2, 0x0

    move/from16 v10, v17

    goto/16 :goto_5

    :cond_10
    if-eqz v6, :cond_11

    const/4 v2, 0x0

    :goto_e
    add-int/lit8 v6, v12, -0x1

    if-ge v2, v6, :cond_11

    .line 154
    aget v6, v8, v2

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    aput v6, v8, v2

    add-int/lit8 v6, v2, 0x1

    .line 155
    aget v9, v8, v6

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    aput v9, v8, v6

    add-int/lit8 v2, v2, 0x7

    goto :goto_e

    :cond_11
    const/4 v2, 0x0

    .line 158
    invoke-static {v8, v2, v12}, Ljava/util/Arrays;->copyOfRange([FII)[F

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_f

    :catch_0
    move-exception v0

    .line 160
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Error in parsing \""

    const-string v3, "\""

    .line 0
    invoke-static {v2, v5, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 160
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_12
    :goto_f
    if-nez v4, :cond_13

    const/16 v2, 0x4d

    if-eq v7, v2, :cond_13

    const/16 v4, 0x6d

    if-eq v7, v4, :cond_13

    const/4 v4, 0x2

    new-array v4, v4, [F

    .line 165
    new-instance v5, Ll/ۖ᩶ۡ;

    invoke-direct {v5, v2, v4}, Ll/ۖ᩶ۡ;-><init>(C[F)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    new-instance v2, Ll/ۖ᩶ۡ;

    invoke-direct {v2, v7, v6}, Ll/ۖ᩶ۡ;-><init>(C[F)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v3, 0x1

    const/4 v4, 0x0

    move v4, v3

    move v3, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_14
    sub-int/2addr v3, v4

    const/4 v2, 0x1

    if-ne v3, v2, :cond_15

    .line 207
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v4, v2, :cond_15

    .line 208
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 165
    new-instance v2, Ll/ۖ᩶ۡ;

    invoke-direct {v2, v0, v6}, Ll/ۖ᩶ۡ;-><init>(C[F)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    const/4 v0, 0x0

    new-array v0, v0, [Ll/ۖ᩶ۡ;

    .line 210
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۖ᩶ۡ;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
