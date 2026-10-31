.class public final Ll/֡ܿܺ;
.super Ljava/lang/Object;
.source "RBF2"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:Ll/۫ܺܺ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;I)V
    .locals 0

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_0

    .line 201
    iput p2, p0, Ll/֡ܿܺ;->᩹:I

    .line 202
    iput-object p1, p0, Ll/֡ܿܺ;->᩸:Ll/۫ܺܺ;

    return-void

    .line 194
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "handler < 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 175
    check-cast p1, Ll/֡ܿܺ;

    invoke-virtual {p0, p1}, Ll/֡ܿܺ;->֫(Ll/֡ܿܺ;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 218
    instance-of v0, p1, Ll/֡ܿܺ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 219
    check-cast p1, Ll/֡ܿܺ;

    invoke-virtual {p0, p1}, Ll/֡ܿܺ;->֫(Ll/֡ܿܺ;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 210
    iget v0, p0, Ll/֡ܿܺ;->᩹:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/֡ܿܺ;->᩸:Ll/۫ܺܺ;

    invoke-virtual {v1}, Ll/۫ܺܺ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()I
    .locals 1

    .line 254
    iget v0, p0, Ll/֡ܿܺ;->᩹:I

    return v0
.end method

.method public final ֫(Ll/֡ܿܺ;)I
    .locals 2

    .line 230
    iget v0, p1, Ll/֡ܿܺ;->᩹:I

    iget v1, p0, Ll/֡ܿܺ;->᩹:I

    if-ge v1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-le v1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 236
    :cond_1
    iget-object v0, p0, Ll/֡ܿܺ;->᩸:Ll/۫ܺܺ;

    iget-object p1, p1, Ll/֡ܿܺ;->᩸:Ll/۫ܺܺ;

    invoke-virtual {v0, p1}, Ll/ܰۡܺ;->֫(Ll/ܰۡܺ;)I

    move-result p1

    return p1
.end method

.method public final ܽۧ()Ll/۫ܺܺ;
    .locals 1

    .line 245
    iget-object v0, p0, Ll/֡ܿܺ;->᩸:Ll/۫ܺܺ;

    return-object v0
.end method
