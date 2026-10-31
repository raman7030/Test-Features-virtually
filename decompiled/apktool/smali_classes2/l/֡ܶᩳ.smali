.class public final synthetic Ll/֡ܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ܶܶᩳ;

.field public final synthetic ۧ:Ll/᩸ܶᩳ;

.field public final synthetic ܽ:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Ll/ܶܶᩳ;Ll/᩸ܶᩳ;Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܶᩳ;->֫:Ll/ܶܶᩳ;

    iput-object p2, p0, Ll/֡ܶᩳ;->ۧ:Ll/᩸ܶᩳ;

    iput-object p3, p0, Ll/֡ܶᩳ;->ܽ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 6

    .line 2397
    iget-object v0, p0, Ll/֡ܶᩳ;->֫:Ll/ܶܶᩳ;

    iget-object v0, v0, Ll/ܶܶᩳ;->ۧ:Ll/᩹ܶᩳ;

    invoke-static {v0}, Ll/᩹ܶᩳ;->ᩳ(Ll/᩹ܶᩳ;)Ll/ᩴܶᩳ;

    move-result-object v1

    iget-object v2, v0, Ll/֫ۘᩳ;->᩸:Landroid/os/Bundle;

    iget-object v3, p0, Ll/֡ܶᩳ;->ۧ:Ll/᩸ܶᩳ;

    invoke-static {v3}, Ll/᩸ܶᩳ;->ۧ(Ll/᩸ܶᩳ;)Ll/ᩴܶᩳ;

    move-result-object v4

    const/4 v5, 0x0

    if-ne v1, v4, :cond_0

    .line 2398
    invoke-virtual {v2}, Landroid/os/Bundle;->clear()V

    iget-object v1, p0, Ll/֡ܶᩳ;->ܽ:Landroid/os/Bundle;

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    invoke-static {v0}, Ll/᩹ܶᩳ;->ۚ(Ll/᩹ܶᩳ;)V

    .line 2399
    invoke-static {v3}, Ll/᩸ܶᩳ;->ۧ(Ll/᩸ܶᩳ;)Ll/ᩴܶᩳ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩴܶᩳ;->ᩳ:Ll/֡ᩴᩳ;

    invoke-virtual {v1, v2}, Ll/֡ᩴᩳ;->֫(Landroid/os/Bundle;)V

    .line 2400
    invoke-virtual {v0}, Ll/֫ۘᩳ;->᩵()V

    :cond_0
    return-object v5
.end method
