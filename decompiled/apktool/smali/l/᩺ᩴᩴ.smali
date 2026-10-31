.class public final Ll/᩺ᩴᩴ;
.super Ll/ܳ᩵ᩴ;
.source "H1MW"

# interfaces
.implements Ll/۫֡ᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۤ:Ll/ۢ᩵ᩴ;

.field public ۫:Ll/ᩳ᩵ᩴ;


# direct methods
.method public constructor <init>(Ll/ۢ᩵ᩴ;)V
    .locals 0

    .line 826
    iput-object p1, p0, Ll/᩺ᩴᩴ;->ۤ:Ll/ۢ᩵ᩴ;

    invoke-direct {p0, p1}, Ll/ܳ᩵ᩴ;-><init>(Ll/ۢ᩵ᩴ;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    .line 831
    new-instance v0, Ll/ᩳ᩵ᩴ;

    iget-object v1, p0, Ll/᩺ᩴᩴ;->ۤ:Ll/ۢ᩵ᩴ;

    invoke-virtual {p0}, Ll/ܳ᩵ᩴ;->֫()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ll/ᩳ᩵ᩴ;-><init>(Ll/ۢ᩵ᩴ;I)V

    iput-object v0, p0, Ll/᩺ᩴᩴ;->۫:Ll/ᩳ᩵ᩴ;

    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 842
    invoke-super {p0}, Ll/ܳ᩵ᩴ;->remove()V

    .line 843
    iget-object v0, p0, Ll/᩺ᩴᩴ;->۫:Ll/ᩳ᩵ᩴ;

    const/4 v1, -0x1

    iput v1, v0, Ll/ᩳ᩵ᩴ;->᩸:I

    return-void
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 2

    .line 826
    check-cast p2, Ljava/util/function/Consumer;

    .line 837
    new-instance v0, Ll/ᩳ᩵ᩴ;

    iget-object v1, p0, Ll/᩺ᩴᩴ;->ۤ:Ll/ۢ᩵ᩴ;

    invoke-direct {v0, v1, p1}, Ll/ᩳ᩵ᩴ;-><init>(Ll/ۢ᩵ᩴ;I)V

    iput-object v0, p0, Ll/᩺ᩴᩴ;->۫:Ll/ᩳ᩵ᩴ;

    invoke-interface {p2, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
