.class public final Ll/֫᩷᩻;
.super Ll/۟ܶۡ;
.source "8AI4"


# instance fields
.field public final synthetic ۖ:Ll/ۗۢ᩻;

.field public ۜ:Ll/᩺ۤܿ;

.field public final synthetic ۡ:Z

.field public final synthetic ۢ:Z

.field public ܳ:Z

.field public final synthetic ܺ:Ll/᩷᩷᩻;

.field public final synthetic ᩷:Ll/ۧ᩷᩻;

.field public ᩻:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ll/ۧ᩷᩻;Ll/ۗۢ᩻;ZZLl/᩷᩷᩻;)V
    .locals 0

    .line 55
    iput-object p1, p0, Ll/֫᩷᩻;->᩷:Ll/ۧ᩷᩻;

    iput-object p2, p0, Ll/֫᩷᩻;->ۖ:Ll/ۗۢ᩻;

    iput-boolean p3, p0, Ll/֫᩷᩻;->ۢ:Z

    iput-boolean p4, p0, Ll/֫᩷᩻;->ۡ:Z

    iput-object p5, p0, Ll/֫᩷᩻;->ܺ:Ll/᩷᩷᩻;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const/4 p1, 0x0

    .line 56
    iput-boolean p1, p0, Ll/֫᩷᩻;->ܳ:Z

    .line 58
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ll/֫᩷᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 104
    iget-object v0, p0, Ll/֫᩷᩻;->ۜ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/֫᩷᩻;->ܳ:Z

    if-eqz v0, :cond_0

    const v0, 0x7f120632

    .line 105
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 111
    iget-object v0, p0, Ll/֫᩷᩻;->᩷:Ll/ۧ᩷᩻;

    invoke-static {v0}, Ll/ۧ᩷᩻;->ܽ(Ll/ۧ᩷᩻;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 62
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/֫᩷᩻;->᩷:Ll/ۧ᩷᩻;

    invoke-static {v1}, Ll/ۧ᩷᩻;->ܽ(Ll/ۧ᩷᩻;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f120948

    .line 63
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const-string v1, "..."

    .line 64
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 66
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/֫᩷᩻;->ۜ:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 5

    .line 71
    iget-object v0, p0, Ll/֫᩷᩻;->᩷:Ll/ۧ᩷᩻;

    invoke-static {v0}, Ll/ۧ᩷᩻;->֫(Ll/ۧ᩷᩻;)Ll/ۘ֨ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۘ֨ܳ;->֫()I

    move-result v1

    .line 72
    new-instance v2, Ll/᩷ۜ᩻;

    new-instance v3, Ll/ܰۜ᩻;

    invoke-direct {v3, p0}, Ll/ܰۜ᩻;-><init>(Ll/֫᩷᩻;)V

    iget-object v4, p0, Ll/֫᩷᩻;->ۖ:Ll/ۗۢ᩻;

    invoke-direct {v2, v4, v3}, Ll/᩷ۜ᩻;-><init>(Ll/ۗۢ᩻;Ll/ܿۖ᩷;)V

    iget-boolean v3, p0, Ll/֫᩷᩻;->ۢ:Z

    .line 73
    invoke-virtual {v2, v3}, Ll/᩷ۜ᩻;->֫(Z)V

    iget-boolean v3, p0, Ll/֫᩷᩻;->ۡ:Z

    .line 74
    invoke-virtual {v2, v3}, Ll/᩷ۜ᩻;->ۧ(Z)V

    invoke-static {v0}, Ll/ۧ᩷᩻;->ۧ(Ll/ۧ᩷᩻;)Ljava/util/List;

    move-result-object v0

    new-instance v3, Ll/۟ۜ᩻;

    invoke-direct {v3, p0, v4, v1}, Ll/۟ۜ᩻;-><init>(Ll/֫᩷᩻;Ll/ۗۢ᩻;I)V

    .line 75
    invoke-virtual {v2, v0, v3}, Ll/᩷ۜ᩻;->֫(Ljava/util/List;Ll/᩻ۜ᩻;)V

    .line 97
    iget-object v0, p0, Ll/֫᩷᩻;->ۜ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֫᩷᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 116
    iget-boolean v0, p0, Ll/֫᩷᩻;->ܳ:Z

    if-eqz v0, :cond_0

    .line 117
    iget-object v0, p0, Ll/֫᩷᩻;->ܺ:Ll/᩷᩷᩻;

    invoke-virtual {v0}, Ll/᩷᩷᩻;->run()V

    .line 119
    :cond_0
    iget-object v0, p0, Ll/֫᩷᩻;->ۜ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method
