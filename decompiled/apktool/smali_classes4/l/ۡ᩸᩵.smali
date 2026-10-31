.class public final Ll/ۡ᩸᩵;
.super Ll/۠᩸᩵;
.source "X9MQ"


# instance fields
.field public ۙ:I

.field public final synthetic ᩶:Ll/᩵᩹᩵;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/᩵᩹᩵;Ljava/lang/Object;Ll/ۨܶ᩵;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/ۡ᩸᩵;->᩶:Ll/᩵᩹᩵;

    .line 4
    iput-object p2, p0, Ll/ۡ᩸᩵;->᩹:Ljava/lang/Object;

    const-string p1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    .line 207
    invoke-static {p3, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3}, Ll/۠᩸᩵;-><init>(Ll/ۨܶ᩵;)V

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 211
    iget v0, p0, Ll/ۡ᩸᩵;->ۙ:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    .line 218
    iput v1, p0, Ll/ۡ᩸᩵;->ۙ:I

    .line 219
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    .line 221
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 213
    :cond_1
    iput v2, p0, Ll/ۡ᩸᩵;->ۙ:I

    .line 214
    invoke-static {p1}, Ll/ᩴ۠᩵;->֫(Ljava/lang/Object;)V

    const-string p1, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>"

    .line 271
    iget-object v0, p0, Ll/ۡ᩸᩵;->᩶:Ll/᩵᩹᩵;

    invoke-static {v0, p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Ll/ۢ᩶᩵;->֫(ILjava/lang/Object;)V

    iget-object p1, p0, Ll/ۡ᩸᩵;->᩹:Ljava/lang/Object;

    invoke-interface {v0, p1, p0}, Ll/᩵᩹᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
