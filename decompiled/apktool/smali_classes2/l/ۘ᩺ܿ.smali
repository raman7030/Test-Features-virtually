.class public final Ll/ۘ᩺ܿ;
.super Ljava/lang/Object;
.source "C4R6"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Z

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 485
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 486
    iput-object p1, p0, Ll/ۘ᩺ܿ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 492
    invoke-static {}, Ll/᩵᩺ܿ;->᩷()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 493
    :try_start_0
    iget-boolean v1, p0, Ll/ۘ᩺ܿ;->᩸:Z

    if-eqz v1, :cond_0

    .line 494
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 496
    iput-boolean v1, p0, Ll/ۘ᩺ܿ;->᩸:Z

    .line 497
    invoke-static {}, Ll/᩵᩺ܿ;->ۜ()Ljava/util/HashMap;

    move-result-object v2

    iget-object v3, p0, Ll/ۘ᩺ܿ;->᩹:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_2

    .line 498
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-gt v3, v1, :cond_1

    goto :goto_0

    .line 502
    :cond_1
    invoke-static {}, Ll/᩵᩺ܿ;->ۜ()Ljava/util/HashMap;

    move-result-object v3

    iget-object v4, p0, Ll/ۘ᩺ܿ;->᩹:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 499
    :cond_2
    :goto_0
    invoke-static {}, Ll/᩵᩺ܿ;->ۜ()Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Ll/ۘ᩺ܿ;->᩹:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    invoke-static {}, Ll/᩵᩺ܿ;->᩷()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 504
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
