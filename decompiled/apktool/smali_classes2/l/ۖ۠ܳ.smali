.class public final Ll/ۖ۠ܳ;
.super Landroid/text/style/ClickableSpan;
.source "052E"


# instance fields
.field public final synthetic ᩸:Ll/ۜ۠ܳ;


# direct methods
.method public constructor <init>(Ll/ۜ۠ܳ;)V
    .locals 0

    .line 202
    iput-object p1, p0, Ll/ۖ۠ܳ;->᩸:Ll/ۜ۠ܳ;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 205
    iget-object p1, p0, Ll/ۖ۠ܳ;->᩸:Ll/ۜ۠ܳ;

    invoke-virtual {p1}, Ll/ۜ۠ܳ;->run()V

    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 210
    iget v0, p1, Landroid/text/TextPaint;->linkColor:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method
