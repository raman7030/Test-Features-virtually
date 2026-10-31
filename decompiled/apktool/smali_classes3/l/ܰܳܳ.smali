.class public Ll/ܰܳܳ;
.super Ljava/lang/Object;
.source "BAUQ"


# instance fields
.field public final ֫:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 968
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 966
    iput-object v0, p0, Ll/ܰܳܳ;->֫:[B

    return-void
.end method

.method public constructor <init>(Ll/ܰܳܳ;)V
    .locals 3

    .line 971
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x20

    new-array v0, v0, [B

    .line 966
    iput-object v0, p0, Ll/ܰܳܳ;->֫:[B

    .line 972
    iget-object p1, p1, Ll/ܰܳܳ;->֫:[B

    const/4 v1, 0x0

    array-length v2, v0

    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method private ۧ(Ljava/lang/Object;)I
    .locals 1

    .line 1002
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    iget-object v0, p0, Ll/ܰܳܳ;->֫:[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    and-int/2addr p1, v0

    return p1
.end method


# virtual methods
.method public ֫(Ljava/lang/Object;)I
    .locals 1

    .line 996
    invoke-direct {p0, p1}, Ll/ܰܳܳ;->ۧ(Ljava/lang/Object;)I

    move-result p1

    .line 998
    iget-object v0, p0, Ll/ܰܳܳ;->֫:[B

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public ֫(I)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 986
    :goto_0
    iget-object v2, p0, Ll/ܰܳܳ;->֫:[B

    array-length v3, v2

    if-ge v1, v3, :cond_2

    .line 987
    aget-byte v3, v2, v1

    and-int/lit16 v4, v3, 0xff

    add-int/lit8 v5, p1, 0x1

    if-ne v4, v5, :cond_0

    .line 988
    aput-byte v0, v2, v1

    goto :goto_1

    :cond_0
    and-int/lit16 v4, v3, 0xff

    if-le v4, v5, :cond_1

    add-int/lit8 v3, v3, -0x1

    int-to-byte v3, v3

    .line 990
    aput-byte v3, v2, v1

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public ֫(Ljava/lang/String;I)V
    .locals 1

    .line 976
    invoke-direct {p0, p1}, Ll/ܰܳܳ;->ۧ(Ljava/lang/Object;)I

    move-result p1

    const/16 v0, 0xff

    if-ge p2, v0, :cond_0

    .line 979
    iget-object v0, p0, Ll/ܰܳܳ;->֫:[B

    add-int/lit8 p2, p2, 0x1

    int-to-byte p2, p2

    aput-byte p2, v0, p1

    return-void

    .line 981
    :cond_0
    iget-object p2, p0, Ll/ܰܳܳ;->֫:[B

    const/4 v0, 0x0

    aput-byte v0, p2, p1

    return-void
.end method
