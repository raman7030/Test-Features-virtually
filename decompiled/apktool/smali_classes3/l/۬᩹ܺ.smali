.class public final Ll/۬᩹ܺ;
.super Ljava/util/AbstractCollection;
.source "E3QI"


# instance fields
.field public final synthetic ᩸:Ll/ܳ᩶ܺ;


# direct methods
.method public constructor <init>(Ll/ܳ᩶ܺ;)V
    .locals 0

    .line 4426
    iput-object p1, p0, Ll/۬᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 4439
    iget-object v0, p0, Ll/۬᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    invoke-virtual {v0}, Ll/ܳ᩶ܺ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 4449
    iget-object v0, p0, Ll/۬᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    invoke-virtual {v0, p1}, Ll/ܳ᩶ܺ;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 4434
    iget-object v0, p0, Ll/۬᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    invoke-virtual {v0}, Ll/ܳ᩶ܺ;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 4444
    new-instance v0, Ll/ۙ᩹ܺ;

    iget-object v1, p0, Ll/۬᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    .line 4323
    invoke-direct {v0, v1}, Ll/ۧ᩹ܺ;-><init>(Ll/ܳ᩶ܺ;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 4429
    iget-object v0, p0, Ll/۬᩹ܺ;->᩸:Ll/ܳ᩶ܺ;

    invoke-virtual {v0}, Ll/ܳ᩶ܺ;->size()I

    move-result v0

    return v0
.end method
