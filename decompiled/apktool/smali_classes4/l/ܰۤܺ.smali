.class public final Ll/ܰۤܺ;
.super Ljava/lang/Object;
.source "X4TD"

# interfaces
.implements Ll/ᩴܶܺ;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J

.field public static final ۙ:Ll/ܰۤܺ;

.field public static final synthetic ᩶:I


# instance fields
.field public final ᩸:Ll/ۘۗܺ;

.field public final ᩹:Ll/ۘۗܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 273
    new-instance v0, Ll/ܰۤܺ;

    .line 117
    invoke-static {}, Ll/ܺۗܺ;->᩻()Ll/ܺۗܺ;

    move-result-object v1

    .line 224
    invoke-static {}, Ll/ۢۗܺ;->᩻()Ll/ۢۗܺ;

    move-result-object v2

    .line 273
    invoke-direct {v0, v1, v2}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    sput-object v0, Ll/ܰۤܺ;->ۙ:Ll/ܰۤܺ;

    return-void
.end method

.method public constructor <init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V
    .locals 4

    .line 327
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    iput-object p1, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    .line 902
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    iput-object p2, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 330
    invoke-virtual {p1, p2}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v0

    if-gtz v0, :cond_0

    .line 224
    invoke-static {}, Ll/ۢۗܺ;->᩻()Ll/ۢۗܺ;

    move-result-object v0

    if-eq p1, v0, :cond_0

    .line 117
    invoke-static {}, Ll/ܺۗܺ;->᩻()Ll/ܺۗܺ;

    move-result-object v0

    if-eq p2, v0, :cond_0

    return-void

    .line 333
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid range: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 676
    invoke-virtual {p1, v2}, Ll/ۘۗܺ;->֫(Ljava/lang/StringBuilder;)V

    const-string p1, ".."

    .line 677
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    invoke-virtual {p2, v2}, Ll/ۘۗܺ;->ۧ(Ljava/lang/StringBuilder;)V

    .line 679
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 333
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;
    .locals 1

    .line 264
    sget-object v0, Ll/ۨۤܺ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 268
    invoke-static {p0}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Comparable;)Ll/ܰۤܺ;

    move-result-object p0

    return-object p0

    .line 270
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 245
    :cond_1
    invoke-static {p0}, Ll/ۘۗܺ;->ۧ(Ljava/lang/Comparable;)Ll/ۡۗܺ;

    move-result-object p0

    .line 224
    invoke-static {}, Ll/ۢۗܺ;->᩻()Ll/ۢۗܺ;

    move-result-object p1

    .line 133
    new-instance v0, Ll/ܰۤܺ;

    invoke-direct {v0, p0, p1}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Comparable;Ll/ۘۙܺ;Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    sget-object v0, Ll/ۘۙܺ;->ۙ:Ll/ۘۙܺ;

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Ll/ۘۗܺ;->ۧ(Ljava/lang/Comparable;)Ll/ۡۗܺ;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ll/ۘۗܺ;->ܽ(Ljava/lang/Comparable;)Ll/ۖۗܺ;

    move-result-object p0

    :goto_0
    if-ne p3, v0, :cond_1

    .line 201
    invoke-static {p2}, Ll/ۘۗܺ;->ܽ(Ljava/lang/Comparable;)Ll/ۖۗܺ;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p2}, Ll/ۘۗܺ;->ۧ(Ljava/lang/Comparable;)Ll/ۡۗܺ;

    move-result-object p1

    .line 133
    :goto_1
    new-instance p2, Ll/ܰۤܺ;

    invoke-direct {p2, p0, p1}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object p2
.end method

.method public static ֫(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;
    .locals 1

    .line 310
    new-instance v0, Ll/ۖۗܺ;

    .line 315
    invoke-direct {v0, p0}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 391
    new-instance p0, Ll/ۡۗܺ;

    .line 396
    invoke-direct {p0, p1}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 133
    new-instance p1, Ll/ܰۤܺ;

    invoke-direct {p1, v0, p0}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object p1
.end method

.method public static ֫(Ll/ۘۗܺ;Ll/ۘۗܺ;)Ll/ܰۤܺ;
    .locals 1

    .line 133
    new-instance v0, Ll/ܰۤܺ;

    invoke-direct {v0, p0, p1}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object v0
.end method

.method public static ۧ(Ljava/lang/Comparable;)Ll/ܰۤܺ;
    .locals 2

    .line 254
    invoke-static {p0}, Ll/ۘۗܺ;->ܽ(Ljava/lang/Comparable;)Ll/ۖۗܺ;

    move-result-object p0

    .line 224
    invoke-static {}, Ll/ۢۗܺ;->᩻()Ll/ۢۗܺ;

    move-result-object v0

    .line 133
    new-instance v1, Ll/ܰۤܺ;

    invoke-direct {v1, p0, v0}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object v1
.end method

.method public static ۧ(Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;
    .locals 1

    .line 230
    sget-object v0, Ll/ۨۤܺ;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 234
    invoke-static {p0}, Ll/ܰۤܺ;->ܽ(Ljava/lang/Comparable;)Ll/ܰۤܺ;

    move-result-object p0

    return-object p0

    .line 236
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    .line 117
    :cond_1
    invoke-static {}, Ll/ܺۗܺ;->᩻()Ll/ܺۗܺ;

    move-result-object p1

    .line 211
    invoke-static {p0}, Ll/ۘۗܺ;->ܽ(Ljava/lang/Comparable;)Ll/ۖۗܺ;

    move-result-object p0

    .line 133
    new-instance v0, Ll/ܰۤܺ;

    invoke-direct {v0, p1, p0}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object v0
.end method

.method public static ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;
    .locals 1

    .line 170
    invoke-static {p0}, Ll/ۘۗܺ;->ܽ(Ljava/lang/Comparable;)Ll/ۖۗܺ;

    move-result-object p0

    .line 310
    new-instance v0, Ll/ۖۗܺ;

    .line 315
    invoke-direct {v0, p1}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 133
    new-instance p1, Ll/ܰۤܺ;

    invoke-direct {p1, p0, v0}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object p1
.end method

.method public static ܽ(Ljava/lang/Comparable;)Ll/ܰۤܺ;
    .locals 2

    .line 117
    invoke-static {}, Ll/ܺۗܺ;->᩻()Ll/ܺۗܺ;

    move-result-object v0

    .line 220
    invoke-static {p0}, Ll/ۘۗܺ;->ۧ(Ljava/lang/Comparable;)Ll/ۡۗܺ;

    move-result-object p0

    .line 133
    new-instance v1, Ll/ܰۤܺ;

    invoke-direct {v1, v0, p0}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object v1
.end method

.method public static ܿ()Ll/ܰۤܺ;
    .locals 3

    const/4 v0, 0x0

    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 391
    new-instance v1, Ll/ۡۗܺ;

    .line 396
    invoke-direct {v1, v0}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 391
    new-instance v2, Ll/ۡۗܺ;

    .line 396
    invoke-direct {v2, v0}, Ll/ۘۗܺ;-><init>(Ljava/lang/Comparable;)V

    .line 133
    new-instance v0, Ll/ܰۤܺ;

    invoke-direct {v0, v1, v2}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object v0
.end method

.method public static ᩳ()Ll/ܰۤܺ;
    .locals 1

    .line 282
    sget-object v0, Ll/ܰۤܺ;->ۙ:Ll/ܰۤܺ;

    return-object v0
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 123
    check-cast p1, Ljava/lang/Comparable;

    .line 421
    invoke-virtual {p0, p1}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 652
    instance-of v0, p1, Ll/ܰۤܺ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 653
    check-cast p1, Ll/ܰۤܺ;

    .line 654
    iget-object v0, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v2, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v0, v2}, Ll/ۘۗܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object p1, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v0, p1}, Ll/ۘۗܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 662
    iget-object v0, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v0}, Ll/ۘۗܺ;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v1}, Ll/ۘۗܺ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public readResolve()Ljava/lang/Object;
    .locals 2

    .line 693
    sget-object v0, Ll/ܰۤܺ;->ۙ:Ll/ܰۤܺ;

    invoke-virtual {p0, v0}, Ll/ܰۤܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 675
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 676
    iget-object v1, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v1, v0}, Ll/ۘۗܺ;->֫(Ljava/lang/StringBuilder;)V

    const-string v1, ".."

    .line 677
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    iget-object v1, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v1, v0}, Ll/ۘۗܺ;->ۧ(Ljava/lang/StringBuilder;)V

    .line 679
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩵ۗܺ;)Ll/ܰۤܺ;
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    iget-object v0, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v0, p1}, Ll/ۘۗܺ;->֫(Ll/᩵ۗܺ;)Ll/ۘۗܺ;

    move-result-object v1

    .line 639
    iget-object v2, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v2, p1}, Ll/ۘۗܺ;->֫(Ll/᩵ۗܺ;)Ll/ۘۗܺ;

    move-result-object p1

    if-ne v1, v0, :cond_0

    if-ne p1, v2, :cond_0

    return-object p0

    .line 133
    :cond_0
    new-instance v0, Ll/ܰۤܺ;

    invoke-direct {v0, v1, p1}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object v0
.end method

.method public final ֫()Z
    .locals 2

    .line 399
    iget-object v0, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v1, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v0, v1}, Ll/ۘۗܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/lang/Comparable;)Z
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    iget-object v0, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v0, p1}, Ll/ۘۗܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v0, p1}, Ll/ۘۗܺ;->֫(Ljava/lang/Comparable;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ܰۤܺ;)Z
    .locals 2

    .line 474
    iget-object v0, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v1, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v0, v1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object p1, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 475
    invoke-virtual {v0, p1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ljava/lang/Comparable;
    .locals 1

    .line 349
    iget-object v0, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v0}, Ll/ۘۗܺ;->֫()Ljava/lang/Comparable;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;
    .locals 5

    .line 525
    iget-object v0, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v1, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v1, v0}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v0

    .line 526
    iget-object v2, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v3, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v3, v2}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v4

    if-ltz v0, :cond_0

    if-gtz v4, :cond_0

    return-object p0

    :cond_0
    if-gtz v0, :cond_1

    if-ltz v4, :cond_1

    return-object p1

    :cond_1
    if-ltz v0, :cond_2

    goto :goto_0

    .line 532
    :cond_2
    iget-object v1, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    :goto_0
    if-gtz v4, :cond_3

    move-object v2, v3

    .line 537
    :cond_3
    invoke-virtual {v1, v2}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v0

    if-gtz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    const-string v3, "intersection is undefined for disconnected ranges %s and %s"

    .line 536
    invoke-static {v0, v3, p0, p1}, Ll/ۘܶܺ;->֫(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    new-instance p1, Ll/ܰۤܺ;

    invoke-direct {p1, v1, v2}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object p1
.end method

.method public final ܽ()Ljava/lang/Comparable;
    .locals 1

    .line 375
    iget-object v0, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v0}, Ll/ۘۗܺ;->֫()Ljava/lang/Comparable;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ(Ll/ܰۤܺ;)Z
    .locals 2

    .line 504
    iget-object v0, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v1, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v0, v1}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v0

    if-gtz v0, :cond_0

    iget-object p1, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v0, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 505
    invoke-virtual {p1, v0}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩳ(Ll/ܰۤܺ;)Ll/ܰۤܺ;
    .locals 5

    .line 599
    iget-object v0, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v1, p0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    invoke-virtual {v1, v0}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v0

    .line 600
    iget-object v2, p1, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v3, p0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v3, v2}, Ll/ۘۗܺ;->֫(Ll/ۘۗܺ;)I

    move-result v4

    if-gtz v0, :cond_0

    if-ltz v4, :cond_0

    return-object p0

    :cond_0
    if-ltz v0, :cond_1

    if-gtz v4, :cond_1

    return-object p1

    :cond_1
    if-gtz v0, :cond_2

    goto :goto_0

    .line 606
    :cond_2
    iget-object v1, p1, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    :goto_0
    if-ltz v4, :cond_3

    move-object v2, v3

    .line 133
    :cond_3
    new-instance p1, Ll/ܰۤܺ;

    invoke-direct {p1, v1, v2}, Ll/ܰۤܺ;-><init>(Ll/ۘۗܺ;Ll/ۘۗܺ;)V

    return-object p1
.end method
