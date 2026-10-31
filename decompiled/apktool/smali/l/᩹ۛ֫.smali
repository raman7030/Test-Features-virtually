.class public final Ll/᩹ۛ֫;
.super Ljava/lang/Object;
.source "E8LB"

# interfaces
.implements Ll/ۙۛ֫;


# virtual methods
.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 0

    .line 70
    iget-object p1, p1, Ll/۠ᩴ֫;->ۘ:Ll/᩵ᩴ֫;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ܶۛ֫;Ll/۠ᩴ֫;)Ll/֡ۛ֫;
    .locals 2

    .line 58
    iget-object p1, p2, Ll/۠ᩴ֫;->ۘ:Ll/᩵ᩴ֫;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 61
    :cond_0
    new-instance p1, Ll/ۤۛ֫;

    new-instance p2, Ll/᩵ۛ֫;

    new-instance v0, Ll/᩷ۨ֫;

    .line 62
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const/16 v1, 0x1771

    .line 61
    invoke-direct {p2, v1, v0}, Ll/᩵ۛ֫;-><init>(ILjava/lang/Throwable;)V

    invoke-direct {p1, p2}, Ll/ۤۛ֫;-><init>(Ll/᩵ۛ֫;)V

    return-object p1
.end method

.method public final synthetic ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Landroid/os/Looper;Ll/ܰ۬֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ۧ(Ll/ܶۛ֫;Ll/۠ᩴ֫;)Ll/᩶ۛ֫;
    .locals 0

    .line 0
    sget-object p1, Ll/᩶ۛ֫;->ۧ:Ll/ܶ᩷ۘ;

    return-object p1
.end method

.method public final synthetic ۧ()V
    .locals 0

    return-void
.end method
