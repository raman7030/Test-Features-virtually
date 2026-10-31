.class public final Ll/᩹ۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Ll/᩷ۨܽ;


# instance fields
.field public final synthetic ֫:Ll/ۜۨܽ;

.field public final synthetic ۜ:Ll/ܳۨܽ;

.field public final synthetic ۧ:Z

.field public final synthetic ܳ:Ll/ܽ᩺ܽ;

.field public final synthetic ܽ:Ll/֡ۚۢ;

.field public final synthetic ܿ:Ll/۬ۗܳ;

.field public final synthetic ᩳ:Landroid/widget/TextView;

.field public final synthetic ᩻:Ll/ۨۧᩳ;


# direct methods
.method public constructor <init>(ZLl/ܳۨܽ;Ll/֡ۚۢ;Ll/۬ۗܳ;Ll/ۜۨܽ;Ll/ܽ᩺ܽ;Ll/ۨۧᩳ;Landroid/widget/TextView;)V
    .locals 0

    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll/᩹ۗܳ;->ۧ:Z

    iput-object p2, p0, Ll/᩹ۗܳ;->ۜ:Ll/ܳۨܽ;

    iput-object p3, p0, Ll/᩹ۗܳ;->ܽ:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/᩹ۗܳ;->ܿ:Ll/۬ۗܳ;

    iput-object p5, p0, Ll/᩹ۗܳ;->֫:Ll/ۜۨܽ;

    iput-object p6, p0, Ll/᩹ۗܳ;->ܳ:Ll/ܽ᩺ܽ;

    iput-object p7, p0, Ll/᩹ۗܳ;->᩻:Ll/ۨۧᩳ;

    iput-object p8, p0, Ll/᩹ۗܳ;->ᩳ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    .line 278
    iget-object v0, p0, Ll/᩹ۗܳ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 279
    iget-object v0, p0, Ll/᩹ۗܳ;->ܿ:Ll/۬ۗܳ;

    invoke-interface {v0}, Ll/۬ۗܳ;->onCanceled()V

    return-void
.end method

.method public final onSuccess()V
    .locals 4

    .line 243
    iget-boolean v0, p0, Ll/᩹ۗܳ;->ۧ:Z

    iget-object v1, p0, Ll/᩹ۗܳ;->ܿ:Ll/۬ۗܳ;

    iget-object v2, p0, Ll/᩹ۗܳ;->ܽ:Ll/֡ۚۢ;

    if-eqz v0, :cond_1

    .line 244
    iget-object v0, p0, Ll/᩹ۗܳ;->ۜ:Ll/ܳۨܽ;

    invoke-virtual {v0, v2}, Ll/ܳۨܽ;->֫(Ll/֡ۚۢ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 247
    :cond_0
    invoke-virtual {v2}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 248
    invoke-interface {v1}, Ll/۬ۗܳ;->onCanceled()V

    return-void

    .line 252
    :cond_1
    iget-object v0, p0, Ll/᩹ۗܳ;->֫:Ll/ۜۨܽ;

    iget-object v3, p0, Ll/᩹ۗܳ;->ܳ:Ll/ܽ᩺ܽ;

    invoke-interface {v0, v3}, Ll/ۜۨܽ;->֫(Ll/ܽ᩺ܽ;)V

    .line 253
    invoke-virtual {v2}, Ll/֡ۚۢ;->dismiss()V

    .line 254
    iget-object v0, p0, Ll/᩹ۗܳ;->᩻:Ll/ۨۧᩳ;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Ll/۬ۗܳ;->֫(Ll/ۨۧᩳ;Z)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)Z
    .locals 4

    .line 259
    iget-boolean v0, p0, Ll/᩹ۗܳ;->ۧ:Z

    iget-object v1, p0, Ll/᩹ۗܳ;->ܿ:Ll/۬ۗܳ;

    const/4 v2, 0x1

    iget-object v3, p0, Ll/᩹ۗܳ;->ܽ:Ll/֡ۚۢ;

    if-eqz v0, :cond_1

    .line 260
    iget-object v0, p0, Ll/᩹ۗܳ;->ۜ:Ll/ܳۨܽ;

    invoke-virtual {v0, v3}, Ll/ܳۨܽ;->֫(Ll/֡ۚۢ;)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    .line 263
    :cond_0
    invoke-virtual {v3}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 264
    invoke-interface {v1}, Ll/۬ۗܳ;->onCanceled()V

    return v2

    .line 268
    :cond_1
    instance-of v0, p1, Ll/᩸ܿᩳ;

    if-eqz v0, :cond_2

    check-cast p1, Ll/᩸ܿᩳ;

    .line 269
    iget-object v0, p0, Ll/᩹ۗܳ;->ᩳ:Landroid/widget/TextView;

    invoke-static {v0, p1}, Ll/ۡۨܽ;->֫(Landroid/widget/TextView;Ll/᩸ܿᩳ;)V

    .line 270
    invoke-virtual {v3}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    return v2

    .line 273
    :cond_2
    invoke-interface {v1, p1}, Ll/۬ۗܳ;->֫(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method
