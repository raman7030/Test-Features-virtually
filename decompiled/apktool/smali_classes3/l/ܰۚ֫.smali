.class public final Ll/ܰۚ֫;
.super Ljava/lang/Object;
.source "J8TX"


# instance fields
.field public final ֫:Ljava/util/concurrent/Executor;

.field public final ۧ:Ljava/lang/ref/WeakReference;

.field public final synthetic ܽ:Ll/ۧ֨֫;


# direct methods
.method public constructor <init>(Ll/ۧ֨֫;Ll/ۤܿۧ;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 306
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰۚ֫;->ܽ:Ll/ۧ֨֫;

    .line 307
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ܰۚ֫;->ۧ:Ljava/lang/ref/WeakReference;

    .line 308
    iput-object p3, p0, Ll/ܰۚ֫;->֫:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic ֫(Ll/ܰۚ֫;)V
    .locals 1

    .line 318
    iget-object v0, p0, Ll/ܰۚ֫;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۚ֫;

    if-eqz v0, :cond_0

    .line 320
    iget-object p0, p0, Ll/ܰۚ֫;->ܽ:Ll/ۧ֨֫;

    invoke-virtual {p0}, Ll/ۧ֨֫;->֫()I

    move-result p0

    invoke-interface {v0, p0}, Ll/ۨۚ֫;->֫(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 316
    new-instance v0, Ll/᩺ۚ֫;

    invoke-direct {v0, p0}, Ll/᩺ۚ֫;-><init>(Ll/ܰۚ֫;)V

    iget-object v1, p0, Ll/ܰۚ֫;->֫:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 312
    iget-object v0, p0, Ll/ܰۚ֫;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
