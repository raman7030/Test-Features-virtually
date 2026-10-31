.class public final Ll/ܳۨܽ;
.super Ljava/lang/Object;
.source "H5BW"


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ۧ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ll/ܳۨܽ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    iput-object p1, p0, Ll/ܳۨܽ;->ۧ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۚۢ;)Z
    .locals 3

    .line 102
    iget-object v0, p0, Ll/ܳۨܽ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return v2

    .line 105
    :cond_0
    invoke-virtual {p1}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 106
    iget-object v0, p0, Ll/ܳۨܽ;->ۧ:Landroid/view/View;

    invoke-static {p1, v0, v2}, Ll/ۡۨܽ;->֫(Ll/֡ۚۢ;Landroid/view/View;Z)V

    :cond_1
    return v1
.end method

.method public final ۧ(Ll/֡ۚۢ;)Z
    .locals 3

    .line 91
    iget-object v0, p0, Ll/ܳۨܽ;->֫:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    .line 94
    :cond_0
    iget-object v0, p0, Ll/ܳۨܽ;->ۧ:Landroid/view/View;

    invoke-static {p1, v0, v2}, Ll/ۡۨܽ;->֫(Ll/֡ۚۢ;Landroid/view/View;Z)V

    return v2
.end method
