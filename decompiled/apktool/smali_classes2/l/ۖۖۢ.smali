.class public final Ll/ۖۖۢ;
.super Ljava/lang/Object;
.source "H76E"


# static fields
.field public static final ֫:[Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "data"

    const-string v1, "unknown"

    const-string v2, "call"

    const-string v3, "jump"

    .line 22
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۖۖۢ;->֫:[Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/Iterable;)I
    .locals 3

    if-eqz p0, :cond_3

    .line 54
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 55
    invoke-static {v1}, Ll/ۖۖۢ;->֫(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_1

    and-int v2, v0, v1

    if-nez v2, :cond_0

    or-int/2addr v0, v1

    goto :goto_0

    .line 60
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Duplicate referenceKind"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 57
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid referenceKind"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 64
    :cond_2
    invoke-static {v0}, Ll/ۖۖۢ;->ۧ(I)V

    return v0

    .line 51
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "referenceKinds is null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)I
    .locals 1

    const-string v0, "call"

    .line 94
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string v0, "jump"

    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const-string v0, "data"

    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x4

    return p0

    :cond_2
    const-string v0, "unknown"

    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/16 p0, 0x8

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(I)Ljava/util/List;
    .locals 2

    .line 81
    invoke-static {p0}, Ll/ۖۖۢ;->ۧ(I)V

    .line 82
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    and-int/lit8 v1, p0, 0x1

    if-eqz v1, :cond_0

    const-string v1, "call"

    .line 108
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    and-int/lit8 v1, p0, 0x2

    if-eqz v1, :cond_1

    const-string v1, "jump"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    and-int/lit8 v1, p0, 0x4

    if-eqz v1, :cond_2

    const-string v1, "data"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    and-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_3

    const-string p0, "unknown"

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    :cond_3
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(I)V
    .locals 1

    if-eqz p0, :cond_0

    and-int/lit8 p0, p0, -0x10

    if-nez p0, :cond_0

    return-void

    .line 72
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid referenceKind mask"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
