.class public Ll/᩺ܿۧ;
.super Ljava/lang/Object;
.source "Q8SB"

# interfaces
.implements Ll/ۧܳۧ;


# virtual methods
.method public final ֫(I)I
    .locals 1

    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 p1, 0x6

    return p1

    :cond_0
    const/4 p1, 0x3

    return p1
.end method

.method public ֫(Ll/֫ܳۧ;)J
    .locals 3

    .line 119
    iget-object v0, p1, Ll/֫ܳۧ;->ۧ:Ljava/io/IOException;

    .line 124
    instance-of v1, v0, Ll/ۡ᩵֫;

    if-nez v1, :cond_2

    instance-of v1, v0, Ljava/io/FileNotFoundException;

    if-nez v1, :cond_2

    instance-of v1, v0, Ll/ᩳܶ֫;

    if-nez v1, :cond_2

    instance-of v1, v0, Ll/ۢܳۧ;

    if-nez v1, :cond_2

    sget v1, Ll/᩹۠֫;->᩹:I

    :goto_0
    if-eqz v0, :cond_1

    .line 35
    instance-of v1, v0, Ll/᩹۠֫;

    if-eqz v1, :cond_0

    .line 36
    move-object v1, v0

    check-cast v1, Ll/᩹۠֫;

    iget v1, v1, Ll/᩹۠֫;->᩸:I

    const/16 v2, 0x7d8

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    .line 126
    :cond_1
    iget p1, p1, Ll/֫ܳۧ;->֫:I

    add-int/lit8 p1, p1, -0x1

    mul-int/lit16 p1, p1, 0x3e8

    const/16 v0, 0x1388

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-long v0, p1

    return-wide v0

    :cond_2
    :goto_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final ֫(Ll/ܰܿۧ;Ll/֫ܳۧ;)Ll/۟ܿۧ;
    .locals 2

    .line 98
    iget-object p2, p2, Ll/֫ܳۧ;->ۧ:Ljava/io/IOException;

    .line 146
    instance-of v0, p2, Ll/᩻ܶ֫;

    if-nez v0, :cond_0

    goto :goto_0

    .line 149
    :cond_0
    check-cast p2, Ll/᩻ܶ֫;

    .line 151
    iget p2, p2, Ll/᩻ܶ֫;->۬:I

    const/16 v0, 0x193

    if-eq p2, v0, :cond_1

    const/16 v0, 0x194

    if-eq p2, v0, :cond_1

    const/16 v0, 0x19a

    if-eq p2, v0, :cond_1

    const/16 v0, 0x1a0

    if-eq p2, v0, :cond_1

    const/16 v0, 0x1f4

    if-eq p2, v0, :cond_1

    const/16 v0, 0x1f7

    if-ne p2, v0, :cond_2

    .line 133
    :cond_1
    iget p2, p1, Ll/ܰܿۧ;->ۧ:I

    iget p1, p1, Ll/ܰܿۧ;->֫:I

    sub-int/2addr p2, p1

    const/4 p1, 0x1

    if-le p2, p1, :cond_2

    .line 105
    new-instance p1, Ll/۟ܿۧ;

    const-wide/32 v0, 0xea60

    const/4 p2, 0x2

    invoke-direct {p1, p2, v0, v1}, Ll/۟ܿۧ;-><init>(IJ)V

    return-object p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method
