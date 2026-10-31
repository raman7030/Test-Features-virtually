.class public Ll/᩸ᩴۘ;
.super Ljava/lang/Object;
.source "98C6"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ll/᩻᩵ۘ;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/᩸ᩴۘ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/᩸ᩴۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Ll/᩸ᩴۘ;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/۠֨ۘ;)V
    .locals 2

    .line 77
    invoke-virtual {p0}, Ll/᩸ᩴۘ;->ۧ()Ll/۟ۘۘ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 78
    invoke-interface {p1}, Ll/۠֨ۘ;->run()V

    return-void

    .line 80
    :cond_0
    invoke-virtual {p0}, Ll/᩸ᩴۘ;->ۧ()Ll/۟ۘۘ;

    move-result-object v0

    invoke-virtual {p0}, Ll/᩸ᩴۘ;->ۧ()Ll/۟ۘۘ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۟ۘۘ;->֫()Ll/᩸֨ۘ;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ll/۟ۘۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V
    .locals 1

    .line 69
    invoke-virtual {p0}, Ll/᩸ᩴۘ;->ۧ()Ll/۟ۘۘ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 70
    invoke-interface {p2}, Ll/۠֨ۘ;->run()V

    return-void

    .line 72
    :cond_0
    invoke-virtual {p0}, Ll/᩸ᩴۘ;->ۧ()Ll/۟ۘۘ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/۟ۘۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ֫(Ll/᩻᩵ۘ;)V
    .locals 1

    .line 48
    iget-object v0, p0, Ll/᩸ᩴۘ;->ۧ:Ll/᩻᩵ۘ;

    if-nez v0, :cond_0

    .line 49
    iput-object p1, p0, Ll/᩸ᩴۘ;->ۧ:Ll/᩻᩵ۘ;

    :cond_0
    return-void
.end method

.method public final ۧ()Ll/۟ۘۘ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/᩸ᩴۘ;->ۧ:Ll/᩻᩵ۘ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 61
    :cond_0
    invoke-virtual {v0}, Ll/᩻᩵ۘ;->ܿ()Ll/۟ۘۘ;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ll/᩻᩵ۘ;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩸ᩴۘ;->ۧ:Ll/᩻᩵ۘ;

    return-object v0
.end method
