.class public final Ll/ᩴܳܽ;
.super Ll/ܽܳܽ;
.source "I1F8"


# virtual methods
.method public final ֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V
    .locals 5

    .line 16
    invoke-interface {p2}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 37
    invoke-interface {p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const v2, 0x1000004

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨᩻ܽ;

    .line 38
    invoke-interface {v1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v3

    if-lt v3, v2, :cond_2

    const v2, 0x1000009

    if-le v3, v2, :cond_1

    goto :goto_0

    .line 41
    :cond_1
    invoke-interface {v1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v1

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    .line 20
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Ll/ܽܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V

    return-void

    :cond_3
    const-string v0, "plurals"

    .line 23
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    const-string v1, "name"

    .line 24
    invoke-interface {p2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v1, v3}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    invoke-static {p1, p2, p4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ᩳܳܽ;)V

    .line 26
    invoke-interface {p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/֨᩻ܽ;

    const-string v1, "item"

    .line 27
    invoke-interface {p1, v1}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    .line 28
    invoke-interface {p4}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v3

    sub-int/2addr v3, v2

    .line 29
    sget-object v4, Ll/֨᩻ܽ;->ܳ:[Ljava/lang/String;

    aget-object v3, v4, v3

    const-string v4, "quantity"

    invoke-interface {p1, v4, v3}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-static {p3, p4}, Ll/ۢܳܽ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ljava/lang/CharSequence;

    move-result-object p4

    invoke-static {p1, p4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/CharSequence;)V

    .line 31
    invoke-interface {p1, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    goto :goto_1

    .line 33
    :cond_4
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 17
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
