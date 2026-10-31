.class public final Ll/ܶۧ֨;
.super Ll/ۗۧ֨;
.source "K3OA"


# instance fields
.field public final synthetic ܳ:Ll/ۤۧ֨;


# direct methods
.method public constructor <init>(Ll/ۤۧ֨;Ll/۫ۧ֨;D)V
    .locals 0

    .line 894
    iput-object p1, p0, Ll/ܶۧ֨;->ܳ:Ll/ۤۧ֨;

    .line 895
    invoke-static {p3, p4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Ll/ۗۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨۬ۚ;I)V
    .locals 1

    .line 912
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->֫(Ll/֨۬ۚ;I)V

    .line 913
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܶۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ۧ(Ll/֨۬ۚ;I)V
    .locals 1

    .line 918
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->ۧ(Ll/֨۬ۚ;I)V

    .line 920
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܶۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 9

    .line 900
    iget-object v0, p0, Ll/ܶۧ֨;->ܳ:Ll/ۤۧ֨;

    invoke-static {v0}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;

    move-result-object v0

    iget-boolean v0, v0, Ll/ۢܽ֨;->ܽ֫:Z

    iget-object v1, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 901
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "bits "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    sget v3, Ll/᩻ۗۚ;->֫:I

    const/16 v3, 0x10

    :goto_0
    if-lez v3, :cond_1

    add-int/lit8 v4, v3, -0x1

    mul-int/lit8 v4, v4, 0x4

    shr-long v4, v1, v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 61
    :cond_1
    :goto_1
    invoke-static {v3, v1, v2}, Ll/᩻ۗۚ;->֫(IJ)Ljava/lang/String;

    move-result-object v1

    .line 901
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x6c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 903
    :cond_2
    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->toString()Ljava/lang/String;

    move-result-object v0

    .line 904
    invoke-virtual {v1}, Ljava/lang/Double;->isNaN()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1}, Ljava/lang/Double;->isInfinite()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "d"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_4
    :goto_2
    return-object v0
.end method
