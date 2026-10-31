.class public final Ll/᩶ۨ᩵;
.super Ll/ۗۘۢ;
.source "N8CI"


# static fields
.field public static final ܽ:Ll/ۗۘۢ;


# instance fields
.field public final ۧ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Ll/᩶ۨ᩵;

    const/16 v1, 0x9

    .line 33
    invoke-direct {v0, v1}, Ll/᩶ۨ᩵;-><init>(I)V

    .line 28
    sput-object v0, Ll/᩶ۨ᩵;->ܽ:Ll/ۗۘۢ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x2

    .line 27
    invoke-direct {p0, v0}, Ll/ۗۘۢ;-><init>(I)V

    const/4 v0, 0x1

    sub-int/2addr p1, v0

    shl-int p1, v0, p1

    .line 37
    iput p1, p0, Ll/᩶ۨ᩵;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶ۨ᩵;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩶ۨ᩵;->ۧ:I

    return p0
.end method


# virtual methods
.method public final ֫(II[B[B)I
    .locals 21

    move/from16 v0, p1

    move-object/from16 v9, p3

    const/4 v1, 0x0

    .line 44
    invoke-static {v1, v0, v9}, Ll/ۛ᩸ۘ;->֫(II[B)V

    move/from16 v10, p2

    move-object/from16 v11, p4

    .line 45
    invoke-static {v1, v10, v11}, Ll/ۛ᩸ۘ;->֫(II[B)V

    add-int/lit8 v12, v0, -0xc

    add-int/lit8 v13, v0, -0x5

    .line 56
    new-instance v14, Ll/᩹ۨ᩵;

    move-object/from16 v15, p0

    invoke-direct {v14, v15}, Ll/᩹ۨ᩵;-><init>(Ll/᩶ۨ᩵;)V

    .line 58
    new-instance v8, Ll/۫ۨ᩵;

    .line 61
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v7, Ll/۫ۨ᩵;

    .line 61
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v6, Ll/۫ۨ᩵;

    .line 61
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v12, :cond_12

    .line 64
    invoke-virtual {v14, v9, v3, v13, v8}, Ll/᩹ۨ᩵;->֫([BIILl/۫ۨ᩵;)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 56
    :cond_0
    iget v2, v8, Ll/۫ۨ᩵;->֫:I

    .line 57
    iget v3, v8, Ll/۫ۨ᩵;->ܽ:I

    .line 58
    iget v5, v8, Ll/۫ۨ᩵;->ۧ:I

    move/from16 v16, v1

    move/from16 v17, v4

    move v4, v3

    move v3, v5

    move v5, v2

    .line 75
    :goto_1
    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v1

    if-ge v1, v12, :cond_11

    .line 76
    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v1

    add-int/lit8 v18, v1, -0x2

    iget v1, v8, Ll/۫ۨ᩵;->ܽ:I

    add-int/lit8 v19, v1, 0x1

    iget v2, v8, Ll/۫ۨ᩵;->֫:I

    move-object v1, v14

    move/from16 v20, v2

    move-object/from16 v2, p3

    move v9, v3

    move/from16 v3, v18

    move v10, v4

    move/from16 v4, v19

    move v11, v5

    move v5, v13

    move-object/from16 v18, v6

    move/from16 v6, v20

    move-object/from16 v19, v7

    invoke-virtual/range {v1 .. v7}, Ll/᩹ۨ᩵;->֫([BIIIILl/۫ۨ᩵;)Z

    move-result v1

    if-nez v1, :cond_1

    move-object v10, v8

    move-object/from16 v9, v18

    move-object/from16 v11, v19

    goto/16 :goto_7

    .line 83
    :cond_1
    iget v1, v8, Ll/۫ۨ᩵;->ܽ:I

    move-object/from16 v7, v19

    if-ge v10, v1, :cond_2

    .line 84
    iget v2, v7, Ll/۫ۨ᩵;->ܽ:I

    add-int/2addr v1, v11

    if-ge v2, v1, :cond_2

    .line 56
    iput v11, v8, Ll/۫ۨ᩵;->֫:I

    .line 57
    iput v10, v8, Ll/۫ۨ᩵;->ܽ:I

    .line 58
    iput v9, v8, Ll/۫ۨ᩵;->ۧ:I

    .line 90
    :cond_2
    iget v1, v7, Ll/۫ۨ᩵;->ܽ:I

    iget v2, v8, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v1, v2

    const/4 v2, 0x3

    if-ge v1, v2, :cond_3

    .line 91
    invoke-static {v7, v8}, Ll/ۤۨ᩵;->֫(Ll/۫ۨ᩵;Ll/۫ۨ᩵;)V

    move v3, v9

    move v4, v10

    move v5, v11

    move-object/from16 v6, v18

    :goto_2
    move/from16 v10, p2

    move-object/from16 v9, p3

    move-object/from16 v11, p4

    goto :goto_1

    .line 97
    :cond_3
    :goto_3
    iget v1, v7, Ll/۫ۨ᩵;->ܽ:I

    iget v2, v8, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v1, v2

    const/4 v9, 0x4

    const/16 v10, 0x12

    if-ge v1, v10, :cond_6

    .line 98
    iget v1, v8, Ll/۫ۨ᩵;->֫:I

    if-le v1, v10, :cond_4

    const/16 v1, 0x12

    :cond_4
    add-int/2addr v2, v1

    .line 102
    invoke-virtual {v7}, Ll/۫ۨ᩵;->֫()I

    move-result v3

    sub-int/2addr v3, v9

    if-le v2, v3, :cond_5

    .line 103
    iget v1, v7, Ll/۫ۨ᩵;->ܽ:I

    iget v2, v8, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v1, v2

    iget v2, v7, Ll/۫ۨ᩵;->֫:I

    add-int/2addr v1, v2

    sub-int/2addr v1, v9

    .line 105
    :cond_5
    iget v2, v7, Ll/۫ۨ᩵;->ܽ:I

    iget v3, v8, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v2, v3

    sub-int/2addr v1, v2

    if-lez v1, :cond_6

    .line 107
    invoke-virtual {v7, v1}, Ll/۫ۨ᩵;->֫(I)V

    .line 111
    :cond_6
    iget v1, v7, Ll/۫ۨ᩵;->ܽ:I

    iget v2, v7, Ll/۫ۨ᩵;->֫:I

    add-int/2addr v1, v2

    if-ge v1, v12, :cond_f

    .line 112
    invoke-virtual {v7}, Ll/۫ۨ᩵;->֫()I

    move-result v1

    add-int/lit8 v3, v1, -0x3

    iget v4, v7, Ll/۫ۨ᩵;->ܽ:I

    iget v6, v7, Ll/۫ۨ᩵;->֫:I

    move-object v1, v14

    move-object/from16 v2, p3

    move v5, v13

    move-object v11, v7

    move-object/from16 v7, v18

    invoke-virtual/range {v1 .. v7}, Ll/᩹ۨ᩵;->֫([BIIIILl/۫ۨ᩵;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_6

    :cond_7
    move-object/from16 v7, v18

    .line 126
    iget v1, v7, Ll/۫ۨ᩵;->ܽ:I

    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    if-ge v1, v2, :cond_a

    .line 127
    iget v1, v7, Ll/۫ۨ᩵;->ܽ:I

    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v2

    if-lt v1, v2, :cond_9

    .line 128
    iget v1, v11, Ll/۫ۨ᩵;->ܽ:I

    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 129
    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v1

    iget v2, v11, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v1, v2

    .line 130
    invoke-virtual {v11, v1}, Ll/۫ۨ᩵;->֫(I)V

    .line 131
    iget v1, v11, Ll/۫ۨ᩵;->֫:I

    if-ge v1, v9, :cond_8

    .line 132
    invoke-static {v7, v11}, Ll/ۤۨ᩵;->֫(Ll/۫ۨ᩵;Ll/۫ۨ᩵;)V

    .line 136
    :cond_8
    iget v4, v8, Ll/۫ۨ᩵;->ܽ:I

    iget v5, v8, Ll/۫ۨ᩵;->ۧ:I

    iget v6, v8, Ll/۫ۨ᩵;->֫:I

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, v16

    move-object v9, v7

    move/from16 v7, v17

    move-object v10, v8

    move/from16 v8, p2

    invoke-static/range {v1 .. v8}, Ll/۬ۨ᩵;->֫([B[BIIIIII)I

    move-result v17

    .line 137
    invoke-virtual {v10}, Ll/۫ۨ᩵;->֫()I

    move-result v16

    .line 139
    invoke-static {v9, v10}, Ll/ۤۨ᩵;->֫(Ll/۫ۨ᩵;Ll/۫ۨ᩵;)V

    .line 56
    iget v5, v11, Ll/۫ۨ᩵;->֫:I

    .line 57
    iget v4, v11, Ll/۫ۨ᩵;->ܽ:I

    .line 58
    iget v3, v11, Ll/۫ۨ᩵;->ۧ:I

    move-object v6, v9

    move-object v8, v10

    move-object v7, v11

    goto/16 :goto_2

    :cond_9
    move-object v9, v7

    move-object v10, v8

    .line 145
    invoke-static {v9, v11}, Ll/ۤۨ᩵;->֫(Ll/۫ۨ᩵;Ll/۫ۨ᩵;)V

    move-object/from16 v18, v9

    goto :goto_5

    .line 150
    :cond_a
    iget v1, v11, Ll/۫ۨ᩵;->ܽ:I

    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v2

    if-ge v1, v2, :cond_e

    .line 151
    iget v1, v11, Ll/۫ۨ᩵;->ܽ:I

    iget v2, v8, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v1, v2

    const/16 v2, 0xf

    if-ge v1, v2, :cond_d

    .line 152
    iget v1, v8, Ll/۫ۨ᩵;->֫:I

    if-le v1, v10, :cond_b

    .line 153
    iput v10, v8, Ll/۫ۨ᩵;->֫:I

    .line 155
    :cond_b
    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v1

    invoke-virtual {v11}, Ll/۫ۨ᩵;->֫()I

    move-result v2

    sub-int/2addr v2, v9

    if-le v1, v2, :cond_c

    .line 156
    invoke-virtual {v11}, Ll/۫ۨ᩵;->֫()I

    move-result v1

    iget v2, v8, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v1, v2

    sub-int/2addr v1, v9

    iput v1, v8, Ll/۫ۨ᩵;->֫:I

    .line 158
    :cond_c
    invoke-virtual {v8}, Ll/۫ۨ᩵;->֫()I

    move-result v1

    iget v2, v11, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v1, v2

    .line 159
    invoke-virtual {v11, v1}, Ll/۫ۨ᩵;->֫(I)V

    goto :goto_4

    .line 161
    :cond_d
    iput v1, v8, Ll/۫ۨ᩵;->֫:I

    .line 165
    :cond_e
    :goto_4
    iget v4, v8, Ll/۫ۨ᩵;->ܽ:I

    iget v5, v8, Ll/۫ۨ᩵;->ۧ:I

    iget v6, v8, Ll/۫ۨ᩵;->֫:I

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, v16

    move-object v9, v7

    move/from16 v7, v17

    move-object v10, v8

    move/from16 v8, p2

    invoke-static/range {v1 .. v8}, Ll/۬ۨ᩵;->֫([B[BIIIIII)I

    move-result v17

    .line 166
    invoke-virtual {v10}, Ll/۫ۨ᩵;->֫()I

    move-result v16

    .line 168
    invoke-static {v11, v10}, Ll/ۤۨ᩵;->֫(Ll/۫ۨ᩵;Ll/۫ۨ᩵;)V

    .line 169
    invoke-static {v9, v11}, Ll/ۤۨ᩵;->֫(Ll/۫ۨ᩵;Ll/۫ۨ᩵;)V

    move-object/from16 v18, v9

    move-object v8, v10

    :goto_5
    move-object v7, v11

    goto/16 :goto_3

    :cond_f
    move-object v11, v7

    :goto_6
    move-object v10, v8

    move-object/from16 v9, v18

    .line 114
    iget v1, v11, Ll/۫ۨ᩵;->ܽ:I

    invoke-virtual {v10}, Ll/۫ۨ᩵;->֫()I

    move-result v2

    if-ge v1, v2, :cond_10

    .line 115
    iget v1, v11, Ll/۫ۨ᩵;->ܽ:I

    iget v2, v10, Ll/۫ۨ᩵;->ܽ:I

    sub-int/2addr v1, v2

    iput v1, v10, Ll/۫ۨ᩵;->֫:I

    .line 118
    :cond_10
    iget v4, v10, Ll/۫ۨ᩵;->ܽ:I

    iget v5, v10, Ll/۫ۨ᩵;->ۧ:I

    iget v6, v10, Ll/۫ۨ᩵;->֫:I

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, v16

    move/from16 v7, v17

    move/from16 v8, p2

    invoke-static/range {v1 .. v8}, Ll/۬ۨ᩵;->֫([B[BIIIIII)I

    move-result v7

    .line 119
    invoke-virtual {v10}, Ll/۫ۨ᩵;->֫()I

    move-result v3

    .line 121
    iget v4, v11, Ll/۫ۨ᩵;->ܽ:I

    iget v5, v11, Ll/۫ۨ᩵;->ۧ:I

    iget v6, v11, Ll/۫ۨ᩵;->֫:I

    invoke-static/range {v1 .. v8}, Ll/۬ۨ᩵;->֫([B[BIIIIII)I

    move-result v4

    .line 122
    invoke-virtual {v11}, Ll/۫ۨ᩵;->֫()I

    move-result v3

    goto :goto_8

    :cond_11
    move-object v9, v6

    move-object v11, v7

    move-object v10, v8

    .line 78
    :goto_7
    iget v4, v10, Ll/۫ۨ᩵;->ܽ:I

    iget v5, v10, Ll/۫ۨ᩵;->ۧ:I

    iget v6, v10, Ll/۫ۨ᩵;->֫:I

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, v16

    move/from16 v7, v17

    move/from16 v8, p2

    invoke-static/range {v1 .. v8}, Ll/۬ۨ᩵;->֫([B[BIIIIII)I

    move-result v4

    .line 79
    invoke-virtual {v10}, Ll/۫ۨ᩵;->֫()I

    move-result v3

    :goto_8
    move v1, v3

    move-object v6, v9

    move-object v8, v10

    move-object v7, v11

    move/from16 v10, p2

    move-object/from16 v9, p3

    move-object/from16 v11, p4

    goto/16 :goto_0

    :cond_12
    sub-int v2, v0, v1

    move-object/from16 v0, p3

    move-object/from16 v3, p4

    move/from16 v5, p2

    .line 178
    invoke-static/range {v0 .. v5}, Ll/۬ۨ᩵;->֫([BII[BII)I

    move-result v0

    return v0
.end method
