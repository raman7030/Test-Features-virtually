.class public final Ll/ܽ۫ۢ;
.super Ljava/lang/Object;
.source "Q6Q0"


# instance fields
.field public final ֫:Ljava/util/IdentityHashMap;

.field public ۧ:[I

.field public ܽ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Ljava/util/IdentityHashMap;

    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v0, p0, Ll/ܽ۫ۢ;->֫:Ljava/util/IdentityHashMap;

    const/16 v0, 0x18

    new-array v0, v0, [I

    .line 31
    iput-object v0, p0, Ll/ܽ۫ۢ;->ۧ:[I

    return-void
.end method

.method private ֫(IIB)V
    .locals 3

    if-ltz p1, :cond_2

    if-gt p2, p1, :cond_0

    goto :goto_0

    .line 74
    :cond_0
    iget v0, p0, Ll/ܽ۫ۢ;->ܽ:I

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Ll/ܽ۫ۢ;->ۧ:[I

    array-length v2, v1

    if-le v0, v2, :cond_1

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ܽ۫ۢ;->ۧ:[I

    .line 75
    :cond_1
    iget-object v0, p0, Ll/ܽ۫ۢ;->ۧ:[I

    iget v1, p0, Ll/ܽ۫ۢ;->ܽ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܽ۫ۢ;->ܽ:I

    aput p1, v0, v1

    add-int/lit8 p1, v1, 0x2

    .line 76
    iput p1, p0, Ll/ܽ۫ۢ;->ܽ:I

    aput p2, v0, v2

    add-int/lit8 v1, v1, 0x3

    .line 77
    iput v1, p0, Ll/ܽ۫ۢ;->ܽ:I

    aput p3, v0, p1

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫(I)Ll/ᩳ۫ۢ;
    .locals 6

    .line 81
    new-instance v0, Ll/ᩳ۫ۢ;

    invoke-direct {v0, p1}, Ll/ᩳ۫ۢ;-><init>(I)V

    .line 82
    iget p1, p0, Ll/ܽ۫ۢ;->ܽ:I

    :cond_0
    :goto_0
    add-int/lit8 p1, p1, -0x3

    if-ltz p1, :cond_1

    .line 83
    invoke-static {}, Ll/ᩴ۫ۢ;->ܽ()V

    .line 84
    iget-object v1, p0, Ll/ܽ۫ۢ;->ۧ:[I

    aget v1, v1, p1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0}, Ll/ᩳ۫ۢ;->֫(Ll/ᩳ۫ۢ;)[B

    move-result-object v2

    array-length v2, v2

    iget-object v3, p0, Ll/ܽ۫ۢ;->ۧ:[I

    add-int/lit8 v4, p1, 0x1

    aget v3, v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-le v2, v1, :cond_0

    .line 85
    invoke-static {v0}, Ll/ᩳ۫ۢ;->֫(Ll/ᩳ۫ۢ;)[B

    move-result-object v3

    iget-object v4, p0, Ll/ܽ۫ۢ;->ۧ:[I

    add-int/lit8 v5, p1, 0x2

    aget v4, v4, v5

    int-to-byte v4, v4

    invoke-static {v3, v1, v2, v4}, Ljava/util/Arrays;->fill([BIIB)V

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final ֫(Ll/ۡܳ֡;)V
    .locals 2

    .line 35
    instance-of v0, p1, Ll/ۢۗۢ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/ۙۙۢ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/ۧۗۢ;

    if-nez v0, :cond_1

    instance-of v0, p1, Ll/۫ۗۢ;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 37
    :cond_1
    :goto_0
    new-instance v0, Ll/ۧ۫ۢ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۧ۫ۢ;-><init>(I)V

    iget-object v1, p0, Ll/ܽ۫ۢ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/ۡܳ֡;Ll/֡ܳ֡;)V
    .locals 3

    .line 42
    instance-of v0, p1, Ll/᩹ۗۢ;

    if-nez v0, :cond_0

    instance-of v1, p1, Ll/ۢۗۢ;

    if-nez v1, :cond_0

    instance-of v1, p1, Ll/ۙۙۢ;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p1, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    goto :goto_0

    :cond_1
    move-object v0, p1

    .line 44
    :goto_0
    iget-object v1, p0, Ll/ܽ۫ۢ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, v0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ۫ۢ;

    if-nez v0, :cond_2

    goto :goto_1

    .line 46
    :cond_2
    invoke-interface {p2}, Ll/֡ܳ֡;->getType()I

    move-result v1

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_3

    iget-byte v1, v0, Ll/ۧ۫ۢ;->ܿ:B

    or-int/lit8 v1, v1, 0x1

    int-to-byte v1, v1

    iput-byte v1, v0, Ll/ۧ۫ۢ;->ܿ:B

    .line 47
    :cond_3
    invoke-interface {p2}, Ll/֡ܳ֡;->getType()I

    move-result p2

    const/16 v1, 0x7f

    if-ne p2, v1, :cond_4

    instance-of p1, p1, Ll/ۙۙۢ;

    if-nez p1, :cond_4

    iget-byte p1, v0, Ll/ۧ۫ۢ;->ܿ:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, v0, Ll/ۧ۫ۢ;->ܿ:B

    :cond_4
    :goto_1
    return-void
.end method

.method public final ۧ(Ll/ۡܳ֡;)V
    .locals 5

    .line 115
    iget-object v0, p1, Ll/᩵ܳ֡;->ۧ:Ll/ۡܳ֡;

    .line 51
    iget-object v1, p0, Ll/ܽ۫ۢ;->֫:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, v0}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ۫ۢ;

    if-eqz v0, :cond_2

    .line 322
    iget-object v2, p1, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    if-eqz v2, :cond_2

    .line 328
    iget-object v3, p1, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    if-eqz v3, :cond_2

    .line 53
    invoke-interface {v2}, Ll/֡ܳ֡;->ᩳ()I

    move-result v2

    .line 328
    iget-object v3, p1, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    .line 53
    invoke-interface {v3}, Ll/֡ܳ֡;->ܿ()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    .line 54
    instance-of v4, p1, Ll/ۛۗۢ;

    if-eqz v4, :cond_0

    iput v2, v0, Ll/ۧ۫ۢ;->᩻:I

    iput v3, v0, Ll/ۧ۫ۢ;->ܳ:I

    .line 55
    :cond_0
    instance-of v4, p1, Ll/ܰۙۢ;

    if-eqz v4, :cond_1

    iput v2, v0, Ll/ۧ۫ۢ;->ᩳ:I

    iput v3, v0, Ll/ۧ۫ۢ;->ܽ:I

    .line 56
    :cond_1
    instance-of v4, p1, Ll/ۗۙۢ;

    if-eqz v4, :cond_2

    iput v2, v0, Ll/ۧ۫ۢ;->ۧ:I

    iput v3, v0, Ll/ۧ۫ۢ;->֫:I

    .line 58
    :cond_2
    invoke-virtual {v1, p1}, Ljava/util/IdentityHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ۫ۢ;

    if-nez v0, :cond_3

    goto :goto_1

    .line 60
    :cond_3
    instance-of v1, p1, Ll/ۢۗۢ;

    if-nez v1, :cond_6

    instance-of v1, p1, Ll/ۙۙۢ;

    if-eqz v1, :cond_4

    goto :goto_0

    .line 64
    :cond_4
    instance-of p1, p1, Ll/ۧۗۢ;

    if-nez p1, :cond_5

    iget v1, v0, Ll/ۧ۫ۢ;->᩻:I

    if-ltz v1, :cond_7

    .line 65
    :cond_5
    iget v1, v0, Ll/ۧ۫ۢ;->᩻:I

    iget v2, v0, Ll/ۧ۫ۢ;->ܳ:I

    iget-byte v3, v0, Ll/ۧ۫ۢ;->ܿ:B

    invoke-direct {p0, v1, v2, v3}, Ll/ܽ۫ۢ;->֫(IIB)V

    .line 66
    iget v1, v0, Ll/ۧ۫ۢ;->ᩳ:I

    iget v2, v0, Ll/ۧ۫ۢ;->ܽ:I

    iget-byte v3, v0, Ll/ۧ۫ۢ;->ܿ:B

    invoke-direct {p0, v1, v2, v3}, Ll/ܽ۫ۢ;->֫(IIB)V

    if-eqz p1, :cond_7

    .line 68
    iget p1, v0, Ll/ۧ۫ۢ;->ۧ:I

    iget v0, v0, Ll/ۧ۫ۢ;->֫:I

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Ll/ܽ۫ۢ;->֫(IIB)V

    return-void

    .line 322
    :cond_6
    :goto_0
    iget-object v1, p1, Ll/ۡܳ֡;->ᩳ:Ll/֡ܳ֡;

    if-eqz v1, :cond_7

    .line 328
    iget-object v2, p1, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    if-eqz v2, :cond_7

    .line 62
    invoke-interface {v1}, Ll/֡ܳ֡;->ᩳ()I

    move-result v1

    .line 328
    iget-object p1, p1, Ll/ۡܳ֡;->ܿ:Ll/֡ܳ֡;

    .line 62
    invoke-interface {p1}, Ll/֡ܳ֡;->ܿ()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iget-byte v0, v0, Ll/ۧ۫ۢ;->ܿ:B

    invoke-direct {p0, v1, p1, v0}, Ll/ܽ۫ۢ;->֫(IIB)V

    :cond_7
    :goto_1
    return-void
.end method
