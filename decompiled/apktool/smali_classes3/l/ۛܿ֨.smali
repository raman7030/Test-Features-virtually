.class public final Ll/ۛܿ֨;
.super Ll/۟ۧ֨;
.source "G7D4"


# instance fields
.field public ۛ֫:Ljava/lang/String;

.field public ۤ֫:I

.field public final ۨ֫:Ljava/util/ArrayList;

.field public ۫֫:Ljava/lang/String;

.field public ۬֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۙ۬ۚ;Ll/ۖۧ֨;I)V
    .locals 2

    .line 57
    const-class v0, Ll/۬ܿ֨;

    invoke-direct {p0, p2, v0, p3}, Ll/۟ۧ֨;-><init>(Ll/ۨܽ֨;Ljava/lang/Class;I)V

    const-string v0, ": number_of_entries = %d"

    .line 46
    iput-object v0, p0, Ll/ۛܿ֨;->۫֫:Ljava/lang/String;

    const-string v1, "n/a"

    .line 47
    iput-object v1, p0, Ll/ۛܿ֨;->۬֫:Ljava/lang/String;

    .line 48
    iput-object v1, p0, Ll/ۛܿ֨;->ۛ֫:Ljava/lang/String;

    .line 58
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/ۛܿ֨;->ۨ֫:Ljava/util/ArrayList;

    .line 60
    sget-object p3, Ll/ۤܿ֨;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p3, p3, v1

    const/4 v1, 0x1

    if-eq p3, v1, :cond_1

    const/4 v1, 0x2

    if-ne p3, v1, :cond_0

    .line 66
    sget-object p1, Ll/ܶۨۚ;->ܺܽ:Ll/ܶۨۚ;

    invoke-virtual {p1}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۨܽ֨;->ܳ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۛܿ֨;->ۤ֫:I

    .line 67
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p2, Ll/ܶۨۚ;->֫ܳ:Ll/ܶۨۚ;

    .line 0
    invoke-static {p2, p1, v0}, Ll/᩸ܳۡ;->֫(Ll/ܶۨۚ;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 67
    iput-object p1, p0, Ll/ۛܿ֨;->۫֫:Ljava/lang/String;

    goto :goto_0

    .line 69
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected value: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 62
    :cond_1
    sget-object p1, Ll/ܶۨۚ;->ܿᩳ:Ll/ܶۨۚ;

    invoke-virtual {p1}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ۨܽ֨;->ܳ(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/ۛܿ֨;->ۤ֫:I

    .line 63
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p2, Ll/ܶۨۚ;->ۧܳ:Ll/ܶۨۚ;

    .line 0
    invoke-static {p2, p1, v0}, Ll/᩸ܳۡ;->֫(Ll/ܶۨۚ;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 63
    iput-object p1, p0, Ll/ۛܿ֨;->۫֫:Ljava/lang/String;

    .line 71
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "%"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Ll/ۛܿ֨;->ۤ֫:I

    const-string v0, "s = %-3d"

    .line 0
    invoke-static {p3, v0, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 71
    iput-object p1, p0, Ll/ۛܿ֨;->۬֫:Ljava/lang/String;

    .line 72
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Ll/ۛܿ֨;->ۤ֫:I

    const-string p3, "s = %s"

    .line 0
    invoke-static {p2, p3, p1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 72
    iput-object p1, p0, Ll/ۛܿ֨;->ۛ֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬ܿ֨;Z)V
    .locals 3

    .line 76
    iget-object v0, p0, Ll/ۛܿ֨;->ۛ֫:Ljava/lang/String;

    iget v1, p0, Ll/ۛܿ֨;->ۤ֫:I

    iget-object v2, p0, Ll/ۛܿ֨;->۬֫:Ljava/lang/String;

    invoke-virtual {p1, v1, v2, v0}, Ll/۬ܿ֨;->֫(ILjava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p0, p1}, Ll/۟ۧ֨;->֫(Ll/ۢܽ֨;)V

    .line 78
    iget-object p1, p0, Ll/ۛܿ֨;->ۨ֫:Ljava/util/ArrayList;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()V
    .locals 6

    .line 76
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x0

    .line 104
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ܿ֨;

    .line 82
    iget-object v4, p0, Ll/ۛܿ֨;->ۨ֫:Ljava/util/ArrayList;

    invoke-static {v4}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    new-instance v5, Ll/۫ܿ֨;

    invoke-direct {v5, v2}, Ll/۫ܿ֨;-><init>(I)V

    .line 83
    invoke-interface {v4, v5}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    .line 84
    invoke-interface {v4}, Ll/ܿ᩺ᩴ;->count()J

    move-result-wide v4

    long-to-int v5, v4

    .line 85
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v5

    .line 104
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v2

    .line 19
    iget-object v4, p0, Ll/ۛܿ֨;->۫֫:Ljava/lang/String;

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 104
    invoke-virtual {v3, v4}, Ll/۬ܿ֨;->᩻(Ljava/lang/String;)V

    .line 105
    invoke-virtual {p0}, Ll/۟ۧ֨;->ᩳ()I

    move-result v3

    invoke-virtual {p0, v3}, Ll/۟ۧ֨;->֫(I)V

    :goto_0
    if-ge v2, v1, :cond_0

    .line 107
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬ܿ֨;

    .line 394
    iget v4, p0, Ll/ۢܽ֨;->᩶:I

    .line 398
    iput v4, v3, Ll/ۢܽ֨;->᩶:I

    .line 109
    invoke-virtual {v3, v2, v1}, Ll/۬ܿ֨;->ۧ(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
