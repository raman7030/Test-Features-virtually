.class public final Ll/ܶܺ᩵;
.super Ll/ۛܺ᩵;
.source "RA0U"


# instance fields
.field public ֫:Ljava/lang/String;


# virtual methods
.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 1

    const/4 v0, 0x4

    .line 316
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 317
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_0

    .line 320
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 321
    invoke-virtual {p1}, Ll/۬ܺ᩵;->ᩳ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܶܺ᩵;->֫:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 1

    const/4 v0, 0x4

    .line 303
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 304
    iget-object v0, p0, Ll/ܶܺ᩵;->֫:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 306
    iget-object v0, p0, Ll/ܶܺ᩵;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 307
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 308
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
