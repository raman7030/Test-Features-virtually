.class public final Ll/ܽܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/ۖۧܿ;


# instance fields
.field public final synthetic ֫:Ll/ᩳܶᩳ;

.field public final synthetic ۧ:I

.field public final synthetic ܽ:Ll/ܰۘᩳ;

.field public final synthetic ᩳ:Ll/ۨ᩵ᩳ;


# direct methods
.method public constructor <init>(Ll/ᩳܶᩳ;Ll/ܰۘᩳ;ILl/ۨ᩵ᩳ;)V
    .locals 0

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܶᩳ;->֫:Ll/ᩳܶᩳ;

    iput-object p2, p0, Ll/ܽܶᩳ;->ܽ:Ll/ܰۘᩳ;

    iput p3, p0, Ll/ܽܶᩳ;->ۧ:I

    iput-object p4, p0, Ll/ܽܶᩳ;->ᩳ:Ll/ۨ᩵ᩳ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 298
    iget-object v0, p0, Ll/ܽܶᩳ;->ܽ:Ll/ܰۘᩳ;

    invoke-virtual {v0}, Ll/ܰۘᩳ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Ll/۟᩸ᩳ;
    .locals 2

    .line 300
    iget-object v0, p0, Ll/ܽܶᩳ;->ᩳ:Ll/ۨ᩵ᩳ;

    iget-object v0, v0, Ll/ۨ᩵ᩳ;->ۡ:Ll/᩻ᩴᩳ;

    iget-object v0, v0, Ll/᩻ᩴᩳ;->ۖ:Ll/ۜ֡ᩳ;

    iget-object v1, p0, Ll/ܽܶᩳ;->ܽ:Ll/ܰۘᩳ;

    invoke-virtual {v1, p1, v0}, Ll/ܰۘᩳ;->֫(ILl/ۜ֡ᩳ;)Ll/۟᩸ᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(ILl/ۡۧܿ;)V
    .locals 3

    .line 302
    iget-object v0, p0, Ll/ܽܶᩳ;->֫:Ll/ᩳܶᩳ;

    iget-object v0, v0, Ll/ᩳܶᩳ;->᩸:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩴ(Ll/᩹ܶᩳ;)Ll/ۨ᩵ᩳ;

    move-result-object v1

    iget-object v2, p0, Ll/ܽܶᩳ;->ᩳ:Ll/ۨ᩵ᩳ;

    if-ne v1, v2, :cond_0

    invoke-static {v0, p1, p2}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;ILl/ۡۧܿ;)Ll/ۗ᩻᩵;

    :cond_0
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 299
    iget v0, p0, Ll/ܽܶᩳ;->ۧ:I

    return v0
.end method
