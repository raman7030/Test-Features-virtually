.class public final Ll/ܽۙᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۖۗᩴ;


# instance fields
.field public final a:Ljava/util/Map;

.field public b:Ll/ۚ᩹ᩴ;

.field public c:Ll/ۖ᩶ᩴ;

.field public d:Z

.field public e:Ll/ܿۙᩴ;

.field public f:Ll/۬᩹ᩴ;

.field public g:Ll/۟ۙᩴ;

.field public h:Ll/ۜۗᩴ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    .line 157
    sget-object v0, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    iput-object v0, p0, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    return-void
.end method


# virtual methods
.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    const-string v0, "field"

    .line 191
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 192
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 194
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    .line 196
    :cond_0
    iget-object v0, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ll/۬᩹ᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 197
    iget-object v0, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    invoke-interface {v0, p1}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 199
    :cond_1
    iget-object v0, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 200
    iget-object v0, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 202
    :cond_2
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-nez v0, :cond_3

    .line 205
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 203
    :cond_3
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 203
    throw v0
.end method

.method public final T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 2

    .line 211
    sget-object v0, Ll/ۛۗᩴ;->a:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    .line 212
    iget-object p1, p0, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    return-object p1

    .line 213
    :cond_0
    sget-object v0, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_1

    .line 214
    iget-object p1, p0, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    return-object p1

    .line 215
    :cond_1
    sget-object v0, Ll/ۛۗᩴ;->f:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_2

    .line 216
    iget-object p1, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz p1, :cond_8

    invoke-static {p1}, Ll/ᩴ᩹ᩴ;->X(Ll/ۖۗᩴ;)Ll/ᩴ᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 217
    :cond_2
    sget-object v0, Ll/ۛۗᩴ;->g:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_3

    .line 218
    iget-object p1, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    return-object p1

    .line 219
    :cond_3
    sget-object v0, Ll/ۛۗᩴ;->d:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_6

    .line 220
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_4

    .line 222
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result p1

    invoke-static {p1}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object p1

    return-object p1

    .line 224
    :cond_4
    iget-object v0, p0, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    instance-of v1, v0, Ll/ᩳ۬ᩴ;

    if-eqz v1, :cond_5

    return-object v0

    .line 227
    :cond_5
    invoke-virtual {p1, p0}, Ll/ۡ֨ᩴ;->h(Ll/ۖۗᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 228
    :cond_6
    sget-object v0, Ll/ۛۗᩴ;->e:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_7

    .line 229
    invoke-virtual {p1, p0}, Ll/ۡ֨ᩴ;->h(Ll/ۖۗᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 230
    :cond_7
    sget-object v0, Ll/ۛۗᩴ;->c:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_9

    :cond_8
    const/4 p1, 0x0

    return-object p1

    .line 235
    :cond_9
    invoke-virtual {p1, p0}, Ll/ۡ֨ᩴ;->h(Ll/ۖۗᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz v0, :cond_0

    .line 182
    invoke-interface {v0, p1}, Ll/۬᩹ᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-eqz v0, :cond_1

    .line 183
    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 186
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-nez v0, :cond_2

    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final j(Ll/ۖۗᩴ;)V
    .locals 8

    .line 645
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 646
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 647
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤۗᩴ;

    .line 648
    invoke-interface {p1, v2}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 651
    :try_start_0
    invoke-interface {p1, v2}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 655
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    .line 660
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 657
    :cond_1
    new-instance v0, Ll/ܺ᩹ᩴ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "Conflict found: Field "

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " differs from "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " derived from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    nop

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final k()V
    .locals 2

    .line 338
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 339
    iget-object v0, p0, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    if-eqz v0, :cond_0

    .line 340
    invoke-virtual {p0, v0}, Ll/ܽۙᩴ;->o(Ll/ۚ᩹ᩴ;)V

    return-void

    .line 342
    :cond_0
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->OFFSET_SECONDS:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 344
    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ll/ᩳ۬ᩴ;->e0(I)Ll/ᩳ۬ᩴ;

    move-result-object v0

    .line 345
    invoke-virtual {p0, v0}, Ll/ܽۙᩴ;->o(Ll/ۚ᩹ᩴ;)V

    :cond_1
    return-void
.end method

.method public final synthetic l(Ll/ۤۗᩴ;)I
    .locals 0

    invoke-static {p0, p1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final synthetic n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 0

    invoke-static {p0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ll/ۚ᩹ᩴ;)V
    .locals 4

    .line 352
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->INSTANT_SECONDS:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/ۘ᩹ᩴ;->ofEpochSecond(J)Ll/ۘ᩹ᩴ;

    move-result-object v0

    .line 353
    iget-object v2, p0, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    invoke-interface {v2, v0, p1}, Ll/ۖ᩶ᩴ;->P(Ll/ۘ᩹ᩴ;Ll/ۚ᩹ᩴ;)Ll/᩹᩹ᩴ;

    move-result-object p1

    .line 354
    invoke-interface {p1}, Ll/᩹᩹ᩴ;->f()Ll/۬᩹ᩴ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܽۙᩴ;->v(Ll/۬᩹ᩴ;)V

    .line 355
    sget-object v0, Ll/ᩴۗᩴ;->SECOND_OF_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p1}, Ll/᩹᩹ᩴ;->b()Ll/۟ۙᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۟ۙᩴ;->i0()I

    move-result p1

    int-to-long v2, p1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, v1, v0, p1}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    return-void
.end method

.method public final p(JJJJ)V
    .locals 3

    .line 546
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v1, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const-wide v0, 0x34630b8a000L

    .line 547
    invoke-static {p1, p2, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p1

    const-wide v0, 0xdf8475800L

    .line 548
    invoke-static {p3, p4, v0, v1}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    const-wide/32 p3, 0x3b9aca00

    .line 549
    invoke-static {p5, p6, p3, p4}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    .line 550
    invoke-static {p1, p2, p7, p8}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide p1

    const-wide p3, 0x4e94914f0000L

    .line 551
    invoke-static {p1, p2, p3, p4}, Ll/᩺ۚᩴ;->z(JJ)J

    move-result-wide p5

    long-to-int p6, p5

    .line 552
    invoke-static {p1, p2, p3, p4}, Ll/᩺ۚᩴ;->O(JJ)J

    move-result-wide p1

    .line 553
    invoke-static {p1, p2}, Ll/۟ۙᩴ;->a0(J)Ll/۟ۙᩴ;

    move-result-object p1

    .line 219
    invoke-static {v2, v2, p6}, Ll/ۜۗᩴ;->a(III)Ll/ۜۗᩴ;

    move-result-object p2

    .line 553
    invoke-virtual {p0, p1, p2}, Ll/ܽۙᩴ;->s(Ll/۟ۙᩴ;Ll/ۜۗᩴ;)V

    return-void

    .line 555
    :cond_0
    sget-object v0, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    .line 669
    iget-object v1, v0, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v1, p3, p4, v0}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p3

    .line 556
    sget-object p4, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    .line 669
    iget-object v0, p4, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {v0, p7, p8, p4}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p4

    .line 558
    iget-object p7, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object p8, Ll/ܿۙᩴ;->SMART:Ll/ܿۙᩴ;

    if-ne p7, p8, :cond_1

    const-wide/16 p7, 0x18

    cmp-long v0, p1, p7

    if-nez v0, :cond_1

    if-nez p3, :cond_1

    const-wide/16 p7, 0x0

    cmp-long v0, p5, p7

    if-nez v0, :cond_1

    if-nez p4, :cond_1

    .line 559
    sget-object p1, Ll/۟ۙᩴ;->g:Ll/۟ۙᩴ;

    const/4 p2, 0x1

    .line 219
    invoke-static {v2, v2, p2}, Ll/ۜۗᩴ;->a(III)Ll/ۜۗᩴ;

    move-result-object p2

    .line 559
    invoke-virtual {p0, p1, p2}, Ll/ܽۙᩴ;->s(Ll/۟ۙᩴ;Ll/ۜۗᩴ;)V

    return-void

    .line 561
    :cond_1
    sget-object p7, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    .line 669
    iget-object p8, p7, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {p8, p1, p2, p7}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p1

    .line 562
    sget-object p2, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    .line 669
    iget-object p7, p2, Ll/ᩴۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 732
    invoke-virtual {p7, p5, p6, p2}, Ll/᩺ۗᩴ;->a(JLl/ۤۗᩴ;)I

    move-result p2

    .line 563
    invoke-static {p1, p3, p2, p4}, Ll/۟ۙᩴ;->Z(IIII)Ll/۟ۙᩴ;

    move-result-object p1

    sget-object p2, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    invoke-virtual {p0, p1, p2}, Ll/ܽۙᩴ;->s(Ll/۟ۙᩴ;Ll/ۜۗᩴ;)V

    return-void
.end method

.method public final q()V
    .locals 14

    .line 379
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->CLOCK_HOUR_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_3

    .line 381
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 382
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v6, Ll/ܿۙᩴ;->STRICT:Ll/ܿۙᩴ;

    if-eq v0, v6, :cond_0

    sget-object v6, Ll/ܿۙᩴ;->SMART:Ll/ܿۙᩴ;

    if-ne v0, v6, :cond_1

    cmp-long v0, v4, v2

    if-eqz v0, :cond_1

    .line 383
    :cond_0
    invoke-virtual {v1, v4, v5}, Ll/ᩴۗᩴ;->T(J)V

    .line 385
    :cond_1
    sget-object v0, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    const-wide/16 v6, 0x18

    cmp-long v8, v4, v6

    if-nez v8, :cond_2

    move-wide v4, v2

    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p0, v1, v0, v4}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 387
    :cond_3
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->CLOCK_HOUR_OF_AMPM:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-wide/16 v4, 0xc

    if-eqz v0, :cond_7

    .line 389
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 390
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v8, Ll/ܿۙᩴ;->STRICT:Ll/ܿۙᩴ;

    if-eq v0, v8, :cond_4

    sget-object v8, Ll/ܿۙᩴ;->SMART:Ll/ܿۙᩴ;

    if-ne v0, v8, :cond_5

    cmp-long v0, v6, v2

    if-eqz v0, :cond_5

    .line 391
    :cond_4
    invoke-virtual {v1, v6, v7}, Ll/ᩴۗᩴ;->T(J)V

    .line 393
    :cond_5
    sget-object v0, Ll/ᩴۗᩴ;->HOUR_OF_AMPM:Ll/ᩴۗᩴ;

    cmp-long v8, v6, v4

    if-nez v8, :cond_6

    goto :goto_0

    :cond_6
    move-wide v2, v6

    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p0, v1, v0, v2}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 395
    :cond_7
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->AMPM_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v2, Ll/ᩴۗᩴ;->HOUR_OF_AMPM:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 396
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 397
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 398
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v3, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-ne v0, v3, :cond_8

    .line 399
    sget-object v0, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    const/16 v2, 0xc

    int-to-long v2, v2

    .line 0
    invoke-static {v6, v7, v2, v3}, Ll/᩺ۚᩴ;->Q(JJ)J

    move-result-wide v2

    .line 399
    invoke-static {v2, v3, v8, v9}, Ll/᩺ۚᩴ;->P(JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p0, v1, v0, v2}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    goto :goto_1

    .line 401
    :cond_8
    invoke-virtual {v1, v6, v7}, Ll/ᩴۗᩴ;->T(J)V

    .line 402
    invoke-virtual {v2, v6, v7}, Ll/ᩴۗᩴ;->T(J)V

    .line 403
    sget-object v0, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    mul-long v6, v6, v4

    add-long/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p0, v1, v0, v2}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 406
    :cond_9
    :goto_1
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->NANO_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-wide/16 v2, 0x3c

    if-eqz v0, :cond_b

    .line 407
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    .line 408
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v6, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-eq v0, v6, :cond_a

    .line 409
    invoke-virtual {v1, v4, v5}, Ll/ᩴۗᩴ;->T(J)V

    .line 411
    :cond_a
    sget-object v0, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    const-wide v6, 0x34630b8a000L

    div-long v6, v4, v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p0, v1, v0, v6}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 412
    sget-object v0, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    const-wide v6, 0xdf8475800L

    div-long v6, v4, v6

    rem-long/2addr v6, v2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p0, v1, v0, v6}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 413
    sget-object v0, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    const-wide/32 v6, 0x3b9aca00

    div-long v8, v4, v6

    rem-long/2addr v8, v2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {p0, v1, v0, v8}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 414
    sget-object v0, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    rem-long/2addr v4, v6

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p0, v1, v0, v4}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 416
    :cond_b
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->MICRO_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-wide/32 v4, 0xf4240

    if-eqz v0, :cond_d

    .line 417
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 418
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v8, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-eq v0, v8, :cond_c

    .line 419
    invoke-virtual {v1, v6, v7}, Ll/ᩴۗᩴ;->T(J)V

    .line 421
    :cond_c
    sget-object v0, Ll/ᩴۗᩴ;->SECOND_OF_DAY:Ll/ᩴۗᩴ;

    div-long v8, v6, v4

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {p0, v1, v0, v8}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 422
    sget-object v0, Ll/ᩴۗᩴ;->MICRO_OF_SECOND:Ll/ᩴۗᩴ;

    rem-long/2addr v6, v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p0, v1, v0, v6}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 424
    :cond_d
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->MILLI_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-wide/16 v6, 0x3e8

    if-eqz v0, :cond_f

    .line 425
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 426
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v10, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-eq v0, v10, :cond_e

    .line 427
    invoke-virtual {v1, v8, v9}, Ll/ᩴۗᩴ;->T(J)V

    .line 429
    :cond_e
    sget-object v0, Ll/ᩴۗᩴ;->SECOND_OF_DAY:Ll/ᩴۗᩴ;

    div-long v10, v8, v6

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {p0, v1, v0, v10}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 430
    sget-object v0, Ll/ᩴۗᩴ;->MILLI_OF_SECOND:Ll/ᩴۗᩴ;

    rem-long/2addr v8, v6

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {p0, v1, v0, v8}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 432
    :cond_f
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->SECOND_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 433
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 434
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v10, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-eq v0, v10, :cond_10

    .line 435
    invoke-virtual {v1, v8, v9}, Ll/ᩴۗᩴ;->T(J)V

    .line 437
    :cond_10
    sget-object v0, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    const-wide/16 v10, 0xe10

    div-long v10, v8, v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {p0, v1, v0, v10}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 438
    sget-object v0, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    div-long v10, v8, v2

    rem-long/2addr v10, v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {p0, v1, v0, v10}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 439
    sget-object v0, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    rem-long/2addr v8, v2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {p0, v1, v0, v8}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 441
    :cond_11
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->MINUTE_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 442
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 443
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v10, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-eq v0, v10, :cond_12

    .line 444
    invoke-virtual {v1, v8, v9}, Ll/ᩴۗᩴ;->T(J)V

    .line 446
    :cond_12
    sget-object v0, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    div-long v10, v8, v2

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {p0, v1, v0, v10}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 447
    sget-object v0, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    rem-long/2addr v8, v2

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p0, v1, v0, v2}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 451
    :cond_13
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v1, Ll/ᩴۗᩴ;->NANO_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 452
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    .line 453
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    sget-object v8, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    if-eq v0, v8, :cond_14

    .line 454
    invoke-virtual {v1, v2, v3}, Ll/ᩴۗᩴ;->T(J)V

    .line 456
    :cond_14
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v9, Ll/ᩴۗᩴ;->MICRO_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 457
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v9}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 458
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    if-eq v0, v8, :cond_15

    .line 459
    invoke-virtual {v9, v10, v11}, Ll/ᩴۗᩴ;->T(J)V

    :cond_15
    mul-long v10, v10, v6

    .line 461
    rem-long/2addr v2, v6

    add-long/2addr v2, v10

    .line 462
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v9, v1, v0}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 464
    :cond_16
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v6, Ll/ᩴۗᩴ;->MILLI_OF_SECOND:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    .line 465
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 466
    iget-object v0, p0, Ll/ܽۙᩴ;->e:Ll/ܿۙᩴ;

    if-eq v0, v8, :cond_17

    .line 467
    invoke-virtual {v6, v9, v10}, Ll/ᩴۗᩴ;->T(J)V

    :cond_17
    mul-long v9, v9, v4

    .line 469
    rem-long/2addr v2, v4

    add-long/2addr v2, v9

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v6, v1, v0}, Ll/ܽۙᩴ;->x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V

    .line 474
    :cond_18
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v2, Ll/ᩴۗᩴ;->HOUR_OF_DAY:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v3, Ll/ᩴۗᩴ;->MINUTE_OF_HOUR:Ll/ᩴۗᩴ;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    sget-object v4, Ll/ᩴۗᩴ;->SECOND_OF_MINUTE:Ll/ᩴۗᩴ;

    .line 475
    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 476
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 477
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 478
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    .line 479
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    move-object v5, p0

    .line 480
    invoke-virtual/range {v5 .. v13}, Ll/ܽۙᩴ;->p(JJJJ)V

    :cond_19
    return-void
.end method

.method public final s(Ll/۟ۙᩴ;Ll/ۜۗᩴ;)V
    .locals 4

    .line 614
    iget-object v0, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-eqz v0, :cond_4

    .line 615
    invoke-virtual {v0, p1}, Ll/۟ۙᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, " "

    if-eqz v0, :cond_3

    .line 618
    iget-object p1, p0, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    sget-object v0, Ll/ۜۗᩴ;->d:Ll/ۜۗᩴ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne p2, v0, :cond_1

    goto :goto_0

    .line 618
    :cond_1
    iget-object p1, p0, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    invoke-virtual {p1, p2}, Ll/ۜۗᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 621
    :goto_0
    iput-object p2, p0, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    return-void

    .line 619
    :cond_2
    new-instance p1, Ll/ܺ᩹ᩴ;

    iget-object v0, p0, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Conflict found: Fields resolved to different excess periods: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1

    .line 616
    :cond_3
    new-instance p2, Ll/ܺ᩹ᩴ;

    iget-object v0, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Conflict found: Fields resolved to different times: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p2

    .line 624
    :cond_4
    iput-object p1, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    .line 625
    iput-object p2, p0, Ll/ܽۙᩴ;->h:Ll/ۜۗᩴ;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 668
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 669
    iget-object v1, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 670
    iget-object v2, p0, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    if-eqz v2, :cond_0

    .line 671
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܽۙᩴ;->b:Ll/ۚ᩹ᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 673
    :cond_0
    iget-object v1, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-eqz v1, :cond_3

    :cond_1
    const-string v1, " resolved to "

    .line 674
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    iget-object v1, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz v1, :cond_2

    .line 676
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 677
    iget-object v1, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    if-eqz v1, :cond_3

    const/16 v1, 0x54

    .line 678
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 681
    :cond_2
    iget-object v1, p0, Ll/ܽۙᩴ;->g:Ll/۟ۙᩴ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 684
    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(Ll/۬᩹ᩴ;)V
    .locals 4

    .line 364
    iget-object v0, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_3

    .line 365
    invoke-interface {v0, p1}, Ll/۬᩹ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 366
    :cond_0
    new-instance v0, Ll/ܺ᩹ᩴ;

    iget-object v1, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Conflict found: Fields resolved to two different dates: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    if-eqz p1, :cond_3

    .line 369
    iget-object v0, p0, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    invoke-interface {p1}, Ll/۬᩹ᩴ;->a()Ll/ۖ᩶ᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ۖ᩶ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 372
    iput-object p1, p0, Ll/ܽۙᩴ;->f:Ll/۬᩹ᩴ;

    return-void

    .line 370
    :cond_2
    new-instance p1, Ll/ܺ᩹ᩴ;

    iget-object v0, p0, Ll/ܽۙᩴ;->c:Ll/ۖ᩶ᩴ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ChronoLocalDate must use the effective parsed chronology: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final x(Ll/ۤۗᩴ;Ll/ᩴۗᩴ;Ljava/lang/Long;)V
    .locals 6

    .line 327
    iget-object v0, p0, Ll/ܽۙᩴ;->a:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    .line 328
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    goto :goto_0

    .line 329
    :cond_0
    new-instance v1, Ll/ܺ᩹ᩴ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Conflict found: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " differs from "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " while resolving  "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return-void
.end method
