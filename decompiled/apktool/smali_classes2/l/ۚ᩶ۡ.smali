.class public final Ll/ۚ᩶ۡ;
.super Ljava/lang/Object;
.source "7AQD"


# direct methods
.method public static ֫(Ljava/lang/String;)I
    .locals 7

    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/16 v2, 0x10

    const/4 v3, 0x0

    if-lt v0, v1, :cond_2

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x2b

    if-ne v0, v3, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_0
    invoke-static {p0, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v2, v0

    cmp-long v4, v2, v0

    if-nez v4, :cond_1

    long-to-int p0, v0

    return p0

    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "Input "

    const-string v2, " in base 16 is not in the range of an unsigned integer"

    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 20
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x2d

    if-eq v1, v3, :cond_5

    const/4 v1, 0x5

    if-le v0, v1, :cond_4

    .line 30
    invoke-static {p0, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide v2, -0x100000000L

    and-long/2addr v2, v0

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_3

    long-to-int p0, v0

    return p0

    .line 34
    :cond_3
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "String value "

    const-string v2, " exceeds range of unsigned int."

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 35
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 28
    :cond_4
    invoke-static {p0, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    return p0

    .line 22
    :cond_5
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "Illegal leading minus sign on unsigned string "

    const-string v2, "."

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 41
    :cond_6
    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "For input string: \""

    const-string v2, "\""

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 41
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
