.class public final Ll/ۛۗۖ;
.super Ljava/util/LinkedList;
.source "351M"


# static fields
.field public static final serialVersionUID:J = 0x692bc84a9c153b0eL


# instance fields
.field public ᩸:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/util/LinkedList;-><init>()V

    .line 12
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۛۗۖ;->᩸:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ۛۗۖ;->᩸:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 32
    invoke-super {p0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 2

    .line 20
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 2

    .line 38
    invoke-super {p0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    .line 39
    iget-object v1, p0, Ll/ۛۗۖ;->᩸:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final pop()Ljava/lang/Object;
    .locals 2

    .line 45
    invoke-super {p0}, Ljava/util/LinkedList;->pop()Ljava/lang/Object;

    move-result-object v0

    .line 46
    iget-object v1, p0, Ll/ۛۗۖ;->᩸:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object v0
.end method
