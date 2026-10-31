.class public final Ll/ۨ᩷ܳ;
.super Ll/ܰ᩵ۘ;
.source "123V"


# instance fields
.field public final synthetic ֫:Ll/۟᩷ܳ;


# direct methods
.method public constructor <init>(Ll/۟᩷ܳ;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1835
    iput-object p1, p0, Ll/ۨ᩷ܳ;->֫:Ll/۟᩷ܳ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 1838
    iget-object v0, p0, Ll/ۨ᩷ܳ;->֫:Ll/۟᩷ܳ;

    iget-object v0, v0, Ll/۟᩷ܳ;->ܿ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 1839
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
