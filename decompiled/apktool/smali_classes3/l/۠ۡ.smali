.class public final Ll/۠ۡ;
.super Ljava/lang/Object;
.source "N5WL"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic ᩸:Ll/᩸ۡ;


# direct methods
.method public constructor <init>(Ll/᩸ۡ;)V
    .locals 0

    .line 1055
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۡ;->᩸:Ll/᩸ۡ;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .line 1058
    iget-object v0, p0, Ll/۠ۡ;->᩸:Ll/᩸ۡ;

    iget-object v1, v0, Ll/᩸ۡ;->ܶ֫:Ll/ۗۡ;

    invoke-virtual {v0, v1}, Ll/᩸ۡ;->ۧ(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1059
    invoke-virtual {v0}, Ll/ۢۖ;->dismiss()V

    return-void

    .line 1061
    :cond_0
    invoke-virtual {v0}, Ll/᩸ۡ;->ᩴ()V

    .line 948
    invoke-virtual {v0}, Ll/ۢۖ;->show()V

    return-void
.end method
