.class public abstract Ll/ۧ᩹ܺ;
.super Ljava/lang/Object;
.source "E3QI"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public ۗ:Ll/ܿ᩶ܺ;

.field public ۙ:Ll/᩻᩶ܺ;

.field public final synthetic ۤ:Ll/ܳ᩶ܺ;

.field public ۫:I

.field public ۬:I

.field public ᩶:Ll/ܿ᩶ܺ;

.field public ᩸:Ll/ۘ᩹ܺ;

.field public ᩹:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method public constructor <init>(Ll/ܳ᩶ܺ;)V
    .locals 0

    .line 4216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ᩹ܺ;->ۤ:Ll/ܳ᩶ܺ;

    .line 4217
    iget-object p1, p1, Ll/ܳ᩶ܺ;->ᩳ֫:[Ll/ۘ᩹ܺ;

    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ۧ᩹ܺ;->۬:I

    const/4 p1, -0x1

    .line 4218
    iput p1, p0, Ll/ۧ᩹ܺ;->۫:I

    .line 4219
    invoke-virtual {p0}, Ll/ۧ᩹ܺ;->֫()V

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 4295
    iget-object v0, p0, Ll/ۧ᩹ܺ;->ۗ:Ll/ܿ᩶ܺ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 4387
    invoke-virtual {p0}, Ll/ۧ᩹ܺ;->ۧ()Ll/ܿ᩶ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 4309
    iget-object v0, p0, Ll/ۧ᩹ܺ;->᩶:Ll/ܿ᩶ܺ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ۘܶܺ;->ۧ(Z)V

    .line 4310
    iget-object v0, p0, Ll/ۧ᩹ܺ;->᩶:Ll/ܿ᩶ܺ;

    .line 4346
    iget-object v0, v0, Ll/ܿ᩶ܺ;->᩸:Ljava/lang/Object;

    .line 4310
    iget-object v1, p0, Ll/ۧ᩹ܺ;->ۤ:Ll/ܳ᩶ܺ;

    invoke-virtual {v1, v0}, Ll/ܳ᩶ܺ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4311
    iput-object v0, p0, Ll/ۧ᩹ܺ;->᩶:Ll/ܿ᩶ܺ;

    return-void
.end method

.method public final ֫()V
    .locals 3

    const/4 v0, 0x0

    .line 4226
    iput-object v0, p0, Ll/ۧ᩹ܺ;->ۗ:Ll/ܿ᩶ܺ;

    .line 4228
    invoke-virtual {p0}, Ll/ۧ᩹ܺ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 4232
    :cond_0
    invoke-virtual {p0}, Ll/ۧ᩹ܺ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4236
    :cond_1
    iget v0, p0, Ll/ۧ᩹ܺ;->۬:I

    if-ltz v0, :cond_2

    .line 4237
    iget-object v1, p0, Ll/ۧ᩹ܺ;->ۤ:Ll/ܳ᩶ܺ;

    iget-object v1, v1, Ll/ܳ᩶ܺ;->ᩳ֫:[Ll/ۘ᩹ܺ;

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Ll/ۧ᩹ܺ;->۬:I

    aget-object v0, v1, v0

    iput-object v0, p0, Ll/ۧ᩹ܺ;->᩸:Ll/ۘ᩹ܺ;

    .line 4238
    iget v0, v0, Ll/ۘ᩹ܺ;->᩹:I

    if-eqz v0, :cond_1

    .line 4239
    iget-object v0, p0, Ll/ۧ᩹ܺ;->᩸:Ll/ۘ᩹ܺ;

    iget-object v0, v0, Ll/ۘ᩹ܺ;->ۨ:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput-object v0, p0, Ll/ۧ᩹ܺ;->᩹:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    .line 4240
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۧ᩹ܺ;->۫:I

    .line 4241
    invoke-virtual {p0}, Ll/ۧ᩹ܺ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Ll/᩻᩶ܺ;)Z
    .locals 6

    .line 4278
    iget-object v0, p0, Ll/ۧ᩹ܺ;->ۤ:Ll/ܳ᩶ܺ;

    :try_start_0
    iget-object v1, v0, Ll/ܳ᩶ܺ;->ܿ֫:Ll/ᩳ᩸ܺ;

    invoke-virtual {v1}, Ll/ᩳ᩸ܺ;->֫()J

    move-result-wide v1

    .line 4279
    invoke-interface {p1}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v3

    .line 1772
    invoke-interface {p1}, Ll/᩻᩶ܺ;->getKey()Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    goto :goto_0

    .line 1775
    :cond_0
    invoke-interface {p1}, Ll/᩻᩶ܺ;->ܿ()Ll/ۗ᩹ܺ;

    move-result-object v4

    invoke-interface {v4}, Ll/ۗ᩹ܺ;->get()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 1780
    :cond_1
    invoke-virtual {v0, p1, v1, v2}, Ll/ܳ᩶ܺ;->֫(Ll/᩻᩶ܺ;J)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move-object v5, v4

    :goto_0
    if-eqz v5, :cond_3

    .line 4282
    new-instance p1, Ll/ܿ᩶ܺ;

    invoke-direct {p1, v0, v3, v5}, Ll/ܿ᩶ܺ;-><init>(Ll/ܳ᩶ܺ;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ll/ۧ᩹ܺ;->ۗ:Ll/ܿ᩶ܺ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4289
    iget-object p1, p0, Ll/ۧ᩹ܺ;->᩸:Ll/ۘ᩹ܺ;

    invoke-virtual {p1}, Ll/ۘ᩹ܺ;->ᩳ()V

    const/4 p1, 0x1

    return p1

    :cond_3
    iget-object p1, p0, Ll/ۧ᩹ܺ;->᩸:Ll/ۘ᩹ܺ;

    invoke-virtual {p1}, Ll/ۘ᩹ܺ;->ᩳ()V

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Ll/ۧ᩹ܺ;->᩸:Ll/ۘ᩹ܺ;

    invoke-virtual {v0}, Ll/ۘ᩹ܺ;->ᩳ()V

    .line 4290
    throw p1
.end method

.method public final ۧ()Ll/ܿ᩶ܺ;
    .locals 1

    .line 4299
    iget-object v0, p0, Ll/ۧ᩹ܺ;->ۗ:Ll/ܿ᩶ܺ;

    if-eqz v0, :cond_0

    .line 4302
    iput-object v0, p0, Ll/ۧ᩹ܺ;->᩶:Ll/ܿ᩶ܺ;

    .line 4303
    invoke-virtual {p0}, Ll/ۧ᩹ܺ;->֫()V

    .line 4304
    iget-object v0, p0, Ll/ۧ᩹ܺ;->᩶:Ll/ܿ᩶ܺ;

    return-object v0

    .line 4300
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 4250
    iget-object v0, p0, Ll/ۧ᩹ܺ;->ۙ:Ll/᩻᩶ܺ;

    if-eqz v0, :cond_1

    .line 4251
    :goto_0
    invoke-interface {v0}, Ll/᩻᩶ܺ;->getNext()Ll/᩻᩶ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۧ᩹ܺ;->ۙ:Ll/᩻᩶ܺ;

    iget-object v0, p0, Ll/ۧ᩹ܺ;->ۙ:Ll/᩻᩶ܺ;

    if-eqz v0, :cond_1

    .line 4252
    invoke-virtual {p0, v0}, Ll/ۧ᩹ܺ;->֫(Ll/᩻᩶ܺ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 4251
    :cond_0
    iget-object v0, p0, Ll/ۧ᩹ܺ;->ۙ:Ll/᩻᩶ܺ;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 3

    .line 4262
    :cond_0
    iget v0, p0, Ll/ۧ᩹ܺ;->۫:I

    if-ltz v0, :cond_2

    .line 4263
    iget-object v1, p0, Ll/ۧ᩹ܺ;->᩹:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Ll/ۧ᩹ܺ;->۫:I

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩶ܺ;

    iput-object v0, p0, Ll/ۧ᩹ܺ;->ۙ:Ll/᩻᩶ܺ;

    if-eqz v0, :cond_0

    .line 4264
    invoke-virtual {p0, v0}, Ll/ۧ᩹ܺ;->֫(Ll/᩻᩶ܺ;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۧ᩹ܺ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method
