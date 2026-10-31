.class public abstract Ll/᩺ۚۘ;
.super Ll/ܶۚۘ;
.source "P89T"


# instance fields
.field public ۧ:Ljava/lang/Long;

.field public ܽ:Ll/֫֨ۘ;


# virtual methods
.method public abstract ۧ()Ll/۟ۚۘ;
.end method

.method public final ۧ(Ll/ܺۚۘ;)V
    .locals 2

    .line 55
    invoke-virtual {p0}, Ll/᩺ۚۘ;->ۧ()Ll/۟ۚۘ;

    move-result-object v0

    iput-object v0, p0, Ll/᩺ۚۘ;->ܽ:Ll/֫֨ۘ;

    .line 57
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ᩴۚۘ;)V

    .line 59
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    .line 60
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܿ()J

    .line 57
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܿ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ll/᩺ۚۘ;->ۧ:Ljava/lang/Long;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 68
    iput-object p1, p0, Ll/᩺ۚۘ;->ۧ:Ljava/lang/Long;

    return-void
.end method

.method public final ܽ()Ljava/lang/Long;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/᩺ۚۘ;->ۧ:Ljava/lang/Long;

    return-object v0
.end method

.method public final ᩳ()Ll/֫֨ۘ;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/᩺ۚۘ;->ܽ:Ll/֫֨ۘ;

    return-object v0
.end method
