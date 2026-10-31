.class public final Ll/۫۬ۡ;
.super Ljava/lang/Object;
.source "77HE"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const/high16 v0, 0x10000

    new-array v0, v0, [B

    .line 12
    sput-object v0, Ll/۫۬ۡ;->֫:[B

    const/16 v1, 0xf

    .line 16
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x7f

    if-gt v1, v2, :cond_0

    .line 20
    sget-object v2, Ll/۫۬ۡ;->֫:[B

    const/4 v3, 0x4

    aput-byte v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 24
    :cond_0
    sget-object v1, Ll/۫۬ۡ;->֫:[B

    const/16 v2, 0x20

    const/4 v3, 0x1

    aput-byte v3, v1, v2

    const/16 v4, 0xa

    .line 25
    aput-byte v3, v1, v4

    const/16 v5, 0xd

    .line 26
    aput-byte v3, v1, v5

    const/4 v3, 0x2

    const/16 v5, 0x9

    .line 27
    aput-byte v3, v1, v5

    const/16 v3, 0xa0

    .line 29
    aput-byte v4, v1, v3

    const/16 v1, 0x30

    :goto_1
    const/16 v3, 0x39

    const/4 v4, 0x3

    if-gt v1, v3, :cond_1

    .line 33
    sget-object v3, Ll/۫۬ۡ;->֫:[B

    aput-byte v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 35
    :cond_1
    sget-object v1, Ll/۫۬ۡ;->֫:[B

    const/16 v3, 0x23

    aput-byte v4, v1, v3

    const/16 v3, 0x2a

    .line 36
    aput-byte v4, v1, v3

    new-array v1, v2, [I

    .line 41
    fill-array-data v1, :array_0

    const/4 v3, 0x0

    :goto_2
    const/16 v4, 0x8

    if-ge v3, v2, :cond_2

    .line 46
    aget v6, v1, v3

    .line 47
    sget-object v7, Ll/۫۬ۡ;->֫:[B

    aput-byte v4, v7, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    const/16 v1, 0x2000

    :goto_3
    const/16 v2, 0x200f

    if-gt v1, v2, :cond_3

    .line 53
    sget-object v2, Ll/۫۬ۡ;->֫:[B

    aput-byte v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
    const/16 v1, 0x2028

    :goto_4
    const/16 v2, 0x202f

    if-gt v1, v2, :cond_4

    .line 57
    sget-object v2, Ll/۫۬ۡ;->֫:[B

    aput-byte v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 60
    :cond_4
    sget-object v1, Ll/۫۬ۡ;->֫:[B

    const/16 v2, 0x205f

    aput-byte v4, v1, v2

    const/16 v1, 0x2060

    :goto_5
    const/16 v2, 0x206f

    if-gt v1, v2, :cond_6

    const/16 v2, 0x2065

    if-eq v1, v2, :cond_5

    .line 64
    sget-object v2, Ll/۫۬ۡ;->֫:[B

    aput-byte v4, v2, v1

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    .line 69
    :cond_6
    sget-object v1, Ll/۫۬ۡ;->֫:[B

    const v2, 0xfeff

    aput-byte v5, v1, v2

    const/16 v1, 0x4e00

    :goto_6
    const v2, 0x9fa5

    if-gt v1, v2, :cond_7

    .line 73
    sget-object v2, Ll/۫۬ۡ;->֫:[B

    aput-byte v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    .line 77
    :cond_7
    sget-object v1, Ll/۫۬ۡ;->֫:[B

    const v2, 0xfffd

    const/4 v3, 0x5

    aput-byte v3, v1, v2

    const v1, 0xfff0

    :goto_7
    const v2, 0xfff8

    if-gt v1, v2, :cond_8

    .line 81
    sget-object v2, Ll/۫۬ۡ;->֫:[B

    const/4 v3, 0x6

    aput-byte v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_8
    :goto_8
    const/16 v1, 0x1f

    if-ge v0, v1, :cond_9

    .line 87
    sget-object v1, Ll/۫۬ۡ;->֫:[B

    const-string v2, "\uff08\uff09\uff3b\uff3d\u3014\u3015\u3008\u3009\uff5b\uff5d\u3010\u3011\u300a\u300b\u300c\u300d\u300e\u300f\u3016\u3017\uff5f\uff60\u301a\u301b\uff0c\u3002\uff01\uff1f\uff1a\uff1b\uff5e"

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/4 v3, 0x7

    aput-byte v3, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_9
    return-void

    nop

    :array_0
    .array-data 4
        0x81
        0x82
        0x83
        0x84
        0x85
        0x86
        0x87
        0x88
        0x89
        0x8a
        0x8b
        0x8c
        0x8d
        0x8e
        0x8f
        0x90
        0x91
        0x92
        0x93
        0x94
        0x95
        0x96
        0x97
        0x98
        0x99
        0x9a
        0x9b
        0x9c
        0x9d
        0x9e
        0x9f
        0xad
    .end array-data
.end method

.method public static ֫(C)B
    .locals 1

    .line 98
    sget-object v0, Ll/۫۬ۡ;->֫:[B

    aget-byte p0, v0, p0

    return p0
.end method

.method public static ۧ(C)Z
    .locals 1

    const/16 v0, 0x21

    if-lt p0, v0, :cond_0

    const/16 v0, 0x2f

    if-le p0, v0, :cond_3

    :cond_0
    const/16 v0, 0x3a

    if-lt p0, v0, :cond_1

    const/16 v0, 0x40

    if-le p0, v0, :cond_3

    :cond_1
    const/16 v0, 0x5b

    if-lt p0, v0, :cond_2

    const/16 v0, 0x60

    if-le p0, v0, :cond_3

    :cond_2
    const/16 v0, 0x7b

    if-lt p0, v0, :cond_4

    const/16 v0, 0x7e

    if-gt p0, v0, :cond_4

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method
