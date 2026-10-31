.class public abstract Ll/ۜ֨ۘ;
.super Ljava/lang/Object;
.source "J89P"

# interfaces
.implements Ll/ᩴۚۘ;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public ܽ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 86
    iput-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ll/ܺۚۘ;)I
    .locals 4

    .line 213
    invoke-virtual {p1}, Ll/ܺۚۘ;->ܿ()J

    move-result-wide v0

    const-wide/32 v2, 0x7fffffff

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    long-to-int p0, v0

    return p0

    .line 216
    :cond_0
    new-instance p1, Ll/ۡۚۘ;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const v1, 0x7fffffff

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 p0, 0x1

    aput-object v0, v2, p0

    const/4 p0, 0x2

    aput-object v1, v2, p0

    const-string p0, "%s %d > %d"

    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 62
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 216
    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 195
    :cond_0
    instance-of v0, p1, Ll/ۜ֨ۘ;

    if-nez v0, :cond_1

    goto :goto_1

    .line 198
    :cond_1
    check-cast p1, Ll/ۜ֨ۘ;

    .line 97
    iget-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    .line 200
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 97
    iget-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    .line 188
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 97
    iget-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "null"

    return-object v0

    :cond_0
    const-string v1, "\""

    .line 0
    invoke-static {v1, v0, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 107
    iput-object p1, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    return-void

    .line 105
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected non-null value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۖۚۘ;)V
    .locals 1

    .line 133
    iget-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 135
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ܽ(I)V

    return-void
.end method

.method public final ֫(Ll/ܺۚۘ;)V
    .locals 6

    .line 160
    sget-object v0, Ll/ۘۚۘ;->۬:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    .line 161
    iget v0, p0, Ll/ۜ֨ۘ;->ۧ:I

    const/4 v1, 0x2

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(I)V

    .line 166
    iget v0, p0, Ll/ۜ֨ۘ;->֫:I

    const/4 v2, 0x0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 173
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_1
    if-ge v2, v0, :cond_1

    .line 177
    invoke-virtual {p1}, Ll/ܺۚۘ;->ۧ()C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 179
    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 183
    invoke-virtual {p1, v1}, Ll/ܺۚۘ;->֫(I)V

    :cond_2
    return-void
.end method

.method public final ۧ(Ll/ۖۚۘ;)V
    .locals 1

    .line 120
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(Ll/ۘۚۘ;)V

    const/4 v0, 0x0

    .line 123
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    .line 97
    iget-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    .line 209
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 126
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    return-void
.end method

.method public final ۧ(Ll/ܺۚۘ;)V
    .locals 1

    .line 148
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    const-string v0, "Offset"

    .line 151
    invoke-static {v0, p1}, Ll/ۜ֨ۘ;->֫(Ljava/lang/String;Ll/ܺۚۘ;)I

    move-result v0

    iput v0, p0, Ll/ۜ֨ۘ;->ۧ:I

    const-string v0, "ActualCount"

    .line 154
    invoke-static {v0, p1}, Ll/ۜ֨ۘ;->֫(Ljava/lang/String;Ll/ܺۚۘ;)I

    move-result p1

    iput p1, p0, Ll/ۜ֨ۘ;->֫:I

    return-void
.end method

.method public final ܽ(Ll/ۖۚۘ;)V
    .locals 1

    .line 113
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫(Ll/ۘۚۘ;)V

    .line 97
    iget-object v0, p0, Ll/ۜ֨ۘ;->ܽ:Ljava/lang/String;

    .line 209
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 114
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->ۧ(I)V

    return-void
.end method

.method public final ܽ(Ll/ܺۚۘ;)V
    .locals 1

    .line 141
    sget-object v0, Ll/ۘۚۘ;->ۙ:Ll/ۘۚۘ;

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(Ll/ۘۚۘ;)V

    const/4 v0, 0x4

    .line 142
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(I)V

    return-void
.end method
