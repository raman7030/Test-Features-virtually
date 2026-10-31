.class public final synthetic Ll/ۡۨۜ;
.super Ljava/lang/Object;
.source "46LQ"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    .line 62
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "GalleryGifDecode"

    invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method
