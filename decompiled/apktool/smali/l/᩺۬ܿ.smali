.class public final synthetic Ll/᩺۬ܿ;
.super Ljava/lang/Object;
.source "K7A7"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Landroid/widget/EditText;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ljava/lang/Runnable;Landroid/widget/EditText;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺۬ܿ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/᩺۬ܿ;->᩹:Ljava/lang/Runnable;

    iput-object p3, p0, Ll/᩺۬ܿ;->᩶:Landroid/widget/EditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 0
    iget-object p1, p0, Ll/᩺۬ܿ;->᩹:Ljava/lang/Runnable;

    iget-object v0, p0, Ll/᩺۬ܿ;->᩶:Landroid/widget/EditText;

    iget-object v1, p0, Ll/᩺۬ܿ;->᩸:Ll/ۗܺ᩷;

    invoke-static {v1, p1, v0}, Ll/ܰ۬ܿ;->֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;Landroid/widget/EditText;)V

    return-void
.end method
