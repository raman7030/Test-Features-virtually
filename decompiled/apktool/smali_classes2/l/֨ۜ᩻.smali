.class public final Ll/֨ۜ᩻;
.super Ll/۟ܶۡ;
.source "TAHS"


# instance fields
.field public final synthetic ۖ:Ll/ۗۢ᩻;

.field public final synthetic ۘ:J

.field public ۜ:Ll/᩺ۤܿ;

.field public final synthetic ۡ:Z

.field public final synthetic ۢ:Z

.field public ܳ:Z

.field public final synthetic ܺ:Ll/᩷᩷᩻;

.field public final synthetic ᩷:Ll/۠ۜ᩻;

.field public ᩻:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ll/۠ۜ᩻;Ll/ۗۢ᩻;ZZJLl/᩷᩷᩻;)V
    .locals 0

    .line 92
    iput-object p1, p0, Ll/֨ۜ᩻;->᩷:Ll/۠ۜ᩻;

    iput-object p2, p0, Ll/֨ۜ᩻;->ۖ:Ll/ۗۢ᩻;

    iput-boolean p3, p0, Ll/֨ۜ᩻;->ۢ:Z

    iput-boolean p4, p0, Ll/֨ۜ᩻;->ۡ:Z

    iput-wide p5, p0, Ll/֨ۜ᩻;->ۘ:J

    iput-object p7, p0, Ll/֨ۜ᩻;->ܺ:Ll/᩷᩷᩻;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const/4 p1, 0x0

    .line 93
    iput-boolean p1, p0, Ll/֨ۜ᩻;->ܳ:Z

    .line 95
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ll/֨ۜ᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 136
    iget-object v0, p0, Ll/֨ۜ᩻;->ۜ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/֨ۜ᩻;->ܳ:Z

    if-eqz v0, :cond_0

    const v0, 0x7f120632

    .line 137
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 143
    iget-object v0, p0, Ll/֨ۜ᩻;->᩷:Ll/۠ۜ᩻;

    invoke-static {v0}, Ll/۠ۜ᩻;->ᩳ(Ll/۠ۜ᩻;)Ll/ܽۢܳ;

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

    .line 99
    new-instance v0, Ll/᩺ۤܿ;

    iget-object v1, p0, Ll/֨ۜ᩻;->᩷:Ll/۠ۜ᩻;

    invoke-static {v1}, Ll/۠ۜ᩻;->ᩳ(Ll/۠ۜ᩻;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v1, 0x7f120b07

    .line 100
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->ܽ(I)V

    const-string v1, "..."

    .line 101
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 65
    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 103
    invoke-virtual {v0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    iput-object v0, p0, Ll/֨ۜ᩻;->ۜ:Ll/᩺ۤܿ;

    return-void
.end method

.method public final ܿ()V
    .locals 6

    .line 108
    new-instance v0, Ll/᩷ۜ᩻;

    new-instance v1, Ll/֡ۜ᩻;

    invoke-direct {v1, p0}, Ll/֡ۜ᩻;-><init>(Ll/֨ۜ᩻;)V

    iget-object v2, p0, Ll/֨ۜ᩻;->ۖ:Ll/ۗۢ᩻;

    invoke-direct {v0, v2, v1}, Ll/᩷ۜ᩻;-><init>(Ll/ۗۢ᩻;Ll/ܿۖ᩷;)V

    iget-boolean v1, p0, Ll/֨ۜ᩻;->ۢ:Z

    .line 109
    invoke-virtual {v0, v1}, Ll/᩷ۜ᩻;->֫(Z)V

    iget-boolean v1, p0, Ll/֨ۜ᩻;->ۡ:Z

    .line 110
    invoke-virtual {v0, v1}, Ll/᩷ۜ᩻;->ۧ(Z)V

    iget-object v1, p0, Ll/֨ۜ᩻;->᩷:Ll/۠ۜ᩻;

    invoke-static {v1}, Ll/۠ۜ᩻;->ۧ(Ll/۠ۜ᩻;)Ljava/util/List;

    move-result-object v1

    new-instance v3, Ll/ۚۜ᩻;

    iget-wide v4, p0, Ll/֨ۜ᩻;->ۘ:J

    invoke-direct {v3, p0, v2, v4, v5}, Ll/ۚۜ᩻;-><init>(Ll/֨ۜ᩻;Ll/ۗۢ᩻;J)V

    .line 111
    invoke-virtual {v0, v1, v3}, Ll/᩷ۜ᩻;->֫(Ljava/util/List;Ll/᩻ۜ᩻;)V

    .line 129
    iget-object v0, p0, Ll/֨ۜ᩻;->ۜ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֨ۜ᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 130
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

    .line 148
    iget-boolean v0, p0, Ll/֨ۜ᩻;->ܳ:Z

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Ll/֨ۜ᩻;->ܺ:Ll/᩷᩷᩻;

    invoke-virtual {v0}, Ll/᩷᩷᩻;->run()V

    .line 151
    :cond_0
    iget-object v0, p0, Ll/֨ۜ᩻;->ۜ:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->ᩳ()V

    return-void
.end method
