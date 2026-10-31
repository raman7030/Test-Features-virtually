.class public final Ll/ᩳۡ֫;
.super Ljava/lang/Object;
.source "H1JY"


# static fields
.field public static final ֫:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Ll/ᩳۡ֫;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static final ֫(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v0, Ll/ᩳۡ֫;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/app/Application;

    .line 41
    new-instance v0, Ll/ܽۡ֫;

    invoke-direct {v0}, Ll/ܽۡ֫;-><init>()V

    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
