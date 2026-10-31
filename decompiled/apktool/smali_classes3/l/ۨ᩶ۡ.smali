.class public final Ll/ۨ᩶ۡ;
.super Ljava/lang/Object;
.source "R1TU"


# direct methods
.method public static ֫(Ll/۬ۜܽ;Ll/ۛ᩶ۡ;)V
    .locals 6

    const v0, 0x4025b06

    .line 24
    invoke-static {p0, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    .line 25
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0xd

    cmp-long v5, v1, v3

    if-ltz v5, :cond_5

    .line 27
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v1

    const-wide/16 v3, 0x8

    sub-long/2addr v1, v3

    long-to-int v2, v1

    invoke-virtual {p0, v2}, Ll/۬ۜܽ;->skipBytes(I)V

    .line 28
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    .line 29
    invoke-static {p0, v0}, Ll/᩹ۜܽ;->֫(Ll/᩶ۜܽ;I)V

    int-to-long v0, v1

    .line 30
    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->seek(J)V

    .line 31
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    .line 32
    new-instance v1, Ll/ۨ᩵ۚ;

    invoke-direct {v1, v0}, Ll/ۨ᩵ۚ;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 34
    invoke-virtual {p0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll/ۨ᩵ۚ;->֫(ILjava/lang/Comparable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x4

    .line 36
    invoke-virtual {p0, v2, v3}, Ll/۬ۜܽ;->seek(J)V

    .line 38
    :goto_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۨ᩵ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 55
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۨ᩵ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 56
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    invoke-virtual {v1, v3}, Ll/ۨ᩵ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 57
    invoke-interface {p1, v0, v2, v3}, Ll/ۛ᩶ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۨ᩵ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 48
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۨ᩵ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 49
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    invoke-virtual {v1, v3}, Ll/ۨ᩵ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 50
    invoke-interface {p1, v0, v2, v3}, Ll/ۛ᩶ۡ;->ۧ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 41
    :cond_3
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۨ᩵ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 42
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۨ᩵ۚ;->֫(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 43
    invoke-interface {p1, v0, v2}, Ll/ۛ᩶ۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    return-void

    .line 26
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Bad mapping file"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
