.class public final Ll/᩹ᩴܿ;
.super Landroid/database/DataSetObserver;
.source "014Z"


# instance fields
.field public final synthetic ֫:Ll/ᩴᩴܿ;

.field public final synthetic ۧ:Landroid/widget/Spinner;

.field public final synthetic ܽ:Landroid/widget/AdapterView$OnItemSelectedListener;


# direct methods
.method public constructor <init>(Landroid/widget/Spinner;Ll/ᩴᩴܿ;Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0

    .line 92
    iput-object p1, p0, Ll/᩹ᩴܿ;->ۧ:Landroid/widget/Spinner;

    iput-object p2, p0, Ll/᩹ᩴܿ;->֫:Ll/ᩴᩴܿ;

    iput-object p3, p0, Ll/᩹ᩴܿ;->ܽ:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 7

    .line 95
    iget-object v0, p0, Ll/᩹ᩴܿ;->ۧ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v4

    .line 96
    iget-object v0, p0, Ll/᩹ᩴܿ;->֫:Ll/ᩴᩴܿ;

    invoke-virtual {v0}, Ll/֫᩷ۡ;->getCount()I

    move-result v0

    if-ge v4, v0, :cond_0

    const-wide/16 v5, 0x0

    .line 97
    iget-object v0, p0, Ll/᩹ᩴܿ;->ܽ:Landroid/widget/AdapterView$OnItemSelectedListener;

    move-object v1, v0

    check-cast v1, Ll/᩸ᩴܿ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v6}, Ll/᩸ᩴܿ;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    :cond_0
    return-void
.end method
