.class public final Ll/ܿܿܽ;
.super Ljava/lang/Object;
.source "H61Y"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ljava/util/Iterator;


# instance fields
.field public ᩸:I

.field public final synthetic ᩹:Ll/᩷ܿܽ;


# direct methods
.method public constructor <init>(Ll/᩷ܿܽ;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿܿܽ;->᩹:Ll/᩷ܿܽ;

    const/4 p1, 0x0

    .line 56
    iput p1, p0, Ll/ܿܿܽ;->᩸:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 66
    iget v0, p0, Ll/ܿܿܽ;->᩸:I

    iget-object v1, p0, Ll/ܿܿܽ;->᩹:Ll/᩷ܿܽ;

    invoke-interface {v1}, Ll/۫᩻ܽ;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 0

    return-object p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 72
    iget v0, p0, Ll/ܿܿܽ;->᩸:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ܿܿܽ;->᩸:I

    iget-object v1, p0, Ll/ܿܿܽ;->᩹:Ll/᩷ܿܽ;

    invoke-interface {v1, v0}, Ll/۫᩻ܽ;->getItem(I)Ll/ۗ᩻ܽ;

    move-result-object v0

    return-object v0
.end method
