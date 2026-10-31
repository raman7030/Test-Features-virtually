.class public final Ll/ᩳ᩶ᩴ;
.super Ll/ۙ᩹ᩴ;
.source "N673"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final c:Ll/ᩳ᩶ᩴ;

.field public static final serialVersionUID:J = 0x26862bec417f21daL


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 114
    new-instance v0, Ll/ᩳ᩶ᩴ;

    invoke-direct {v0}, Ll/ᩳ᩶ᩴ;-><init>()V

    sput-object v0, Ll/ᩳ᩶ᩴ;->c:Ll/ᩳ᩶ᩴ;

    .line 127
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 131
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 135
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "BB"

    const-string v4, "BE"

    .line 148
    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "en"

    invoke-virtual {v0, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "th"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "B.B."

    const-string v3, "B.E."

    .line 150
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "\u0e1e.\u0e28."

    const-string v3, "\u0e1b\u0e35\u0e01\u0e48\u0e2d\u0e19\u0e04\u0e23\u0e34\u0e2a\u0e15\u0e4c\u0e01\u0e32\u0e25\u0e17\u0e35\u0e48"

    .line 151
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Before Buddhist"

    const-string v1, "Budhhist Era"

    .line 154
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "\u0e1e\u0e38\u0e17\u0e18\u0e28\u0e31\u0e01\u0e23\u0e32\u0e0a"

    .line 155
    filled-new-array {v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 398
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final E(Ll/ۖۗᩴ;)Ll/۬᩹ᩴ;
    .locals 1

    .line 290
    instance-of v0, p1, Ll/ۜ᩶ᩴ;

    if-eqz v0, :cond_0

    .line 291
    check-cast p1, Ll/ۜ᩶ᩴ;

    return-object p1

    .line 293
    :cond_0
    new-instance v0, Ll/ۜ᩶ᩴ;

    invoke-static {p1}, Ll/ᩴ᩹ᩴ;->X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۜ᩶ᩴ;-><init>(Ll/ᩴ᩹ᩴ;)V

    return-object v0
.end method

.method public final M(III)Ll/۬᩹ᩴ;
    .locals 1

    .line 228
    new-instance v0, Ll/ۜ᩶ᩴ;

    add-int/lit16 p1, p1, -0x21f

    invoke-static {p1, p2, p3}, Ll/ᩴ᩹ᩴ;->h0(III)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۜ᩶ᩴ;-><init>(Ll/ᩴ᩹ᩴ;)V

    return-object v0
.end method

.method public final O(Ljava/util/Map;Ll/ܿۙᩴ;)Ll/۬᩹ᩴ;
    .locals 0

    .line 371
    invoke-super {p0, p1, p2}, Ll/ۙ᩹ᩴ;->O(Ljava/util/Map;Ll/ܿۙᩴ;)Ll/۬᩹ᩴ;

    move-result-object p1

    check-cast p1, Ll/ۜ᩶ᩴ;

    return-object p1
.end method

.method public final P(Ll/ۘ᩹ᩴ;Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;
    .locals 0

    .line 534
    invoke-static {p0, p1, p2}, Ll/ۡ᩶ᩴ;->W(Ll/ۖ᩶ᩴ;Ll/ۘ᩹ᩴ;Ll/ۚ᩹ᩴ;)Ll/ۡ᩶ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final S(J)Z
    .locals 3

    .line 327
    sget-object v0, Ll/۠᩶ᩴ;->c:Ll/۠᩶ᩴ;

    const-wide/16 v1, 0x21f

    sub-long/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Ll/۠᩶ᩴ;->S(J)Z

    move-result p1

    return p1
.end method

.method public final j(J)Ll/۬᩹ᩴ;
    .locals 1

    .line 270
    new-instance v0, Ll/ۜ᩶ᩴ;

    invoke-static {p1, p2}, Ll/ᩴ᩹ᩴ;->i0(J)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۜ᩶ᩴ;-><init>(Ll/ᩴ᩹ᩴ;)V

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "ThaiBuddhist"

    return-object v0
.end method

.method public final m()Ll/۬᩹ᩴ;
    .locals 2

    .line 275
    invoke-static {}, Ll/ۡ᩹ᩴ;->a()Ll/۠᩹ᩴ;

    move-result-object v0

    .line 285
    invoke-static {v0}, Ll/ᩴ᩹ᩴ;->g0(Ll/۠᩹ᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    .line 293
    new-instance v1, Ll/ۜ᩶ᩴ;

    invoke-static {v0}, Ll/ᩴ᩹ᩴ;->X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/ۜ᩶ᩴ;-><init>(Ll/ᩴ᩹ᩴ;)V

    return-object v1
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    const-string v0, "buddhist"

    return-object v0
.end method

.method public final q(II)Ll/۬᩹ᩴ;
    .locals 1

    .line 258
    new-instance v0, Ll/ۜ᩶ᩴ;

    add-int/lit16 p1, p1, -0x21f

    invoke-static {p1, p2}, Ll/ᩴ᩹ᩴ;->j0(II)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ۜ᩶ᩴ;-><init>(Ll/ᩴ᩹ᩴ;)V

    return-object v0
.end method

.method public final v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;
    .locals 12

    .line 351
    sget-object v0, Ll/ۧ᩶ᩴ;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    const-wide/16 v2, 0x21f

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    .line 669
    iget-object p1, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object p1

    .line 361
    :cond_0
    sget-object p1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 669
    iget-object p1, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 217
    iget-wide v0, p1, Ll/᩺ۗᩴ;->a:J

    add-long/2addr v0, v2

    .line 253
    iget-wide v4, p1, Ll/᩺ۗᩴ;->d:J

    add-long/2addr v4, v2

    .line 362
    invoke-static {v0, v1, v4, v5}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 357
    :cond_1
    sget-object p1, Ll/ᩴۗᩴ;->YEAR:Ll/ᩴۗᩴ;

    .line 669
    iget-object p1, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 217
    iget-wide v0, p1, Ll/᩺ۗᩴ;->a:J

    add-long/2addr v0, v2

    neg-long v0, v0

    const-wide/16 v4, 0x1

    add-long v8, v0, v4

    .line 253
    iget-wide v0, p1, Ll/᩺ۗᩴ;->d:J

    add-long v10, v0, v2

    const-wide/16 v6, 0x1

    .line 147
    invoke-static/range {v6 .. v11}, Ll/᩺ۗᩴ;->g(JJJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 353
    :cond_2
    sget-object p1, Ll/ᩴۗᩴ;->PROLEPTIC_MONTH:Ll/ᩴۗᩴ;

    .line 669
    iget-object p1, p1, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 217
    iget-wide v0, p1, Ll/᩺ۗᩴ;->a:J

    const-wide/16 v2, 0x1974

    add-long/2addr v0, v2

    .line 253
    iget-wide v4, p1, Ll/᩺ۗᩴ;->d:J

    add-long/2addr v4, v2

    .line 354
    invoke-static {v0, v1, v4, v5}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 747
    new-instance v0, Ll/۟᩹ᩴ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/۟᩹ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    .line 345
    invoke-static {}, Ll/ۢ᩶ᩴ;->values()[Ll/ۢ᩶ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۚᩴ;->B([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final y(I)Ll/ۘ᩶ᩴ;
    .locals 3

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 142
    sget-object p1, Ll/ۢ᩶ᩴ;->BE:Ll/ۢ᩶ᩴ;

    return-object p1

    .line 144
    :cond_0
    new-instance v0, Ll/ܺ᩹ᩴ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid era: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_1
    sget-object p1, Ll/ۢ᩶ᩴ;->BEFORE_BE:Ll/ۢ᩶ᩴ;

    return-object p1
.end method

.method public final z(Ll/ۘ᩶ᩴ;I)I
    .locals 1

    .line 332
    instance-of v0, p1, Ll/ۢ᩶ᩴ;

    if-eqz v0, :cond_1

    .line 335
    sget-object v0, Ll/ۢ᩶ᩴ;->BE:Ll/ۢ᩶ᩴ;

    if-ne p1, v0, :cond_0

    return p2

    :cond_0
    rsub-int/lit8 p1, p2, 0x1

    return p1

    .line 333
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    const-string p2, "Era must be BuddhistEra"

    invoke-direct {p1, p2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
