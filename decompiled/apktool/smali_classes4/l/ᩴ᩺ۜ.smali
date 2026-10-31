.class public final synthetic Ll/ᩴ᩺ۜ;
.super Ljava/lang/Object;
.source "V6MU"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 3

    .line 44
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ll/֨۫᩷;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p1}, Ll/֨۫᩷;-><init>(ILjava/lang/Object;)V

    const-string p1, "GalleryPrefetch"

    invoke-direct {v0, v1, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method
