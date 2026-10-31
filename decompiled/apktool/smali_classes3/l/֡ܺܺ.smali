.class public abstract Ll/֡ܺܺ;
.super Ll/֨ܺܺ;
.source "3B8Q"


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ll/֨ܺܺ;-><init>()V

    .line 35
    iput p1, p0, Ll/֡ܺܺ;->᩸:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-ne v0, v1, :cond_0

    check-cast p1, Ll/֡ܺܺ;

    iget p1, p1, Ll/֡ܺܺ;->᩸:I

    iget v0, p0, Ll/֡ܺܺ;->᩸:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 53
    iget v0, p0, Ll/֡ܺܺ;->᩸:I

    return v0
.end method

.method public final ֡()J
    .locals 2

    .line 101
    iget v0, p0, Ll/֡ܺܺ;->᩸:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ۧ(Ll/ܰۡܺ;)I
    .locals 1

    .line 61
    check-cast p1, Ll/֡ܺܺ;

    iget p1, p1, Ll/֡ܺܺ;->᩸:I

    .line 63
    iget v0, p0, Ll/֡ܺܺ;->᩸:I

    if-ge v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-le v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩴ()I
    .locals 1

    .line 93
    iget v0, p0, Ll/֡ܺܺ;->᩸:I

    return v0
.end method
