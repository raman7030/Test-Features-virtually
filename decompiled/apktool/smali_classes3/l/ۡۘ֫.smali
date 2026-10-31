.class public final Ll/ۡۘ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Landroid/os/IBinder;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/֡ۘ֫;

.field public final synthetic ᩹:Ll/֨ۘ֫;


# direct methods
.method public constructor <init>(Ll/֡ۘ֫;Ll/֨ۘ֫;Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 0

    .line 993
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۘ֫;->᩸:Ll/֡ۘ֫;

    iput-object p2, p0, Ll/ۡۘ֫;->᩹:Ll/֨ۘ֫;

    iput-object p3, p0, Ll/ۡۘ֫;->᩶:Ljava/lang/String;

    iput-object p4, p0, Ll/ۡۘ֫;->ۙ:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 996
    iget-object v0, p0, Ll/ۡۘ֫;->᩹:Ll/֨ۘ֫;

    .line 1152
    iget-object v0, v0, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    .line 998
    iget-object v1, p0, Ll/ۡۘ֫;->᩸:Ll/֡ۘ֫;

    iget-object v1, v1, Ll/֡ۘ֫;->֫:Ll/ܶۘ֫;

    iget-object v1, v1, Ll/ܶۘ֫;->᩸:Ll/ۖ᩵;

    const/4 v2, 0x0

    .line 369
    invoke-virtual {v1, v0, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 998
    check-cast v0, Ll/ۤۖ֫;

    if-nez v0, :cond_0

    goto :goto_1

    .line 999
    :cond_0
    iget-object v0, v0, Ll/ۤۖ֫;->ᩳ:Ljava/util/HashMap;

    .line 1722
    iget-object v1, p0, Ll/ۡۘ֫;->᩶:Ljava/lang/String;

    iget-object v2, p0, Ll/ۡۘ֫;->ۙ:Landroid/os/IBinder;

    if-nez v2, :cond_1

    .line 1723
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 1726
    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_4

    .line 1728
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 1729
    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 1730
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۤۤ;

    iget-object v5, v5, Ll/ۤۤ;->֫:Ljava/lang/Object;

    if-ne v2, v5, :cond_2

    .line 1732
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 1735
    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_4

    .line 1736
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_1
    return-void
.end method
