.class public final Ll/᩵ܶܽ;
.super Ll/۟ܶۡ;
.source "4646"


# instance fields
.field public final synthetic ܳ:Ll/۠ܶܽ;

.field public final synthetic ᩻:Z


# direct methods
.method public constructor <init>(Ll/۠ܶܽ;Z)V
    .locals 0

    .line 280
    iput-object p1, p0, Ll/᩵ܶܽ;->ܳ:Ll/۠ܶܽ;

    iput-boolean p2, p0, Ll/᩵ܶܽ;->᩻:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 296
    iget-boolean v0, p0, Ll/᩵ܶܽ;->᩻:Z

    if-eqz v0, :cond_0

    .line 297
    iget-object v0, p0, Ll/᩵ܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    const v0, 0x7f1208d1

    .line 299
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 304
    iget-object v0, p0, Ll/᩵ܶܽ;->ܳ:Ll/۠ܶܽ;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 284
    iget-object v0, p0, Ll/᩵ܶܽ;->ܳ:Ll/۠ܶܽ;

    const v1, 0x7f1208d2

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 289
    iget-object v0, p0, Ll/᩵ܶܽ;->ܳ:Ll/۠ܶܽ;

    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v1

    iget-object v1, v1, Ll/֨ܶܽ;->ۗ:Ll/ܶۨۡ;

    invoke-virtual {v1}, Ll/ܶۨۡ;->֫()[B

    move-result-object v1

    .line 290
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v2

    iget-object v2, v2, Ll/֨ܶܽ;->۬:Ll/ܶ᩵ܿ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    new-instance v3, Ll/ۖ᩵ܿ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1}, Ll/ۖ᩵ܿ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->֫(Ll/۬֡ܿ;)V

    .line 291
    invoke-static {v0}, Ll/۠ܶܽ;->ᩳ(Ll/۠ܶܽ;)Ll/֨ܶܽ;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/֨ܶܽ;->ۙ:Z

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 309
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
