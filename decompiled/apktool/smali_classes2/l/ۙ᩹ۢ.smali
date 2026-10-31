.class public final Ll/ۙ᩹ۢ;
.super Ljava/lang/Object;
.source "Q1R8"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۤ᩹ۢ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۤ᩹ۢ;Ljava/lang/String;)V
    .locals 0

    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ᩹ۢ;->᩸:Ll/ۤ᩹ۢ;

    iput-object p2, p0, Ll/ۙ᩹ۢ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 316
    iget-object v0, p0, Ll/ۙ᩹ۢ;->᩸:Ll/ۤ᩹ۢ;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 318
    :cond_0
    invoke-static {v0}, Ll/ۤ᩹ۢ;->ᩳ(Ll/ۤ᩹ۢ;)Ll/۫᩹ۢ;

    move-result-object v1

    iget-object v1, v1, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    invoke-virtual {v1}, Ll/ܿ᩶ۢ;->᩻()Ll/ܿ᩹ۢ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 319
    invoke-virtual {v1}, Ll/ܿ᩹ۢ;->ۧ()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 322
    :cond_1
    invoke-static {v0}, Ll/ۤ᩹ۢ;->ᩳ(Ll/ۤ᩹ۢ;)Ll/۫᩹ۢ;

    move-result-object v0

    iget-object v0, v0, Ll/۫᩹ۢ;->ۤ:Ll/ܿ᩶ۢ;

    iget-object v1, p0, Ll/ۙ᩹ۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۖ᩹ۢ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 320
    :cond_2
    :goto_0
    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
