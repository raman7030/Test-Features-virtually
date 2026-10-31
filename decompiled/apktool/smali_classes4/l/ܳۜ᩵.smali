.class public final Ll/ܳۜ᩵;
.super Ll/ۡۜ᩵;
.source "K6PM"

# interfaces
.implements Ljava/util/concurrent/RunnableFuture;


# static fields
.field public static final serialVersionUID:J = 0x2763fe86dcb18e30L


# instance fields
.field public ۛ:Ljava/lang/Object;

.field public final ۤ:Ljava/util/concurrent/Callable;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0

    .line 913
    invoke-direct {p0}, Ll/ۡۜ᩵;-><init>()V

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    iput-object p1, p0, Ll/ܳۜ᩵;->ۤ:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 930
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[Wrapped task = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳۜ᩵;->ۤ:Ljava/util/concurrent/Callable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 920
    :try_start_0
    iget-object v0, p0, Ll/ܳۜ᩵;->ۤ:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۜ᩵;->ۛ:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    .line 925
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    .line 923
    throw v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 916
    iget-object v0, p0, Ll/ܳۜ᩵;->ۛ:Ljava/lang/Object;

    return-object v0
.end method
