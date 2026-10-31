.class public final Ll/ܶۛۜ;
.super Ljava/lang/Object;
.source "56LP"


# direct methods
.method public static ֫(JIIIJ)Ll/۠ۛۜ;
    .locals 8

    const/4 v0, 0x1

    :goto_0
    const v1, 0x8000

    if-gt v0, v1, :cond_1

    .line 19
    invoke-static {p2, p3, v0}, Ll/ۙۨۜ;->֫(III)J

    move-result-wide v1

    int-to-long v3, p4

    mul-long v1, v1, v3

    add-long/2addr v1, p0

    .line 21
    invoke-static {p2, v0}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v3

    const-wide/16 v5, 0x800

    cmp-long v7, v3, v5

    if-gtz v7, :cond_0

    .line 22
    invoke-static {p3, v0}, Ll/ۙۨۜ;->֫(II)J

    move-result-wide v3

    cmp-long v7, v3, v5

    if-gtz v7, :cond_0

    cmp-long v3, v1, p5

    if-gtz v3, :cond_0

    .line 23
    new-instance p0, Ll/۠ۛۜ;

    invoke-direct {p0, v0, v1, v2}, Ll/۠ۛۜ;-><init>(IJ)V

    return-object p0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    .line 25
    :cond_1
    new-instance p0, Ll/֨ۨۜ;

    const-string p1, "Animation workspace exceeds allocation limit"

    .line 330
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 25
    throw p0
.end method
