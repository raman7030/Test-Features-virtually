.class public final Ll/᩺ۧᩴ;
.super Ll/ۨ֫ᩴ;
.source "HAN"

# interfaces
.implements Ll/ۨۧᩴ;
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;
.implements Ll/ۡ۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 73
    sget-object v0, Ll/۟ۧᩴ;->֫:Ll/᩺ۧᩴ;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 57
    sget-object v0, Ll/۟ۧᩴ;->֫:Ll/᩺ۧᩴ;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 63
    instance-of v0, p1, Ljava/util/Set;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
