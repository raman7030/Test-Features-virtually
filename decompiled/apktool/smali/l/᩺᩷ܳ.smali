.class public final Ll/᩺᩷ܳ;
.super Ll/ܰ᩵ۘ;
.source "123V"


# instance fields
.field public final synthetic ֫:Ll/۟᩷ܳ;

.field public final synthetic ۧ:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/۟᩷ܳ;Landroid/view/View;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1849
    iput-object p1, p0, Ll/᩺᩷ܳ;->֫:Ll/۟᩷ܳ;

    iput-object p2, p0, Ll/᩺᩷ܳ;->ۧ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 1852
    iget-object v0, p0, Ll/᩺᩷ܳ;->֫:Ll/۟᩷ܳ;

    iget-object v0, v0, Ll/۟᩷ܳ;->ܿ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 1853
    iget-object v0, p0, Ll/᩺᩷ܳ;->ۧ:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
