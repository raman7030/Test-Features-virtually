.class public final Ll/ᩴ᩵۠;
.super Ll/ۨ֡۠;
.source "H44W"

# interfaces
.implements Ll/᩷ۡ֨;


# static fields
.field public static final ۨ:Ll/ۜۡ֨;

.field public static final ᩺:Ll/ۜۡ֨;


# instance fields
.field public ۗ:Ll/ۚۚ۠;

.field public ۛ:Ll/ۖܶ۠;

.field public ۤ:Ll/ۖܶ۠;

.field public ۫:Z

.field public final ۬:Ll/ۜۡ֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1325
    sget-object v0, Ll/ۜۡ֨;->᩶:Ll/ۜۡ֨;

    sput-object v0, Ll/ᩴ᩵۠;->᩺:Ll/ۜۡ֨;

    .line 1326
    sget-object v0, Ll/ۜۡ֨;->᩹:Ll/ۜۡ֨;

    sput-object v0, Ll/ᩴ᩵۠;->ۨ:Ll/ۜۡ֨;

    return-void
.end method

.method public constructor <init>(Ll/ۜۡ֨;Ll/ۖܶ۠;Ll/ۖܶ۠;Ll/ۚۚ۠;)V
    .locals 1

    .line 1333
    invoke-direct {p0}, Ll/ۨ֡۠;-><init>()V

    .line 1334
    invoke-static {p2}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 1335
    invoke-virtual {p2}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 1336
    iput-object p1, p0, Ll/ᩴ᩵۠;->۬:Ll/ۜۡ֨;

    .line 1337
    iput-object p2, p0, Ll/ᩴ᩵۠;->ۤ:Ll/ۖܶ۠;

    .line 1338
    iput-object p3, p0, Ll/ᩴ᩵۠;->ۛ:Ll/ۖܶ۠;

    .line 1339
    iput-object p4, p0, Ll/ᩴ᩵۠;->ۗ:Ll/ۚۚ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1364
    invoke-interface {p1, p0, p2}, Ll/۫ܺ֨;->֫(Ll/ᩴ᩵۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֨;
    .locals 1

    .line 1345
    sget-object v0, Ll/ۗܺ֨;->ᩳ֫:Ll/ۗܺ֨;

    return-object v0
.end method

.method public final ֫(Ll/֡ۚ۠;)V
    .locals 0

    .line 1342
    invoke-virtual {p1, p0}, Ll/֡ۚ۠;->֫(Ll/ᩴ᩵۠;)V

    return-void
.end method

.method public final ۗ()Ll/ۖܶ۠;
    .locals 2

    .line 1354
    iget-object v0, p0, Ll/ᩴ᩵۠;->۬:Ll/ۜۡ֨;

    sget-object v1, Ll/ۜۡ֨;->᩶:Ll/ۜۡ֨;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ᩴ᩵۠;->ۛ:Ll/ۖܶ۠;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܽ֫()Ll/ᩴۚ۠;
    .locals 1

    .line 1368
    sget-object v0, Ll/ᩴۚ۠;->ܿ֫:Ll/ᩴۚ۠;

    return-object v0
.end method

.method public final ܿ֫()Ll/ۖܶ۠;
    .locals 3

    .line 1349
    iget-object v0, p0, Ll/ᩴ᩵۠;->ۤ:Ll/ۖܶ۠;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܽۨ᩷;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ܽۨ᩷;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ᩴۚܳ;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ll/ᩴۚܳ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {}, Ll/ۖܶ۠;->ܿ()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖܶ۠;

    return-object v0
.end method
