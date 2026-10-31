.class public final Ll/ܳۘܳ;
.super Ll/۟ܶۡ;
.source "J26J"


# instance fields
.field public final synthetic ۜ:Ll/ۢۘܳ;

.field public final synthetic ۡ:Ll/ᩳ᩷ܳ;

.field public final synthetic ۢ:Ll/ܽۢܳ;

.field public ܳ:Ll/ܽ᩷ܳ;

.field public final synthetic ᩷:Ljava/lang/Runnable;

.field public ᩻:Ll/ۧۢܳ;


# direct methods
.method public constructor <init>(Ll/ۢۘܳ;Ll/ܽۢܳ;Ll/ᩳ᩷ܳ;Ljava/lang/Runnable;)V
    .locals 0

    .line 395
    iput-object p1, p0, Ll/ܳۘܳ;->ۜ:Ll/ۢۘܳ;

    iput-object p2, p0, Ll/ܳۘܳ;->ۢ:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/ܳۘܳ;->ۡ:Ll/ᩳ᩷ܳ;

    iput-object p4, p0, Ll/ܳۘܳ;->᩷:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 3

    .line 412
    iget-object v0, p0, Ll/ܳۘܳ;->ۜ:Ll/ۢۘܳ;

    invoke-static {v0}, Ll/ۢۘܳ;->ܳ(Ll/ۢۘܳ;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ܳۘܳ;->᩻:Ll/ۧۢܳ;

    invoke-virtual {v1}, Ll/ۧۢܳ;->ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 417
    :cond_0
    iget-object v1, p0, Ll/ܳۘܳ;->ۢ:Ll/ܽۢܳ;

    iget-object v2, p0, Ll/ܳۘܳ;->ܳ:Ll/ܽ᩷ܳ;

    invoke-virtual {v0, v1, v2}, Ll/ۢۘܳ;->֫(Ll/ܽۢܳ;Ll/ܽ᩷ܳ;)V

    .line 418
    iget-object v0, p0, Ll/ܳۘܳ;->᩷:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    .line 419
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    .line 414
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܳۘܳ;->ܳ:Ll/ܽ᩷ܳ;

    if-eqz v0, :cond_2

    .line 446
    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->ܿ()V

    :cond_2
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 425
    iget-object v0, p0, Ll/ܳۘܳ;->᩻:Ll/ۧۢܳ;

    invoke-virtual {v0}, Ll/ۧۢܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 427
    :cond_0
    instance-of v0, p1, Ll/֫ۛۡ;

    if-nez v0, :cond_2

    instance-of v0, p1, Ll/᩵ۤۡ;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 430
    :cond_1
    iget-object v0, p0, Ll/ܳۘܳ;->ۜ:Ll/ۢۘܳ;

    invoke-virtual {v0}, Ll/ۢۘܳ;->ۢ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 428
    :cond_2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ll/᩸ۚۢ;->֫(ILjava/lang/CharSequence;)Ll/᩸ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸ۚۢ;->ۧ()V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 402
    new-instance v0, Ll/ۘۢܳ;

    const/4 v1, 0x2

    iget-object v2, p0, Ll/ܳۘܳ;->ۡ:Ll/ᩳ᩷ܳ;

    invoke-direct {v0, v1, v2}, Ll/ۘۢܳ;-><init>(ILjava/lang/Object;)V

    iget-object v1, p0, Ll/ܳۘܳ;->ۢ:Ll/ܽۢܳ;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Ll/ܽۢܳ;->֫(ZLjava/lang/Runnable;)Ll/ۧۢܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۘܳ;->᩻:Ll/ۧۢܳ;

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 407
    iget-object v0, p0, Ll/ܳۘܳ;->ۢ:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽ᩷ܳ;->᩷()I

    move-result v0

    iget-object v1, p0, Ll/ܳۘܳ;->ۡ:Ll/ᩳ᩷ܳ;

    invoke-interface {v1, v0}, Ll/ᩳ᩷ܳ;->ۧ(I)Ll/ܽ᩷ܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۘܳ;->ܳ:Ll/ܽ᩷ܳ;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 436
    iget-object v0, p0, Ll/ܳۘܳ;->᩻:Ll/ۧۢܳ;

    invoke-virtual {v0}, Ll/ۧۢܳ;->֫()V

    return-void
.end method
