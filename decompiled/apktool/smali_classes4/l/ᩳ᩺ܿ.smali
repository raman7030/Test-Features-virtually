.class public final Ll/ᩳ᩺ܿ;
.super Ljava/lang/Object;
.source "964V"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ᩳܽܳ;

.field public final ܳ:I

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ᩳܽܳ;JIII)V
    .locals 1

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    iput-object p1, p0, Ll/ᩳ᩺ܿ;->ۧ:Ll/ᩳܽܳ;

    .line 185
    iput-wide p2, p0, Ll/ᩳ᩺ܿ;->ᩳ:J

    .line 186
    iput p4, p0, Ll/ᩳ᩺ܿ;->ܳ:I

    .line 187
    iput p5, p0, Ll/ᩳ᩺ܿ;->ܽ:I

    int-to-long p1, p5

    int-to-long p3, p4

    sub-long/2addr p1, p3

    const-wide/16 p3, 0x1

    add-long/2addr p1, p3

    long-to-int p3, p1

    int-to-long p4, p3

    cmp-long v0, p1, p4

    if-nez v0, :cond_0

    .line 188
    iput p3, p0, Ll/ᩳ᩺ܿ;->ܿ:I

    .line 189
    iput p6, p0, Ll/ᩳ᩺ܿ;->֫:I

    return-void

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public static ۧ(Ll/ۜܰܿ;)Ll/ᩳ᩺ܿ;
    .locals 8

    .line 930
    iget-object p0, p0, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p0}, Ll/ۧܰܿ;->ۡ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 290
    :cond_0
    invoke-virtual {p0}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v2

    .line 922
    invoke-virtual {p0}, Ll/ۧܰܿ;->᩷()I

    move-result v5

    .line 926
    invoke-virtual {p0}, Ll/ۧܰܿ;->ۜ()I

    move-result v6

    .line 200
    invoke-virtual {p0}, Ll/ۧܰܿ;->ܽ()I

    move-result v7

    if-ltz v5, :cond_2

    if-lt v6, v5, :cond_2

    .line 201
    invoke-virtual {v2}, Ll/ᩳܽܳ;->length()I

    move-result p0

    if-ge v6, p0, :cond_2

    if-gtz v7, :cond_1

    goto :goto_0

    .line 204
    :cond_1
    new-instance p0, Ll/ᩳ᩺ܿ;

    invoke-virtual {v2}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide v3

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/ᩳ᩺ܿ;-><init>(Ll/ᩳܽܳ;JIII)V

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ۜܰܿ;)Z
    .locals 5

    .line 290
    iget-object p1, p1, Ll/ۜܰܿ;->ۗ:Ll/ۧܰܿ;

    invoke-virtual {p1}, Ll/ۧܰܿ;->ܿ()Ll/ᩳܽܳ;

    move-result-object v0

    .line 209
    iget-object v1, p0, Ll/ᩳ᩺ܿ;->ۧ:Ll/ᩳܽܳ;

    if-ne v0, v1, :cond_0

    .line 210
    invoke-virtual {v1}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ᩳ᩺ܿ;->ᩳ:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    .line 930
    invoke-virtual {p1}, Ll/ۧܰܿ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 922
    invoke-virtual {p1}, Ll/ۧܰܿ;->᩷()I

    move-result v0

    .line 212
    iget v1, p0, Ll/ᩳ᩺ܿ;->ܳ:I

    if-ne v0, v1, :cond_0

    .line 926
    invoke-virtual {p1}, Ll/ۧܰܿ;->ۜ()I

    move-result p1

    .line 213
    iget v0, p0, Ll/ᩳ᩺ܿ;->ܽ:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
