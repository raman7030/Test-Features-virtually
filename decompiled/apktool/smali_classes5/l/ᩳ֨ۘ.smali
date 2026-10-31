.class public Ll/ᩳ֨ۘ;
.super Ljava/lang/Object;
.source "V89H"

# interfaces
.implements Ll/ᩴۚۘ;


# instance fields
.field public ֫:Ll/᩻֨ۘ;


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 77
    :cond_0
    instance-of v0, p1, Ll/ᩳ֨ۘ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 80
    :cond_1
    check-cast p1, Ll/ᩳ֨ۘ;

    .line 81
    iget-object v0, p0, Ll/ᩳ֨ۘ;->֫:Ll/᩻֨ۘ;

    iget-object p1, p1, Ll/ᩳ֨ۘ;->֫:Ll/᩻֨ۘ;

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 3

    .line 70
    iget-object v0, p0, Ll/ᩳ֨ۘ;->֫:Ll/᩻֨ۘ;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫()Ll/᩻֨ۘ;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ᩳ֨ۘ;->֫:Ll/᩻֨ۘ;

    return-object v0
.end method

.method public ֫(Ll/ܺۚۘ;)V
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ᩳ֨ۘ;->֫:Ll/᩻֨ۘ;

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ᩴۚۘ;)V

    :cond_0
    return-void
.end method

.method public ۧ(Ll/ܺۚۘ;)V
    .locals 1

    .line 53
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    .line 57
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ll/᩻֨ۘ;

    .line 49
    invoke-direct {p1}, Ll/ۜ֨ۘ;-><init>()V

    .line 57
    iput-object p1, p0, Ll/ᩳ֨ۘ;->֫:Ll/᩻֨ۘ;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 59
    iput-object p1, p0, Ll/ᩳ֨ۘ;->֫:Ll/᩻֨ۘ;

    return-void
.end method

.method public final ܽ(Ll/ܺۚۘ;)V
    .locals 0

    return-void
.end method
