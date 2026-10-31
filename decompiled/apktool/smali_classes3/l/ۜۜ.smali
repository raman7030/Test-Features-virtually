.class public final Ll/ۜۜ;
.super Ll/ܰܺ;
.source "U50M"


# instance fields
.field public final synthetic ۨ:Ll/ۢۜ;


# direct methods
.method public constructor <init>(Ll/ۢۜ;)V
    .locals 0

    .line 303
    iput-object p1, p0, Ll/ۜۜ;->ۨ:Ll/ۢۜ;

    .line 304
    invoke-direct {p0, p1}, Ll/ܰܺ;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۢ᩷;
    .locals 1

    .line 309
    iget-object v0, p0, Ll/ۜۜ;->ۨ:Ll/ۢۜ;

    iget-object v0, v0, Ll/ۢۜ;->ۤ:Ll/᩷ۜ;

    if-eqz v0, :cond_0

    .line 310
    invoke-virtual {v0}, Ll/᩷ۜ;->֫()Ll/ۢ᩷;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ()Z
    .locals 2

    .line 318
    iget-object v0, p0, Ll/ۜۜ;->ۨ:Ll/ۢۜ;

    iget-object v1, v0, Ll/ۢۜ;->ۗ:Ll/ۙۜ;

    if-eqz v1, :cond_0

    iget-object v0, v0, Ll/ۢۜ;->ۙ:Ll/ۛۜ;

    invoke-interface {v1, v0}, Ll/ۙۜ;->֫(Ll/ۛۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 319
    invoke-virtual {p0}, Ll/ۜۜ;->֫()Ll/ۢ᩷;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 320
    invoke-interface {v0}, Ll/ۢ᩷;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
