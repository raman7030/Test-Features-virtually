.class public final Ll/ۖۗ֡;
.super Ljava/lang/Object;
.source "65AK"


# static fields
.field public static ֫:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "runtime"

    const-string v1, "system"

    const-string v2, "build"

    .line 41
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۖۗ֡;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 3

    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v0, "build"

    .line 55
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "runtime"

    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    const-string v0, "system"

    .line 61
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x2

    return p0

    .line 64
    :cond_2
    new-instance v0, Ll/ܶ᩵ۚ;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v1

    const/4 p0, 0x0

    const-string v1, "Invalid annotation visibility: %s"

    .line 46
    invoke-direct {v0, p0, v1, v2}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    throw v0
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 3

    if-ltz p0, :cond_0

    const/4 v0, 0x3

    if-ge p0, v0, :cond_0

    .line 50
    sget-object v0, Ll/ۖۗ֡;->֫:[Ljava/lang/String;

    aget-object p0, v0, p0

    return-object p0

    .line 48
    :cond_0
    new-instance v0, Ll/ܶ᩵ۚ;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x0

    const-string v2, "Invalid annotation visibility %d"

    .line 46
    invoke-direct {v0, p0, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    throw v0
.end method
