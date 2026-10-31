.class public final Ll/᩻ۗۚ;
.super Ljava/lang/Object;
.source "I7DP"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789ABCDEF"

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ll/᩻ۗۚ;->ۧ:[C

    return-void
.end method

.method public static ֫(I)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x8

    :goto_0
    if-lez v0, :cond_1

    add-int/lit8 v1, v0, -0x1

    mul-int/lit8 v1, v1, 0x4

    shr-int v1, p0, v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long v1, p0

    .line 71
    invoke-static {v0, v1, v2}, Ll/᩻ۗۚ;->֫(IJ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IJ)Ljava/lang/String;
    .locals 3

    .line 35
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    :goto_0
    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_0

    mul-int/lit8 v1, p0, 0x4

    shr-long v1, p1, v1

    long-to-int v2, v1

    and-int/lit8 v1, v2, 0xf

    .line 37
    sget-object v2, Ll/᩻ۗۚ;->ۧ:[C

    aget-char v1, v2, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p0, "0"

    :cond_1
    const-string p1, "0x"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
