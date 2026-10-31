.class public final Ll/۠ۨۖ;
.super Ll/ܽۨۖ;
.source "Y9KD"


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;JJJ)V
    .locals 1

    .line 34
    sget-object v0, Ll/᩺ۛۖ;->᩶:Ll/᩺ۛۖ;

    invoke-direct {p0, p1, v0, p2, p3}, Ll/ܽۨۖ;-><init>(Ll/᩹ۛۖ;Ll/᩺ۛۖ;J)V

    .line 35
    iget-object p1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1, p4, p5}, Ll/᩻ۨۖ;->ۧ(J)V

    const-wide/16 p1, 0x0

    cmp-long p3, p6, p1

    if-eqz p3, :cond_0

    .line 37
    iget-object p1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast p1, Ll/᩻ۨۖ;

    sget-object p2, Ll/֫ۨۖ;->᩶:Ll/֫ۨۖ;

    invoke-virtual {p1, p2}, Ll/᩻ۨۖ;->ۧ(Ll/֫ۨۖ;)V

    .line 38
    iget-object p1, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast p1, Ll/᩻ۨۖ;

    invoke-virtual {p1, p6, p7}, Ll/᩻ۨۖ;->֫(J)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 1

    .line 50
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    const/4 v0, 0x2

    .line 51
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    return-void
.end method

.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 1

    .line 44
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 45
    invoke-virtual {p1}, Ll/֡֫ۘ;->ۖ()V

    return-void
.end method
