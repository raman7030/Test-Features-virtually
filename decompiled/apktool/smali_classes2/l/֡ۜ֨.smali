.class public final Ll/֡ۜ֨;
.super Ll/ۚۜ֨;
.source "11SF"


# static fields
.field public static final ᩳ:[[J


# instance fields
.field public ܽ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x1

    const/16 v2, 0x100

    aput v2, v0, v1

    const/4 v3, 0x0

    const/4 v4, 0x4

    aput v4, v0, v3

    .line 11
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[J

    sput-object v0, Ll/֡ۜ֨;->ᩳ:[[J

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_4

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_3

    if-nez v0, :cond_0

    int-to-long v5, v3

    goto :goto_2

    .line 18
    :cond_0
    sget-object v5, Ll/֡ۜ֨;->ᩳ:[[J

    add-int/lit8 v6, v0, -0x1

    aget-object v5, v5, v6

    aget-wide v6, v5, v3

    move-wide v5, v6

    :goto_2
    const/4 v7, 0x0

    :goto_3
    const/16 v8, 0x8

    if-ge v7, v8, :cond_2

    const-wide/16 v8, 0x1

    and-long v10, v5, v8

    cmp-long v12, v10, v8

    ushr-long/2addr v5, v1

    if-nez v12, :cond_1

    const-wide v8, -0x3693a86a2878f0beL    # -5.0564049839430436E45

    xor-long/2addr v5, v8

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 26
    :cond_2
    sget-object v7, Ll/֡ۜ֨;->ᩳ:[[J

    aget-object v7, v7, v0

    aput-wide v5, v7, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 31
    iput-wide v0, p0, Ll/֡ۜ֨;->ܽ:J

    const/16 v0, 0x8

    .line 34
    iput v0, p0, Ll/ۚۜ֨;->ۧ:I

    const-string v0, "CRC64"

    .line 35
    iput-object v0, p0, Ll/ۚۜ֨;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫([BII)V
    .locals 11

    add-int/2addr p3, p2

    add-int/lit8 v0, p3, -0x3

    :goto_0
    const/4 v1, 0x0

    .line 43
    sget-object v2, Ll/֡ۜ֨;->ᩳ:[[J

    if-ge p2, v0, :cond_0

    .line 44
    iget-wide v3, p0, Ll/֡ۜ֨;->ܽ:J

    long-to-int v5, v3

    const/4 v6, 0x3

    .line 45
    aget-object v6, v2, v6

    and-int/lit16 v7, v5, 0xff

    aget-byte v8, p1, p2

    and-int/lit16 v8, v8, 0xff

    xor-int/2addr v7, v8

    aget-wide v7, v6, v7

    const/4 v6, 0x2

    aget-object v6, v2, v6

    ushr-int/lit8 v9, v5, 0x8

    and-int/lit16 v9, v9, 0xff

    add-int/lit8 v10, p2, 0x1

    aget-byte v10, p1, v10

    and-int/lit16 v10, v10, 0xff

    xor-int/2addr v9, v10

    aget-wide v9, v6, v9

    xor-long v6, v7, v9

    const/16 v8, 0x20

    ushr-long/2addr v3, v8

    xor-long/2addr v3, v6

    const/4 v6, 0x1

    aget-object v6, v2, v6

    ushr-int/lit8 v7, v5, 0x10

    and-int/lit16 v7, v7, 0xff

    add-int/lit8 v8, p2, 0x2

    aget-byte v8, p1, v8

    and-int/lit16 v8, v8, 0xff

    xor-int/2addr v7, v8

    aget-wide v7, v6, v7

    xor-long/2addr v3, v7

    aget-object v1, v2, v1

    ushr-int/lit8 v2, v5, 0x18

    and-int/lit16 v2, v2, 0xff

    add-int/lit8 v5, p2, 0x3

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    xor-int/2addr v2, v5

    aget-wide v5, v1, v2

    xor-long v1, v3, v5

    iput-wide v1, p0, Ll/֡ۜ֨;->ܽ:J

    add-int/lit8 p2, p2, 0x4

    goto :goto_0

    :cond_0
    :goto_1
    if-ge p2, p3, :cond_1

    .line 53
    aget-object v0, v2, v1

    add-int/lit8 v3, p2, 0x1

    aget-byte p2, p1, p2

    and-int/lit16 p2, p2, 0xff

    iget-wide v4, p0, Ll/֡ۜ֨;->ܽ:J

    long-to-int v6, v4

    and-int/lit16 v6, v6, 0xff

    xor-int/2addr p2, v6

    aget-wide v6, v0, p2

    const/16 p2, 0x8

    ushr-long/2addr v4, p2

    xor-long/2addr v4, v6

    iput-wide v4, p0, Ll/֡ۜ֨;->ܽ:J

    move p2, v3

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final ֫()[B
    .locals 6

    const/16 v0, 0x8

    new-array v1, v0, [B

    .line 60
    iget-wide v2, p0, Ll/֡ۜ֨;->ܽ:J

    not-long v2, v2

    long-to-int v4, v2

    int-to-byte v4, v4

    const/4 v5, 0x0

    aput-byte v4, v1, v5

    ushr-long v4, v2, v0

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x1

    aput-byte v0, v1, v4

    const/16 v0, 0x10

    ushr-long v4, v2, v0

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x2

    aput-byte v0, v1, v4

    const/16 v0, 0x18

    ushr-long v4, v2, v0

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x3

    aput-byte v0, v1, v4

    const/16 v0, 0x20

    ushr-long v4, v2, v0

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x4

    aput-byte v0, v1, v4

    const/16 v0, 0x28

    ushr-long v4, v2, v0

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x5

    aput-byte v0, v1, v4

    const/16 v0, 0x30

    ushr-long v4, v2, v0

    long-to-int v0, v4

    int-to-byte v0, v0

    const/4 v4, 0x6

    aput-byte v0, v1, v4

    const/16 v0, 0x38

    ushr-long/2addr v2, v0

    long-to-int v0, v2

    int-to-byte v0, v0

    const/4 v2, 0x7

    aput-byte v0, v1, v2

    const-wide/16 v2, -0x1

    .line 61
    iput-wide v2, p0, Ll/֡ۜ֨;->ܽ:J

    return-object v1
.end method
