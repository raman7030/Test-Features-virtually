.class public final Ll/֫ۖۧ;
.super Ljava/lang/Object;
.source "A8LK"


# static fields
.field public static final ᩳ:[J


# instance fields
.field public ֫:I

.field public final ۧ:[B

.field public ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [J

    .line 35
    fill-array-data v0, :array_0

    sput-object v0, Ll/֫ۖۧ;->ᩳ:[J

    return-void

    :array_0
    .array-data 8
        0x80
        0x40
        0x20
        0x10
        0x8
        0x4
        0x2
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [B

    .line 44
    iput-object v0, p0, Ll/֫ۖۧ;->ۧ:[B

    return-void
.end method

.method public static ֫(I)I
    .locals 6

    const/4 v0, 0x0

    :cond_0
    const/16 v1, 0x8

    if-ge v0, v1, :cond_1

    .line 123
    sget-object v1, Ll/֫ۖۧ;->ᩳ:[J

    aget-wide v2, v1, v0

    int-to-long v4, p0

    and-long v1, v2, v4

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    add-int/lit8 v0, v0, 0x1

    if-eqz v5, :cond_0

    return v0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫([BIZ)J
    .locals 7

    const/4 v0, 0x0

    .line 141
    aget-byte v0, p0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    if-eqz p2, :cond_0

    add-int/lit8 p2, p1, -0x1

    .line 143
    sget-object v4, Ll/֫ۖۧ;->ᩳ:[J

    aget-wide v5, v4, p2

    not-long v4, v5

    and-long/2addr v0, v4

    :cond_0
    const/4 p2, 0x1

    :goto_0
    if-ge p2, p1, :cond_1

    const/16 v4, 0x8

    shl-long/2addr v0, v4

    .line 146
    aget-byte v4, p0, p2

    int-to-long v4, v4

    and-long/2addr v4, v2

    or-long/2addr v0, v4

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    return-wide v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 110
    iget v0, p0, Ll/֫ۖۧ;->֫:I

    return v0
.end method

.method public final ֫(Ll/۠᩷ۧ;ZZI)J
    .locals 4

    .line 81
    iget v0, p0, Ll/֫ۖۧ;->ܽ:I

    const/4 v1, 0x0

    iget-object v2, p0, Ll/֫ۖۧ;->ۧ:[B

    const/4 v3, 0x1

    if-nez v0, :cond_2

    .line 83
    invoke-interface {p1, p2, v1, v3, v2}, Ll/۠᩷ۧ;->֫(ZII[B)Z

    move-result p2

    if-nez p2, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    .line 86
    :cond_0
    aget-byte p2, v2, v1

    and-int/lit16 p2, p2, 0xff

    .line 87
    invoke-static {p2}, Ll/֫ۖۧ;->֫(I)I

    move-result p2

    iput p2, p0, Ll/֫ۖۧ;->֫:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_1

    .line 91
    iput v3, p0, Ll/֫ۖۧ;->ܽ:I

    goto :goto_0

    .line 89
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No valid varint length mask found"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 94
    :cond_2
    :goto_0
    iget p2, p0, Ll/֫ۖۧ;->֫:I

    if-le p2, p4, :cond_3

    .line 95
    iput v1, p0, Ll/֫ۖۧ;->ܽ:I

    const-wide/16 p1, -0x2

    return-wide p1

    :cond_3
    if-eq p2, v3, :cond_4

    sub-int/2addr p2, v3

    .line 101
    invoke-interface {p1, v2, v3, p2}, Ll/۠᩷ۧ;->readFully([BII)V

    .line 104
    :cond_4
    iput v1, p0, Ll/֫ۖۧ;->ܽ:I

    .line 105
    iget p1, p0, Ll/֫ۖۧ;->֫:I

    invoke-static {v2, p1, p3}, Ll/֫ۖۧ;->֫([BIZ)J

    move-result-wide p1

    return-wide p1
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 49
    iput v0, p0, Ll/֫ۖۧ;->ܽ:I

    .line 50
    iput v0, p0, Ll/֫ۖۧ;->֫:I

    return-void
.end method
