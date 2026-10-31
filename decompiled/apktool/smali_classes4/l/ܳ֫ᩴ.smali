.class public final Ll/ܳ֫ᩴ;
.super Ll/ܺ֫ᩴ;
.source "97L"

# interfaces
.implements Ll/۫֡ᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final ۫:Ll/ۢ֫ᩴ;


# direct methods
.method public constructor <init>(Ll/᩵֫ᩴ;)V
    .locals 1

    .line 786
    invoke-direct {p0, p1}, Ll/ܺ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    .line 787
    new-instance v0, Ll/ۢ֫ᩴ;

    invoke-direct {v0, p1}, Ll/ۢ֫ᩴ;-><init>(Ll/᩵֫ᩴ;)V

    iput-object v0, p0, Ll/ܳ֫ᩴ;->۫:Ll/ۢ֫ᩴ;

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 2

    .line 791
    invoke-virtual {p0}, Ll/ܺ֫ᩴ;->֫()I

    move-result v0

    iget-object v1, p0, Ll/ܳ֫ᩴ;->۫:Ll/ۢ֫ᩴ;

    iput v0, v1, Ll/ۢ֫ᩴ;->᩸:I

    return-object v1
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 786
    check-cast p2, Ljava/util/function/Consumer;

    .line 798
    iget-object v0, p0, Ll/ܳ֫ᩴ;->۫:Ll/ۢ֫ᩴ;

    iput p1, v0, Ll/ۢ֫ᩴ;->᩸:I

    .line 799
    invoke-interface {p2, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
