.class public final Ll/ۧۨۡ;
.super Ljava/lang/Object;
.source "22ZU"


# static fields
.field public static final ֫:Ljava/lang/Thread;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    sput-object v0, Ll/ۧۨۡ;->֫:Ljava/lang/Thread;

    return-void
.end method

.method public static ֫()Z
    .locals 2

    .line 25
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 26
    sget-object v1, Ll/ۧۨۡ;->֫:Ljava/lang/Thread;

    if-eq v1, v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "binder:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static ۧ()Z
    .locals 2

    .line 9
    sget-object v0, Ll/ۧۨۡ;->֫:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ܽ()V
    .locals 2

    .line 16
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Blocking UI wait must not be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
