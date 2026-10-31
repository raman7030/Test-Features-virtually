.class public final Ll/ᩴ֡ۢ;
.super Ljava/lang/Object;
.source "T7B2"


# instance fields
.field public final ֫:Ljava/net/InetAddress;

.field public final ۧ:Ljava/net/InetAddress;

.field public final ܽ:Ljava/net/InetAddress;

.field public final ᩳ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V
    .locals 0

    .line 457
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 458
    iput-object p1, p0, Ll/ᩴ֡ۢ;->ܽ:Ljava/net/InetAddress;

    .line 459
    iput-object p2, p0, Ll/ᩴ֡ۢ;->ۧ:Ljava/net/InetAddress;

    .line 460
    iput-object p3, p0, Ll/ᩴ֡ۢ;->֫:Ljava/net/InetAddress;

    .line 461
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴ֡ۢ;->ᩳ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V
    .locals 2

    .line 476
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ֡ۢ;

    .line 477
    invoke-virtual {v1}, Ll/ۘ֡ۢ;->֫()Ljava/net/InetAddress;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 450
    :goto_0
    invoke-direct {p0, p1, p2, v1, p3}, Ll/ᩴ֡ۢ;-><init>(Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/net/InetAddress;Ljava/util/List;)V

    return-void
.end method
