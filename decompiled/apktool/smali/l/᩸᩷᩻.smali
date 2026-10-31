.class public final synthetic Ll/᩸᩷᩻;
.super Ljava/lang/Object;
.source "W79N"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Landroid/widget/ProgressBar;

.field public final synthetic ᩹:Ll/ۛ᩷᩻;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ProgressBar;Ll/ۛ᩷᩻;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩷᩻;->᩸:Landroid/widget/ProgressBar;

    iput-object p2, p0, Ll/᩸᩷᩻;->᩹:Ll/ۛ᩷᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    .line 901
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 903
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/16 v0, 0x8

    :goto_0
    iget-object v1, p0, Ll/᩸᩷᩻;->᩸:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 904
    iget-object v0, p0, Ll/᩸᩷᩻;->᩹:Ll/ۛ᩷᩻;

    invoke-static {v0, p1}, Ll/ۛ᩷᩻;->֫(Ll/ۛ᩷᩻;Ljava/util/List;)V

    .line 905
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
