.class public final Ll/᩻ۜ֨;
.super Ljava/io/InputStream;
.source "M1S8"

# interfaces
.implements Ll/ܶ֨ᩴ;


# static fields
.field public static final synthetic ۨ:I


# instance fields
.field public ۗ:Ljava/io/InputStream;

.field public ۙ:I

.field public ۛ:I

.field public final ۤ:[B

.field public final ۫:Ll/ۤ᩷֨;

.field public ۬:I

.field public final ᩶:[B

.field public ᩸:Z

.field public ᩹:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/ۤ᩷֨;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    .line 17
    iput-object v0, p0, Ll/᩻ۜ֨;->᩶:[B

    const/4 v0, 0x0

    .line 18
    iput v0, p0, Ll/᩻ۜ֨;->۬:I

    .line 19
    iput v0, p0, Ll/᩻ۜ֨;->ۙ:I

    .line 20
    iput v0, p0, Ll/᩻ۜ֨;->ۛ:I

    .line 22
    iput-boolean v0, p0, Ll/᩻ۜ֨;->᩸:Z

    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Ll/᩻ۜ֨;->᩹:Ljava/io/IOException;

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 25
    iput-object v0, p0, Ll/᩻ۜ֨;->ۤ:[B

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    iput-object p1, p0, Ll/᩻ۜ֨;->ۗ:Ljava/io/InputStream;

    .line 42
    iput-object p2, p0, Ll/᩻ۜ֨;->۫:Ll/ۤ᩷֨;

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 118
    iget-object v0, p0, Ll/᩻ۜ֨;->ۗ:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    .line 121
    iget-object v0, p0, Ll/᩻ۜ֨;->᩹:Ljava/io/IOException;

    if-nez v0, :cond_0

    .line 124
    iget v0, p0, Ll/᩻ۜ֨;->ۙ:I

    return v0

    .line 122
    :cond_0
    throw v0

    .line 119
    :cond_1
    new-instance v0, Ll/ۖۜ֨;

    const-string v1, "Stream closed"

    .line 20
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    throw v0
.end method

.method public final close()V
    .locals 2

    .line 129
    iget-object v0, p0, Ll/᩻ۜ֨;->ۗ:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 131
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    iput-object v1, p0, Ll/᩻ۜ֨;->ۗ:Ljava/io/InputStream;

    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Ll/᩻ۜ֨;->ۗ:Ljava/io/InputStream;

    .line 134
    throw v0

    :cond_0
    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 47
    iget-object v1, p0, Ll/᩻ۜ֨;->ۤ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/᩻ۜ֨;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 8

    .line 52
    iget-object v0, p0, Ll/᩻ۜ֨;->᩶:[B

    if-ltz p2, :cond_8

    if-ltz p3, :cond_8

    add-int v1, p2, p3

    if-ltz v1, :cond_8

    array-length v2, p1

    if-gt v1, v2, :cond_8

    const/4 v1, 0x0

    if-nez p3, :cond_0

    return v1

    .line 58
    :cond_0
    iget-object v2, p0, Ll/᩻ۜ֨;->ۗ:Ljava/io/InputStream;

    if-eqz v2, :cond_7

    .line 61
    iget-object v2, p0, Ll/᩻ۜ֨;->᩹:Ljava/io/IOException;

    if-nez v2, :cond_6

    const/4 v2, 0x0

    .line 69
    :goto_0
    :try_start_0
    iget v3, p0, Ll/᩻ۜ֨;->ۙ:I

    invoke-static {v3, p3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 70
    iget v4, p0, Ll/᩻ۜ֨;->۬:I

    invoke-static {v0, v4, p1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 71
    iget v4, p0, Ll/᩻ۜ֨;->۬:I

    add-int/2addr v4, v3

    iput v4, p0, Ll/᩻ۜ֨;->۬:I

    .line 72
    iget v5, p0, Ll/᩻ۜ֨;->ۙ:I

    sub-int/2addr v5, v3

    iput v5, p0, Ll/᩻ۜ֨;->ۙ:I

    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    add-int/2addr v2, v3

    add-int v3, v4, v5

    .line 80
    iget v6, p0, Ll/᩻ۜ֨;->ۛ:I

    add-int/2addr v3, v6

    const/16 v7, 0x1000

    if-ne v3, v7, :cond_1

    add-int/2addr v5, v6

    .line 81
    invoke-static {v0, v4, v0, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 83
    iput v1, p0, Ll/᩻ۜ֨;->۬:I

    :cond_1
    const/4 v3, -0x1

    if-eqz p3, :cond_4

    .line 86
    iget-boolean v4, p0, Ll/᩻ۜ֨;->᩸:Z

    if-eqz v4, :cond_2

    goto :goto_1

    .line 92
    :cond_2
    iget v4, p0, Ll/᩻ۜ֨;->۬:I

    iget v5, p0, Ll/᩻ۜ֨;->ۙ:I

    add-int/2addr v4, v5

    iget v5, p0, Ll/᩻ۜ֨;->ۛ:I

    add-int/2addr v4, v5

    rsub-int v5, v4, 0x1000

    .line 93
    iget-object v6, p0, Ll/᩻ۜ֨;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v6, v0, v4, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-ne v4, v3, :cond_3

    const/4 v3, 0x1

    .line 99
    iput-boolean v3, p0, Ll/᩻ۜ֨;->᩸:Z

    .line 100
    iget v3, p0, Ll/᩻ۜ֨;->ۛ:I

    iput v3, p0, Ll/᩻ۜ֨;->ۙ:I

    .line 101
    iput v1, p0, Ll/᩻ۜ֨;->ۛ:I

    goto :goto_0

    .line 104
    :cond_3
    iget v3, p0, Ll/᩻ۜ֨;->ۛ:I

    add-int/2addr v3, v4

    iput v3, p0, Ll/᩻ۜ֨;->ۛ:I

    .line 105
    iget-object v4, p0, Ll/᩻ۜ֨;->۫:Ll/ۤ᩷֨;

    iget v5, p0, Ll/᩻ۜ֨;->۬:I

    invoke-interface {v4, v5, v3, v0}, Ll/ۤ᩷֨;->֫(II[B)I

    move-result v3

    iput v3, p0, Ll/᩻ۜ֨;->ۙ:I

    .line 107
    iget v4, p0, Ll/᩻ۜ֨;->ۛ:I

    sub-int/2addr v4, v3

    iput v4, p0, Ll/᩻ۜ֨;->ۛ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_4
    :goto_1
    if-lez v2, :cond_5

    return v2

    :cond_5
    return v3

    :catch_0
    move-exception p1

    .line 111
    iput-object p1, p0, Ll/᩻ۜ֨;->᩹:Ljava/io/IOException;

    .line 112
    throw p1

    .line 62
    :cond_6
    throw v2

    .line 59
    :cond_7
    new-instance p1, Ll/ۖۜ֨;

    const-string p2, "Stream closed"

    .line 20
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1

    .line 53
    :cond_8
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
