.class public abstract Ll/ܳ۬֡;
.super Ljava/lang/Object;
.source "M59C"

# interfaces
.implements Ll/ۢ֫ۚ;


# static fields
.field public static final ᩸:Ljava/util/Comparator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Ll/ܿ۬֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܳ۬֡;->᩸:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 40
    check-cast p1, Ll/ۢ֫ۚ;

    .line 66
    invoke-interface {p0}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 68
    :cond_0
    invoke-interface {p0}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    invoke-interface {p1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 56
    instance-of v1, p1, Ll/ۢ֫ۚ;

    if-eqz v1, :cond_0

    .line 57
    check-cast p1, Ll/ۢ֫ۚ;

    .line 58
    invoke-interface {p0}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 59
    invoke-interface {p0}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v1

    invoke-interface {p1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 50
    invoke-interface {p0}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 51
    invoke-interface {p0}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
