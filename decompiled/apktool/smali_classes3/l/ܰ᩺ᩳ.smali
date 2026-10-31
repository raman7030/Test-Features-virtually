.class public final Ll/ܰ᩺ᩳ;
.super Ljava/lang/Object;
.source "B6NL"


# instance fields
.field public volatile ֫:Z

.field public final ۜ:Ljava/util/function/BooleanSupplier;

.field public final ۡ:I

.field public final ۢ:Ll/۟᩺ᩳ;

.field public ۧ:Z

.field public final ܳ:I

.field public final ܺ:Ll/۫ۨᩳ;

.field public final ܽ:Ll/۬۬ܿ;

.field public final ܿ:Landroid/os/Handler;

.field public ᩳ:Z

.field public final ᩷:Ll/ۡ᩹ۡ;

.field public final ᩻:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/ۗܺ᩷;ILjava/util/function/BooleanSupplier;)V
    .locals 3

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ܰ᩺ᩳ;->ܿ:Landroid/os/Handler;

    .line 31
    new-instance v1, Ll/᩺᩺ᩳ;

    invoke-direct {v1, p0}, Ll/᩺᩺ᩳ;-><init>(Ll/ܰ᩺ᩳ;)V

    iput-object v1, p0, Ll/ܰ᩺ᩳ;->᩻:Ljava/lang/Runnable;

    .line 44
    iput-object p1, p0, Ll/ܰ᩺ᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 45
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v2

    iput-object v2, p0, Ll/ܰ᩺ᩳ;->ۢ:Ll/۟᩺ᩳ;

    .line 46
    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    iput v2, p0, Ll/ܰ᩺ᩳ;->ۡ:I

    .line 1294
    iget v2, p1, Ll/۫ۨᩳ;->ۢ֫:I

    .line 47
    iput v2, p0, Ll/ܰ᩺ᩳ;->ܳ:I

    .line 48
    invoke-static {p1}, Ll/ۡ᩹ۡ;->֫(Ll/۫ۨᩳ;)Ll/ۡ᩹ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ܰ᩺ᩳ;->᩷:Ll/ۡ᩹ۡ;

    .line 49
    iput-object p4, p0, Ll/ܰ᩺ᩳ;->ۜ:Ljava/util/function/BooleanSupplier;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 50
    :cond_0
    new-instance p1, Ll/۬۬ܿ;

    invoke-direct {p1, p2, p3}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    :goto_0
    iput-object p1, p0, Ll/ܰ᩺ᩳ;->ܽ:Ll/۬۬ܿ;

    if-eqz p1, :cond_1

    .line 52
    new-instance p2, Ll/᩸ۛᩳ;

    const/4 p3, 0x2

    invoke-direct {p2, p3, p0}, Ll/᩸ۛᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    .line 53
    new-instance p1, Ll/ۨ᩺ᩳ;

    invoke-direct {p1, p0}, Ll/ۨ᩺ᩳ;-><init>(Ll/ܰ᩺ᩳ;)V

    const-wide/16 p2, 0x12c

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    const-wide/16 p1, 0xc8

    .line 57
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static synthetic ֫(Ll/ܰ᩺ᩳ;)V
    .locals 1

    .line 54
    iget-boolean v0, p0, Ll/ܰ᩺ᩳ;->ᩳ:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Ll/ܰ᩺ᩳ;->ܽ:Ll/۬۬ܿ;

    invoke-virtual {p0}, Ll/۬۬ܿ;->ܳ()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܰ᩺ᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܰ᩺ᩳ;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܰ᩺ᩳ;)Landroid/os/Handler;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰ᩺ᩳ;->ܿ:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 96
    invoke-virtual {p0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    .line 97
    iput-boolean v0, p0, Ll/ܰ᩺ᩳ;->ۧ:Z

    .line 98
    invoke-virtual {p0}, Ll/ܰ᩺ᩳ;->ܿ()V

    return v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 71
    iget-boolean v0, p0, Ll/ܰ᩺ᩳ;->֫:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܰ᩺ᩳ;->᩷:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܰ᩺ᩳ;->ۧ:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ܰ᩺ᩳ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Ll/ܰ᩺ᩳ;->֫:Z

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 88
    iget-boolean v0, p0, Ll/ܰ᩺ᩳ;->ۧ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 89
    iput-boolean v0, p0, Ll/ܰ᩺ᩳ;->֫:Z

    .line 90
    invoke-virtual {p0}, Ll/ܰ᩺ᩳ;->ܿ()V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    const/4 v0, 0x1

    .line 105
    iput-boolean v0, p0, Ll/ܰ᩺ᩳ;->ᩳ:Z

    .line 106
    iget-object v0, p0, Ll/ܰ᩺ᩳ;->ܿ:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 107
    iget-object v0, p0, Ll/ܰ᩺ᩳ;->ܽ:Ll/۬۬ܿ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۬۬ܿ;->֫()V

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 2

    .line 80
    iget-boolean v0, p0, Ll/ܰ᩺ᩳ;->֫:Z

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 81
    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Editor search canceled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 63
    iget-boolean v0, p0, Ll/ܰ᩺ᩳ;->֫:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܰ᩺ᩳ;->᩷:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܰ᩺ᩳ;->ܺ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/ܰ᩺ᩳ;->ۢ:Ll/۟᩺ᩳ;

    if-ne v0, v1, :cond_0

    .line 64
    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iget v1, p0, Ll/ܰ᩺ᩳ;->ۡ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܰ᩺ᩳ;->ܺ:Ll/۫ۨᩳ;

    .line 1294
    iget v0, v0, Ll/۫ۨᩳ;->ۢ֫:I

    .line 64
    iget v1, p0, Ll/ܰ᩺ᩳ;->ܳ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܰ᩺ᩳ;->ۜ:Ljava/util/function/BooleanSupplier;

    .line 65
    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
