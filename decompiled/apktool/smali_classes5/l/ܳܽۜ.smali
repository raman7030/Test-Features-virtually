.class public final Ll/ܳܽۜ;
.super Ll/ۛᩳܽ;
.source "Q77G"


# instance fields
.field public final ۗ:Ll/ܿܽۜ;


# direct methods
.method public constructor <init>(Ll/ᩳܽۜ;IIILl/ܿܽۜ;)V
    .locals 0

    .line 316
    invoke-direct {p0, p1}, Ll/ۛᩳܽ;-><init>(Ll/᩷ᩳܽ;)V

    .line 317
    iput p2, p0, Ll/ۛᩳܽ;->᩶:I

    .line 318
    iput p3, p0, Ll/ۛᩳܽ;->ۙ:I

    .line 319
    iput p4, p0, Ll/ۛᩳܽ;->᩹:I

    .line 320
    iput-object p5, p0, Ll/ܳܽۜ;->ۗ:Ll/ܿܽۜ;

    return-void
.end method


# virtual methods
.method public final ܿۧ()Ll/ۗ᩻ܽ;
    .locals 1

    .line 325
    iget-object v0, p0, Ll/ܳܽۜ;->ۗ:Ll/ܿܽۜ;

    return-object v0
.end method

.method public final ᩷֫()I
    .locals 3

    .line 330
    invoke-virtual {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩳܽۜ;

    const/4 v1, 0x0

    .line 331
    :goto_0
    invoke-static {v0}, Ll/ᩳܽۜ;->֫(Ll/ᩳܽۜ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 332
    invoke-static {v0}, Ll/ᩳܽۜ;->֫(Ll/ᩳܽۜ;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p0, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method
