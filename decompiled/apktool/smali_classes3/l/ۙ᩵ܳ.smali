.class public final Ll/ۙ᩵ܳ;
.super Ljava/lang/Object;
.source "473S"

# interfaces
.implements Ll/ܰܳᩳ;


# instance fields
.field public final synthetic ۗ:Ll/ۖۛܳ;

.field public final synthetic ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ᩶:Ljava/util/List;

.field public final synthetic ᩸:Ll/֨ۚܳ;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ll/ۖۛܳ;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicReference;Ll/֨ۚܳ;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 604
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ᩵ܳ;->ۗ:Ll/ۖۛܳ;

    iput-object p2, p0, Ll/ۙ᩵ܳ;->᩶:Ljava/util/List;

    iput-object p3, p0, Ll/ۙ᩵ܳ;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Ll/ۙ᩵ܳ;->᩸:Ll/֨ۚܳ;

    iput-object p5, p0, Ll/ۙ᩵ܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 657
    iget-object v0, p0, Ll/ۙ᩵ܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 552
    invoke-virtual {p0}, Ll/ۙ᩵ܳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۤܺܳ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 607
    iget-object v0, p0, Ll/ۙ᩵ܳ;->ۗ:Ll/ۖۛܳ;

    invoke-virtual {v0}, Ll/ۖۛܳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۜ(I)Z
    .locals 2

    if-ltz p1, :cond_0

    .line 631
    iget-object v0, p0, Ll/ۙ᩵ܳ;->᩶:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘܳᩳ;

    invoke-virtual {p1}, Ll/ۘܳᩳ;->ۡ()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic ۤ()V
    .locals 0

    return-void
.end method

.method public final ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V
    .locals 1

    .line 617
    iget-object v0, p0, Ll/ۙ᩵ܳ;->ۗ:Ll/ۖۛܳ;

    invoke-virtual {v0, p1}, Ll/ۖۛܳ;->ۧ(Lnet/sf/sevenzipjbinding/IInArchive;)V

    return-void
.end method

.method public final synthetic ۧ֫()V
    .locals 0

    return-void
.end method

.method public final ܳ()Lnet/sf/sevenzipjbinding/ISequentialOutStream;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic ܳ(I)V
    .locals 0

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 647
    iget-object v0, p0, Ll/ۙ᩵ܳ;->᩸:Ll/֨ۚܳ;

    .line 183
    invoke-virtual {v0}, Ll/֨ۚܳ;->cancel()V

    return-void
.end method

.method public final ᩳ֫()Lnet/sf/sevenzipjbinding/IInArchive;
    .locals 1

    .line 612
    iget-object v0, p0, Ll/ۙ᩵ܳ;->ۗ:Ll/ۖۛܳ;

    invoke-virtual {v0}, Ll/ۖۛܳ;->᩹()Lnet/sf/sevenzipjbinding/IInArchive;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(I)V
    .locals 3

    .line 622
    iget-object v0, p0, Ll/ۙ᩵ܳ;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    if-ltz p1, :cond_0

    iget-object v1, p0, Ll/ۙ᩵ܳ;->᩶:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    .line 623
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘܳᩳ;

    invoke-virtual {p1}, Ll/ۘܳᩳ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 625
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 548
    invoke-virtual {p0}, Ll/ۙ᩵ܳ;->ۜ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۤܺܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩹()V
    .locals 2

    .line 642
    iget-object v0, p0, Ll/ۙ᩵ܳ;->᩹:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 652
    iget-object v0, p0, Ll/ۙ᩵ܳ;->᩸:Ll/֨ۚܳ;

    invoke-virtual {v0}, Ll/֨ۚܳ;->۫֫()Z

    move-result v0

    return v0
.end method

.method public final synthetic ᩻֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
