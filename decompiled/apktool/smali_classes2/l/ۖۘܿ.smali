.class public final Ll/ۖۘܿ;
.super Landroid/text/style/CharacterStyle;
.source "Q983"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 287
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 288
    iput p1, p0, Ll/ۖۘܿ;->᩹:I

    .line 289
    iput p2, p0, Ll/ۖۘܿ;->᩸:I

    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    .line 294
    iget v0, p0, Ll/ۖۘܿ;->᩹:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v0, -0x1000000

    .line 295
    iget v1, p0, Ll/ۖۘܿ;->᩸:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    .line 296
    iput v1, p1, Landroid/text/TextPaint;->bgColor:I

    :cond_0
    return-void
.end method
