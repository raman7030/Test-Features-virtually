.class public final Ll/ܶܳܽ;
.super Ljava/lang/Object;
.source "C1G9"

# interfaces
.implements Ll/ۛܳܽ;


# virtual methods
.method public final ֫(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)V
    .locals 12

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Ll/ᩴܿܽ;->ۧ(Z)V

    const-string v0, "format"

    .line 66
    invoke-virtual {p3, v0}, Ll/᩵ۘܽ;->֫(Ljava/lang/String;)Ll/ᩴۘܽ;

    move-result-object v0

    const-string v1, "enum"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const v0, 0xffff

    goto/16 :goto_4

    .line 69
    :cond_0
    invoke-virtual {v0}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v0, 0x0

    goto/16 :goto_4

    .line 73
    :cond_1
    invoke-virtual {v0}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\|"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const/high16 v7, 0x10000

    const/high16 v8, 0x20000

    if-ge v6, v4, :cond_c

    aget-object v9, v3, v6

    .line 74
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v10

    const/4 v11, -0x1

    sparse-switch v10, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v10, "integer"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v11, 0x9

    goto/16 :goto_1

    :sswitch_1
    const-string v10, "float"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v11, 0x8

    goto :goto_1

    :sswitch_2
    const-string v10, "flags"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_1

    :cond_4
    const/4 v11, 0x7

    goto :goto_1

    :sswitch_3
    const-string v10, "color"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_1

    :cond_5
    const/4 v11, 0x6

    goto :goto_1

    :sswitch_4
    const-string v10, "boolean"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_1

    :cond_6
    const/4 v11, 0x5

    goto :goto_1

    :sswitch_5
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    goto :goto_1

    :cond_7
    const/4 v11, 0x4

    goto :goto_1

    :sswitch_6
    const-string v10, "string"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    goto :goto_1

    :cond_8
    const/4 v11, 0x3

    goto :goto_1

    :sswitch_7
    const-string v10, "reference"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_1

    :cond_9
    const/4 v11, 0x2

    goto :goto_1

    :sswitch_8
    const-string v10, "dimension"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    goto :goto_1

    :cond_a
    const/4 v11, 0x1

    goto :goto_1

    :sswitch_9
    const-string v10, "fraction"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    goto :goto_1

    :cond_b
    const/4 v11, 0x0

    :goto_1
    packed-switch v11, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    or-int/lit8 v5, v5, 0x4

    goto :goto_2

    :pswitch_1
    or-int/lit8 v5, v5, 0x20

    goto :goto_2

    :pswitch_2
    or-int/2addr v5, v8

    goto :goto_2

    :pswitch_3
    or-int/lit8 v5, v5, 0x10

    goto :goto_2

    :pswitch_4
    or-int/lit8 v5, v5, 0x8

    goto :goto_2

    :pswitch_5
    or-int/2addr v5, v7

    goto :goto_2

    :pswitch_6
    or-int/lit8 v5, v5, 0x2

    goto :goto_2

    :pswitch_7
    or-int/lit8 v5, v5, 0x1

    goto :goto_2

    :pswitch_8
    or-int/lit8 v5, v5, 0x40

    goto :goto_2

    :pswitch_9
    or-int/lit16 v5, v5, 0x80

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_c
    and-int v3, v5, v7

    if-eqz v3, :cond_e

    and-int v3, v5, v8

    if-nez v3, :cond_d

    goto :goto_3

    .line 108
    :cond_d
    new-instance p1, Ll/֫ۘܽ;

    const-string p2, "Cannot define flag and enum at the same time"

    invoke-direct {p1, p2, v0}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    throw p1

    :cond_e
    :goto_3
    move v0, v5

    :goto_4
    const/high16 v3, 0x1000000

    const/16 v4, 0x10

    .line 19
    invoke-virtual {p1, v0, v4, v3}, Ll/ᩴܿܽ;->֫(III)Ll/ۙܿܽ;

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "idTypeNameMap-"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ᩴܿܽ;->᩶()Ll/۠ܿܽ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۠ᩳܽ;->᩻()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ll/۠ܳܽ;

    invoke-direct {v3, p1}, Ll/۠ܳܽ;-><init>(Ll/ᩴܿܽ;)V

    invoke-virtual {p2, v0, v3}, Ll/ۤܳܽ;->֫(Ljava/lang/String;Ll/۠ܳܽ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ܿܽ;

    .line 28
    invoke-virtual {p1}, Ll/ᩴܿܽ;->᩶()Ll/۠ܿܽ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۠ܿܽ;->ܶ()Ll/᩶ܿܽ;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 30
    invoke-virtual {v3}, Ll/᩶ܿܽ;->ۡ()Ll/۠ܿܽ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۠ᩳܽ;->᩻()I

    move-result v2

    shl-int/lit8 v2, v2, 0x18

    invoke-virtual {v3}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v3

    shl-int/2addr v3, v4

    or-int/2addr v2, v3

    .line 33
    :cond_f
    new-instance v3, Ll/ۜ᩺ۡ;

    invoke-direct {v3}, Ll/ۜ᩺ۡ;-><init>()V

    .line 34
    invoke-static {p3}, Ll/᩵ۘܽ;->֫(Ll/᩵ۘܽ;)Ljava/util/Iterator;

    move-result-object p3

    :goto_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩵ۘܽ;

    .line 35
    invoke-virtual {v4}, Ll/᩵ۘܽ;->᩷()Ljava/lang/String;

    move-result-object v5

    const-string v6, "flag"

    .line 36
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_6

    .line 58
    :cond_10
    invoke-static {v4, v3}, Ll/ۙܳܽ;->֫(Ll/᩵ۘܽ;Ll/ۜ᩺ۡ;)I

    move-result v5

    .line 59
    invoke-static {p1, p2, v4}, Ll/ۙܳܽ;->ۧ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object v4

    invoke-virtual {v4, v5}, Ll/ۙܿܽ;->ᩳ(I)V

    goto :goto_5

    :cond_11
    :goto_6
    const-string v5, "name"

    .line 37
    invoke-virtual {v4, v5}, Ll/᩵ۘܽ;->ۧ(Ljava/lang/String;)Ll/ᩴۘܽ;

    move-result-object v5

    const-string v6, "value"

    .line 38
    invoke-virtual {v4, v6}, Ll/᩵ۘܽ;->ۧ(Ljava/lang/String;)Ll/ᩴۘܽ;

    move-result-object v4

    .line 39
    invoke-virtual {v5}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v6

    .line 40
    invoke-virtual {v4}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v7

    .line 42
    invoke-static {v6}, Ll/ۙܳܽ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    if-nez v8, :cond_13

    if-nez v0, :cond_12

    const/4 v8, 0x0

    goto :goto_7

    .line 44
    :cond_12
    invoke-virtual {v0, v6}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    :goto_7
    if-eqz v8, :cond_13

    .line 46
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    or-int/2addr v8, v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    :cond_13
    if-eqz v8, :cond_15

    .line 52
    invoke-static {v7, v3}, Ll/ۢ᩺ۡ;->ܽ(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 53
    iget v4, v3, Ll/ۜ᩺ۡ;->ܽ:I

    iget v5, v3, Ll/ۜ᩺ۡ;->ܿ:I

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {p1, v4, v5, v6}, Ll/ᩴܿܽ;->֫(III)Ll/ۙܿܽ;

    goto :goto_5

    .line 55
    :cond_14
    new-instance p1, Ll/֫ۘܽ;

    const-string p2, "Value must be integer"

    invoke-direct {p1, p2, v4}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    throw p1

    .line 50
    :cond_15
    new-instance p1, Ll/֫ۘܽ;

    const-string p2, "Unknown name: "

    invoke-virtual {p2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v5}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    throw p1

    :cond_16
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x62923dfe -> :sswitch_9
        -0x4144929a -> :sswitch_8
        -0x3724c0b5 -> :sswitch_7
        -0x352a9fef -> :sswitch_6
        0x2f9501 -> :sswitch_5
        0x3db6c28 -> :sswitch_4
        0x5a72f63 -> :sswitch_3
        0x5cfee87 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x74b5813e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
