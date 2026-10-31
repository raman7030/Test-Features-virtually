.class public final synthetic Ll/۠ۡ֡;
.super Ljava/lang/Object;
.source "C7IN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ᩶:Ll/᩹ۡ֡;

.field public final synthetic ᩸:Ll/֡ۡ֡;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۡ֡;Ljava/util/concurrent/atomic/AtomicReference;Ll/᩹ۡ֡;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۡ֡;->᩸:Ll/֡ۡ֡;

    iput-object p2, p0, Ll/۠ۡ֡;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Ll/۠ۡ֡;->᩶:Ll/᩹ۡ֡;

    iput-object p4, p0, Ll/۠ۡ֡;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    iget-object v0, p0, Ll/۠ۡ֡;->᩸:Ll/֡ۡ֡;

    .line 4
    iget-object v1, p0, Ll/۠ۡ֡;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 345
    :try_start_0
    invoke-interface {v0, p1}, Ll/֡ۡ֡;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 347
    iget-object v0, p0, Ll/۠ۡ֡;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 349
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 352
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, p0, Ll/۠ۡ֡;->᩶:Ll/᩹ۡ֡;

    invoke-virtual {v3, v2, p1}, Ll/᩹ۡ֡;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/IOException;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 355
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
