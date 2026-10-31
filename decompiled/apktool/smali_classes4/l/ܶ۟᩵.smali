.class public abstract Ll/ܶ۟᩵;
.super Ljava/lang/Object;
.source "R4GC"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    sget-object v0, Ll/᩶۟᩵;->֫:[B

    .line 472
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 25
    iput-object p1, p0, Ll/ܶ۟᩵;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Ll/ܶ۟᩵;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 32
    :try_start_0
    invoke-virtual {p0}, Ll/ܶ۟᩵;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v1
.end method

.method public abstract ֫()V
.end method
