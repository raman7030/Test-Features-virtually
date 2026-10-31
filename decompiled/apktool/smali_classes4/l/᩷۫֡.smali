.class public abstract Ll/᩷۫֡;
.super Ljava/lang/Object;
.source "02RL"


# instance fields
.field public ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ll/᩷۫֡;)Ljava/util/List;
    .locals 0

    .line 23
    iget-object p0, p0, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    if-nez p0, :cond_0

    .line 24
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ֫(Ll/᩷۫֡;Ll/ᩳ۫֡;)V
    .locals 2

    .line 79
    iget-object v0, p0, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    .line 82
    :cond_0
    iget-object p0, p0, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/String;
.end method

.method public final ֫(Ll/᩷۫֡;Ll/ܺ۫֡;)V
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_1

    .line 91
    :cond_0
    iget-object v0, p0, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 92
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳ۫֡;

    .line 14
    iput-object p2, v1, Ll/ᩳ۫֡;->᩸:Ll/ܺ۫֡;

    goto :goto_0

    .line 95
    :cond_1
    iget-object p2, p0, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    .line 23
    iget-object v0, p1, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    .line 24
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    .line 96
    :cond_2
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 97
    iput-object p2, p1, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    const/4 p1, 0x0

    .line 98
    iput-object p1, p0, Ll/᩷۫֡;->֫:Ljava/util/ArrayList;

    :cond_3
    :goto_1
    return-void
.end method
