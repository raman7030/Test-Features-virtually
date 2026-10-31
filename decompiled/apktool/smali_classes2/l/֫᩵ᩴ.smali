.class public final Ll/֫᩵ᩴ;
.super Ll/ܳ᩵ᩴ;
.source "H1MW"

# interfaces
.implements Ll/۫֡ᩴ;
.implements Ll/۫۬ᩴ;


# instance fields
.field public final synthetic ۫:Ll/ۢ᩵ᩴ;


# direct methods
.method public constructor <init>(Ll/ۢ᩵ᩴ;)V
    .locals 0

    .line 1128
    iput-object p1, p0, Ll/֫᩵ᩴ;->۫:Ll/ۢ᩵ᩴ;

    .line 1129
    invoke-direct {p0, p1}, Ll/ܳ᩵ᩴ;-><init>(Ll/ۢ᩵ᩴ;)V

    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1142
    iget-object v0, p0, Ll/֫᩵ᩴ;->۫:Ll/ۢ᩵ᩴ;

    iget-object v0, v0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    invoke-virtual {p0}, Ll/ܳ᩵ᩴ;->֫()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final ֫(ILjava/lang/Object;)V
    .locals 1

    .line 1127
    check-cast p2, Ljava/util/function/Consumer;

    .line 1137
    iget-object v0, p0, Ll/֫᩵ᩴ;->۫:Ll/ۢ᩵ᩴ;

    iget-object v0, v0, Ll/ۢ᩵ᩴ;->ۙ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-interface {p2, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method
