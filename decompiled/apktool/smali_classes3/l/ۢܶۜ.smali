.class public final Ll/ۢܶۜ;
.super Ljava/lang/Object;
.source "X8B6"

# interfaces
.implements Ll/ۗۛۜ;


# instance fields
.field public final synthetic ֫:Ll/ܺܶۜ;


# direct methods
.method public constructor <init>(Ll/ܺܶۜ;)V
    .locals 0

    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܶۜ;->֫:Ll/ܺܶۜ;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    .line 256
    iget-object v0, p0, Ll/ۢܶۜ;->֫:Ll/ܺܶۜ;

    invoke-static {v0}, Ll/ܺܶۜ;->ۘ(Ll/ܺܶۜ;)V

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 238
    iget-object v0, p0, Ll/ۢܶۜ;->֫:Ll/ܺܶۜ;

    invoke-static {v0}, Ll/ܺܶۜ;->ۜ(Ll/ܺܶۜ;)Ll/۬ۛۜ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v1, Ll/ۚۛۜ;

    if-nez v1, :cond_0

    .line 238
    invoke-static {v0}, Ll/ܺܶۜ;->ܺ(Ll/ܺܶۜ;)Ll/ᩳۜܳ;

    move-result-object v1

    invoke-static {v1}, Ll/ۜۚۜ;->֫(Ll/ᩳۜܳ;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ll/ܺܶۜ;->᩷(Ll/ܺܶۜ;)Ll/᩶᩺ۜ;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ܺܶۜ;->᩷(Ll/ܺܶۜ;)Ll/᩶᩺ۜ;

    move-result-object v1

    invoke-static {v0}, Ll/ܺܶۜ;->ۜ(Ll/ܺܶۜ;)Ll/۬ۛۜ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۬ۛۜ;->ۧ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/᩶᩺ۜ;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ܺܶۜ;->᩷(Ll/ܺܶۜ;)Ll/᩶᩺ۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩺ۜ;->ᩳ()V

    return-void

    .line 239
    :cond_0
    invoke-static {v0}, Ll/ܺܶۜ;->ۢ(Ll/ܺܶۜ;)Ll/ۡܶۜ;

    move-result-object v1

    iget-boolean v1, v1, Ll/ۡܶۜ;->ۗ:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Ll/ܺܶۜ;->ۧ(Ll/ܺܶۜ;Z)V

    return-void
.end method

.method public final ֫(F)V
    .locals 5

    .line 242
    iget-object v0, p0, Ll/ۢܶۜ;->֫:Ll/ܺܶۜ;

    invoke-static {v0}, Ll/ܺܶۜ;->֡(Ll/ܺܶۜ;)Ll/ۢᩴ;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float/2addr v2, p1

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 243
    invoke-static {v0}, Ll/ܺܶۜ;->ᩳ(Ll/ܺܶۜ;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 244
    invoke-static {v0}, Ll/ܺܶۜ;->ܿ(Ll/ܺܶۜ;)F

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    cmpl-float v1, v1, v4

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 245
    :goto_0
    invoke-static {v0, p1}, Ll/ܺܶۜ;->֫(Ll/ܺܶۜ;F)V

    cmpl-float p1, p1, v4

    if-lez p1, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eq v1, v4, :cond_4

    .line 247
    invoke-static {v0}, Ll/ܺܶۜ;->᩻(Ll/ܺܶۜ;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v1

    if-nez v1, :cond_3

    if-lez p1, :cond_2

    .line 249
    invoke-static {v0}, Ll/ܺܶۜ;->ܳ(Ll/ܺܶۜ;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {v0, v3}, Ll/ܺܶۜ;->ܽ(Ll/ܺܶۜ;Z)V

    goto :goto_2

    :cond_2
    if-nez p1, :cond_3

    .line 250
    invoke-static {v0}, Ll/ܺܶۜ;->ۡ(Ll/ܺܶۜ;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v0, v2}, Ll/ܺܶۜ;->ܽ(Ll/ܺܶۜ;Z)V

    .line 253
    :cond_3
    :goto_2
    invoke-static {v0}, Ll/ܺܶۜ;->ᩴ(Ll/ܺܶۜ;)V

    :cond_4
    return-void
.end method

.method public final ֫(I)V
    .locals 2

    .line 232
    iget-object v0, p0, Ll/ۢܶۜ;->֫:Ll/ܺܶۜ;

    invoke-static {v0}, Ll/ܺܶۜ;->ۢ(Ll/ܺܶۜ;)Ll/ۡܶۜ;

    move-result-object v1

    invoke-static {v0, p1}, Ll/ܺܶۜ;->ۧ(Ll/ܺܶۜ;I)Ll/ᩳۜܳ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Ll/ۡܶۜ;->۫:Ljava/lang/String;

    .line 233
    invoke-static {v0}, Ll/ܺܶۜ;->ۢ(Ll/ܺܶۜ;)Ll/ۡܶۜ;

    move-result-object p1

    const/4 v1, 0x0

    iput-object v1, p1, Ll/ۡܶۜ;->۟:Landroid/os/Bundle;

    .line 234
    invoke-static {v0}, Ll/ܺܶۜ;->᩵(Ll/ܺܶۜ;)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 236
    iget-object v0, p0, Ll/ۢܶۜ;->֫:Ll/ܺܶۜ;

    invoke-static {v0, p1}, Ll/ܺܶۜ;->ܽ(Ll/ܺܶۜ;I)V

    return-void
.end method
