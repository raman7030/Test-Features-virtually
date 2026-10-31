.class public final enum Ll/᩸᩹ᩴ;
.super Ljava/lang/Enum;
.source "N673"

# interfaces
.implements Ll/ۖۗᩴ;
.implements Ll/ۗۗᩴ;


# static fields
.field public static final enum FRIDAY:Ll/᩸᩹ᩴ;

.field public static final enum MONDAY:Ll/᩸᩹ᩴ;

.field public static final enum SATURDAY:Ll/᩸᩹ᩴ;

.field public static final enum SUNDAY:Ll/᩸᩹ᩴ;

.field public static final enum THURSDAY:Ll/᩸᩹ᩴ;

.field public static final enum TUESDAY:Ll/᩸᩹ᩴ;

.field public static final enum WEDNESDAY:Ll/᩸᩹ᩴ;

.field public static final a:[Ll/᩸᩹ᩴ;

.field public static final synthetic b:[Ll/᩸᩹ᩴ;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    .line 115
    new-instance v0, Ll/᩸᩹ᩴ;

    const-string v1, "MONDAY"

    const/4 v2, 0x0

    .line 109
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 115
    sput-object v0, Ll/᩸᩹ᩴ;->MONDAY:Ll/᩸᩹ᩴ;

    .line 120
    new-instance v1, Ll/᩸᩹ᩴ;

    const-string v3, "TUESDAY"

    const/4 v4, 0x1

    .line 109
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 120
    sput-object v1, Ll/᩸᩹ᩴ;->TUESDAY:Ll/᩸᩹ᩴ;

    .line 125
    new-instance v3, Ll/᩸᩹ᩴ;

    const-string v5, "WEDNESDAY"

    const/4 v6, 0x2

    .line 109
    invoke-direct {v3, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 125
    sput-object v3, Ll/᩸᩹ᩴ;->WEDNESDAY:Ll/᩸᩹ᩴ;

    .line 130
    new-instance v5, Ll/᩸᩹ᩴ;

    const-string v7, "THURSDAY"

    const/4 v8, 0x3

    .line 109
    invoke-direct {v5, v7, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 130
    sput-object v5, Ll/᩸᩹ᩴ;->THURSDAY:Ll/᩸᩹ᩴ;

    .line 135
    new-instance v7, Ll/᩸᩹ᩴ;

    const-string v9, "FRIDAY"

    const/4 v10, 0x4

    .line 109
    invoke-direct {v7, v9, v10}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 135
    sput-object v7, Ll/᩸᩹ᩴ;->FRIDAY:Ll/᩸᩹ᩴ;

    .line 140
    new-instance v9, Ll/᩸᩹ᩴ;

    const-string v11, "SATURDAY"

    const/4 v12, 0x5

    .line 109
    invoke-direct {v9, v11, v12}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 140
    sput-object v9, Ll/᩸᩹ᩴ;->SATURDAY:Ll/᩸᩹ᩴ;

    .line 145
    new-instance v11, Ll/᩸᩹ᩴ;

    const-string v13, "SUNDAY"

    const/4 v14, 0x6

    .line 109
    invoke-direct {v11, v13, v14}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 145
    sput-object v11, Ll/᩸᩹ᩴ;->SUNDAY:Ll/᩸᩹ᩴ;

    const/4 v13, 0x7

    new-array v13, v13, [Ll/᩸᩹ᩴ;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    .line 109
    sput-object v13, Ll/᩸᩹ᩴ;->b:[Ll/᩸᩹ᩴ;

    .line 149
    invoke-static {}, Ll/᩸᩹ᩴ;->values()[Ll/᩸᩹ᩴ;

    move-result-object v0

    sput-object v0, Ll/᩸᩹ᩴ;->a:[Ll/᩸᩹ᩴ;

    return-void
.end method

.method public static V(I)Ll/᩸᩹ᩴ;
    .locals 3

    const/4 v0, 0x1

    if-lt p0, v0, :cond_0

    const/4 v1, 0x7

    if-gt p0, v1, :cond_0

    .line 167
    sget-object v1, Ll/᩸᩹ᩴ;->a:[Ll/᩸᩹ᩴ;

    sub-int/2addr p0, v0

    aget-object p0, v1, p0

    return-object p0

    .line 165
    :cond_0
    new-instance v0, Ll/ܺ᩹ᩴ;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid value for DayOfWeek: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩸᩹ᩴ;
    .locals 1

    .line 109
    const-class v0, Ll/᩸᩹ᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩸᩹ᩴ;

    return-object p0
.end method

.method public static values()[Ll/᩸᩹ᩴ;
    .locals 1

    .line 109
    sget-object v0, Ll/᩸᩹ᩴ;->b:[Ll/᩸᩹ᩴ;

    invoke-virtual {v0}, [Ll/᩸᩹ᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩸᩹ᩴ;

    return-object v0
.end method


# virtual methods
.method public final G(Ll/ۤۗᩴ;)J
    .locals 2

    .line 345
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 346
    invoke-virtual {p0}, Ll/᩸᩹ᩴ;->getValue()I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    .line 347
    :cond_0
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-nez v0, :cond_1

    .line 350
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->C(Ll/ۖۗᩴ;)J

    move-result-wide v0

    return-wide v0

    .line 348
    :cond_1
    new-instance v0, Ll/ۨۗᩴ;

    const-string v1, "Unsupported field: "

    .line 0
    invoke-static {v1, p1}, Ll/ܶ᩹ᩴ;->a(Ljava/lang/String;Ll/ۤۗᩴ;)Ljava/lang/String;

    move-result-object p1

    .line 88
    invoke-direct {v0, p1}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    .line 348
    throw v0
.end method

.method public final T(Ll/ۡ֨ᩴ;)Ljava/lang/Object;
    .locals 1

    .line 407
    sget-object v0, Ll/ۛۗᩴ;->c:Ll/ۡ֨ᩴ;

    if-ne p1, v0, :cond_0

    .line 408
    sget-object p1, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    return-object p1

    .line 410
    :cond_0
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->c(Ll/ۖۗᩴ;Ll/ۡ֨ᩴ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;)Z
    .locals 1

    .line 252
    instance-of v0, p1, Ll/ᩴۗᩴ;

    if-eqz v0, :cond_0

    .line 253
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 255
    invoke-interface {p1, p0}, Ll/ۤۗᩴ;->l(Ll/ۖۗᩴ;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getValue()I
    .locals 1

    .line 209
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final l(Ll/ۤۗᩴ;)I
    .locals 1

    .line 315
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 316
    invoke-virtual {p0}, Ll/᩸᩹ᩴ;->getValue()I

    move-result p1

    return p1

    .line 318
    :cond_0
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->a(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)I

    move-result p1

    return p1
.end method

.method public final n(Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;
    .locals 1

    .line 282
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    if-ne p1, v0, :cond_0

    .line 283
    invoke-interface {p1}, Ll/ۤۗᩴ;->s()Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1

    .line 285
    :cond_0
    invoke-static {p0, p1}, Ll/ۛۗᩴ;->d(Ll/ۖۗᩴ;Ll/ۤۗᩴ;)Ll/᩺ۗᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ll/ܺۗᩴ;)Ll/ܺۗᩴ;
    .locals 3

    .line 454
    sget-object v0, Ll/ᩴۗᩴ;->DAY_OF_WEEK:Ll/ᩴۗᩴ;

    invoke-virtual {p0}, Ll/᩸᩹ᩴ;->getValue()I

    move-result v1

    int-to-long v1, v1

    invoke-interface {p1, v1, v2, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1
.end method
