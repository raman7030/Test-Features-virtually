.class public final synthetic Ll/ۤܶۡ;
.super Ljava/lang/Object;
.source "V4WQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۟ܶۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܶۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܶۡ;->᩸:Ll/۟ܶۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget-object v0, p0, Ll/ۤܶۡ;->᩸:Ll/۟ܶۡ;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    :try_start_0
    invoke-virtual {v0}, Ll/۟ܶۡ;->֫()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    invoke-virtual {v0}, Ll/۟ܶۡ;->ᩳ()V

    return-void

    :catchall_0
    move-exception v1

    .line 183
    :try_start_1
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Ll/۟ܶۡ;->֫(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_0
    move-exception v1

    .line 181
    new-instance v2, Ljava/lang/Exception;

    const v3, 0x7f12072a

    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Ll/۟ܶۡ;->֫(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v1

    .line 179
    invoke-virtual {v0, v1}, Ll/۟ܶۡ;->֫(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 185
    :goto_0
    invoke-virtual {v0}, Ll/۟ܶۡ;->ᩳ()V

    return-void

    :catchall_1
    move-exception v1

    invoke-virtual {v0}, Ll/۟ܶۡ;->ᩳ()V

    .line 186
    throw v1
.end method
