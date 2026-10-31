.class public final Ll/ۛۤ᩷;
.super Landroid/widget/BaseAdapter;
.source "31K1"


# instance fields
.field public final synthetic ᩸:[Z

.field public final synthetic ᩹:[Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>([Ljava/lang/CharSequence;[Z)V
    .locals 0

    .line 1468
    iput-object p1, p0, Ll/ۛۤ᩷;->᩹:[Ljava/lang/CharSequence;

    iput-object p2, p0, Ll/ۛۤ᩷;->᩸:[Z

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 1471
    iget-object v0, p0, Ll/ۛۤ᩷;->᩹:[Ljava/lang/CharSequence;

    array-length v0, v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 1476
    iget-object v0, p0, Ll/ۛۤ᩷;->᩹:[Ljava/lang/CharSequence;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    .line 1486
    check-cast p2, Landroid/widget/CheckedTextView;

    if-nez p2, :cond_0

    const p2, 0x7f0d0137

    const/4 v0, 0x0

    .line 0
    invoke-static {p3, p2, p3, v0}, Ll/ܰۗ;->֫(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 1489
    check-cast p2, Landroid/widget/CheckedTextView;

    .line 1491
    :cond_0
    iget-object p3, p0, Ll/ۛۤ᩷;->᩹:[Ljava/lang/CharSequence;

    aget-object p3, p3, p1

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1492
    invoke-virtual {p2}, Landroid/widget/CheckedTextView;->isChecked()Z

    move-result p3

    iget-object v0, p0, Ll/ۛۤ᩷;->᩸:[Z

    aget-boolean p1, v0, p1

    if-eq p3, p1, :cond_1

    .line 1493
    invoke-virtual {p2, p1}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    return-object p2

    .line 1496
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->refreshDrawableState()V

    return-object p2
.end method
