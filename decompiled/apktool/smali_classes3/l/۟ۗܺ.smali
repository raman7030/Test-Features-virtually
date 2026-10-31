.class public final Ll/۟ۗܺ;
.super Ll/ۛ۬ܺ;
.source "A5TB"


# instance fields
.field public transient ۗ:I

.field public final transient ۙ:Ljava/util/EnumSet;


# direct methods
.method public constructor <init>(Ljava/util/EnumSet;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ll/ۛ۬ܺ;-><init>()V

    .line 62
    iput-object p1, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/EnumSet;I)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Ll/۟ۗܺ;-><init>(Ljava/util/EnumSet;)V

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 135
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/util/EnumSet;)Ll/ۛ۬ܺ;
    .locals 2

    .line 41
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 47
    new-instance v0, Ll/۟ۗܺ;

    invoke-direct {v0, p0}, Ll/۟ۗܺ;-><init>(Ljava/util/EnumSet;)V

    return-object v0

    .line 45
    :cond_0
    invoke-static {p0}, Ll/ۡ۫ܺ;->֫(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Enum;

    .line 88
    new-instance v0, Ll/᩸ۛܺ;

    invoke-direct {v0, p0}, Ll/᩸ۛܺ;-><init>(Ljava/lang/Object;)V

    return-object v0

    .line 79
    :cond_1
    sget-object p0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-object p0
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 82
    iget-object v0, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 87
    instance-of v0, p1, Ll/۟ۗܺ;

    if-eqz v0, :cond_0

    .line 88
    check-cast p1, Ll/۟ۗܺ;

    iget-object p1, p1, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    .line 90
    :cond_0
    iget-object v0, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

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
    instance-of v0, p1, Ll/۟ۗܺ;

    if-eqz v0, :cond_1

    .line 104
    check-cast p1, Ll/۟ۗܺ;

    iget-object p1, p1, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    .line 106
    :cond_1
    iget-object v0, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 118
    iget v0, p0, Ll/۟ۗܺ;->ۗ:I

    if-nez v0, :cond_0

    .line 119
    iget-object v0, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Ll/۟ۗܺ;->ۗ:I

    :cond_0
    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 95
    iget-object v0, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 37
    invoke-virtual {p0}, Ll/۟ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 2

    .line 72
    iget-object v0, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 902
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    instance-of v1, v0, Ll/᩶ۨܺ;

    if-eqz v1, :cond_0

    .line 134
    check-cast v0, Ll/᩶ۨܺ;

    return-object v0

    .line 137
    :cond_0
    new-instance v1, Ll/ܺ۫ܺ;

    invoke-direct {v1, v0}, Ll/ܺ۫ܺ;-><init>(Ljava/util/Iterator;)V

    return-object v1
.end method

.method public final size()I
    .locals 1

    .line 77
    iget-object v0, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 2

    .line 130
    new-instance v0, Ll/ܰۗܺ;

    iget-object v1, p0, Ll/۟ۗܺ;->ۙ:Ljava/util/EnumSet;

    invoke-direct {v0, v1}, Ll/ܰۗܺ;-><init>(Ljava/util/EnumSet;)V

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
