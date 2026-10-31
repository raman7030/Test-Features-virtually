.class public final Ll/۠ۖ۠;
.super Ljava/util/AbstractList;
.source "03CL"


# instance fields
.field public final ᩸:Ll/۟᩵֨;


# direct methods
.method public constructor <init>(Ll/۟᩵֨;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 51
    iput-object p1, p0, Ll/۠ۖ۠;->᩸:Ll/۟᩵֨;

    return-void
.end method

.method public static synthetic ֫(Ll/ۛ֡֨;)Z
    .locals 0

    .line 73
    invoke-static {p0}, Ll/۠ۖ۠;->ۧ(Ll/ۛ֡֨;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ۧ(Ll/ۛ֡֨;)Z
    .locals 4

    if-eqz p0, :cond_1

    .line 81
    invoke-virtual {p0}, Ll/ۛ֡֨;->۬()J

    move-result-wide v0

    const-wide/16 v2, 0x1000

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p0, v0, v2

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 64
    sget-object v0, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v1, 0x0

    .line 82
    iget-object v2, p0, Ll/۠ۖ۠;->᩸:Ll/۟᩵֨;

    invoke-virtual {v2, v1, v0}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֡֨;

    .line 65
    invoke-static {v1}, Ll/۠ۖ۠;->ۧ(Ll/ۛ֡֨;)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v2, p1, -0x1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    move p1, v2

    goto :goto_0

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 73
    new-instance v0, Ll/ۢ֡ܿ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/ۢ֡ܿ;-><init>(I)V

    sget-object v1, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    iget-object v2, p0, Ll/۠ۖ۠;->᩸:Ll/۟᩵֨;

    invoke-virtual {v2, v0, v1}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 3

    .line 56
    sget-object v0, Ll/֨᩵֨;->᩹:Ll/֨᩵֨;

    const/4 v1, 0x0

    .line 82
    iget-object v2, p0, Ll/۠ۖ۠;->᩸:Ll/۟᩵֨;

    invoke-virtual {v2, v1, v0}, Ll/۟᩵֨;->֫(Ljava/util/function/Predicate;Ll/֨᩵֨;)Ljava/lang/Iterable;

    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֡֨;

    .line 57
    invoke-static {v2}, Ll/۠ۖ۠;->ۧ(Ll/ۛ֡֨;)Z

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
