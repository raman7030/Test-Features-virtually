.class public final Ll/᩹ۚᩳ;
.super Ll/֡ܽ;
.source "75NJ"


# instance fields
.field public final synthetic ᩳ:Ll/ܽ֨ᩳ;


# direct methods
.method public constructor <init>(Ll/ܽ֨ᩳ;)V
    .locals 0

    .line 452
    iput-object p1, p0, Ll/᩹ۚᩳ;->ᩳ:Ll/ܽ֨ᩳ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 4

    .line 455
    iget-object v0, p0, Ll/᩹ۚᩳ;->ᩳ:Ll/ܽ֨ᩳ;

    invoke-static {v0}, Ll/ܽ֨ᩳ;->ܳ(Ll/ܽ֨ᩳ;)Ll/۬ۧ֫;

    move-result-object v1

    const v2, 0x800003

    invoke-virtual {v1, v2}, Ll/۬ۧ֫;->ᩳ(I)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 457
    invoke-static {v0}, Ll/ܽ֨ᩳ;->ۢ(Ll/ܽ֨ᩳ;)Ll/ܽۢۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 458
    invoke-static {v0}, Ll/ܽ֨ᩳ;->ۢ(Ll/ܽ֨ᩳ;)Ll/ܽۢۡ;

    move-result-object v0

    .line 77
    invoke-virtual {v0, v3}, Ll/ܽۢۡ;->֫(Z)V

    return-void

    .line 460
    :cond_0
    invoke-static {v0}, Ll/ܽ֨ᩳ;->ܳ(Ll/ܽ֨ᩳ;)Ll/۬ۧ֫;

    move-result-object v0

    invoke-virtual {v0, v2}, Ll/۬ۧ֫;->֫(I)V

    return-void

    .line 463
    :cond_1
    invoke-static {v0}, Ll/ܽ֨ᩳ;->ܿ(Ll/ܽ֨ᩳ;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    .line 464
    invoke-virtual {v0}, Ll/֡᩻֫;->ۢ()Ll/ۚۜ֫;

    move-result-object v1

    const v2, 0x7f0a010f

    invoke-virtual {v1, v2}, Ll/ۚۜ֫;->֫(I)Ll/ۡ᩻֫;

    move-result-object v1

    .line 465
    instance-of v2, v1, Ll/᩹ܶᩳ;

    if-eqz v2, :cond_2

    .line 466
    check-cast v1, Ll/᩹ܶᩳ;

    invoke-virtual {v1}, Ll/᩹ܶᩳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    .line 471
    :cond_2
    invoke-virtual {v0, v3}, Ll/ܽ֨ᩳ;->֫(Z)V

    return-void
.end method
