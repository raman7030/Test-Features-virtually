.class public Ll/۟ۙ֨;
.super Ll/֨۬֨;
.source "F416"


# instance fields
.field public final synthetic ۧ:Ll/ۢۗ֨;


# direct methods
.method public constructor <init>(Ll/ۢۗ֨;Ll/ۘ۬֨;)V
    .locals 0

    .line 3391
    iput-object p1, p0, Ll/۟ۙ֨;->ۧ:Ll/ۢۗ֨;

    .line 3392
    invoke-direct {p0, p2}, Ll/֨۬֨;-><init>(Ll/ۘ۬֨;)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V
    .locals 4

    .line 3403
    iget-object v0, p0, Ll/۟ۙ֨;->ۧ:Ll/ۢۗ֨;

    iget-object v0, v0, Ll/ۢۗ֨;->֡:Ll/ۛ۠۠;

    sget-object v1, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7192
    new-instance v1, Ll/ۨ۠۠;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const-string p2, "compiler"

    const-string v3, "incompatible.ret.type.in.lambda"

    invoke-direct {v1, p2, v3, v2}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3403
    invoke-virtual {v0, v1}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p2

    iget-object v0, p0, Ll/֨۬֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v0, p1, p2}, Ll/ۘ۬֨;->֫(Ll/ۗ۠۠;Ll/ܽܶ۠;)V

    return-void
.end method

.method public ֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z
    .locals 3

    .line 3398
    iget-object v0, p0, Ll/۟ۙ֨;->ۧ:Ll/ۢۗ֨;

    iget-object v0, v0, Ll/ۢۗ֨;->ۖ:Ll/ܶ۬֨;

    iget-object v0, v0, Ll/ܶ۬֨;->ᩳ:Ll/ۘ۬֨;

    .line 557
    iget-object v1, p0, Ll/֨۬֨;->֫:Ll/ۘ۬֨;

    invoke-interface {v1}, Ll/ۘ۬֨;->֫()Ll/֡ۨ֨;

    move-result-object v2

    .line 3398
    invoke-virtual {v2, p1}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    .line 557
    invoke-interface {v1}, Ll/ۘ۬֨;->֫()Ll/֡ۨ֨;

    move-result-object v1

    .line 3398
    invoke-virtual {v1, p2}, Ll/֡ۨ֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-interface {v0, p1, p2, p3}, Ll/ۘ۬֨;->֫(Ll/ۙ֨֨;Ll/ۙ֨֨;Ll/֨᩸۠;)Z

    move-result p1

    return p1
.end method
