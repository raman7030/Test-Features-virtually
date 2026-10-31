.class public final Ll/ܽ۬ۘ;
.super Ljava/lang/Object;
.source "C8ZQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ᩳ۬ۘ;


# direct methods
.method public constructor <init>(Ll/ᩳ۬ۘ;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۬ۘ;->᩸:Ll/ᩳ۬ۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 46
    iget-object v0, p0, Ll/ܽ۬ۘ;->᩸:Ll/ᩳ۬ۘ;

    iget-object v0, v0, Ll/ᩳ۬ۘ;->ۧ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
