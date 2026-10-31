.class public Ll/ᩴۖ֨;
.super Ll/᩵ۖ֨;
.source "I3KA"


# instance fields
.field public ֫:Ll/ۘۖ֨;


# virtual methods
.method public ֫(Ll/۬ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 83
    :cond_0
    iget-object v0, p0, Ll/ᩴۖ֨;->֫:Ll/ۘۖ֨;

    .line 84
    new-instance v1, Ll/ۘۖ֨;

    invoke-direct {v1, v0, p1}, Ll/ۘۖ֨;-><init>(Ll/ۘۖ֨;Ll/۬ܺ֨;)V

    iput-object v1, p0, Ll/ᩴۖ֨;->֫:Ll/ۘۖ֨;

    .line 86
    :try_start_0
    invoke-interface {p1, p0, p2}, Ll/۬ܺ֨;->֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    iput-object v0, p0, Ll/ᩴۖ֨;->֫:Ll/ۘۖ֨;

    return-object p1

    :catchall_0
    move-exception p1

    iput-object v0, p0, Ll/ᩴۖ֨;->֫:Ll/ۘۖ֨;

    .line 89
    throw p1
.end method

.method public final ֫()Ll/ۘۖ֨;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ᩴۖ֨;->֫:Ll/ۘۖ֨;

    return-object v0
.end method

.method public final ֫(Ll/ۘۖ֨;Ll/ۚ᩵۠;)V
    .locals 1

    .line 58
    iput-object p1, p0, Ll/ᩴۖ֨;->֫:Ll/ۘۖ֨;

    const/4 v0, 0x0

    .line 60
    :try_start_0
    invoke-virtual {p1}, Ll/ۘۖ֨;->ܽ()Ll/۬ܺ֨;

    move-result-object p1

    invoke-interface {p1, p0, p2}, Ll/۬ܺ֨;->֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    iput-object v0, p0, Ll/ᩴۖ֨;->֫:Ll/ۘۖ֨;

    return-void

    :catchall_0
    move-exception p1

    iput-object v0, p0, Ll/ᩴۖ֨;->֫:Ll/ۘۖ֨;

    .line 63
    throw p1
.end method
