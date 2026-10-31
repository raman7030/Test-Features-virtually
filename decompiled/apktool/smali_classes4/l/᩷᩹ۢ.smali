.class public final Ll/᩷᩹ۢ;
.super Ljava/lang/Object;
.source "L1RG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۢ᩹ۢ;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/ۢ᩹ۢ;I)V
    .locals 0

    .line 176
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷᩹ۢ;->᩸:Ll/ۢ᩹ۢ;

    iput p2, p0, Ll/᩷᩹ۢ;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 179
    iget-object v0, p0, Ll/᩷᩹ۢ;->᩸:Ll/ۢ᩹ۢ;

    invoke-static {v0}, Ll/ۢ᩹ۢ;->֫(Ll/ۢ᩹ۢ;)I

    move-result v1

    iget v2, p0, Ll/᩷᩹ۢ;->᩹:I

    if-ne v2, v1, :cond_0

    .line 180
    invoke-static {v0}, Ll/ۢ᩹ۢ;->ۧ(Ll/ۢ᩹ۢ;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->performClick()Z

    .line 181
    invoke-static {v0}, Ll/ۢ᩹ۢ;->ۧ(Ll/ۢ᩹ۢ;)Landroid/view/View;

    move-result-object v0

    const-wide/16 v1, 0x32

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
