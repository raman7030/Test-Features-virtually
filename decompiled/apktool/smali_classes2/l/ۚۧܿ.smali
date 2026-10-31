.class public final Ll/ۚۧܿ;
.super Ljava/lang/Object;
.source "44TS"


# instance fields
.field public final ֡:Ll/۟᩺ᩳ;

.field public final ֨:I

.field public final ֫:Z

.field public final ۖ:I

.field public final ۘ:Ll/ܰ᩺ᩳ;

.field public final ۚ:I

.field public final ۜ:Z

.field public final synthetic ۠:Ll/֨ۧܿ;

.field public final ۡ:Ll/۬۟ᩳ;

.field public final ۢ:Ljava/lang/String;

.field public volatile ۧ:Z

.field public final ܳ:Ll/۫ۘܽ;

.field public final ܺ:I

.field public volatile ܽ:Z

.field public volatile ܿ:Ljava/util/concurrent/Future;

.field public final ᩳ:I

.field public final ᩴ:I

.field public final ᩵:I

.field public final ᩷:Ll/ۖۧܿ;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/֨ۧܿ;)V
    .locals 4

    .line 519
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۧܿ;->۠:Ll/֨ۧܿ;

    .line 520
    invoke-static {p1}, Ll/֨ۧܿ;->ܿ(Ll/֨ۧܿ;)Ll/۫ۘܽ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۧܿ;->ܳ:Ll/۫ۘܽ;

    .line 521
    invoke-static {p1}, Ll/֨ۧܿ;->᩻(Ll/֨ۧܿ;)Ll/۟᩺ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۧܿ;->֡:Ll/۟᩺ᩳ;

    .line 522
    invoke-static {p1}, Ll/֨ۧܿ;->ܳ(Ll/֨ۧܿ;)I

    move-result v1

    iput v1, p0, Ll/ۚۧܿ;->᩻:I

    .line 523
    invoke-static {p1}, Ll/֨ۧܿ;->ۜ(Ll/֨ۧܿ;)I

    move-result v1

    iput v1, p0, Ll/ۚۧܿ;->֨:I

    .line 524
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, p0, Ll/ۚۧܿ;->ۚ:I

    .line 525
    invoke-static {p1}, Ll/֨ۧܿ;->ܽ(Ll/֨ۧܿ;)Ll/۬۟ᩳ;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/֨ۧܿ;->ܽ(Ll/֨ۧܿ;)Ll/۬۟ᩳ;

    move-result-object v1

    iget v1, v1, Ll/۬۟ᩳ;->ۧ:I

    :goto_0
    iput v1, p0, Ll/ۚۧܿ;->ۖ:I

    .line 526
    invoke-static {p1}, Ll/֨ۧܿ;->ܽ(Ll/֨ۧܿ;)Ll/۬۟ᩳ;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ll/֨ۧܿ;->ܽ(Ll/֨ۧܿ;)Ll/۬۟ᩳ;

    move-result-object v0

    iget v0, v0, Ll/۬۟ᩳ;->֫:I

    :goto_1
    iput v0, p0, Ll/ۚۧܿ;->ܺ:I

    .line 527
    invoke-static {p1}, Ll/֨ۧܿ;->ۧ(Ll/֨ۧܿ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v0

    iput v0, p0, Ll/ۚۧܿ;->᩵:I

    .line 528
    invoke-static {p1}, Ll/֨ۧܿ;->ۧ(Ll/֨ۧܿ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v0

    iput v0, p0, Ll/ۚۧܿ;->ᩴ:I

    .line 529
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-ne v0, v1, :cond_2

    .line 530
    invoke-static {p1, v1}, Ll/֨ۧܿ;->ۧ(Ll/֨ۧܿ;I)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v2, 0x1

    :cond_2
    iput-boolean v2, p0, Ll/ۚۧܿ;->֫:Z

    .line 531
    invoke-static {p1}, Ll/֨ۧܿ;->ᩳ(Ll/֨ۧܿ;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۧܿ;->ۢ:Ljava/lang/String;

    .line 532
    invoke-virtual {p1}, Ll/֨ۧܿ;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ۚۧܿ;->ᩳ:I

    .line 533
    invoke-static {p1}, Ll/֨ۧܿ;->ۧ(Ll/֨ۧܿ;)Ll/۫ۨᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩶֫()Ll/۬۟ᩳ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۧܿ;->ۡ:Ll/۬۟ᩳ;

    .line 534
    invoke-static {p1}, Ll/֨ۧܿ;->ۢ(Ll/֨ۧܿ;)Ll/ۖۧܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ۚۧܿ;->᩷:Ll/ۖۧܿ;

    .line 535
    invoke-static {p1}, Ll/֨ۧܿ;->᩷(Ll/֨ۧܿ;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۚۧܿ;->ۜ:Z

    .line 539
    new-instance v0, Ll/ܰ᩺ᩳ;

    invoke-static {p1}, Ll/֨ۧܿ;->ۧ(Ll/֨ۧܿ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-static {p1}, Ll/֨ۧܿ;->֫(Ll/֨ۧܿ;)Ll/ۗܺ᩷;

    move-result-object p1

    new-instance v2, Ll/֡ۧܿ;

    invoke-direct {v2, p0}, Ll/֡ۧܿ;-><init>(Ll/ۚۧܿ;)V

    const v3, 0x7f12090c

    invoke-direct {v0, v1, p1, v3, v2}, Ll/ܰ᩺ᩳ;-><init>(Ll/۫ۨᩳ;Ll/ۗܺ᩷;ILjava/util/function/BooleanSupplier;)V

    iput-object v0, p0, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۚۧܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۚۧܿ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۚۧܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۚۧܿ;->ܽ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x1

    .line 562
    iput-boolean v0, p0, Ll/ۚۧܿ;->ۧ:Z

    .line 563
    iget-object v0, p0, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->ܽ()V

    .line 564
    iget-object v0, p0, Ll/ۚۧܿ;->ܿ:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 565
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/util/concurrent/Future;)V
    .locals 0

    .line 543
    iput-object p1, p0, Ll/ۚۧܿ;->ܿ:Ljava/util/concurrent/Future;

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 569
    iget-object v0, p0, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v0}, Ll/ܰ᩺ᩳ;->ܿ()V

    return-void
.end method

.method public final ܽ()Z
    .locals 2

    .line 556
    iget-object v0, p0, Ll/ۚۧܿ;->ܿ:Ljava/util/concurrent/Future;

    .line 557
    iget-boolean v1, p0, Ll/ۚۧܿ;->ۧ:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۚۧܿ;->ۘ:Ll/ܰ᩺ᩳ;

    invoke-virtual {v1}, Ll/ܰ᩺ᩳ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

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

.method public final ܿ()V
    .locals 1

    .line 547
    :goto_0
    iget-object v0, p0, Ll/ۚۧܿ;->ܿ:Ljava/util/concurrent/Future;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 551
    iget-object v0, p0, Ll/ۚۧܿ;->ܿ:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_0

    .line 552
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
