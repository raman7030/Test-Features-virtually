.class public abstract Ll/᩻᩺֨;
.super Ljava/lang/Object;
.source "Y7SB"


# instance fields
.field public final ֫:Ll/ۖܶ۠;

.field public final ۧ:I

.field public final ܳ:Ll/᩺᩵۠;

.field public final ܽ:Ll/ۛ֡֨;

.field public final synthetic ܿ:Ll/ۜ᩺֨;

.field public final ᩳ:Ll/᩻᩺֨;


# direct methods
.method public constructor <init>(Ll/ۜ᩺֨;Ll/᩺᩵۠;)V
    .locals 6

    .line 1843
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻᩺֨;->ܿ:Ll/ۜ᩺֨;

    .line 1844
    iput-object p2, p0, Ll/᩻᩺֨;->ܳ:Ll/᩺᩵۠;

    .line 1845
    invoke-static {p1}, Ll/ۜ᩺֨;->ۜ(Ll/ۜ᩺֨;)Ll/ۛ֡֨;

    move-result-object v0

    iput-object v0, p0, Ll/᩻᩺֨;->ܽ:Ll/ۛ֡֨;

    .line 1846
    invoke-static {p1}, Ll/ۜ᩺֨;->֫(Ll/ۜ᩺֨;)Ll/ۖܶ۠;

    move-result-object v0

    .line 218
    invoke-virtual {v0}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 1846
    iput v0, p0, Ll/᩻᩺֨;->ۧ:I

    .line 1847
    invoke-static {p1}, Ll/ۜ᩺֨;->ܿ(Ll/ۜ᩺֨;)Ll/᩻᩺֨;

    move-result-object v0

    iput-object v0, p0, Ll/᩻᩺֨;->ᩳ:Ll/᩻᩺֨;

    .line 1848
    iget-object p1, p1, Ll/ۜ᩺֨;->᩻:Ll/ۡ᩺֨;

    invoke-static {p1}, Ll/ۡ᩺֨;->ۘ(Ll/ۡ᩺֨;)Ll/ۛ᩸֨;

    move-result-object v0

    invoke-static {p1}, Ll/ۡ᩺֨;->ۧ(Ll/ۡ᩺֨;)Ll/֫ۤ֨;

    move-result-object v1

    invoke-static {p1}, Ll/ۡ᩺֨;->ۢ(Ll/ۡ᩺֨;)Ll/ۛܶ۠;

    move-result-object v2

    iget-object v2, v2, Ll/ۛܶ۠;->ܽۧ:Ll/ۤܶ۠;

    iget-object v3, p2, Ll/᩺᩵۠;->۬:Ll/ۙ֨֨;

    const-wide/16 v4, 0x600

    .line 1849
    invoke-virtual/range {v0 .. v5}, Ll/ۛ᩸֨;->֫(Ll/֫ۤ֨;Ll/ۤܶ۠;Ll/ۙ֨֨;J)Ll/ܳ֡֨;

    move-result-object p2

    .line 1850
    invoke-static {p1}, Ll/ۡ᩺֨;->ۘ(Ll/ۡ᩺֨;)Ll/ۛ᩸֨;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ܳ֡֨;)Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩺֨;->֫:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 2

    .line 1873
    iget-object v0, p0, Ll/᩻᩺֨;->ܽ:Ll/ۛ֡֨;

    iget-object v0, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    if-nez v0, :cond_0

    const-string v0, "null"

    return-object v0

    .line 1884
    :cond_0
    invoke-virtual {v0}, Ll/ۤܶ۠;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "<clinit>"

    .line 1885
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "static"

    return-object v0

    :cond_1
    const-string v1, "<init>"

    .line 1887
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "new"

    :cond_2
    return-object v0
.end method

.method public final ۧ()Z
    .locals 3

    .line 1862
    iget-object v0, p0, Ll/᩻᩺֨;->ܿ:Ll/ۜ᩺֨;

    iget-object v0, v0, Ll/ۜ᩺֨;->᩻:Ll/ۡ᩺֨;

    invoke-static {v0}, Ll/ۡ᩺֨;->ܳ(Ll/ۡ᩺֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1865
    :cond_0
    invoke-static {v0}, Ll/ۡ᩺֨;->ۘ(Ll/ۡ᩺֨;)Ll/ۛ᩸֨;

    move-result-object v1

    iget-object v2, p0, Ll/᩻᩺֨;->ܳ:Ll/᩺᩵۠;

    iget-object v2, v2, Ll/᩺᩵۠;->۬:Ll/ۙ֨֨;

    invoke-static {v0}, Ll/ۡ᩺֨;->ܺ(Ll/ۡ᩺֨;)Ll/᩷ۚ֨;

    move-result-object v0

    iget-object v0, v0, Ll/᩷ۚ֨;->ۧۧ:Ll/ۙ֨֨;

    iget-object v0, v0, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    invoke-virtual {v1, v0, v2}, Ll/ۛ᩸֨;->ۧ(Ll/ۛ֡֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 1855
    iget-object v0, p0, Ll/᩻᩺֨;->ܳ:Ll/᩺᩵۠;

    iget-object v0, v0, Ll/᩺᩵۠;->۬:Ll/ۙ֨֨;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, v0, Ll/ۛۚ֨;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 1856
    invoke-virtual {p0}, Ll/᩻᩺֨;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻᩺֨;->֫:Ll/ۖܶ۠;

    .line 1857
    invoke-virtual {v0}, Ll/ۖܶ۠;->ۧ()I

    move-result v0

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    return v1
.end method
