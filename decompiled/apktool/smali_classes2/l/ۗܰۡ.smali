.class public final Ll/ۗܰۡ;
.super Ljava/lang/Object;
.source "44G0"


# static fields
.field public static final ۧ:[I


# instance fields
.field public final ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/16 v0, 0x100

    new-array v1, v0, [I

    .line 5
    sput-object v1, Ll/ۗܰۡ;->ۧ:[I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    const/4 v2, 0x0

    move v3, v1

    :goto_1
    const/16 v4, 0x8

    if-ge v2, v4, :cond_1

    and-int/lit8 v4, v3, 0x1

    const/4 v5, 0x1

    ushr-int/lit8 v3, v3, 0x1

    if-ne v4, v5, :cond_0

    const v4, -0x12477ce0

    xor-int/2addr v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 17
    :cond_1
    sget-object v2, Ll/ۗܰۡ;->ۧ:[I

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [I

    .line 4
    iput-object v0, p0, Ll/ۗܰۡ;->֫:[I

    return-void
.end method


# virtual methods
.method public final ֫()B
    .locals 2

    .line 45
    iget-object v0, p0, Ll/ۗܰۡ;->֫:[I

    const/4 v1, 0x2

    aget v0, v0, v1

    or-int/2addr v0, v1

    xor-int/lit8 v1, v0, 0x1

    mul-int v0, v0, v1

    ushr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    return v0
.end method

.method public final ֫(B)V
    .locals 5

    .line 34
    iget-object v0, p0, Ll/ۗܰۡ;->֫:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    ushr-int/lit8 v3, v2, 0x8

    xor-int/2addr p1, v2

    and-int/lit16 p1, p1, 0xff

    .line 41
    sget-object v2, Ll/ۗܰۡ;->ۧ:[I

    aget p1, v2, p1

    xor-int/2addr p1, v3

    .line 34
    aput p1, v0, v1

    const/4 v1, 0x1

    .line 35
    aget v3, v0, v1

    and-int/lit16 p1, p1, 0xff

    add-int/2addr v3, p1

    aput v3, v0, v1

    const p1, 0x8088405

    mul-int v3, v3, p1

    add-int/2addr v3, v1

    .line 36
    aput v3, v0, v1

    const/4 p1, 0x2

    .line 37
    aget v1, v0, p1

    shr-int/lit8 v3, v3, 0x18

    int-to-byte v3, v3

    ushr-int/lit8 v4, v1, 0x8

    xor-int/2addr v1, v3

    and-int/lit16 v1, v1, 0xff

    .line 41
    aget v1, v2, v1

    xor-int/2addr v1, v4

    .line 37
    aput v1, v0, p1

    return-void
.end method

.method public final ֫([B)V
    .locals 4

    const v0, 0x12345678

    .line 25
    iget-object v1, p0, Ll/ۗܰۡ;->֫:[I

    const/4 v2, 0x0

    aput v0, v1, v2

    const/4 v0, 0x1

    const v3, 0x23456789

    .line 26
    aput v3, v1, v0

    const/4 v0, 0x2

    const v3, 0x34567890

    .line 27
    aput v3, v1, v0

    .line 28
    array-length v0, p1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-byte v1, p1, v2

    .line 29
    invoke-virtual {p0, v1}, Ll/ۗܰۡ;->֫(B)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
