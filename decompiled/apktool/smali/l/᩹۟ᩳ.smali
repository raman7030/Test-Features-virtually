.class public final Ll/᩹۟ᩳ;
.super Ljava/lang/Object;
.source "L1GV"


# instance fields
.field public ֫:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/᩹۟ᩳ;->֫:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 36
    iget-object v0, p0, Ll/᩹۟ᩳ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    return-void
.end method

.method public final ֫(Ll/ۤۜܽ;)V
    .locals 3

    const v0, -0x5d7d9e7d

    .line 40
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 41
    iget-object v0, p0, Ll/᩹۟ᩳ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 42
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸۟ᩳ;

    .line 43
    iget v2, v1, Ll/᩸۟ᩳ;->ۧ:I

    invoke-virtual {p1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 44
    iget v1, v1, Ll/᩸۟ᩳ;->֫:I

    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->writeInt(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/۬ۜܽ;)V
    .locals 6

    .line 49
    iget-object v0, p0, Ll/᩹۟ᩳ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    const v1, -0x5d7d9e7d

    .line 50
    invoke-virtual {p1, v1}, Ll/۬ۜܽ;->֫(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 53
    :cond_0
    invoke-virtual {p1}, Ll/۬ۜܽ;->ۛۧ()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 55
    new-instance v3, Ll/᩸۟ᩳ;

    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v4

    invoke-virtual {p1}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    invoke-direct {v3, v4, v5}, Ll/᩸۟ᩳ;-><init>(II)V

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ֫(Ll/᩸۟ᩳ;)V
    .locals 2

    .line 29
    iget-object v0, p0, Ll/᩹۟ᩳ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 30
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result p1

    const/16 v1, 0x64

    if-le p1, v1, :cond_0

    .line 31
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final ۧ()Ll/᩸۟ᩳ;
    .locals 2

    .line 17
    iget-object v0, p0, Ll/᩹۟ᩳ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ᩳ;

    return-object v0
.end method

.method public final ܽ()Ll/᩸۟ᩳ;
    .locals 2

    .line 23
    iget-object v0, p0, Ll/᩹۟ᩳ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ᩳ;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 13
    iget-object v0, p0, Ll/᩹۟ᩳ;->֫:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
