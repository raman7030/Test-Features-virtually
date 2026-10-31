.class public final synthetic Ll/᩹۠ܿ;
.super Ljava/lang/Object;
.source "WB05"

# interfaces
.implements Ll/ܺ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/۬ܺ᩷;

.field public final synthetic ᩹:Ll/ܶ֡ۚ;


# direct methods
.method public synthetic constructor <init>(Ll/۬ܺ᩷;Ll/ܶ֡ۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹۠ܿ;->᩸:Ll/۬ܺ᩷;

    iput-object p2, p0, Ll/᩹۠ܿ;->᩹:Ll/ܶ֡ۚ;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    .line 826
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 828
    iget-object v0, p0, Ll/᩹۠ܿ;->᩸:Ll/۬ܺ᩷;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/۬ܺ᩷;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    .line 829
    :cond_0
    iget-object v0, p0, Ll/᩹۠ܿ;->᩹:Ll/ܶ֡ۚ;

    invoke-virtual {v0, p1}, Ll/ܶ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 833
    :cond_1
    sget-object p1, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object p1
.end method
