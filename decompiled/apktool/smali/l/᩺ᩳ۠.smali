.class public final Ll/᩺ᩳ۠;
.super Ll/ۚᩳ۠;
.source "B7KX"


# instance fields
.field public final synthetic ۬:Ll/ۧܿ۠;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;)V
    .locals 2

    .line 829
    iput-object p1, p0, Ll/᩺ᩳ۠;->۬:Ll/ۧܿ۠;

    .line 830
    sget-object v0, Ll/۫֨۠;->ۙ:Ll/۫֨۠;

    new-instance v1, Ll/᩹ᩳ۠;

    invoke-direct {v1, p1}, Ll/᩹ᩳ۠;-><init>(Ll/ۧܿ۠;)V

    invoke-direct {p0, p1, v0, v1}, Ll/ۚᩳ۠;-><init>(Ll/ۧܿ۠;Ll/۫֨۠;Ll/ܰᩳ۠;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;)V
    .locals 6

    .line 835
    iget-object v0, p1, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    .line 836
    iget-object v1, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    .line 453
    iget-object v1, v1, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-virtual {v1}, Ll/ۤܶ۠;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 836
    iget-object v1, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->ܺ֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 837
    :cond_0
    iget-object v1, p0, Ll/᩺ᩳ۠;->۬:Ll/ۧܿ۠;

    invoke-static {v1}, Ll/ۧܿ۠;->ۚ(Ll/ۧܿ۠;)Ll/ۛ᩸֨;

    move-result-object v2

    iget-object v3, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v2, v3}, Ll/ۛ᩸֨;->᩻(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ֨֨;

    .line 838
    iget-object v3, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v4, v3, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v5, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne v4, v5, :cond_1

    .line 839
    check-cast v3, Ll/ܳ֡֨;

    .line 840
    invoke-static {v1}, Ll/ۧܿ۠;->᩻(Ll/ۧܿ۠;)Ll/ܰ۫֨;

    move-result-object v4

    .line 151
    iget-object v4, v4, Ll/ܰ۫֨;->᩵:Ll/ܽܿ۠;

    invoke-virtual {v4, v3}, Ll/ܽܿ۠;->֫(Ll/᩶֡֨;)Ll/֫ۤ֨;

    move-result-object v4

    .line 841
    invoke-virtual {v3}, Ll/ۛ֡֨;->᩵֫()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-boolean v5, v3, Ll/ܳ֡֨;->۟:Z

    if-nez v5, :cond_1

    if-eqz v4, :cond_1

    iget-object v4, v4, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v5, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    if-ne v4, v5, :cond_1

    .line 845
    iget-object v4, v3, Ll/ܳ֡֨;->ۧ֫:Ll/ۖܶ۠;

    iget-object v5, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-virtual {v4, v5}, Ll/ۖܶ۠;->֫(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v4

    iput-object v4, v3, Ll/ܳ֡֨;->ۧ֫:Ll/ۖܶ۠;

    goto :goto_0

    :cond_2
    return-void
.end method
