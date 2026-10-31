.class public final Ll/ۚ᩹;
.super Ljava/lang/Object;
.source "K22G"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩹;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۚ᩹;->᩹:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 272
    :try_start_0
    sget-object v0, Ll/۠᩹;->ܿ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ۚ᩹;->᩹:Ljava/lang/Object;

    iget-object v5, p0, Ll/ۚ᩹;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v6, 0x3

    :try_start_1
    new-array v6, v6, [Ljava/lang/Object;

    aput-object v4, v6, v3

    .line 274
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v3, v6, v2

    const-string v2, "AppCompat recreation"

    aput-object v2, v6, v1

    .line 273
    invoke-virtual {v0, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 276
    :cond_0
    sget-object v0, Ll/۠᩹;->ᩳ:Ljava/lang/reflect/Method;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v4, v1, v3

    .line 277
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v3, v1, v2

    .line 276
    invoke-virtual {v0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :catch_0
    move-exception v0

    .line 281
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/RuntimeException;

    if-ne v1, v2, :cond_2

    .line 282
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 283
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unable to stop"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 284
    :cond_1
    throw v0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method
