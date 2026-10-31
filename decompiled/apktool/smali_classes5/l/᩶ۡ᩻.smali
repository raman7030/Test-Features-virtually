.class public final Ll/᩶ۡ᩻;
.super Ljava/lang/Object;
.source "88AQ"

# interfaces
.implements Ll/᩹᩸ܿ;
.implements Ll/ܳۖ᩷;


# instance fields
.field public final synthetic ᩸:Ll/ۙۡ᩻;


# direct methods
.method public constructor <init>(Ll/ۙۡ᩻;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۡ᩻;->᩸:Ll/ۙۡ᩻;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/᩶ۡ᩻;->᩸:Ll/ۙۡ᩻;

    invoke-static {v0}, Ll/ۙۡ᩻;->֫(Ll/ۙۡ᩻;)Ll/᩹ۡ᩻;

    move-result-object v0

    invoke-interface {v0}, Ll/֨ۡ᩻;->֫()V

    return-void
.end method

.method public final ֫(JJJJ)V
    .locals 0

    .line 50
    iget-object p3, p0, Ll/᩶ۡ᩻;->᩸:Ll/ۙۡ᩻;

    invoke-static {p3}, Ll/ۙۡ᩻;->ۧ(Ll/ۙۡ᩻;)Ll/ܶ۬ܳ;

    move-result-object p4

    invoke-virtual {p4, p1, p2}, Ll/᩷۫ܳ;->֫(J)V

    .line 51
    invoke-static {p3}, Ll/ۙۡ᩻;->֫(Ll/ۙۡ᩻;)Ll/᩹ۡ᩻;

    move-result-object p1

    invoke-static {p3}, Ll/ۙۡ᩻;->ۧ(Ll/ۙۡ᩻;)Ll/ܶ۬ܳ;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨ۡ᩻;->֫(Ll/᩷۫ܳ;)V

    .line 52
    invoke-static {p3}, Ll/ۙۡ᩻;->֫(Ll/ۙۡ᩻;)Ll/᩹ۡ᩻;

    move-result-object p1

    invoke-interface {p1, p7, p8}, Ll/֨ۡ᩻;->ۧ(J)V

    .line 53
    invoke-static {p3}, Ll/ۙۡ᩻;->֫(Ll/ۙۡ᩻;)Ll/᩹ۡ᩻;

    move-result-object p1

    invoke-static {p3}, Ll/ۙۡ᩻;->ۧ(Ll/ۙۡ᩻;)Ll/ܶ۬ܳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩷۫ܳ;->ܽ()I

    move-result p2

    invoke-interface {p1, p2}, Ll/֨ۡ᩻;->setProgress(I)V

    return-void
.end method

.method public final ܺ֫()Ll/ۙ֡ܿ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩶ۡ᩻;->᩸:Ll/ۙۡ᩻;

    invoke-static {v0}, Ll/ۙۡ᩻;->ܿ(Ll/ۙۡ᩻;)Ll/ۙ֡ܿ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷֫()V
    .locals 2

    .line 68
    iget-object v0, p0, Ll/᩶ۡ᩻;->᩸:Ll/ۙۡ᩻;

    invoke-static {v0}, Ll/ۙۡ᩻;->ᩳ(Ll/ۙۡ᩻;)Ljava/lang/ThreadLocal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 70
    invoke-static {v0}, Ll/ۙۡ᩻;->֫(Ll/ۙۡ᩻;)Ll/᩹ۡ᩻;

    move-result-object v0

    invoke-interface {v0, v1}, Ll/֨ۡ᩻;->setName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 58
    iget-object v0, p0, Ll/᩶ۡ᩻;->᩸:Ll/ۙۡ᩻;

    invoke-static {v0}, Ll/ۙۡ᩻;->֫(Ll/ۙۡ᩻;)Ll/᩹ۡ᩻;

    move-result-object v1

    invoke-interface {v1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ۙۡ᩻;->ܽ(Ll/ۙۡ᩻;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
