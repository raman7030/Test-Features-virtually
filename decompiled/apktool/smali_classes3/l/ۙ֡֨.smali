.class public final Ll/ۙ֡֨;
.super Ll/᩶֡֨;
.source "643O"

# interfaces
.implements Ll/ܺ᩹۠;


# direct methods
.method public constructor <init>(JLl/ۤܶ۠;Ll/ۡ֨֨;Ll/ۛ֡֨;)V
    .locals 7

    .line 887
    sget-object v1, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 799
    invoke-direct/range {v0 .. v6}, Ll/ۛ֡֨;-><init>(Ll/֨ᩴ֨;JLl/ۤܶ۠;Ll/ۙ֨֨;Ll/ۛ֡֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۠᩹۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 957
    invoke-virtual {p1, p0, p2}, Ll/۠᩹۠;->֫(Ll/ۙ֡֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/᩺᩸۠;
    .locals 1

    .line 892
    sget-object v0, Ll/᩺᩸۠;->᩷֫:Ll/᩺᩸۠;

    return-object v0
.end method

.method public final ۤ()Ll/ۖܶ۠;
    .locals 7

    .line 920
    iget-object v0, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v0}, Ll/ۛ֡֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object v0

    .line 921
    iget-object v1, p0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->ᩳ֫()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v1, p0}, Ll/ۖܶ۠;->indexOf(Ljava/lang/Object;)I

    move-result v1

    .line 922
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v2

    .line 923
    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۘ֨;

    .line 949
    iget-object v4, v3, Ll/ܽۘ֨;->ۧ:Ll/ۤ֨֨;

    iget-object v5, v4, Ll/ۤ֨֨;->ۖ:Ll/ۢۚ֨;

    sget-object v6, Ll/ۢۚ֨;->۬:Ll/ۢۚ֨;

    if-eq v5, v6, :cond_1

    sget-object v6, Ll/ۢۚ֨;->᩷֫:Ll/ۢۚ֨;

    if-ne v5, v6, :cond_0

    :cond_1
    iget v4, v4, Ll/ۤ֨֨;->ۡ:I

    if-ne v4, v1, :cond_0

    .line 925
    invoke-virtual {v2, v3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v2

    goto :goto_0

    .line 928
    :cond_2
    invoke-virtual {v2}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ᩷()Ll/ۖܶ۠;
    .locals 1

    .line 883
    invoke-virtual {p0}, Ll/ۙ֡֨;->ۤ()Ll/ۖܶ۠;

    move-result-object v0

    return-object v0
.end method
