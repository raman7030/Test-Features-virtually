.class public Ll/ܺ᩸ۢ;
.super Ljava/lang/Object;
.source "Y9AZ"

# interfaces
.implements Ll/۠ۢ֫;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Runnable;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/ۢ᩸ۢ;


# direct methods
.method public constructor <init>(Ll/֡ۚۢ;Ll/ۗܺ᩷;Ll/ۢ᩸ۢ;Ljava/lang/Runnable;)V
    .locals 0

    .line 338
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩸ۢ;->᩶:Ll/֡ۚۢ;

    iput-object p2, p0, Ll/ܺ᩸ۢ;->᩸:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ܺ᩸ۢ;->᩹:Ll/ۢ᩸ۢ;

    iput-object p4, p0, Ll/ܺ᩸ۢ;->ۙ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final synthetic ֫(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final ۧ(Ll/᩻ۡ֫;)V
    .locals 3

    .line 341
    iget-object p1, p0, Ll/ܺ᩸ۢ;->᩶:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    iget-object v1, p0, Ll/ܺ᩸ۢ;->᩸:Ll/ۗܺ᩷;

    if-nez v0, :cond_0

    .line 342
    invoke-virtual {v1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void

    .line 345
    :cond_0
    iget-object v0, p0, Ll/ܺ᩸ۢ;->᩹:Ll/ۢ᩸ۢ;

    invoke-virtual {v0}, Ll/ۢ᩸ۢ;->֫()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 330
    iget-boolean v2, v0, Ll/ۢ᩸ۢ;->ۧ:Z

    if-eqz v2, :cond_1

    .line 347
    invoke-virtual {v1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 333
    iput-boolean v1, v0, Ll/ۢ᩸ۢ;->ۧ:Z

    .line 350
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 351
    invoke-static {}, Ll/᩺᩹ۢ;->֫()V

    .line 352
    invoke-static {}, Ll/֫᩸ۢ;->ܽ()V

    .line 353
    iget-object p1, p0, Ll/ܺ᩸ۢ;->ۙ:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void
.end method

.method public final synthetic ܳ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ܽ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ܿ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method

.method public final synthetic ᩳ(Ll/᩻ۡ֫;)V
    .locals 0

    return-void
.end method
