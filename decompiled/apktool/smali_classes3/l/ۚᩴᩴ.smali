.class public final Ll/ۚᩴᩴ;
.super Ll/᩻ܺᩴ;
.source "W1E0"


# instance fields
.field public final synthetic ᩶:Ll/֨ᩴᩴ;


# direct methods
.method public constructor <init>(Ll/֨ᩴᩴ;II)V
    .locals 0

    .line 675
    iput-object p1, p0, Ll/ۚᩴᩴ;->᩶:Ll/֨ᩴᩴ;

    .line 676
    invoke-direct {p0, p2, p3}, Ll/᩻ܺᩴ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4150

    return v0
.end method

.method public final bridge synthetic forEachRemaining(Ljava/lang/Object;)V
    .locals 0

    .line 674
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-virtual {p0, p1}, Ll/ۚᩴᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public final forEachRemaining(Ljava/util/function/IntConsumer;)V
    .locals 4

    .line 698
    iget-object v0, p0, Ll/ۚᩴᩴ;->᩶:Ll/֨ᩴᩴ;

    iget-object v0, v0, Ll/֨ᩴᩴ;->᩸:Ll/۠ᩴᩴ;

    iget-object v1, v0, Ll/۠ᩴᩴ;->ۗ:[I

    .line 699
    iget v0, v0, Ll/۠ᩴᩴ;->ۙ:I

    .line 700
    :goto_0
    iget v2, p0, Ll/ᩳܺᩴ;->᩸:I

    if-ge v2, v0, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 701
    iput v3, p0, Ll/ᩳܺᩴ;->᩸:I

    aget v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(I)I
    .locals 1

    .line 687
    iget-object v0, p0, Ll/ۚᩴᩴ;->᩶:Ll/֨ᩴᩴ;

    iget-object v0, v0, Ll/֨ᩴᩴ;->᩸:Ll/۠ᩴᩴ;

    iget-object v0, v0, Ll/۠ᩴᩴ;->ۗ:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ֫(II)Ll/ܽܺᩴ;
    .locals 2

    .line 692
    new-instance v0, Ll/ۚᩴᩴ;

    iget-object v1, p0, Ll/ۚᩴᩴ;->᩶:Ll/֨ᩴᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/ۚᩴᩴ;-><init>(Ll/֨ᩴᩴ;II)V

    return-object v0
.end method
