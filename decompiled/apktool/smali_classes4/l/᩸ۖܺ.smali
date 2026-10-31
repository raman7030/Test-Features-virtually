.class public final Ll/᩸ۖܺ;
.super Ljava/lang/Object;
.source "ABG3"


# instance fields
.field public final ֫:Ll/᩷ۘܺ;


# direct methods
.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Ll/᩸ۖܺ;->֫:Ll/᩷ۘܺ;

    return-void
.end method

.method private ֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;ILl/ܰۡܺ;)V
    .locals 8

    .line 194
    invoke-virtual {p1}, Ll/۫ۖܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v0

    .line 195
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    invoke-static {p3, v1, p2, p4}, Ll/۫ۡܺ;->֫(ILl/֫ۖܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)Ll/ۗۡܺ;

    move-result-object v3

    if-nez p4, :cond_0

    .line 198
    new-instance p3, Ll/֨ۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object p4

    .line 199
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v0

    invoke-direct {p3, v3, p4, v0, p2}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    goto :goto_0

    .line 201
    :cond_0
    new-instance p3, Ll/ۚۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۜ()Ll/ۤۡܺ;

    move-result-object v4

    .line 202
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    move-object v2, p3

    move-object v6, p2

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Ll/ۚۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 204
    :goto_0
    new-instance p2, Ll/۫ۖܺ;

    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p4

    invoke-direct {p2, p3, p4}, Ll/۫ۖܺ;-><init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V

    .line 206
    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p3

    invoke-virtual {p3}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object p3

    .line 208
    iget-object p4, p0, Ll/᩸ۖܺ;->֫:Ll/᩷ۘܺ;

    invoke-virtual {p4, p1}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;)V

    .line 209
    invoke-interface {p3, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-interface {p3, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 574
    invoke-virtual {p4, p2, p1}, Ll/᩷ۘܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;)V

    .line 575
    invoke-virtual {p4, p2, p1}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;)V

    return-void
.end method

.method public static ֫(Ll/᩷ۘܺ;)V
    .locals 3

    .line 56
    new-instance v0, Ll/᩸ۖܺ;

    invoke-direct {v0, p0}, Ll/᩸ۖܺ;-><init>(Ll/᩷ۘܺ;)V

    .line 85
    invoke-static {}, Ll/ۛۖܺ;->֫()Ll/᩻ۡܺ;

    move-result-object v1

    .line 87
    new-instance v2, Ll/ܶۖܺ;

    invoke-direct {v2, v0, v1}, Ll/ܶۖܺ;-><init>(Ll/᩸ۖܺ;Ll/᩻ۡܺ;)V

    invoke-virtual {p0, v2}, Ll/᩷ۘܺ;->֫(Ll/ܿۘܺ;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ۖܺ;Ll/۫ۖܺ;Ll/᩶ۡܺ;I)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, p1, p2, p3, v0}, Ll/᩸ۖܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;ILl/ܰۡܺ;)V

    return-void
.end method

.method public static ֫(Ll/᩸ۖܺ;Ll/۫ۖܺ;)Z
    .locals 7

    .line 152
    iget-object v0, p0, Ll/᩸ۖܺ;->֫:Ll/᩷ۘܺ;

    invoke-virtual {p1}, Ll/۫ۖܺ;->ܺ()Ll/ܺۡܺ;

    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v1

    .line 154
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 156
    invoke-virtual {v0, v2}, Ll/᩷ۘܺ;->֫(Ll/᩸ۡܺ;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 157
    invoke-virtual {v1}, Ll/ۗۡܺ;->ᩳ()I

    move-result v2

    const/4 v4, 0x5

    if-eq v2, v4, :cond_1

    .line 158
    invoke-virtual {p1}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v2

    .line 159
    invoke-interface {v2}, Ll/֫ۖܺ;->ۡ()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ll/֫ۖܺ;->ܿ()I

    move-result v5

    const/4 v6, 0x6

    if-ne v5, v6, :cond_1

    .line 161
    sget-object v5, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    check-cast v2, Ll/ܰۡܺ;

    invoke-direct {p0, p1, v5, v4, v2}, Ll/᩸ۖܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;ILl/ܰۡܺ;)V

    .line 165
    invoke-virtual {v1}, Ll/ۗۡܺ;->ᩳ()I

    move-result v1

    const/16 v2, 0x38

    const/4 v4, 0x1

    if-ne v1, v2, :cond_0

    .line 166
    invoke-virtual {p1}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۘܺ;->᩻()Ljava/util/BitSet;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result p1

    .line 168
    invoke-virtual {v0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽۘܺ;

    invoke-virtual {p1}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object p1

    .line 0
    invoke-static {p1, v4}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p1

    .line 170
    check-cast p1, Ll/۫ۖܺ;

    const/4 v0, 0x0

    .line 171
    invoke-direct {p0, p1, v5, v6, v0}, Ll/᩸ۖܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;ILl/ܰۡܺ;)V

    :cond_0
    return v4

    :cond_1
    return v3
.end method
