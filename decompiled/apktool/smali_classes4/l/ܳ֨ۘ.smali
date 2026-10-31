.class public abstract Ll/ܳ֨ۘ;
.super Ljava/lang/Object;
.source "Q8AH"

# interfaces
.implements Ll/ᩴۚۘ;


# instance fields
.field public ֫:[Ll/ᩳ֨ۘ;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 93
    :cond_0
    instance-of v0, p1, Ll/ܳ֨ۘ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 96
    :cond_1
    iget-object v0, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    check-cast p1, Ll/ܳ֨ۘ;

    iget-object p1, p1, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public abstract ֫()Ll/ܽ֨ۘ;
.end method

.method public final ֫(Ll/ܺۚۘ;)V
    .locals 5

    .line 67
    iget-object v0, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    if-eqz v0, :cond_2

    .line 69
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    const/4 v0, 0x4

    .line 70
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 71
    :goto_0
    iget-object v2, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    .line 72
    invoke-virtual {p0}, Ll/ܳ֨ۘ;->֫()Ll/ܽ֨ۘ;

    move-result-object v3

    aput-object v3, v2, v1

    .line 73
    iget-object v2, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 75
    :cond_0
    array-length v1, v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v2, v3

    .line 76
    invoke-virtual {v4, p1}, Ll/ᩳ֨ۘ;->ۧ(Ll/ܺۚۘ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 78
    :cond_1
    iget-object v1, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    array-length v2, v1

    :goto_2
    if-ge v0, v2, :cond_2

    aget-object v3, v1, v0

    .line 79
    invoke-virtual {v3, p1}, Ll/ᩳ֨ۘ;->֫(Ll/ܺۚۘ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public abstract ֫(I)[Ll/ᩳ֨ۘ;
.end method

.method public final ۧ(Ll/ܺۚۘ;)V
    .locals 7

    .line 52
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    .line 100
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܿ()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    const/4 v4, 0x0

    const/4 v5, 0x1

    cmp-long v6, v0, v2

    if-gtz v6, :cond_2

    long-to-int v1, v0

    .line 57
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܽ()I

    move-result p1

    if-eqz p1, :cond_1

    if-ltz v1, :cond_0

    .line 59
    invoke-virtual {p0, v1}, Ll/ܳ֨ۘ;->֫(I)[Ll/ᩳ֨ۘ;

    move-result-object p1

    iput-object p1, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    return-void

    .line 56
    :cond_0
    new-instance p1, Ll/ۡۚۘ;

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v5, [Ljava/lang/Object;

    aput-object v0, v1, v4

    const-string v0, "Expected entriesRead >= 0, got: %d"

    .line 56
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    :cond_1
    const/4 p1, 0x0

    .line 61
    iput-object p1, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    return-void

    .line 103
    :cond_2
    new-instance p1, Ll/ۡۚۘ;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const v1, 0x7fffffff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "EntriesRead"

    aput-object v3, v2, v4

    aput-object v0, v2, v5

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const-string v0, "%s %d > %d"

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 103
    throw p1
.end method

.method public final ۧ()[Ll/ᩳ֨ۘ;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ܳ֨ۘ;->֫:[Ll/ᩳ֨ۘ;

    return-object v0
.end method

.method public final ܽ(Ll/ܺۚۘ;)V
    .locals 0

    return-void
.end method
