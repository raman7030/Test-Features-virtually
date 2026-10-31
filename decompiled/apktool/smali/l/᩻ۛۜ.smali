.class public final Ll/᩻ۛۜ;
.super Ljava/lang/Object;
.source "O7FP"


# instance fields
.field public ֫:J

.field public ۧ:Ljava/lang/String;

.field public ܽ:Ll/ܳۛۜ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܳۛۜ;J)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Ll/᩻ۛۜ;->ۧ:Ljava/lang/String;

    .line 64
    iput-object p2, p0, Ll/᩻ۛۜ;->ܽ:Ll/ܳۛۜ;

    .line 65
    iput-wide p3, p0, Ll/᩻ۛۜ;->֫:J

    return-void
.end method

.method public static ֫(Ll/۬ۜܽ;)Ll/᩻ۛۜ;
    .locals 7

    .line 82
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v0

    .line 83
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    .line 84
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    .line 85
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩵()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    if-eq v1, v4, :cond_3

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    if-nez v3, :cond_0

    goto :goto_1

    .line 53
    :cond_0
    new-instance v6, Ll/ܳۛۜ;

    sget-object v1, Ll/ۜۛۜ;->᩹:Ll/ۜۛۜ;

    invoke-direct {v6, v1, v5, v3}, Ll/ܳۛۜ;-><init>(Ll/ۜۛۜ;ILjava/lang/String;)V

    goto :goto_1

    .line 92
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown selection type"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 48
    :cond_2
    new-instance v1, Ll/ܳۛۜ;

    sget-object v3, Ll/ۜۛۜ;->ۙ:Ll/ۜۛۜ;

    invoke-direct {v1, v3, v2, v6}, Ll/ܳۛۜ;-><init>(Ll/ۜۛۜ;ILjava/lang/String;)V

    goto :goto_0

    .line 43
    :cond_3
    new-instance v1, Ll/ܳۛۜ;

    sget-object v2, Ll/ۜۛۜ;->᩶:Ll/ۜۛۜ;

    invoke-direct {v1, v2, v5, v6}, Ll/ܳۛۜ;-><init>(Ll/ۜۛۜ;ILjava/lang/String;)V

    :goto_0
    move-object v6, v1

    :goto_1
    if-eqz v6, :cond_5

    .line 97
    invoke-virtual {p0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v1

    .line 98
    invoke-static {v6}, Ll/᩷ۛۜ;->֫(Ll/ܳۛۜ;)Ll/ܳۛۜ;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 102
    new-instance v3, Ll/᩻ۛۜ;

    invoke-direct {v3, v0, p0, v1, v2}, Ll/᩻ۛۜ;-><init>(Ljava/lang/String;Ll/ܳۛۜ;J)V

    return-object v3

    .line 100
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid selection payload"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 95
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid selection data"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
