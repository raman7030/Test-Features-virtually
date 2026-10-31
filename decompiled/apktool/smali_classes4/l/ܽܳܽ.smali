.class public Ll/ܽܳܽ;
.super Ljava/lang/Object;
.source "O1EB"

# interfaces
.implements Ll/᩻ܳܽ;


# direct methods
.method public static ֫(Ll/ܰܿܽ;Ll/֨᩻ܽ;Ll/ܳܳܽ;)V
    .locals 3

    .line 34
    invoke-static {p1}, Ll/ۢܳܽ;->֫(Ll/֨᩻ܽ;)Ljava/lang/String;

    move-result-object v0

    .line 35
    invoke-interface {p0, v0}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    .line 36
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 37
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v1

    invoke-static {v1}, Ll/ۢۤۡ;->֫(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "id"

    invoke-interface {p0, v2, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    :cond_0
    invoke-static {p2, p1}, Ll/ۢܳܽ;->֫(Ll/ܳܳܽ;Ll/֨᩻ܽ;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ljava/lang/CharSequence;)V

    .line 40
    invoke-interface {p0, v0}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ܳܳܽ;Ll/ᩳܳܽ;)V
    .locals 3

    .line 18
    invoke-interface {p2}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "complex"

    .line 21
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->ۧ(Ljava/lang/String;)V

    const-string v1, "name"

    .line 22
    invoke-interface {p2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-interface {p2}, Ll/᩷᩻ܽ;->getParent()I

    move-result v1

    if-eqz v1, :cond_0

    .line 24
    invoke-interface {p2}, Ll/᩷᩻ܽ;->getParent()I

    move-result v1

    invoke-static {v1}, Ll/ۢۤۡ;->֫(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "parent"

    invoke-interface {p1, v2, v1}, Ll/ܰܿܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    :cond_0
    invoke-static {p1, p2, p4}, Ll/ۢܳܽ;->֫(Ll/ܰܿܽ;Ll/᩷᩻ܽ;Ll/ᩳܳܽ;)V

    .line 27
    invoke-interface {p2}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/֨᩻ܽ;

    .line 28
    invoke-static {p1, p4, p3}, Ll/ܽܳܽ;->֫(Ll/ܰܿܽ;Ll/֨᩻ܽ;Ll/ܳܳܽ;)V

    goto :goto_0

    .line 30
    :cond_1
    invoke-interface {p1, v0}, Ll/ܰܿܽ;->֫(Ljava/lang/String;)V

    return-void

    .line 19
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
