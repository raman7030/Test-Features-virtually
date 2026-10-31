.class public final Ll/᩸ܺᩳ;
.super Ll/֡ܺᩳ;
.source "57CG"


# instance fields
.field public final synthetic ܳ:Ll/᩹ܺᩳ;


# direct methods
.method public constructor <init>(Ll/᩹ܺᩳ;)V
    .locals 0

    .line 23
    iput-object p1, p0, Ll/᩸ܺᩳ;->ܳ:Ll/᩹ܺᩳ;

    .line 33
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string p1, "bin.mt.dstr.ipc.IJavaHookProbeAidlInterface"

    .line 34
    invoke-virtual {p0, p0, p1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final exit()V
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩸ܺᩳ;->ܳ:Ll/᩹ܺᩳ;

    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    const/4 v0, 0x0

    .line 63
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method public final ۡ()Z
    .locals 2

    const/4 v0, 0x0

    .line 30
    iget-object v1, p0, Ll/᩸ܺᩳ;->ܳ:Ll/᩹ܺᩳ;

    invoke-static {v1, v0}, Ll/᩹ܺᩳ;->֫(Ll/᩹ܺᩳ;Ljava/lang/Throwable;)V

    .line 32
    :try_start_0
    invoke-static {}, Ll/ܶܺᩳ;->ܿ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    .line 35
    invoke-static {v1, v0}, Ll/᩹ܺᩳ;->֫(Ll/᩹ܺᩳ;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return v0
.end method
