.class public final Ll/۫֨᩵;
.super Ljava/lang/Object;
.source "O9V0"


# static fields
.field public static final ֫:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 32
    fill-array-data v0, :array_0

    sput-object v0, Ll/۫֨᩵;->֫:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static ֫(II)Ljava/lang/String;
    .locals 5

    .line 47
    new-array v0, p1, [C

    move v1, p1

    :goto_0
    if-lez v1, :cond_2

    add-int/lit8 v2, v1, -0x1

    if-ge v2, p1, :cond_0

    and-int/lit8 v3, p0, 0xf

    .line 104
    sget-object v4, Ll/۫֨᩵;->֫:[C

    aget-char v3, v4, v3

    aput-char v3, v0, v2

    :cond_0
    if-eqz p0, :cond_1

    ushr-int/lit8 p0, p0, 0x4

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    .line 49
    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static ֫([BII)Ljava/lang/String;
    .locals 7

    mul-int/lit8 v0, p2, 0x2

    .line 72
    new-array v0, v0, [C

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    add-int/lit8 v3, v2, 0x1

    add-int v4, p1, v1

    .line 74
    aget-byte v4, p0, v4

    shr-int/lit8 v5, v4, 0x4

    and-int/lit8 v5, v5, 0xf

    sget-object v6, Ll/۫֨᩵;->֫:[C

    aget-char v5, v6, v5

    aput-char v5, v0, v2

    add-int/lit8 v2, v2, 0x2

    and-int/lit8 v4, v4, 0xf

    .line 75
    aget-char v4, v6, v4

    aput-char v4, v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 77
    :cond_0
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method
