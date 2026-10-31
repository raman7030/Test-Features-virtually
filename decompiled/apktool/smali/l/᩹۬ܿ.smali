.class public final synthetic Ll/᩹۬ܿ;
.super Ljava/lang/Object;
.source "55FS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۬۬ܿ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/۬۬ܿ;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹۬ܿ;->᩸:Ll/۬۬ܿ;

    iput-object p2, p0, Ll/᩹۬ܿ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩹۬ܿ;->᩹:Ljava/lang/String;

    .line 144
    iget-object v1, p0, Ll/᩹۬ܿ;->᩸:Ll/۬۬ܿ;

    iget-object v1, v1, Ll/۬۬ܿ;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
