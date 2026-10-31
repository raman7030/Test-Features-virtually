.class public final Ll/۠ܺ᩵;
.super Ll/ۛܺ᩵;
.source "RA0U"


# instance fields
.field public ֫:Ljava/lang/String;


# virtual methods
.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 1

    const/4 v0, 0x4

    .line 44
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 45
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 49
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ᩳ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۠ܺ᩵;->֫:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 1

    const/4 v0, 0x4

    .line 31
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 32
    iget-object v0, p0, Ll/۠ܺ᩵;->֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 34
    iget-object v0, p0, Ll/۠ܺ᩵;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 35
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 36
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
