.class public final Ll/ۤ᩷ۜ;
.super Ljava/lang/Object;
.source "1799"


# instance fields
.field public final ֫:Ll/᩷ۢۜ;

.field public final ۧ:Ll/ۨۨ᩻;

.field public final ܽ:Ll/ܺ۟᩻;


# direct methods
.method public constructor <init>(Ll/ۨۨ᩻;Ll/ܺ۟᩻;)V
    .locals 1

    .line 47
    invoke-static {}, Ll/᩷ۢۜ;->ܽ()Ll/᩷ۢۜ;

    move-result-object v0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Ll/ۤ᩷ۜ;->ۧ:Ll/ۨۨ᩻;

    .line 54
    iput-object p2, p0, Ll/ۤ᩷ۜ;->ܽ:Ll/ܺ۟᩻;

    .line 55
    iput-object v0, p0, Ll/ۤ᩷ۜ;->֫:Ll/᩷ۢۜ;

    return-void
.end method

.method public static ֫()V
    .locals 1

    .line 40
    invoke-static {}, Ll/᩷ۢۜ;->ܽ()Ll/᩷ۢۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۢۜ;->֫()V

    return-void
.end method

.method public static ֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "->"

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 555
    iput-object p1, p0, Ll/ۗ᩷ۜ;->ܽ:Ljava/lang/String;

    .line 557
    iput-object p3, p0, Ll/ۗ᩷ۜ;->ۧ:Ljava/lang/String;

    .line 558
    iput-object p4, p0, Ll/ۗ᩷ۜ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ll/ۗ᩷ۜ;Ll/֨ۗ֡;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 371
    iget-object v0, p1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v1, "invoke-super"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "not_applicable"

    if-eqz v0, :cond_0

    const-string p1, "super_call"

    .line 289
    invoke-static {p0, p2, p3, p1, v1}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 364
    :cond_0
    iget-object v0, p1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v2, "invoke-virtual"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v2, "exact_reference"

    if-nez v0, :cond_3

    iget-object v0, p1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v3, "invoke-interface"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 378
    :cond_1
    iget-object p1, p1, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string p4, "invoke-polymorphic"

    invoke-virtual {p1, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 296
    invoke-static {p0, p2, p3, v2, v1}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "exact"

    .line 299
    invoke-static {p0, p2, p3, v2, p1}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_0
    if-eqz p4, :cond_4

    const-string v1, "possible"

    .line 292
    :cond_4
    invoke-static {p0, p2, p3, v2, v1}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ll/ۤ᩷ۜ;Ll/ۢۜۜ;Ll/ۡۢۜ;Ll/ܽۨ֡;Ll/۬ۛ֡;ILl/֨ۗ֡;IZLl/ۗ᩷ۜ;Ll/۫᩷ۜ;)Z
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p6

    move/from16 v4, p8

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    const/4 v7, 0x3

    const/4 v8, 0x0

    move/from16 v9, p7

    if-ne v9, v7, :cond_1e

    .line 152
    iget-object v7, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v9, "invoke-"

    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    goto/16 :goto_4

    .line 155
    :cond_0
    invoke-virtual/range {p4 .. p4}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v7

    .line 156
    invoke-virtual/range {p4 .. p5}, Ll/۬ۛ֡;->ܿ(I)I

    move-result v9

    .line 157
    invoke-virtual {v7, v9}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v7

    .line 158
    iget-object v10, v0, Ll/ۢۜۜ;->ᩳ:Ljava/lang/String;

    iget-object v11, v0, Ll/ۢۜۜ;->ܿ:Ljava/lang/String;

    iget-object v0, v0, Ll/ۢۜۜ;->֫:Ljava/lang/String;

    const-string v12, "exact"

    .line 159
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    const/4 v13, 0x1

    if-eqz v12, :cond_3

    .line 160
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v2, v7, v8, v1, v0}, Ll/۬ۛ֡;->ۧ(IIILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_4

    .line 163
    :cond_1
    invoke-static {v2, v9, v10, v6}, Ll/ۤ᩷ۜ;->֫(Ll/۬ۛ֡;ILjava/lang/String;Ll/۫᩷ۜ;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_4

    .line 166
    :cond_2
    invoke-virtual {v2, v7}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    .line 167
    invoke-static {v5, v3, v0, v10, v4}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ll/֨ۗ֡;Ljava/lang/String;Ljava/lang/String;Z)V

    return v13

    .line 378
    :cond_3
    iget-object v12, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v13, "invoke-polymorphic"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_1b

    .line 385
    iget-object v12, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v13, "invoke-static"

    .line 386
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_1b

    iget-object v12, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v13, "invoke-direct"

    .line 387
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_1b

    iget-object v12, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v13, "invoke-object-init"

    .line 388
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    goto/16 :goto_2

    .line 371
    :cond_4
    iget-object v12, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v13, "invoke-super"

    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    const-string v13, "slot"

    const-string v14, "same_virtual_slot"

    const/4 v15, 0x1

    const-string v8, "not_applicable"

    if-eqz v12, :cond_a

    .line 182
    invoke-static {v2, v9, v10, v6}, Ll/ۤ᩷ۜ;->֫(Ll/۬ۛ֡;ILjava/lang/String;Ll/۫᩷ۜ;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_4

    .line 185
    :cond_5
    invoke-virtual {v2, v7}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v2

    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 187
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v6, "super_call"

    if-eqz v4, :cond_8

    if-eqz v3, :cond_6

    .line 189
    invoke-static {v5, v2, v10, v6, v8}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v15

    .line 193
    :cond_6
    invoke-interface {v1, v2, v0, v10}, Ll/ۡۢۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_4

    .line 196
    :cond_7
    invoke-static {v5, v2, v10, v14, v8}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v15

    :cond_8
    move-object/from16 v3, p3

    .line 183
    iget-object v3, v3, Ll/ܽۨ֡;->᩹:Ll/۠ۛ֡;

    invoke-virtual {v3}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v3

    .line 201
    invoke-interface {v1, v3, v2, v0, v10}, Ll/ۡۢۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢۢۜ;

    move-result-object v0

    .line 203
    sget-object v1, Ll/ۢۢۜ;->ۗ:Ll/ۢۢۜ;

    if-ne v0, v1, :cond_9

    goto/16 :goto_4

    .line 206
    :cond_9
    iget-object v0, v0, Ll/ۢۢۜ;->᩸:Ljava/lang/String;

    invoke-static {v5, v2, v10, v6, v0}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v15

    .line 364
    :cond_a
    iget-object v12, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v15, "invoke-virtual"

    invoke-virtual {v12, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_e

    iget-object v12, v3, Ll/֨ۗ֡;->ۗ:Ljava/lang/String;

    const-string v15, "invoke-interface"

    invoke-virtual {v12, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_b

    goto :goto_0

    .line 211
    :cond_b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v8, 0x0

    invoke-virtual {v2, v7, v8, v1, v0}, Ll/۬ۛ֡;->ۧ(IIILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_1

    .line 214
    :cond_c
    invoke-static {v2, v9, v10, v6}, Ll/ۤ᩷ۜ;->֫(Ll/۬ۛ֡;ILjava/lang/String;Ll/۫᩷ۜ;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_1

    .line 217
    :cond_d
    invoke-virtual {v2, v7}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    .line 218
    invoke-static {v5, v3, v0, v10, v4}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ll/֨ۗ֡;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 v0, 0x1

    return v0

    .line 221
    :cond_e
    :goto_0
    invoke-static {v2, v9, v10, v6}, Ll/ۤ᩷ۜ;->֫(Ll/۬ۛ֡;ILjava/lang/String;Ll/۫᩷ۜ;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_1

    .line 224
    :cond_f
    invoke-virtual {v2, v7}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v2

    .line 226
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 227
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "possible"

    const-string v9, "exact_reference"

    if-eqz v6, :cond_14

    .line 310
    invoke-virtual {v10, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    goto :goto_1

    :cond_10
    if-eqz v3, :cond_12

    if-eqz v4, :cond_11

    move-object v8, v7

    .line 314
    :cond_11
    invoke-static {v5, v2, v10, v9, v8}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x1

    return v6

    :cond_12
    const/4 v6, 0x1

    .line 319
    invoke-interface {v1, v2, v0, v10}, Ll/ۡۢۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_1

    .line 322
    :cond_13
    invoke-static {v5, v2, v10, v14, v8}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v6

    :cond_14
    const/4 v6, 0x1

    .line 333
    invoke-virtual {v10, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_15

    goto :goto_1

    :cond_15
    if-eqz v3, :cond_17

    if-eqz v4, :cond_16

    move-object v8, v7

    .line 337
    :cond_16
    invoke-static {v5, v2, v10, v9, v8}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v6

    :cond_17
    if-eqz v4, :cond_19

    .line 343
    invoke-interface {v1, v2, v0, v10}, Ll/ۡۢۜ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_1

    :cond_18
    const-string v0, "possible_virtual_dispatch"

    .line 347
    invoke-static {v5, v2, v10, v0, v7}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v6

    .line 352
    :cond_19
    invoke-interface {v1, v2, v0, v10}, Ll/ۡۢۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1a

    :goto_1
    goto :goto_4

    .line 355
    :cond_1a
    invoke-static {v5, v2, v10, v14, v8}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v6

    :cond_1b
    :goto_2
    const/4 v1, 0x1

    .line 171
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v11, 0x0

    invoke-virtual {v2, v7, v11, v8, v0}, Ll/۬ۛ֡;->ۧ(IIILjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_3

    .line 174
    :cond_1c
    invoke-static {v2, v9, v10, v6}, Ll/ۤ᩷ۜ;->֫(Ll/۬ۛ֡;ILjava/lang/String;Ll/۫᩷ۜ;)Z

    move-result v0

    if-nez v0, :cond_1d

    :goto_3
    goto :goto_4

    .line 177
    :cond_1d
    invoke-virtual {v2, v7}, Ll/۬ۛ֡;->ۡ(I)Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-static {v5, v3, v0, v10, v4}, Ll/ۤ᩷ۜ;->֫(Ll/ۗ᩷ۜ;Ll/֨ۗ֡;Ljava/lang/String;Ljava/lang/String;Z)V

    return v1

    :cond_1e
    :goto_4
    const/4 v8, 0x0

    return v8
.end method

.method public static ֫(Ll/۬ۛ֡;ILjava/lang/String;Ll/۫᩷ۜ;)Z
    .locals 11

    .line 403
    invoke-virtual {p0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    add-int/lit8 v1, p1, 0x4

    .line 404
    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    .line 405
    iget v2, p3, Ll/۫᩷ۜ;->ܽ:I

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v3, v2, p2}, Ll/۬ۛ֡;->֫(IIILjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return v3

    :cond_0
    add-int/lit8 p1, p1, 0x2

    .line 408
    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result p1

    .line 417
    invoke-virtual {p0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    .line 418
    invoke-virtual {p0, p1}, Ll/۬ۛ֡;->ۜ(I)I

    move-result p1

    add-int/lit8 v1, p1, 0x8

    .line 419
    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v1

    .line 420
    iget v2, p3, Ll/۫᩷ۜ;->ܿ:I

    iget v4, p3, Ll/۫᩷ۜ;->ܳ:I

    iget p3, p3, Ll/۫᩷ۜ;->ᩳ:I

    if-lez v1, :cond_8

    .line 422
    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result v5

    add-int/lit8 v1, v1, 0x4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_8

    const/4 v7, -0x1

    if-lt v2, p3, :cond_1

    goto :goto_3

    :cond_1
    move v8, v2

    :goto_1
    if-ge v8, p3, :cond_2

    .line 451
    invoke-virtual {p2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x5b

    if-ne v9, v10, :cond_2

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    if-lt v8, p3, :cond_3

    goto :goto_3

    .line 457
    :cond_3
    invoke-virtual {p2, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x4c

    if-ne v9, v10, :cond_4

    const/16 v9, 0x3b

    .line 459
    invoke-virtual {p2, v9, v8}, Ljava/lang/String;->indexOf(II)I

    move-result v8

    if-ltz v8, :cond_5

    if-ge v8, p3, :cond_5

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_4
    add-int/lit8 v8, v8, 0x1

    if-gt v8, p3, :cond_5

    :goto_2
    move v7, v8

    :cond_5
    :goto_3
    if-gez v7, :cond_6

    goto :goto_4

    :cond_6
    mul-int/lit8 v8, v6, 0x2

    add-int/2addr v8, v1

    .line 429
    invoke-virtual {v0, v8}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v8

    sub-int v9, v7, v2

    .line 430
    invoke-virtual {p0, v8, v2, v9, p2}, Ll/۬ۛ֡;->ۧ(IIILjava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v6, v6, 0x1

    move v2, v7

    goto :goto_0

    :cond_8
    if-eq v2, p3, :cond_9

    :goto_4
    return v3

    :cond_9
    add-int/lit8 p1, p1, 0x4

    .line 439
    invoke-virtual {v0, p1}, Ll/ۘۨ֡;->ۜ(I)I

    move-result p1

    .line 441
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    sub-int/2addr p3, v4

    .line 440
    invoke-virtual {p0, p1, v4, p3, p2}, Ll/۬ۛ֡;->ۧ(IIILjava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ܳ᩻ۜ;Ll/ۢۜۜ;Ll/ܺۨ᩻;)Ll/ۖ᩷ۜ;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    .line 64
    iget-object v12, v10, Ll/ۢۜۜ;->ܿ:Ljava/lang/String;

    .line 301
    iget-object v2, v10, Ll/ۢۜۜ;->᩻:Ljava/lang/String;

    const-string v3, "dex_method"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    .line 107
    iget-object v5, v10, Ll/ۢۜۜ;->֫:Ljava/lang/String;

    iget-object v6, v10, Ll/ۢۜۜ;->ᩳ:Ljava/lang/String;

    iget-object v13, v10, Ll/ۢۜۜ;->ۧ:Ljava/lang/String;

    iget-object v14, v0, Ll/ۤ᩷ۜ;->ܽ:Ll/ܺ۟᩻;

    const/4 v7, 0x0

    if-nez v4, :cond_0

    .line 635
    new-instance v4, Ll/ۙ᩷ۜ;

    const-string v8, ""

    invoke-direct {v4, v8, v8, v7}, Ll/ۙ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    :goto_0
    move-object v15, v4

    goto/16 :goto_7

    .line 111
    :cond_0
    iget-object v4, v0, Ll/ۤ᩷ۜ;->֫:Ll/᩷ۢۜ;

    invoke-virtual {v4}, Ll/᩷ۢۜ;->֫()V

    const-string v8, "exact"

    .line 112
    invoke-virtual {v8, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    .line 645
    invoke-virtual {v4, v5, v6}, Ll/᩷ۢۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܽۢۜ;

    move-result-object v4

    .line 647
    iget-object v8, v4, Ll/ܽۢۜ;->ۧ:Ll/ᩳۢۜ;

    sget-object v9, Ll/ᩳۢۜ;->᩹:Ll/ᩳۢۜ;

    if-ne v8, v9, :cond_3

    .line 649
    new-instance v7, Ll/ۙ᩷ۜ;

    iget-object v4, v4, Ll/ܽۢۜ;->֫:Ll/ۧۢۜ;

    .line 90
    iget v4, v4, Ll/ۧۢۜ;->ᩳ:I

    and-int/lit8 v4, v4, 0x7

    const/4 v8, 0x2

    if-eq v4, v8, :cond_2

    const/4 v8, 0x4

    if-ne v4, v8, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v4, 0x1

    .line 650
    :goto_2
    invoke-direct {v7, v5, v6, v4}, Ll/ۙ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_6

    .line 653
    :cond_3
    invoke-virtual {v14, v1, v13, v7, v11}, Ll/ܺ۟᩻;->֫(Ll/ܳ᩻ۜ;Ljava/lang/String;ZLl/ܺۨ᩻;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܿ᩺᩻;

    .line 655
    iget-object v9, v8, Ll/ܿ᩺᩻;->ۧ:Ljava/lang/String;

    invoke-static {v9}, Ll/ܳ᩺᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_3

    :cond_5
    const/4 v8, 0x0

    :goto_3
    if-nez v8, :cond_6

    .line 661
    new-instance v4, Ll/ۙ᩷ۜ;

    invoke-direct {v4, v5, v6, v7}, Ll/ۙ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 663
    :cond_6
    invoke-virtual {v14, v1, v13, v8, v11}, Ll/ܺ۟᩻;->֫(Ll/ܳ᩻ۜ;Ljava/lang/String;Ll/ܿ᩺᩻;Ll/ܺۨ᩻;)Ll/۠ۛ֡;

    move-result-object v4

    .line 664
    invoke-virtual {v4}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩴ֫ۚ;

    .line 665
    invoke-static {v8, v6}, Ll/ܶ᩷ۜ;->֫(Ll/ᩴ֫ۚ;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 666
    new-instance v4, Ll/ۙ᩷ۜ;

    .line 667
    invoke-static {v8}, Ll/۟᩷ۜ;->֫(Ll/ᩴ֫ۚ;)Z

    move-result v7

    invoke-direct {v4, v5, v6, v7}, Ll/ۙ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 670
    :cond_8
    new-instance v4, Ll/ۙ᩷ۜ;

    invoke-direct {v4, v5, v6, v7}, Ll/ۙ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    goto/16 :goto_0

    .line 116
    :cond_9
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v13}, Ll/ܺ۟᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 66
    new-instance v7, Ll/۟᩷ۜ;

    invoke-direct {v7, v6, v4}, Ll/۟᩷ۜ;-><init>(Ljava/lang/String;Ll/᩷ۢۜ;)V

    .line 67
    iget-object v4, v1, Ll/ܳ᩻ۜ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܿ᩺᩻;

    .line 68
    iget-object v9, v0, Ll/ۤ᩷ۜ;->ۧ:Ll/ۨۨ᩻;

    invoke-virtual {v9, v1, v8, v11}, Ll/ۨۨ᩻;->֫(Ll/ܳ᩻ۜ;Ll/ܿ᩺᩻;Ll/ܺۨ᩻;)Ll/۠ۛ֡;

    move-result-object v8

    .line 69
    invoke-virtual {v8}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v6}, Ll/ۛ᩷ۜ;->֫(Ll/۠ۛ֡;Ljava/lang/String;)Ll/ۛ᩷ۜ;

    move-result-object v8

    invoke-virtual {v7, v9, v8}, Ll/۟᩷ۜ;->֫(Ljava/lang/String;Ll/ۛ᩷ۜ;)V

    goto :goto_4

    .line 87
    :cond_a
    new-instance v7, Ll/۟᩷ۜ;

    invoke-direct {v7, v6, v4}, Ll/۟᩷ۜ;-><init>(Ljava/lang/String;Ll/᩷ۢۜ;)V

    .line 88
    invoke-virtual {v14, v1, v13, v11}, Ll/ܺ۟᩻;->֫(Ll/ܳ᩻ۜ;Ljava/lang/String;Ll/ܺۨ᩻;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܿ᩺᩻;

    .line 90
    invoke-virtual {v14, v1, v13, v8, v11}, Ll/ܺ۟᩻;->ۧ(Ll/ܳ᩻ۜ;Ljava/lang/String;Ll/ܿ᩺᩻;Ll/ܺۨ᩻;)Ll/۠ۛ֡;

    move-result-object v8

    .line 91
    invoke-virtual {v8}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v6}, Ll/ۛ᩷ۜ;->֫(Ll/۠ۛ֡;Ljava/lang/String;)Ll/ۛ᩷ۜ;

    move-result-object v8

    invoke-virtual {v7, v9, v8}, Ll/۟᩷ۜ;->֫(Ljava/lang/String;Ll/ۛ᩷ۜ;)V

    goto :goto_5

    :cond_b
    :goto_6
    move-object v4, v7

    goto/16 :goto_0

    .line 301
    :goto_7
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 66
    invoke-interface {v15, v5, v6}, Ll/ۡۢۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v2, 0x1

    const/16 v16, 0x1

    goto :goto_8

    :cond_c
    const/4 v2, 0x0

    const/16 v16, 0x0

    .line 67
    :goto_8
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 68
    new-instance v18, Ll/ۗ᩷ۜ;

    .line 545
    invoke-direct/range {v18 .. v18}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-static/range {p2 .. p2}, Ll/۫᩷ۜ;->֫(Ll/ۢۜۜ;)Ll/۫᩷ۜ;

    move-result-object v19

    .line 70
    new-instance v9, Ll/۬᩷ۜ;

    invoke-direct {v9, v0}, Ll/۬᩷ۜ;-><init>(Ll/ۤ᩷ۜ;)V

    .line 71
    iget-object v8, v10, Ll/ۢۜۜ;->ܳ:Ll/֫ۢۜ;

    .line 72
    invoke-virtual {v14, v1, v13, v11}, Ll/ܺ۟᩻;->֫(Ll/ܳ᩻ۜ;Ljava/lang/String;Ll/ܺۨ᩻;)Ljava/util/ArrayList;

    move-result-object v7

    .line 74
    iget v6, v8, Ll/֫ۢۜ;->֫:I

    iget v5, v8, Ll/֫ۢۜ;->ܽ:I

    move v4, v6

    :goto_9
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v4, v2, :cond_13

    .line 75
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܿ᩺᩻;

    .line 76
    invoke-virtual {v14, v1, v13, v2, v11}, Ll/ܺ۟᩻;->ۧ(Ll/ܳ᩻ۜ;Ljava/lang/String;Ll/ܿ᩺᩻;Ll/ܺۨ᩻;)Ll/۠ۛ֡;

    move-result-object v2

    if-ne v4, v6, :cond_d

    move v3, v5

    goto :goto_a

    :cond_d
    const/4 v3, 0x0

    .line 80
    :goto_a
    invoke-virtual {v2}, Ll/۠ۛ֡;->getMethods()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    const/4 v2, 0x0

    :goto_b
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_12

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    move-object/from16 v0, v21

    check-cast v0, Ll/ܽۨ֡;

    add-int/lit8 v21, v2, 0x1

    if-ge v2, v3, :cond_e

    move/from16 v23, v3

    move/from16 v25, v5

    move/from16 v26, v6

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    move-object/from16 v22, v13

    move-object/from16 v24, v14

    move-object/from16 v29, v15

    move v14, v4

    move-object v15, v9

    goto/16 :goto_e

    :cond_e
    if-ne v4, v6, :cond_f

    if-ne v2, v5, :cond_f

    move/from16 v22, v2

    .line 86
    iget v2, v8, Ll/֫ۢۜ;->ۧ:I

    move v11, v2

    goto :goto_c

    :cond_f
    move/from16 v22, v2

    const/4 v2, 0x0

    const/4 v11, 0x0

    :goto_c
    move/from16 v30, v22

    move-object/from16 v22, v13

    move/from16 v13, v30

    move-object v2, v9

    move/from16 v23, v3

    move-object/from16 v3, p2

    move-object/from16 v24, v14

    move v14, v4

    move-object v4, v15

    move/from16 v25, v5

    move-object/from16 v5, v17

    move/from16 v26, v6

    move-object v6, v0

    move-object/from16 v27, v7

    move/from16 v7, v16

    move-object/from16 v28, v8

    move-object/from16 v8, v18

    move-object/from16 v29, v15

    move-object v15, v9

    move-object/from16 v9, v19

    .line 134
    invoke-virtual/range {v2 .. v9}, Ll/۬᩷ۜ;->֫(Ll/ۢۜۜ;Ll/ۡۢۜ;Ljava/util/ArrayList;Ll/ܽۨ֡;ZLl/ۗ᩷ۜ;Ll/۫᩷ۜ;)V

    .line 136
    invoke-virtual {v0, v11, v15}, Ll/ܽۨ֡;->֫(ILl/ۧۨ֡;)I

    move-result v0

    if-ltz v0, :cond_10

    .line 138
    new-instance v2, Ll/֫ۢۜ;

    invoke-direct {v2, v14, v13, v0}, Ll/֫ۢۜ;-><init>(III)V

    move-object v8, v2

    goto :goto_d

    :cond_10
    const/4 v0, 0x0

    move-object v8, v0

    :goto_d
    if-eqz v8, :cond_11

    .line 91
    new-instance v0, Ll/ۖ᩷ۜ;

    iget-object v2, v1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    iget-object v3, v10, Ll/ۢۜۜ;->᩻:Ljava/lang/String;

    iget-object v4, v10, Ll/ۢۜۜ;->֫:Ljava/lang/String;

    iget-object v5, v10, Ll/ۢۜۜ;->ᩳ:Ljava/lang/String;

    move-object v1, v0

    move-object v6, v12

    move-object/from16 v7, v17

    invoke-direct/range {v1 .. v8}, Ll/ۖ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ll/֫ۢۜ;)V

    return-object v0

    :cond_11
    :goto_e
    move-object/from16 v0, p0

    move-object/from16 v11, p3

    move v4, v14

    move-object v9, v15

    move/from16 v2, v21

    move-object/from16 v13, v22

    move/from16 v3, v23

    move-object/from16 v14, v24

    move/from16 v5, v25

    move/from16 v6, v26

    move-object/from16 v7, v27

    move-object/from16 v8, v28

    move-object/from16 v15, v29

    goto/16 :goto_b

    :cond_12
    move/from16 v25, v5

    move/from16 v26, v6

    move-object/from16 v27, v7

    move-object/from16 v28, v8

    move-object/from16 v22, v13

    move-object/from16 v24, v14

    move-object/from16 v29, v15

    move v14, v4

    move-object v15, v9

    add-int/lit8 v4, v14, 0x1

    move-object/from16 v0, p0

    move-object/from16 v11, p3

    move-object/from16 v14, v24

    move-object/from16 v15, v29

    goto/16 :goto_9

    .line 96
    :cond_13
    new-instance v0, Ll/ۖ᩷ۜ;

    iget-object v2, v1, Ll/ܳ᩻ۜ;->ۡ:Ljava/lang/String;

    iget-object v3, v10, Ll/ۢۜۜ;->᩻:Ljava/lang/String;

    iget-object v4, v10, Ll/ۢۜۜ;->֫:Ljava/lang/String;

    iget-object v5, v10, Ll/ۢۜۜ;->ᩳ:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v1, v0

    move-object v6, v12

    move-object/from16 v7, v17

    invoke-direct/range {v1 .. v8}, Ll/ۖ᩷ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ll/֫ۢۜ;)V

    return-object v0
.end method
