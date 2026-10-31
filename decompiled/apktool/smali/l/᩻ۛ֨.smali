.class public Ll/᩻ۛ֨;
.super Ll/ܳۛ֨;
.source "M43N"


# instance fields
.field public final synthetic ۜ:Ll/ۜۨ֨;

.field public ᩷:Ljava/util/EnumSet;


# direct methods
.method public constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;Ljava/util/EnumSet;)V
    .locals 2

    .line 843
    iput-object p1, p0, Ll/᩻ۛ֨;->ۜ:Ll/ۜۨ֨;

    .line 844
    invoke-virtual {p2}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v0

    sget-object v1, Ll/᩵֨֨;->᩹:Ll/᩵֨֨;

    invoke-direct {p0, p1, p2, v0, v1}, Ll/ܳۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/ۙ֨֨;Ll/᩵֨֨;)V

    .line 845
    iput-object p3, p0, Ll/᩻ۛ֨;->᩷:Ljava/util/EnumSet;

    return-void
.end method

.method public varargs constructor <init>(Ll/ۜۨ֨;Ll/֨֨֨;Ll/᩵֨֨;[Ll/᩵֨֨;)V
    .locals 0

    .line 840
    invoke-static {p3, p4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Ll/᩻ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ljava/util/EnumSet;)V

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/EnumSet;
    .locals 1

    .line 855
    iget-object v0, p0, Ll/᩻ۛ֨;->᩷:Ljava/util/EnumSet;

    return-object v0
.end method

.method public ֫(Ll/֨֨֨;)Ll/᩸ۛ֨;
    .locals 3

    .line 850
    new-instance v0, Ll/᩻ۛ֨;

    iget-object v1, p0, Ll/᩻ۛ֨;->ۜ:Ll/ۜۨ֨;

    iget-object v2, p0, Ll/᩻ۛ֨;->᩷:Ljava/util/EnumSet;

    invoke-direct {v0, v1, p1, v2}, Ll/᩻ۛ֨;-><init>(Ll/ۜۨ֨;Ll/֨֨֨;Ljava/util/EnumSet;)V

    return-object v0
.end method

.method public final ֫(Ll/᩵֨֨;Ll/᩵֨֨;)V
    .locals 7

    .line 1248
    iget-object p1, p0, Ll/᩻ۛ֨;->ۜ:Ll/ۜۨ֨;

    iget-object p1, p1, Ll/ۜۨ֨;->ᩳ:Ll/ۛ۠۠;

    sget-object v0, Ll/֫ۛ֨;->֫:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v3, p0, Ll/᩸ۛ֨;->ܽ:Ll/֨֨֨;

    const-string v4, "compiler"

    const/4 v5, 0x1

    if-eq v0, v5, :cond_2

    if-eq v0, v1, :cond_1

    const/4 v6, 0x3

    if-eq v0, v6, :cond_0

    return-void

    .line 1254
    :cond_0
    invoke-virtual {v3}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v0

    new-array v6, v5, [Ll/᩵֨֨;

    aput-object p2, v6, v2

    invoke-virtual {v3, v6}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object p2

    sget-object v3, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7362
    new-instance v3, Ll/ۨ۠۠;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    aput-object p2, v1, v5

    const-string p2, "inferred.do.not.conform.to.upper.bounds"

    invoke-direct {v3, v4, p2, v1}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1254
    invoke-virtual {p1, v3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    invoke-static {p1}, Ll/ۜۨ֨;->֫(Ll/ܽܶ۠;)Ll/۬ۛ֨;

    move-result-object p1

    throw p1

    .line 1252
    :cond_1
    invoke-virtual {v3}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v0

    new-array v6, v5, [Ll/᩵֨֨;

    aput-object p2, v6, v2

    invoke-virtual {v3, v6}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object p2

    sget-object v3, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7352
    new-instance v3, Ll/ۨ۠۠;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    aput-object p2, v1, v5

    const-string p2, "inferred.do.not.conform.to.lower.bounds"

    invoke-direct {v3, v4, p2, v1}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1252
    invoke-virtual {p1, v3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    invoke-static {p1}, Ll/ۜۨ֨;->֫(Ll/ܽܶ۠;)Ll/۬ۛ֨;

    move-result-object p1

    throw p1

    .line 1250
    :cond_2
    invoke-virtual {v3}, Ll/֨֨֨;->۫֫()Ll/ۙ֨֨;

    move-result-object v0

    new-array v6, v5, [Ll/᩵֨֨;

    aput-object p2, v6, v2

    invoke-virtual {v3, v6}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object p2

    sget-object v3, Ll/ۨᩴ۠;->֫:Ll/ۨ۠۠;

    .line 7342
    new-instance v3, Ll/ۨ۠۠;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v0, v1, v2

    aput-object p2, v1, v5

    const-string p2, "inferred.do.not.conform.to.eq.bounds"

    invoke-direct {v3, v4, p2, v1}, Ll/ۨ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1250
    invoke-virtual {p1, v3}, Ll/ۛ۠۠;->֫(Ll/ۨ۠۠;)Ll/ܽܶ۠;

    move-result-object p1

    invoke-static {p1}, Ll/ۜۨ֨;->֫(Ll/ܽܶ۠;)Ll/۬ۛ֨;

    move-result-object p1

    throw p1
.end method
