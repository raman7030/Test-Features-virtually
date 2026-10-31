.class public final Ll/ܰ᩸֨;
.super Ljava/lang/Object;
.source "T57T"

# interfaces
.implements Ll/ܽ᩹֨;


# instance fields
.field public ֫:Ljava/util/HashMap;

.field public final synthetic ۧ:Ll/ۘ᩹֨;


# direct methods
.method public constructor <init>(Ll/ۘ᩹֨;)V
    .locals 0

    .line 524
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩸֨;->ۧ:Ll/ۘ᩹֨;

    .line 526
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܰ᩸֨;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;)V
    .locals 4

    .line 536
    iget-object v0, p0, Ll/ܰ᩸֨;->֫:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 537
    iget-object v1, p0, Ll/ܰ᩸֨;->ۧ:Ll/ۘ᩹֨;

    iget-object v2, v1, Ll/ۘ᩹֨;->᩻:Ll/ܽ᩹֨;

    .line 539
    :try_start_0
    iget-object v3, v1, Ll/ۘ᩹֨;->᩷:Ll/᩺᩸֨;

    iput-object v3, v1, Ll/ۘ᩹֨;->᩻:Ll/ܽ᩹֨;

    .line 540
    iget-object p1, p1, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    iget-object p1, p1, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-virtual {p1}, Ll/ۛ֡֨;->۠֫()Ll/ܳ֡֨;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Queue;

    :goto_0
    if-eqz p1, :cond_0

    .line 541
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 542
    invoke-interface {p1}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ᩹֨;

    invoke-virtual {v1, v0}, Ll/ۘ᩹֨;->֫(Ll/ۢ᩹֨;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 545
    :cond_0
    iput-object v2, v1, Ll/ۘ᩹֨;->᩻:Ll/ܽ᩹֨;

    return-void

    :catchall_0
    move-exception p1

    iput-object v2, v1, Ll/ۘ᩹֨;->᩻:Ll/ܽ᩹֨;

    .line 546
    throw p1

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۢ᩹֨;)V
    .locals 3

    .line 530
    iget-object v0, p1, Ll/ۢ᩹֨;->ۧ:Ll/֫ۤ֨;

    iget-object v0, v0, Ll/֫ۤ֨;->᩹:Ll/ۚ᩵۠;

    iget-object v0, v0, Ll/ۚ᩵۠;->᩺:Ll/ܳ֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->۠֫()Ll/ܳ֡֨;

    move-result-object v0

    new-instance v1, Ll/۟᩵ܿ;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ll/۟᩵ܿ;-><init>(I)V

    iget-object v2, p0, Ll/ܰ᩸֨;->֫:Ljava/util/HashMap;

    invoke-static {v2, v0, v1}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Queue;

    .line 531
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method
