.class public final Ll/ܺۡᩴ;
.super Ljava/lang/Object;
.source "11LW"

# interfaces
.implements Ll/ܶۡᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public ᩸:B

.field public final ᩹:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput p1, p0, Ll/ܺۡᩴ;->᩹:I

    return-void
.end method


# virtual methods
.method public final synthetic add(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ۡᩴ;->֫()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic add(Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 120
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ܺۡᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 154
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    iget-byte v0, p0, Ll/ܺۡᩴ;->᩸:B

    if-nez v0, :cond_0

    .line 156
    iget v0, p0, Ll/ܺۡᩴ;->᩹:I

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    const/4 p1, 0x1

    .line 157
    iput-byte p1, p0, Ll/ܺۡᩴ;->᩸:B

    :cond_0
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 130
    iget-byte v0, p0, Ll/ܺۡᩴ;->᩸:B

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 135
    iget-byte v0, p0, Ll/ܺۡᩴ;->᩸:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Integer;
    .locals 1

    .line 103
    invoke-static {p0}, Ll/᩻ۡᩴ;->֫(Ll/ۜۡᩴ;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 31
    invoke-virtual {p0}, Ll/ܺۡᩴ;->next()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 163
    iget-byte v0, p0, Ll/ܺۡᩴ;->᩸:B

    return v0
.end method

.method public final nextInt()I
    .locals 1

    .line 140
    invoke-virtual {p0}, Ll/ܺۡᩴ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 141
    iput-byte v0, p0, Ll/ܺۡᩴ;->᩸:B

    .line 142
    iget v0, p0, Ll/ܺۡᩴ;->᩹:I

    return v0

    .line 140
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 44
    invoke-virtual {p0}, Ll/ܺۡᩴ;->ۖ֫()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 168
    iget-byte v0, p0, Ll/ܺۡᩴ;->᩸:B

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
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic ֫(I)V
    .locals 0

    .line 0
    invoke-static {}, Ll/۠ۡᩴ;->ۧ()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic ֫(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->֫(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method

.method public final ۖ֫()I
    .locals 1

    .line 147
    invoke-virtual {p0}, Ll/ܺۡᩴ;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 148
    iput-byte v0, p0, Ll/ܺۡᩴ;->᩸:B

    .line 149
    iget v0, p0, Ll/ܺۡᩴ;->᩹:I

    return v0

    .line 147
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final synthetic ۧ(Ljava/lang/Integer;)V
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/۠ۡᩴ;->ۧ(Ll/ܶۡᩴ;Ljava/lang/Integer;)V

    return-void
.end method
