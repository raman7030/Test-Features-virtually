.class public final Ll/۬۟ܿ;
.super Ljava/lang/Object;
.source "X4M8"


# instance fields
.field public final ֫:Ll/ᩳܽܳ;

.field public final ۧ:J

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ᩳܽܳ;IIZJ)V
    .locals 2

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    iput-object p1, p0, Ll/۬۟ܿ;->֫:Ll/ᩳܽܳ;

    .line 218
    invoke-virtual {p1}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۬۟ܿ;->ۧ:J

    .line 219
    iput p2, p0, Ll/۬۟ܿ;->ܿ:I

    if-eqz p4, :cond_1

    int-to-long p1, p3

    const-wide/16 p3, 0x1

    add-long/2addr p1, p3

    long-to-int p3, p1

    int-to-long v0, p3

    cmp-long p4, p1, v0

    if-nez p4, :cond_0

    move p2, p3

    goto :goto_0

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1

    .line 223
    :cond_1
    :goto_0
    iput p2, p0, Ll/۬۟ܿ;->ܽ:I

    .line 224
    iput-wide p5, p0, Ll/۬۟ܿ;->ᩳ:J

    return-void
.end method

.method public static ۧ(Ll/ۜܰܿ;)Ll/۬۟ܿ;
    .locals 8

    .line 290
    iget-object v0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {v0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v2

    .line 922
    iget-object p0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p0}, Ll/ۧܰܿ;->᩷()I

    move-result v3

    .line 926
    invoke-virtual {p0}, Ll/ۧܰܿ;->ۜ()I

    move-result v4

    .line 930
    invoke-virtual {p0}, Ll/ۧܰܿ;->ۡ()Z

    move-result v5

    .line 234
    invoke-virtual {p0}, Ll/ۧܰܿ;->֡()J

    move-result-wide v6

    if-ltz v3, :cond_2

    if-lt v4, v3, :cond_2

    if-eqz v5, :cond_0

    .line 236
    invoke-virtual {v2}, Ll/ᩳܽܳ;->length()I

    move-result p0

    if-ge v4, p0, :cond_2

    :cond_0
    if-nez v5, :cond_1

    if-ne v3, v4, :cond_2

    .line 237
    invoke-virtual {v2}, Ll/ᩳܽܳ;->length()I

    move-result p0

    if-le v3, p0, :cond_1

    goto :goto_0

    .line 240
    :cond_1
    new-instance p0, Ll/۬۟ܿ;

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/۬۟ܿ;-><init>(Ll/ᩳܽܳ;IIZJ)V

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۜܰܿ;)Z
    .locals 6

    .line 246
    iget-object v0, p1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    iget-wide v2, p0, Ll/۬۟ܿ;->ۧ:J

    iget-wide v4, p0, Ll/۬۟ܿ;->ᩳ:J

    iget-object v1, p0, Ll/۬۟ܿ;->֫:Ll/ᩳܽܳ;

    invoke-virtual/range {v0 .. v5}, Ll/ۧܰܿ;->֫(Ll/ᩳܽܳ;JJ)Z

    move-result p1

    return p1
.end method
