.class public final Ll/᩸᩺ᩴ;
.super Ll/ۡ᩺ᩴ;
.source "N673"


# instance fields
.field public final synthetic h:Ljava/util/function/LongBinaryOperator;

.field public final synthetic i:J


# direct methods
.method public constructor <init>(Ll/ۡ֫᩵;Ljava/util/function/LongBinaryOperator;J)V
    .locals 0

    .line 899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 484
    iput-object p2, p0, Ll/᩸᩺ᩴ;->h:Ljava/util/function/LongBinaryOperator;

    iput-wide p3, p0, Ll/᩸᩺ᩴ;->i:J

    return-void
.end method


# virtual methods
.method public final e0()Ll/ᩳܿ᩵;
    .locals 4

    .line 487
    new-instance v0, Ll/᩵ᩳ᩵;

    iget-wide v1, p0, Ll/᩸᩺ᩴ;->i:J

    iget-object v3, p0, Ll/᩸᩺ᩴ;->h:Ljava/util/function/LongBinaryOperator;

    invoke-direct {v0, v1, v2, v3}, Ll/᩵ᩳ᩵;-><init>(JLjava/util/function/LongBinaryOperator;)V

    return-object v0
.end method
