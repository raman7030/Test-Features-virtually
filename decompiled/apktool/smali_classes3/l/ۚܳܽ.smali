.class public final Ll/ۚܳܽ;
.super Ll/ܽܳܽ;
.source "R1ER"


# virtual methods
.method public final ֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V
    .locals 8

    .line 18
    invoke-interface {p2}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "style"

    .line 21
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    .line 22
    invoke-interface {p2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    invoke-interface {p1, v2, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-interface {p2}, Ll/᩷᩻ܽ;->getParent()I

    move-result v1

    if-eqz v1, :cond_0

    .line 24
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    invoke-interface {p2}, Ll/᩷᩻ܽ;->getParent()I

    move-result v3

    invoke-virtual {p3, v1, v3}, Ll/ܳܳܽ;->ۧ(II)Ljava/lang/String;

    move-result-object v1

    const-string v3, "@"

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "parent"

    invoke-interface {p1, v3, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    :cond_0
    invoke-static {p1, p2, p4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ᩳܳܽ;)V

    .line 27
    invoke-virtual {p3}, Ll/ܳܳܽ;->ۧ()Ll/ܿᩳܽ;

    move-result-object p4

    .line 28
    invoke-interface {p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨᩻ܽ;

    .line 29
    invoke-interface {v3}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v4

    invoke-virtual {p4, v4}, Ll/ܿᩳܽ;->ۧ(I)Ll/ܽᩳܽ;

    move-result-object v4

    if-nez v4, :cond_1

    .line 31
    invoke-static {p1, v3, p3}, Ll/ܽܳܽ;->֫(Ll/ܰܿܽ;Ll/֨᩻ܽ;Ll/ܳܳܽ;)V

    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v4}, Ll/ܽᩳܽ;->֫()Ll/ۨۡᩴ;

    move-result-object v5

    invoke-interface {v3}, Ll/֨᩻ܽ;->ۖ()I

    move-result v6

    check-cast v5, Ll/ᩴۢᩴ;

    invoke-virtual {v5, v6}, Ll/ᩴۢᩴ;->contains(I)Z

    move-result v5

    if-nez v5, :cond_2

    .line 35
    invoke-static {p1, v3, p3}, Ll/ܽܳܽ;->֫(Ll/ܰܿܽ;Ll/֨᩻ܽ;Ll/ܳܳܽ;)V

    goto :goto_0

    .line 38
    :cond_2
    iget v5, v4, Ll/ܽᩳܽ;->֫:I

    ushr-int/lit8 v5, v5, 0x18

    and-int/lit16 v5, v5, 0xff

    .line 39
    invoke-interface {p2}, Ll/᩷᩻ܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v6

    invoke-interface {v6}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v6

    invoke-virtual {p3, v6, v5}, Ll/ܳܳܽ;->֫(II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "item"

    .line 40
    invoke-interface {p1, v6}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    .line 0
    invoke-static {v5}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 41
    iget-object v7, v4, Ll/ܽᩳܽ;->ۧ:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1, v2, v5}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-interface {v3}, Ll/֨᩻ܽ;->ۤ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 44
    iget v5, v4, Ll/ܽᩳܽ;->ᩳ:I

    const/high16 v7, 0x10000

    and-int/2addr v7, v5

    if-eqz v7, :cond_3

    .line 45
    invoke-interface {v3}, Ll/֨᩻ܽ;->getValue()I

    move-result v5

    invoke-virtual {v4, v5}, Ll/ܽᩳܽ;->֫(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/high16 v7, 0x20000

    and-int/2addr v5, v7

    if-eqz v5, :cond_4

    .line 47
    invoke-interface {v3}, Ll/֨᩻ܽ;->getValue()I

    move-result v5

    invoke-virtual {v4, v5}, Ll/ܽᩳܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_5

    .line 51
    invoke-static {p3, v3}, Ll/ۢܳܽ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ljava/lang/CharSequence;

    move-result-object v4

    .line 53
    :cond_5
    invoke-static {p1, v4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/CharSequence;)V

    .line 54
    invoke-interface {p1, v6}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 56
    :cond_6
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 19
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
