.class public abstract Ll/ᩳ۬֡;
.super Ljava/lang/Object;
.source "857M"

# interfaces
.implements Ll/᩷֫ۚ;


# static fields
.field public static final ᩸:Ljava/util/Comparator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ll/ܽ۬֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ᩳ۬֡;->᩸:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 41
    check-cast p1, Ll/᩷֫ۚ;

    .line 69
    invoke-interface {p0}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v0

    invoke-interface {p1}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 71
    :cond_0
    invoke-interface {p0}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    .line 73
    :cond_1
    invoke-interface {p0}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    invoke-static {v0, p1}, Ll/۠᩵ۚ;->֫(Ljava/util/Set;Ljava/util/Set;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 58
    instance-of v0, p1, Ll/᩷֫ۚ;

    if-eqz v0, :cond_0

    .line 59
    check-cast p1, Ll/᩷֫ۚ;

    .line 60
    invoke-interface {p0}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v0

    invoke-interface {p1}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 61
    invoke-interface {p0}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    invoke-interface {p0}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 51
    invoke-interface {p0}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 52
    invoke-interface {p0}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 53
    invoke-interface {p0}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
