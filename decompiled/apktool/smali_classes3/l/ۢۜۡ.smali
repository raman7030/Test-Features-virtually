.class public final Ll/ۢۜۡ;
.super Ll/۟ܶۡ;
.source "98W2"


# instance fields
.field public final synthetic ۜ:Ll/ۗܺ᩷;

.field public ܳ:[B

.field public final synthetic ᩻:Ll/ۡۜۡ;


# direct methods
.method public constructor <init>(Ll/ۡۜۡ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 360
    iput-object p1, p0, Ll/ۢۜۡ;->᩻:Ll/ۡۜۡ;

    iput-object p2, p0, Ll/ۢۜۡ;->ۜ:Ll/ۗܺ᩷;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 375
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/᩸ۜۡ;

    iget-object v2, p0, Ll/ۢۜۡ;->ۜ:Ll/ۗܺ᩷;

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 376
    iget-object v1, p0, Ll/ۢۜۡ;->᩻:Ll/ۡۜۡ;

    invoke-static {v1}, Ll/ۡۜۡ;->ۧ(Ll/ۡۜۡ;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "title"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "markdown"

    .line 377
    iget-object v3, p0, Ll/ۢۜۡ;->ܳ:[B

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 378
    invoke-virtual {v2, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 383
    iget-object v0, p0, Ll/ۢۜۡ;->ۜ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 365
    iget-object v0, p0, Ll/ۢۜۡ;->ۜ:Ll/ۗܺ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 370
    iget-object v0, p0, Ll/ۢۜۡ;->᩻:Ll/ۡۜۡ;

    invoke-static {v0}, Ll/ۡۜۡ;->֫(Ll/ۡۜۡ;)I

    move-result v0

    invoke-static {v0}, Ll/ܰۜۡ;->֫(I)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۢۜۡ;->ܳ:[B

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 388
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
