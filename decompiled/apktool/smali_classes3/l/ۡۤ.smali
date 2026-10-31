.class public final Ll/ۡۤ;
.super Ljava/lang/Object;
.source "DB1R"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩶:Landroid/os/Handler;

.field public ᩸:Ljava/util/concurrent/Callable;

.field public ᩹:Ll/۬ۤ;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/util/concurrent/Callable;Ll/۬ۤ;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p2, p0, Ll/ۡۤ;->᩸:Ljava/util/concurrent/Callable;

    .line 137
    iput-object p3, p0, Ll/ۡۤ;->᩹:Ll/۬ۤ;

    .line 138
    iput-object p1, p0, Ll/ۡۤ;->᩶:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 145
    :try_start_0
    iget-object v0, p0, Ll/ۡۤ;->᩸:Ljava/util/concurrent/Callable;

    check-cast v0, Ll/۟۫;

    invoke-virtual {v0}, Ll/۟۫;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 151
    :goto_0
    new-instance v1, Ll/ۢۤ;

    iget-object v2, p0, Ll/ۡۤ;->᩹:Ll/۬ۤ;

    invoke-direct {v1, v2, v0}, Ll/ۢۤ;-><init>(Ll/۬ۤ;Ljava/lang/Object;)V

    iget-object v0, p0, Ll/ۡۤ;->᩶:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
