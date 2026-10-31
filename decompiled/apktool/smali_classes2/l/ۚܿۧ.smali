.class public abstract Ll/ۚܿۧ;
.super Ljava/lang/Object;
.source "Y8OI"


# instance fields
.field public ֫:Ll/۬ܿۧ;

.field public ۧ:Ll/֡ܿۧ;


# virtual methods
.method public abstract ֫([Ll/ᩳ۬֫;Ll/ۛܽۧ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)Ll/֨ܿۧ;
.end method

.method public final ֫()Ll/۬ܿۧ;
    .locals 1

    .line 255
    iget-object v0, p0, Ll/ۚܿۧ;->֫:Ll/۬ܿۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    return-object v0
.end method

.method public abstract ֫(Ljava/lang/Object;)V
.end method

.method public final ֫(Ll/֡ܿۧ;Ll/۬ܿۧ;)V
    .locals 1

    .line 145
    iget-object v0, p0, Ll/ۚܿۧ;->ۧ:Ll/֡ܿۧ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 146
    iput-object p1, p0, Ll/ۚܿۧ;->ۧ:Ll/֡ܿۧ;

    .line 147
    iput-object p2, p0, Ll/ۚܿۧ;->֫:Ll/۬ܿۧ;

    return-void
.end method

.method public final ֫(Ll/ۙ᩹֫;)V
    .locals 0

    .line 244
    iget-object p1, p0, Ll/ۚܿۧ;->ۧ:Ll/֡ܿۧ;

    if-eqz p1, :cond_0

    .line 245
    invoke-interface {p1}, Ll/֡ܿۧ;->ۧ()V

    :cond_0
    return-void
.end method

.method public abstract ֫(Ll/ۨ᩵֫;)V
.end method

.method public abstract ֫(Ll/ᩳᩴ֫;)V
.end method

.method public abstract ۧ()Ll/ۨ᩵֫;
.end method

.method public abstract ܽ()Ll/ܽ۬֫;
.end method

.method public ܿ()V
    .locals 1

    const/4 v0, 0x0

    .line 156
    iput-object v0, p0, Ll/ۚܿۧ;->ۧ:Ll/֡ܿۧ;

    .line 157
    iput-object v0, p0, Ll/ۚܿۧ;->֫:Ll/۬ܿۧ;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 232
    iget-object v0, p0, Ll/ۚܿۧ;->ۧ:Ll/֡ܿۧ;

    if-eqz v0, :cond_0

    .line 233
    invoke-interface {v0}, Ll/֡ܿۧ;->֫()V

    :cond_0
    return-void
.end method
