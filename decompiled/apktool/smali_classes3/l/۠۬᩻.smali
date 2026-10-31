.class public final Ll/۠۬᩻;
.super Ll/۟ܶۡ;
.source "J6WT"


# instance fields
.field public final synthetic ۜ:Ll/ܶ۬᩻;

.field public ܳ:Ll/ۘۢۜ;

.field public final synthetic ᩷:Ljava/lang/Runnable;

.field public final synthetic ᩻:Ll/ۗ۬᩻;


# direct methods
.method public constructor <init>(Ll/ۗ۬᩻;Ll/ܶ۬᩻;Ljava/lang/Runnable;)V
    .locals 0

    .line 300
    iput-object p1, p0, Ll/۠۬᩻;->᩻:Ll/ۗ۬᩻;

    iput-object p2, p0, Ll/۠۬᩻;->ۜ:Ll/ܶ۬᩻;

    iput-object p3, p0, Ll/۠۬᩻;->᩷:Ljava/lang/Runnable;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 315
    iget-object v0, p0, Ll/۠۬᩻;->᩻:Ll/ۗ۬᩻;

    invoke-static {v0}, Ll/ۗ۬᩻;->ᩳ(Ll/ۗ۬᩻;)Ll/֡ۚۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡ۚۢ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/ۗ۬᩻;->ۧ(Ll/ۗ۬᩻;)Ll/ۗܺ᩷;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    .line 316
    invoke-virtual {v0}, Ll/ۗ۬᩻;->ܽ()V

    .line 317
    iget-object v1, p0, Ll/۠۬᩻;->᩷:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 318
    :cond_0
    iget-object v1, p0, Ll/۠۬᩻;->ܳ:Ll/ۘۢۜ;

    if-eqz v1, :cond_1

    .line 319
    iget-object v1, v1, Ll/ۘۢۜ;->֫:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ۗ۬᩻;->ᩳ(Ll/ۗ۬᩻;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 1

    .line 326
    iget-object p1, p0, Ll/۠۬᩻;->᩻:Ll/ۗ۬᩻;

    invoke-static {p1}, Ll/ۗ۬᩻;->ᩳ(Ll/ۗ۬᩻;)Ll/֡ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۗ۬᩻;->ۧ(Ll/ۗ۬᩻;)Ll/ۗܺ᩷;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 327
    invoke-virtual {p1}, Ll/ۗ۬᩻;->ܽ()V

    const p1, 0x7f120588

    .line 328
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(I)V

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 305
    iget-object v0, p0, Ll/۠۬᩻;->᩻:Ll/ۗ۬᩻;

    invoke-static {v0}, Ll/ۗ۬᩻;->ۧ(Ll/ۗ۬᩻;)Ll/ۗܺ᩷;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->ۧ(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 1

    .line 310
    iget-object v0, p0, Ll/۠۬᩻;->ۜ:Ll/ܶ۬᩻;

    invoke-interface {v0}, Ll/ܶ۬᩻;->run()Ll/ۘۢۜ;

    move-result-object v0

    iput-object v0, p0, Ll/۠۬᩻;->ܳ:Ll/ۘۢۜ;

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 334
    iput-object v0, p0, Ll/۠۬᩻;->ܳ:Ll/ۘۢۜ;

    .line 335
    iget-object v0, p0, Ll/۠۬᩻;->᩻:Ll/ۗ۬᩻;

    invoke-static {v0}, Ll/ۗ۬᩻;->᩻(Ll/ۗ۬᩻;)V

    .line 336
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
