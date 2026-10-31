.class public final Ll/ۖۢ֡;
.super Ljava/lang/Object;
.source "K2RY"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:C

.field public static final ܽ:C


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x2e

    .line 154
    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 169
    sget-char v0, Ljava/io/File;->separatorChar:C

    sput-char v0, Ll/ۖۢ֡;->ܽ:C

    const/16 v1, 0x5c

    const/16 v2, 0x2f

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    if-ne v0, v1, :cond_1

    const/16 v1, 0x2f

    .line 174
    :goto_0
    sput-char v1, Ll/ۖۢ֡;->ۧ:C

    const-string v0, "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$"

    .line 176
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    const-string v0, "^[a-zA-Z0-9][a-zA-Z0-9-]*$"

    .line 188
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void

    .line 569
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 1485
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-gez v0, :cond_1

    const/16 v0, 0x2f

    .line 1019
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/16 v1, 0x5c

    .line 1020
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    .line 1021
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 751
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1486
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)I
    .locals 4

    const/4 v0, -0x1

    if-nez p0, :cond_0

    goto :goto_3

    :cond_0
    const/16 v1, 0x5c

    .line 1236
    sget-char v2, Ll/ۖۢ֡;->ܽ:C

    if-ne v2, v1, :cond_5

    .line 580
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    .line 581
    sget-char v3, Ll/ۖۢ֡;->ۧ:C

    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-ne v2, v0, :cond_2

    if-ne v3, v0, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v3, 0x1

    goto :goto_1

    :cond_2
    if-ne v3, v0, :cond_3

    goto :goto_0

    .line 591
    :cond_3
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :goto_0
    add-int/lit8 v2, v2, 0x1

    :goto_1
    const/16 v3, 0x3a

    .line 993
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    if-ne v2, v0, :cond_4

    goto :goto_2

    .line 995
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "NTFS ADS separator (\':\') in file name is forbidden."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_2
    const/16 v2, 0x2e

    .line 998
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/16 v3, 0x2f

    .line 1019
    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    .line 1020
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p0

    .line 1021
    invoke-static {v3, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-le p0, v2, :cond_6

    :goto_3
    return v0

    :cond_6
    return v2
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 1485
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-gez v1, :cond_2

    .line 1468
    invoke-static {p0}, Ll/ۖۢ֡;->ۧ(Ljava/lang/String;)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    return-object p0

    .line 1472
    :cond_1
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1486
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Null character present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
