.class public final Ll/ۖۡ֫;
.super Ljava/lang/Object;
.source "X4YZ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/֡ۡ֫;


# direct methods
.method public constructor <init>(Ll/֡ۡ֫;)V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۡ֫;->᩸:Ll/֡ۡ֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 89
    iget-object v0, p0, Ll/ۖۡ֫;->᩸:Ll/֡ۡ֫;

    iget-object v0, v0, Ll/֡ۡ֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 90
    :try_start_0
    iget-object v1, p0, Ll/ۖۡ֫;->᩸:Ll/֡ۡ֫;

    iget-object v1, v1, Ll/֡ۡ֫;->ۜ:Ljava/lang/Object;

    .line 91
    iget-object v2, p0, Ll/ۖۡ֫;->᩸:Ll/֡ۡ֫;

    sget-object v3, Ll/֡ۡ֫;->ۡ:Ljava/lang/Object;

    iput-object v3, v2, Ll/֡ۡ֫;->ۜ:Ljava/lang/Object;

    .line 92
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    iget-object v0, p0, Ll/ۖۡ֫;->᩸:Ll/֡ۡ֫;

    invoke-virtual {v0, v1}, Ll/֡ۡ֫;->ۧ(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception v1

    .line 92
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
