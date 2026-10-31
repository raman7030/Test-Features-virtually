.class public final synthetic Ll/᩹᩺ۡ;
.super Ljava/lang/Object;
.source "O7HC"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ܳܰۡ;

.field public final synthetic ۧ:Ljava/util/ArrayList;

.field public final synthetic ܽ:I

.field public final synthetic ᩳ:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ᩺ۡ;Ll/ܳܰۡ;Ljava/util/ArrayList;ILjava/util/concurrent/ConcurrentLinkedQueue;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩹᩺ۡ;->֫:Ll/ܳܰۡ;

    iput-object p3, p0, Ll/᩹᩺ۡ;->ۧ:Ljava/util/ArrayList;

    iput p4, p0, Ll/᩹᩺ۡ;->ܽ:I

    iput-object p5, p0, Ll/᩹᩺ۡ;->ᩳ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 7

    .line 2
    iget-object v0, p0, Ll/᩹᩺ۡ;->֫:Ll/ܳܰۡ;

    .line 4
    iget-object v1, p0, Ll/᩹᩺ۡ;->ᩳ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 80
    iget-object v2, p0, Ll/᩹᩺ۡ;->ۧ:Ljava/util/ArrayList;

    iget v3, p0, Ll/᩹᩺ۡ;->ܽ:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶ᩵ܿ;

    .line 103
    new-instance v3, Ll/ۡܰۡ;

    invoke-direct {v3, v2}, Ll/ۡܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    const/16 v4, 0x8

    .line 104
    :try_start_0
    invoke-virtual {v3, v4}, Ll/ۡܰۡ;->ۧ(I)V

    const/16 v4, 0xa

    .line 105
    invoke-virtual {v3, v4}, Ll/ۡܰۡ;->֫(I)V

    .line 106
    invoke-virtual {v0}, Ll/ܳܰۡ;->֫()Ll/ᩳܰۡ;

    move-result-object v0

    const/4 v4, 0x0

    .line 108
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩺ۡ;

    if-eqz v5, :cond_1

    .line 109
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v6

    if-nez v6, :cond_0

    .line 110
    invoke-virtual {v3, v5}, Ll/ۡܰۡ;->֫(Ll/ۗ᩺ۡ;)V

    .line 111
    invoke-virtual {v0, v5}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 112
    :try_start_1
    invoke-virtual {v3, v5}, Ll/ۡܰۡ;->֫(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 111
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 117
    :cond_1
    invoke-virtual {v3}, Ll/ۡܰۡ;->close()V

    .line 118
    new-instance v0, Ll/᩶᩺ۡ;

    invoke-direct {v0, v2, v4}, Ll/᩶᩺ۡ;-><init>(Ll/ܶ᩵ܿ;I)V

    return-object v0

    :catchall_2
    move-exception v0

    .line 103
    :try_start_5
    invoke-virtual {v3}, Ll/ۡܰۡ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0
.end method
