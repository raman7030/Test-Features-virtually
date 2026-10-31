.class public final Ll/֡ۧܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public final ֫:I

.field public final ۧ:[I


# direct methods
.method public constructor <init>([I)V
    .locals 0

    .line 2382
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2383
    iput-object p1, p0, Ll/֡ۧܳ;->ۧ:[I

    .line 2384
    invoke-static {p1}, Ljava/util/Arrays;->hashCode([I)I

    move-result p1

    iput p1, p0, Ll/֡ۧܳ;->֫:I

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/֡ۧܳ;)[I
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֡ۧܳ;->ۧ:[I

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 2390
    instance-of v0, p1, Ll/֡ۧܳ;

    if-eqz v0, :cond_0

    .line 2389
    check-cast p1, Ll/֡ۧܳ;

    iget-object v0, p0, Ll/֡ۧܳ;->ۧ:[I

    iget-object p1, p1, Ll/֡ۧܳ;->ۧ:[I

    .line 2390
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 2395
    iget v0, p0, Ll/֡ۧܳ;->֫:I

    return v0
.end method

.method public final ֫(Ll/֡ۧܳ;)Ll/֡ۧܳ;
    .locals 8

    .line 2405
    iget-object v0, p0, Ll/֡ۧܳ;->ۧ:[I

    array-length v1, v0

    iget-object v2, p1, Ll/֡ۧܳ;->ۧ:[I

    iget-object p1, p1, Ll/֡ۧܳ;->ۧ:[I

    array-length v2, v2

    add-int/2addr v1, v2

    new-array v2, v1, [I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 2409
    :goto_0
    array-length v6, v0

    if-lt v3, v6, :cond_2

    array-length v6, p1

    if-ge v4, v6, :cond_0

    goto :goto_2

    .line 2425
    :cond_0
    new-instance p1, Ll/֡ۧܳ;

    if-ne v5, v1, :cond_1

    goto :goto_1

    .line 2426
    :cond_1
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    :goto_1
    invoke-direct {p1, v2}, Ll/֡ۧܳ;-><init>([I)V

    return-object p1

    .line 2411
    :cond_2
    :goto_2
    array-length v6, p1

    if-ge v4, v6, :cond_6

    array-length v6, v0

    if-ge v3, v6, :cond_3

    aget v6, v0, v3

    aget v7, p1, v4

    if-ge v6, v7, :cond_3

    goto :goto_4

    .line 2415
    :cond_3
    array-length v6, v0

    if-ge v3, v6, :cond_5

    aget v6, p1, v4

    aget v7, v0, v3

    if-ge v6, v7, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_5
    :goto_3
    add-int/lit8 v6, v4, 0x1

    .line 2417
    aget v7, p1, v4

    move v4, v6

    goto :goto_5

    :cond_6
    :goto_4
    add-int/lit8 v6, v3, 0x1

    .line 2414
    aget v7, v0, v3

    move v3, v6

    :goto_5
    add-int/lit8 v6, v5, 0x1

    .line 2423
    aput v7, v2, v5

    move v5, v6

    goto :goto_0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 2400
    iget-object v0, p0, Ll/֡ۧܳ;->ۧ:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
