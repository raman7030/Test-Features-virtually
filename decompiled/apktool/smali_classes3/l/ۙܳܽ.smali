.class public final Ll/ۙܳܽ;
.super Ljava/lang/Object;
.source "91EZ"

# interfaces
.implements Ll/ۛܳܽ;


# direct methods
.method public static ֫(Ll/᩵ۘܽ;Ll/ۜ᩺ۡ;)I
    .locals 3

    const-string v0, "id"

    .line 44
    invoke-virtual {p0, v0}, Ll/᩵ۘܽ;->֫(Ljava/lang/String;)Ll/ᩴۘܽ;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 46
    invoke-virtual {p0}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-static {v0}, Ll/ۙܳܽ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 61
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Ll/ۜ᩺ۡ;->ܽ:I

    const/16 v0, 0x11

    .line 62
    iput v0, p1, Ll/ۜ᩺ۡ;->ܿ:I

    const/4 v0, 0x1

    goto :goto_0

    .line 65
    :cond_0
    invoke-static {v0, p1}, Ll/ۢ᩺ۡ;->ܽ(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    .line 47
    iget p0, p1, Ll/ۜ᩺ۡ;->ܽ:I

    return p0

    .line 49
    :cond_1
    new-instance p1, Ll/֫ۘܽ;

    invoke-virtual {p0}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Expected integer value: id=\""

    const-string v2, "\""

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 49
    invoke-direct {p1, v0, p0}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    throw p1

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 8

    .line 73
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-string v5, "0x"

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 74
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 76
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 77
    invoke-static {p0}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;
    .locals 7

    .line 83
    invoke-virtual {p2}, Ll/᩵ۘܽ;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x7

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "integer"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v6, 0xa

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "dynamic-reference"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v6, 0x9

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "float"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v6, 0x8

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "dimen"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x7

    goto :goto_0

    :sswitch_4
    const-string v1, "color"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v6, 0x6

    goto :goto_0

    :sswitch_5
    const-string v1, "attribute"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v6, 0x5

    goto :goto_0

    :sswitch_6
    const-string v1, "bool"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v6, 0x4

    goto :goto_0

    :sswitch_7
    const-string v1, "string"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v6, 0x3

    goto :goto_0

    :sswitch_8
    const-string v1, "reference"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v6, 0x2

    goto :goto_0

    :sswitch_9
    const-string v1, "fraction"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v6, 0x1

    goto :goto_0

    :sswitch_a
    const-string v1, "dynamic-attribute"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v6, 0x0

    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 113
    new-instance p0, Ll/֫ۘܽ;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Unknown tag <"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ll/᩵ۘܽ;->᩷()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ">"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ۡۘܽ;)V

    throw p0

    .line 107
    :pswitch_0
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->᩻(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 89
    :pswitch_1
    invoke-static {p0, p2, p1, v5}, Ll/ۨܳܽ;->֫(Ll/ᩴܿܽ;Ll/᩵ۘܽ;Ll/ۤܳܽ;Z)Ll/ۙܿܽ;

    move-result-object p0

    .line 90
    invoke-virtual {p0, v3}, Ll/ۙܿܽ;->᩻(I)V

    return-object p0

    .line 101
    :pswitch_2
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->ܿ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 103
    :pswitch_3
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->ᩳ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 111
    :pswitch_4
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->ܽ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 87
    :pswitch_5
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->֫(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 109
    :pswitch_6
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->ۧ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 99
    :pswitch_7
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->ۜ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 137
    :pswitch_8
    invoke-static {p0, p2, p1, v4}, Ll/ۨܳܽ;->֫(Ll/ᩴܿܽ;Ll/᩵ۘܽ;Ll/ۤܳܽ;Z)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 105
    :pswitch_9
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->ܳ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    return-object p0

    .line 94
    :pswitch_a
    invoke-static {p0, p1, p2}, Ll/ۨܳܽ;->֫(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object p0

    .line 95
    invoke-virtual {p0, v2}, Ll/ۙܿܽ;->᩻(I)V

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x729a1572 -> :sswitch_a
        -0x62923dfe -> :sswitch_9
        -0x3724c0b5 -> :sswitch_8
        -0x352a9fef -> :sswitch_7
        0x2e3aea -> :sswitch_6
        0xc7aa9c -> :sswitch_5
        0x5a72f63 -> :sswitch_4
        0x5b28f31 -> :sswitch_3
        0x5d0225c -> :sswitch_2
        0x55797f3d -> :sswitch_1
        0x74b5813e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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


# virtual methods
.method public final ֫(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)V
    .locals 5

    const/4 v0, 0x1

    .line 26
    invoke-virtual {p1, v0}, Ll/ᩴܿܽ;->ۧ(Z)V

    .line 27
    new-instance v1, Ll/ۜ᩺ۡ;

    invoke-direct {v1}, Ll/ۜ᩺ۡ;-><init>()V

    const-string v2, "parent"

    .line 28
    invoke-virtual {p3, v2}, Ll/᩵ۘܽ;->֫(Ljava/lang/String;)Ll/ᩴۘܽ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 30
    invoke-virtual {v2}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v3

    .line 59
    invoke-static {v3}, Ll/ۙܳܽ;->֫(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 61
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v1, Ll/ۜ᩺ۡ;->ܽ:I

    const/16 v3, 0x11

    .line 62
    iput v3, v1, Ll/ۜ᩺ۡ;->ܿ:I

    goto :goto_0

    .line 65
    :cond_0
    invoke-static {v3, v1}, Ll/ۢ᩺ۡ;->ܽ(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    .line 31
    iget v0, v1, Ll/ۜ᩺ۡ;->ܽ:I

    invoke-virtual {p1, v0}, Ll/ᩴܿܽ;->֡(I)V

    goto :goto_1

    .line 33
    :cond_1
    new-instance p1, Ll/֫ۘܽ;

    invoke-virtual {v2}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Expected integer value: parent=\""

    const-string v0, "\""

    .line 0
    invoke-static {p3, p2, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 33
    invoke-direct {p1, p2, v2}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    throw p1

    .line 36
    :cond_2
    :goto_1
    invoke-static {p3}, Ll/᩵ۘܽ;->֫(Ll/᩵ۘܽ;)Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۘܽ;

    .line 37
    invoke-static {v0, v1}, Ll/ۙܳܽ;->֫(Ll/᩵ۘܽ;Ll/ۜ᩺ۡ;)I

    move-result v2

    .line 38
    invoke-static {p1, p2, v0}, Ll/ۙܳܽ;->ۧ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/ۙܿܽ;->ᩳ(I)V

    goto :goto_2

    :cond_3
    return-void
.end method
