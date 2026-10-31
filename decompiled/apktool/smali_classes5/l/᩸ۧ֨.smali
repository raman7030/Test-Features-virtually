.class public final Ll/᩸ۧ֨;
.super Ll/ۗۧ֨;
.source "K3OA"


# instance fields
.field public final synthetic ܳ:Ll/ۤۧ֨;


# direct methods
.method public constructor <init>(Ll/ۤۧ֨;Ll/۫ۧ֨;F)V
    .locals 0

    .line 857
    iput-object p1, p0, Ll/᩸ۧ֨;->ܳ:Ll/ۤۧ֨;

    .line 858
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-direct {p0, p1, p2, p3}, Ll/ۗۧ֨;-><init>(Ll/ۤۧ֨;Ll/۫ۧ֨;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֨۬ۚ;I)V
    .locals 1

    .line 875
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->֫(Ll/֨۬ۚ;I)V

    .line 876
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩸ۧ֨;->ܽ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ";"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/֨۬ۚ;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ(Ll/֨۬ۚ;I)V
    .locals 1

    .line 881
    invoke-super {p0, p1, p2}, Ll/ۗۧ֨;->ۧ(Ll/֨۬ۚ;I)V

    .line 883
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/᩸ۧ֨;->ܽ()Ljava/lang/String;

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
    .locals 3

    .line 863
    iget-object v0, p0, Ll/᩸ۧ֨;->ܳ:Ll/ۤۧ֨;

    invoke-static {v0}, Ll/ۤۧ֨;->֫(Ll/ۤۧ֨;)Ll/᩷ۧ֨;

    move-result-object v0

    iget-boolean v0, v0, Ll/ۢܽ֨;->ܽ֫:Z

    iget-object v1, p0, Ll/ۗۧ֨;->ܿ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 864
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "bits "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-static {v1}, Ll/᩻ۗۚ;->֫(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 866
    :cond_0
    move-object v0, v1

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->toString()Ljava/lang/String;

    move-result-object v0

    .line 867
    move-object v2, v1

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->isNaN()Z

    move-result v2

    if-nez v2, :cond_2

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->isInfinite()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "f"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    :goto_0
    return-object v0
.end method
