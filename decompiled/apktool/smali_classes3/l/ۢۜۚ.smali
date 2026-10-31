.class public final Ll/ۢۜۚ;
.super Ljava/lang/Object;
.source "N7O2"


# instance fields
.field public final ֫:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Ll/ۢۜۚ;->֫:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 16
    const-class v0, Ll/ۢۜۚ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Ll/ۢۜۚ;

    .line 18
    iget-object v0, p0, Ll/ۢۜۚ;->֫:[B

    iget-object p1, p1, Ll/ۢۜۚ;->֫:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    .line 23
    iget-object v0, p0, Ll/ۢۜۚ;->֫:[B

    array-length v1, v0

    const/16 v2, 0x80

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    mul-int/lit8 v3, v3, 0x1f

    .line 26
    aget-byte v4, v0, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method
