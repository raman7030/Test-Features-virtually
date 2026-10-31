.class public final Ll/ۨۛܽ;
.super Ljava/lang/Object;
.source "H5BW"

# interfaces
.implements Ll/᩻ۨܽ;


# instance fields
.field public final synthetic ֫:Ll/᩻ۨܽ;


# direct methods
.method public constructor <init>(Ll/᩻ۨܽ;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۛܽ;->֫:Ll/᩻ۨܽ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܽ᩺ܽ;
    .locals 5

    .line 152
    iget-object v0, p0, Ll/ۨۛܽ;->֫:Ll/᩻ۨܽ;

    invoke-interface {v0}, Ll/᩻ۨܽ;->֫()Ll/ܽ᩺ܽ;

    move-result-object v0

    .line 153
    invoke-static {}, Ll/ܶܿᩳ;->ۚ()Ll/ܶܿᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v1, 0x7f120aa3

    .line 25
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 153
    invoke-virtual {v0}, Ll/ܽ᩺ܽ;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 154
    new-instance v1, Ll/ܽ᩺ܽ;

    invoke-virtual {v0}, Ll/ܽ᩺ܽ;->ᩳ()Ll/۠ۧᩳ;

    move-result-object v2

    .line 155
    invoke-virtual {v0}, Ll/ܽ᩺ܽ;->ܳ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ll/ܽ᩺ܽ;->֫()Z

    move-result v0

    const-string v4, ""

    invoke-direct {v1, v4, v2, v3, v0}, Ll/ܽ᩺ܽ;-><init>(Ljava/lang/String;Ll/۠ۧᩳ;Ljava/lang/String;Z)V

    return-object v1

    :cond_0
    return-object v0
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 1

    .line 183
    iget-object v0, p0, Ll/ۨۛܽ;->֫:Ll/᩻ۨܽ;

    check-cast v0, Ll/۫ۛܽ;

    invoke-virtual {v0, p1}, Ll/۫ۛܽ;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۨۛܽ;->֫:Ll/᩻ۨܽ;

    check-cast v0, Ll/۫ۛܽ;

    .line 455
    iget-object v0, v0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->֫(Ll/ۢۨܽ;)Z

    move-result v0

    return v0
.end method

.method public final ܿ()Ll/᩸ܿᩳ;
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ۨۛܽ;->֫:Ll/᩻ۨܽ;

    check-cast v0, Ll/۫ۛܽ;

    .line 466
    iget-object v0, v0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->ۧ(Ll/ۢۨܽ;)Ll/᩸ܿᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ۨۛܽ;->֫:Ll/᩻ۨܽ;

    check-cast v0, Ll/۫ۛܽ;

    .line 460
    iget-object v0, v0, Ll/۫ۛܽ;->ᩳ:Ll/ۢۨܽ;

    invoke-static {v0}, Ll/ۢۨܽ;->ܽ(Ll/ۢۨܽ;)Z

    move-result v0

    return v0
.end method
