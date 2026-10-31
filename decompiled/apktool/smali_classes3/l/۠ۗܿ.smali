.class public final synthetic Ll/۠ۗܿ;
.super Ljava/lang/Object;
.source "0AIV"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩹ۗܿ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۗܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۗܿ;->᩸:Ll/᩹ۗܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 147
    iget-object v0, p0, Ll/۠ۗܿ;->᩸:Ll/᩹ۗܿ;

    iget-object v1, v0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 148
    iget-object v0, v0, Ll/᩺ۤܿ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
