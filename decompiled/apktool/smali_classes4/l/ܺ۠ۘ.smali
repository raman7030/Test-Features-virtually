.class public final Ll/ܺ۠ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Landroid/app/Activity;

.field public final synthetic ᩹:Ll/ۖ۠ۘ;


# direct methods
.method public constructor <init>(Ll/ۖ۠ۘ;Landroid/app/Activity;)V
    .locals 0

    .line 332
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ۠ۘ;->᩹:Ll/ۖ۠ۘ;

    iput-object p2, p0, Ll/ܺ۠ۘ;->᩸:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 335
    iget-object v0, p0, Ll/ܺ۠ۘ;->᩹:Ll/ۖ۠ۘ;

    iget-object v1, v0, Ll/ۖ۠ۘ;->᩹:Ll/ۘ᩹ۘ;

    iget-object v2, v0, Ll/ۖ۠ۘ;->᩶:Ll/۠۠ۘ;

    sget-boolean v3, Lcom/tencent/open/web/security/JniInterface;->֫:Z

    iget-object v4, p0, Ll/ܺ۠ۘ;->᩸:Landroid/app/Activity;

    if-eqz v3, :cond_0

    .line 336
    new-instance v3, Lcom/tencent/connect/auth/a;

    iget-object v0, v0, Ll/ۖ۠ۘ;->᩸:Ljava/lang/String;

    invoke-static {v2}, Ll/۠۠ۘ;->ܳ(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    move-result-object v2

    invoke-direct {v3, v4, v0, v1, v2}, Lcom/tencent/connect/auth/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ll/ۘ᩹ۘ;Ll/᩸۠ۘ;)V

    .line 337
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 338
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    return-void

    :cond_0
    const-string v0, "openSDK_LOG.AuthAgent"

    const-string v3, "OpenUi, secure so load failed, goto download QQ."

    .line 342
    invoke-static {v0, v3}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    new-instance v0, Lcom/tencent/open/TDialog;

    invoke-static {v2}, Ll/۠۠ۘ;->֫(Ll/۠۠ۘ;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2}, Ll/۠۠ۘ;->᩻(Ll/۠۠ۘ;)Ll/᩸۠ۘ;

    move-result-object v2

    invoke-direct {v0, v4, v3, v1, v2}, Lcom/tencent/open/TDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Ll/ۘ᩹ۘ;Ll/᩸۠ۘ;)V

    .line 344
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    .line 345
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    return-void
.end method
