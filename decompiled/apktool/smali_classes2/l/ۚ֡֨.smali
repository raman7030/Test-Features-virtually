.class public final enum Ll/ۚ֡֨;
.super Ljava/lang/Enum;
.source "643O"


# static fields
.field public static final enum ۗ:Ll/ۚ֡֨;

.field public static final enum ۙ:Ll/ۚ֡֨;

.field public static final enum ۛ:Ll/ۚ֡֨;

.field public static final enum ۤ:Ll/ۚ֡֨;

.field public static final enum ۨ:Ll/ۚ֡֨;

.field public static final enum ۫:Ll/ۚ֡֨;

.field public static final enum ۬:Ll/ۚ֡֨;

.field public static final ܰ:I

.field public static final synthetic ᩶:[Ll/ۚ֡֨;

.field public static final enum ᩺:Ll/ۚ֡֨;


# instance fields
.field public final ᩸:I

.field public final ᩹:Ll/ᩴۚ۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 2463
    new-instance v0, Ll/ۚ֡֨;

    sget-object v1, Ll/ᩴۚ۠;->ۘۧ:Ll/ᩴۚ۠;

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    const/4 v4, -0x1

    invoke-direct {v0, v2, v3, v4, v1}, Ll/ۚ֡֨;-><init>(Ljava/lang/String;IILl/ᩴۚ۠;)V

    sput-object v0, Ll/ۚ֡֨;->᩺:Ll/ۚ֡֨;

    .line 2464
    new-instance v0, Ll/ۚ֡֨;

    const-string v2, "DEREF"

    const/4 v4, 0x1

    invoke-direct {v0, v2, v4, v3, v1}, Ll/ۚ֡֨;-><init>(Ljava/lang/String;IILl/ᩴۚ۠;)V

    sput-object v0, Ll/ۚ֡֨;->ۗ:Ll/ۚ֡֨;

    .line 2465
    new-instance v0, Ll/ۚ֡֨;

    const/4 v2, 0x2

    sget-object v3, Ll/ᩴۚ۠;->ۤ:Ll/ᩴۚ۠;

    const-string v4, "ASSIGN"

    invoke-direct {v0, v4, v2, v2, v3}, Ll/ۚ֡֨;-><init>(Ljava/lang/String;IILl/ᩴۚ۠;)V

    sput-object v0, Ll/ۚ֡֨;->ۙ:Ll/ۚ֡֨;

    .line 2466
    new-instance v0, Ll/ۚ֡֨;

    sget-object v2, Ll/ᩴۚ۠;->۬ۧ:Ll/ᩴۚ۠;

    const-string v3, "PREINC"

    const/4 v4, 0x3

    const/4 v5, 0x4

    invoke-direct {v0, v3, v4, v5, v2}, Ll/ۚ֡֨;-><init>(Ljava/lang/String;IILl/ᩴۚ۠;)V

    sput-object v0, Ll/ۚ֡֨;->ۨ:Ll/ۚ֡֨;

    .line 2467
    new-instance v0, Ll/ۚ֡֨;

    sget-object v2, Ll/ᩴۚ۠;->ۗۧ:Ll/ᩴۚ۠;

    const-string v3, "PREDEC"

    const/4 v4, 0x6

    invoke-direct {v0, v3, v5, v4, v2}, Ll/ۚ֡֨;-><init>(Ljava/lang/String;IILl/ᩴۚ۠;)V

    sput-object v0, Ll/ۚ֡֨;->ۛ:Ll/ۚ֡֨;

    .line 2468
    new-instance v0, Ll/ۚ֡֨;

    const/16 v2, 0x8

    sget-object v3, Ll/ᩴۚ۠;->ۙۧ:Ll/ᩴۚ۠;

    const-string v5, "POSTINC"

    const/4 v6, 0x5

    invoke-direct {v0, v5, v6, v2, v3}, Ll/ۚ֡֨;-><init>(Ljava/lang/String;IILl/ᩴۚ۠;)V

    sput-object v0, Ll/ۚ֡֨;->ۤ:Ll/ۚ֡֨;

    .line 2469
    new-instance v0, Ll/ۚ֡֨;

    const/16 v2, 0xa

    sget-object v3, Ll/ᩴۚ۠;->᩶ۧ:Ll/ᩴۚ۠;

    const-string v5, "POSTDEC"

    invoke-direct {v0, v5, v4, v2, v3}, Ll/ۚ֡֨;-><init>(Ljava/lang/String;IILl/ᩴۚ۠;)V

    sput-object v0, Ll/ۚ֡֨;->۫:Ll/ۚ֡֨;

    .line 2470
    new-instance v0, Ll/ۚ֡֨;

    const/4 v2, 0x7

    const/16 v3, 0xc

    const-string v4, "FIRSTASGOP"

    invoke-direct {v0, v4, v2, v3, v1}, Ll/ۚ֡֨;-><init>(Ljava/lang/String;IILl/ᩴۚ۠;)V

    sput-object v0, Ll/ۚ֡֨;->۬:Ll/ۚ֡֨;

    .line 2462
    invoke-static {}, Ll/ۚ֡֨;->֫()[Ll/ۚ֡֨;

    move-result-object v1

    sput-object v1, Ll/ۚ֡֨;->᩶:[Ll/ۚ֡֨;

    .line 2474
    iget v0, v0, Ll/ۚ֡֨;->᩸:I

    add-int/lit8 v0, v0, 0x56

    sput v0, Ll/ۚ֡֨;->ܰ:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILl/ᩴۚ۠;)V
    .locals 0

    .line 2476
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2477
    iput p3, p0, Ll/ۚ֡֨;->᩸:I

    .line 2478
    iput-object p4, p0, Ll/ۚ֡֨;->᩹:Ll/ᩴۚ۠;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۚ֡֨;
    .locals 1

    .line 2462
    const-class v0, Ll/ۚ֡֨;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۚ֡֨;

    return-object p0
.end method

.method public static values()[Ll/ۚ֡֨;
    .locals 1

    .line 2462
    sget-object v0, Ll/ۚ֡֨;->᩶:[Ll/ۚ֡֨;

    invoke-virtual {v0}, [Ll/ۚ֡֨;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۚ֡֨;

    return-object v0
.end method

.method public static ֫(Ll/ᩴۚ۠;I)I
    .locals 1

    .line 2494
    sget-object v0, Ll/ᩳ֡֨;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_6

    const/4 v0, 0x2

    if-eq p0, v0, :cond_5

    const/4 v0, 0x3

    if-eq p0, v0, :cond_4

    const/4 v0, 0x4

    if-eq p0, v0, :cond_3

    const/16 p0, 0x60

    if-gt p0, p1, :cond_0

    const/16 v0, 0x83

    if-gt p1, v0, :cond_0

    sub-int/2addr p1, p0

    mul-int/lit8 p1, p1, 0x2

    .line 2505
    sget-object p0, Ll/ۚ֡֨;->۬:Ll/ۚ֡֨;

    iget p0, p0, Ll/ۚ֡֨;->᩸:I

    goto :goto_0

    :cond_0
    const/16 p0, 0x100

    if-ne p1, p0, :cond_1

    .line 2507
    sget-object p0, Ll/ۚ֡֨;->۬:Ll/ۚ֡֨;

    iget p0, p0, Ll/ۚ֡֨;->᩸:I

    add-int/lit8 p0, p0, 0x48

    return p0

    :cond_1
    const/16 p0, 0x10e

    if-gt p0, p1, :cond_2

    const/16 p0, 0x113

    if-gt p1, p0, :cond_2

    add-int/lit16 p1, p1, -0xe9

    mul-int/lit8 p1, p1, 0x2

    .line 2509
    sget-object p0, Ll/ۚ֡֨;->۬:Ll/ۚ֡֨;

    iget p0, p0, Ll/ۚ֡֨;->᩸:I

    :goto_0
    add-int/2addr p1, p0

    return p1

    :cond_2
    const/4 p0, -0x1

    return p0

    .line 2502
    :cond_3
    sget-object p0, Ll/ۚ֡֨;->۫:Ll/ۚ֡֨;

    iget p0, p0, Ll/ۚ֡֨;->᩸:I

    return p0

    .line 2500
    :cond_4
    sget-object p0, Ll/ۚ֡֨;->ۤ:Ll/ۚ֡֨;

    iget p0, p0, Ll/ۚ֡֨;->᩸:I

    return p0

    .line 2498
    :cond_5
    sget-object p0, Ll/ۚ֡֨;->ۛ:Ll/ۚ֡֨;

    iget p0, p0, Ll/ۚ֡֨;->᩸:I

    return p0

    .line 2496
    :cond_6
    sget-object p0, Ll/ۚ֡֨;->ۨ:Ll/ۚ֡֨;

    iget p0, p0, Ll/ۚ֡֨;->᩸:I

    return p0
.end method

.method public static ֫(I)Ll/ۚ֡֨;
    .locals 5

    .line 2482
    invoke-static {}, Ll/ۚ֡֨;->values()[Ll/ۚ֡֨;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2483
    iget v4, v3, Ll/ۚ֡֨;->᩸:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2487
    :cond_1
    sget-object p0, Ll/ۚ֡֨;->᩺:Ll/ۚ֡֨;

    return-object p0
.end method

.method public static synthetic ֫()[Ll/ۚ֡֨;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Ll/ۚ֡֨;

    .line 2462
    sget-object v1, Ll/ۚ֡֨;->᩺:Ll/ۚ֡֨;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚ֡֨;->ۗ:Ll/ۚ֡֨;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚ֡֨;->ۙ:Ll/ۚ֡֨;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚ֡֨;->ۨ:Ll/ۚ֡֨;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚ֡֨;->ۛ:Ll/ۚ֡֨;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚ֡֨;->ۤ:Ll/ۚ֡֨;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚ֡֨;->۫:Ll/ۚ֡֨;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Ll/ۚ֡֨;->۬:Ll/ۚ֡֨;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    return-object v0
.end method
