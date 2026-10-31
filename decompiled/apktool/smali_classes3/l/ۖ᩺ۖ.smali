.class public final Ll/ۖ᩺ۖ;
.super Ll/ܽۨۖ;
.source "G9FC"


# direct methods
.method public constructor <init>(Ll/᩹ۛۖ;JJ)V
    .locals 8

    const/4 v1, 0x4

    .line 34
    sget-object v3, Ll/᩺ۛۖ;->᩻֫:Ll/᩺ۛۖ;

    move-object v0, p0

    move-object v2, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v0 .. v7}, Ll/ܽۨۖ;-><init>(ILl/᩹ۛۖ;Ll/᩺ۛۖ;JJ)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 1

    .line 45
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    const/4 v0, 0x2

    .line 46
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    return-void
.end method

.method public final ᩳ(Ll/֡֫ۘ;)V
    .locals 1

    .line 39
    iget v0, p0, Ll/ܽۨۖ;->ᩳ:I

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    const/4 v0, 0x2

    .line 40
    invoke-virtual {p1, v0}, Ll/֡֫ۘ;->᩻(I)V

    return-void
.end method
