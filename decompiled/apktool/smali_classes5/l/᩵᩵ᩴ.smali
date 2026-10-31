.class public final Ll/᩵᩵ᩴ;
.super Ll/᩶ۚᩴ;
.source "S24"


# instance fields
.field public final synthetic ᩶:Ll/֡᩵ᩴ;


# direct methods
.method public constructor <init>(Ll/֡᩵ᩴ;II)V
    .locals 0

    .line 546
    iput-object p1, p0, Ll/᩵᩵ᩴ;->᩶:Ll/֡᩵ᩴ;

    .line 547
    invoke-direct {p0, p2, p3}, Ll/᩶ۚᩴ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    const/16 v0, 0x4051

    return v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 4

    .line 569
    iget-object v0, p0, Ll/᩵᩵ᩴ;->᩶:Ll/֡᩵ᩴ;

    iget-object v0, v0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    iget-object v1, v0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    .line 570
    iget v0, v0, Ll/᩸᩵ᩴ;->ۙ:I

    .line 571
    :goto_0
    iget v2, p0, Ll/ܶۚᩴ;->᩸:I

    if-ge v2, v0, :cond_0

    add-int/lit8 v3, v2, 0x1

    .line 572
    iput v3, p0, Ll/ܶۚᩴ;->᩸:I

    aget-object v2, v1, v2

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 1

    .line 558
    iget-object v0, p0, Ll/᩵᩵ᩴ;->᩶:Ll/֡᩵ᩴ;

    iget-object v0, v0, Ll/֡᩵ᩴ;->᩸:Ll/᩸᩵ᩴ;

    iget-object v0, v0, Ll/᩸᩵ᩴ;->᩹:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ֫(II)Ll/۠ۚᩴ;
    .locals 2

    .line 563
    new-instance v0, Ll/᩵᩵ᩴ;

    iget-object v1, p0, Ll/᩵᩵ᩴ;->᩶:Ll/֡᩵ᩴ;

    invoke-direct {v0, v1, p1, p2}, Ll/᩵᩵ᩴ;-><init>(Ll/֡᩵ᩴ;II)V

    return-object v0
.end method
