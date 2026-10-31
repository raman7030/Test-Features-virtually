.class public final Ll/ۖ᩸ᩳ;
.super Ljava/lang/Object;
.source "V6NC"


# instance fields
.field public ֫:Z

.field public ۧ:J

.field public ܽ:C

.field public ܿ:Z

.field public ᩳ:Z


# direct methods
.method private ֫(I)V
    .locals 11

    .line 26
    sget v0, Ll/֫᩻᩵;->֫:I

    const/16 v0, 0x7f

    const/16 v1, 0x39

    const/16 v2, 0x30

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-le p1, v0, :cond_0

    .line 38
    invoke-static {p1}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x61

    if-gt v0, p1, :cond_1

    const/16 v0, 0x7a

    if-le p1, v0, :cond_3

    :cond_1
    const/16 v0, 0x41

    if-gt v0, p1, :cond_2

    const/16 v0, 0x5a

    if-le p1, v0, :cond_3

    :cond_2
    if-gt v2, p1, :cond_4

    if-gt p1, v1, :cond_4

    :cond_3
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-static {p1}, Ll/֫᩻᩵;->֫(I)I

    move-result v5

    const/4 v6, 0x6

    if-ne v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    const/4 v5, 0x0

    :goto_1
    const/16 v6, 0x5f

    if-eq p1, v6, :cond_7

    if-nez v0, :cond_7

    if-eqz v5, :cond_6

    .line 28
    iget-boolean v7, p0, Ll/ۖ᩸ᩳ;->֫:Z

    if-eqz v7, :cond_6

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    goto :goto_3

    :cond_7
    :goto_2
    const/4 v7, 0x1

    .line 29
    :goto_3
    invoke-static {p1}, Ljava/lang/Character;->isLetter(I)Z

    move-result v8

    if-nez v8, :cond_9

    if-lt p1, v2, :cond_8

    if-gt p1, v1, :cond_8

    goto :goto_4

    :cond_8
    const/4 v1, 0x0

    goto :goto_5

    :cond_9
    :goto_4
    const/4 v1, 0x1

    .line 30
    :goto_5
    iget-boolean v2, p0, Ll/ۖ᩸ᩳ;->ᩳ:Z

    if-eqz v2, :cond_b

    if-nez v1, :cond_b

    if-nez v7, :cond_a

    .line 31
    iget-wide v7, p0, Ll/ۖ᩸ᩳ;->ۧ:J

    const-wide/16 v9, 0x1

    add-long/2addr v7, v9

    iput-wide v7, p0, Ll/ۖ᩸ᩳ;->ۧ:J

    .line 32
    :cond_a
    iput-boolean v3, p0, Ll/ۖ᩸ᩳ;->ᩳ:Z

    :cond_b
    if-eqz v1, :cond_c

    .line 34
    iget-boolean v1, p0, Ll/ۖ᩸ᩳ;->ܿ:Z

    if-nez v1, :cond_c

    iput-boolean v4, p0, Ll/ۖ᩸ᩳ;->ᩳ:Z

    :cond_c
    const v1, 0xffff

    if-gt p1, v1, :cond_e

    if-nez v0, :cond_d

    if-eqz v5, :cond_e

    .line 36
    iget-boolean v1, p0, Ll/ۖ᩸ᩳ;->֫:Z

    if-eqz v1, :cond_e

    :cond_d
    const/4 v1, 0x1

    goto :goto_6

    :cond_e
    const/4 v1, 0x0

    :goto_6
    iput-boolean v1, p0, Ll/ۖ᩸ᩳ;->֫:Z

    if-eq p1, v6, :cond_f

    if-nez v0, :cond_f

    if-eqz v5, :cond_10

    if-eqz v1, :cond_10

    :cond_f
    const/4 v3, 0x1

    .line 37
    :cond_10
    iput-boolean v3, p0, Ll/ۖ᩸ᩳ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 4

    .line 40
    iget-wide v0, p0, Ll/ۖ᩸ᩳ;->ۧ:J

    iget-boolean v2, p0, Ll/ۖ᩸ᩳ;->ᩳ:Z

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(C)V
    .locals 2

    .line 12
    iget-char v0, p0, Ll/ۖ᩸ᩳ;->ܽ:C

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 14
    iput-char v1, p0, Ll/ۖ᩸ᩳ;->ܽ:C

    .line 15
    invoke-static {p1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 16
    invoke-static {v0, p1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۖ᩸ᩳ;->֫(I)V

    return-void

    .line 19
    :cond_0
    invoke-direct {p0, v0}, Ll/ۖ᩸ᩳ;->֫(I)V

    .line 21
    :cond_1
    invoke-static {p1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-char p1, p0, Ll/ۖ᩸ᩳ;->ܽ:C

    return-void

    .line 22
    :cond_2
    invoke-direct {p0, p1}, Ll/ۖ᩸ᩳ;->֫(I)V

    return-void
.end method
