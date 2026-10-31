.class public final synthetic Ll/ۛ᩷ܳ;
.super Ljava/lang/Object;
.source "123V"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Landroid/view/View;

.field public final synthetic ᩸:Ll/۟᩷ܳ;

.field public final synthetic ᩹:Ll/ۡۤۡ;


# direct methods
.method public synthetic constructor <init>(Ll/۟᩷ܳ;Ll/ۡۤۡ;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ᩷ܳ;->᩸:Ll/۟᩷ܳ;

    iput-object p2, p0, Ll/ۛ᩷ܳ;->᩹:Ll/ۡۤۡ;

    iput-object p3, p0, Ll/ۛ᩷ܳ;->᩶:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget-object p1, p0, Ll/ۛ᩷ܳ;->᩸:Ll/۟᩷ܳ;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    iget-object v0, p0, Ll/ۛ᩷ܳ;->᩹:Ll/ۡۤۡ;

    invoke-virtual {v0}, Ll/ۡۤۡ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1863
    iget-object v1, p0, Ll/ۛ᩷ܳ;->᩶:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1864
    iget-object p1, p1, Ll/۟᩷ܳ;->᩻:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ܿ()V

    return-void
.end method
