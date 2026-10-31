.class public final Ll/ᩴܶ۠;
.super Ljava/util/AbstractQueue;
.source "A41S"


# instance fields
.field public ۙ:Z

.field public ᩶:Ll/ۖܶ۠;

.field public ᩸:I

.field public ᩹:Ll/ۖܶ۠;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/util/AbstractQueue;-><init>()V

    .line 69
    invoke-virtual {p0}, Ll/ᩴܶ۠;->clear()V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 227
    invoke-virtual {p0, p1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 244
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 245
    invoke-virtual {p0, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 73
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v0

    iput-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    const/4 v0, 0x0

    .line 75
    iput v0, p0, Ll/ᩴܶ۠;->᩸:I

    .line 76
    iput-boolean v0, p0, Ll/ᩴܶ۠;->ۙ:Z

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v0, p1}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 2

    .line 236
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 175
    iget-object v1, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 190
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object v0, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 91
    iget v0, p0, Ll/ᩴܶ۠;->᩸:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 208
    new-instance v0, Ll/ۘܶ۠;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 209
    iget-object v1, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object v1, v0, Ll/ۘܶ۠;->᩸:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 0

    .line 258
    invoke-virtual {p0, p1}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final peek()Ljava/lang/Object;
    .locals 1

    .line 190
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object v0, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    return-object v0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 1

    .line 263
    invoke-virtual {p0}, Ll/ᩴܶ۠;->ܽ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 232
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 250
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 254
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 85
    iget v0, p0, Ll/ᩴܶ۠;->᩸:I

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    .line 85
    iget v0, p0, Ll/ᩴܶ۠;->᩸:I

    .line 184
    new-array v0, v0, [Ljava/lang/Object;

    .line 181
    iget-object v1, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v1, v0}, Ll/ۖܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v0, p1}, Ll/ۖܶ۠;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 127
    invoke-static {p1}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 128
    iget-boolean v0, p0, Ll/ᩴܶ۠;->ۙ:Z

    if-eqz v0, :cond_0

    .line 103
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    .line 106
    iget-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-static {v1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    iput-object v1, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    iput-object v1, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    .line 108
    :goto_0
    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 109
    iget-object v1, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    iget-object v2, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-static {v2}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    iput-object v2, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 110
    iget-object v1, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    iget-object v1, v1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object v1, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    goto :goto_0

    .line 129
    :cond_0
    invoke-static {p1}, Ll/ۖܶ۠;->of(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object p1

    .line 130
    iget-object v0, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    if-eqz v0, :cond_1

    .line 131
    iput-object p1, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 132
    iput-object p1, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    goto :goto_1

    .line 134
    :cond_1
    iput-object p1, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    iput-object p1, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    .line 136
    :goto_1
    iget p1, p0, Ll/ᩴܶ۠;->᩸:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ᩴܶ۠;->᩸:I

    return-void
.end method

.method public final ֫(Ll/ۖܶ۠;)V
    .locals 1

    .line 143
    :goto_0
    invoke-virtual {p1}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    .line 145
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ᩴܶ۠;)V
    .locals 1

    const/4 v0, 0x1

    .line 168
    iput-boolean v0, p1, Ll/ᩴܶ۠;->ۙ:Z

    .line 169
    iget-object p1, p1, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    .line 153
    invoke-virtual {p0, p1}, Ll/ᩴܶ۠;->֫(Ll/ۖܶ۠;)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 82
    iget v0, p0, Ll/ᩴܶ۠;->᩸:I

    return v0
.end method

.method public final ۧ(Ljava/lang/Object;)V
    .locals 2

    .line 118
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    new-instance v1, Ll/ۖܶ۠;

    invoke-direct {v1, p1, v0}, Ll/ۖܶ۠;-><init>(Ljava/lang/Object;Ll/ۖܶ۠;)V

    .line 118
    iput-object v1, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    .line 119
    iget-object p1, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    if-nez p1, :cond_0

    iput-object v1, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    .line 120
    :cond_0
    iget p1, p0, Ll/ᩴܶ۠;->᩸:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ᩴܶ۠;->᩸:I

    return-void
.end method

.method public final ܽ()Ljava/lang/Object;
    .locals 2

    .line 196
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object v1, v0, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    .line 197
    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 198
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    iget-object v0, v0, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    .line 199
    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Ll/ᩴܶ۠;->᩶:Ll/ۖܶ۠;

    .line 200
    :cond_0
    iget v0, p0, Ll/ᩴܶ۠;->᩸:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ᩴܶ۠;->᩸:I

    :cond_1
    return-object v1
.end method

.method public final ܿ()Ll/ۖܶ۠;
    .locals 1

    const/4 v0, 0x1

    .line 168
    iput-boolean v0, p0, Ll/ᩴܶ۠;->ۙ:Z

    .line 169
    iget-object v0, p0, Ll/ᩴܶ۠;->᩹:Ll/ۖܶ۠;

    return-object v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 97
    iget v0, p0, Ll/ᩴܶ۠;->᩸:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
