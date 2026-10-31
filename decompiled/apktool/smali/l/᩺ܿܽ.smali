.class public final Ll/᩺ܿܽ;
.super Ll/ܽܳܽ;
.source "D1EV"


# virtual methods
.method public final ֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V
    .locals 8

    .line 18
    invoke-interface {p2}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 54
    invoke-interface {p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const v1, 0x1000001

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨᩻ܽ;

    .line 55
    invoke-interface {v2}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v2

    add-int/lit8 v3, v1, 0x1

    if-eq v2, v1, :cond_0

    .line 22
    invoke-super {p0, p1, p2, p3, p4}, Ll/ܽܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V

    return-void

    :cond_0
    move v1, v3

    goto :goto_0

    .line 63
    :cond_1
    invoke-interface {p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨᩻ܽ;

    .line 64
    invoke-interface {v3}, Ll/֨᩻ܽ;->ۖ()I

    move-result v6

    if-ne v6, v4, :cond_2

    goto :goto_1

    :cond_2
    if-ne v6, v5, :cond_3

    .line 68
    invoke-interface {v3}, Ll/֨᩻ܽ;->getValue()I

    move-result v3

    invoke-virtual {p3, v3}, Ll/ܳܳܽ;->֫(I)Ll/֡᩻ܽ;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 69
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v3

    const-string v6, "string"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_3
    const/4 v3, 0x3

    if-eq v6, v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    if-lez v2, :cond_6

    const-string v0, "string-array"

    goto :goto_5

    .line 84
    :cond_6
    :goto_2
    invoke-interface {p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨᩻ܽ;

    .line 85
    invoke-interface {v3}, Ll/֨᩻ܽ;->ۖ()I

    move-result v6

    if-ne v6, v4, :cond_7

    goto :goto_3

    :cond_7
    if-ne v6, v5, :cond_8

    .line 89
    invoke-interface {v3}, Ll/֨᩻ܽ;->getValue()I

    move-result v3

    invoke-virtual {p3, v3}, Ll/ܳܳܽ;->֫(I)Ll/֡᩻ܽ;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 90
    invoke-interface {v3}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v3

    const-string v6, "integer"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_4

    .line 96
    :cond_8
    invoke-interface {v3}, Ll/֨᩻ܽ;->ۖ()I

    move-result v6

    const/16 v7, 0x10

    if-eq v6, v7, :cond_9

    .line 97
    invoke-interface {v3}, Ll/֨᩻ܽ;->ۖ()I

    move-result v3

    const/16 v6, 0x11

    if-eq v3, v6, :cond_9

    goto :goto_4

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    if-lez v2, :cond_b

    const-string v0, "integer-array"

    goto :goto_5

    :cond_b
    :goto_4
    const-string v0, "array"

    const/4 v1, 0x1

    .line 35
    :goto_5
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    const-string v2, "name"

    .line 36
    invoke-interface {p2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    invoke-static {p1, p2, p4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ᩳܳܽ;)V

    .line 38
    invoke-interface {p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/֨᩻ܽ;

    if-eqz v1, :cond_c

    .line 41
    invoke-static {p4}, Ll/ۢܳܽ;->֫(Ll/֨᩻ܽ;)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_c
    const-string v2, "item"

    .line 45
    :goto_7
    invoke-interface {p1, v2}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    .line 46
    invoke-static {p3, p4}, Ll/ۢܳܽ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ljava/lang/CharSequence;

    move-result-object p4

    invoke-static {p1, p4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/CharSequence;)V

    .line 47
    invoke-interface {p1, v2}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    goto :goto_6

    .line 49
    :cond_d
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 19
    :cond_e
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
