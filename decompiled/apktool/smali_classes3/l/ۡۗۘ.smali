.class public final Ll/ۡۗۘ;
.super Landroid/text/style/URLSpan;
.source "Y8ZG"


# instance fields
.field public final ᩶:Ll/۬ۙۘ;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ll/᩷᩶ۘ;


# direct methods
.method public constructor <init>(Ll/۬ۙۘ;Ljava/lang/String;Ll/᩷᩶ۘ;)V
    .locals 0

    .line 22
    invoke-direct {p0, p2}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 23
    iput-object p1, p0, Ll/ۡۗۘ;->᩶:Ll/۬ۙۘ;

    .line 24
    iput-object p2, p0, Ll/ۡۗۘ;->᩸:Ljava/lang/String;

    .line 25
    iput-object p3, p0, Ll/ۡۗۘ;->᩹:Ll/᩷᩶ۘ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 30
    iget-object v0, p0, Ll/ۡۗۘ;->᩹:Ll/᩷᩶ۘ;

    iget-object v1, p0, Ll/ۡۗۘ;->᩸:Ljava/lang/String;

    invoke-interface {v0, p1, v1}, Ll/᩷᩶ۘ;->֫(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 35
    iget-object v0, p0, Ll/ۡۗۘ;->᩶:Ll/۬ۙۘ;

    invoke-virtual {v0, p1}, Ll/۬ۙۘ;->֫(Landroid/text/TextPaint;)V

    return-void
.end method
