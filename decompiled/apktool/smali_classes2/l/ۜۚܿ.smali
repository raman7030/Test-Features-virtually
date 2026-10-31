.class public final synthetic Ll/ۜۚܿ;
.super Ljava/lang/Object;
.source "LAQJ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۢۚܿ;

.field public final synthetic ᩹:Ll/ᩴ֨ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/ۢۚܿ;Ll/ᩴ֨ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۚܿ;->᩸:Ll/ۢۚܿ;

    iput-object p2, p0, Ll/ۜۚܿ;->᩹:Ll/ᩴ֨ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۜۚܿ;->᩸:Ll/ۢۚܿ;

    .line 4
    iget-object v1, p0, Ll/ۜۚܿ;->᩹:Ll/ᩴ֨ܿ;

    .line 351
    iget-object v0, v0, Ll/ۢۚܿ;->᩻:Ll/ܳ֨ܿ;

    const/4 v2, 0x1

    iput-boolean v2, v0, Ll/ܳ֨ܿ;->ۧ:Z

    move-object v0, v1

    .line 352
    monitor-enter v0

    .line 353
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 354
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
