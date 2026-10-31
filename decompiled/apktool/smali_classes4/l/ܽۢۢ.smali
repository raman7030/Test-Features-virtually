.class public final Ll/ܽۢۢ;
.super Ll/֡ܽ;
.source "K1PX"


# instance fields
.field public final synthetic ܿ:Ll/۠ۢۢ;

.field public ᩳ:Ll/ۡۤۡ;


# direct methods
.method public constructor <init>(Ll/۠ۢۢ;)V
    .locals 0

    .line 129
    iput-object p1, p0, Ll/ܽۢۢ;->ܿ:Ll/۠ۢۢ;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    .line 130
    invoke-static {}, Ll/ۡۤۡ;->ܳ()Ll/ۡۤۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ܽۢۢ;->ᩳ:Ll/ۡۤۡ;

    return-void
.end method


# virtual methods
.method public final ۧ()V
    .locals 2

    .line 134
    iget-object v0, p0, Ll/ܽۢۢ;->ܿ:Ll/۠ۢۢ;

    invoke-static {v0}, Ll/۠ۢۢ;->ܽ(Ll/۠ۢۢ;)Ll/֡ܰۧ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/۠ۢۢ;->ܽ(Ll/۠ۢۢ;)Ll/֡ܰۧ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡ܰۧ;->ܽ()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ll/۠ۢۢ;->ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;

    move-result-object v1

    iget-object v1, v1, Ll/ۖۢۢ;->֫:Ll/ۚۢۢ;

    invoke-virtual {v1}, Ll/ۚۢۢ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 136
    :cond_0
    iget-object v1, p0, Ll/ܽۢۢ;->ᩳ:Ll/ۡۤۡ;

    invoke-virtual {v1}, Ll/ۡۤۡ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 137
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    .line 138
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    const v0, 0x7f12079b

    .line 140
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method
