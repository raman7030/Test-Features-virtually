.class public final Ll/᩸۟ۜ;
.super Ljava/lang/Object;
.source "H72R"


# instance fields
.field public final ֫:J

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 3

    .line 340
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    const-string v0, "[0-9a-f]{64}"

    .line 344
    invoke-virtual {p3, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 347
    iput-wide p1, p0, Ll/᩸۟ۜ;->֫:J

    .line 348
    iput-object p3, p0, Ll/᩸۟ۜ;->ۧ:Ljava/lang/String;

    return-void

    .line 345
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Expected library SHA-256 must be lowercase hex"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 342
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Expected library length must be positive"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/᩸۟ۜ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩸۟ۜ;->֫:J

    return-wide v0
.end method

.method public static bridge synthetic ۧ(Ll/᩸۟ۜ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸۟ۜ;->ۧ:Ljava/lang/String;

    return-object p0
.end method
