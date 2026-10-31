.class public final Ll/۬᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 1206
    iput-object p1, p0, Ll/۬᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 6

    .line 1212
    iget-object p1, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne p1, v0, :cond_0

    .line 1213
    iget-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    const-wide/high16 v2, 0x2000000000000000L

    or-long/2addr v0, v2

    iput-wide v0, p2, Ll/ۛ֡֨;->᩶:J

    .line 1215
    :cond_0
    iget-object p1, p0, Ll/۬᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    move-result v0

    .line 1216
    new-instance v1, Ll/ᩴܶ۠;

    invoke-direct {v1}, Ll/ᩴܶ۠;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 1218
    iget-object v3, p1, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    move-result v4

    invoke-virtual {v3, v4}, Ll/᩶ۢ۠;->ᩳ(I)Ll/ۤܶ۠;

    move-result-object v3

    .line 1219
    iget-object v4, p1, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    move-result v5

    invoke-virtual {v4, v5}, Ll/᩶ۢ۠;->᩻(I)Ll/ۙ֨֨;

    move-result-object v4

    .line 1220
    new-instance v5, Ll/᩸֡֨;

    invoke-direct {v5, p2, v4, v3}, Ll/᩸֡֨;-><init>(Ll/ۛ֡֨;Ll/ۙ֨֨;Ll/ۤܶ۠;)V

    .line 1221
    sget-object v3, Ll/ۜۜ۠;->᩶:Ll/ۜۜ۠;

    invoke-virtual {p1, v5, v3}, Ll/᩶ۜ۠;->֫(Ll/ۛ֡֨;Ll/ۜۜ۠;)V

    .line 227
    invoke-virtual {v1, v5}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1224
    :cond_1
    check-cast p2, Ll/ܳ֡֨;

    invoke-virtual {v1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܳ֡֨;->᩷(Ll/ۖܶ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۜۜ۠;)Z
    .locals 0

    .line 1209
    invoke-super {p0, p1}, Ll/᩷ۜ۠;->֫(Ll/ۜۜ۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/۬᩻۠;->ܿ:Ll/᩶ۜ۠;

    iget-boolean p1, p1, Ll/᩶ۜ۠;->ۧ:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
