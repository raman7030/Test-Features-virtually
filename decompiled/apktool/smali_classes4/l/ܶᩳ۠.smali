.class public Ll/ܶᩳ۠;
.super Ljava/lang/Object;
.source "B7KX"

# interfaces
.implements Ll/᩸ᩳ۠;


# instance fields
.field public ֫:Ll/ۘ֡֨;

.field public ۧ:Ll/ۙ֨֨;

.field public ܽ:Ll/᩶֡֨;

.field public final synthetic ᩳ:Ll/ۧܿ۠;


# direct methods
.method public constructor <init>(Ll/ۧܿ۠;Ll/᩶֡֨;)V
    .locals 0

    .line 1285
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶᩳ۠;->ᩳ:Ll/ۧܿ۠;

    .line 1286
    iput-object p2, p0, Ll/ܶᩳ۠;->ܽ:Ll/᩶֡֨;

    return-void
.end method


# virtual methods
.method public ֫()Ll/ۙ֨֨;
    .locals 5

    .line 1291
    iget-object v0, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    if-nez v0, :cond_0

    .line 1292
    new-instance v0, Ll/ۧ֨֨;

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    iget-object v2, p0, Ll/ܶᩳ۠;->ᩳ:Ll/ۧܿ۠;

    invoke-static {v2}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v3

    iget-object v3, v3, Ll/᩷ۚ֨;->ܶۧ:Ll/֫֨֨;

    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v4

    invoke-static {v2}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->ۢ֫:Ll/ܳ֡֨;

    invoke-direct {v0, v1, v3, v4, v2}, Ll/ۧ֨֨;-><init>(Ll/ۖܶ۠;Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/᩶֡֨;)V

    iput-object v0, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    .line 1294
    :cond_0
    iget-object v0, p0, Ll/ܶᩳ۠;->ۧ:Ll/ۙ֨֨;

    return-object v0
.end method

.method public ֫(Ll/ۡ֡۠;)Ll/ۡ֡۠;
    .locals 0

    return-object p1
.end method

.method public ۧ()Ll/ۖܶ۠;
    .locals 1

    .line 1326
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public ܽ()Ll/ۙ֨֨;
    .locals 1

    .line 1316
    sget-object v0, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    return-object v0
.end method

.method public ᩳ()Ll/ۘ֡֨;
    .locals 12

    .line 1299
    iget-object v0, p0, Ll/ܶᩳ۠;->֫:Ll/ۘ֡֨;

    if-nez v0, :cond_1

    .line 1301
    iget-object v0, p0, Ll/ܶᩳ۠;->ܽ:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v1

    const-wide/16 v3, 0x4000

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    iget-object v5, p0, Ll/ܶᩳ۠;->ᩳ:Ll/ۧܿ۠;

    cmp-long v6, v1, v3

    if-eqz v6, :cond_0

    invoke-static {v5}, Ll/ۧܿ۠;->ۚ(Ll/ۧܿ۠;)Ll/ۛ᩸֨;

    move-result-object v1

    .line 1302
    iget-object v2, v0, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1, v2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    iget-object v1, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-static {v5}, Ll/ۧܿ۠;->ۖ(Ll/ۧܿ۠;)Ll/᩷ۚ֨;

    move-result-object v2

    iget-object v2, v2, Ll/᩷ۚ֨;->᩹:Ll/ܳ֡֨;

    if-ne v1, v2, :cond_0

    const-wide v0, 0x1000000002L

    goto :goto_0

    .line 1306
    :cond_0
    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/16 v2, 0x7

    and-long/2addr v0, v2

    const-wide v2, 0x1000000000L

    or-long/2addr v0, v2

    :goto_0
    move-wide v7, v0

    .line 1308
    new-instance v0, Ll/ۘ֡֨;

    invoke-static {v5}, Ll/ۧܿ۠;->ܺ(Ll/ۧܿ۠;)Ll/ۛܶ۠;

    move-result-object v1

    iget-object v9, v1, Ll/ۛܶ۠;->ᩴۧ:Ll/ۤܶ۠;

    .line 1309
    invoke-virtual {p0}, Ll/ܶᩳ۠;->֫()Ll/ۙ֨֨;

    move-result-object v10

    .line 1321
    iget-object v11, p0, Ll/ܶᩳ۠;->ܽ:Ll/᩶֡֨;

    move-object v6, v0

    .line 1309
    invoke-direct/range {v6 .. v11}, Ll/ۘ֡֨;-><init>(JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    iput-object v0, p0, Ll/ܶᩳ۠;->֫:Ll/ۘ֡֨;

    .line 1311
    :cond_1
    iget-object v0, p0, Ll/ܶᩳ۠;->֫:Ll/ۘ֡֨;

    return-object v0
.end method
