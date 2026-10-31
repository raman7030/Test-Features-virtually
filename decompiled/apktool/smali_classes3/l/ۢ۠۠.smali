.class public abstract Ll/ۢ۠۠;
.super Ljava/lang/Object;
.source "37P4"

# interfaces
.implements Ll/ۘ۠۠;


# instance fields
.field public final ᩸:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(Ll/ۡ۠۠;)Ljava/util/Collection;
.end method

.method public final ֫(Ll/ᩴ۠۠;Ljava/lang/Object;)V
    .locals 6

    .line 119
    invoke-virtual {p1, p0, p2}, Ll/ᩴ۠۠;->֫(Ll/ۢ۠۠;Ljava/lang/Object;)V

    .line 120
    invoke-virtual {p0}, Ll/ۢ۠۠;->ۧ()[Ll/ۡ۠۠;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 121
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {p0, v3}, Ll/ۢ۠۠;->֫(Ll/ۡ۠۠;)Ljava/util/Collection;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۢ۠۠;

    .line 122
    invoke-virtual {p1, v3, p0, v5, p2}, Ll/ᩴ۠۠;->֫(Ll/ۡ۠۠;Ll/ۢ۠۠;Ll/ۢ۠۠;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public abstract ۧ()[Ll/ۡ۠۠;
.end method
