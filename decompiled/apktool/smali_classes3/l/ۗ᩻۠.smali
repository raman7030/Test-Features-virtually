.class public final Ll/ۗ᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 1193
    iput-object p1, p0, Ll/ۗ᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 6

    .line 1199
    iget-object p1, p2, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->᩻֫:Ll/֨ᩴ֨;

    if-ne p1, v0, :cond_2

    iget-object p1, p2, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object p2, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->۟:Ll/֨ᩴ֨;

    if-ne p2, v0, :cond_2

    .line 1200
    check-cast p1, Ll/֡֡֨;

    .line 1201
    iget-object p1, p1, Ll/֡֡֨;->ۜ֫:Ljava/util/EnumSet;

    iget-object p2, p0, Ll/ۗ᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    move-result p2

    .line 369
    const-class v0, Ll/᩵֡֨;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 370
    invoke-static {}, Ll/᩵֡֨;->values()[Ll/᩵֡֨;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 371
    iget v5, v4, Ll/᩵֡֨;->᩸:I

    and-int/2addr v5, p2

    if-eqz v5, :cond_0

    .line 372
    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1201
    :cond_1
    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ۜۜ۠;)Z
    .locals 0

    .line 1196
    invoke-super {p0, p1}, Ll/᩷ۜ۠;->֫(Ll/ۜۜ۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ll/ۗ᩻۠;->ܿ:Ll/᩶ۜ۠;

    iget-boolean p1, p1, Ll/᩶ۜ۠;->֫:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
