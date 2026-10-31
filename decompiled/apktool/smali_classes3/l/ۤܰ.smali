.class public final Ll/ۤܰ;
.super Landroid/text/style/ClickableSpan;
.source "S207"


# instance fields
.field public final ᩶:I

.field public final ᩸:I

.field public final ᩹:Ll/ܳ۟;


# direct methods
.method public constructor <init>(ILl/ܳ۟;I)V
    .locals 0

    .line 53
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 54
    iput p1, p0, Ll/ۤܰ;->᩶:I

    .line 55
    iput-object p2, p0, Ll/ۤܰ;->᩹:Ll/ܳ۟;

    .line 56
    iput p3, p0, Ll/ۤܰ;->᩸:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 67
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "ACCESSIBILITY_CLICKABLE_SPAN_ID"

    .line 68
    iget v1, p0, Ll/ۤܰ;->᩶:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 69
    iget-object v0, p0, Ll/ۤܰ;->᩹:Ll/ܳ۟;

    iget v1, p0, Ll/ۤܰ;->᩸:I

    invoke-virtual {v0, v1, p1}, Ll/ܳ۟;->֫(ILandroid/os/Bundle;)V

    return-void
.end method
