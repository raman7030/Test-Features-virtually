.class public final Ll/ᩴ᩹ᩳ;
.super Ljava/lang/Object;
.source "06PW"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:Ll/۬ۜܽ;

.field public final ܿ:Ljava/lang/Object;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/۬ۜܽ;)V
    .locals 1

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩹ᩳ;->ᩳ:Ljava/util/ArrayList;

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ᩴ᩹ᩳ;->ܿ:Ljava/lang/Object;

    .line 55
    iput-object p1, p0, Ll/ᩴ᩹ᩳ;->ܽ:Ll/۬ۜܽ;

    return-void
.end method

.method private ֫(I)Ll/᩶᩹ᩳ;
    .locals 14

    const/16 v0, 0x20

    if-gt p1, v0, :cond_e

    .line 68
    iget-object v0, p0, Ll/ᩴ᩹ᩳ;->ܽ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    return-object v3

    :cond_0
    if-ltz v1, :cond_d

    .line 70
    iget-object v2, p0, Ll/ᩴ᩹ᩳ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-gt v1, v4, :cond_d

    .line 71
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 72
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩶᩹ᩳ;

    if-eqz p1, :cond_1

    return-object p1

    .line 73
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cyclic text graph"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 76
    :cond_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    invoke-virtual {v0}, Ll/۬ۜܽ;->readByte()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    .line 79
    iget-object v5, p0, Ll/ᩴ᩹ᩳ;->ܿ:Ljava/lang/Object;

    const/4 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-ne v3, v7, :cond_7

    .line 80
    invoke-virtual {v0}, Ll/۬ۜܽ;->readByte()B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    if-lt v9, v7, :cond_6

    .line 81
    iget v3, p0, Ll/ᩴ᩹ᩳ;->֫:I

    if-gt v9, v3, :cond_6

    if-gt p1, v7, :cond_6

    int-to-long v10, v9

    if-ne p1, v7, :cond_3

    const/4 v6, 0x1

    :cond_3
    int-to-long v6, v6

    mul-long v10, v10, v6

    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v6

    cmp-long v3, v10, v6

    if-gtz v3, :cond_6

    const/4 v3, 0x1

    .line 83
    new-array v7, v9, [C

    :goto_0
    if-ge v4, v9, :cond_5

    if-ne p1, v3, :cond_4

    .line 84
    invoke-virtual {v0}, Ll/۬ۜܽ;->readByte()B

    move-result v6

    and-int/lit16 v6, v6, 0xff

    int-to-char v6, v6

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩻()C

    move-result v6

    :goto_1
    aput-char v6, v7, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 85
    :cond_5
    new-instance p1, Ll/᩸᩹ᩳ;

    iget v6, p0, Ll/ᩴ᩹ᩳ;->֫:I

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    .line 16
    invoke-direct/range {v4 .. v10}, Ll/᩸᩹ᩳ;-><init>(Ljava/lang/Object;I[CIILl/᩸۬ᩳ;)V

    goto :goto_3

    .line 82
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid text page length"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    if-ne v3, v6, :cond_c

    if-lt v9, v6, :cond_b

    .line 87
    iget v3, p0, Ll/ᩴ᩹ᩳ;->ۧ:I

    if-gt v9, v3, :cond_b

    int-to-long v6, v9

    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v10

    const-wide/16 v12, 0x4

    div-long/2addr v10, v12

    cmp-long v0, v6, v10

    if-gtz v0, :cond_b

    .line 89
    new-array v0, v9, [Ll/᩶᩹ᩳ;

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v9, :cond_a

    add-int/lit8 v6, p1, 0x1

    .line 91
    invoke-direct {p0, v6}, Ll/ᩴ᩹ᩳ;->֫(I)Ll/᩶᩹ᩳ;

    move-result-object v6

    aput-object v6, v0, v3

    if-eqz v6, :cond_9

    if-lez v3, :cond_8

    .line 92
    iget v6, v6, Ll/᩶᩹ᩳ;->֫:I

    aget-object v7, v0, v4

    iget v7, v7, Ll/᩶᩹ᩳ;->֫:I

    if-ne v6, v7, :cond_9

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 93
    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid text branch height"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 95
    :cond_a
    new-instance p1, Ll/᩻᩹ᩳ;

    invoke-direct {p1, v5, v0}, Ll/᩻᩹ᩳ;-><init>(Ljava/lang/Object;[Ll/᩶᩹ᩳ;)V

    .line 97
    :goto_3
    invoke-virtual {v2, v1, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object p1

    .line 88
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid text branch size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 96
    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid text node type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid text node identity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 67
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Text graph is too deep"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Ll/ۨ᩹ᩳ;
    .locals 5

    .line 58
    iget-object v0, p0, Ll/ᩴ᩹ᩳ;->ܽ:Ll/۬ۜܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    const/16 v2, 0x8

    if-lt v1, v2, :cond_1

    const/high16 v2, 0x10000

    if-gt v1, v2, :cond_1

    and-int/lit8 v2, v1, 0x1

    if-nez v2, :cond_1

    const/4 v2, 0x4

    if-lt v0, v2, :cond_1

    const/16 v2, 0x100

    if-gt v0, v2, :cond_1

    and-int/lit8 v2, v0, 0x1

    if-nez v2, :cond_1

    .line 59
    iget v2, p0, Ll/ᩴ᩹ᩳ;->֫:I

    if-eqz v2, :cond_0

    if-ne v2, v1, :cond_1

    iget v2, p0, Ll/ᩴ᩹ᩳ;->ۧ:I

    if-ne v2, v0, :cond_1

    .line 62
    :cond_0
    iput v1, p0, Ll/ᩴ᩹ᩳ;->֫:I

    iput v0, p0, Ll/ᩴ᩹ᩳ;->ۧ:I

    .line 63
    new-instance v2, Ll/ۨ᩹ᩳ;

    const/4 v3, 0x0

    invoke-direct {p0, v3}, Ll/ᩴ᩹ᩳ;->֫(I)Ll/᩶᩹ᩳ;

    move-result-object v3

    const/4 v4, 0x0

    .line 19
    invoke-direct {v2, v3, v1, v0, v4}, Ll/ۨ᩹ᩳ;-><init>(Ll/᩶᩹ᩳ;IILl/᩸۬ᩳ;)V

    return-object v2

    .line 61
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid text graph configuration"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
