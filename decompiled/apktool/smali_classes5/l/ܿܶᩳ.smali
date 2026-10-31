.class public final Ll/ܿܶᩳ;
.super Ll/ܰۨᩳ;
.source "3B3L"


# instance fields
.field public final synthetic ܽ:Ll/᩹ܶᩳ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 315
    iput-object p1, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 2

    .line 335
    iget-object v0, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->᩸(Ll/᩹ܶᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩴ(Ll/᩹ܶᩳ;)Ll/ۨ᩵ᩳ;

    move-result-object v0

    iget v0, v0, Ll/ۨ᩵ᩳ;->᩷:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(ILbin/mt/plugin/api/util/ResultCallback;)V
    .locals 2

    .line 337
    iget-object v0, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->᩸(Ll/᩹ܶᩳ;)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p2, :cond_0

    const-string p1, "Unsupported operation"

    .line 338
    invoke-interface {p2, p1}, Lbin/mt/plugin/api/util/ResultCallback;->onFailure(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    const/4 v1, 0x0

    .line 341
    invoke-static {v0, p1, v1}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;ILl/ۡۧܿ;)Ll/ۗ᩻᩵;

    move-result-object p1

    new-instance v0, Ll/ܶ᩵ᩳ;

    invoke-direct {v0, p2}, Ll/ܶ᩵ᩳ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۗ᩻᩵;->֫(Ll/۠ۜ᩵;)Ll/ۗ᩻᩵;

    return-void
.end method

.method public final ֫(Lbin/mt/plugin/api/util/ResultCallback;)V
    .locals 4

    .line 355
    iget-object v0, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/᩹ܶᩳ;->ۢ(Ll/᩹ܶᩳ;)Ll/۬᩵᩷;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 356
    invoke-static {v0, p1}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Lbin/mt/plugin/api/util/ResultCallback;)V

    .line 357
    invoke-static {v0}, Ll/᩹ܶᩳ;->ۢ(Ll/᩹ܶᩳ;)Ll/۬᩵᩷;

    move-result-object p1

    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ܽ()Ll/ۙܶᩳ;

    move-result-object v0

    .line 58
    iget-object v0, v0, Ll/ۙܶᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const v3, 0x7f1205fc

    .line 357
    invoke-virtual {p1, v2, v3, v0, v1}, Ll/۬᩵᩷;->֫(Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V

    return-void

    .line 402
    :cond_0
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ܽ֨ᩳ;

    .line 359
    invoke-virtual {v0, v1, p1}, Ll/᩹ܶᩳ;->֫(Ll/ܽ֨ᩳ;Lbin/mt/plugin/api/util/ResultCallback;)V

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 2

    .line 319
    iget-object v0, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    iget-object v0, v0, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    const-string v1, "filePath"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "untitled"

    return-object v0

    .line 320
    :cond_0
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 333
    iget-object v0, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->᩸(Ll/᩹ܶᩳ;)Z

    move-result v0

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 2

    .line 326
    iget-object v0, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    iget-object v0, v0, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    const-string v1, "filePath"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "untitled"

    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 350
    iget-object v0, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    invoke-virtual {v0}, Ll/֫ۘᩳ;->᩷()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 334
    iget-object v0, p0, Ll/ܿܶᩳ;->ܽ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->᩸(Ll/᩹ܶᩳ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩴ(Ll/᩹ܶᩳ;)Ll/ۨ᩵ᩳ;

    move-result-object v0

    iget-object v0, v0, Ll/ۨ᩵ᩳ;->ܿ:Ll/ܰۘᩳ;

    invoke-virtual {v0}, Ll/ܰۘᩳ;->ܽ()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
