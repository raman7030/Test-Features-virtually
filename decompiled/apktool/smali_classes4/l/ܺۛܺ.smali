.class public final Ll/ܺۛܺ;
.super Ll/ۤۤܺ;
.source "J56M"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public final ᩸:Ll/ۤۤܺ;


# direct methods
.method public constructor <init>(Ll/ۤۤܺ;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ll/ۤۤܺ;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ܺۛܺ;->᩸:Ll/ۤۤܺ;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 40
    iget-object v0, p0, Ll/ܺۛܺ;->᩸:Ll/ۤۤܺ;

    invoke-interface {v0, p2, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 103
    :cond_0
    instance-of v0, p1, Ll/ܺۛܺ;

    if-eqz v0, :cond_1

    .line 104
    check-cast p1, Ll/ܺۛܺ;

    .line 105
    iget-object v0, p0, Ll/ܺۛܺ;->᩸:Ll/ۤۤܺ;

    iget-object p1, p1, Ll/ܺۛܺ;->᩸:Ll/ۤۤܺ;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ܺۛܺ;->᩸:Ll/ۤۤܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    neg-int v0, v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܺۛܺ;->᩸:Ll/ۤۤܺ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".reverse()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫()Ll/ۤۤܺ;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܺۛܺ;->᩸:Ll/ۤۤܺ;

    return-object v0
.end method
