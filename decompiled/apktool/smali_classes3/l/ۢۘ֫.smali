.class public final Ll/ۢۘ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Landroid/os/IBinder;

.field public final synthetic ۙ:Landroid/os/Bundle;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/֡ۘ֫;

.field public final synthetic ᩹:Ll/֨ۘ֫;


# direct methods
.method public constructor <init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 0

    .line 973
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۘ֫;->᩸:Ll/֡ۘ֫;

    iput-object p2, p0, Ll/ۢۘ֫;->᩹:Ll/֨ۘ֫;

    iput-object p3, p0, Ll/ۢۘ֫;->᩶:Ljava/lang/String;

    iput-object p4, p0, Ll/ۢۘ֫;->ۗ:Landroid/os/IBinder;

    iput-object p5, p0, Ll/ۢۘ֫;->ۙ:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 976
    iget-object v0, p0, Ll/ۢۘ֫;->᩹:Ll/֨ۘ֫;

    .line 1152
    iget-object v0, v0, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 979
    iget-object v1, p0, Ll/ۢۘ֫;->᩸:Ll/֡ۘ֫;

    iget-object v2, v1, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v2, v2, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    const/4 v3, 0x0

    .line 369
    invoke-virtual {v2, v0, v3}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 979
    check-cast v0, Ll/ۤۖ֫;

    if-nez v0, :cond_0

    goto :goto_1

    .line 980
    :cond_0
    iget-object v2, v0, Ll/ۤۖ֫;->ᩳ:Ljava/util/HashMap;

    .line 986
    iget-object v1, v1, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    .line 1697
    iget-object v8, p0, Ll/ۢۘ֫;->᩶:Ljava/lang/String;

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_1

    .line 1699
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1701
    :cond_1
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    iget-object v6, p0, Ll/ۢۘ֫;->ۗ:Landroid/os/IBinder;

    iget-object v9, p0, Ll/ۢۘ֫;->ۙ:Landroid/os/Bundle;

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤۤ;

    .line 1702
    iget-object v7, v5, Ll/ۤۤ;->֫:Ljava/lang/Object;

    if-ne v6, v7, :cond_2

    iget-object v5, v5, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v5, Landroid/os/Bundle;

    .line 1703
    invoke-static {v9, v5}, Ll/ۨܺܺ;->֫(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 1707
    :cond_3
    new-instance v4, Ll/ۤۤ;

    invoke-direct {v4, v6, v9}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1708
    invoke-virtual {v2, v8, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1754
    new-instance v10, Ll/᩹ۖ֫;

    move-object v2, v10

    move-object v3, v1

    move-object v4, v8

    move-object v5, v0

    move-object v6, v8

    move-object v7, v9

    invoke-direct/range {v2 .. v7}, Ll/᩹ۖ֫;-><init>(Ll/ܶۘ֫;Ljava/lang/Object;Ll/ۤۖ֫;Ljava/lang/String;Landroid/os/Bundle;)V

    if-nez v9, :cond_4

    .line 1782
    invoke-virtual {v1}, Ll/ܶۘ֫;->ۧ()V

    goto :goto_0

    :cond_4
    const/4 v2, 0x1

    .line 1362
    invoke-virtual {v10, v2}, Ll/ܳۘ֫;->֫(I)V

    .line 1363
    invoke-virtual {v1}, Ll/ܶۘ֫;->ۧ()V

    .line 1788
    :goto_0
    invoke-virtual {v10}, Ll/ܳۘ֫;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_5

    :goto_1
    return-void

    .line 1789
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onLoadChildren must call detach() or sendResult() before returning for package="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Ll/ۤۖ֫;->ܽ:Ljava/lang/String;

    const-string v3, " id="

    .line 0
    invoke-static {v2, v0, v3, v8}, Ll/᩺᩵ܿ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1789
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
