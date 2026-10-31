.class public final Ll/ᩳۛܺ;
.super Ll/ܳ۬ܺ;
.source "6574"


# instance fields
.field public final synthetic ۙ:Ll/ܿۛܺ;


# direct methods
.method public constructor <init>(Ll/ܿۛܺ;)V
    .locals 0

    .line 409
    iput-object p1, p0, Ll/ᩳۛܺ;->ۙ:Ll/ܿۛܺ;

    invoke-direct {p0}, Ll/ܳ۬ܺ;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 412
    iget-object v0, p0, Ll/ᩳۛܺ;->ۙ:Ll/ܿۛܺ;

    invoke-static {v0}, Ll/ܿۛܺ;->֫(Ll/ܿۛܺ;)I

    move-result v1

    invoke-static {p1, v1}, Ll/ۘܶܺ;->֫(II)V

    .line 418
    invoke-static {v0}, Ll/ܿۛܺ;->ۧ(Ll/ܿۛܺ;)[Ljava/lang/Object;

    move-result-object v1

    mul-int/lit8 p1, p1, 0x2

    invoke-static {v0}, Ll/ܿۛܺ;->ܽ(Ll/ܿۛܺ;)I

    move-result v2

    add-int/2addr v2, p1

    aget-object v1, v1, v2

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    invoke-static {v0}, Ll/ܿۛܺ;->ۧ(Ll/ܿۛܺ;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ll/ܿۛܺ;->ܽ(Ll/ܿۛܺ;)I

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    add-int/2addr p1, v0

    aget-object p1, v2, p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v0, v1, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 426
    iget-object v0, p0, Ll/ᩳۛܺ;->ۙ:Ll/ܿۛܺ;

    invoke-static {v0}, Ll/ܿۛܺ;->֫(Ll/ܿۛܺ;)I

    move-result v0

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 439
    invoke-super {p0}, Ll/ܳ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
