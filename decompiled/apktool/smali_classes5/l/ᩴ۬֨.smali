.class public final Ll/ᩴ۬֨;
.super Ljava/lang/Object;
.source "542M"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public ᩸:Ll/ۙ֨֨;

.field public final synthetic ᩹:Ll/ܶ۬֨;


# direct methods
.method public constructor <init>(Ll/ܶ۬֨;Ll/ۙ֨֨;)V
    .locals 0

    .line 2611
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ۬֨;->᩹:Ll/ܶ۬֨;

    .line 2612
    iput-object p2, p0, Ll/ᩴ۬֨;->᩸:Ll/ۙ֨֨;

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    .line 2607
    check-cast p1, Ll/ۛ֡֨;

    invoke-virtual {p0, p1}, Ll/ᩴ۬֨;->֫(Ll/ۛ֡֨;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ۛ֡֨;)Z
    .locals 6

    .line 2622
    iget-object v0, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v1, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne v0, v1, :cond_1

    .line 2623
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/16 v2, 0x1000

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 2616
    invoke-virtual {p1}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide v4, 0x40000000000L

    and-long/2addr v0, v4

    iget-object v4, p0, Ll/ᩴ۬֨;->᩸:Ll/ۙ֨֨;

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    iget-object v0, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object v1, v4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 2624
    :cond_0
    iget-object v0, v4, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object v1, p0, Ll/ᩴ۬֨;->᩹:Ll/ܶ۬֨;

    invoke-static {v1}, Ll/ܶ۬֨;->᩷(Ll/ܶ۬֨;)Ll/ۛ᩸֨;

    move-result-object v1

    .line 2625
    invoke-virtual {p1, v0, v1}, Ll/ۛ֡֨;->֫(Ll/ۛ֡֨;Ll/ۛ᩸֨;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2626
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۜ֫()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
