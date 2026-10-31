.class public final Ll/ᩳܶۘ;
.super Ljava/lang/Object;
.source "51RR"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᩸:Lcom/tencent/connect/common/AssistActivity;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/common/AssistActivity;)V
    .locals 0

    .line 203
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳܶۘ;->᩸:Lcom/tencent/connect/common/AssistActivity;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 206
    iget-object p1, p0, Ll/ᩳܶۘ;->᩸:Lcom/tencent/connect/common/AssistActivity;

    invoke-static {p1}, Lcom/tencent/connect/common/AssistActivity;->֫(Lcom/tencent/connect/common/AssistActivity;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "-->finish by touch"

    invoke-static {p2, v0}, Ll/ۡ᩸ۘ;->ܿ(Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x0

    return p1
.end method
