.class public final Ll/۬ܰۡ;
.super Ljava/lang/Object;
.source "HAQV"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۙ:[J


# instance fields
.field public final ᩶:Ljava/io/InputStream;

.field public ᩸:J

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x40

    new-array v0, v0, [J

    .line 15
    sput-object v0, Ll/۬ܰۡ;->ۙ:[J

    const/4 v0, 0x1

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x3f

    if-gt v1, v2, :cond_0

    .line 19
    sget-object v2, Ll/۬ܰۡ;->ۙ:[J

    add-int/lit8 v3, v1, -0x1

    aget-wide v3, v2, v3

    shl-long/2addr v3, v0

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    aput-wide v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 1

    .line 2
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/۬ܰۡ;->᩶:Ljava/io/InputStream;

    return-void
.end method

.method private ۧ(I)J
    .locals 5

    .line 144
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 145
    iget-wide v0, p0, Ll/۬ܰۡ;->᩸:J

    sget-object v2, Ll/۬ܰۡ;->ۙ:[J

    aget-wide v3, v2, p1

    and-long v2, v3, v0

    ushr-long/2addr v0, p1

    .line 146
    iput-wide v0, p0, Ll/۬ܰۡ;->᩸:J

    .line 150
    iget v0, p0, Ll/۬ܰۡ;->᩹:I

    sub-int/2addr v0, p1

    iput v0, p0, Ll/۬ܰۡ;->᩹:I

    return-wide v2
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 42
    iget-object v0, p0, Ll/۬ܰۡ;->᩶:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public final ֫(I)J
    .locals 10

    .line 65
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    if-ltz p1, :cond_4

    const/16 v0, 0x3f

    if-gt p1, v0, :cond_4

    .line 162
    :goto_0
    iget v0, p0, Ll/۬ܰۡ;->᩹:I

    const-wide/16 v1, 0x0

    iget-object v3, p0, Ll/۬ܰۡ;->᩶:Ljava/io/InputStream;

    if-ge v0, p1, :cond_1

    const/16 v4, 0x39

    if-ge v0, v4, :cond_1

    .line 163
    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v0

    int-to-long v3, v0

    cmp-long v0, v3, v1

    if-gez v0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 167
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 168
    iget-wide v0, p0, Ll/۬ܰۡ;->᩸:J

    iget v2, p0, Ll/۬ܰۡ;->᩹:I

    shl-long/2addr v3, v2

    or-long/2addr v0, v3

    iput-wide v0, p0, Ll/۬ܰۡ;->᩸:J

    add-int/lit8 v2, v2, 0x8

    .line 173
    iput v2, p0, Ll/۬ܰۡ;->᩹:I

    goto :goto_0

    :cond_1
    if-ge v0, p1, :cond_3

    sub-int v0, p1, v0

    rsub-int/lit8 v4, v0, 0x8

    .line 122
    invoke-virtual {v3}, Ljava/io/InputStream;->read()I

    move-result v3

    int-to-long v5, v3

    cmp-long v3, v5, v1

    if-gez v3, :cond_2

    return-wide v5

    .line 126
    :cond_2
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 127
    sget-object v1, Ll/۬ܰۡ;->ۙ:[J

    aget-wide v2, v1, v0

    and-long/2addr v2, v5

    .line 128
    iget-wide v7, p0, Ll/۬ܰۡ;->᩸:J

    iget v9, p0, Ll/۬ܰۡ;->᩹:I

    shl-long/2addr v2, v9

    or-long/2addr v2, v7

    iput-wide v2, p0, Ll/۬ܰۡ;->᩸:J

    ushr-long/2addr v5, v0

    .line 129
    aget-wide v7, v1, v4

    and-long/2addr v5, v7

    .line 136
    aget-wide v0, v1, p1

    and-long/2addr v0, v2

    .line 137
    iput-wide v5, p0, Ll/۬ܰۡ;->᩸:J

    .line 138
    iput v4, p0, Ll/۬ܰۡ;->᩹:I

    return-wide v0

    .line 75
    :cond_3
    invoke-direct {p0, p1}, Ll/۬ܰۡ;->ۧ(I)J

    move-result-wide v0

    return-wide v0

    .line 66
    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string v0, "count must not be negative or greater than 63"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()V
    .locals 1

    .line 108
    iget v0, p0, Ll/۬ܰۡ;->᩹:I

    rem-int/lit8 v0, v0, 0x8

    if-lez v0, :cond_0

    .line 110
    invoke-direct {p0, v0}, Ll/۬ܰۡ;->ۧ(I)J

    :cond_0
    return-void
.end method

.method public final ܽ()J
    .locals 6

    .line 99
    iget v0, p0, Ll/۬ܰۡ;->᩹:I

    int-to-long v0, v0

    iget-object v2, p0, Ll/۬ܰۡ;->᩶:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0x8

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final ᩳ()I
    .locals 1

    .line 86
    iget v0, p0, Ll/۬ܰۡ;->᩹:I

    return v0
.end method
