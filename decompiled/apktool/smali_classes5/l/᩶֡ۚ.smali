.class public Ll/᩶֡ۚ;
.super Ll/ۨ֡ۚ;
.source "P44J"


# static fields
.field public static final ۛ:Ljava/util/regex/Pattern;

.field public static final ۤ:Ljava/lang/String;

.field public static final ۨ:Ljava/util/List;


# instance fields
.field public ۗ:Ljava/util/List;

.field public ۙ:Ll/ܺ֡ۚ;

.field public ۫:Ll/ܽ֨ۚ;

.field public ۬:Ljava/lang/ref/WeakReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 45
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sput-object v0, Ll/᩶֡ۚ;->ۨ:Ljava/util/List;

    const-string v0, "\\s+"

    .line 46
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩶֡ۚ;->ۛ:Ljava/util/regex/Pattern;

    const-string v0, "baseUri"

    .line 47
    invoke-static {v0}, Ll/ܺ֡ۚ;->ۜ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/᩶֡ۚ;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 91
    sget-object v0, Ll/֫֨ۚ;->ᩳ:Ll/֫֨ۚ;

    invoke-static {p1, v0}, Ll/ܽ֨ۚ;->֫(Ljava/lang/String;Ll/֫֨ۚ;)Ll/ܽ֨ۚ;

    move-result-object p1

    const-string v0, ""

    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, p1, v0, v1}, Ll/᩶֡ۚ;-><init>(Ll/ܽ֨ۚ;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܽ֨ۚ;Ljava/lang/String;Ll/ܺ֡ۚ;)V
    .locals 1

    .line 70
    invoke-direct {p0}, Ll/ۨ֡ۚ;-><init>()V

    .line 71
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 72
    sget-object v0, Ll/ۨ֡ۚ;->᩶:Ljava/util/List;

    iput-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    .line 73
    iput-object p3, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    .line 74
    iput-object p1, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    if-eqz p2, :cond_0

    .line 76
    invoke-virtual {p0, p2}, Ll/ۨ֡ۚ;->ܿ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶֡ۚ;)Ll/ܽ֨ۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    return-object p0
.end method

.method public static synthetic ֫(Ljava/lang/StringBuilder;Ll/ۨ֡ۚ;)V
    .locals 0

    .line 1344
    invoke-static {p0, p1}, Ll/᩶֡ۚ;->ۧ(Ljava/lang/StringBuilder;Ll/ۨ֡ۚ;)V

    return-void
.end method

.method public static ۧ(Ljava/lang/StringBuilder;Ll/ۨ֡ۚ;)V
    .locals 1

    .line 1349
    instance-of v0, p1, Ll/ۧۚۚ;

    if-eqz v0, :cond_0

    .line 1350
    check-cast p1, Ll/ۧۚۚ;

    .line 51
    invoke-virtual {p1}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object p1

    .line 1350
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 1351
    :cond_0
    instance-of v0, p1, Ll/᩶֡ۚ;

    if-eqz v0, :cond_1

    .line 1352
    check-cast p1, Ll/᩶֡ۚ;

    .line 1423
    iget-object p1, p1, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {p1}, Ll/ܽ֨ۚ;->ۢ()Ljava/lang/String;

    move-result-object p1

    const-string v0, "br"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "\n"

    .line 1424
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method public static ܿ(Ll/ۨ֡ۚ;)Z
    .locals 4

    .line 1429
    instance-of v0, p0, Ll/᩶֡ۚ;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 1430
    check-cast p0, Ll/᩶֡ۚ;

    const/4 v0, 0x0

    .line 1433
    :cond_0
    iget-object v2, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v2}, Ll/ܽ֨ۚ;->ۡ()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    return v3

    .line 264
    :cond_1
    iget-object p0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    check-cast p0, Ll/᩶֡ۚ;

    add-int/2addr v0, v3

    const/4 v2, 0x6

    if-ge v0, v2, :cond_2

    if-nez p0, :cond_0

    :cond_2
    return v1
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 43
    invoke-virtual {p0}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ll/ۨ֡ۚ;
    .locals 1

    .line 43
    invoke-virtual {p0}, Ll/᩶֡ۚ;->clone()Ll/᩶֡ۚ;

    move-result-object v0

    return-object v0
.end method

.method public clone()Ll/᩶֡ۚ;
    .locals 1

    .line 1764
    invoke-super {p0}, Ll/ۨ֡ۚ;->clone()Ll/ۨ֡ۚ;

    move-result-object v0

    check-cast v0, Ll/᩶֡ۚ;

    return-object v0
.end method

.method public final ֨()Ll/ۨ֡ۚ;
    .locals 2

    move-object v0, p0

    .line 293
    :goto_0
    iget-object v1, v0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-eqz v1, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 1801
    :cond_0
    check-cast v0, Ll/᩶֡ۚ;

    return-object v0
.end method

.method public final ֫(Ll/ۨ֡ۚ;)Ll/ۨ֡ۚ;
    .locals 2

    .line 1775
    invoke-super {p0, p1}, Ll/ۨ֡ۚ;->֫(Ll/ۨ֡ۚ;)Ll/ۨ֡ۚ;

    move-result-object p1

    check-cast p1, Ll/᩶֡ۚ;

    .line 1776
    iget-object v0, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܺ֡ۚ;->clone()Ll/ܺ֡ۚ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p1, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    .line 1777
    new-instance v0, Ll/᩹֡ۚ;

    iget-object v1, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, p1, v1}, Ll/᩹֡ۚ;-><init>(Ll/᩶֡ۚ;I)V

    iput-object v0, p1, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    .line 1778
    iget-object v1, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ll/ܽ֡ۚ;->addAll(Ljava/util/Collection;)Z

    return-object p1
.end method

.method public final ֫()Ll/ܺ֡ۚ;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    if-nez v0, :cond_0

    .line 112
    new-instance v0, Ll/ܺ֡ۚ;

    invoke-direct {v0}, Ll/ܺ֡ۚ;-><init>()V

    iput-object v0, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    .line 113
    :cond_0
    iget-object v0, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    return-object v0
.end method

.method public final ֫(ILjava/util/List;)V
    .locals 2

    if-eqz p2, :cond_3

    .line 138
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gez p1, :cond_0

    add-int/lit8 v1, v0, 0x1

    add-int/2addr p1, v1

    :cond_0
    const/4 v1, 0x0

    if-ltz p1, :cond_1

    if-gt p1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 653
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-array p2, v1, [Ll/ۨ֡ۚ;

    .line 654
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/ۨ֡ۚ;

    .line 655
    invoke-virtual {p0, p1, p2}, Ll/ۨ֡ۚ;->֫(I[Ll/ۨ֡ۚ;)V

    return-void

    .line 91
    :cond_2
    new-instance p1, Ll/ܳ֡ۚ;

    const-string p2, "Insert position out of bounds."

    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    throw p1

    .line 42
    :cond_3
    new-instance p1, Ll/ܳ֡ۚ;

    const-string p2, "Children collection to be inserted must not be null."

    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    throw p1
.end method

.method public final ֫(Ljava/lang/Appendable;)V
    .locals 6

    .line 1743
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 1745
    iget-object v2, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֡ۚ;

    .line 693
    new-instance v3, Ll/ۛ֡ۚ;

    .line 22
    invoke-virtual {v2}, Ll/ۨ֡ۚ;->ۘ()Ll/֨֡ۚ;

    move-result-object v4

    if-eqz v4, :cond_0

    goto :goto_1

    .line 23
    :cond_0
    new-instance v4, Ll/֨֡ۚ;

    const-string v5, ""

    invoke-direct {v4, v5}, Ll/֨֡ۚ;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v4}, Ll/֨֡ۚ;->֡֫()Ll/֡֡ۚ;

    move-result-object v4

    .line 693
    invoke-direct {v3, p1, v4}, Ll/ۛ֡ۚ;-><init>(Ljava/lang/Appendable;Ll/֡֡ۚ;)V

    invoke-static {v3, v2}, Ll/᩹ܽܽ;->֫(Ll/ۡ᩹ۚ;Ll/ۨ֡ۚ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ֫(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 1

    .line 1695
    invoke-virtual {p0, p3}, Ll/᩶֡ۚ;->֫(Ll/֡֡ۚ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1696
    instance-of v0, p1, Ljava/lang/StringBuilder;

    if-eqz v0, :cond_0

    .line 1697
    move-object v0, p1

    check-cast v0, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 1698
    invoke-static {p1, p2, p3}, Ll/ۨ֡ۚ;->ܽ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V

    goto :goto_0

    .line 1700
    :cond_0
    invoke-static {p1, p2, p3}, Ll/ۨ֡ۚ;->ܽ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V

    :cond_1
    :goto_0
    const/16 p2, 0x3c

    .line 1703
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    move-result-object p2

    .line 153
    iget-object v0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v0}, Ll/ܽ֨ۚ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1703
    invoke-interface {p2, v0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 1704
    iget-object p2, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p1, p3}, Ll/ܺ֡ۚ;->֫(Ljava/lang/Appendable;Ll/֡֡ۚ;)V

    .line 1707
    :cond_2
    iget-object p2, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    const/16 v0, 0x3e

    if-eqz p2, :cond_4

    iget-object p2, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {p2}, Ll/ܽ֨ۚ;->᩷()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 1708
    invoke-virtual {p3}, Ll/֡֡ۚ;->᩷()Ll/᩵֡ۚ;

    move-result-object p2

    sget-object p3, Ll/᩵֡ۚ;->᩹:Ll/᩵֡ۚ;

    if-ne p2, p3, :cond_3

    iget-object p2, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {p2}, Ll/ܽ֨ۚ;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 1709
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void

    :cond_3
    const-string p2, " />"

    .line 1711
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void

    .line 1714
    :cond_4
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public final ֫(Ll/֡֡ۚ;)Z
    .locals 3

    .line 1691
    invoke-virtual {p1}, Ll/֡֡ۚ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1849
    iget-object p1, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {p1}, Ll/ܽ֨ۚ;->֫()Z

    move-result p1

    if-nez p1, :cond_0

    .line 264
    iget-object p1, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    check-cast p1, Ll/᩶֡ۚ;

    if-eqz p1, :cond_5

    .line 186
    iget-object p1, p1, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    .line 1849
    invoke-virtual {p1}, Ll/ܽ֨ۚ;->֫()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    .line 186
    :cond_0
    iget-object p1, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    .line 1853
    invoke-virtual {p1}, Ll/ܽ֨ۚ;->ܳ()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    .line 264
    iget-object p1, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    check-cast p1, Ll/᩶֡ۚ;

    if-eqz p1, :cond_1

    .line 196
    iget-object p1, p1, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {p1}, Ll/ܽ֨ۚ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 595
    :cond_1
    iget-object p1, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    const/4 v1, 0x0

    if-nez p1, :cond_2

    goto :goto_0

    .line 598
    :cond_2
    iget v2, p0, Ll/ۨ֡ۚ;->᩹:I

    if-lez v2, :cond_3

    .line 599
    invoke-virtual {p1}, Ll/ۨ֡ۚ;->ۜ()Ljava/util/List;

    move-result-object p1

    iget v1, p0, Ll/ۨ֡ۚ;->᩹:I

    sub-int/2addr v1, v0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ll/ۨ֡ۚ;

    :cond_3
    :goto_0
    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    return v0

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫֫()Z
    .locals 1

    .line 196
    iget-object v0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v0}, Ll/ܽ֨ۚ;->ܽ()Z

    move-result v0

    return v0
.end method

.method public final ۖ֫()Ljava/lang/String;
    .locals 4

    .line 1367
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 138
    iget-object v1, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 1370
    iget-object v3, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ֡ۚ;

    .line 1371
    invoke-static {v0, v3}, Ll/᩶֡ۚ;->ۧ(Ljava/lang/StringBuilder;Ll/ۨ֡ۚ;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1374
    :cond_0
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۗ()Ljava/util/List;
    .locals 5

    .line 138
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 334
    sget-object v0, Ll/᩶֡ۚ;->ۨ:Ljava/util/List;

    return-object v0

    .line 337
    :cond_0
    iget-object v0, p0, Ll/᩶֡ۚ;->۬:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    .line 338
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 339
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v0, :cond_4

    .line 342
    iget-object v3, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ֡ۚ;

    .line 343
    instance-of v4, v3, Ll/᩶֡ۚ;

    if-eqz v4, :cond_3

    .line 344
    check-cast v3, Ll/᩶֡ۚ;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 346
    :cond_4
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/᩶֡ۚ;->۬:Ljava/lang/ref/WeakReference;

    return-object v1
.end method

.method public final ۘ֫()Ljava/lang/String;
    .locals 3

    .line 1343
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1344
    new-instance v1, Ll/ܶ֡ۚ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0}, Ll/ܶ֡ۚ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, p0}, Ll/᩹ܽܽ;->֫(Ll/ۡ᩹ۚ;Ll/ۨ֡ۚ;)V

    .line 1345
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۛ()I
    .locals 5

    .line 264
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    check-cast v0, Ll/᩶֡ۚ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 961
    :cond_0
    invoke-virtual {v0}, Ll/᩶֡ۚ;->ۗ()Ljava/util/List;

    move-result-object v0

    .line 977
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 979
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, p0, :cond_1

    return v3

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final ۜ()Ljava/util/List;
    .locals 2

    .line 98
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    sget-object v1, Ll/ۨ֡ۚ;->᩶:Ljava/util/List;

    if-ne v0, v1, :cond_0

    .line 99
    new-instance v0, Ll/᩹֡ۚ;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Ll/᩹֡ۚ;-><init>(Ll/᩶֡ۚ;I)V

    iput-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    .line 101
    :cond_0
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    return-object v0
.end method

.method public final ۜ(Ljava/lang/String;)Z
    .locals 13

    .line 1560
    iget-object v0, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v2, "class"

    .line 1563
    invoke-virtual {v0, v2}, Ll/ܺ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1564
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    .line 1565
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v2, :cond_7

    if-ge v2, v9, :cond_1

    goto :goto_2

    :cond_1
    if-ne v2, v9, :cond_2

    .line 1573
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_2
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v10, v2, :cond_6

    .line 1580
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    const/4 v12, 0x1

    if-eqz v3, :cond_4

    if-eqz v4, :cond_5

    sub-int v3, v10, v11

    if-ne v3, v9, :cond_3

    const/4 v4, 0x1

    const/4 v7, 0x0

    move-object v3, v0

    move v5, v11

    move-object v6, p1

    move v8, v9

    .line 1583
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v3

    if-eqz v3, :cond_3

    return v12

    :cond_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_4
    if-nez v4, :cond_5

    const/4 v3, 0x1

    move v11, v10

    const/4 v4, 0x1

    :cond_5
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_6
    if-eqz v4, :cond_7

    sub-int/2addr v2, v11

    if-ne v2, v9, :cond_7

    const/4 v4, 0x1

    const/4 v7, 0x0

    move-object v3, v0

    move v5, v11

    move-object v6, p1

    move v8, v9

    .line 1599
    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p1

    return p1

    :cond_7
    :goto_2
    return v1
.end method

.method public final ۜ֫()Ll/ܽ֨ۚ;
    .locals 1

    .line 186
    iget-object v0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    return-object v0
.end method

.method public final ۟()Ljava/lang/String;
    .locals 2

    .line 205
    iget-object v0, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    if-eqz v0, :cond_0

    const-string v1, "id"

    invoke-virtual {v0, v1}, Ll/ܺ֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final ۡ(Ljava/lang/String;)V
    .locals 1

    .line 153
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    invoke-static {p0}, Ll/᩺֡ۚ;->֫(Ll/ۨ֡ۚ;)Ll/ۧ֨ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۧ֨ۚ;->ܿ()Ll/֫֨ۚ;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܽ֨ۚ;->֫(Ljava/lang/String;Ll/֫֨ۚ;)Ll/ܽ֨ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    return-void

    .line 154
    :cond_0
    new-instance p1, Ll/ܳ֡ۚ;

    const-string v0, "The \'tagName\' parameter must not be empty."

    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 154
    throw p1
.end method

.method public final ۡ֫()Ljava/util/List;
    .locals 4

    .line 377
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 378
    iget-object v1, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֡ۚ;

    .line 379
    instance-of v3, v2, Ll/ۧۚۚ;

    if-eqz v3, :cond_0

    .line 380
    check-cast v2, Ll/ۧۚۚ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 382
    :cond_1
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ(Ljava/lang/String;)Ll/֫᩸ۚ;
    .locals 0

    .line 97
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 98
    invoke-static {p1}, Ll/ܺ᩹ۚ;->֫(Ljava/lang/String;)Ll/᩷᩹ۚ;

    move-result-object p1

    .line 109
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 111
    invoke-static {p1, p0}, Ll/ۨܶۚ;->֫(Ll/᩷᩹ۚ;Ll/᩶֡ۚ;)Ll/֫᩸ۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ۢ֫()Ljava/lang/String;
    .locals 2

    .line 1306
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1307
    new-instance v1, Ll/᩸֡ۚ;

    invoke-direct {v1, v0}, Ll/᩸֡ۚ;-><init>(Ljava/lang/StringBuilder;)V

    invoke-static {v1, p0}, Ll/᩹ܽܽ;->֫(Ll/ۡ᩹ۚ;Ll/ۨ֡ۚ;)V

    .line 1332
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 4

    .line 1492
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1494
    iget-object v1, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֡ۚ;

    .line 1495
    instance-of v3, v2, Ll/ᩴ֡ۚ;

    if-eqz v3, :cond_1

    .line 1496
    check-cast v2, Ll/ᩴ֡ۚ;

    .line 28
    invoke-virtual {v2}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v2

    .line 1497
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1498
    :cond_1
    instance-of v3, v2, Ll/ۘ֡ۚ;

    if-eqz v3, :cond_2

    .line 1499
    check-cast v2, Ll/ۘ֡ۚ;

    .line 31
    invoke-virtual {v2}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v2

    .line 1500
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1501
    :cond_2
    instance-of v3, v2, Ll/᩶֡ۚ;

    if-eqz v3, :cond_3

    .line 1502
    check-cast v2, Ll/᩶֡ۚ;

    .line 1503
    invoke-virtual {v2}, Ll/᩶֡ۚ;->ۤ()Ljava/lang/String;

    move-result-object v2

    .line 1504
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1505
    :cond_3
    instance-of v3, v2, Ll/ۖ֡ۚ;

    if-eqz v3, :cond_0

    .line 1508
    check-cast v2, Ll/ۖ֡ۚ;

    .line 51
    invoke-virtual {v2}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v2

    .line 1509
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 1512
    :cond_4
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۧ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V
    .locals 1

    .line 1718
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v0}, Ll/ܽ֨ۚ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 1719
    :cond_1
    :goto_0
    invoke-virtual {p3}, Ll/֡֡ۚ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    .line 1720
    invoke-virtual {v0}, Ll/ܽ֨ۚ;->֫()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 1722
    :cond_2
    invoke-static {p1, p2, p3}, Ll/ۨ֡ۚ;->ܽ(Ljava/lang/Appendable;ILl/֡֡ۚ;)V

    :cond_3
    :goto_1
    const-string p2, "</"

    .line 1723
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    .line 153
    iget-object p2, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {p2}, Ll/ܽ֨ۚ;->getName()Ljava/lang/String;

    move-result-object p2

    .line 1723
    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    move-result-object p1

    const/16 p2, 0x3e

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public final ۨ()Ll/֫ۚۚ;
    .locals 1

    const/4 v0, 0x0

    .line 1687
    invoke-static {p0, v0}, Ll/֫ۚۚ;->ۧ(Ll/ۨ֡ۚ;Z)Ll/֫ۚۚ;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Ll/֫᩸ۚ;
    .locals 2

    .line 324
    new-instance v0, Ll/֫᩸ۚ;

    invoke-virtual {p0}, Ll/᩶֡ۚ;->ۗ()Ljava/util/List;

    move-result-object v1

    .line 40
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final ܰ()Ljava/lang/String;
    .locals 3

    .line 1735
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1736
    invoke-virtual {p0, v0}, Ll/᩶֡ۚ;->֫(Ljava/lang/Appendable;)V

    .line 1737
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۘ()Ll/֨֡ۚ;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    new-instance v1, Ll/֨֡ۚ;

    const-string v2, ""

    invoke-direct {v1, v2}, Ll/֨֡ۚ;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1}, Ll/֨֡ۚ;->֡֫()Ll/֡֡ۚ;

    move-result-object v1

    .line 1738
    invoke-virtual {v1}, Ll/֡֡ۚ;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final ܳ()Ll/ۨ֡ۚ;
    .locals 1

    .line 808
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-object p0
.end method

.method public final ܳ()V
    .locals 1

    .line 808
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 3

    .line 1611
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    const-string v0, "class"

    .line 1521
    invoke-virtual {p0, v0}, Ll/ۨ֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 1531
    sget-object v2, Ll/᩶֡ۚ;->ۛ:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    move-result-object v1

    .line 1532
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    const-string v1, ""

    .line 1533
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 1614
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1545
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1546
    invoke-virtual {p0}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܺ֡ۚ;->remove()V

    return-void

    .line 1548
    :cond_0
    invoke-virtual {p0}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object p1

    const-string v1, " "

    invoke-static {v2, v1}, Ll/᩷֡ۚ;->֫(Ljava/util/AbstractCollection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ll/ܺ֡ۚ;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ܳ֫()Ll/᩶֡ۚ;
    .locals 5

    .line 916
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-nez v0, :cond_0

    goto :goto_2

    .line 264
    :cond_0
    check-cast v0, Ll/᩶֡ۚ;

    .line 917
    invoke-virtual {v0}, Ll/᩶֡ۚ;->ۗ()Ljava/util/List;

    move-result-object v0

    .line 977
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 979
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, p0, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-lez v2, :cond_3

    add-int/lit8 v2, v2, -0x1

    .line 920
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶֡ۚ;

    return-object v0

    :cond_3
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public ܺ()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v0}, Ll/ܽ֨ۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܺ(Ljava/lang/String;)V
    .locals 2

    .line 1450
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 1451
    invoke-virtual {p0}, Ll/᩶֡ۚ;->ܳ()V

    .line 1453
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۘ()Ll/֨֡ۚ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1455
    invoke-virtual {v0}, Ll/֨֡ۚ;->ۚ֫()Ll/ۧ֨ۚ;

    move-result-object v0

    .line 163
    iget-object v1, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v1}, Ll/ܽ֨ۚ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 1455
    invoke-virtual {v0, v1}, Ll/ۧ֨ۚ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1456
    new-instance v0, Ll/ᩴ֡ۚ;

    invoke-direct {v0, p1}, Ll/ᩴ֡ۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    return-void

    .line 1458
    :cond_0
    new-instance v0, Ll/ۧۚۚ;

    invoke-direct {v0, p1}, Ll/ۧۚۚ;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 3

    move-object v0, p0

    :goto_0
    if-eqz v0, :cond_1

    .line 124
    iget-object v1, v0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    if-eqz v1, :cond_0

    sget-object v2, Ll/᩶֡ۚ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/ܺ֡ۚ;->ܽ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 125
    iget-object v0, v0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    invoke-virtual {v0, v2}, Ll/ܺ֡ۚ;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 264
    :cond_0
    iget-object v0, v0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    check-cast v0, Ll/᩶֡ۚ;

    goto :goto_0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 2

    .line 133
    invoke-virtual {p0}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v0

    sget-object v1, Ll/᩶֡ۚ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Ll/ܺ֡ۚ;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ(Ll/ۨ֡ۚ;)V
    .locals 1

    .line 465
    iget-object v0, p1, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-eqz v0, :cond_0

    .line 466
    invoke-virtual {v0, p1}, Ll/ۨ֡ۚ;->ۧ(Ll/ۨ֡ۚ;)V

    .line 467
    :cond_0
    iput-object p0, p1, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    .line 582
    invoke-virtual {p0}, Ll/᩶֡ۚ;->ۜ()Ljava/util/List;

    .line 583
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 584
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 615
    iput v0, p1, Ll/ۨ֡ۚ;->᩹:I

    return-void
.end method

.method public final ܽ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 357
    iput-object v0, p0, Ll/᩶֡ۚ;->۬:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final ܿ֫()Ljava/lang/String;
    .locals 5

    .line 1389
    invoke-static {}, Ll/᩷֡ۚ;->֫()Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    .line 138
    :goto_0
    iget-object v2, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 1396
    iget-object v2, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ֡ۚ;

    .line 1397
    instance-of v3, v2, Ll/ۧۚۚ;

    if-eqz v3, :cond_2

    .line 1398
    check-cast v2, Ll/ۧۚۚ;

    .line 51
    invoke-virtual {v2}, Ll/ۤ֡ۚ;->᩶()Ljava/lang/String;

    move-result-object v3

    .line 1409
    iget-object v4, v2, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    invoke-static {v4}, Ll/᩶֡ۚ;->ܿ(Ll/ۨ֡ۚ;)Z

    move-result v4

    if-nez v4, :cond_1

    instance-of v2, v2, Ll/ۖ֡ۚ;

    if-eqz v2, :cond_0

    goto :goto_1

    .line 1412
    :cond_0
    invoke-static {v0}, Ll/ۧۚۚ;->֫(Ljava/lang/StringBuilder;)Z

    move-result v2

    invoke-static {v3, v0, v2}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    goto :goto_2

    .line 1410
    :cond_1
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 1400
    :cond_2
    instance-of v3, v2, Ll/᩶֡ۚ;

    if-eqz v3, :cond_3

    .line 1401
    check-cast v2, Ll/᩶֡ۚ;

    .line 1417
    iget-object v2, v2, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v2}, Ll/ܽ֨ۚ;->ۢ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "br"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Ll/ۧۚۚ;->֫(Ljava/lang/StringBuilder;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, " "

    .line 1418
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1391
    :cond_4
    invoke-static {v0}, Ll/᩷֡ۚ;->֫(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 138
    iget-object v0, p0, Ll/᩶֡ۚ;->ۗ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ᩳ(Ll/ۨ֡ۚ;)V
    .locals 4

    .line 334
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    invoke-static {v0}, Ll/ܿ֡ۚ;->֫(Ljava/lang/Object;)V

    .line 336
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    iget v1, p0, Ll/ۨ֡ۚ;->᩹:I

    const/4 v2, 0x1

    new-array v2, v2, [Ll/ۨ֡ۚ;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ll/ۨ֡ۚ;->֫(I[Ll/ۨ֡ۚ;)V

    return-void
.end method

.method public final ᩳ֫()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v0}, Ll/ܽ֨ۚ;->ۢ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩵()Ll/ۨ֡ۚ;
    .locals 1

    .line 264
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    check-cast v0, Ll/᩶֡ۚ;

    return-object v0
.end method

.method public final ᩵()Ll/᩶֡ۚ;
    .locals 1

    .line 264
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    check-cast v0, Ll/᩶֡ۚ;

    return-object v0
.end method

.method public final ᩶()Ll/᩶֡ۚ;
    .locals 2

    const/4 v0, 0x0

    .line 297
    invoke-virtual {p0}, Ll/᩶֡ۚ;->ۗ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶֡ۚ;

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 1

    .line 138
    invoke-virtual {p0}, Ll/᩶֡ۚ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-virtual {p0}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܺ֡ۚ;->ܳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 106
    iget-object v0, p0, Ll/᩶֡ۚ;->ۙ:Ll/ܺ֡ۚ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷֫()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Ll/᩶֡ۚ;->۫:Ll/ܽ֨ۚ;

    invoke-virtual {v0}, Ll/ܽ֨ۚ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻(Ljava/lang/String;)Ll/᩶֡ۚ;
    .locals 3

    .line 686
    new-instance v0, Ll/᩶֡ۚ;

    invoke-static {p0}, Ll/᩺֡ۚ;->֫(Ll/ۨ֡ۚ;)Ll/ۧ֨ۚ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۧ֨ۚ;->ܿ()Ll/֫֨ۚ;

    move-result-object v1

    invoke-static {p1, v1}, Ll/ܽ֨ۚ;->֫(Ljava/lang/String;Ll/֫֨ۚ;)Ll/ܽ֨ۚ;

    move-result-object p1

    invoke-virtual {p0}, Ll/᩶֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 87
    invoke-direct {v0, p1, v1, v2}, Ll/᩶֡ۚ;-><init>(Ll/ܽ֨ۚ;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    .line 687
    invoke-virtual {p0, v0}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    return-object v0
.end method

.method public final ᩻֫()Ll/֫᩸ۚ;
    .locals 3

    .line 871
    iget-object v0, p0, Ll/ۨ֡ۚ;->᩸:Ll/ۨ֡ۚ;

    if-nez v0, :cond_0

    .line 872
    new-instance v0, Ll/֫᩸ۚ;

    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0

    .line 264
    :cond_0
    check-cast v0, Ll/᩶֡ۚ;

    .line 874
    invoke-virtual {v0}, Ll/᩶֡ۚ;->ۗ()Ljava/util/List;

    move-result-object v0

    .line 875
    new-instance v1, Ll/֫᩸ۚ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    .line 32
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 876
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶֡ۚ;

    if-eq v2, p0, :cond_1

    .line 878
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method
