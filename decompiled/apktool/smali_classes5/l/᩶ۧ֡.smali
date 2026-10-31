.class public final Ll/᩶ۧ֡;
.super Ljava/lang/Object;
.source "G4EL"

# interfaces
.implements Ll/֨ᩳ֡;


# instance fields
.field public final ۗ:Ll/ۛܽ֡;

.field public ۙ:S

.field public ۬:I

.field public ᩶:I

.field public ᩸:B

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۛܽ֡;)V
    .locals 0

    .line 359
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 360
    iput-object p1, p0, Ll/᩶ۧ֡;->ۗ:Ll/ۛܽ֡;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 379
    iget-object v0, p0, Ll/᩶ۧ֡;->ۗ:Ll/ۛܽ֡;

    invoke-interface {v0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 7

    .line 364
    :goto_0
    iget p2, p0, Ll/᩶ۧ֡;->᩹:I

    const-wide/16 v0, -0x1

    iget-object p3, p0, Ll/᩶ۧ֡;->ۗ:Ll/ۛܽ֡;

    if-nez p2, :cond_4

    .line 365
    iget-short p2, p0, Ll/᩶ۧ֡;->ۙ:S

    int-to-long v2, p2

    invoke-interface {p3, v2, v3}, Ll/ۛܽ֡;->skip(J)V

    const/4 p2, 0x0

    .line 366
    iput-short p2, p0, Ll/᩶ۧ֡;->ۙ:S

    .line 367
    iget-byte v2, p0, Ll/᩶ۧ֡;->᩸:B

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_0

    goto :goto_1

    .line 386
    :cond_0
    iget v0, p0, Ll/᩶ۧ֡;->۬:I

    .line 388
    invoke-static {p3}, Ll/ۙۧ֡;->֫(Ll/ۛܽ֡;)I

    move-result v1

    iput v1, p0, Ll/᩶ۧ֡;->᩹:I

    iput v1, p0, Ll/᩶ۧ֡;->᩶:I

    .line 389
    invoke-interface {p3}, Ll/ۛܽ֡;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 390
    invoke-interface {p3}, Ll/ۛܽ֡;->readByte()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    iput-byte v2, p0, Ll/᩶ۧ֡;->᩸:B

    .line 391
    sget-object v2, Ll/ۙۧ֡;->ۙ:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    iget v3, p0, Ll/᩶ۧ֡;->۬:I

    iget v5, p0, Ll/᩶ۧ֡;->᩶:I

    iget-byte v6, p0, Ll/᩶ۧ֡;->᩸:B

    invoke-static {v4, v3, v5, v1, v6}, Ll/ᩳۧ֡;->֫(ZIIBB)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 392
    :cond_1
    invoke-interface {p3}, Ll/ۛܽ֡;->readInt()I

    move-result p3

    const v2, 0x7fffffff

    and-int/2addr p3, v2

    iput p3, p0, Ll/᩶ۧ֡;->۬:I

    const/16 v2, 0x9

    const/4 v3, 0x0

    if-ne v1, v2, :cond_3

    if-ne p3, v0, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "TYPE_CONTINUATION streamId changed"

    new-array p2, p2, [Ljava/lang/Object;

    .line 394
    invoke-static {p1, p2}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3

    .line 393
    :cond_3
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    new-array p3, v4, [Ljava/lang/Object;

    aput-object p1, p3, p2

    const-string p1, "%s != TYPE_CONTINUATION"

    invoke-static {p1, p3}, Ll/ᩳۧ֡;->ۧ(Ljava/lang/String;[Ljava/lang/Object;)V

    throw v3

    :cond_4
    int-to-long v2, p2

    const-wide/16 v4, 0x2000

    .line 372
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    invoke-interface {p3, p1, v2, v3}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide p1

    cmp-long p3, p1, v0

    if-nez p3, :cond_5

    :goto_1
    return-wide v0

    .line 374
    :cond_5
    iget p3, p0, Ll/᩶ۧ֡;->᩹:I

    int-to-long v0, p3

    sub-long/2addr v0, p1

    long-to-int p3, v0

    iput p3, p0, Ll/᩶ۧ֡;->᩹:I

    return-wide p1
.end method
