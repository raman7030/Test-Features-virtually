.class public final Ll/ۖۖۖ;
.super Ll/֨ۖۖ;
.source "99PI"

# interfaces
.implements Ll/ۗᩴۖ;


# static fields
.field public static final ۫:Ljava/util/Comparator;


# instance fields
.field public ۗ:Ll/ᩳۢۖ;

.field public final ۙ:I

.field public final ۬:Ll/ۢۖۖ;

.field public final ᩶:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2342
    new-instance v0, Ll/ۡۖۖ;

    .line 2343
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2342
    sput-object v0, Ll/ۖۖۖ;->۫:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ll/ۢۖۖ;Ljava/lang/Integer;)V
    .locals 2

    const/4 v0, 0x0

    .line 2451
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    .line 2452
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UNKNOWN_ENUM_VALUE_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۢۖۖ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2454
    invoke-static {}, Ll/ᩳۢۖ;->newBuilder()Ll/ܽۢۖ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܽۢۖ;->֫(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v1, p2}, Ll/ܽۢۖ;->֫(I)V

    .line 17959
    invoke-virtual {v1}, Ll/ܽۢۖ;->buildPartial()Ll/ᩳۢۖ;

    move-result-object p2

    .line 17960
    invoke-virtual {p2}, Ll/ᩳۢۖ;->isInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2455
    iput-object p1, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    const/4 v0, -0x1

    .line 2456
    iput v0, p0, Ll/ۖۖۖ;->ۙ:I

    .line 2457
    iput-object p2, p0, Ll/ۖۖۖ;->ۗ:Ll/ᩳۢۖ;

    .line 2458
    iput-object p1, p0, Ll/ۖۖۖ;->۬:Ll/ۢۖۖ;

    .line 2459
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۢۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ll/ᩳۢۖ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۖۖۖ;->᩶:Ljava/lang/String;

    return-void

    .line 17961
    :cond_0
    invoke-static {p2}, Ll/᩷ۜۖ;->֫(Ll/᩻֡ۖ;)Ll/ᩳ֨ۖ;

    move-result-object p1

    throw p1
.end method

.method public constructor <init>(Ll/ᩳۢۖ;Ll/ۚۖۖ;Ll/ۢۖۖ;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2441
    invoke-direct {p0, v0}, Ll/֨ۖۖ;-><init>(I)V

    .line 2442
    iput-object p3, p0, Ll/֨ۖۖ;->᩹:Ll/֨ۖۖ;

    .line 2443
    iput p4, p0, Ll/ۖۖۖ;->ۙ:I

    .line 2444
    iput-object p1, p0, Ll/ۖۖۖ;->ۗ:Ll/ᩳۢۖ;

    .line 2445
    iput-object p3, p0, Ll/ۖۖۖ;->۬:Ll/ۢۖۖ;

    .line 2446
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Ll/ۢۖۖ;->ܿ()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x2e

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ᩳۢۖ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۖۖۖ;->᩶:Ljava/lang/String;

    .line 2447
    invoke-static {p2}, Ll/ۚۖۖ;->֫(Ll/ۚۖۖ;)Ll/᩻ۖۖ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/᩻ۖۖ;->֫(Ll/֨ۖۖ;)V

    return-void
.end method

.method public static ֫(Ll/ۖۖۖ;)V
    .locals 1

    .line 2466
    iget-object v0, p0, Ll/ۖۖۖ;->ۗ:Ll/ᩳۢۖ;

    invoke-virtual {v0}, Ll/ᩳۢۖ;->᩷()Ll/᩻ۢۖ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ۢۖ;->ۘ()Ll/ۛۢۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֨ۖۖ;->֫(Ll/ۛۢۖ;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 2376
    iget-object v0, p0, Ll/ۖۖۖ;->ۗ:Ll/ᩳۢۖ;

    invoke-virtual {v0}, Ll/ᩳۢۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getNumber()I
    .locals 1

    .line 2382
    iget-object v0, p0, Ll/ۖۖۖ;->ۗ:Ll/ᩳۢۖ;

    invoke-virtual {v0}, Ll/ᩳۢۖ;->ۜ()I

    move-result v0

    return v0
.end method

.method public final getType()Ll/ۢۖۖ;
    .locals 1

    .line 2408
    iget-object v0, p0, Ll/ۖۖۖ;->۬:Ll/ۢۖۖ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 2387
    iget-object v0, p0, Ll/ۖۖۖ;->ۗ:Ll/ᩳۢۖ;

    invoke-virtual {v0}, Ll/ᩳۢۖ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۢ()Ll/᩻֡ۖ;
    .locals 1

    .line 2370
    iget-object v0, p0, Ll/ۖۖۖ;->ۗ:Ll/ᩳۢۖ;

    return-object v0
.end method

.method public final ۧ()Ll/ۚۖۖ;
    .locals 1

    .line 2403
    iget-object v0, p0, Ll/ۖۖۖ;->۬:Ll/ۢۖۖ;

    invoke-static {v0}, Ll/ۢۖۖ;->ۧ(Ll/ۢۖۖ;)Ll/ۚۖۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ܺ()I
    .locals 1

    .line 2364
    iget v0, p0, Ll/ۖۖۖ;->ۙ:I

    return v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 2397
    iget-object v0, p0, Ll/ۖۖۖ;->᩶:Ljava/lang/String;

    return-object v0
.end method
