.class public final Ll/᩵۬֨;
.super Ll/֨᩸۠;
.source "542M"


# instance fields
.field public final synthetic ܳ:Ll/ܶ۬֨;

.field public final ܿ:Ll/ۙ֨֨;

.field public final ᩳ:Ll/ۙ֨֨;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ۬֨;Ll/ۗ۠۠;Ljava/lang/String;Ll/ۙ֨֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 3945
    iput-object p1, p0, Ll/᩵۬֨;->ܳ:Ll/ܶ۬֨;

    .line 3946
    invoke-direct {p0, p2}, Ll/֨᩸۠;-><init>(Ll/ۗ۠۠;)V

    .line 3947
    iput-object p3, p0, Ll/᩵۬֨;->᩻:Ljava/lang/String;

    .line 3948
    iput-object p4, p0, Ll/᩵۬֨;->ܿ:Ll/ۙ֨֨;

    .line 3949
    iput-object p5, p0, Ll/᩵۬֨;->ᩳ:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ᩳ(Ll/᩶ᩴ֨;)V
    .locals 8

    .line 3955
    invoke-super {p0, p1}, Ll/֨᩸۠;->ᩳ(Ll/᩶ᩴ֨;)V

    .line 3957
    sget-object v0, Ll/ۖ۬֨;->ܽ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "compiler"

    iget-object v4, p0, Ll/᩵۬֨;->ܳ:Ll/ܶ۬֨;

    const/4 v5, 0x1

    if-eq v0, v5, :cond_2

    if-ne v0, v1, :cond_1

    .line 3962
    invoke-static {v4}, Ll/ܶ۬֨;->ܳ(Ll/ܶ۬֨;)Ll/ۘ֡֨;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {v4}, Ll/ܶ۬֨;->ܳ(Ll/ܶ۬֨;)Ll/ۘ֡֨;

    move-result-object p1

    invoke-static {v4}, Ll/ܶ۬֨;->ۜ(Ll/ܶ۬֨;)Ll/᩷ۚ֨;

    move-result-object v0

    iget-object v0, v0, Ll/᩷ۚ֨;->ܺۧ:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    .line 3963
    invoke-virtual {p1, v0}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;)Ll/ܽۘ֨;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {v4}, Ll/ܶ۬֨;->ܳ(Ll/ܶ۬֨;)Ll/ۘ֡֨;

    move-result-object p1

    .line 3964
    invoke-static {v4, p1}, Ll/ܶ۬֨;->֫(Ll/ܶ۬֨;Ll/ۘ֡֨;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v4}, Ll/ܶ۬֨;->᩷(Ll/ܶ۬֨;)Ll/ۛ᩸֨;

    move-result-object p1

    invoke-static {v4}, Ll/ܶ۬֨;->ܳ(Ll/ܶ۬֨;)Ll/ۘ֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 3965
    invoke-virtual {v0}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ֨֨;

    invoke-virtual {p1, v0}, Ll/ۛ᩸֨;->֡(Ll/ۙ֨֨;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3966
    invoke-virtual {p0}, Ll/֨᩸۠;->ۧ()Ll/ۗ۠۠;

    move-result-object p1

    invoke-static {v4}, Ll/ܶ۬֨;->ܳ(Ll/ܶ۬֨;)Ll/ۘ֡֨;

    move-result-object v0

    iget-object v0, v0, Ll/ۘ֡֨;->۟:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->last()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֡֨;

    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 5217
    new-instance v1, Ll/ۧܶ۠;

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v2

    const-string v0, "varargs.unsafe.use.varargs.param"

    invoke-direct {v1, v3, v0, v5}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3966
    invoke-virtual {v4, p1, v1}, Ll/ܶ۬֨;->ܽ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void

    .line 3970
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected lint: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 3959
    :cond_2
    invoke-virtual {p0}, Ll/֨᩸۠;->ۧ()Ll/ۗ۠۠;

    move-result-object p1

    invoke-static {v4}, Ll/ܶ۬֨;->ۧ(Ll/ܶ۬֨;)Ll/ۛ۠۠;

    move-result-object v0

    iget-object v6, p0, Ll/᩵۬֨;->᩻:Ljava/lang/String;

    new-array v7, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v6, v7}, Ll/ۛ۠۠;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)Ll/ܽܶ۠;

    move-result-object v0

    sget-object v6, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4772
    new-instance v6, Ll/ۧܶ۠;

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v0, v7, v2

    iget-object v0, p0, Ll/᩵۬֨;->ܿ:Ll/ۙ֨֨;

    aput-object v0, v7, v5

    iget-object v0, p0, Ll/᩵۬֨;->ᩳ:Ll/ۙ֨֨;

    aput-object v0, v7, v1

    const-string v0, "prob.found.req"

    invoke-direct {v6, v3, v0, v7}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3959
    invoke-virtual {v4, p1, v6}, Ll/ܶ۬֨;->ۧ(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void
.end method
