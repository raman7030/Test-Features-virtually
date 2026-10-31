.class public final synthetic Ll/᩺ۗܳ;
.super Ljava/lang/Object;
.source "Y5PI"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ۧ:Ll/ܳ۬ܳ;

.field public final synthetic ܽ:Ll/᩵ۛۡ;

.field public final synthetic ܿ:Ll/۠ۛ֡;

.field public final synthetic ᩳ:Ll/᩵ۡۚ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ܳ۬ܳ;Ll/᩵ۛۡ;Ll/᩵ۡۚ;Ll/۠ۛ֡;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۗܳ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Ll/᩺ۗܳ;->ۧ:Ll/ܳ۬ܳ;

    iput-object p3, p0, Ll/᩺ۗܳ;->ܽ:Ll/᩵ۛۡ;

    iput-object p4, p0, Ll/᩺ۗܳ;->ᩳ:Ll/᩵ۡۚ;

    iput-object p5, p0, Ll/᩺ۗܳ;->ܿ:Ll/۠ۛ֡;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/᩺ۗܳ;->ᩳ:Ll/᩵ۡۚ;

    .line 4
    iget-object v1, p0, Ll/᩺ۗܳ;->ܿ:Ll/۠ۛ֡;

    .line 325
    iget-object v2, p0, Ll/᩺ۗܳ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Ll/᩺ۗܳ;->ۧ:Ll/ܳ۬ܳ;

    invoke-interface {v3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 41
    :cond_0
    iget-object v3, p0, Ll/᩺ۗܳ;->ܽ:Ll/᩵ۛۡ;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ll/᩵ۛۡ;->֫(I)Z

    .line 330
    :try_start_0
    invoke-virtual {v0, v1}, Ll/᩵ۡۚ;->֫(Ll/ۡ֫ۚ;)Ll/֡᩷ۚ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 332
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 333
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ll/۠ۛ֡;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":\n"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
