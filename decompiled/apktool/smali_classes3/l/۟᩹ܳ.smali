.class public final Ll/۟᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 893
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 894
    iput-object p1, p0, Ll/۟᩹ܳ;->ۧ:Ljava/util/ArrayList;

    .line 895
    iput-object p2, p0, Ll/۟᩹ܳ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/HashSet;Ljava/util/Set;)Ll/۟᩹ܳ;
    .locals 4

    .line 903
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 904
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 905
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 906
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 909
    :cond_0
    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 910
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 912
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 915
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_3

    const-string p0, "mo"

    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 916
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 918
    :cond_3
    new-instance p0, Ll/۟᩹ܳ;

    invoke-direct {p0, v0, v1}, Ll/۟᩹ܳ;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object p0
.end method
