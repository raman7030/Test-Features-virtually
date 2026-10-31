.class public final Ll/ۢ᩸᩵;
.super Ll/ᩴ᩸᩵;
.source "X9MQ"


# instance fields
.field public ۗ:I

.field public final synthetic ۙ:Ll/ܺ᩹᩵;


# direct methods
.method public constructor <init>(Ll/ۨܶ᩵;Ll/ܳ᩸᩵;Ll/ܺ᩹᩵;)V
    .locals 0

    .line 2
    iput-object p3, p0, Ll/ۢ᩸᩵;->ۙ:Ll/ܺ᩹᩵;

    const-string p3, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    .line 225
    invoke-static {p1, p3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Ll/ᩴ᩸᩵;-><init>(Ll/ۨܶ᩵;Ll/ܳ᩸᩵;)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 229
    iget v0, p0, Ll/ۢ᩸᩵;->ۗ:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    .line 236
    iput v0, p0, Ll/ۢ᩸᩵;->ۗ:I

    .line 237
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    .line 239
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 231
    :cond_1
    iput v1, p0, Ll/ۢ᩸᩵;->ۗ:I

    .line 232
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    const-string p1, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>"

    .line 271
    iget-object v0, p0, Ll/ۢ᩸᩵;->ۙ:Ll/ܺ᩹᩵;

    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Ll/ۢ᩶᩵;->֫(ILjava/lang/Object;)V

    invoke-interface {v0, p0}, Ll/ܺ᩹᩵;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
