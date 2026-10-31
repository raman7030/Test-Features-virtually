.class public final Ll/᩻ᩳܽ;
.super Ljava/lang/Object;
.source "65Y3"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/ۜᩳܽ;


# direct methods
.method public constructor <init>(Ll/ۜᩳܽ;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ᩳܽ;->᩹:Ll/ۜᩳܽ;

    const/4 p1, 0x0

    .line 61
    iput p1, p0, Ll/᩻ᩳܽ;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 3

    .line 72
    :goto_0
    iget v0, p0, Ll/᩻ᩳܽ;->᩸:I

    iget-object v1, p0, Ll/᩻ᩳܽ;->᩹:Ll/ۜᩳܽ;

    invoke-interface {v1}, Ll/ۜ᩻ܽ;->֨()I

    move-result v2

    if-gt v0, v2, :cond_1

    .line 73
    iget v0, p0, Ll/᩻ᩳܽ;->᩸:I

    invoke-interface {v1, v0}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 75
    :cond_0
    iget v0, p0, Ll/᩻ᩳܽ;->᩸:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩻ᩳܽ;->᩸:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    .line 66
    iput v0, p0, Ll/᩻ᩳܽ;->᩸:I

    return-object p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 83
    iget v0, p0, Ll/᩻ᩳܽ;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩻ᩳܽ;->᩸:I

    iget-object v1, p0, Ll/᩻ᩳܽ;->᩹:Ll/ۜᩳܽ;

    invoke-interface {v1, v0}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
