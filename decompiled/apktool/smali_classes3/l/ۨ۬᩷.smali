.class public final Ll/ۨ۬᩷;
.super Landroid/widget/BaseAdapter;
.source "81ID"


# instance fields
.field public final synthetic ᩶:Ll/ܿۛ᩷;

.field public ᩸:Ljava/text/DateFormat;

.field public final synthetic ᩹:Ll/֫۫᩷;


# direct methods
.method public constructor <init>(Ll/֫۫᩷;Ll/ܿۛ᩷;)V
    .locals 0

    .line 40
    iput-object p1, p0, Ll/ۨ۬᩷;->᩹:Ll/֫۫᩷;

    iput-object p2, p0, Ll/ۨ۬᩷;->᩶:Ll/ܿۛ᩷;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 41
    invoke-static {}, Ljava/text/DateFormat;->getDateTimeInstance()Ljava/text/DateFormat;

    move-result-object p1

    iput-object p1, p0, Ll/ۨ۬᩷;->᩸:Ljava/text/DateFormat;

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۨ۬᩷;->᩹:Ll/֫۫᩷;

    invoke-static {v0}, Ll/֫۫᩷;->᩻(Ll/֫۫᩷;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 61
    iget-object p2, p0, Ll/ۨ۬᩷;->᩶:Ll/ܿۛ᩷;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d0148

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 63
    :cond_0
    move-object p3, p2

    check-cast p3, Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x1

    .line 64
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 65
    iget-object v1, p0, Ll/ۨ۬᩷;->᩹:Ll/֫۫᩷;

    invoke-static {v1}, Ll/֫۫᩷;->᩻(Ll/֫۫᩷;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩹۬᩷;

    .line 66
    iget-object v1, p1, Ll/᩹۬᩷;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    new-instance v0, Ljava/util/Date;

    iget-wide v1, p1, Ll/᩹۬᩷;->ۙ:J

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iget-object p1, p0, Ll/ۨ۬᩷;->᩸:Ljava/text/DateFormat;

    invoke-virtual {p1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
