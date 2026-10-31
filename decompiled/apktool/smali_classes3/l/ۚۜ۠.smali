.class public final Ll/ۚۜ۠;
.super Ll/ۙ֨֨;
.source "Z5U8"


# instance fields
.field public final synthetic ۛ:Ll/᩶ۜ۠;

.field public final ۤ:Ll/ۤܶ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;I)V
    .locals 2

    .line 2895
    iput-object p1, p0, Ll/ۚۜ۠;->ۛ:Ll/᩶ۜ۠;

    .line 2896
    iget-object v0, p1, Ll/᩶ۜ۠;->ܳ֫:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->۠֫:Ll/᩶֡֨;

    sget-object v1, Ll/᩷۠֨;->ۧ:Ll/᩷۠֨;

    invoke-direct {p0, v0, v1}, Ll/ۙ֨֨;-><init>(Ll/᩶֡֨;Ll/᩷۠֨;)V

    .line 2897
    iget-object p1, p1, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {p1, p2}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۜ۠;->ۤ:Ll/ۤܶ۠;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "<ProxyType>"

    return-object v0
.end method

.method public final ֫(Ll/᩷۠֨;)Ll/ۙ֨֨;
    .locals 0

    .line 2907
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫֫()Ll/ۢ۠֨;
    .locals 1

    .line 2902
    sget-object v0, Ll/ۢ۠֨;->᩻֫:Ll/ۢ۠֨;

    return-object v0
.end method

.method public final ۫֫()Ll/ۙ֨֨;
    .locals 4

    .line 203
    iget-object v0, p0, Ll/ۚۜ۠;->ۤ:Ll/ۤܶ۠;

    invoke-virtual {v0}, Ll/ۤܶ۠;->֫()[B

    move-result-object v1

    invoke-virtual {v0}, Ll/ۤܶ۠;->ᩳ()I

    move-result v2

    invoke-virtual {v0}, Ll/ۤܶ۠;->ۧ()I

    move-result v0

    .line 425
    iget-object v3, p0, Ll/ۚۜ۠;->ۛ:Ll/᩶ۜ۠;

    iput-object v1, v3, Ll/᩶ۜ۠;->ܽ֫:[B

    .line 426
    iput v2, v3, Ll/᩶ۜ۠;->ܿ֫:I

    add-int/2addr v2, v0

    .line 427
    iput v2, v3, Ll/᩶ۜ۠;->ۧ֫:I

    .line 428
    invoke-virtual {v3}, Ll/᩶ۜ۠;->᩻()Ll/ۙ֨֨;

    move-result-object v0

    return-object v0
.end method
