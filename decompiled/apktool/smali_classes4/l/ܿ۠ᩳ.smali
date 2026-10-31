.class public final synthetic Ll/ܿ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ll/ۘܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۘܶᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۠ᩳ;->֫:Ll/ۘܶᩳ;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 2203
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Saving observation ended"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿ۠ᩳ;->֫:Ll/ۘܶᩳ;

    invoke-virtual {v1, v0}, Ll/ۘܶᩳ;->֫(Ljava/lang/Throwable;)V

    .line 2204
    iget-object v0, v1, Ll/ۘܶᩳ;->֫:Ll/ۡܶᩳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۡܶᩳ;->close()V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
