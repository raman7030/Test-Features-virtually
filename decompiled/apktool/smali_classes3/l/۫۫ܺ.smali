.class public final Ll/۫۫ܺ;
.super Ljava/lang/Object;
.source "P5NR"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic ᩶:Ljava/util/ListIterator;

.field public ᩸:Z

.field public final synthetic ᩹:Ll/ۤ۫ܺ;


# direct methods
.method public constructor <init>(Ll/ۤ۫ܺ;Ljava/util/ListIterator;)V
    .locals 0

    .line 923
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    iput-object p1, p0, Ll/۫۫ܺ;->᩹:Ll/ۤ۫ܺ;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 1

    .line 929
    iget-object v0, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 930
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    const/4 p1, 0x0

    .line 931
    iput-boolean p1, p0, Ll/۫۫ܺ;->᩸:Z

    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 936
    iget-object v0, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 941
    iget-object v0, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 936
    iget-object v0, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 950
    iput-boolean v1, p0, Ll/۫۫ܺ;->᩸:Z

    .line 951
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 948
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 2

    .line 956
    iget-object v0, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    iget-object v1, p0, Ll/۫۫ܺ;->᩹:Ll/ۤ۫ܺ;

    invoke-static {v1, v0}, Ll/ۤ۫ܺ;->֫(Ll/ۤ۫ܺ;I)I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    .line 941
    iget-object v0, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 965
    iput-boolean v1, p0, Ll/۫۫ܺ;->᩸:Z

    .line 966
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 963
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 971
    invoke-virtual {p0}, Ll/۫۫ܺ;->nextIndex()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 2

    .line 976
    iget-boolean v0, p0, Ll/۫۫ܺ;->᩸:Z

    const-string v1, "no calls to next() since the last call to remove()"

    .line 63
    invoke-static {v1, v0}, Ll/ۘܶܺ;->ۧ(Ljava/lang/String;Z)V

    .line 977
    iget-object v0, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    invoke-interface {v0}, Ljava/util/ListIterator;->remove()V

    const/4 v0, 0x0

    .line 978
    iput-boolean v0, p0, Ll/۫۫ܺ;->᩸:Z

    return-void
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    .line 983
    iget-boolean v0, p0, Ll/۫۫ܺ;->᩸:Z

    invoke-static {v0}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 984
    iget-object v0, p0, Ll/۫۫ܺ;->᩶:Ljava/util/ListIterator;

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method
