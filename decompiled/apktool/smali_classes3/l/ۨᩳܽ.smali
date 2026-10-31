.class public final Ll/ۨᩳܽ;
.super Ljava/lang/Object;
.source "89QF"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Iterator;


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/۬ۜᩴ;

.field public ᩹:I


# direct methods
.method public constructor <init>(ILl/۬ۜᩴ;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Ll/ۨᩳܽ;->᩶:I

    .line 16
    iput-object p2, p0, Ll/ۨᩳܽ;->᩸:Ll/۬ۜᩴ;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 28
    iget v0, p0, Ll/ۨᩳܽ;->᩹:I

    iget v1, p0, Ll/ۨᩳܽ;->᩶:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Ll/ۨᩳܽ;->᩹:I

    return-object p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 34
    iget v0, p0, Ll/ۨᩳܽ;->᩹:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۨᩳܽ;->᩹:I

    iget-object v1, p0, Ll/ۨᩳܽ;->᩸:Ll/۬ۜᩴ;

    invoke-interface {v1, v0}, Ll/۬ۜᩴ;->apply(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
