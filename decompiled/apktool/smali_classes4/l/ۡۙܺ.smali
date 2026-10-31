.class public final Ll/ۡۙܺ;
.super Ll/۠᩶ܺ;
.source "I31W"


# static fields
.field public static final serialVersionUID:J


# instance fields
.field public transient ۬:I


# direct methods
.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 6

    .line 170
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    const/4 v0, 0x3

    .line 171
    iput v0, p0, Ll/ۡۙܺ;->۬:I

    .line 50
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    .line 173
    invoke-static {}, Ll/ܽۗܺ;->᩻()Ll/ܽۗܺ;

    move-result-object v1

    .line 174
    invoke-virtual {p0, v1}, Ll/ܽۙܺ;->֫(Ljava/util/Map;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 179
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    .line 39
    invoke-virtual {p0, v2}, Ll/۠᩶ܺ;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 181
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_0

    .line 184
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v5

    .line 185
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 0

    .line 163
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 164
    invoke-static {p0, p1}, Ll/ۘۛܺ;->֫(Ll/֡ۤܺ;Ljava/io/ObjectOutputStream;)V

    return-void
.end method

.method public static ۢ()Ll/ۡۙܺ;
    .locals 3

    .line 79
    new-instance v0, Ll/ۡۙܺ;

    const/16 v1, 0xc

    .line 36
    invoke-static {v1}, Ll/ܽۗܺ;->ܿ(I)Ll/ܽۗܺ;

    move-result-object v1

    .line 48
    invoke-direct {v0, v1}, Ll/ܽۙܺ;-><init>(Ljava/util/Map;)V

    const-string v1, "expectedValuesPerKey"

    const/4 v2, 0x3

    .line 120
    invoke-static {v2, v1}, Ll/᩹ۙܺ;->֫(ILjava/lang/String;)V

    .line 121
    iput v2, v0, Ll/ۡۙܺ;->۬:I

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic values()Ljava/util/Collection;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Ljava/lang/Iterable;Ljava/lang/Object;)Z
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    .line 83
    check-cast p1, Ljava/util/Collection;

    .line 84
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 39
    invoke-virtual {p0, p2}, Ll/۠᩶ܺ;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 84
    invoke-interface {p2, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 86
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    invoke-virtual {p0, p2}, Ll/۠᩶ܺ;->get(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 87
    invoke-static {p2, p1}, Ll/ۙ۫ܺ;->֫(Ljava/util/Collection;Ljava/util/Iterator;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩻()Ljava/util/Collection;
    .locals 2

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Ll/ۡۙܺ;->۬:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    return-object v0
.end method
