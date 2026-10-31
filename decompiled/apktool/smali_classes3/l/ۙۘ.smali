.class public final Ll/ۙۘ;
.super Ll/ܽᩳ֫;
.source "V51X"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/ۗۘ;)V
    .locals 1

    .line 1670
    invoke-direct {p0}, Ll/ܽᩳ֫;-><init>()V

    .line 1671
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۙۘ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 1685
    iget-object v0, p0, Ll/ۙۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗۘ;

    if-eqz v0, :cond_0

    .line 1687
    invoke-virtual {v0}, Ll/ۗۘ;->onEmojiCompatInitializedForSwitchText()V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 1677
    iget-object v0, p0, Ll/ۙۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۗۘ;

    if-eqz v0, :cond_0

    .line 1679
    invoke-virtual {v0}, Ll/ۗۘ;->onEmojiCompatInitializedForSwitchText()V

    :cond_0
    return-void
.end method
