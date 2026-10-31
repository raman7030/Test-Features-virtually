.class public final Ll/ܽۚ֨;
.super Ljava/lang/Object;
.source "843X"

# interfaces
.implements Ll/ۜ֡֨;


# instance fields
.field public final synthetic ᩶:Ll/ۙ֨֨;

.field public final synthetic ᩸:Ll/᩷ۚ֨;

.field public final synthetic ᩹:Ll/ۜ֡֨;


# direct methods
.method public constructor <init>(Ll/᩷ۚ֨;Ll/ۜ֡֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 333
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۚ֨;->᩸:Ll/᩷ۚ֨;

    iput-object p2, p0, Ll/ܽۚ֨;->᩹:Ll/ۜ֡֨;

    iput-object p3, p0, Ll/ܽۚ֨;->᩶:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۛ֡֨;)V
    .locals 11

    .line 337
    iget-object v0, p0, Ll/ܽۚ֨;->᩸:Ll/᩷ۚ֨;

    iget-object v1, v0, Ll/᩷ۚ֨;->ۢ֫:Ll/ܳ֡֨;

    :try_start_0
    iget-object v2, p0, Ll/ܽۚ֨;->᩹:Ll/ۜ֡֨;

    invoke-interface {v2, p1}, Ll/ۜ֡֨;->֫(Ll/ۛ֡֨;)V
    :try_end_0
    .catch Ll/᩷֡֨; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 339
    :catch_0
    iget-wide v2, p1, Ll/ۛ֡֨;->᩶:J

    const-wide/16 v4, 0x1

    or-long/2addr v2, v4

    iput-wide v2, p1, Ll/ۛ֡֨;->᩶:J

    .line 340
    iget-object v2, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    check-cast v2, Ll/᩶ۚ֨;

    iget-object v3, v0, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    iput-object v3, v2, Ll/᩶ۚ֨;->۟:Ll/ۙ֨֨;

    .line 341
    new-instance v2, Ll/ۘ֡֨;

    invoke-static {v0}, Ll/᩷ۚ֨;->ܽ(Ll/᩷ۚ֨;)Ll/ۛܶ۠;

    move-result-object v3

    iget-object v7, v3, Ll/ۛܶ۠;->᩸ܽ:Ll/ۤܶ۠;

    new-instance v8, Ll/ۧ֨֨;

    .line 343
    iget-object v3, p0, Ll/ܽۚ֨;->᩶:Ll/ۙ֨֨;

    invoke-static {v3}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v4

    iget-object v5, p1, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    .line 344
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v6

    invoke-direct {v8, v4, v5, v6, v1}, Ll/ۧ֨֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;)V

    const-wide/16 v5, 0x9

    move-object v4, v2

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, Ll/ۘ֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 346
    invoke-virtual {p1}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    .line 347
    new-instance v2, Ll/ۘ֡֨;

    iget-object v4, v3, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v4, v4, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    invoke-static {v0}, Ll/᩷ۚ֨;->ܽ(Ll/᩷ۚ֨;)Ll/ۛܶ۠;

    move-result-object v0

    iget-object v0, v0, Ll/ۛܶ۠;->۠֫:Ll/ۤܶ۠;

    .line 349
    invoke-virtual {v4, v0}, Ll/ۤܶ۠;->֫(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object v8

    new-instance v9, Ll/ۧ֨֨;

    .line 350
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    .line 351
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v4

    invoke-direct {v9, v0, v3, v4, v1}, Ll/ۧ֨֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;)V

    const-wide/16 v6, 0x1

    move-object v5, v2

    move-object v10, p1

    invoke-direct/range {v5 .. v10}, Ll/ۘ֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    .line 353
    invoke-virtual {p1}, Ll/ۛ֡֨;->֨֫()Ll/ܰ᩵֨;

    move-result-object p1

    invoke-virtual {p1, v2}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 359
    iget-object v0, p0, Ll/ܽۚ֨;->᩹:Ll/ۜ֡֨;

    invoke-interface {v0}, Ll/ۜ֡֨;->ܽ()Z

    move-result v0

    return v0
.end method
