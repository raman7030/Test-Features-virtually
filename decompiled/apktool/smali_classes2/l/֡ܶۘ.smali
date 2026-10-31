.class public final Ll/֡ܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܶۘ;->᩸:Landroid/app/Dialog;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 63
    :try_start_0
    iget-object v0, p0, Ll/֡ܶۘ;->᩸:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "openSDK_LOG.DialogUtils"

    const-string v2, "dismiss dialog exception"

    .line 65
    invoke-static {v1, v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
