.class public abstract Ll/᩸۟֡;
.super Ljava/lang/Object;
.source "K60O"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final ۗ:I

.field public final ۙ:I

.field public ᩶:I

.field public final ᩸:Ll/۬ۛ֡;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;II)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Ll/᩸۟֡;->᩸:Ll/۬ۛ֡;

    .line 51
    iput p2, p0, Ll/᩸۟֡;->ۗ:I

    .line 52
    iput p2, p0, Ll/᩸۟֡;->᩶:I

    .line 53
    iput p3, p0, Ll/᩸۟֡;->ۙ:I

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 0

    .line 127
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final hasNext()Z
    .locals 2

    .line 71
    iget v0, p0, Ll/᩸۟֡;->᩹:I

    iget v1, p0, Ll/᩸۟֡;->ۙ:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 88
    iget v0, p0, Ll/᩸۟֡;->᩹:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    .line 76
    iget v0, p0, Ll/᩸۟֡;->᩹:I

    iget v1, p0, Ll/᩸۟֡;->ۙ:I

    if-ge v0, v1, :cond_0

    .line 79
    iget-object v0, p0, Ll/᩸۟֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/᩸۟֡;->᩶:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v0

    .line 80
    iget v1, p0, Ll/᩸۟֡;->᩹:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/᩸۟֡;->᩹:I

    invoke-virtual {p0, v0, v1}, Ll/᩸۟֡;->֫(Ll/ᩴۨ֡;I)Ljava/lang/Object;

    move-result-object v1

    .line 81
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۧ()I

    move-result v2

    iput v2, p0, Ll/᩸۟֡;->᩶:I

    .line 82
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۘ()V

    return-object v1

    .line 77
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 107
    iget v0, p0, Ll/᩸۟֡;->᩹:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 4

    .line 93
    iget v0, p0, Ll/᩸۟֡;->᩹:I

    add-int/lit8 v0, v0, -0x1

    .line 94
    iget-object v1, p0, Ll/᩸۟֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/᩸۟֡;->ۗ:I

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object v1

    const/4 v2, 0x0

    .line 95
    iput v2, p0, Ll/᩸۟֡;->᩹:I

    .line 96
    :goto_0
    iget v2, p0, Ll/᩸۟֡;->᩹:I

    if-ge v2, v0, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 97
    iput v3, p0, Ll/᩸۟֡;->᩹:I

    invoke-virtual {p0, v1, v2}, Ll/᩸۟֡;->֫(Ll/ᩴۨ֡;I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v2, 0x1

    .line 99
    iput v0, p0, Ll/᩸۟֡;->᩹:I

    invoke-virtual {p0, v1, v2}, Ll/᩸۟֡;->֫(Ll/ᩴۨ֡;I)Ljava/lang/Object;

    move-result-object v0

    .line 100
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v2

    iput v2, p0, Ll/᩸۟֡;->᩶:I

    .line 101
    invoke-virtual {v1}, Ll/ᩴۨ֡;->ۘ()V

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 112
    iget v0, p0, Ll/᩸۟֡;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 117
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 122
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫()I
    .locals 1

    .line 66
    iget v0, p0, Ll/᩸۟֡;->᩶:I

    return v0
.end method

.method public abstract ֫(Ll/ᩴۨ֡;I)Ljava/lang/Object;
.end method
