.class public final Ll/ۧ᩻֡;
.super Ll/ܽۜ֡;
.source "XAQ1"


# instance fields
.field public final ܽ:[Ll/ܽۜ֡;

.field public final ᩳ:[I


# direct methods
.method public constructor <init>(Ll/۠ۜ֡;)V
    .locals 3

    .line 24
    iget-object v0, p1, Ll/۠ۜ֡;->ܽ:Ll/ܽۜ֡;

    const/4 v1, 0x1

    new-array v1, v1, [Ll/ܽۜ֡;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget p1, p1, Ll/۠ۜ֡;->ᩳ:I

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-direct {p0, v1, p1}, Ll/ۧ᩻֡;-><init>([Ll/ܽۜ֡;[I)V

    return-void
.end method

.method public constructor <init>([Ll/ܽۜ֡;[I)V
    .locals 5

    .line 120
    array-length v0, p1

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aget-object v4, p1, v3

    .line 121
    invoke-static {v1, v4}, Ll/֫᩸ۡ;->֫(ILjava/lang/Object;)I

    move-result v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 124
    :cond_0
    array-length v0, p2

    :goto_1
    if-ge v2, v0, :cond_1

    aget v3, p2, v2

    .line 125
    invoke-static {v1, v3}, Ll/֫᩸ۡ;->ۧ(II)I

    move-result v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 128
    :cond_1
    array-length v0, p1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ll/֫᩸ۡ;->֫(II)I

    move-result v0

    .line 28
    invoke-direct {p0, v0}, Ll/ܽۜ֡;-><init>(I)V

    .line 32
    iput-object p1, p0, Ll/ۧ᩻֡;->ܽ:[Ll/ܽۜ֡;

    .line 33
    iput-object p2, p0, Ll/ۧ᩻֡;->ᩳ:[I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 68
    :cond_0
    instance-of v1, p1, Ll/ۧ᩻֡;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 72
    :cond_1
    move-object v1, p1

    check-cast v1, Ll/ܽۜ֡;

    .line 97
    iget v1, v1, Ll/ܽۜ֡;->֫:I

    .line 72
    iget v3, p0, Ll/ܽۜ֡;->֫:I

    if-eq v3, v1, :cond_2

    return v2

    .line 76
    :cond_2
    check-cast p1, Ll/ۧ᩻֡;

    .line 77
    iget-object v1, p0, Ll/ۧ᩻֡;->ᩳ:[I

    iget-object v3, p1, Ll/ۧ᩻֡;->ᩳ:[I

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ۧ᩻֡;->ܽ:[Ll/ܽۜ֡;

    iget-object p1, p1, Ll/ۧ᩻֡;->ܽ:[Ll/ܽۜ֡;

    .line 78
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 83
    invoke-virtual {p0}, Ll/ۧ᩻֡;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "[]"

    return-object v0

    .line 84
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 86
    :goto_0
    iget-object v2, p0, Ll/ۧ᩻֡;->ᩳ:[I

    array-length v3, v2

    if-ge v1, v3, :cond_4

    if-lez v1, :cond_1

    const-string v3, ", "

    .line 87
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    :cond_1
    aget v2, v2, v1

    const v3, 0x7fffffff

    if-ne v2, v3, :cond_2

    const-string v2, "$"

    .line 89
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 92
    :cond_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    iget-object v2, p0, Ll/ۧ᩻֡;->ܽ:[Ll/ܽۜ֡;

    aget-object v3, v2, v1

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    .line 94
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v2, "null"

    .line 98
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const-string v1, "]"

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/ܽۜ֡;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۧ᩻֡;->ܽ:[Ll/ܽۜ֡;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ۧ(I)I
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۧ᩻֡;->ᩳ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۧ()Z
    .locals 3

    .line 40
    iget-object v0, p0, Ll/ۧ᩻֡;->ᩳ:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const v2, 0x7fffffff

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final ܽ()I
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۧ᩻֡;->ᩳ:[I

    array-length v0, v0

    return v0
.end method
