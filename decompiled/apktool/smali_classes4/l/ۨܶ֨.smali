.class public final Ll/ۨܶ֨;
.super Ll/۬᩸֨;
.source "X43L"


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;Z)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3270
    iput-object p1, p0, Ll/ۨܶ֨;->᩹:Ll/ۛ᩸֨;

    .line 3271
    iput-boolean p2, p0, Ll/ۨܶ֨;->᩸:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 3266
    check-cast p1, Ll/ۙ֨֨;

    .line 3275
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/ۤۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 3266
    iget-object v0, p1, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    check-cast p2, Ll/ۙ֨֨;

    .line 3286
    sget-object v1, Ll/ۢ۠֨;->ۧ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۨܶ֨;->᩹:Ll/ۛ᩸֨;

    const/4 v4, 0x0

    if-nez v1, :cond_2

    .line 3287
    iget-boolean p1, p0, Ll/ۨܶ֨;->᩸:Z

    if-eqz p1, :cond_0

    goto :goto_1

    .line 1859
    :cond_0
    check-cast v0, Ll/ۧ֨֨;

    .line 3280
    sget-object p1, Ll/ۢ۠֨;->ܿ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, p1}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v0, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 3281
    invoke-virtual {p2}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object p2

    invoke-virtual {v3, p1, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    move v4, v2

    .line 3287
    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 3289
    :cond_2
    check-cast p2, Ll/ۤۚ֨;

    .line 3290
    invoke-virtual {v3, p1, p2}, Ll/ۛ᩸֨;->֫(Ll/ۤۚ֨;Ll/ۤۚ֨;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p2, Ll/ۙۚ֨;->ۤ:Ll/ۙ֨֨;

    iget-object p2, p2, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۤۚ֨;->ۨ:Ll/ۖܶ۠;

    .line 3291
    invoke-virtual {v3, v1, p2, p1}, Ll/ۛ᩸֨;->֫(Ll/ۙ֨֨;Ll/ۖܶ۠;Ll/ۖܶ۠;)Ll/ۙ֨֨;

    move-result-object p1

    .line 4900
    invoke-virtual {v0, p0, p1}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 3291
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    .line 3290
    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۧ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3266
    check-cast p2, Ll/ۙ֨֨;

    .line 3280
    sget-object v0, Ll/ۢ۠֨;->ܿ֫:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Ll/ۧ֨֨;->ۤ:Ll/ۖܶ۠;

    .line 3281
    invoke-virtual {p2}, Ll/ۙ֨֨;->ܰ()Ll/ۖܶ۠;

    move-result-object p2

    iget-object v0, p0, Ll/ۨܶ֨;->᩹:Ll/ۛ᩸֨;

    invoke-virtual {v0, p1, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ۖܶ۠;Ll/ۖܶ۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 3280
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/۫ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3266
    check-cast p2, Ll/ۙ֨֨;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method
