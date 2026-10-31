.class public final Ll/᩻ۤۢ;
.super Ljava/lang/Object;
.source "V6OB"

# interfaces
.implements Ljava/lang/CharSequence;


# instance fields
.field public final ᩶:Ljava/lang/CharSequence;

.field public final ᩸:Ljava/util/ArrayList;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 16
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Ll/᩻ۤۢ;->᩸:Ljava/util/ArrayList;

    .line 17
    iput-object v1, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 18
    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v3, v4, :cond_2b

    .line 19
    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    const-string v4, "<?"

    const/4 v5, 0x2

    .line 26
    invoke-static {v1, v2, v3, v4, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_2a

    .line 57
    iget-object v4, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    add-int/lit8 v7, v3, 0x5

    const-string v8, "<?xml"

    const/4 v9, 0x5

    .line 58
    invoke-static {v4, v6, v3, v8, v9}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 47
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v7, v6, :cond_4

    .line 59
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/۫۫ۢ;->֫(C)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_3

    .line 47
    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v7, v6, :cond_1

    .line 60
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/۫۫ۢ;->֫(C)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 62
    :cond_1
    iget-object v6, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const-string v8, "version"

    const/4 v9, 0x7

    .line 26
    invoke-static {v6, v2, v7, v8, v9}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x7

    .line 47
    :goto_2
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v7, v6, :cond_3

    .line 64
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/۫۫ۢ;->֫(C)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 47
    :cond_3
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v7, v6, :cond_4

    .line 65
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v6, 0x3d

    if-ne v4, v6, :cond_4

    goto/16 :goto_18

    :cond_4
    :goto_3
    add-int/lit8 v4, v3, 0x2

    .line 70
    iget-object v6, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    move v7, v4

    .line 47
    :goto_4
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const/16 v9, 0xa

    const/16 v10, 0xd

    if-ge v7, v8, :cond_27

    .line 71
    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    .line 72
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    .line 73
    iget-object v11, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const-string v12, "?>"

    .line 26
    invoke-static {v11, v2, v7, v12, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_5

    goto/16 :goto_11

    :cond_5
    const/16 v11, 0x27

    if-eq v8, v11, :cond_22

    const/16 v13, 0x22

    if-eq v8, v13, :cond_22

    const/16 v14, 0x60

    if-ne v8, v14, :cond_6

    goto/16 :goto_13

    .line 76
    :cond_6
    iget-object v14, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const-string v15, "/*"

    .line 26
    invoke-static {v14, v2, v7, v15, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v14

    if-eqz v14, :cond_8

    add-int/lit8 v7, v7, 0x2

    .line 47
    :goto_5
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v7, v8, :cond_7

    .line 78
    iget-object v8, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const-string v9, "*/"

    .line 26
    invoke-static {v8, v2, v7, v9, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v8

    if-nez v8, :cond_7

    .line 78
    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 47
    :cond_7
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v2

    add-int/lit8 v7, v7, 0x2

    .line 79
    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    goto/16 :goto_15

    .line 80
    :cond_8
    iget-object v14, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const-string v15, "//"

    .line 26
    invoke-static {v14, v2, v7, v15, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v14

    if-nez v14, :cond_1f

    const/16 v14, 0x23

    if-ne v8, v14, :cond_9

    .line 80
    iget-object v8, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const-string v14, "#["

    .line 26
    invoke-static {v8, v2, v7, v14, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_10

    .line 87
    :cond_9
    iget-object v5, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const-string v8, "<<<"

    const/4 v12, 0x3

    .line 26
    invoke-static {v5, v2, v7, v8, v12}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1d

    add-int/lit8 v7, v7, 0x3

    .line 116
    invoke-direct {v0, v7}, Ll/᩻ۤۢ;->ܽ(I)I

    move-result v2

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-ge v2, v5, :cond_a

    .line 117
    invoke-interface {v6, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    goto :goto_6

    :cond_a
    const/4 v5, 0x0

    :goto_6
    if-eq v5, v11, :cond_c

    if-ne v5, v13, :cond_b

    goto :goto_7

    :cond_b
    const/4 v7, 0x0

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v7, 0x1

    :goto_8
    if-eqz v7, :cond_d

    add-int/lit8 v2, v2, 0x1

    .line 47
    :cond_d
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-eq v2, v8, :cond_1c

    .line 121
    invoke-interface {v6, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ll/᩻ۤۢ;->ۧ(C)Z

    move-result v8

    if-nez v8, :cond_e

    goto/16 :goto_e

    :cond_e
    move v8, v2

    .line 47
    :goto_9
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-ge v8, v12, :cond_f

    .line 122
    invoke-interface {v6, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    invoke-static {v12}, Ll/᩻ۤۢ;->֫(C)Z

    move-result v12

    if-eqz v12, :cond_f

    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_f
    if-eqz v7, :cond_10

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-eq v8, v7, :cond_1c

    add-int/lit8 v7, v8, 0x1

    .line 124
    invoke-interface {v6, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v5, :cond_11

    goto/16 :goto_e

    :cond_10
    move v7, v8

    .line 125
    :cond_11
    invoke-direct {v0, v7}, Ll/᩻ۤۢ;->ܽ(I)I

    move-result v7

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-eq v7, v12, :cond_1c

    .line 126
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v10, :cond_12

    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    if-eq v12, v9, :cond_12

    goto/16 :goto_e

    :cond_12
    add-int/lit8 v12, v7, 0x1

    .line 127
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-ne v13, v10, :cond_13

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-ge v12, v13, :cond_13

    .line 127
    invoke-interface {v6, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v13

    if-ne v13, v9, :cond_13

    add-int/lit8 v12, v7, 0x2

    .line 47
    :cond_13
    :goto_a
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v12, v7, :cond_1c

    .line 129
    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    .line 130
    invoke-direct {v0, v12}, Ll/᩻ۤۢ;->ܽ(I)I

    move-result v7

    add-int v13, v7, v8

    sub-int/2addr v13, v2

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-gt v13, v14, :cond_17

    move v14, v2

    :goto_b
    if-ge v14, v8, :cond_15

    .line 146
    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    add-int/lit8 v15, v7, 0x1

    .line 147
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-interface {v6, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-eq v7, v11, :cond_14

    goto :goto_c

    :cond_14
    add-int/lit8 v14, v14, 0x1

    move v7, v15

    const/16 v11, 0x27

    goto :goto_b

    .line 47
    :cond_15
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-eq v13, v7, :cond_16

    .line 133
    invoke-interface {v6, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ll/᩻ۤۢ;->֫(C)Z

    move-result v7

    if-nez v7, :cond_17

    :cond_16
    move v2, v13

    goto :goto_f

    .line 47
    :cond_17
    :goto_c
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v12, v7, :cond_19

    .line 134
    invoke-interface {v6, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eq v7, v10, :cond_19

    invoke-interface {v6, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eq v7, v9, :cond_19

    .line 135
    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    const/16 v7, 0x27

    if-eq v5, v7, :cond_18

    .line 136
    invoke-direct {v0, v12}, Ll/᩻ۤۢ;->ۧ(I)Z

    move-result v7

    if-eqz v7, :cond_18

    goto :goto_e

    :cond_18
    add-int/lit8 v12, v12, 0x1

    goto :goto_c

    .line 47
    :cond_19
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v12, v7, :cond_1b

    add-int/lit8 v7, v12, 0x1

    .line 139
    invoke-interface {v6, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-ne v11, v10, :cond_1a

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-ge v7, v11, :cond_1a

    .line 139
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v11

    if-ne v11, v9, :cond_1a

    add-int/lit8 v12, v12, 0x2

    goto :goto_d

    :cond_1a
    move v12, v7

    :cond_1b
    :goto_d
    const/16 v11, 0x27

    goto/16 :goto_a

    .line 47
    :cond_1c
    :goto_e
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v2

    :goto_f
    add-int/lit8 v2, v2, -0x1

    goto :goto_12

    :cond_1d
    if-eq v7, v4, :cond_1e

    add-int/lit8 v2, v7, -0x1

    .line 89
    invoke-interface {v6, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ll/᩻ۤۢ;->֫(C)Z

    move-result v2

    if-nez v2, :cond_21

    :cond_1e
    iget-object v2, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const-string v5, "__halt_compiler"

    const/16 v8, 0xf

    const/4 v11, 0x1

    .line 90
    invoke-static {v2, v11, v7, v5, v8}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_21

    add-int/lit8 v2, v7, 0xf

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-eq v2, v5, :cond_27

    .line 91
    invoke-interface {v6, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ll/᩻ۤۢ;->֫(C)Z

    move-result v2

    if-nez v2, :cond_21

    goto :goto_16

    .line 47
    :cond_1f
    :goto_10
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v7, v2, :cond_21

    .line 82
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-eq v2, v10, :cond_21

    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-eq v2, v9, :cond_21

    .line 83
    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    .line 84
    iget-object v2, v0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const/4 v5, 0x2

    const/4 v8, 0x0

    .line 26
    invoke-static {v2, v8, v7, v12, v5}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_20

    :goto_11
    add-int/lit8 v7, v7, 0x2

    goto :goto_17

    :cond_20
    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_21
    const/4 v2, 0x2

    move v2, v7

    :goto_12
    const/4 v5, 0x2

    goto :goto_15

    :cond_22
    :goto_13
    add-int/lit8 v7, v7, 0x1

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v7, v2, :cond_26

    .line 101
    invoke-direct/range {p0 .. p0}, Ll/᩻ۤۢ;->ۧ()V

    .line 102
    invoke-interface {v6, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v9, 0x5c

    if-ne v2, v9, :cond_24

    add-int/lit8 v2, v7, 0x1

    .line 47
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-ge v2, v9, :cond_23

    move v7, v2

    :cond_23
    const/16 v2, 0x27

    goto :goto_13

    :cond_24
    if-ne v2, v8, :cond_25

    add-int/lit8 v7, v7, 0x1

    goto :goto_14

    :cond_25
    const/16 v2, 0x27

    if-eq v8, v2, :cond_22

    .line 107
    invoke-direct {v0, v7}, Ll/᩻ۤۢ;->ۧ(I)Z

    move-result v9

    if-eqz v9, :cond_22

    .line 47
    :cond_26
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    :goto_14
    add-int/lit8 v2, v7, -0x1

    :goto_15
    add-int/lit8 v7, v2, 0x1

    const/4 v2, 0x0

    goto/16 :goto_4

    :cond_27
    :goto_16
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v7

    .line 23
    :goto_17
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v7, v2, :cond_28

    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v2, v10, :cond_28

    add-int/lit8 v7, v7, 0x1

    .line 24
    :cond_28
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v7, v2, :cond_29

    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v2, v9, :cond_29

    add-int/lit8 v7, v7, 0x1

    .line 25
    :cond_29
    iget-object v2, v0, Ll/᩻ۤۢ;->᩸:Ljava/util/ArrayList;

    new-instance v4, Ll/ܳۤۢ;

    invoke-direct {v4, v3, v7}, Ll/ܳۤۢ;-><init>(II)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v7, -0x1

    :cond_2a
    :goto_18
    add-int/lit8 v3, v3, 0x1

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_2b
    return-void
.end method

.method public static ֫(C)Z
    .locals 1

    .line 165
    invoke-static {p0}, Ll/᩻ۤۢ;->ۧ(C)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ۧ()V
    .locals 1

    .line 168
    iget v0, p0, Ll/᩻ۤۢ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/᩻ۤۢ;->᩹:I

    and-int/lit16 v0, v0, 0x3ff

    if-nez v0, :cond_0

    invoke-static {}, Ll/᩷ۤۢ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public static ۧ(C)Z
    .locals 1

    const/16 v0, 0x5f

    if-eq p0, v0, :cond_3

    const/16 v0, 0x61

    if-lt p0, v0, :cond_0

    const/16 v0, 0x7a

    if-le p0, v0, :cond_3

    :cond_0
    const/16 v0, 0x41

    if-lt p0, v0, :cond_1

    const/16 v0, 0x5a

    if-le p0, v0, :cond_3

    :cond_1
    const/16 v0, 0x80

    if-lt p0, v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private ۧ(I)Z
    .locals 4

    .line 26
    iget-object v0, p0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    const/4 v1, 0x0

    const-string v2, "{$"

    const/4 v3, 0x2

    invoke-static {v0, v1, p1, v2, v3}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "${"

    invoke-static {v0, v1, p1, v2, v3}, Ll/ۖ᩵ۘ;->֫(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private ܽ(I)I
    .locals 3

    .line 47
    :goto_0
    iget-object v0, p0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p1, v1, :cond_1

    .line 153
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_0

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-direct {p0}, Ll/᩻ۤۢ;->ۧ()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method


# virtual methods
.method public final charAt(I)C
    .locals 2

    if-ltz p1, :cond_1

    .line 47
    iget-object v0, p0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-ge p1, v1, :cond_1

    add-int/lit8 v1, p1, 0x1

    .line 51
    invoke-virtual {p0, p1, v1}, Ll/᩻ۤۢ;->֫(II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 p1, 0x78

    return p1

    :cond_0
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    return p1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final length()I
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    return v0
.end method

.method public final subSequence(II)Ljava/lang/CharSequence;
    .locals 1

    .line 54
    new-instance v0, Ll/۬۬ۡ;

    invoke-direct {v0, p1, p2, p0}, Ll/۬۬ۡ;-><init>(IILjava/lang/CharSequence;)V

    return-object v0
.end method

.method public final ֫()Ljava/lang/CharSequence;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/᩻ۤۢ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻ۤۢ;->᩶:Ljava/lang/CharSequence;

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final ֫(II)Z
    .locals 6

    .line 38
    iget-object v0, p0, Ll/᩻ۤۢ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    add-int v4, v3, v1

    ushr-int/lit8 v4, v4, 0x1

    .line 41
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܳۤۢ;

    iget v5, v5, Ll/ܳۤۢ;->֫:I

    if-gt v5, p1, :cond_0

    add-int/lit8 v3, v4, 0x1

    goto :goto_0

    :cond_0
    move v1, v4

    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge v3, p1, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܳۤۢ;

    iget p1, p1, Ll/ܳۤۢ;->ۧ:I

    if-ge p1, p2, :cond_2

    return v4

    :cond_2
    return v2
.end method
