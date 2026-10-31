.class public final synthetic Ll/֡ܶܿ;
.super Ljava/lang/Object;
.source "89SC"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Ll/ۘܳۜ;


# direct methods
.method public synthetic constructor <init>(Ll/ۘܳۜ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܶܿ;->᩸:Ll/ۘܳۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 6

    .line 2
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 56
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚܶܿ;

    if-eqz p1, :cond_2

    .line 58
    iget-object v1, p1, Ll/ۚܶܿ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۚܶܿ;->ۧ:Ll/᩵ܶܿ;

    iget-object v2, p0, Ll/֡ܶܿ;->᩸:Ll/ۘܳۜ;

    iget-object v3, v2, Ll/ۘܳۜ;->᩸:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, v2, Ll/ۘܳۜ;->᩹:Ljava/lang/Object;

    check-cast v2, Ll/ۗܺ᩷;

    .line 32
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    if-nez v4, :cond_0

    move-object v4, v0

    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ۚۢ;

    :goto_0
    if-eqz v4, :cond_1

    .line 34
    invoke-virtual {v4}, Ll/֡ۚۢ;->ۜ()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 35
    invoke-virtual {v4}, Ll/֡ۚۢ;->dismiss()V

    .line 37
    :cond_1
    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v4

    const v5, 0x7f120491

    .line 38
    invoke-virtual {v4, v5}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 39
    invoke-virtual {v4, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/ۚ᩶ܳ;

    const/4 v5, 0x1

    invoke-direct {v1, v5, p1, v2}, Ll/ۚ᩶ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x7f12070a

    .line 40
    invoke-virtual {v4, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 47
    invoke-virtual {v4, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 48
    invoke-virtual {v4}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 49
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
