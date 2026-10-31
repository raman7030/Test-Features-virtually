.class public final Ll/ۘ᩷֫;
.super Ljava/lang/Object;
.source "C5S0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/᩵᩷֫;


# direct methods
.method public constructor <init>(Ll/᩵᩷֫;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩷֫;->᩸:Ll/᩵᩷֫;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ۘ᩷֫;->᩸:Ll/᩵᩷֫;

    iget-object v0, v0, Ll/᩵᩷֫;->᩶:Landroid/widget/ListView;

    invoke-virtual {v0, v0}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    return-void
.end method
