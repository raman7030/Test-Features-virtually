.class public final Ll/ܰ᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 857
    iput-object p1, p0, Ll/ܰ᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 5

    .line 859
    iget-object p1, p0, Ll/ܰ᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    move-result v0

    .line 860
    invoke-static {}, Ll/ۖܶ۠;->ܳ()Ll/ۖܶ۠;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 862
    iget-object v3, p1, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    move-result v4

    invoke-virtual {v3, v4}, Ll/᩶ۢ۠;->֫(I)Ll/ܳ֡֨;

    move-result-object v3

    iget-object v3, v3, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {v1, v3}, Ll/ۖܶ۠;->ۧ(Ljava/lang/Object;)Ll/ۖܶ۠;

    move-result-object v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 863
    :cond_0
    iget-object p1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p1}, Ll/ۙ֨֨;->ۧ֫()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 864
    iget-object p1, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p1}, Ll/ۙ֨֨;->᩹()Ll/ۧ֨֨;

    move-result-object p1

    invoke-virtual {v1}, Ll/ۖܶ۠;->ᩳ()Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p1, Ll/ۧ֨֨;->᩺:Ll/ۖܶ۠;

    :cond_1
    return-void
.end method
