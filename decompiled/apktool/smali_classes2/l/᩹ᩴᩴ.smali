.class public Ll/᩹ᩴᩴ;
.super Ll/۬ۘᩴ;
.source "RC4X"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# direct methods
.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 98
    sget-object v0, Ll/᩶ᩴᩴ;->֫:Ll/᩹ᩴᩴ;

    return-object v0
.end method


# virtual methods
.method public final clear()V
    .locals 0

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    .line 78
    sget-object v0, Ll/᩶ᩴᩴ;->֫:Ll/᩹ᩴᩴ;

    return-object v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 88
    instance-of v0, p1, Ll/ۢ᩺ۘ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 89
    :cond_0
    check-cast p1, Ll/ۢ᩺ۘ;

    invoke-interface {p1}, Ll/ۢ᩺ۘ;->size()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "{}"

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
