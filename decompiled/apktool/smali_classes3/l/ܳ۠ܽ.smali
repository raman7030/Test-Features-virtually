.class public final Ll/ܳ۠ܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# static fields
.field public static final ֫:[I

.field public static final ۧ:Ll/ۛۚܽ;

.field public static final ܽ:Ll/ܶۚܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x1000

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const v3, 0xffff

    if-gt v1, v3, :cond_3

    .line 2566
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v3

    if-ne v3, v1, :cond_0

    .line 2567
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v3

    if-eq v3, v1, :cond_2

    .line 2568
    :cond_0
    array-length v3, v0

    if-ne v2, v3, :cond_1

    mul-int/lit8 v3, v2, 0x2

    .line 2569
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    :cond_1
    add-int/lit8 v3, v2, 0x1

    .line 2571
    aput v1, v0, v2

    move v2, v3

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2574
    :cond_3
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    sput-object v0, Ll/ܳ۠ܽ;->֫:[I

    .line 2852
    new-instance v0, Ll/ۛۚܽ;

    invoke-direct {v0}, Ll/ۛۚܽ;-><init>()V

    sput-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2854
    new-instance v0, Ll/ܶۚܽ;

    invoke-direct {v0}, Ll/ܶۚܽ;-><init>()V

    sput-object v0, Ll/ܳ۠ܽ;->ܽ:Ll/ܶۚܽ;

    return-void
.end method

.method public static ֫(Ll/ۧۚܽ;)I
    .locals 1

    .line 2483
    instance-of v0, p0, Ll/ܶ֡ܽ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ܶ֡ܽ;

    invoke-static {p0}, Ll/ܶ֡ܽ;->֫(Ll/ܶ֡ܽ;)[J

    move-result-object p0

    array-length p0, p0

    shl-int/lit8 p0, p0, 0x6

    return p0

    .line 2484
    :cond_0
    instance-of v0, p0, Ll/ᩴ֡ܽ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ᩴ֡ܽ;

    invoke-static {p0}, Ll/ᩴ֡ܽ;->֫(Ll/ᩴ֡ܽ;)[J

    move-result-object p0

    array-length p0, p0

    shl-int/lit8 p0, p0, 0x6

    return p0

    .line 2478
    :cond_1
    invoke-static {p0}, Ll/ܿ֨ܽ;->֫(Ll/ۧۚܽ;)I

    move-result p0

    if-ltz p0, :cond_2

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_2
    const/high16 p0, 0x10000

    return p0
.end method

.method public static ֫(Ll/ۧۚܽ;Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;
    .locals 0

    .line 2370
    invoke-static {p0, p1, p3}, Ll/۟᩵ܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;

    move-result-object p0

    invoke-static {p0, p2, p3}, Ll/۟᩵ܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;Z)Ll/ۧۚܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(I)Ll/᩹֡ܽ;
    .locals 1

    .line 2473
    new-instance v0, Ll/᩷֨ܽ;

    invoke-direct {v0, p0}, Ll/᩷֨ܽ;-><init>(I)V

    return-object v0
.end method

.method public static ֫(Ll/ۛۚܽ;)Ll/᩻֨ܽ;
    .locals 2

    .line 1362
    instance-of v0, p0, Ll/ۗۚܽ;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ll/ۗۚܽ;

    .line 1363
    invoke-static {v0}, Ll/ۗۚܽ;->֫(Ll/ۗۚܽ;)Ll/ۙۚܽ;

    move-result-object v0

    invoke-static {v0}, Ll/۫ۤ᩷;->֫(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Ll/ܳ֨ܽ;

    .line 1364
    new-instance p0, Ll/᩻֨ܽ;

    invoke-static {v0}, Ll/ܳ֨ܽ;->֫(Ll/ܳ֨ܽ;)Ll/ܿ֨ܽ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/᩻֨ܽ;-><init>(Ll/ܿ֨ܽ;)V

    return-object p0

    .line 1366
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Unknown looking-at check: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ֫()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ܳ۠ܽ;->֫:[I

    return-object v0
.end method

.method public static ֫(Ll/ۨ֡ܽ;)[I
    .locals 0

    .line 1961
    invoke-static {p0}, Ll/ۨ֡ܽ;->֫(Ll/ۨ֡ܽ;)[I

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۛۚܽ;)Ll/ۧۚܽ;
    .locals 1

    .line 1750
    instance-of v0, p0, Ll/۫ۚܽ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/۫ۚܽ;

    iget-object p0, p0, Ll/۫ۚܽ;->ۧ:Ll/ۧۚܽ;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(I)Z
    .locals 1

    const/high16 v0, 0x10000

    if-ge p0, v0, :cond_1

    int-to-char p0, p0

    .line 75
    sget v0, Ll/֫᩻᩵;->֫:I

    const v0, 0xd800

    if-lt p0, v0, :cond_0

    const v0, 0xe000

    if-ge p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ܽ(Ll/ۛۚܽ;)Ll/ۜ֨ܽ;
    .locals 3

    .line 1304
    instance-of v0, p0, Ll/֡֨ܽ;

    if-eqz v0, :cond_5

    move-object v0, p0

    check-cast v0, Ll/֡֨ܽ;

    .line 1305
    new-instance v1, Ll/ۜ֨ܽ;

    .line 1294
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1306
    iget v0, v0, Ll/֡֨ܽ;->ۧ:I

    iput v0, v1, Ll/ۜ֨ܽ;->ܿ:I

    .line 1307
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ll/᩶֨ܽ;

    if-ne v0, v2, :cond_0

    .line 1308
    check-cast p0, Ll/᩶֨ܽ;

    const/4 v0, 0x1

    .line 1309
    iput v0, v1, Ll/ۜ֨ܽ;->ܽ:I

    .line 1310
    invoke-static {p0}, Ll/᩶֨ܽ;->ۧ(Ll/᩶֨ܽ;)Ll/ۢ֨ܽ;

    move-result-object v0

    iput-object v0, v1, Ll/ۜ֨ܽ;->ܳ:Ll/ۛۚܽ;

    .line 1311
    invoke-static {p0}, Ll/᩶֨ܽ;->ۧ(Ll/᩶֨ܽ;)Ll/ۢ֨ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    iput-object v0, v1, Ll/ۜ֨ܽ;->ۢ:Ll/ۛۚܽ;

    .line 1312
    invoke-static {p0}, Ll/᩶֨ܽ;->֫(Ll/᩶֨ܽ;)[I

    move-result-object p0

    invoke-virtual {p0}, [I->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    iput-object p0, v1, Ll/ۜ֨ܽ;->ᩳ:[I

    return-object v1

    .line 1313
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ll/ۚ֨ܽ;

    if-ne v0, v2, :cond_1

    .line 1314
    check-cast p0, Ll/ۚ֨ܽ;

    const/4 v0, 0x2

    .line 1315
    iput v0, v1, Ll/ۜ֨ܽ;->ܽ:I

    .line 1316
    invoke-static {p0}, Ll/ۚ֨ܽ;->֫(Ll/ۚ֨ܽ;)Ll/᩶֡ܽ;

    move-result-object v0

    iput-object v0, v1, Ll/ۜ֨ܽ;->ܳ:Ll/ۛۚܽ;

    .line 1317
    invoke-static {p0}, Ll/ۚ֨ܽ;->֫(Ll/ۚ֨ܽ;)Ll/᩶֡ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    iput-object v0, v1, Ll/ۜ֨ܽ;->ۢ:Ll/ۛۚܽ;

    .line 1318
    invoke-static {p0}, Ll/ۚ֨ܽ;->ۧ(Ll/ۚ֨ܽ;)Ll/ۧۚܽ;

    move-result-object p0

    iput-object p0, v1, Ll/ۜ֨ܽ;->᩻:Ll/ۧۚܽ;

    return-object v1

    .line 1319
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ll/۠֨ܽ;

    if-ne v0, v2, :cond_2

    .line 1320
    check-cast p0, Ll/۠֨ܽ;

    const/4 v0, 0x3

    .line 1321
    iput v0, v1, Ll/ۜ֨ܽ;->ܽ:I

    .line 1322
    invoke-static {p0}, Ll/۠֨ܽ;->ۧ(Ll/۠֨ܽ;)Ll/ۛۚܽ;

    move-result-object v0

    iput-object v0, v1, Ll/ۜ֨ܽ;->ܳ:Ll/ۛۚܽ;

    .line 1323
    invoke-static {p0}, Ll/۠֨ܽ;->֫(Ll/۠֨ܽ;)Ll/ۗ֡ܽ;

    move-result-object v0

    invoke-static {v0}, Ll/ۗ֡ܽ;->֫(Ll/ۗ֡ܽ;)[C

    move-result-object v0

    invoke-static {p0}, Ll/۠֨ܽ;->֫(Ll/۠֨ܽ;)Ll/ۗ֡ܽ;

    move-result-object p0

    invoke-static {p0}, Ll/ۗ֡ܽ;->ۧ(Ll/ۗ֡ܽ;)I

    move-result p0

    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object p0

    iput-object p0, v1, Ll/ۜ֨ܽ;->ۧ:[C

    return-object v1

    .line 1324
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ll/֨֨ܽ;

    if-ne v0, v2, :cond_3

    .line 1325
    check-cast p0, Ll/֨֨ܽ;

    const/4 v0, 0x4

    .line 1326
    iput v0, v1, Ll/ۜ֨ܽ;->ܽ:I

    .line 1327
    invoke-static {p0}, Ll/֨֨ܽ;->֫(Ll/֨֨ܽ;)Ll/ۙ֡ܽ;

    move-result-object v0

    iput-object v0, v1, Ll/ۜ֨ܽ;->ܳ:Ll/ۛۚܽ;

    .line 1328
    invoke-static {p0}, Ll/֨֨ܽ;->ۧ(Ll/֨֨ܽ;)Ll/ۧۚܽ;

    move-result-object p0

    iput-object p0, v1, Ll/ۜ֨ܽ;->᩻:Ll/ۧۚܽ;

    return-object v1

    .line 1329
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ll/᩸֨ܽ;

    if-ne v0, v2, :cond_4

    .line 1330
    check-cast p0, Ll/᩸֨ܽ;

    const/4 v0, 0x5

    .line 1331
    iput v0, v1, Ll/ۜ֨ܽ;->ܽ:I

    .line 1332
    invoke-static {p0}, Ll/᩸֨ܽ;->ۧ(Ll/᩸֨ܽ;)Ll/ۛۚܽ;

    move-result-object v0

    iput-object v0, v1, Ll/ۜ֨ܽ;->ܳ:Ll/ۛۚܽ;

    .line 1333
    new-instance v0, Ll/᩻֨ܽ;

    invoke-static {p0}, Ll/᩸֨ܽ;->ܽ(Ll/᩸֨ܽ;)Ll/ܿ֨ܽ;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/᩻֨ܽ;-><init>(Ll/ܿ֨ܽ;)V

    iput-object v0, v1, Ll/ۜ֨ܽ;->᩷:Ll/᩻֨ܽ;

    .line 1334
    invoke-static {p0}, Ll/᩸֨ܽ;->֫(Ll/᩸֨ܽ;)Ll/ۛۚܽ;

    move-result-object p0

    iput-object p0, v1, Ll/ۜ֨ܽ;->֫:Ll/ۛۚܽ;

    return-object v1

    .line 1335
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ll/ܶ֨ܽ;

    if-ne v0, v2, :cond_5

    .line 1336
    check-cast p0, Ll/ܶ֨ܽ;

    const/4 v0, 0x6

    .line 1337
    iput v0, v1, Ll/ۜ֨ܽ;->ܽ:I

    .line 1338
    invoke-static {p0}, Ll/ܶ֨ܽ;->ۧ(Ll/ܶ֨ܽ;)Ll/᩷ۚܽ;

    move-result-object v0

    iput-object v0, v1, Ll/ۜ֨ܽ;->ܳ:Ll/ۛۚܽ;

    .line 1339
    new-instance v0, Ll/᩻֨ܽ;

    invoke-static {p0}, Ll/ܶ֨ܽ;->ᩳ(Ll/ܶ֨ܽ;)Ll/ܿ֨ܽ;

    move-result-object v2

    invoke-direct {v0, v2}, Ll/᩻֨ܽ;-><init>(Ll/ܿ֨ܽ;)V

    iput-object v0, v1, Ll/ۜ֨ܽ;->᩷:Ll/᩻֨ܽ;

    .line 1340
    invoke-static {p0}, Ll/ܶ֨ܽ;->֫(Ll/ܶ֨ܽ;)Ll/ۧۚܽ;

    move-result-object v0

    iput-object v0, v1, Ll/ۜ֨ܽ;->᩻:Ll/ۧۚܽ;

    .line 1341
    invoke-static {p0}, Ll/ܶ֨ܽ;->ܽ(Ll/ܶ֨ܽ;)I

    move-result p0

    iput p0, v1, Ll/ۜ֨ܽ;->ۜ:I

    return-object v1

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩳ(Ll/ۛۚܽ;)Ll/۟ۘܽ;
    .locals 0

    .line 2857
    invoke-static {p0}, Ll/ᩳ֨ܽ;->֫(Ll/ۛۚܽ;)Ll/۟ۘܽ;

    move-result-object p0

    return-object p0
.end method
