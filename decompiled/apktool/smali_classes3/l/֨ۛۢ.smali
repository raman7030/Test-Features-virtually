.class public abstract Ll/֨ۛۢ;
.super Ll/ۢܳ֡;
.source "B6NC"


# direct methods
.method public static ֫(Ll/᩷ۛۢ;)Z
    .locals 3

    .line 1419
    const-class v0, Ll/ۘۛۢ;

    invoke-virtual {p0, v0}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 20
    iget-object p0, p0, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result p0

    const/16 v0, 0x38

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_0
    sub-int/2addr v1, v2

    .line 1422
    invoke-virtual {p0, v0, v1}, Ll/ۡܳ֡;->֫(Ljava/lang/Class;I)Ll/ۡܳ֡;

    move-result-object p0

    check-cast p0, Ll/ۘۛۢ;

    .line 21
    iget-object p0, p0, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    invoke-interface {p0}, Ll/֡ܳ֡;->getType()I

    move-result p0

    const/16 v0, 0x2f

    if-eq p0, v0, :cond_2

    const/16 v0, 0x1a

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    return v2
.end method


# virtual methods
.method public final ܶ()Z
    .locals 3

    .line 11
    iget-object v0, p0, Ll/ۢܳ֡;->᩻:Ll/֫ܳ֡;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ll/ܳܳ֡;->ۧ(I)I

    move-result v0

    const/16 v2, 0x1a

    if-eq v0, v2, :cond_0

    const/16 v2, 0x1e

    if-eq v0, v2, :cond_0

    const/16 v2, 0x26

    if-eq v0, v2, :cond_0

    const/16 v2, 0x2d

    if-eq v0, v2, :cond_0

    const/16 v2, 0x2f

    if-eq v0, v2, :cond_0

    packed-switch v0, :pswitch_data_0

    return v1

    :cond_0
    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x39
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
