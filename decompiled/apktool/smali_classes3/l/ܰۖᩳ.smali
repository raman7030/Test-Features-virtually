.class public final synthetic Ll/ܰۖᩳ;
.super Ljava/lang/Object;
.source "CB3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ܶۘᩳ;

.field public final synthetic ᩹:Ll/۠᩸ᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ܶۘᩳ;Ll/۠᩸ᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۖᩳ;->᩸:Ll/ܶۘᩳ;

    iput-object p2, p0, Ll/ܰۖᩳ;->᩹:Ll/۠᩸ᩳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܰۖᩳ;->᩹:Ll/۠᩸ᩳ;

    .line 380
    iget-object v1, p0, Ll/ܰۖᩳ;->᩸:Ll/ܶۘᩳ;

    invoke-virtual {v1}, Ll/ܶۘᩳ;->ۧ()Ll/۠ۘᩳ;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 382
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ll/۠᩸ᩳ;->֫()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 385
    invoke-virtual {v1}, Ll/۠ۘᩳ;->close()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 384
    :goto_0
    :try_start_1
    invoke-virtual {v1, v0}, Ll/۠ۘᩳ;->֫(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v0

    .line 383
    invoke-virtual {v1, v0}, Ll/۠ۘᩳ;->֫(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 385
    invoke-virtual {v1}, Ll/۠ۘᩳ;->close()V

    return-void

    :goto_1
    invoke-virtual {v1}, Ll/۠ۘᩳ;->close()V

    throw v0
.end method
