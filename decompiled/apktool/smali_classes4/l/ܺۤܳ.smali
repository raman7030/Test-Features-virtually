.class public final synthetic Ll/ܺۤܳ;
.super Ljava/lang/Object;
.source "57TP"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ᩴۤܳ;

.field public final synthetic ۧ:Ll/ۘۤܳ;

.field public final synthetic ܳ:Ll/ۖۤܳ;

.field public final synthetic ܽ:Ljava/lang/Object;

.field public final synthetic ܿ:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic ᩳ:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ll/ᩴۤܳ;Ll/ۘۤܳ;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Ll/ۖۤܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۤܳ;->֫:Ll/ᩴۤܳ;

    iput-object p2, p0, Ll/ܺۤܳ;->ۧ:Ll/ۘۤܳ;

    iput-object p3, p0, Ll/ܺۤܳ;->ܽ:Ljava/lang/Object;

    iput-object p4, p0, Ll/ܺۤܳ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p5, p0, Ll/ܺۤܳ;->ܿ:Ljava/util/concurrent/CountDownLatch;

    iput-object p6, p0, Ll/ܺۤܳ;->ܳ:Ll/ۖۤܳ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v4, p0, Ll/ܺۤܳ;->ܿ:Ljava/util/concurrent/CountDownLatch;

    iget-object v5, p0, Ll/ܺۤܳ;->ܳ:Ll/ۖۤܳ;

    iget-object v0, p0, Ll/ܺۤܳ;->֫:Ll/ᩴۤܳ;

    iget-object v1, p0, Ll/ܺۤܳ;->ۧ:Ll/ۘۤܳ;

    iget-object v2, p0, Ll/ܺۤܳ;->ܽ:Ljava/lang/Object;

    iget-object v3, p0, Ll/ܺۤܳ;->ᩳ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static/range {v0 .. v5}, Ll/ᩴۤܳ;->֫(Ll/ᩴۤܳ;Ll/ۘۤܳ;Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;Ll/ۖۤܳ;)V

    const/4 v0, 0x0

    return-object v0
.end method
