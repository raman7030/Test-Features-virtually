.class public final Ll/ۢܶᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Ll/ۡ᩹ۡ;


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/ۡ᩹ۡ;)V
    .locals 0

    .line 1234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢܶᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ۢܶᩳ;->᩹:Ll/ۡ᩹ۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1237
    iget-object v0, p0, Ll/ۢܶᩳ;->᩹:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۢܶᩳ;->᩸:Ll/᩹ܶᩳ;

    invoke-virtual {v0}, Ll/֫ۘᩳ;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1238
    :cond_0
    invoke-static {v0}, Ll/᩹ܶᩳ;->ܿ(Ll/᩹ܶᩳ;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/᩹ܶᩳ;->۠(Ll/᩹ܶᩳ;)V

    return-void

    :cond_1
    const-wide/16 v0, 0x64

    .line 1239
    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_2
    :goto_0
    return-void
.end method
