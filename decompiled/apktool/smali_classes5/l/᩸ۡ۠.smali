.class public final Ll/᩸ۡ۠;
.super Ll/ܳ֨۠;
.source "D445"


# instance fields
.field public ֫:Ljava/util/LinkedHashSet;

.field public ۧ:Z

.field public final synthetic ܽ:Ll/ۙۡ۠;

.field public final synthetic ᩳ:Ll/֫ۤ֨;


# direct methods
.method public constructor <init>(Ll/ۙۡ۠;Ll/֫ۤ֨;)V
    .locals 0

    .line 3437
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1449
    iput-object p1, p0, Ll/᩸ۡ۠;->ܽ:Ll/ۙۡ۠;

    iput-object p2, p0, Ll/᩸ۡ۠;->ᩳ:Ll/֫ۤ֨;

    .line 1450
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Ll/᩸ۡ۠;->֫:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 5

    .line 1454
    iget-object v0, p0, Ll/᩸ۡ۠;->ܽ:Ll/ۙۡ۠;

    iget-object v1, v0, Ll/ۙۡ۠;->᩸֫:Ll/ۛ᩸֨;

    iget-object v2, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    iget-object v2, v2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1, v2}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_2

    .line 1456
    sget-object v3, Ll/ۢ۠֨;->ۨ:Ll/ۢ۠֨;

    invoke-virtual {v1, v3}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1457
    iget-object v3, v1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v3}, Ll/ۛ֡֨;->۠֫()Ll/ܳ֡֨;

    move-result-object v3

    .line 1458
    iget-object v4, v0, Ll/ۙۡ۠;->֡:Ll/ܰ۫֨;

    invoke-virtual {v4, v3}, Ll/ܰ۫֨;->֫(Ll/᩶֡֨;)Ll/֫ۤ֨;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 1459
    iget-object v4, p0, Ll/᩸ۡ۠;->ᩳ:Ll/֫ۤ֨;

    if-eq v4, v3, :cond_1

    .line 1460
    iget-object v2, p0, Ll/᩸ۡ۠;->֫:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1461
    iget-boolean v2, p0, Ll/᩸ۡ۠;->ۧ:Z

    .line 1463
    :try_start_0
    iget-object v3, v3, Ll/֫ۤ֨;->ۤ:Ll/ۚۚ۠;

    invoke-virtual {p0, v3}, Ll/ܳ֨۠;->ۧ(Ll/ۚۚ۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1471
    iput-boolean v2, p0, Ll/᩸ۡ۠;->ۧ:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    iput-boolean v2, p0, Ll/᩸ۡ۠;->ۧ:Z

    .line 1472
    throw p1

    :cond_0
    :goto_1
    const/4 v2, 0x1

    .line 1476
    :cond_1
    iget-object v3, v0, Ll/ۙۡ۠;->᩸֫:Ll/ۛ᩸֨;

    invoke-virtual {v3, v1}, Ll/ۛ᩸֨;->᩸(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v1

    goto :goto_0

    .line 1478
    :cond_2
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۚ᩵۠;)V

    return-void
.end method

.method public final ֫(Ll/ۢ֡۠;)V
    .locals 1

    const/4 v0, 0x1

    .line 1487
    iput-boolean v0, p0, Ll/᩸ۡ۠;->ۧ:Z

    .line 1488
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۢ֡۠;)V

    return-void
.end method

.method public final ֫(Ll/ܳ֡۠;)V
    .locals 1

    const/4 v0, 0x1

    .line 1482
    iput-boolean v0, p0, Ll/᩸ۡ۠;->ۧ:Z

    .line 1483
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ܳ֡۠;)V

    return-void
.end method
