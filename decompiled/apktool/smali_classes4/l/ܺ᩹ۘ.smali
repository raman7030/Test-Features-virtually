.class public final Ll/ܺ᩹ۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ll/֡᩹ۘ;


# instance fields
.field public final synthetic ֫:Lcom/tencent/tauth/AuthActivity;


# direct methods
.method public constructor <init>(Lcom/tencent/tauth/AuthActivity;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩹ۘ;->֫:Lcom/tencent/tauth/AuthActivity;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 2

    const-string p1, "openSDK_LOG.AuthActivity"

    const-string v0, "-->handleActionUri--common channel. "

    .line 111
    invoke-static {p1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/tencent/connect/common/AssistActivity;

    iget-object v1, p0, Ll/ܺ᩹ۘ;->֫:Lcom/tencent/tauth/AuthActivity;

    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 113
    invoke-virtual {p1, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const-string p2, "key_request_code"

    const/16 v0, 0x2782

    .line 114
    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const/high16 p2, 0x24000000

    .line 115
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 116
    invoke-virtual {v1, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
