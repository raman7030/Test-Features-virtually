.class public final Ll/֡᩵;
.super Ljava/lang/Object;
.source "R5S6"


# static fields
.field public static final ֫:[I

.field public static final ۧ:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    .line 20
    sput-object v1, Ll/֡᩵;->֫:[I

    new-array v0, v0, [Ljava/lang/Object;

    .line 22
    sput-object v0, Ll/֡᩵;->ۧ:[Ljava/lang/Object;

    return-void
.end method

.method public static ֫(II[I)I
    .locals 3

    add-int/lit8 p0, p0, -0x1

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p0, :cond_2

    add-int v1, v0, p0

    ushr-int/lit8 v1, v1, 0x1

    .line 51
    aget v2, p2, v1

    if-ge v2, p1, :cond_0

    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    :cond_0
    if-le v2, p1, :cond_1

    add-int/lit8 p0, v1, -0x1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    not-int p0, v0

    return p0
.end method

.method public static ֫(J[JI)I
    .locals 5

    add-int/lit8 p3, p3, -0x1

    const/4 v0, 0x0

    :goto_0
    if-gt v0, p3, :cond_2

    add-int v1, v0, p3

    ushr-int/lit8 v1, v1, 0x1

    .line 70
    aget-wide v2, p2, v1

    cmp-long v4, v2, p0

    if-gez v4, :cond_0

    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    :cond_0
    if-lez v4, :cond_1

    add-int/lit8 p3, v1, -0x1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    not-int p0, v0

    return p0
.end method
