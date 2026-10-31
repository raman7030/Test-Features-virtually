.class public final Ll/ۖ۫ܺ;
.super Ll/᩶ۨܺ;
.source "I5ZF"


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:[Ljava/util/Iterator;


# direct methods
.method public constructor <init>([Ljava/util/Iterator;)V
    .locals 0

    .line 469
    iput-object p1, p0, Ll/ۖ۫ܺ;->᩹:[Ljava/util/Iterator;

    invoke-direct {p0}, Ll/᩶ۨܺ;-><init>()V

    const/4 p1, 0x0

    .line 470
    iput p1, p0, Ll/ۖ۫ܺ;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 474
    iget v0, p0, Ll/ۖ۫ܺ;->᩸:I

    iget-object v1, p0, Ll/ۖ۫ܺ;->᩹:[Ljava/util/Iterator;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    .line 479
    invoke-virtual {p0}, Ll/ۖ۫ܺ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 486
    iget v0, p0, Ll/ۖ۫ܺ;->᩸:I

    iget-object v1, p0, Ll/ۖ۫ܺ;->᩹:[Ljava/util/Iterator;

    aget-object v0, v1, v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    iget v2, p0, Ll/ۖ۫ܺ;->᩸:I

    const/4 v3, 0x0

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    .line 488
    iput v2, p0, Ll/ۖ۫ܺ;->᩸:I

    return-object v0

    .line 480
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
