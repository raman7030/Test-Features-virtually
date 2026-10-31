.class public final Ll/ۚܽۧ;
.super Ljava/lang/Object;
.source "G8TA"

# interfaces
.implements Ll/֨ܽۧ;


# instance fields
.field public final ֫:[I

.field public final ۧ:Ljava/util/Random;

.field public final ܽ:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-direct {p0, v0}, Ll/ۚܽۧ;-><init>(Ljava/util/Random;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Random;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    .line 73
    invoke-direct {p0, v0, p1}, Ll/ۚܽۧ;-><init>([ILjava/util/Random;)V

    return-void
.end method

.method public constructor <init>([ILjava/util/Random;)V
    .locals 2

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Ll/ۚܽۧ;->ܽ:[I

    .line 78
    iput-object p2, p0, Ll/ۚܽۧ;->ۧ:Ljava/util/Random;

    .line 79
    array-length p2, p1

    new-array p2, p2, [I

    iput-object p2, p0, Ll/ۚܽۧ;->֫:[I

    const/4 p2, 0x0

    .line 80
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_0

    .line 81
    iget-object v0, p0, Ll/ۚܽۧ;->֫:[I

    aget v1, p1, p2

    aput p2, v0, v1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final getLength()I
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۚܽۧ;->ܽ:[I

    array-length v0, v0

    return v0
.end method

.method public final ֫()I
    .locals 2

    .line 104
    iget-object v0, p0, Ll/ۚܽۧ;->ܽ:[I

    array-length v1, v0

    if-lez v1, :cond_0

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final ֫(I)Ll/ۚܽۧ;
    .locals 6

    .line 143
    iget-object v0, p0, Ll/ۚܽۧ;->ܽ:[I

    array-length v1, v0

    sub-int/2addr v1, p1

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 145
    :goto_0
    array-length v4, v0

    if-ge v2, v4, :cond_2

    .line 146
    aget v4, v0, v2

    if-ltz v4, :cond_0

    if-ge v4, p1, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    sub-int v5, v2, v3

    if-ltz v4, :cond_1

    sub-int/2addr v4, p1

    .line 150
    :cond_1
    aput v4, v1, v5

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 153
    :cond_2
    new-instance p1, Ll/ۚܽۧ;

    new-instance v0, Ljava/util/Random;

    iget-object v2, p0, Ll/ۚܽۧ;->ۧ:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Random;-><init>(J)V

    invoke-direct {p1, v1, v0}, Ll/ۚܽۧ;-><init>([ILjava/util/Random;)V

    return-object p1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۚܽۧ;->֫:[I

    aget p1, v0, p1

    const/4 v0, -0x1

    add-int/2addr p1, v0

    if-ltz p1, :cond_0

    .line 99
    iget-object v0, p0, Ll/ۚܽۧ;->ܽ:[I

    aget p1, v0, p1

    return p1

    :cond_0
    return v0
.end method

.method public final ۧ()Ll/ۚܽۧ;
    .locals 4

    .line 158
    new-instance v0, Ll/ۚܽۧ;

    new-instance v1, Ljava/util/Random;

    iget-object v2, p0, Ll/ۚܽۧ;->ۧ:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Random;-><init>(J)V

    invoke-direct {v0, v1}, Ll/ۚܽۧ;-><init>(Ljava/util/Random;)V

    return-object v0
.end method

.method public final ܽ()I
    .locals 2

    .line 109
    iget-object v0, p0, Ll/ۚܽۧ;->ܽ:[I

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public final ܽ(I)I
    .locals 2

    .line 92
    iget-object v0, p0, Ll/ۚܽۧ;->֫:[I

    aget p1, v0, p1

    add-int/lit8 p1, p1, 0x1

    .line 93
    iget-object v0, p0, Ll/ۚܽۧ;->ܽ:[I

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget p1, v0, p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ᩳ(I)Ll/ۚܽۧ;
    .locals 9

    .line 114
    new-array v0, p1, [I

    .line 115
    new-array v1, p1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 116
    :goto_0
    iget-object v4, p0, Ll/ۚܽۧ;->ܽ:[I

    iget-object v5, p0, Ll/ۚܽۧ;->ۧ:Ljava/util/Random;

    if-ge v3, p1, :cond_0

    .line 117
    array-length v4, v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v5, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    aput v4, v0, v3

    add-int/lit8 v4, v3, 0x1

    .line 118
    invoke-virtual {v5, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    .line 119
    aget v6, v1, v5

    aput v6, v1, v3

    .line 120
    aput v3, v1, v5

    move v3, v4

    goto :goto_0

    .line 122
    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 123
    array-length v3, v4

    add-int/2addr v3, p1

    new-array v3, v3, [I

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 126
    :goto_1
    array-length v8, v4

    add-int/2addr v8, p1

    if-ge v2, v8, :cond_3

    if-ge v6, p1, :cond_1

    .line 127
    aget v8, v0, v6

    if-ne v7, v8, :cond_1

    add-int/lit8 v8, v6, 0x1

    .line 129
    aget v6, v1, v6

    aput v6, v3, v2

    move v6, v8

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v7, 0x1

    .line 131
    aget v7, v4, v7

    aput v7, v3, v2

    if-ltz v7, :cond_2

    add-int/2addr v7, p1

    .line 133
    aput v7, v3, v2

    :cond_2
    move v7, v8

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 137
    :cond_3
    new-instance p1, Ll/ۚܽۧ;

    new-instance v0, Ljava/util/Random;

    invoke-virtual {v5}, Ljava/util/Random;->nextLong()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    invoke-direct {p1, v3, v0}, Ll/ۚܽۧ;-><init>([ILjava/util/Random;)V

    return-object p1
.end method
