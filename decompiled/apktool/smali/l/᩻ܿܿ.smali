.class public final synthetic Ll/᩻ܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/֡ܳܿ;

.field public final synthetic ᩹:Landroid/widget/Spinner;


# direct methods
.method public synthetic constructor <init>(Ll/֡ܳܿ;Landroid/widget/Spinner;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܿܿ;->᩸:Ll/֡ܳܿ;

    iput-object p2, p0, Ll/᩻ܿܿ;->᩹:Landroid/widget/Spinner;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    sget v0, Ll/֡ܳܿ;->֨ۧ:I

    .line 740
    sget-object v0, Ll/ۧܿܿ;->ᩳ:Ll/ۙۡᩴ;

    iget-object v1, p0, Ll/᩻ܿܿ;->᩹:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ll/ۙۡᩴ;->getInt(I)I

    move-result v0

    .line 789
    invoke-static {v0}, Ll/ۧܿܿ;->֫(I)Ll/᩵ᩳܿ;

    move-result-object v0

    check-cast p1, Landroid/widget/Button;

    iget-object v1, p0, Ll/᩻ܿܿ;->᩸:Ll/֡ܳܿ;

    invoke-interface {v0, p1, v1}, Ll/᩵ᩳܿ;->֫(Landroid/widget/Button;Ll/֡ܳܿ;)V

    return-void
.end method
