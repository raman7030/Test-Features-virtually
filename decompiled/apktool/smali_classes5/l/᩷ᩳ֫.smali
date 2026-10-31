.class public Ll/᩷ᩳ֫;
.super Ljava/lang/Object;
.source "EB24"

# interfaces
.implements Ll/۠ۢ֫;


# instance fields
.field public final synthetic ᩸:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Ll/ᩴᩳ֫;Ll/۟ۢ֫;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩷ᩳ֫;->᩸:Ll/۟ۢ֫;

    return-void
.end method


# virtual methods
.method public final synthetic ֫(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final ۧ(Ll/᩻ۡ֫;)V
    .locals 3

    .line 77
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_0

    .line 78
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {p1}, Ll/ۙܽ֫;->֫(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p1

    goto :goto_0

    .line 80
    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 119
    :goto_0
    new-instance v0, Ll/ۘᩳ֫;

    .line 131
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x1f4

    .line 119
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 111
    iget-object p1, p0, Ll/᩷ᩳ֫;->᩸:Ll/۟ۢ֫;

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void
.end method

.method public final synthetic ܳ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ܽ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ܿ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ᩳ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method
