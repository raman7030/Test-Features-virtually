.class public final Ll/۠᩹֫;
.super Ljava/lang/Object;
.source "M8IS"


# instance fields
.field public final ֫:Ll/᩵ۚ֫;

.field public final ۧ:Landroid/content/Context;

.field public ܽ:Z

.field public final ᩳ:Ll/ۚ᩹֫;


# direct methods
.method public constructor <init>(Landroid/content/ContextWrapper;Landroid/os/Looper;Landroid/os/Looper;Ll/֨᩹֫;Ll/ܳ֨֫;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/۠᩹֫;->ۧ:Landroid/content/Context;

    const/4 p1, 0x0

    .line 56
    invoke-virtual {p5, p2, p1}, Ll/ܳ֨֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    move-result-object p2

    iput-object p2, p0, Ll/۠᩹֫;->֫:Ll/᩵ۚ֫;

    .line 57
    new-instance p2, Ll/ۚ᩹֫;

    .line 59
    invoke-virtual {p5, p3, p1}, Ll/ܳ֨֫;->֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;

    move-result-object p1

    invoke-direct {p2, p0, p1, p4}, Ll/ۚ᩹֫;-><init>(Ll/۠᩹֫;Ll/᩵ۚ֫;Ll/֨᩹֫;)V

    iput-object p2, p0, Ll/۠᩹֫;->ᩳ:Ll/ۚ᩹֫;

    return-void
.end method

.method public static synthetic ֫(Ll/۠᩹֫;)V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/۠᩹֫;->ۧ:Landroid/content/Context;

    iget-object p0, p0, Ll/۠᩹֫;->ᩳ:Ll/ۚ᩹֫;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۠᩹֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۠᩹֫;->ܽ:Z

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 71
    iget-boolean v0, p0, Ll/۠᩹֫;->ܽ:Z

    if-nez v0, :cond_0

    return-void

    .line 81
    :cond_0
    new-instance v0, Ll/᩵᩹֫;

    invoke-direct {v0, p0}, Ll/᩵᩹֫;-><init>(Ll/۠᩹֫;)V

    iget-object v1, p0, Ll/۠᩹֫;->֫:Ll/᩵ۚ֫;

    invoke-interface {v1, v0}, Ll/᩵ۚ֫;->֫(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Ll/۠᩹֫;->ܽ:Z

    return-void
.end method
