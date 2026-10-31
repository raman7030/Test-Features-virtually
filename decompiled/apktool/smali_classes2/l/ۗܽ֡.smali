.class public final Ll/ۗܽ֡;
.super Ljava/lang/Object;
.source "04DU"


# static fields
.field public static final ֫:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x40

    new-array v0, v0, [B

    .line 110
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗܽ֡;->֫:[B

    return-void

    :array_0
    .array-data 1
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
        0x47t
        0x48t
        0x49t
        0x4at
        0x4bt
        0x4ct
        0x4dt
        0x4et
        0x4ft
        0x50t
        0x51t
        0x52t
        0x53t
        0x54t
        0x55t
        0x56t
        0x57t
        0x58t
        0x59t
        0x5at
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
        0x67t
        0x68t
        0x69t
        0x6at
        0x6bt
        0x6ct
        0x6dt
        0x6et
        0x6ft
        0x70t
        0x71t
        0x72t
        0x73t
        0x74t
        0x75t
        0x76t
        0x77t
        0x78t
        0x79t
        0x7at
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x2bt
        0x2ft
    .end array-data
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 11

    .line 133
    array-length v0, p0

    const/4 v1, 0x2

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x3

    mul-int/lit8 v0, v0, 0x4

    .line 134
    new-array v0, v0, [B

    .line 135
    array-length v2, p0

    array-length v3, p0

    rem-int/lit8 v3, v3, 0x3

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 136
    :goto_0
    sget-object v5, Ll/ۗܽ֡;->֫:[B

    if-ge v3, v2, :cond_0

    add-int/lit8 v6, v4, 0x1

    .line 137
    aget-byte v7, p0, v3

    and-int/lit16 v7, v7, 0xff

    shr-int/2addr v7, v1

    aget-byte v7, v5, v7

    aput-byte v7, v0, v4

    add-int/lit8 v7, v4, 0x2

    .line 138
    aget-byte v8, p0, v3

    and-int/lit8 v8, v8, 0x3

    shl-int/lit8 v8, v8, 0x4

    add-int/lit8 v9, v3, 0x1

    aget-byte v10, p0, v9

    and-int/lit16 v10, v10, 0xff

    shr-int/lit8 v10, v10, 0x4

    or-int/2addr v8, v10

    aget-byte v8, v5, v8

    aput-byte v8, v0, v6

    add-int/lit8 v6, v4, 0x3

    .line 139
    aget-byte v8, p0, v9

    and-int/lit8 v8, v8, 0xf

    shl-int/2addr v8, v1

    add-int/lit8 v9, v3, 0x2

    aget-byte v10, p0, v9

    and-int/lit16 v10, v10, 0xff

    shr-int/lit8 v10, v10, 0x6

    or-int/2addr v8, v10

    aget-byte v8, v5, v8

    aput-byte v8, v0, v7

    add-int/lit8 v4, v4, 0x4

    .line 140
    aget-byte v7, p0, v9

    and-int/lit8 v7, v7, 0x3f

    aget-byte v5, v5, v7

    aput-byte v5, v0, v6

    add-int/lit8 v3, v3, 0x3

    goto :goto_0

    .line 142
    :cond_0
    array-length v3, p0

    rem-int/lit8 v3, v3, 0x3

    const/16 v6, 0x3d

    const/4 v7, 0x1

    if-eq v3, v7, :cond_2

    if-eq v3, v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v4, 0x1

    .line 150
    aget-byte v8, p0, v2

    and-int/lit16 v8, v8, 0xff

    shr-int/2addr v8, v1

    aget-byte v8, v5, v8

    aput-byte v8, v0, v4

    add-int/lit8 v8, v4, 0x2

    .line 151
    aget-byte v9, p0, v2

    and-int/lit8 v9, v9, 0x3

    shl-int/lit8 v9, v9, 0x4

    add-int/2addr v2, v7

    aget-byte v7, p0, v2

    and-int/lit16 v7, v7, 0xff

    shr-int/lit8 v7, v7, 0x4

    or-int/2addr v7, v9

    aget-byte v7, v5, v7

    aput-byte v7, v0, v3

    add-int/lit8 v4, v4, 0x3

    .line 152
    aget-byte p0, p0, v2

    and-int/lit8 p0, p0, 0xf

    shl-int/2addr p0, v1

    aget-byte p0, v5, p0

    aput-byte p0, v0, v8

    .line 153
    aput-byte v6, v0, v4

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v4, 0x1

    .line 144
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    shr-int/lit8 v3, v3, 0x2

    aget-byte v3, v5, v3

    aput-byte v3, v0, v4

    add-int/lit8 v3, v4, 0x2

    .line 145
    aget-byte p0, p0, v2

    and-int/lit8 p0, p0, 0x3

    shl-int/lit8 p0, p0, 0x4

    aget-byte p0, v5, p0

    aput-byte p0, v0, v1

    add-int/lit8 v4, v4, 0x3

    .line 146
    aput-byte v6, v0, v3

    .line 147
    aput-byte v6, v0, v4

    .line 157
    :goto_1
    :try_start_0
    new-instance p0, Ljava/lang/String;

    const-string v1, "US-ASCII"

    invoke-direct {p0, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 159
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method
