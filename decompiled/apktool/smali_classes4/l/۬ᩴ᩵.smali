.class public abstract Ll/۬ᩴ᩵;
.super Ll/ۗᩴ᩵;
.source "79UX"

# interfaces
.implements Ll/۟ܺ᩵;
.implements Ll/ۧۖ᩵;


# instance fields
.field public ᩷֫:Ll/۫ᩴ᩵;


# direct methods
.method public constructor <init>(Ll/֨ۡ᩵;I)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Ll/ۗᩴ᩵;-><init>(Ll/֨ۡ᩵;I)V

    return-void
.end method


# virtual methods
.method public final getNext()Ll/۟ܺ᩵;
    .locals 1

    .line 64
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->getNext()Ll/ۗᩴ᩵;

    move-result-object v0

    check-cast v0, Ll/۬ᩴ᩵;

    return-object v0
.end method

.method public final ֨()Ll/۟ܺ᩵;
    .locals 2

    .line 64
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->getNext()Ll/ۗᩴ᩵;

    move-result-object v0

    check-cast v0, Ll/۬ᩴ᩵;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 132
    invoke-virtual {p0, v1}, Ll/ۗᩴ᩵;->֫(Ll/۫ᩴ᩵;)V

    .line 122
    invoke-virtual {v0}, Ll/ۗᩴ᩵;->֫֫()V

    :cond_0
    return-object v0
.end method

.method public final ֫(I[B)I
    .locals 3

    .line 215
    invoke-super {p0, p1, p2}, Ll/ۗᩴ᩵;->֫(I[B)I

    move-result p1

    .line 216
    invoke-interface {p0}, Ll/۟ܺ᩵;->size()I

    move-result p2

    .line 217
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->᩻֫()I

    move-result v0

    if-ne p2, v0, :cond_0

    return p1

    .line 219
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 p2, 0x1

    aput-object v0, v1, p2

    const-string p2, "Wrong size calculation have %d expect %d"

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֫ۖ᩵;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 251
    instance-of v0, p1, Ll/ۗᩴ᩵;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 252
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Incompatible response"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 254
    :cond_1
    :goto_0
    check-cast p1, Ll/۫ᩴ᩵;

    iput-object p1, p0, Ll/۬ᩴ᩵;->᩷֫:Ll/۫ᩴ᩵;

    return-void
.end method

.method public final ۧ()Ll/֫ۖ᩵;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/۬ᩴ᩵;->᩷֫:Ll/۫ᩴ᩵;

    return-object v0
.end method

.method public final bridge synthetic ۧ(Ll/ᩴۡ᩵;)Ll/֫ۖ᩵;
    .locals 0

    .line 32
    invoke-virtual {p0, p1}, Ll/۬ᩴ᩵;->ۧ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ll/۫ᩴ᩵;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/۬ᩴ᩵;->᩷֫:Ll/۫ᩴ᩵;

    return-object v0
.end method

.method public final ۧ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
    .locals 2

    .line 182
    invoke-virtual {p0, p1}, Ll/۬ᩴ᩵;->ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;

    move-result-object v0

    .line 186
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->getDigest()Ll/ۛᩴ᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۗᩴ᩵;->֫(Ll/ܿۖ᩵;)V

    .line 187
    invoke-virtual {p0, v0}, Ll/۬ᩴ᩵;->֫(Ll/֫ۖ᩵;)V

    .line 64
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->getNext()Ll/ۗᩴ᩵;

    move-result-object v1

    check-cast v1, Ll/۬ᩴ᩵;

    if-eqz v1, :cond_0

    .line 191
    invoke-virtual {v1, p1}, Ll/۬ᩴ᩵;->ۧ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۗᩴ᩵;->֫(Ll/۫ᩴ᩵;)V

    :cond_0
    return-object v0
.end method

.method public final ۧ()Ll/ܰ֨᩵;
    .locals 1

    .line 232
    iget-object v0, p0, Ll/۬ᩴ᩵;->᩷֫:Ll/۫ᩴ᩵;

    return-object v0
.end method

.method public final ۬()Z
    .locals 5

    .line 86
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ۧ֫()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract ܽ(Ll/ᩴۡ᩵;)Ll/۫ᩴ᩵;
.end method

.method public final ܽ(Ll/۟ܺ᩵;)Z
    .locals 2

    .line 97
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0, v1}, Ll/ܰۡ᩵;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۗᩴ᩵;->ܽ֫()Ll/֨ۡ᩵;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0, p1}, Ll/ܰۡ᩵;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ܿ()Ll/۟ܺ᩵;
    .locals 1

    .line 64
    invoke-virtual {p0}, Ll/ۗᩴ᩵;->getNext()Ll/ۗᩴ᩵;

    move-result-object v0

    check-cast v0, Ll/۬ᩴ᩵;

    return-object v0
.end method
