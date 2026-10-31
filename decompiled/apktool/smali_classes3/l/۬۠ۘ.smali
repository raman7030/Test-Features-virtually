.class public final Ll/۬۠ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۫۠ۘ;


# direct methods
.method public constructor <init>(Ll/۫۠ۘ;)V
    .locals 0

    .line 383
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬۠ۘ;->᩸:Ll/۫۠ۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 387
    iget-object v0, p0, Ll/۬۠ۘ;->᩸:Ll/۫۠ۘ;

    iget-object v0, v0, Ll/۫۠ۘ;->֫:Lcom/tencent/connect/auth/a;

    invoke-static {v0}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 388
    invoke-static {v0}, Lcom/tencent/connect/auth/a;->ܿ(Lcom/tencent/connect/auth/a;)Ll/ۢ᩸ۘ;

    move-result-object v1

    invoke-static {v0}, Lcom/tencent/connect/auth/a;->᩷(Lcom/tencent/connect/auth/a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
