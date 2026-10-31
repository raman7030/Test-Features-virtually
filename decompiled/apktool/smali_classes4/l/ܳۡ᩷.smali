.class public final Ll/ܳۡ᩷;
.super Ll/۟ܶۡ;
.source "R7YU"


# instance fields
.field public final synthetic ۜ:Landroid/view/View;

.field public final synthetic ܳ:Ll/ۜۡ᩷;

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩻:Ll/֡ۚۢ;


# direct methods
.method public constructor <init>(Landroid/view/View;Ll/ۜۡ᩷;Ll/֡ۚۢ;Ljava/lang/String;)V
    .locals 0

    .line 194
    iput-object p2, p0, Ll/ܳۡ᩷;->ܳ:Ll/ۜۡ᩷;

    iput-object p4, p0, Ll/ܳۡ᩷;->᩷:Ljava/lang/String;

    iput-object p3, p0, Ll/ܳۡ᩷;->᩻:Ll/֡ۚۢ;

    iput-object p1, p0, Ll/ܳۡ᩷;->ۜ:Landroid/view/View;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 215
    new-instance v0, Ll/ܿۡ᩷;

    invoke-direct {v0, p0}, Ll/ܿۡ᩷;-><init>(Ll/ܳۡ᩷;)V

    const-wide/16 v1, 0x3e8

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    .line 223
    iget-object v0, p0, Ll/ܳۡ᩷;->᩻:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    .line 224
    invoke-static {}, Ll/ۖ۠ۡ;->ܿ()V

    .line 225
    iget-object v0, p0, Ll/ܳۡ᩷;->ܳ:Ll/ۜۡ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 230
    iget-object v0, p0, Ll/ܳۡ᩷;->ۜ:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 231
    iget-object v0, p0, Ll/ܳۡ᩷;->ܳ:Ll/ۜۡ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 198
    iget-object v0, p0, Ll/ܳۡ᩷;->ܳ:Ll/ۜۡ᩷;

    const v1, 0x7f120b33

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 203
    iget-object v0, p0, Ll/ܳۡ᩷;->ܳ:Ll/ۜۡ᩷;

    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v1

    invoke-static {v1}, Ll/᩻ۡ᩷;->ܳ(Ll/᩻ۡ᩷;)Z

    move-result v1

    iget-object v2, p0, Ll/ܳۡ᩷;->᩷:Ljava/lang/String;

    invoke-static {v2, v1}, Ll/ۖ۠ۡ;->֫(Ljava/lang/String;Z)Ll/᩻ᩴۡ;

    move-result-object v1

    .line 204
    invoke-virtual {v1}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v2

    if-nez v2, :cond_1

    .line 205
    invoke-static {v0}, Ll/ۜۡ᩷;->֫(Ll/ۜۡ᩷;)Ll/᩻ۡ᩷;

    move-result-object v0

    invoke-static {v0}, Ll/᩻ۡ᩷;->ܳ(Ll/᩻ۡ᩷;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    new-instance v0, Ll/ܳۨۡ;

    const v2, 0x7f120ae4

    .line 185
    invoke-static {v1, v2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 206
    throw v0

    .line 208
    :cond_0
    new-instance v0, Ll/ܳۨۡ;

    const v2, 0x7f120520

    .line 232
    invoke-static {v1, v2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v1

    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 208
    throw v0

    :cond_1
    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 236
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
