.class public final Ll/᩻ۛܺ;
.super Ll/ܳ۬ܺ;
.source "6574"


# instance fields
.field public final transient ۗ:I

.field public final transient ۙ:[Ljava/lang/Object;

.field public final transient ۬:I


# direct methods
.method public constructor <init>(II[Ljava/lang/Object;)V
    .locals 0

    .line 488
    invoke-direct {p0}, Ll/ܳ۬ܺ;-><init>()V

    .line 489
    iput-object p3, p0, Ll/᩻ۛܺ;->ۙ:[Ljava/lang/Object;

    .line 490
    iput p1, p0, Ll/᩻ۛܺ;->ۗ:I

    .line 491
    iput p2, p0, Ll/᩻ۛܺ;->۬:I

    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 496
    iget v0, p0, Ll/᩻ۛܺ;->۬:I

    invoke-static {p1, v0}, Ll/ۘܶܺ;->֫(II)V

    mul-int/lit8 p1, p1, 0x2

    .line 498
    iget v0, p0, Ll/᩻ۛܺ;->ۗ:I

    add-int/2addr p1, v0

    iget-object v0, p0, Ll/᩻ۛܺ;->ۙ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 508
    iget v0, p0, Ll/᩻ۛܺ;->۬:I

    return v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 515
    invoke-super {p0}, Ll/ܳ۬ܺ;->writeReplace()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
