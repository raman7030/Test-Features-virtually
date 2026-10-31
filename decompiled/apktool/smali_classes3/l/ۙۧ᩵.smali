.class public final Ll/ۙۧ᩵;
.super Ll/᩶ܽ᩵;
.source "N673"

# interfaces
.implements Ll/ۤܽ᩵;


# instance fields
.field public final b:Ljava/util/function/IntConsumer;


# direct methods
.method public constructor <init>(Ljava/util/function/IntConsumer;Z)V
    .locals 0

    .line 193
    invoke-direct {p0, p2}, Ll/᩶ܽ᩵;-><init>(Z)V

    .line 194
    iput-object p1, p0, Ll/ۙۧ᩵;->b:Ljava/util/function/IntConsumer;

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 1

    .line 204
    iget-object v0, p0, Ll/ۙۧ᩵;->b:Ljava/util/function/IntConsumer;

    invoke-interface {v0, p1}, Ljava/util/function/IntConsumer;->accept(I)V

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->q(Ll/ۤܽ᩵;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 150
    invoke-virtual {p1, p2, p0}, Ll/۫᩺ᩴ;->f0(Ll/ܶ۫ᩴ;Ll/֡ᩳ᩵;)Ll/֡ᩳ᩵;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final synthetic d(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Ll/ۡ᩺ᩴ;->p(Ll/ۤܽ᩵;Ljava/lang/Integer;)V

    return-void
.end method

.method public final bridge synthetic e(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 188
    invoke-virtual {p0, p1, p2}, Ll/᩶ܽ᩵;->a(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
