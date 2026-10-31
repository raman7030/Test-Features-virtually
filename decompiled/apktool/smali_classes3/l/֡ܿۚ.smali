.class public Ll/֡ܿۚ;
.super Ljava/lang/Object;
.source "W51A"

# interfaces
.implements Ll/ܿܿۚ;
.implements Ll/ᩳᩳۚ;


# instance fields
.field public final ᩸:S


# direct methods
.method public constructor <init>(S)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-short p1, p0, Ll/֡ܿۚ;->᩸:S

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 44
    check-cast p1, Ll/ۤܽۚ;

    const/4 v0, 0x2

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
    check-cast p1, Ll/ᩳᩳۚ;

    invoke-interface {p1}, Ll/ᩳᩳۚ;->getValue()S

    move-result p1

    .line 127
    iget-short v0, p0, Ll/֡ܿۚ;->᩸:S

    invoke-static {v0, p1}, Ljava/lang/Short;->compare(SS)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 52
    instance-of v0, p1, Ll/ᩳᩳۚ;

    if-eqz v0, :cond_0

    .line 53
    check-cast p1, Ll/ᩳᩳۚ;

    invoke-interface {p1}, Ll/ᩳᩳۚ;->getValue()S

    move-result p1

    iget-short v0, p0, Ll/֡ܿۚ;->᩸:S

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final getValue()S
    .locals 1

    .line 53
    iget-short v0, p0, Ll/֡ܿۚ;->᩸:S

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 53
    iget-short v0, p0, Ll/֡ܿۚ;->᩸:S

    return v0
.end method

.method public final ۖ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
