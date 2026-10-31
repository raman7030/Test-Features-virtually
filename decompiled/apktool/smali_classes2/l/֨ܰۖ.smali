.class public final Ll/֨ܰۖ;
.super Ljava/lang/Object;
.source "14MA"


# static fields
.field public static final ֫:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    .line 23
    fill-array-data v0, :array_0

    sput-object v0, Ll/֨ܰۖ;->֫:[C

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
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static ֫([B)Ljava/lang/String;
    .locals 6

    .line 55
    array-length v0, p0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 70
    aget-byte v3, p0, v2

    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lez v4, :cond_0

    const/16 v4, 0x20

    .line 72
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    shr-int/lit8 v4, v3, 0x4

    and-int/lit8 v4, v4, 0xf

    .line 73
    sget-object v5, Ll/֨ܰۖ;->֫:[C

    aget-char v4, v5, v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v3, v3, 0xf

    .line 74
    aget-char v3, v5, v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
