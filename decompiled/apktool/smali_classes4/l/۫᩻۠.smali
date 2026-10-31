.class public final Ll/۫᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 1227
    iput-object p1, p0, Ll/۫᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 5

    .line 1233
    iget-object p1, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne p1, v0, :cond_1

    .line 1234
    new-instance p1, Ll/ᩴܶ۠;

    invoke-direct {p1}, Ll/ᩴܶ۠;-><init>()V

    .line 1235
    iget-object v0, p0, Ll/۫᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-virtual {v0}, Ll/᩶ۜ۠;->ۧ()C

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 1237
    iget-object v3, v0, Ll/᩶ۜ۠;->۬:Ll/᩶ۢ۠;

    invoke-virtual {v0}, Ll/᩶ۜ۠;->ۧ()C

    move-result v4

    invoke-virtual {v3, v4}, Ll/᩶ۢ۠;->֫(I)Ll/ܳ֡֨;

    move-result-object v3

    .line 227
    invoke-virtual {p1, v3}, Ll/ᩴܶ۠;->֫(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1239
    :cond_0
    check-cast p2, Ll/ܳ֡֨;

    invoke-virtual {p1}, Ll/ᩴܶ۠;->ܿ()Ll/ۖܶ۠;

    move-result-object p1

    iput-object p1, p2, Ll/ܳ֡֨;->ۧ֫:Ll/ۖܶ۠;

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۜۜ۠;)Z
    .locals 0

    .line 1230
    invoke-super {p0, p1}, Ll/᩷ۜ۠;->֫(Ll/ۜۜ۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/۫᩻۠;->ܿ:Ll/᩶ۜ۠;

    iget-boolean p1, p1, Ll/᩶ۜ۠;->ܽ:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
