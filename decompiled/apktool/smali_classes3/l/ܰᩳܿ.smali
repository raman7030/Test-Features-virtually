.class public final Ll/ܰᩳܿ;
.super Ljava/lang/Object;
.source "NAVX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Landroid/view/View;

.field public final synthetic ᩶:Ll/֫ܿܿ;

.field public ᩸:I

.field public final synthetic ᩹:Ll/ۧܿܿ;


# direct methods
.method public constructor <init>(Ll/ۧܿܿ;Landroid/view/View;Ll/֫ܿܿ;)V
    .locals 0

    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰᩳܿ;->᩹:Ll/ۧܿܿ;

    iput-object p2, p0, Ll/ܰᩳܿ;->ۙ:Landroid/view/View;

    iput-object p3, p0, Ll/ܰᩳܿ;->᩶:Ll/֫ܿܿ;

    const/4 p1, 0x0

    .line 222
    iput p1, p0, Ll/ܰᩳܿ;->᩸:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 226
    iget-object v0, p0, Ll/ܰᩳܿ;->ۙ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isPressed()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 227
    iget v1, p0, Ll/ܰᩳܿ;->᩸:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ܰᩳܿ;->᩸:I

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 228
    invoke-virtual {v0, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 230
    :cond_0
    iget-object v1, p0, Ll/ܰᩳܿ;->᩹:Ll/ۧܿܿ;

    iget-object v1, v1, Ll/ۧܿܿ;->֫:Ll/ܶܳܿ;

    iget-object v1, v1, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    iget-object v2, p0, Ll/ܰᩳܿ;->᩶:Ll/֫ܿܿ;

    invoke-virtual {v1, v0, v2}, Ll/ۧܿܿ;->֫(Landroid/view/View;Ll/֫ܿܿ;)V

    .line 231
    iget v0, p0, Ll/ܰᩳܿ;->᩸:I

    const/16 v1, 0x32

    if-ge v0, v1, :cond_1

    rsub-int/lit8 v0, v0, 0x32

    mul-int/lit16 v0, v0, 0x82

    .line 233
    div-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x14

    int-to-long v0, v0

    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void

    :cond_1
    const-wide/16 v0, 0x14

    .line 235
    invoke-static {p0, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    :cond_2
    return-void
.end method
