.class public abstract Ll/֡ᩳۧ;
.super Ljava/lang/Object;
.source "S8QT"

# interfaces
.implements Ll/ۢܿۧ;


# instance fields
.field public final ֫:[J

.field public final ۧ:[Ll/۠ᩴ֫;

.field public final ܳ:[I

.field public final ܽ:Ll/۬᩵֫;

.field public final ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/۬᩵֫;[I)V
    .locals 4

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    iput-object p1, p0, Ll/֡ᩳۧ;->ܽ:Ll/۬᩵֫;

    .line 80
    array-length v0, p2

    iput v0, p0, Ll/֡ᩳۧ;->ܿ:I

    .line 82
    new-array v0, v0, [Ll/۠ᩴ֫;

    iput-object v0, p0, Ll/֡ᩳۧ;->ۧ:[Ll/۠ᩴ֫;

    const/4 v0, 0x0

    .line 83
    :goto_1
    array-length v2, p2

    if-ge v0, v2, :cond_1

    .line 84
    iget-object v2, p0, Ll/֡ᩳۧ;->ۧ:[Ll/۠ᩴ֫;

    aget v3, p2, v0

    invoke-virtual {p1, v3}, Ll/۬᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 87
    :cond_1
    iget-object p2, p0, Ll/֡ᩳۧ;->ۧ:[Ll/۠ᩴ֫;

    new-instance v0, Ll/᩵ᩳۧ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 89
    iget p2, p0, Ll/֡ᩳۧ;->ܿ:I

    new-array p2, p2, [I

    iput-object p2, p0, Ll/֡ᩳۧ;->ܳ:[I

    .line 90
    :goto_2
    iget p2, p0, Ll/֡ᩳۧ;->ܿ:I

    if-ge v1, p2, :cond_2

    .line 91
    iget-object p2, p0, Ll/֡ᩳۧ;->ܳ:[I

    iget-object v0, p0, Ll/֡ᩳۧ;->ۧ:[Ll/۠ᩴ֫;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ll/۬᩵֫;->֫(Ll/۠ᩴ֫;)I

    move-result v0

    aput v0, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 93
    :cond_2
    new-array p1, p2, [J

    iput-object p1, p0, Ll/֡ᩳۧ;->֫:[J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 225
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 228
    :cond_1
    check-cast p1, Ll/֡ᩳۧ;

    .line 229
    iget-object v2, p0, Ll/֡ᩳۧ;->ܽ:Ll/۬᩵֫;

    iget-object v3, p1, Ll/֡ᩳۧ;->ܽ:Ll/۬᩵֫;

    invoke-virtual {v2, v3}, Ll/۬᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֡ᩳۧ;->ܳ:[I

    iget-object p1, p1, Ll/֡ᩳۧ;->ܳ:[I

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 214
    iget v0, p0, Ll/֡ᩳۧ;->ᩳ:I

    if-nez v0, :cond_0

    .line 215
    iget-object v0, p0, Ll/֡ᩳۧ;->ܽ:Ll/۬᩵֫;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/֡ᩳۧ;->ܳ:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ll/֡ᩳۧ;->ᩳ:I

    .line 217
    :cond_0
    iget v0, p0, Ll/֡ᩳۧ;->ᩳ:I

    return v0
.end method

.method public final indexOf(I)I
    .locals 2

    const/4 v0, 0x0

    .line 137
    :goto_0
    iget v1, p0, Ll/֡ᩳۧ;->ܿ:I

    if-ge v0, v1, :cond_1

    .line 138
    iget-object v1, p0, Ll/֡ᩳۧ;->ܳ:[I

    aget v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final length()I
    .locals 1

    .line 111
    iget-object v0, p0, Ll/֡ᩳۧ;->ܳ:[I

    array-length v0, v0

    return v0
.end method

.method public ֫(JLjava/util/List;)I
    .locals 0

    .line 174
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/۠ᩴ֫;)I
    .locals 2

    const/4 v0, 0x0

    .line 127
    :goto_0
    iget v1, p0, Ll/֡ᩳۧ;->ܿ:I

    if-ge v0, v1, :cond_1

    .line 128
    iget-object v1, p0, Ll/֡ᩳۧ;->ۧ:[Ll/۠ᩴ֫;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(I)Ll/۠ᩴ֫;
    .locals 1

    .line 116
    iget-object v0, p0, Ll/֡ᩳۧ;->ۧ:[Ll/۠ᩴ֫;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public ֫(F)V
    .locals 0

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    return-void
.end method

.method public final ֫(IJ)Z
    .locals 3

    .line 196
    iget-object v0, p0, Ll/֡ᩳۧ;->֫:[J

    aget-wide v1, v0, p1

    cmp-long p1, v1, p2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic ֫(JLl/۟ܽۧ;Ljava/util/List;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()Ll/۠ᩴ֫;
    .locals 2

    .line 149
    iget-object v0, p0, Ll/֡ᩳۧ;->ۧ:[Ll/۠ᩴ֫;

    invoke-interface {p0}, Ll/ۢܿۧ;->֫()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final synthetic ۢ()V
    .locals 0

    return-void
.end method

.method public final ۧ(I)I
    .locals 1

    .line 121
    iget-object v0, p0, Ll/֡ᩳۧ;->ܳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۧ(IJ)Z
    .locals 9

    .line 179
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 180
    invoke-virtual {p0, p1, v0, v1}, Ll/֡ᩳۧ;->֫(IJ)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 181
    :goto_0
    iget v5, p0, Ll/֡ᩳۧ;->ܿ:I

    const/4 v6, 0x1

    if-ge v4, v5, :cond_1

    if-nez v2, :cond_1

    if-eq v4, p1, :cond_0

    .line 182
    invoke-virtual {p0, v4, v0, v1}, Ll/֡ᩳۧ;->֫(IJ)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    return v3

    .line 187
    :cond_2
    iget-object v2, p0, Ll/֡ᩳۧ;->֫:[J

    aget-wide v3, v2, p1

    .line 190
    sget-object v5, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    add-long v7, v0, p2

    xor-long/2addr v0, v7

    xor-long/2addr p2, v7

    and-long/2addr p2, v0

    const-wide/16 v0, 0x0

    cmp-long v5, p2, v0

    if-gez v5, :cond_3

    const-wide v7, 0x7fffffffffffffffL

    .line 188
    :cond_3
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    aput-wide p2, v2, p1

    return v6
.end method

.method public ܳ()V
    .locals 0

    return-void
.end method

.method public final synthetic ܽ()V
    .locals 0

    return-void
.end method

.method public final ܿ()Ll/۬᩵֫;
    .locals 1

    .line 106
    iget-object v0, p0, Ll/֡ᩳۧ;->ܽ:Ll/۬᩵֫;

    return-object v0
.end method

.method public ᩳ()V
    .locals 0

    return-void
.end method

.method public final ᩻()I
    .locals 2

    .line 154
    iget-object v0, p0, Ll/֡ᩳۧ;->ܳ:[I

    invoke-interface {p0}, Ll/ۢܿۧ;->֫()I

    move-result v1

    aget v0, v0, v1

    return v0
.end method
