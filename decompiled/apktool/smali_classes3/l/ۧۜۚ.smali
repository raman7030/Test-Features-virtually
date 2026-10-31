.class public final Ll/ۧۜۚ;
.super Ljava/lang/Object;
.source "S4Y9"


# instance fields
.field public final ֫:[I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 3

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    iput-object v0, p0, Ll/ۧۜۚ;->֫:[I

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 50
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 51
    iget-object v2, p0, Ll/ۧۜۚ;->֫:[I

    aput v1, v2, v0

    .line 52
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺֫ۚ;

    invoke-interface {v2}, Ll/᩺֫ۚ;->ۚ()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 3

    if-ltz p1, :cond_0

    .line 76
    iget-object v0, p0, Ll/ۧۜۚ;->֫:[I

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 79
    aget p1, v0, p1

    return p1

    .line 77
    :cond_0
    new-instance v0, Ll/۟᩻ۚ;

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x0

    const-string v2, "Instruction index out of bounds: %d"

    .line 46
    invoke-direct {v0, p1, v2, v1}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    throw v0
.end method

.method public final ֫(IZ)I
    .locals 2

    .line 61
    iget-object v0, p0, Ll/ۧۜۚ;->֫:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result v0

    if-gez v0, :cond_1

    const/4 v1, 0x1

    if-nez p2, :cond_0

    not-int p1, v0

    sub-int/2addr p1, v1

    return p1

    .line 64
    :cond_0
    new-instance p2, Ll/֫ۜۚ;

    .line 86
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x0

    const-string v1, "No instruction at offset %d"

    .line 46
    invoke-direct {p2, p1, v1, v0}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    throw p2

    :cond_1
    return v0
.end method
