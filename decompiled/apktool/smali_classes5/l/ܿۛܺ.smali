.class public final Ll/ܿۛܺ;
.super Ll/ۛ۬ܺ;
.source "6574"


# instance fields
.field public final transient ۗ:I

.field public final transient ۙ:[Ljava/lang/Object;

.field public final transient ۫:I

.field public final transient ۬:Ll/ۢ۬ܺ;


# direct methods
.method public constructor <init>(Ll/ۢ۬ܺ;[Ljava/lang/Object;II)V
    .locals 0

    .line 390
    invoke-direct {p0}, Ll/ۛ۬ܺ;-><init>()V

    .line 391
    iput-object p1, p0, Ll/ܿۛܺ;->۬:Ll/ۢ۬ܺ;

    .line 392
    iput-object p2, p0, Ll/ܿۛܺ;->ۙ:[Ljava/lang/Object;

    .line 393
    iput p3, p0, Ll/ܿۛܺ;->ۗ:I

    .line 394
    iput p4, p0, Ll/ܿۛܺ;->۫:I

    return-void
.end method

.method public static synthetic ֫(Ll/ܿۛܺ;)I
    .locals 0

    .line 380
    iget p0, p0, Ll/ܿۛܺ;->۫:I

    return p0
.end method

.method public static synthetic ۧ(Ll/ܿۛܺ;)[Ljava/lang/Object;
    .locals 0

    .line 380
    iget-object p0, p0, Ll/ܿۛܺ;->ۙ:[Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ܿۛܺ;)I
    .locals 0

    .line 380
    iget p0, p0, Ll/ܿۛܺ;->ۗ:I

    return p0
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .line 446
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 447
    check-cast p1, Ljava/util/Map$Entry;

    .line 448
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 449
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 450
    iget-object v2, p0, Ll/ܿۛܺ;->۬:Ll/ۢ۬ܺ;

    invoke-virtual {v2, v0}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 380
    invoke-virtual {p0}, Ll/ܿۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ll/᩶ۨܺ;
    .locals 2

    .line 399
    invoke-virtual {p0}, Ll/ۛ۬ܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 462
    iget v0, p0, Ll/ܿۛܺ;->۫:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 471
    invoke-super {p0}, Ll/ۛ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I[Ljava/lang/Object;)I
    .locals 1

    .line 404
    invoke-virtual {p0}, Ll/ۛ۬ܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ܳ۬ܺ;->֫(I[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩻()Ll/ܳ۬ܺ;
    .locals 1

    .line 409
    new-instance v0, Ll/ᩳۛܺ;

    invoke-direct {v0, p0}, Ll/ᩳۛܺ;-><init>(Ll/ܿۛܺ;)V

    return-object v0
.end method
