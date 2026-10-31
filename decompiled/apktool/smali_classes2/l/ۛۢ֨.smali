.class public abstract Ll/ۛۢ֨;
.super Ljava/lang/Object;
.source "S5K4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ll/֫ۢ֨;


# direct methods
.method public constructor <init>(Ll/֫ۢ֨;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 17
    :try_start_0
    iget-object v0, p0, Ll/ۛۢ֨;->᩸:Ll/֫ۢ֨;

    .line 283
    iget-object v0, v0, Ll/֫ۢ֨;->ۤ:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18
    invoke-virtual {p0}, Ll/ۛۢ֨;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    .line 21
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 25
    :cond_1
    throw v0
.end method

.method public abstract ֫()V
.end method
