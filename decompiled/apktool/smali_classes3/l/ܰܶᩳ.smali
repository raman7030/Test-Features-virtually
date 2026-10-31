.class public final synthetic Ll/ܰܶᩳ;
.super Ljava/lang/Object;
.source "NB3C"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ܶ᩵ܿ;

.field public final synthetic ۧ:Ljava/lang/CharSequence;

.field public final synthetic ܽ:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public synthetic constructor <init>(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰܶᩳ;->֫:Ll/ܶ᩵ܿ;

    iput-object p2, p0, Ll/ܰܶᩳ;->ۧ:Ljava/lang/CharSequence;

    iput-object p3, p0, Ll/ܰܶᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 276
    iget-object v0, p0, Ll/ܰܶᩳ;->֫:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/ܰܶᩳ;->ۧ:Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Ll/ܿ᩸ᩳ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/CharSequence;)V

    .line 277
    iget-object v0, p0, Ll/ܰܶᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    const/4 v0, 0x0

    return-object v0
.end method
