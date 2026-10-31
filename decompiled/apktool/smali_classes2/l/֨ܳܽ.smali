.class public final Ll/֨ܳܽ;
.super Ljava/lang/Object;
.source "E1FH"

# interfaces
.implements Ll/ۛܳܽ;


# virtual methods
.method public final ֫(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)V
    .locals 7

    const/4 v0, 0x1

    .line 17
    invoke-virtual {p1, v0}, Ll/ᩴܿܽ;->ۧ(Z)V

    .line 19
    invoke-virtual {p3}, Ll/᩵ۘܽ;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "integer-array"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    goto :goto_0

    :sswitch_1
    const-string v2, "array"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v5, 0x1

    goto :goto_0

    :sswitch_2
    const-string v2, "string-array"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 33
    new-instance p1, Ll/֫ۘܽ;

    const-string p2, "Unknown tag: <"

    const-string v0, ">"

    .line 0
    invoke-static {p2, v1, v0}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 33
    invoke-direct {p1, p2, p3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ۡۘܽ;)V

    throw p1

    :pswitch_0
    const/4 v3, 0x1

    goto :goto_1

    :pswitch_1
    const/4 v3, 0x2

    .line 35
    :goto_1
    :pswitch_2
    invoke-static {p3}, Ll/᩵ۘܽ;->֫(Ll/᩵ۘܽ;)Ljava/util/Iterator;

    move-result-object p3

    const v1, 0x1000001

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ۘܽ;

    if-eq v3, v4, :cond_4

    .line 36
    invoke-virtual {v2}, Ll/᩵ۘܽ;->ۡ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 37
    invoke-virtual {v2}, Ll/᩵ۘܽ;->ۢ()Ll/֨ۘܽ;

    move-result-object v5

    invoke-virtual {v5}, Ll/֨ۘܽ;->᩻()Ljava/lang/String;

    move-result-object v5

    const-string v6, "@"

    .line 38
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 137
    invoke-static {p1, v2, p2, v0}, Ll/ۨܳܽ;->֫(Ll/ᩴܿܽ;Ll/᩵ۘܽ;Ll/ۤܳܽ;Z)Ll/ۙܿܽ;

    move-result-object v2

    add-int/lit8 v5, v1, 0x1

    .line 39
    invoke-virtual {v2, v1}, Ll/ۙܿܽ;->ᩳ(I)V

    goto :goto_3

    :cond_3
    const-string v6, "?"

    .line 41
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 42
    invoke-static {p1, p2, v2}, Ll/ۨܳܽ;->֫(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object v2

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v2, v1}, Ll/ۙܿܽ;->ᩳ(I)V

    goto :goto_3

    :cond_4
    if-nez v3, :cond_5

    .line 47
    invoke-static {p1, p2, v2}, Ll/ۨܳܽ;->ۜ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object v2

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v2, v1}, Ll/ۙܿܽ;->ᩳ(I)V

    :goto_3
    move v1, v5

    goto :goto_2

    :cond_5
    if-ne v3, v0, :cond_6

    .line 49
    invoke-static {p1, p2, v2}, Ll/ۨܳܽ;->᩻(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object v2

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v2, v1}, Ll/ۙܿܽ;->ᩳ(I)V

    goto :goto_3

    .line 51
    :cond_6
    invoke-static {p1, p2, v2}, Ll/ۙܳܽ;->ۧ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    move-result-object v2

    add-int/lit8 v5, v1, 0x1

    invoke-virtual {v2, v1}, Ll/ۙܿܽ;->ᩳ(I)V

    goto :goto_3

    :cond_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3d122a63 -> :sswitch_2
        0x58c7259 -> :sswitch_1
        0x7ee9a10a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
