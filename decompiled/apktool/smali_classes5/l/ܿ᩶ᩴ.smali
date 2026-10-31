.class public final Ll/ܿ᩶ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/۫ۗᩴ;
.implements Ljava/io/Serializable;


# static fields
.field public static final synthetic e:I = 0x0

.field public static final serialVersionUID:J = 0xd5c8c11b1L


# instance fields
.field public final a:Ll/ۖ᩶ᩴ;

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 0
    sget-object v1, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ll/᩺ۚᩴ;->B([Ljava/lang/Object;)Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/ۖ᩶ᩴ;III)V
    .locals 1

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "chrono"

    .line 129
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    iput-object p1, p0, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    .line 131
    iput p2, p0, Ll/ܿ᩶ᩴ;->b:I

    .line 132
    iput p3, p0, Ll/ܿ᩶ᩴ;->c:I

    .line 133
    iput p4, p0, Ll/ܿ᩶ᩴ;->d:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 380
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Deserialization via serialization delegate"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 321
    :cond_0
    instance-of v1, p1, Ll/ܿ᩶ᩴ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 322
    check-cast p1, Ll/ܿ᩶ᩴ;

    .line 323
    iget v1, p0, Ll/ܿ᩶ᩴ;->b:I

    iget v3, p1, Ll/ܿ᩶ᩴ;->b:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ll/ܿ᩶ᩴ;->c:I

    iget v3, p1, Ll/ܿ᩶ᩴ;->c:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Ll/ܿ᩶ᩴ;->d:I

    iget v3, p1, Ll/ܿ᩶ᩴ;->d:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    iget-object p1, p1, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    .line 324
    invoke-interface {v1, p1}, Ll/ۖ᩶ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 331
    iget v0, p0, Ll/ܿ᩶ᩴ;->b:I

    iget v1, p0, Ll/ܿ᩶ᩴ;->c:I

    const/16 v2, 0x8

    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Ll/ܿ᩶ᩴ;->d:I

    const/16 v2, 0x10

    invoke-static {v0, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result v0

    add-int/2addr v0, v1

    iget-object v1, p0, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    invoke-interface {v1}, Ll/ۖ᩶ᩴ;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final l(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 6

    const-string v0, "temporal"

    .line 308
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 309
    sget-object v0, Ll/ۛۗᩴ;->b:Ll/ۡ֨ᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖ᩶ᩴ;

    if-eqz v0, :cond_1

    .line 310
    iget-object v1, p0, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    invoke-interface {v1, v0}, Ll/ۖ᩶ᩴ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 311
    :cond_0
    new-instance p1, Ll/ܺ᩹ᩴ;

    iget-object v1, p0, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    invoke-interface {v1}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ll/ۖ᩶ᩴ;->k()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Chronology mismatch, expected: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", actual: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1

    .line 257
    :cond_1
    :goto_0
    iget v0, p0, Ll/ܿ᩶ᩴ;->c:I

    if-nez v0, :cond_2

    .line 258
    iget v0, p0, Ll/ܿ᩶ᩴ;->b:I

    if-eqz v0, :cond_6

    int-to-long v0, v0

    .line 259
    sget-object v2, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    goto :goto_2

    .line 246
    :cond_2
    iget-object v0, p0, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    sget-object v1, Ll/ᩴۗᩴ;->MONTH_OF_YEAR:Ll/ᩴۗᩴ;

    invoke-interface {v0, v1}, Ll/ۖ᩶ᩴ;->v(Ll/ᩴۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object v0

    .line 204
    iget-wide v1, v0, Ll/᩺ۗᩴ;->a:J

    iget-wide v3, v0, Ll/᩺ۗᩴ;->b:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_3

    iget-wide v1, v0, Ll/᩺ۗᩴ;->c:J

    iget-wide v3, v0, Ll/᩺ۗᩴ;->d:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_3

    .line 247
    invoke-virtual {v0}, Ll/᩺ۗᩴ;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 253
    iget-wide v1, v0, Ll/᩺ۗᩴ;->d:J

    .line 217
    iget-wide v3, v0, Ll/᩺ۗᩴ;->a:J

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    goto :goto_1

    :cond_3
    const-wide/16 v1, -0x1

    :goto_1
    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_4

    .line 264
    iget v0, p0, Ll/ܿ᩶ᩴ;->b:I

    int-to-long v3, v0

    mul-long v3, v3, v1

    iget v0, p0, Ll/ܿ᩶ᩴ;->c:I

    int-to-long v0, v0

    add-long/2addr v3, v0

    sget-object v0, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    invoke-interface {p1, v3, v4, v0}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    goto :goto_2

    .line 266
    :cond_4
    iget v0, p0, Ll/ܿ᩶ᩴ;->b:I

    if-eqz v0, :cond_5

    int-to-long v0, v0

    .line 267
    sget-object v2, Ll/ۡۗᩴ;->YEARS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 269
    :cond_5
    iget v0, p0, Ll/ܿ᩶ᩴ;->c:I

    int-to-long v0, v0

    sget-object v2, Ll/ۡۗᩴ;->MONTHS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    .line 272
    :cond_6
    :goto_2
    iget v0, p0, Ll/ܿ᩶ᩴ;->d:I

    if-eqz v0, :cond_7

    int-to-long v0, v0

    .line 273
    sget-object v2, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    invoke-interface {p1, v0, v1, v2}, Ll/ܺۗᩴ;->d(JLl/ۘۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    :cond_7
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 163
    iget v0, p0, Ll/ܿ᩶ᩴ;->b:I

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܿ᩶ᩴ;->c:I

    if-nez v0, :cond_0

    iget v0, p0, Ll/ܿ᩶ᩴ;->d:I

    if-nez v0, :cond_0

    .line 157
    iget-object v0, p0, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    .line 338
    invoke-interface {v0}, Ll/ۖ᩶ᩴ;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " P0D"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 340
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    iget-object v1, p0, Ll/ܿ᩶ᩴ;->a:Ll/ۖ᩶ᩴ;

    .line 341
    invoke-interface {v1}, Ll/ۖ᩶ᩴ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " P"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    iget v1, p0, Ll/ܿ᩶ᩴ;->b:I

    if-eqz v1, :cond_1

    .line 343
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x59

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 345
    :cond_1
    iget v1, p0, Ll/ܿ᩶ᩴ;->c:I

    if-eqz v1, :cond_2

    .line 346
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x4d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 348
    :cond_2
    iget v1, p0, Ll/ܿ᩶ᩴ;->d:I

    if-eqz v1, :cond_3

    .line 349
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x44

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 351
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 370
    new-instance v0, Ll/۟᩹ᩴ;

    const/16 v1, 0x9

    invoke-direct {v0, v1, p0}, Ll/۟᩹ᩴ;-><init>(BLjava/lang/Object;)V

    return-object v0
.end method
