.class public Ll/ۧܿۚ;
.super Ljava/lang/Object;
.source "X5N8"

# interfaces
.implements Ll/ܿܿۚ;
.implements Ll/ۗܽۚ;


# instance fields
.field public final ᩸:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-byte p1, p0, Ll/ۧܿۚ;->᩸:B

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 43
    check-cast p1, Ll/ۤܽۚ;

    const/4 v0, 0x0

    .line 59
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 61
    :cond_0
    check-cast p1, Ll/ۗܽۚ;

    invoke-interface {p1}, Ll/ۗܽۚ;->getValue()B

    move-result p1

    .line 133
    iget-byte v0, p0, Ll/ۧܿۚ;->᩸:B

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 51
    instance-of v0, p1, Ll/ۗܽۚ;

    if-eqz v0, :cond_0

    .line 52
    check-cast p1, Ll/ۗܽۚ;

    invoke-interface {p1}, Ll/ۗܽۚ;->getValue()B

    move-result p1

    iget-byte v0, p0, Ll/ۧܿۚ;->᩸:B

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getValue()B
    .locals 1

    .line 53
    iget-byte v0, p0, Ll/ۧܿۚ;->᩸:B

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 53
    iget-byte v0, p0, Ll/ۧܿۚ;->᩸:B

    return v0
.end method

.method public final ۖ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
