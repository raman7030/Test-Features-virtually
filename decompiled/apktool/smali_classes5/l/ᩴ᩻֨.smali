.class public final Ll/ᩴ᩻֨;
.super Ljava/lang/Object;
.source "W1T8"

# interfaces
.implements Ll/ۤ᩻֨;
.implements Ll/۫᩻֨;


# instance fields
.field public final ֫:J

.field public final ۧ:I


# direct methods
.method public constructor <init>(J[B)V
    .locals 3

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-wide p1, p0, Ll/ᩴ᩻֨;->֫:J

    .line 19
    array-length p1, p3

    const/4 p2, 0x0

    if-nez p1, :cond_0

    .line 20
    iput p2, p0, Ll/ᩴ᩻֨;->ۧ:I

    return-void

    .line 21
    :cond_0
    array-length p1, p3

    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    const/4 p1, 0x0

    :goto_0
    if-ge p2, v0, :cond_1

    .line 24
    aget-byte v1, p3, p2

    and-int/lit16 v1, v1, 0xff

    mul-int/lit8 v2, p2, 0x8

    shl-int/2addr v1, v2

    or-int/2addr p1, v1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 26
    :cond_1
    iput p1, p0, Ll/ᩴ᩻֨;->ۧ:I

    return-void

    .line 28
    :cond_2
    new-instance p1, Ll/ۢۜ֨;

    const-string p2, "Unsupported BCJ filter properties"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p1
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 35
    sget v0, Ll/᩻ۜ֨;->ۨ:I

    const/4 v0, 0x5

    return v0
.end method

.method public final ֫(Ljava/io/InputStream;Ll/ۘ᩻֨;)Ljava/io/InputStream;
    .locals 5

    const-wide/16 v0, 0x4

    .line 42
    iget p2, p0, Ll/ᩴ᩻֨;->ۧ:I

    iget-wide v2, p0, Ll/ᩴ᩻֨;->֫:J

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    .line 43
    new-instance v0, Ll/ۛ᩷֨;

    invoke-direct {v0, p2}, Ll/ۛ᩷֨;-><init>(I)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x5

    cmp-long v4, v2, v0

    if-nez v4, :cond_1

    .line 45
    new-instance v0, Ll/ۗ᩷֨;

    invoke-direct {v0, p2}, Ll/ۗ᩷֨;-><init>(I)V

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x6

    cmp-long v4, v2, v0

    if-nez v4, :cond_2

    .line 47
    new-instance v0, Ll/ۙ᩷֨;

    invoke-direct {v0, p2}, Ll/ۙ᩷֨;-><init>(I)V

    goto :goto_0

    :cond_2
    const-wide/16 v0, 0x7

    cmp-long v4, v2, v0

    if-nez v4, :cond_3

    .line 49
    new-instance v0, Ll/᩹᩷֨;

    invoke-direct {v0, p2}, Ll/᩹᩷֨;-><init>(I)V

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x8

    cmp-long v4, v2, v0

    if-nez v4, :cond_4

    .line 51
    new-instance v0, Ll/᩶᩷֨;

    invoke-direct {v0, p2}, Ll/᩶᩷֨;-><init>(I)V

    goto :goto_0

    :cond_4
    const-wide/16 v0, 0x9

    cmp-long v4, v2, v0

    if-nez v4, :cond_5

    .line 53
    new-instance v0, Ll/۫᩷֨;

    invoke-direct {v0, p2}, Ll/۫᩷֨;-><init>(I)V

    goto :goto_0

    :cond_5
    const-wide/16 v0, 0xa

    cmp-long v4, v2, v0

    if-nez v4, :cond_6

    .line 55
    new-instance v0, Ll/᩸᩷֨;

    invoke-direct {v0, p2}, Ll/᩸᩷֨;-><init>(I)V

    goto :goto_0

    :cond_6
    const-wide/16 v0, 0xb

    cmp-long v4, v2, v0

    if-nez v4, :cond_7

    .line 57
    new-instance v0, Ll/۬᩷֨;

    invoke-direct {v0, p2}, Ll/۬᩷֨;-><init>(I)V

    goto :goto_0

    :cond_7
    const/4 v0, 0x0

    .line 61
    :goto_0
    new-instance p2, Ll/᩻ۜ֨;

    invoke-direct {p2, p1, v0}, Ll/᩻ۜ֨;-><init>(Ljava/io/InputStream;Ll/ۤ᩷֨;)V

    return-object p2
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
