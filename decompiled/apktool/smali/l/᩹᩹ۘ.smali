.class public final Ll/᩹᩹ۘ;
.super Ljava/lang/Object;
.source "QABT"

# interfaces
.implements Ll/ᩳܰ᩵;


# instance fields
.field public final synthetic ֫:Ll/ۤ᩹ۘ;

.field public final synthetic ۧ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic ܽ:Ll/֡۬ۡ;

.field public final synthetic ܿ:Ll/۫᩹ۘ;

.field public final synthetic ᩳ:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ll/ۤ᩹ۘ;Ljava/util/concurrent/atomic/AtomicReference;Ll/֡۬ۡ;Ll/۫᩹ۘ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 498
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹᩹ۘ;->֫:Ll/ۤ᩹ۘ;

    iput-object p2, p0, Ll/᩹᩹ۘ;->ۧ:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Ll/᩹᩹ۘ;->ܽ:Ll/֡۬ۡ;

    iput-object p4, p0, Ll/᩹᩹ۘ;->ܿ:Ll/۫᩹ۘ;

    iput-object p5, p0, Ll/᩹᩹ۘ;->ᩳ:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/io/IOException;)V
    .locals 2

    .line 0
    :cond_0
    iget-object v0, p0, Ll/᩹᩹ۘ;->ۧ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 503
    :goto_0
    :try_start_0
    iget-object p1, p0, Ll/᩹᩹ۘ;->ܽ:Ll/֡۬ۡ;

    invoke-virtual {p1}, Ll/֡۬ۡ;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ֫(Ll/ᩴ۟᩵;)V
    .locals 3

    .line 512
    :try_start_0
    iget-object v0, p0, Ll/᩹᩹ۘ;->ܿ:Ll/۫᩹ۘ;

    iget-boolean v0, v0, Ll/۫᩹ۘ;->ۧ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v1, 0x193

    if-ne v0, v1, :cond_0

    .line 513
    iget-object v0, p0, Ll/᩹᩹ۘ;->֫:Ll/ۤ᩹ۘ;

    invoke-virtual {v0}, Ll/ۤ᩹ۘ;->֫()V

    .line 515
    :cond_0
    invoke-static {p1}, Ll/ᩳ᩶ۘ;->֫(Ll/ᩴ۟᩵;)V

    .line 516
    iget-object v0, p0, Ll/᩹᩹ۘ;->ᩳ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 0
    :cond_1
    iget-object v1, p0, Ll/᩹᩹ۘ;->ۧ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 520
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 525
    :catch_1
    :try_start_2
    iget-object p1, p0, Ll/᩹᩹ۘ;->ܽ:Ll/֡۬ۡ;

    invoke-virtual {p1}, Ll/֡۬ۡ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
