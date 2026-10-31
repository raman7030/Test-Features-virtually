.class public final Ll/ۖ۠ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/۠۠ۘ;

.field public final synthetic ᩸:Ljava/lang/String;

.field public final synthetic ᩹:Ll/ۘ᩹ۘ;


# direct methods
.method public constructor <init>(Ll/۠۠ۘ;Ljava/lang/String;Ll/ۘ᩹ۘ;)V
    .locals 0

    .line 320
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ۠ۘ;->᩶:Ll/۠۠ۘ;

    iput-object p2, p0, Ll/ۖ۠ۘ;->᩸:Ljava/lang/String;

    iput-object p3, p0, Ll/ۖ۠ۘ;->᩹:Ll/ۘ᩹ۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 324
    sget-object v0, Ll/۠۠ۘ;->᩷:Ljava/lang/String;

    sget-object v1, Ll/۠۠ۘ;->ۢ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/۟᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    invoke-static {}, Lcom/tencent/open/web/security/JniInterface;->֫()V

    .line 327
    iget-object v0, p0, Ll/ۖ۠ۘ;->᩶:Ll/۠۠ۘ;

    invoke-static {v0}, Ll/۠۠ۘ;->ܿ(Ll/۠۠ۘ;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 330
    :cond_0
    invoke-static {v0}, Ll/۠۠ۘ;->ܿ(Ll/۠۠ۘ;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    .line 332
    new-instance v1, Ll/ܺ۠ۘ;

    invoke-direct {v1, p0, v0}, Ll/ܺ۠ۘ;-><init>(Ll/ۖ۠ۘ;Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
