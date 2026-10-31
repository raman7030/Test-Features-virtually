.class public final Ll/᩷۠ۘ;
.super Ljava/lang/Object;
.source "27JF"

# interfaces
.implements Ll/᩹֨ۘ;


# instance fields
.field public final synthetic ֫:Ll/֡ܰۧ;

.field public ۧ:Ll/ۜ۠ۘ;


# direct methods
.method public constructor <init>(Ll/֡ܰۧ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/᩷۠ۘ;->֫:Ll/֡ܰۧ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 35
    iget-object v0, p0, Ll/᩷۠ۘ;->֫:Ll/֡ܰۧ;

    invoke-virtual {v0}, Ll/֡ܰۧ;->ۧ()Ll/ۨ᩺ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/᩷۠ۘ;->֫:Ll/֡ܰۧ;

    invoke-virtual {v0, p1}, Ll/֡ܰۧ;->ܿ(I)V

    return-void
.end method

.method public final ֫(Ll/ۨ֨ۘ;)V
    .locals 1

    const-string v0, "onPageChangeListenerHelper"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    new-instance v0, Ll/ۜ۠ۘ;

    invoke-direct {v0, p1}, Ll/ۜ۠ۘ;-><init>(Ll/ۨ֨ۘ;)V

    iput-object v0, p0, Ll/᩷۠ۘ;->ۧ:Ll/ۜ۠ۘ;

    .line 63
    iget-object p1, p0, Ll/᩷۠ۘ;->֫:Ll/֡ܰۧ;

    invoke-virtual {p1, v0}, Ll/֡ܰۧ;->֫(Ll/ۖܰۧ;)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩷۠ۘ;->֫:Ll/֡ܰۧ;

    invoke-virtual {v0}, Ll/֡ܰۧ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩷۠ۘ;->֫:Ll/֡ܰۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/֡ܰۧ;->ۧ()Ll/ۨ᩺ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 2

    .line 42
    iget-object v0, p0, Ll/᩷۠ۘ;->ۧ:Ll/ۜ۠ۘ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩷۠ۘ;->֫:Ll/֡ܰۧ;

    invoke-virtual {v1, v0}, Ll/֡ܰۧ;->ۧ(Ll/ۖܰۧ;)V

    :cond_0
    return-void
.end method

.method public final ᩳ()Z
    .locals 2

    const-string v0, "<this>"

    .line 0
    iget-object v1, p0, Ll/᩷۠ۘ;->֫:Ll/֡ܰۧ;

    invoke-static {v1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1}, Ll/֡ܰۧ;->ۧ()Ll/ۨ᩺ۧ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v1
.end method
