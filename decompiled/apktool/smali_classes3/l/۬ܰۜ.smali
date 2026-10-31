.class public final synthetic Ll/۬ܰۜ;
.super Ljava/lang/Object;
.source "I6M7"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 31
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "GalleryWebpDecode"

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method
