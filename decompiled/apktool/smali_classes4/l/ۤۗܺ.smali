.class public abstract Ll/ۤۗܺ;
.super Ll/ۢ۬ܺ;
.source "M5U2"

# interfaces
.implements Ll/ۖۙܺ;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J = 0xdecafL


# direct methods
.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 619
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ᩻()Ll/۬ۗܺ;
    .locals 2

    .line 312
    new-instance v0, Ll/۬ۗܺ;

    const/4 v1, 0x4

    .line 453
    invoke-direct {v0, v1}, Ll/ۜ۬ܺ;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public final values()Ljava/util/Collection;
    .locals 1

    .line 567
    invoke-virtual {p0}, Ll/ۤۗܺ;->ᩳ()Ll/ۤۗܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->keySet()Ll/ۛ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ll/᩺ۗܺ;
    .locals 1

    .line 567
    invoke-virtual {p0}, Ll/ۤۗܺ;->ᩳ()Ll/ۤۗܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢ۬ܺ;->keySet()Ll/ۛ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 614
    new-instance v0, Ll/۫ۗܺ;

    .line 600
    invoke-direct {v0, p0}, Ll/᩷۬ܺ;-><init>(Ll/ۢ۬ܺ;)V

    return-object v0
.end method

.method public final ܽ()Ll/᩺ۗܺ;
    .locals 2

    .line 572
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public abstract ᩳ()Ll/ۤۗܺ;
.end method
