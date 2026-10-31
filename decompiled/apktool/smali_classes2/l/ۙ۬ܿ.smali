.class public final synthetic Ll/ۙ۬ܿ;
.super Ljava/lang/Object;
.source "55FS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۬۬ܿ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/۬۬ܿ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۬ܿ;->᩸:Ll/۬۬ܿ;

    iput p2, p0, Ll/ۙ۬ܿ;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 149
    iget-object v0, p0, Ll/ۙ۬ܿ;->᩸:Ll/۬۬ܿ;

    iget-object v0, v0, Ll/۬۬ܿ;->ܿ:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 150
    iget v1, p0, Ll/ۙ۬ܿ;->᩹:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method
