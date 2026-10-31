.class public final Ll/ۛ᩵ۚ;
.super Ljava/lang/Object;
.source "U5B8"


# static fields
.field public static final ֫:J

.field public static final ۜ:J

.field public static final ۧ:I

.field public static final ܳ:J

.field public static final ܽ:J

.field public static final ܿ:Ljava/text/DecimalFormat;

.field public static final ᩳ:I

.field public static final ᩷:I

.field public static final ᩻:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 37
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    sput v0, Ll/ۛ᩵ۚ;->ۧ:I

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    sput v0, Ll/ۛ᩵ۚ;->᩻:I

    const v0, 0x40490fdb    # (float)Math.PI

    .line 39
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    sput v0, Ll/ۛ᩵ۚ;->᩷:I

    const v0, 0x402df854    # (float)Math.E

    .line 40
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    sput v0, Ll/ۛ᩵ۚ;->ᩳ:I

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    sput-wide v0, Ll/ۛ᩵ۚ;->֫:J

    const-wide v0, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 43
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    sput-wide v0, Ll/ۛ᩵ۚ;->ܳ:J

    const-wide v0, 0x400921fb54442d18L    # Math.PI

    .line 44
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    sput-wide v0, Ll/ۛ᩵ۚ;->ۜ:J

    const-wide v0, 0x4005bf0a8b145769L    # Math.E

    .line 45
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    sput-wide v0, Ll/ۛ᩵ۚ;->ܽ:J

    .line 47
    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "0.####################E0"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۛ᩵ۚ;->ܿ:Ljava/text/DecimalFormat;

    return-void
.end method

.method public static ֫(I)Z
    .locals 6

    .line 52
    sget v0, Ll/ۛ᩵ۚ;->ۧ:I

    const/4 v1, 0x1

    if-eq p0, v0, :cond_9

    sget v0, Ll/ۛ᩵ۚ;->᩻:I

    if-eq p0, v0, :cond_9

    sget v0, Ll/ۛ᩵ۚ;->᩷:I

    if-eq p0, v0, :cond_9

    sget v0, Ll/ۛ᩵ۚ;->ᩳ:I

    if-ne p0, v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v0, 0x0

    if-ltz p0, :cond_1

    const v2, 0x5f5e100

    if-ge p0, v2, :cond_1

    return v0

    :cond_1
    const v2, 0x7fffffff

    if-eq p0, v2, :cond_8

    const/high16 v2, -0x80000000

    if-ne p0, v2, :cond_2

    goto/16 :goto_1

    :cond_2
    shr-int/lit8 v2, p0, 0x18

    shr-int/lit8 v3, p0, 0x10

    and-int/lit16 v3, v3, 0xff

    const v4, 0xffff

    and-int/2addr v4, p0

    const/16 v5, 0x7f

    if-eq v2, v5, :cond_3

    if-ne v2, v1, :cond_4

    :cond_3
    const/16 v2, 0x1f

    if-ge v3, v2, :cond_4

    const/16 v2, 0xfff

    if-ge v4, v2, :cond_4

    return v0

    .line 79
    :cond_4
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 80
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_5

    return v0

    :cond_5
    int-to-long v3, p0

    .line 86
    sget-object p0, Ll/ۛ᩵ۚ;->ܿ:Ljava/text/DecimalFormat;

    invoke-virtual {p0, v3, v4}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v3

    float-to-double v4, v2

    .line 87
    invoke-virtual {p0, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x2e

    .line 90
    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const-string v4, "E"

    .line 91
    invoke-virtual {p0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    const-string v5, "000"

    .line 92
    invoke-virtual {p0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-le v5, v2, :cond_6

    if-ge v5, v4, :cond_6

    .line 94
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_6
    const-string v5, "999"

    .line 96
    invoke-virtual {p0, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-le v5, v2, :cond_7

    if-ge v5, v4, :cond_7

    .line 98
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 102
    :cond_7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-ge p0, v2, :cond_8

    return v1

    :cond_8
    :goto_1
    return v0

    :cond_9
    :goto_2
    return v1
.end method

.method public static ֫(J)Z
    .locals 5

    .line 108
    sget-wide v0, Ll/ۛ᩵ۚ;->֫:J

    const/4 v2, 0x1

    cmp-long v3, p0, v0

    if-eqz v3, :cond_9

    sget-wide v0, Ll/ۛ᩵ۚ;->ܳ:J

    cmp-long v3, p0, v0

    if-eqz v3, :cond_9

    sget-wide v0, Ll/ۛ᩵ۚ;->ۜ:J

    cmp-long v3, p0, v0

    if-eqz v3, :cond_9

    sget-wide v0, Ll/ۛ᩵ۚ;->ܽ:J

    cmp-long v3, p0, v0

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-wide/16 v0, 0x0

    const/4 v3, 0x0

    cmp-long v4, p0, v0

    if-ltz v4, :cond_3

    const-wide/32 v0, 0x186a0

    cmp-long v4, p0, v0

    if-gez v4, :cond_3

    const-wide/16 v0, 0x3f4    # 5.0E-321

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x4be    # 6.0E-321

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x589    # 7.0E-321

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x653    # 8.0E-321

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x71e    # 9.0E-321

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x7e8    # 1.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0xfd0    # 2.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x17b8    # 3.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x1fa0    # 4.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x2788    # 5.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x2f70    # 6.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x3758    # 7.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x3f40    # 8.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x4728    # 9.0E-320

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/16 v0, 0x4f10    # 1.0E-319

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/32 v0, 0x9e20    # 2.0E-319

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/32 v0, 0xed31    # 3.0E-319

    cmp-long v4, p0, v0

    if-eqz v4, :cond_2

    const-wide/32 v0, 0x13c41    # 4.0E-319

    cmp-long v4, p0, v0

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    return v3

    :cond_2
    :goto_0
    return v2

    :cond_3
    const-wide v0, 0x7fffffffffffffffL

    cmp-long v4, p0, v0

    if-eqz v4, :cond_8

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v4, p0, v0

    if-nez v4, :cond_4

    goto :goto_2

    .line 143
    :cond_4
    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    .line 144
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-eqz v4, :cond_5

    return v3

    .line 150
    :cond_5
    sget-object v4, Ll/ۛ᩵ۚ;->ܿ:Ljava/text/DecimalFormat;

    invoke-virtual {v4, p0, p1}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object p0

    .line 151
    invoke-virtual {v4, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x2e

    .line 154
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const-string v1, "E"

    .line 155
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const-string v4, "000"

    .line 156
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-le v4, v0, :cond_6

    if-ge v4, v1, :cond_6

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_6
    const-string v4, "999"

    .line 160
    invoke-virtual {p1, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-le v4, v0, :cond_7

    if-ge v4, v1, :cond_7

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 166
    :cond_7
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-ge p1, p0, :cond_8

    return v2

    :cond_8
    :goto_2
    return v3

    :cond_9
    :goto_3
    return v2
.end method
