.class public final Ll/ۗ۠᩵;
.super Ll/ۙ۠᩵;
.source "79A7"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic ᩶:Ll/۫۠᩵;


# direct methods
.method public constructor <init>(Ll/۫۠᩵;I)V
    .locals 3

    .line 96
    iput-object p1, p0, Ll/ۗ۠᩵;->᩶:Ll/۫۠᩵;

    invoke-direct {p0, p1}, Ll/ۙ۠᩵;-><init>(Ll/۫۠᩵;)V

    .line 14
    invoke-virtual {p1}, Ll/᩹۠᩵;->ۧ()I

    move-result p1

    if-ltz p2, :cond_0

    if-gt p2, p1, :cond_0

    .line 100
    invoke-virtual {p0, p2}, Ll/ۙ۠᩵;->ۧ(I)V

    return-void

    .line 124
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index: "

    const-string v2, ", size: "

    .line 0
    invoke-static {v1, p2, p1, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 124
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 103
    invoke-virtual {p0}, Ll/ۙ۠᩵;->֫()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 2

    .line 108
    invoke-virtual {p0}, Ll/ۗ۠᩵;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {p0}, Ll/ۙ۠᩵;->֫()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Ll/ۙ۠᩵;->ۧ(I)V

    invoke-virtual {p0}, Ll/ۙ۠᩵;->֫()I

    move-result v0

    iget-object v1, p0, Ll/ۗ۠᩵;->᩶:Ll/۫۠᩵;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 108
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 112
    invoke-virtual {p0}, Ll/ۙ۠᩵;->֫()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
