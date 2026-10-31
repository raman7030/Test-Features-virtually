.class public Ll/ܽܿۚ;
.super Ljava/lang/Object;
.source "I5AF"

# interfaces
.implements Ll/ܿܿۚ;
.implements Ll/۬ܽۚ;


# instance fields
.field public final ᩸:C


# direct methods
.method public constructor <init>(C)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-char p1, p0, Ll/ܽܿۚ;->᩸:C

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 44
    check-cast p1, Ll/ۤܽۚ;

    const/4 v0, 0x3

    .line 60
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 62
    :cond_0
    check-cast p1, Ll/۬ܽۚ;

    invoke-interface {p1}, Ll/۬ܽۚ;->getValue()C

    move-result p1

    .line 123
    iget-char v0, p0, Ll/ܽܿۚ;->᩸:C

    invoke-static {v0, p1}, Ljava/lang/Character;->compare(CC)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 52
    instance-of v0, p1, Ll/۬ܽۚ;

    if-eqz v0, :cond_0

    .line 53
    check-cast p1, Ll/۬ܽۚ;

    invoke-interface {p1}, Ll/۬ܽۚ;->getValue()C

    move-result p1

    iget-char v0, p0, Ll/ܽܿۚ;->᩸:C

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getValue()C
    .locals 1

    .line 53
    iget-char v0, p0, Ll/ܽܿۚ;->᩸:C

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 53
    iget-char v0, p0, Ll/ܽܿۚ;->᩸:C

    return v0
.end method

.method public final ۖ()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method
