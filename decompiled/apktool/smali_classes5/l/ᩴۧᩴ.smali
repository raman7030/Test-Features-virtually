.class public final Ll/ᩴۧᩴ;
.super Ljava/lang/Object;
.source "TCH0"

# interfaces
.implements Ll/ܶۧᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final ᩶:I

.field public final ᩸:[C

.field public ᩹:I


# direct methods
.method public constructor <init>([CI)V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 207
    iput-object p1, p0, Ll/ᩴۧᩴ;->᩸:[C

    .line 209
    iput p2, p0, Ll/ᩴۧᩴ;->᩶:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۧᩴ;->֫(Ll/ܶۧᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 201
    check-cast p1, Ll/᩻ۧᩴ;

    invoke-virtual {p0, p1}, Ll/ᩴۧᩴ;->ۧ(Ll/᩻ۧᩴ;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۡۧᩴ;->֫(Ll/ܺۧᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 214
    iget v0, p0, Ll/ᩴۧᩴ;->᩹:I

    iget v1, p0, Ll/ᩴۧᩴ;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 219
    iget v0, p0, Ll/ᩴۧᩴ;->᩹:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/ۡۧᩴ;->֫(Ll/ܶۧᩴ;)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 269
    iget v0, p0, Ll/ᩴۧᩴ;->᩹:I

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ᩴۧᩴ;->᩺֫()C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 274
    iget v0, p0, Ll/ᩴۧᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final remove()V
    .locals 1

    .line 70
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic set(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۧᩴ;->ۧ(Ll/ܶۧᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final ֡ۧ()C
    .locals 2

    .line 224
    invoke-virtual {p0}, Ll/ᩴۧᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    iget v0, p0, Ll/ᩴۧᩴ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ᩴۧᩴ;->᩹:I

    iget-object v1, p0, Ll/ᩴۧᩴ;->᩸:[C

    aget-char v0, v1, v0

    return v0

    .line 224
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final synthetic ֫(Ljava/lang/Character;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۧᩴ;->֫(Ll/ܶۧᩴ;Ljava/lang/Character;)V

    return-void
.end method

.method public final ۧ(C)V
    .locals 0

    .line 56
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۧ(Ll/᩻ۧᩴ;)V
    .locals 2

    .line 236
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    :goto_0
    iget v0, p0, Ll/ᩴۧᩴ;->᩹:I

    iget v1, p0, Ll/ᩴۧᩴ;->᩶:I

    if-ge v0, v1, :cond_0

    .line 239
    iget-object v1, p0, Ll/ᩴۧᩴ;->᩸:[C

    aget-char v0, v1, v0

    invoke-interface {p1, v0}, Ll/᩻ۧᩴ;->ܽ(C)V

    .line 238
    iget v0, p0, Ll/ᩴۧᩴ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ᩴۧᩴ;->᩹:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final synthetic ܽ(Ljava/lang/Character;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۧᩴ;->ۧ(Ll/ܶۧᩴ;Ljava/lang/Character;)V

    return-void
.end method

.method public final ᩳ(C)V
    .locals 0

    .line 43
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ᩺֫()C
    .locals 2

    .line 230
    invoke-virtual {p0}, Ll/ᩴۧᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    iget v0, p0, Ll/ᩴۧᩴ;->᩹:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ᩴۧᩴ;->᩹:I

    iget-object v1, p0, Ll/ᩴۧᩴ;->᩸:[C

    aget-char v0, v1, v0

    return v0

    .line 230
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
