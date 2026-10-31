.class public final Ll/۫ۙ֨;
.super Ll/֫᩸֨;
.source "F416"


# instance fields
.field public final synthetic ᩸:Ll/ۢۗ֨;


# direct methods
.method public constructor <init>(Ll/ۢۗ֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3316
    iput-object p1, p0, Ll/۫ۙ֨;->᩸:Ll/ۢۗ֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 3316
    check-cast p2, Ll/ۗ۠۠;

    .line 0
    instance-of p2, p1, Ll/ۛۚ֨;

    if-eqz p2, :cond_2

    .line 3321
    check-cast p1, Ll/ۛۚ֨;

    .line 3325
    iget-object p2, p0, Ll/۫ۙ֨;->᩸:Ll/ۢۗ֨;

    iget-object p2, p2, Ll/ۢۗ֨;->᩷֫:Ll/ۛ᩸֨;

    .line 3330
    new-instance v0, Ll/ᩴܶ۠;

    invoke-direct {v0}, Ll/ᩴܶ۠;-><init>()V

    .line 3331
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    .line 3332
    iget-object v2, p1, Ll/᩶ۚ֨;->ۨ:Ll/ۖܶ۠;

    invoke-virtual {v2}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ֨֨;

    .line 3333
    invoke-virtual {v3}, Ll/ۙ֨֨;->ۘ֫()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 3334
    iget-object v4, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v4, v4, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v4}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ᩴܶ۠;->֫(Ll/ۖܶ۠;)V

    .line 3336
    :cond_0
    iget-object v3, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    .line 3338
    :cond_1
    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {p2, v1}, Ll/ۛ᩸֨;->ܳ(Ll/ۖܶ۠;)Ll/ۛۚ֨;

    move-result-object v1

    .line 3339
    invoke-virtual {v0}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, v1, Ll/᩶ۚ֨;->ۛ:Ll/ۖܶ۠;

    .line 3340
    iget-object v0, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-wide v1, v0, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v3, 0x200

    or-long/2addr v1, v3

    iput-wide v1, v0, Ll/ۛ֡֨;->᩶:J

    .line 3325
    invoke-virtual {p2, v0}, Ll/ۛ᩸֨;->֫(Ll/᩶֡֨;)Ll/ۛ֡֨;

    :cond_2
    return-object p1
.end method
