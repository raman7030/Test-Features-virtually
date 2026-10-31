.class public abstract Ll/᩷ۙܺ;
.super Ljava/lang/Object;
.source "952M"

# interfaces
.implements Ll/֫ۛܺ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 109
    :cond_0
    instance-of v0, p1, Ll/֫ۛܺ;

    if-eqz v0, :cond_1

    .line 110
    check-cast p1, Ll/֫ۛܺ;

    .line 111
    invoke-interface {p0}, Ll/֫ۛܺ;->֫()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ll/֫ۛܺ;->֫()Ljava/util/Set;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 118
    invoke-interface {p0}, Ll/֫ۛܺ;->֫()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 123
    invoke-interface {p0}, Ll/֫ۛܺ;->֫()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
