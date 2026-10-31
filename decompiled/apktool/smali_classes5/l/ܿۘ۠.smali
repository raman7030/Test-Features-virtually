.class public final Ll/ܿۘ۠;
.super Ll/۫ۖ۠;
.source "K434"


# instance fields
.field public final ܽ:Ll/֨۠۠;


# direct methods
.method public constructor <init>(Ll/ܳۘ۠;)V
    .locals 0

    .line 4930
    invoke-direct {p0, p1}, Ll/۫ۖ۠;-><init>(Ll/ܳۘ۠;)V

    .line 4931
    new-instance p1, Ll/֨۠۠;

    invoke-direct {p1}, Ll/֨۠۠;-><init>()V

    iput-object p1, p0, Ll/ܿۘ۠;->ܽ:Ll/֨۠۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚۚ۠;)I
    .locals 1

    .line 4949
    iget-object v0, p0, Ll/ܿۘ۠;->ܽ:Ll/֨۠۠;

    invoke-virtual {v0, p1}, Ll/֨۠۠;->֫(Ll/ۚۚ۠;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return p1
.end method

.method public final ֫(Ll/ۚۚ۠;Ll/ۚۚ۠;)I
    .locals 1

    .line 4955
    iget-object v0, p0, Ll/ܿۘ۠;->ܽ:Ll/֨۠۠;

    invoke-virtual {v0, p1}, Ll/֨۠۠;->ۧ(Ll/ۚۚ۠;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 4957
    invoke-virtual {p0, p2, p1}, Ll/ܿۘ۠;->֫(Ll/ۚۚ۠;I)V

    return p1

    :cond_0
    return v0
.end method

.method public final ֫(Ll/ۚۚ۠;I)V
    .locals 1

    .line 4935
    iget v0, p0, Ll/۫ۖ۠;->֫:I

    if-le v0, p2, :cond_0

    move p2, v0

    :cond_0
    iget-object v0, p0, Ll/ܿۘ۠;->ܽ:Ll/֨۠۠;

    invoke-virtual {v0, p2, p1}, Ll/֨۠۠;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ll/ۚۚ۠;)Ll/ۚۚ۠;
    .locals 1

    .line 4939
    iget-object v0, p0, Ll/۫ۖ۠;->ۧ:Ll/ܳۘ۠;

    iget-object v0, v0, Ll/ܳۘ۠;->۬:Ll/᩹ۘ۠;

    iget v0, v0, Ll/᩹ۘ۠;->ۧ:I

    invoke-virtual {p0, p1, v0}, Ll/ܿۘ۠;->֫(Ll/ۚۚ۠;I)V

    return-object p1
.end method

.method public final ܽ(Ll/ۚۚ۠;)Ll/ۚۚ۠;
    .locals 1

    .line 4944
    iget-object v0, p0, Ll/۫ۖ۠;->ۧ:Ll/ܳۘ۠;

    iget-object v0, v0, Ll/ܳۘ۠;->ܽ:Ll/ۖۘ۠;

    invoke-virtual {v0}, Ll/ۖۘ۠;->ᩳ()Ll/᩹ۘ۠;

    move-result-object v0

    iget v0, v0, Ll/᩹ۘ۠;->ۧ:I

    invoke-virtual {p0, p1, v0}, Ll/ܿۘ۠;->֫(Ll/ۚۚ۠;I)V

    return-object p1
.end method
