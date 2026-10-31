.class public final synthetic Ll/۠۠ۡ;
.super Ljava/lang/Object;
.source "Z6VB"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩸۠ۡ;

.field public final synthetic ᩹:Ll/᩺۠ۡ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸۠ۡ;Ll/᩺۠ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠۠ۡ;->᩸:Ll/᩸۠ۡ;

    iput-object p2, p0, Ll/۠۠ۡ;->᩹:Ll/᩺۠ۡ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 133
    iget-object v0, p0, Ll/۠۠ۡ;->᩸:Ll/᩸۠ۡ;

    iget-object v0, v0, Ll/᩸۠ۡ;->֫:Ll/᩹۠ۡ;

    invoke-static {v0}, Ll/᩹۠ۡ;->ᩳ(Ll/᩹۠ۡ;)Ll/᩺۠ۡ;

    move-result-object v1

    iget-object v2, p0, Ll/۠۠ۡ;->᩹:Ll/᩺۠ۡ;

    if-eq v1, v2, :cond_0

    return-void

    .line 134
    :cond_0
    invoke-static {v0}, Ll/᩹۠ۡ;->ܳ(Ll/᩹۠ۡ;)V

    .line 135
    invoke-static {v0}, Ll/᩹۠ۡ;->ܽ(Ll/᩹۠ۡ;)Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 136
    invoke-static {v0}, Ll/᩹۠ۡ;->ܿ(Ll/᩹۠ۡ;)Landroid/view/TextureView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 137
    invoke-static {v0}, Ll/᩹۠ۡ;->᩻(Ll/᩹۠ۡ;)V

    return-void
.end method
