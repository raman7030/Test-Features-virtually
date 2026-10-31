.class public final Ll/᩸ۡܺ;
.super Ljava/lang/Object;
.source "GBHS"

# interfaces
.implements Ll/֫ۖܺ;
.implements Ll/֡ᩴܺ;
.implements Ljava/lang/Comparable;


# static fields
.field public static final ۗ:Ljava/lang/ThreadLocal;

.field public static final synthetic ۙ:I

.field public static final ۬:Ll/ۧۤᩴ;


# instance fields
.field public final ᩶:Ll/֫ۖܺ;

.field public final ᩸:Ll/ᩴۡܺ;

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 41
    new-instance v0, Ll/ۧۤᩴ;

    const/16 v1, 0x2710

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-direct {v0, v1, v2}, Ll/ۧۤᩴ;-><init>(IF)V

    sput-object v0, Ll/᩸ۡܺ;->۬:Ll/ۧۤᩴ;

    .line 47
    new-instance v0, Ll/۠ۡܺ;

    .line 48
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 47
    sput-object v0, Ll/᩸ۡܺ;->ۗ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(ILl/֫ۖܺ;Ll/ᩴۡܺ;)V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_1

    if-eqz p2, :cond_0

    .line 175
    iput p1, p0, Ll/᩸ۡܺ;->᩹:I

    .line 176
    iput-object p2, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    .line 177
    iput-object p3, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    return-void

    .line 172
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "type == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 168
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "reg < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Z)Ljava/lang/String;
    .locals 3

    .line 624
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 626
    invoke-virtual {p0}, Ll/᩸ۡܺ;->۠()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    .line 627
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    iget-object v1, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    if-eqz v1, :cond_0

    .line 630
    invoke-virtual {v1}, Ll/ᩴۡܺ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    :cond_0
    iget-object v1, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v2

    .line 634
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eq v2, v1, :cond_3

    const-string v2, "="

    .line 637
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_1

    .line 638
    instance-of v2, v1, Ll/۬ܺܺ;

    if-eqz v2, :cond_1

    .line 639
    check-cast v1, Ll/۬ܺܺ;

    invoke-virtual {v1}, Ll/۬ܺܺ;->ۚ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 640
    instance-of p1, v1, Ll/ܰۡܺ;

    if-eqz p1, :cond_2

    .line 641
    invoke-interface {v1}, Ll/֡ᩴܺ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 643
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 647
    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static ֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;
    .locals 1

    const/4 v0, 0x0

    .line 106
    invoke-static {p0, p1, v0}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILl/۟ܺܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;
    .locals 0

    if-eqz p2, :cond_0

    .line 126
    invoke-static {p0, p1, p2}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p0

    return-object p0

    .line 123
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "local  == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Z
    .locals 1

    .line 250
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    .line 251
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    if-eq p1, p3, :cond_0

    if-eqz p1, :cond_1

    .line 253
    invoke-virtual {p1, p3}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ֫(Ll/᩸ۡܺ;ILl/֫ۖܺ;Ll/ᩴۡܺ;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2, p3}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;
    .locals 1

    .line 82
    sget-object v0, Ll/᩸ۡܺ;->ۗ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶۡܺ;

    .line 83
    invoke-virtual {v0, p0, p1, p2}, Ll/ܶۡܺ;->֫(ILl/֫ۖܺ;Ll/ᩴۡܺ;)V

    .line 84
    sget-object p0, Ll/᩸ۡܺ;->۬:Ll/ۧۤᩴ;

    invoke-virtual {p0, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩸ۡܺ;

    if-nez p1, :cond_0

    .line 86
    invoke-virtual {v0}, Ll/ܶۡܺ;->֫()Ll/᩸ۡܺ;

    move-result-object p1

    .line 87
    invoke-virtual {p0, p1, p1}, Ll/ۧۤᩴ;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩸ۡܺ;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static ܽ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;
    .locals 0

    .line 144
    invoke-static {p0, p1, p2}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 31
    check-cast p1, Ll/᩸ۡܺ;

    invoke-virtual {p0, p1}, Ll/᩸ۡܺ;->֫(Ll/᩸ۡܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 189
    :cond_0
    instance-of v0, p1, Ll/᩸ۡܺ;

    if-nez v0, :cond_2

    .line 190
    instance-of v0, p1, Ll/ܶۡܺ;

    if-eqz v0, :cond_1

    .line 191
    check-cast p1, Ll/ܶۡܺ;

    .line 192
    invoke-static {p1}, Ll/ܶۡܺ;->ۧ(Ll/ܶۡܺ;)I

    move-result v0

    invoke-static {p1}, Ll/ܶۡܺ;->ܽ(Ll/ܶۡܺ;)Ll/֫ۖܺ;

    move-result-object v1

    invoke-static {p1}, Ll/ܶۡܺ;->֫(Ll/ܶۡܺ;)Ll/ᩴۡܺ;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1

    .line 197
    :cond_2
    check-cast p1, Ll/᩸ۡܺ;

    .line 198
    iget v0, p1, Ll/᩸ۡܺ;->᩹:I

    iget-object v1, p1, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    iget-object p1, p1, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    invoke-direct {p0, v0, v1, p1}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Z

    move-result p1

    return p1
.end method

.method public final getType()Ll/۟ܺܺ;
    .locals 1

    .line 334
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v0}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 307
    iget-object v0, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ᩴۡܺ;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 309
    iget-object v1, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 318
    invoke-direct {p0, v0}, Ll/᩸ۡܺ;->֫(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ll/֫ۖܺ;
    .locals 1

    .line 385
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    return-object v0
.end method

.method public final ֨()Z
    .locals 2

    .line 614
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/᩸ۡܺ;)I
    .locals 5

    .line 265
    iget v0, p1, Ll/᩸ۡܺ;->᩹:I

    iget-object v1, p1, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    const/4 v2, -0x1

    iget v3, p0, Ll/᩸ۡܺ;->᩹:I

    if-ge v3, v0, :cond_0

    return v2

    :cond_0
    const/4 v4, 0x1

    if-le v3, v0, :cond_1

    return v4

    :cond_1
    const/4 v0, 0x0

    if-ne p0, p1, :cond_2

    return v0

    .line 273
    :cond_2
    iget-object v3, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v3}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v3

    iget-object p1, p1, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {p1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/۟ܺܺ;->֫(Ll/۟ܺܺ;)I

    move-result p1

    if-eqz p1, :cond_3

    return p1

    .line 279
    :cond_3
    iget-object p1, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    if-nez p1, :cond_5

    if-nez v1, :cond_4

    return v0

    :cond_4
    return v2

    :cond_5
    if-nez v1, :cond_6

    return v4

    .line 285
    :cond_6
    invoke-virtual {p1, v1}, Ll/ᩴۡܺ;->֫(Ll/ᩴۡܺ;)I

    move-result p1

    return p1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 326
    invoke-direct {p0, v0}, Ll/᩸ۡܺ;->֫(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/᩸ۡܺ;
    .locals 1

    if-nez p1, :cond_0

    return-object p0

    .line 561
    :cond_0
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Ll/᩸ۡܺ;->ۧ(I)Ll/᩸ۡܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֫ۖܺ;)Ll/᩸ۡܺ;
    .locals 2

    .line 546
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    iget-object v1, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    .line 144
    invoke-static {v0, p1, v1}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ᩴۡܺ;)Ll/᩸ۡܺ;
    .locals 2

    .line 601
    iget-object v0, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    if-eq v0, p1, :cond_1

    if-eqz v0, :cond_0

    .line 602
    invoke-virtual {v0, p1}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 607
    :cond_0
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    iget-object v1, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    .line 144
    invoke-static {v0, v1, p1}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final ۚ()Z
    .locals 1

    .line 444
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v0}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ܺܺ;->ܶ()Z

    move-result v0

    return v0
.end method

.method public final ۠()Ljava/lang/String;
    .locals 2

    .line 453
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    const-string v1, "v"

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۡ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Ll/֫ۖܺ;
    .locals 1

    .line 342
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v0}, Ll/֫ۖܺ;->ۢ()Ll/֫ۖܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 420
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v0}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ܺܺ;->᩻()I

    move-result v0

    return v0
.end method

.method public final ۧ(I)Ll/᩸ۡܺ;
    .locals 2

    .line 531
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    if-ne v0, p1, :cond_0

    return-object p0

    .line 535
    :cond_0
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    iget-object v1, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    .line 144
    invoke-static {p1, v0, v1}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/᩸ۡܺ;)Z
    .locals 2

    .line 212
    invoke-virtual {p0, p1}, Ll/᩸ۡܺ;->ᩳ(Ll/᩸ۡܺ;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 216
    :cond_0
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    iget p1, p1, Ll/᩸ۡܺ;->᩹:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final ܶ()Ll/᩸ۡܺ;
    .locals 3

    .line 576
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    instance-of v1, v0, Ll/۟ܺܺ;

    if-eqz v1, :cond_0

    .line 577
    move-object v1, v0

    check-cast v1, Ll/۟ܺܺ;

    goto :goto_0

    .line 579
    :cond_0
    invoke-interface {v0}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v1

    .line 582
    :goto_0
    invoke-virtual {v1}, Ll/۟ܺܺ;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 583
    invoke-virtual {v1}, Ll/۟ܺܺ;->ۚ()Ll/۟ܺܺ;

    move-result-object v1

    :cond_1
    if-ne v1, v0, :cond_2

    return-object p0

    .line 590
    :cond_2
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    iget-object v2, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    .line 144
    invoke-static {v0, v1, v2}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()I
    .locals 2

    .line 408
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    invoke-virtual {p0}, Ll/᩸ۡܺ;->ۧ()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ܽ(Ll/᩸ۡܺ;)Ll/᩸ۡܺ;
    .locals 7

    if-ne p0, p1, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_a

    .line 490
    iget-object v1, p1, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    .line 375
    iget v2, p1, Ll/᩸ۡܺ;->᩹:I

    .line 490
    iget v3, p0, Ll/᩸ۡܺ;->᩹:I

    if-eq v3, v2, :cond_1

    goto :goto_4

    .line 495
    :cond_1
    iget-object v2, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    if-eqz v2, :cond_3

    .line 395
    iget-object p1, p1, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    .line 495
    invoke-virtual {v2, p1}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    goto :goto_1

    :cond_3
    :goto_0
    move-object p1, v0

    :goto_1
    if-ne p1, v2, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_5

    goto :goto_4

    .line 334
    :cond_5
    iget-object v4, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v4}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v5

    invoke-interface {v1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v6

    if-eq v5, v6, :cond_6

    goto :goto_4

    .line 512
    :cond_6
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    move-object v5, v4

    :cond_7
    if-ne v5, v4, :cond_8

    if-eqz v2, :cond_8

    :goto_3
    return-object p0

    :cond_8
    if-nez p1, :cond_9

    .line 106
    invoke-static {v3, v5, v0}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    return-object p1

    .line 126
    :cond_9
    invoke-static {v3, v5, p1}, Ll/᩸ۡܺ;->ۧ(ILl/֫ۖܺ;Ll/ᩴۡܺ;)Ll/᩸ۡܺ;

    move-result-object p1

    return-object p1

    :cond_a
    :goto_4
    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 350
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v0}, Ll/֫ۖܺ;->ܿ()I

    move-result v0

    return v0
.end method

.method public final ᩳ(Ll/᩸ۡܺ;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 233
    :cond_0
    iget-object v1, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v1}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v1

    iget-object v2, p1, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v2}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۟ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p1, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    iget-object v1, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    if-eq v1, p1, :cond_1

    if-eqz v1, :cond_2

    .line 235
    invoke-virtual {v1, p1}, Ll/ᩴۡܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 375
    iget v0, p0, Ll/᩸ۡܺ;->᩹:I

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 358
    iget-object v0, p0, Ll/᩸ۡܺ;->᩶:Ll/֫ۖܺ;

    invoke-interface {v0}, Ll/֫ۖܺ;->᩷()I

    move-result v0

    return v0
.end method

.method public final ᩻()Ll/ᩴۡܺ;
    .locals 1

    .line 395
    iget-object v0, p0, Ll/᩸ۡܺ;->᩸:Ll/ᩴۡܺ;

    return-object v0
.end method
