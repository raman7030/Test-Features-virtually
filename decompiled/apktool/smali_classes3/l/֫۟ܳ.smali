.class public final Ll/֫۟ܳ;
.super Ljava/lang/Object;
.source "E2B3"

# interfaces
.implements Ll/᩹᩸ܿ;


# instance fields
.field public final synthetic ᩸:Ll/ܽ۟ܳ;


# direct methods
.method public constructor <init>(Ll/ܽ۟ܳ;)V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫۟ܳ;->᩸:Ll/ܽ۟ܳ;

    return-void
.end method


# virtual methods
.method public final ֫(JJJJ)V
    .locals 0

    .line 106
    iget-object p3, p0, Ll/֫۟ܳ;->᩸:Ll/ܽ۟ܳ;

    iget-object p4, p3, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {p4, p1, p2}, Ll/᩷۫ܳ;->֫(J)V

    .line 107
    iget-object p1, p3, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {p3, p1}, Ll/᩶ܶۢ;->ۧ(Ll/᩷۫ܳ;)V

    .line 108
    invoke-virtual {p3, p7, p8}, Ll/᩶ܶۢ;->֫(J)V

    .line 109
    iget-object p1, p3, Ll/ܽ۟ܳ;->۫֫:Ll/ܶ۬ܳ;

    invoke-virtual {p1}, Ll/᩷۫ܳ;->ܽ()I

    move-result p1

    invoke-virtual {p3, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void
.end method

.method public final ܺ֫()Ll/ۙ֡ܿ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/֫۟ܳ;->᩸:Ll/ܽ۟ܳ;

    iget-object v0, v0, Ll/ܽ۟ܳ;->ᩳۧ:Ll/ۙ֡ܿ;

    return-object v0
.end method

.method public final ᩷֫()V
    .locals 2

    .line 124
    iget-object v0, p0, Ll/֫۟ܳ;->᩸:Ll/ܽ۟ܳ;

    iget-object v1, v0, Ll/ܽ۟ܳ;->֫ۧ:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 126
    invoke-virtual {v0, v1}, Ll/᩶ܶۢ;->ۧ(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final ᩻()Z
    .locals 2

    .line 301
    iget-object v0, p0, Ll/֫۟ܳ;->᩸:Ll/ܽ۟ܳ;

    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    .line 114
    iget-object v0, v0, Ll/ܽ۟ܳ;->ۛ֫:Ljava/util/concurrent/atomic/AtomicReference;

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
