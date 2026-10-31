.class public final Ll/֨۫᩵;
.super Ljava/lang/Object;
.source "UAXR"

# interfaces
.implements Ll/ۖۛ᩵;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܶ۫᩵;
    .locals 2

    .line 55
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 56
    new-instance v1, Ll/ܶ۫᩵;

    invoke-static {v0}, Ll/᩹۫᩵;->֫(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ܶ۫᩵;-><init>(Landroid/os/Handler;)V

    return-object v1

    .line 55
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The main looper is not available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
