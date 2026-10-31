.class public final Ll/ۘ۫᩵;
.super Ll/ۗۗ᩵;
.source "HAX2"


# static fields
.field public static final synthetic ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/ۘ۫᩵;

    .line 13
    invoke-direct {v0}, Ll/ۗۗ᩵;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Unconfined"

    return-object v0
.end method

.method public final ֫(Ll/ܳ᩸᩵;Ljava/lang/Runnable;)V
    .locals 0

    .line 24
    sget-object p2, Ll/ۚ۫᩵;->᩹:Ll/֡۫᩵;

    invoke-interface {p1, p2}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object p1

    check-cast p1, Ll/ۚ۫᩵;

    if-eqz p1, :cond_0

    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
