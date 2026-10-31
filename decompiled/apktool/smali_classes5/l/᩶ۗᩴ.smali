.class public final enum Ll/᩶ۗᩴ;
.super Ljava/lang/Enum;
.source "N673"

# interfaces
.implements Ll/ۤۗᩴ;


# static fields
.field public static final enum JULIAN_DAY:Ll/᩶ۗᩴ;

.field public static final enum MODIFIED_JULIAN_DAY:Ll/᩶ۗᩴ;

.field public static final enum RATA_DIE:Ll/᩶ۗᩴ;

.field public static final synthetic d:[Ll/᩶ۗᩴ;

.field public static final serialVersionUID:J = -0x681b1f35efa83fd4L


# instance fields
.field public final transient a:Ljava/lang/String;

.field public final transient b:Ll/᩺ۗᩴ;

.field public final transient c:J


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 221
    new-instance v8, Ll/᩶ۗᩴ;

    sget-object v9, Ll/ۡۗᩴ;->DAYS:Ll/ۡۗᩴ;

    sget-object v10, Ll/ۡۗᩴ;->FOREVER:Ll/ۡۗᩴ;

    const-wide/32 v6, 0x253d8c

    const-string v1, "JULIAN_DAY"

    const/4 v2, 0x0

    const-string v3, "JulianDay"

    move-object v0, v8

    move-object v4, v9

    move-object v5, v10

    invoke-direct/range {v0 .. v7}, Ll/᩶ۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;J)V

    sput-object v8, Ll/᩶ۗᩴ;->JULIAN_DAY:Ll/᩶ۗᩴ;

    .line 222
    new-instance v11, Ll/᩶ۗᩴ;

    const-string v3, "ModifiedJulianDay"

    const-wide/32 v6, 0x9e8b

    const-string v1, "MODIFIED_JULIAN_DAY"

    const/4 v2, 0x1

    move-object v0, v11

    invoke-direct/range {v0 .. v7}, Ll/᩶ۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;J)V

    sput-object v11, Ll/᩶ۗᩴ;->MODIFIED_JULIAN_DAY:Ll/᩶ۗᩴ;

    .line 223
    new-instance v12, Ll/᩶ۗᩴ;

    const-string v3, "RataDie"

    const-wide/32 v6, 0xaf93b

    const-string v1, "RATA_DIE"

    const/4 v2, 0x2

    move-object v0, v12

    invoke-direct/range {v0 .. v7}, Ll/᩶ۗᩴ;-><init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;J)V

    sput-object v12, Ll/᩶ۗᩴ;->RATA_DIE:Ll/᩶ۗᩴ;

    const/4 v0, 0x3

    new-array v0, v0, [Ll/᩶ۗᩴ;

    const/4 v1, 0x0

    aput-object v8, v0, v1

    const/4 v1, 0x1

    aput-object v11, v0, v1

    const/4 v1, 0x2

    aput-object v12, v0, v1

    .line 220
    sput-object v0, Ll/᩶ۗᩴ;->d:[Ll/᩶ۗᩴ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ll/ۡۗᩴ;Ll/ۡۗᩴ;J)V
    .locals 0

    .line 233
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 234
    iput-object p3, p0, Ll/᩶ۗᩴ;->a:Ljava/lang/String;

    const-wide p1, -0x550a313cdaL

    add-long/2addr p1, p6

    const-wide p3, 0x550a1b48f7L

    add-long/2addr p3, p6

    .line 237
    invoke-static {p1, p2, p3, p4}, Ll/᩺ۗᩴ;->f(JJ)Ll/᩺ۗᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 238
    iput-wide p6, p0, Ll/᩶ۗᩴ;->c:J

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/᩶ۗᩴ;
    .locals 1

    .line 220
    const-class v0, Ll/᩶ۗᩴ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/᩶ۗᩴ;

    return-object p0
.end method

.method public static values()[Ll/᩶ۗᩴ;
    .locals 1

    .line 220
    sget-object v0, Ll/᩶ۗᩴ;->d:[Ll/᩶ۗᩴ;

    invoke-virtual {v0}, [Ll/᩶ۗᩴ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶ۗᩴ;

    return-object v0
.end method


# virtual methods
.method public final C(Ll/ۖۗᩴ;)J
    .locals 4

    .line 283
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->G(Ll/ۤۗᩴ;)J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩶ۗᩴ;->c:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final G(Ll/ܺۗᩴ;J)Ll/ܺۗᩴ;
    .locals 3

    .line 264
    iget-object v0, p0, Ll/᩶ۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 289
    invoke-virtual {v0, p2, p3}, Ll/᩺ۗᩴ;->e(J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    iget-wide v1, p0, Ll/᩶ۗᩴ;->c:J

    invoke-static {p2, p3, v1, v2}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide p2

    invoke-interface {p1, p2, p3, v0}, Ll/ܺۗᩴ;->c(JLl/ۤۗᩴ;)Ll/ܺۗᩴ;

    move-result-object p1

    return-object p1

    .line 290
    :cond_0
    new-instance p1, Ll/ܺ᩹ᩴ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid value: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩶ۗᩴ;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isDateBased()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l(Ll/ۖۗᩴ;)Z
    .locals 1

    .line 270
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    return p1
.end method

.method public final m(Ll/ۖۗᩴ;)Ll/᩺ۗᩴ;
    .locals 2

    .line 270
    sget-object v0, Ll/ᩴۗᩴ;->EPOCH_DAY:Ll/ᩴۗᩴ;

    invoke-interface {p1, v0}, Ll/ۖۗᩴ;->e(Ll/ۤۗᩴ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 264
    iget-object p1, p0, Ll/᩶ۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object p1

    .line 276
    :cond_0
    new-instance p1, Ll/ܺ᩹ᩴ;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported field: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ll/ܺ᩹ᩴ;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Ljava/util/Map;Ll/ܽۙᩴ;Ll/ܿۙᩴ;)Ll/ۖۗᩴ;
    .locals 4

    .line 299
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 300
    invoke-static {p2}, Ll/ܺ᩶ᩴ;->r(Ll/ۖۗᩴ;)Ll/ۖ᩶ᩴ;

    move-result-object p1

    .line 301
    sget-object p2, Ll/ܿۙᩴ;->LENIENT:Ll/ܿۙᩴ;

    iget-wide v2, p0, Ll/᩶ۗᩴ;->c:J

    if-ne p3, p2, :cond_0

    .line 302
    invoke-static {v0, v1, v2, v3}, Ll/᩺ۚᩴ;->R(JJ)J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, Ll/ۖ᩶ᩴ;->j(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1

    .line 264
    :cond_0
    iget-object p2, p0, Ll/᩶ۗᩴ;->b:Ll/᩺ۗᩴ;

    .line 304
    invoke-virtual {p2, v0, v1, p0}, Ll/᩺ۗᩴ;->b(JLl/ۤۗᩴ;)V

    sub-long/2addr v0, v2

    .line 305
    invoke-interface {p1, v0, v1}, Ll/ۖ᩶ᩴ;->j(J)Ll/۬᩹ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final s()Ll/᩺ۗᩴ;
    .locals 1

    .line 264
    iget-object v0, p0, Ll/᩶ۗᩴ;->b:Ll/᩺ۗᩴ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 311
    iget-object v0, p0, Ll/᩶ۗᩴ;->a:Ljava/lang/String;

    return-object v0
.end method
