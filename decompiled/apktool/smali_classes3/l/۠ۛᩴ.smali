.class public final synthetic Ll/۠ۛᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/DoubleConsumer;


# instance fields
.field public final synthetic a:Ljava/util/function/DoubleConsumer;

.field public final synthetic b:Ljava/util/function/DoubleConsumer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۛᩴ;->a:Ljava/util/function/DoubleConsumer;

    iput-object p2, p0, Ll/۠ۛᩴ;->b:Ljava/util/function/DoubleConsumer;

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 1

    .line 65
    iget-object v0, p0, Ll/۠ۛᩴ;->a:Ljava/util/function/DoubleConsumer;

    invoke-interface {v0, p1, p2}, Ljava/util/function/DoubleConsumer;->accept(D)V

    iget-object v0, p0, Ll/۠ۛᩴ;->b:Ljava/util/function/DoubleConsumer;

    invoke-interface {v0, p1, p2}, Ljava/util/function/DoubleConsumer;->accept(D)V

    return-void
.end method

.method public final synthetic andThen(Ljava/util/function/DoubleConsumer;)Ljava/util/function/DoubleConsumer;
    .locals 0

    invoke-static {p0, p1}, Ll/ܺ᩶ᩴ;->a(Ljava/util/function/DoubleConsumer;Ljava/util/function/DoubleConsumer;)Ll/۠ۛᩴ;

    move-result-object p1

    return-object p1
.end method
