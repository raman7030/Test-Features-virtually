.class public final Ll/ۛ᩹ᩴ;
.super Ll/ۨ᩹ᩴ;
.source "N673"


# static fields
.field public static final serialVersionUID:J = 0x120bd9be64a3de1eL


# instance fields
.field public final transient a:Ll/ᩴ᩹ᩴ;


# direct methods
.method public constructor <init>(Ll/ᩴ᩹ᩴ;)V
    .locals 1

    .line 212
    invoke-direct {p0}, Ll/ۨ᩹ᩴ;-><init>()V

    const-string v0, "isoDate"

    .line 213
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 214
    iput-object p1, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 485
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 502
    new-instance v0, Ll/۟᩹ᩴ;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0}, Ll/۟᩹ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 347
    invoke-super {p0, p1}, Ll/ۨ᩹ᩴ;->B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹ᩴ;

    return-object p1
.end method

.method public final C(JLl/ۡۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 398
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹ᩴ;

    return-object p1
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 4

    .line 283
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_6

    .line 284
    sget-object v0, Ll/۫᩹ᩴ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x4

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    .line 296
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 294
    :cond_0
    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result p1

    if-lt p1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    int-to-long v0, v2

    return-wide v0

    .line 292
    :cond_2
    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    .line 302
    :cond_3
    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result p1

    int-to-long v0, p1

    const-wide/16 v2, 0xc

    mul-long v0, v0, v2

    iget-object p1, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 776
    iget-short p1, p1, Ll/ᩴ᩹ᩴ;->b:S

    int-to-long v2, p1

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    return-wide v0

    .line 288
    :cond_4
    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result p1

    if-lt p1, v2, :cond_5

    goto :goto_1

    :cond_5
    rsub-int/lit8 p1, p1, 0x1

    :goto_1
    int-to-long v0, p1

    return-wide v0

    .line 298
    :cond_6
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final H()J
    .locals 2

    .line 439
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->H()J

    move-result-wide v0

    return-wide v0
.end method

.method public final I(Ll/۟ۙᩴ;)Ll/ܰ᩹ᩴ;
    .locals 1

    .line 174
    new-instance v0, Ll/ܽ᩶ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ܽ᩶ᩴ;-><init>(Ll/۬᩹ᩴ;Ll/۟ۙᩴ;)V

    return-object v0
.end method

.method public final K()Ll/ۘ᩶ᩴ;
    .locals 2

    .line 241
    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    sget-object v0, Ll/᩺᩹ᩴ;->ROC:Ll/᩺᩹ᩴ;

    return-object v0

    :cond_0
    sget-object v0, Ll/᩺᩹ᩴ;->BEFORE_ROC:Ll/᩺᩹ᩴ;

    return-object v0
.end method

.method public final N(Ll/۫ۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 357
    invoke-super {p0, p1}, Ll/ۨ᩹ᩴ;->N(Ll/۫ۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹ᩴ;

    return-object p1
.end method

.method public final X(J)Ll/۬᩹ᩴ;
    .locals 1

    .line 388
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴ᩹ᩴ;->l0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩹ᩴ;->c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final Y(J)Ll/۬᩹ᩴ;
    .locals 1

    .line 378
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴ᩹ᩴ;->m0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩹ᩴ;->c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final Z(J)Ll/۬᩹ᩴ;
    .locals 1

    .line 373
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/ᩴ᩹ᩴ;->o0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩹ᩴ;->c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final a()Ll/ۖ᩶ᩴ;
    .locals 1

    .line 228
    sget-object v0, Ll/ۗ᩹ᩴ;->c:Ll/ۗ᩹ᩴ;

    return-object v0
.end method

.method public final a0()I
    .locals 1

    .line 306
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 762
    iget v0, v0, Ll/ᩴ᩹ᩴ;->a:I

    add-int/lit16 v0, v0, -0x777

    return v0
.end method

.method public final b0(JLl/ۤۗᩴ;)Ll/ۛ᩹ᩴ;
    .locals 7

    .line 312
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_7

    .line 313
    move-object v0, p3

    check-cast v0, Ll/ᩴۗᩴ;

    .line 314
    invoke-virtual {p0, v0}, Ll/ۛ᩹ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v1

    cmp-long v3, v1, p1

    if-nez v3, :cond_0

    return-object p0

    .line 317
    :cond_0
    sget-object v1, Ll/۫᩹ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    const/4 v3, 0x7

    const/4 v4, 0x6

    const/4 v5, 0x4

    if-eq v2, v5, :cond_2

    const/4 v6, 0x5

    if-eq v2, v6, :cond_1

    if-eq v2, v4, :cond_2

    if-eq v2, v3, :cond_2

    goto :goto_0

    .line 228
    :cond_1
    sget-object p3, Ll/ۗ᩹ᩴ;->c:Ll/ۗ᩹ᩴ;

    .line 319
    invoke-virtual {p3, v0}, Ll/ۗ᩹ᩴ;->v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p3

    invoke-virtual {p3, p1, p2, v0}, Ll/᩺ۗᩴ;->b(JLl/ۤۗᩴ;)V

    .line 302
    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result p3

    int-to-long v0, p3

    const-wide/16 v2, 0xc

    mul-long v0, v0, v2

    iget-object p3, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    .line 776
    iget-short v2, p3, Ll/ᩴ᩹ᩴ;->b:S

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    sub-long/2addr p1, v0

    .line 378
    invoke-virtual {p3, p1, p2}, Ll/ᩴ᩹ᩴ;->m0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩹ᩴ;->c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 228
    :cond_2
    sget-object v2, Ll/ۗ᩹ᩴ;->c:Ll/ۗ᩹ᩴ;

    .line 324
    invoke-virtual {v2, v0}, Ll/ۗ᩹ᩴ;->v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v2

    invoke-virtual {v2, p1, p2, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result v2

    .line 325
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_4

    if-eq v0, v3, :cond_3

    .line 335
    :goto_0
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ᩴ᩹ᩴ;->q0(JLl/ۤۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩹ᩴ;->c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 331
    :cond_3
    iget-object p1, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result p2

    rsub-int p2, p2, 0x778

    invoke-virtual {p1, p2}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩹ᩴ;->c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 329
    :cond_4
    iget-object p1, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    add-int/lit16 v2, v2, 0x777

    invoke-virtual {p1, v2}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩹ᩴ;->c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 327
    :cond_5
    iget-object p1, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result p2

    const/4 p3, 0x1

    if-lt p2, p3, :cond_6

    add-int/lit16 v2, v2, 0x777

    goto :goto_1

    :cond_6
    rsub-int v2, v2, 0x778

    :goto_1
    invoke-virtual {p1, v2}, Ll/ᩴ᩹ᩴ;->s0(I)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۛ᩹ᩴ;->c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 337
    :cond_7
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹ᩴ;

    return-object p1
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 106
    invoke-virtual {p0, p1, p2, p3}, Ll/ۛ᩹ᩴ;->b0(JLl/ۤۗᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 106
    invoke-virtual {p0, p1, p2, p3}, Ll/ۛ᩹ᩴ;->b0(JLl/ۤۗᩴ;)Ll/ۛ᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Ll/ᩴ᩹ᩴ;)Ll/ۛ᩹ᩴ;
    .locals 1

    .line 422
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {p1, v0}, Ll/ᩴ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ll/ۛ᩹ᩴ;

    invoke-direct {v0, p1}, Ll/ۛ᩹ᩴ;-><init>(Ll/ᩴ᩹ᩴ;)V

    return-object v0
.end method

.method public final d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 393
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹ᩴ;

    return-object p1
.end method

.method public final d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 393
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->d(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹ᩴ;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 460
    :cond_0
    instance-of v0, p1, Ll/ۛ᩹ᩴ;

    if-eqz v0, :cond_1

    .line 461
    check-cast p1, Ll/ۛ᩹ᩴ;

    .line 462
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    iget-object p1, p1, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 228
    sget-object v0, Ll/ۗ᩹ᩴ;->c:Ll/ۗ᩹ᩴ;

    .line 474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0}, Ll/ᩴ᩹ᩴ;->hashCode()I

    move-result v0

    const v1, -0x769fa231

    xor-int/2addr v0, v1

    return v0
.end method

.method public final m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 347
    invoke-super {p0, p1}, Ll/ۨ᩹ᩴ;->B(Ll/ۗۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹ᩴ;

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 4

    .line 260
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_4

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->f(Ll/۬᩹ᩴ;Ll/ۤۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 262
    move-object v0, p1

    check-cast v0, Ll/ᩴۗᩴ;

    .line 263
    sget-object v1, Ll/۫᩹ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 p1, 0x4

    if-eq v1, p1, :cond_0

    .line 228
    sget-object p1, Ll/ۗ᩹ᩴ;->c:Ll/ۗ᩹ᩴ;

    .line 274
    invoke-virtual {p1, v0}, Ll/ۗ᩹ᩴ;->v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 269
    :cond_0
    sget-object p1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 669
    iget-object p1, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 270
    invoke-virtual {p0}, Ll/ۛ᩹ᩴ;->a0()I

    move-result v0

    if-gtz v0, :cond_1

    .line 217
    iget-wide v0, p1, Ll/᩺ۗᩴ;->a:J

    neg-long v0, v0

    const-wide/16 v2, 0x778

    add-long/2addr v0, v2

    goto :goto_0

    .line 253
    :cond_1
    iget-wide v0, p1, Ll/᩺ۗᩴ;->d:J

    const-wide/16 v2, 0x777

    sub-long/2addr v0, v2

    :goto_0
    const-wide/16 v2, 0x1

    .line 271
    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 267
    :cond_2
    iget-object v0, p0, Ll/ۛ᩹ᩴ;->a:Ll/ᩴ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ᩴ᩹ᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 276
    :cond_3
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 276
    throw v0

    .line 278
    :cond_4
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 398
    invoke-super {p0, p1, p2, p3}, Ll/ۨ᩹ᩴ;->w(JLl/ۘۗᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۛ᩹ᩴ;

    return-object p1
.end method
