.class public final synthetic Ll/ۙۢۢ;
.super Ljava/lang/Object;
.source "T1PJ"

# interfaces
.implements Ll/᩵᩶ᩳ;
.implements Ll/۟ۤ;


# instance fields
.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۢۢ;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ۙۢۢ;->᩹:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤܰᩳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۢۢ;->᩹:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۙۢۢ;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public ֫(III)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۙۢۢ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۤܰᩳ;

    iget-object v1, p0, Ll/ۙۢۢ;->᩸:Ljava/util/ArrayList;

    invoke-static {v0, v1, p1, p2, p3}, Ll/ۤܰᩳ;->֫(Ll/ۤܰᩳ;Ljava/util/ArrayList;III)V

    return-void
.end method

.method public ֫(Ljava/lang/String;)Z
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۙۢۢ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 91
    iget-object v1, p0, Ll/ۙۢۢ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗۢۢ;

    .line 92
    invoke-virtual {v2, p1}, Ll/ۗۢۢ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 96
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗۢۢ;

    .line 97
    invoke-virtual {v2, p1}, Ll/ۗۢۢ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 p1, 0x1

    return p1

    .line 100
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    return p1
.end method
