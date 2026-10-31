.class public final Ll/ۡ᩶ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/᩹᩹ᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x4905b7f16d4b26a7L


# instance fields
.field public final transient a:Ll/ܽ᩶ᩴ;

.field public final transient b:Ll/ᩳ۬ᩴ;

.field public final transient c:Ll/ۚ᩹ᩴ;


# direct methods
.method public constructor <init>(Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;Ll/ܽ᩶ᩴ;)V
    .locals 1

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "dateTime"

    .line 219
    invoke-static {p3, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܽ᩶ᩴ;

    iput-object p3, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    const-string p3, "offset"

    .line 220
    invoke-static {p2, p3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩳ۬ᩴ;

    iput-object p2, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    const-string p2, "zone"

    .line 221
    invoke-static {p1, p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ᩹ᩴ;

    iput-object p1, p0, Ll/ۡ᩶ᩴ;->c:Ll/ۚ᩹ᩴ;

    return-void
.end method

.method public static V(Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;Ll/ܽ᩶ᩴ;)Ll/ۡ᩶ᩴ;
    .locals 11

    const-string v0, "localDateTime"

    .line 136
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "zone"

    .line 137
    invoke-static {p0, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 138
    instance-of v0, p0, Ll/ᩳ۬ᩴ;

    if-eqz v0, :cond_0

    .line 139
    new-instance p1, Ll/ۡ᩶ᩴ;

    move-object v0, p0

    check-cast v0, Ll/ᩳ۬ᩴ;

    invoke-direct {p1, p0, v0, p2}, Ll/ۡ᩶ᩴ;-><init>(Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;Ll/ܽ᩶ᩴ;)V

    return-object p1

    .line 141
    :cond_0
    invoke-virtual {p0}, Ll/ۚ᩹ᩴ;->W()Ll/ܺ۬ᩴ;

    move-result-object v0

    .line 142
    invoke-static {p2}, Ll/᩺ۙᩴ;->W(Ll/ۖۗᩴ;)Ll/᩺ۙᩴ;

    move-result-object v1

    .line 143
    invoke-virtual {v0, v1}, Ll/ܺ۬ᩴ;->f(Ll/᩺ۙᩴ;)Ljava/util/List;

    move-result-object v2

    .line 145
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    .line 146
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ۬ᩴ;

    goto :goto_1

    .line 147
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_3

    .line 684
    invoke-virtual {v0, v1}, Ll/ܺ۬ᩴ;->e(Ll/᩺ۙᩴ;)Ljava/lang/Object;

    move-result-object p1

    .line 685
    instance-of v0, p1, Ll/ۜ۬ᩴ;

    if-eqz v0, :cond_2

    check-cast p1, Ll/ۜ۬ᩴ;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 316
    :goto_0
    iget-object v0, p1, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    .line 474
    iget v0, v0, Ll/ᩳ۬ᩴ;->b:I

    .line 305
    iget-object v1, p1, Ll/ۜ۬ᩴ;->c:Ll/ᩳ۬ᩴ;

    .line 474
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    sub-int/2addr v0, v1

    int-to-long v0, v0

    .line 329
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->ofSeconds(J)Ll/ۖ᩹ᩴ;

    move-result-object v0

    .line 625
    iget-wide v7, v0, Ll/ۖ᩹ᩴ;->a:J

    .line 334
    iget-object v2, p2, Ll/ܽ᩶ᩴ;->a:Ll/۬᩹ᩴ;

    const-wide/16 v5, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v3, 0x0

    move-object v1, p2

    invoke-virtual/range {v1 .. v10}, Ll/ܽ᩶ᩴ;->X(Ll/۬᩹ᩴ;JJJJ)Ll/ܽ᩶ᩴ;

    move-result-object p2

    .line 316
    iget-object p1, p1, Ll/ۜ۬ᩴ;->d:Ll/ᩳ۬ᩴ;

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    .line 152
    invoke-interface {v2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    .line 155
    :cond_4
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳ۬ᩴ;

    :goto_1
    const-string v0, "offset"

    .line 158
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 159
    new-instance v0, Ll/ۡ᩶ᩴ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۡ᩶ᩴ;-><init>(Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;Ll/ܽ᩶ᩴ;)V

    return-object v0
.end method

.method public static W(Ll/ۖ᩶ᩴ;Ll/ۘ᩹ᩴ;Ll/ۚ᩹ᩴ;)Ll/ۡ᩶ᩴ;
    .locals 3

    .line 171
    invoke-virtual {p2}, Ll/ۚ᩹ᩴ;->W()Ll/ܺ۬ᩴ;

    move-result-object v0

    .line 172
    invoke-virtual {v0, p1}, Ll/ܺ۬ᩴ;->d(Ll/ۘ᩹ᩴ;)Ll/ᩳ۬ᩴ;

    move-result-object v0

    const-string v1, "offset"

    .line 173
    invoke-static {v0, v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    invoke-virtual {p1}, Ll/ۘ᩹ᩴ;->getEpochSecond()J

    move-result-wide v1

    invoke-virtual {p1}, Ll/ۘ᩹ᩴ;->getNano()I

    move-result p1

    invoke-static {v1, v2, p1, v0}, Ll/᩺ۙᩴ;->Z(JILl/ᩳ۬ᩴ;)Ll/᩺ۙᩴ;

    move-result-object p1

    .line 175
    invoke-interface {p0, p1}, Ll/ۖ᩶ᩴ;->J(Ll/ۖۗᩴ;)Ll/ܰ᩹ᩴ;

    move-result-object p0

    check-cast p0, Ll/ܽ᩶ᩴ;

    .line 176
    new-instance p1, Ll/ۡ᩶ᩴ;

    invoke-direct {p1, p2, v0, p0}, Ll/ۡ᩶ᩴ;-><init>(Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;Ll/ܽ᩶ᩴ;)V

    return-object p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 347
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static s(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ۡ᩶ᩴ;
    .locals 3

    .line 202
    check-cast p1, Ll/ۡ᩶ᩴ;

    .line 203
    invoke-virtual {p1}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/ۖ᩶ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 204
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    invoke-interface {p0}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object p0

    .line 205
    invoke-virtual {p1}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Chronology mismatch, required: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", actual: "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    .line 337
    new-instance v0, Ll/۟᩹ᩴ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/۟᩹ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final A(Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;
    .locals 2

    .line 267
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    iget-object v1, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-static {p1, v1, v0}, Ll/ۡ᩶ᩴ;->V(Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;Ll/ܽ᩶ᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final C(JLl/ۡۗᩴ;)Ll/ܺۗᩴ;
    .locals 1

    .line 466
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-static {p0, p1, p2, p3}, Ll/ۛۗᩴ;->b(Ll/ܺۗᩴ;JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۡ᩶ᩴ;->s(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final F()Ll/ۚ᩹ᩴ;
    .locals 1

    .line 262
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->c:Ll/ۚ᩹ᩴ;

    return-object v0
.end method

.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 212
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_2

    .line 213
    sget-object v0, Ll/᩻᩶ᩴ;->a:[I

    move-object v1, p1

    check-cast v1, Ll/ᩴۗᩴ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 217
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->t()Ll/ܰ᩹ᩴ;

    move-result-object v0

    check-cast v0, Ll/ܽ᩶ᩴ;

    invoke-virtual {v0, p1}, Ll/ܽ᩶ᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 215
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->h()Ll/ᩳ۬ᩴ;

    move-result-object p1

    .line 474
    iget p1, p1, Ll/ᩳ۬ᩴ;->b:I

    int-to-long v0, p1

    return-wide v0

    .line 214
    :cond_1
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->U()J

    move-result-wide v0

    return-wide v0

    .line 219
    :cond_2
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->i(Ll/᩹᩹ᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic U()J
    .locals 2

    invoke-static {p0}, Ll/᩺ۚᩴ;->k(Ll/᩹᩹ᩴ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final X(JLl/ۘۗᩴ;)Ll/ۡ᩶ᩴ;
    .locals 1

    .line 302
    instance-of v0, p3, Ll/ۡۗᩴ;

    if-eqz v0, :cond_0

    .line 303
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܽ᩶ᩴ;->W(JLl/ۘۗᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    .line 420
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object p2

    .line 190
    invoke-virtual {p1, p0}, Ll/ܽ᩶ᩴ;->s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 420
    invoke-static {p2, p1}, Ll/ۡ᩶ᩴ;->s(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 305
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {p3, p0, p1, p2}, Ll/ۘۗᩴ;->m(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۡ᩶ᩴ;->s(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final a()Ll/ۖ᩶ᩴ;
    .locals 1

    .line 265
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ll/۟ۙᩴ;
    .locals 1

    .line 243
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->t()Ll/ܰ᩹ᩴ;

    move-result-object v0

    check-cast v0, Ll/ܽ᩶ᩴ;

    invoke-virtual {v0}, Ll/ܽ᩶ᩴ;->b()Ll/۟ۙᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 285
    instance-of v0, p3, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_2

    .line 286
    move-object v0, p3

    check-cast v0, Ll/ᩴۗᩴ;

    .line 287
    sget-object v1, Ll/᩷᩶ᩴ;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    .line 294
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܽ᩶ᩴ;->Y(JLl/ۤۗᩴ;)Ll/ܽ᩶ᩴ;

    move-result-object p1

    iget-object p2, p0, Ll/ۡ᩶ᩴ;->c:Ll/ۚ᩹ᩴ;

    iget-object p3, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-static {p2, p3, p1}, Ll/ۡ᩶ᩴ;->V(Ll/ۚ᩹ᩴ;Ll/ᩳ۬ᩴ;Ll/ܽ᩶ᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 669
    :cond_0
    iget-object p3, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {p3, p1, p2, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p1

    .line 290
    invoke-static {p1}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object p1

    .line 291
    iget-object p2, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-static {p2, p1}, Ll/᩺ۚᩴ;->l(Ll/ܰ᩹ᩴ;Ll/ᩳ۬ᩴ;)Ll/ۘ᩹ᩴ;

    move-result-object p1

    .line 291
    iget-object p2, p0, Ll/ۡ᩶ᩴ;->c:Ll/ۚ᩹ᩴ;

    .line 188
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object p3

    invoke-static {p3, p1, p2}, Ll/ۡ᩶ᩴ;->W(Ll/ۖ᩶ᩴ;Ll/ۘ᩹ᩴ;Ll/ۚ᩹ᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 0
    :cond_1
    invoke-static {p0}, Ll/᩺ۚᩴ;->k(Ll/᩹᩹ᩴ;)J

    move-result-wide v0

    sub-long/2addr p1, v0

    .line 288
    sget-object p3, Ll/ۡۗᩴ;->SECONDS:Ll/ۡۗᩴ;

    invoke-virtual {p0, p1, p2, p3}, Ll/ۡ᩶ᩴ;->X(JLl/ۘۗᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1

    .line 296
    :cond_2
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {p3, p0, p1, p2}, Ll/ۤۗᩴ;->G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۡ᩶ᩴ;->s(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 122
    check-cast p1, Ll/᩹᩹ᩴ;

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->d(Ll/᩹᩹ᩴ;Ll/᩹᩹ᩴ;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;
    .locals 0

    .line 104
    invoke-virtual {p0, p1, p2, p3}, Ll/ۡ᩶ᩴ;->X(JLl/ۘۗᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 279
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 370
    :cond_0
    instance-of v1, p1, Ll/᩹᩹ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 371
    check-cast p1, Ll/᩹᩹ᩴ;

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->d(Ll/᩹᩹ᩴ;Ll/᩹᩹ᩴ;)I

    move-result p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final f()Ll/۬᩹ᩴ;
    .locals 1

    .line 231
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->t()Ll/ܰ᩹ᩴ;

    move-result-object v0

    check-cast v0, Ll/ܽ᩶ᩴ;

    invoke-virtual {v0}, Ll/ܽ᩶ᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J
    .locals 1

    const-string v0, "endExclusive"

    .line 311
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 313
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ۖ᩶ᩴ;->p(Ll/ۖۗᩴ;)Ll/᩹᩹ᩴ;

    move-result-object p1

    .line 314
    instance-of v0, p2, Ll/ۡۗᩴ;

    if-eqz v0, :cond_0

    .line 315
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-interface {p1, v0}, Ll/᩹᩹ᩴ;->i(Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;

    move-result-object p1

    .line 316
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    invoke-interface {p1}, Ll/᩹᩹ᩴ;->t()Ll/ܰ᩹ᩴ;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ll/ܽ᩶ᩴ;->g(Ll/ܺۗᩴ;Ll/ۘۗᩴ;)J

    move-result-wide p1

    return-wide p1

    :cond_0
    const-string v0, "unit"

    .line 318
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 319
    invoke-interface {p2, p0, p1}, Ll/ۘۗᩴ;->l(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final h()Ll/ᩳ۬ᩴ;
    .locals 1

    .line 227
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    .line 257
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    .line 378
    invoke-virtual {v0}, Ll/ܽ᩶ᩴ;->hashCode()I

    move-result v0

    .line 227
    iget-object v1, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    .line 736
    iget v1, v1, Ll/ᩳ۬ᩴ;->b:I

    xor-int/2addr v0, v1

    .line 262
    iget-object v1, p0, Ll/ۡ᩶ᩴ;->c:Ll/ۚ᩹ᩴ;

    .line 378
    invoke-virtual {v1}, Ll/ۚ᩹ᩴ;->hashCode()I

    move-result v1

    const/4 v2, 0x3

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final i(Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;
    .locals 2

    const-string v0, "zone"

    .line 272
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 273
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->c:Ll/ۚ᩹ᩴ;

    invoke-virtual {v0, p1}, Ll/ۚ᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    iget-object v1, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-static {v0, v1}, Ll/᩺ۚᩴ;->l(Ll/ܰ᩹ᩴ;Ll/ᩳ۬ᩴ;)Ll/ۘ᩹ᩴ;

    move-result-object v0

    .line 188
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v1

    invoke-static {v1, v0, p1}, Ll/ۡ᩶ᩴ;->W(Ll/ۖ᩶ᩴ;Ll/ۘ᩹ᩴ;Ll/ۚ᩹ᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic l(Ll/ۤۗᩴ;)I
    .locals 0

    invoke-static {p0, p1}, Ll/᩺ۚᩴ;->e(Ll/᩹᩹ᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final m(Ll/ᩴ᩹ᩴ;)Ll/ܺۗᩴ;
    .locals 1

    .line 420
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v0

    .line 190
    invoke-virtual {p1, p0}, Ll/ᩴ᩹ᩴ;->s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 420
    invoke-static {v0, p1}, Ll/ۡ᩶ᩴ;->s(Ll/ۖ᩶ᩴ;Ll/ܺۗᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 1

    .line 187
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_2

    .line 188
    sget-object v0, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 191
    :cond_0
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->t()Ll/ܰ᩹ᩴ;

    move-result-object v0

    check-cast v0, Ll/ܽ᩶ᩴ;

    invoke-virtual {v0, p1}, Ll/ܽ᩶ᩴ;->n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 189
    :cond_1
    :goto_0
    check-cast p1, Ll/ᩴۗᩴ;

    .line 669
    iget-object p1, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object p1

    .line 193
    :cond_2
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final t()Ll/ܰ᩹ᩴ;
    .locals 1

    .line 257
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    return-object v0
.end method

.method public final toInstant()Ll/ۘ᩹ᩴ;
    .locals 4

    .line 538
    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->U()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/ۡ᩶ᩴ;->b()Ll/۟ۙᩴ;

    move-result-object v2

    .line 738
    iget v2, v2, Ll/۟ۙᩴ;->d:I

    int-to-long v2, v2

    .line 538
    invoke-static {v0, v1, v2, v3}, Ll/ۘ᩹ᩴ;->ofEpochSecond(JJ)Ll/ۘ᩹ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 257
    iget-object v0, p0, Ll/ۡ᩶ᩴ;->a:Ll/ܽ᩶ᩴ;

    .line 383
    invoke-virtual {v0}, Ll/ܽ᩶ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    .line 227
    iget-object v1, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    .line 747
    iget-object v1, v1, Ll/ᩳ۬ᩴ;->c:Ljava/lang/String;

    .line 383
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 227
    iget-object v1, p0, Ll/ۡ᩶ᩴ;->b:Ll/ᩳ۬ᩴ;

    .line 262
    iget-object v2, p0, Ll/ۡ᩶ᩴ;->c:Ll/ۚ᩹ᩴ;

    if-eq v1, v2, :cond_0

    .line 385
    invoke-virtual {v2}, Ll/ۚ᩹ᩴ;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
