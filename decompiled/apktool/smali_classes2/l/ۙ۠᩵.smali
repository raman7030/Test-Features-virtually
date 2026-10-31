.class public Ll/ۙ۠᩵;
.super Ljava/lang/Object;
.source "79A7"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/۫۠᩵;


# direct methods
.method public constructor <init>(Ll/۫۠᩵;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۠᩵;->᩹:Ll/۫۠᩵;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 85
    iget v0, p0, Ll/ۙ۠᩵;->᩸:I

    iget-object v1, p0, Ll/ۙ۠᩵;->᩹:Ll/۫۠᩵;

    .line 14
    invoke-virtual {v1}, Ll/᩹۠᩵;->ۧ()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 88
    invoke-virtual {p0}, Ll/ۙ۠᩵;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    iget v0, p0, Ll/ۙ۠᩵;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۙ۠᩵;->᩸:I

    iget-object v1, p0, Ll/ۙ۠᩵;->᩹:Ll/۫۠᩵;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 88
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public nextIndex()I
    .locals 1

    .line 105
    invoke-virtual {p0}, Ll/ۙ۠᩵;->֫()I

    move-result v0

    return v0
.end method

.method public final remove()V
    .locals 2

    .line 0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫()I
    .locals 1

    .line 83
    iget v0, p0, Ll/ۙ۠᩵;->᩸:I

    return v0
.end method

.method public final ۧ(I)V
    .locals 0

    .line 83
    iput p1, p0, Ll/ۙ۠᩵;->᩸:I

    return-void
.end method
