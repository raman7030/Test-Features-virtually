.class public final Ll/ܿ֨ܳ;
.super Ljava/lang/Object;
.source "QB4F"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩶:Ll/ᩳ֨ܳ;

.field public final synthetic ᩸:Ll/᩷֨ܳ;

.field public final synthetic ᩹:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ll/᩷֨ܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ᩳ֨ܳ;)V
    .locals 0

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ֨ܳ;->᩸:Ll/᩷֨ܳ;

    iput-object p2, p0, Ll/ܿ֨ܳ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Ll/ܿ֨ܳ;->᩶:Ll/ᩳ֨ܳ;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .line 252
    iget-object p1, p0, Ll/ܿ֨ܳ;->᩸:Ll/᩷֨ܳ;

    invoke-static {p1}, Ll/᩷֨ܳ;->᩵(Ll/᩷֨ܳ;)Landroid/widget/Spinner;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object p2

    invoke-interface {p2}, Landroid/widget/Adapter;->getCount()I

    move-result p2

    const/4 p4, 0x1

    sub-int/2addr p2, p4

    iget-object p5, p0, Ll/ܿ֨ܳ;->᩶:Ll/ᩳ֨ܳ;

    iget-object v0, p0, Ll/ܿ֨ܳ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    if-eq p3, p2, :cond_1

    .line 253
    invoke-virtual {v0, p4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 254
    invoke-static {p1}, Ll/᩷֨ܳ;->ۘ(Ll/᩷֨ܳ;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 255
    invoke-virtual {p5}, Ll/֫᩷ۡ;->notifyDataSetChanged()V

    :cond_0
    return-void

    .line 258
    :cond_1
    invoke-virtual {v0, v1, p4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 259
    invoke-static {p1}, Ll/᩷֨ܳ;->ۘ(Ll/᩷֨ܳ;)Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p2, p4}, Landroid/view/View;->setEnabled(Z)V

    .line 260
    invoke-virtual {p5}, Ll/֫᩷ۡ;->notifyDataSetChanged()V

    .line 262
    :cond_2
    invoke-static {p1}, Ll/᩷֨ܳ;->ۘ(Ll/᩷֨ܳ;)Landroid/widget/EditText;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 1

    .line 268
    iget-object p1, p0, Ll/ܿ֨ܳ;->᩹:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 269
    iget-object p1, p0, Ll/ܿ֨ܳ;->᩶:Ll/ᩳ֨ܳ;

    invoke-virtual {p1}, Ll/֫᩷ۡ;->notifyDataSetChanged()V

    return-void
.end method
