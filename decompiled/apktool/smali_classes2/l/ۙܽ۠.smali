.class public final Ll/ۙܽ۠;
.super Ljava/util/AbstractQueue;
.source "X426"


# static fields
.field public static final ۙ:Ll/ۙ֨۠;


# instance fields
.field public ᩶:Ljava/util/HashMap;

.field public ᩸:Ljava/util/LinkedList;

.field public ᩹:Ljava/util/LinkedList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 48
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۙܽ۠;->ۙ:Ll/ۙ֨۠;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۙܽ۠;
    .locals 3

    .line 52
    sget-object v0, Ll/ۙܽ۠;->ۙ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙܽ۠;

    if-nez v1, :cond_0

    .line 54
    new-instance v1, Ll/ۙܽ۠;

    .line 59
    invoke-direct {v1}, Ljava/util/AbstractQueue;-><init>()V

    .line 152
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, v1, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    .line 60
    invoke-virtual {p0, v0, v1}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method private ֫(Ll/֫ۤ֨;)V
    .locals 3

    .line 127
    iget-object v0, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v0, v0, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    .line 128
    iget-object v1, p0, Ll/ۙܽ۠;->᩶:Ljava/util/HashMap;

    if-nez v1, :cond_0

    .line 129
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ۙܽ۠;->᩶:Ljava/util/HashMap;

    .line 130
    :cond_0
    iget-object v1, p0, Ll/ۙܽ۠;->᩶:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ܽ۠;

    if-nez v1, :cond_1

    .line 132
    new-instance v1, Ll/᩶ܽ۠;

    invoke-direct {v1, p0}, Ll/᩶ܽ۠;-><init>(Ll/ۙܽ۠;)V

    .line 133
    iget-object v2, p0, Ll/ۙܽ۠;->᩶:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    iget-object v0, p0, Ll/ۙܽ۠;->᩹:Ljava/util/LinkedList;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 136
    :cond_1
    iget-object v0, v1, Ll/᩶ܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ۧ(Ll/֫ۤ֨;)V
    .locals 3

    .line 140
    iget-object v0, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v0, v0, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    .line 141
    iget-object v1, p0, Ll/ۙܽ۠;->᩶:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ܽ۠;

    if-nez v1, :cond_0

    goto :goto_0

    .line 144
    :cond_0
    iget-object v2, v1, Ll/᩶ܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v2, p1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 145
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 146
    iget-object p1, p0, Ll/ۙܽ۠;->᩶:Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    iget-object p1, p0, Ll/ۙܽ۠;->᩹:Ljava/util/LinkedList;

    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    .line 46
    check-cast p1, Ll/֫ۤ֨;

    .line 78
    iget-object v0, p0, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    iget-object v0, p0, Ll/ۙܽ۠;->᩹:Ljava/util/LinkedList;

    if-eqz v0, :cond_0

    .line 80
    invoke-direct {p0, p1}, Ll/ۙܽ۠;->֫(Ll/֫ۤ֨;)V

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final peek()Ljava/lang/Object;
    .locals 2

    .line 74
    iget-object v0, p0, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 113
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۤ֨;

    return-object v0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 2

    .line 74
    iget-object v0, p0, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 106
    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۤ֨;

    .line 107
    iget-object v1, p0, Ll/ۙܽ۠;->᩹:Ljava/util/LinkedList;

    if-eqz v1, :cond_1

    .line 108
    invoke-direct {p0, v0}, Ll/ۙܽ۠;->ۧ(Ll/֫ۤ֨;)V

    :cond_1
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/util/HashSet;)V
    .locals 3

    .line 94
    iget-object v0, p0, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 95
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۤ֨;

    .line 96
    iget-object v2, v1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v2, v2, Ll/֨᩵۠;->ܰ:Ll/ᩳ᩶۠;

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 97
    iget-object v2, p0, Ll/ۙܽ۠;->᩹:Ljava/util/LinkedList;

    if-eqz v2, :cond_1

    invoke-direct {p0, v1}, Ll/ۙܽ۠;->ۧ(Ll/֫ۤ֨;)V

    .line 98
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ۧ()Ljava/util/LinkedList;
    .locals 2

    .line 117
    iget-object v0, p0, Ll/ۙܽ۠;->᩹:Ljava/util/LinkedList;

    if-nez v0, :cond_0

    .line 118
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ۙܽ۠;->᩹:Ljava/util/LinkedList;

    .line 119
    iget-object v0, p0, Ll/ۙܽ۠;->᩸:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۤ֨;

    .line 120
    invoke-direct {p0, v1}, Ll/ۙܽ۠;->֫(Ll/֫ۤ֨;)V

    goto :goto_0

    .line 123
    :cond_0
    iget-object v0, p0, Ll/ۙܽ۠;->᩹:Ljava/util/LinkedList;

    return-object v0
.end method
