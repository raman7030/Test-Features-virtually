.class public final Ll/۟᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 868
    iput-object p1, p0, Ll/۟᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 1

    .line 870
    check-cast p2, Ll/ܳ֡֨;

    .line 871
    iget-object p1, p0, Ll/۟᩻۠;->ܿ:Ll/᩶ۜ۠;

    iget-object v0, p1, Ll/᩶ۜ۠;->᩷:Ll/֡֡֨;

    iget-object v0, v0, Ll/֡֡֨;->֫֫:Ll/ܳ֡֨;

    if-ne v0, p2, :cond_1

    .line 2443
    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 2445
    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    .line 2446
    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    .line 2447
    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    .line 2448
    invoke-virtual {p1}, Ll/᩶ۜ۠;->ۧ()C

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 875
    :cond_1
    invoke-virtual {p1, p2}, Ll/᩶ۜ۠;->ۧ(Ll/ܳ֡֨;)V

    return-void
.end method
