.class public final Ll/֡ܶ֨;
.super Ll/ۘ᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 441
    iput-object p1, p0, Ll/֡ܶ֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 441
    check-cast p1, Ljava/util/Set;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 441
    check-cast p2, Ljava/util/Set;

    .line 460
    iget-object p1, p1, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    .line 4900
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 460
    check-cast p1, Ljava/lang/Void;

    return-object p1
.end method

.method public final ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 441
    check-cast p2, Ljava/util/Set;

    .line 471
    iget-object v0, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/16 v2, 0x1000

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 472
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object p1

    .line 4900
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/ܶۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 441
    check-cast p2, Ljava/util/Set;

    .line 479
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 480
    invoke-virtual {p1}, Ll/ۡ֨֨;->ᩳ֫()Ll/ۙ֨֨;

    move-result-object v0

    .line 4900
    invoke-virtual {v0, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1693
    iget-object p1, p1, Ll/ۡ֨֨;->ۛ:Ll/ۙ֨֨;

    .line 4900
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩶֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 441
    check-cast p2, Ljava/util/Set;

    .line 465
    iget-object p1, p1, Ll/᩶֨֨;->᩺:Ll/ۙ֨֨;

    .line 4900
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 441
    check-cast p2, Ljava/util/Set;

    .line 450
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 451
    iget-object v0, p0, Ll/֡ܶ֨;->᩸:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1}, Ll/ۛ᩸֨;->᩻(Ll/ۙ֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    new-instance v0, Ll/ᩴܶ֨;

    invoke-direct {v0, p0, p2}, Ll/ᩴܶ֨;-><init>(Ll/֡ܶ֨;Ljava/util/Set;)V

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    goto :goto_0

    .line 453
    :cond_0
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܶ()Ll/ۖܶ۠;

    move-result-object p1

    new-instance v0, Ll/᩵ܶ֨;

    invoke-direct {v0, p0, p2}, Ll/᩵ܶ֨;-><init>(Ll/֡ܶ֨;Ljava/util/Set;)V

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
