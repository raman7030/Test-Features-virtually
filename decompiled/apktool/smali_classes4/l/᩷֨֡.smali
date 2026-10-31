.class public final Ll/᩷֨֡;
.super Ljava/lang/Object;
.source "O3Z6"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Ll/᩷֨֡;->᩹:I

    .line 16
    iput p2, p0, Ll/᩷֨֡;->᩸:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 9
    check-cast p1, Ll/᩷֨֡;

    invoke-virtual {p0, p1}, Ll/᩷֨֡;->֫(Ll/᩷֨֡;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 24
    :cond_0
    instance-of v1, p1, Ll/᩷֨֡;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 27
    :cond_1
    check-cast p1, Ll/᩷֨֡;

    .line 28
    iget v1, p0, Ll/᩷֨֡;->᩹:I

    iget v3, p1, Ll/᩷֨֡;->᩹:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/᩷֨֡;->᩸:I

    iget p1, p1, Ll/᩷֨֡;->᩸:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 4

    .line 33
    iget v0, p0, Ll/᩷֨֡;->᩹:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/᩷֨֡;->᩸:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩷֨֡;)I
    .locals 2

    .line 38
    iget v0, p0, Ll/᩷֨֡;->᩹:I

    iget v1, p1, Ll/᩷֨֡;->᩹:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 42
    :cond_0
    iget v0, p0, Ll/᩷֨֡;->᩸:I

    iget p1, p1, Ll/᩷֨֡;->᩸:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method
