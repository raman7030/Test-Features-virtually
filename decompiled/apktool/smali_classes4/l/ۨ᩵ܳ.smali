.class public final synthetic Ll/ۨ᩵ܳ;
.super Ljava/lang/Object;
.source "473S"

# interfaces
.implements Ljava/util/function/LongUnaryOperator;


# instance fields
.field public final synthetic ֫:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ۨ᩵ܳ;->֫:J

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/LongUnaryOperator;)Ljava/util/function/LongUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩴۛᩴ;->$default$andThen(Ljava/util/function/LongUnaryOperator;Ljava/util/function/LongUnaryOperator;)Ljava/util/function/LongUnaryOperator;

    move-result-object p1

    return-object p1
.end method

.method public final applyAsLong(J)J
    .locals 2

    .line 2
    iget-wide v0, p0, Ll/ۨ᩵ܳ;->֫:J

    .line 971
    invoke-static {p1, p2, v0, v1}, Ll/ܿ֡ܳ;->֫(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method public synthetic compose(Ljava/util/function/LongUnaryOperator;)Ljava/util/function/LongUnaryOperator;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩴۛᩴ;->$default$compose(Ljava/util/function/LongUnaryOperator;Ljava/util/function/LongUnaryOperator;)Ljava/util/function/LongUnaryOperator;

    move-result-object p1

    return-object p1
.end method
