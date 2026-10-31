.class public final Ll/۫ۚۖ;
.super Ljava/lang/Object;
.source "P9QN"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public ᩸:Ljava/lang/Object;

.field public ᩹:Ll/᩶᩵ۖ;


# direct methods
.method public constructor <init>(Ll/֡ۖۖ;Ljava/lang/Object;)V
    .locals 1

    .line 291
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 292
    instance-of v0, p2, Ll/᩶᩵ۖ;

    if-eqz v0, :cond_0

    .line 293
    check-cast p2, Ll/᩶᩵ۖ;

    iput-object p2, p0, Ll/۫ۚۖ;->᩹:Ll/᩶᩵ۖ;

    goto :goto_0

    .line 295
    :cond_0
    iput-object p2, p0, Ll/۫ۚۖ;->᩸:Ljava/lang/Object;

    .line 301
    :goto_0
    invoke-virtual {p1}, Ll/֡ۖۖ;->᩸()Ll/ᩳۖۖ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳۖۖ;->getFields()Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֡ۖۖ;

    invoke-virtual {p1}, Ll/֡ۖۖ;->ܶ()Ll/ᩴۖۖ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 283
    check-cast p1, Ll/۫ۚۖ;

    .line 321
    invoke-static {}, Ll/ۨۚۖ;->֫()Ljava/util/logging/Logger;

    move-result-object p1

    const-string v0, "Invalid key for map field."

    invoke-virtual {p1, v0}, Ljava/util/logging/Logger;->info(Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 312
    iget-object v0, p0, Ll/۫ۚۖ;->᩹:Ll/᩶᩵ۖ;

    if-eqz v0, :cond_0

    return-object v0

    .line 315
    :cond_0
    iget-object v0, p0, Ll/۫ۚۖ;->᩸:Ljava/lang/Object;

    return-object v0
.end method
