.class public final Ll/ܿᩴ֫;
.super Ljava/lang/Object;
.source "W8IC"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_2

    .line 73
    const-class v0, Ll/ܿᩴ֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_1

    .line 76
    :cond_1
    check-cast p1, Ll/ܿᩴ֫;

    const/4 p1, 0x0

    .line 78
    invoke-static {p1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    .line 85
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    add-int/lit16 v0, v0, 0x3fd1

    return v0
.end method
