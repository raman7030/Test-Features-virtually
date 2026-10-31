.class public Ll/ᩳܶۧ;
.super Ll/᩵ܶۧ;
.source "I69B"


# instance fields
.field public final ܳۧ:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public final ܿۧ:Landroid/widget/ArrayAdapter;

.field public ᩻ۧ:Landroid/widget/Spinner;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0401b3

    .line 63
    invoke-direct {p0, p1, p2, v0}, Ll/ᩳܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const/4 v0, 0x0

    .line 73
    invoke-direct {p0, p1, p2, p3, v0}, Ll/᩵ܶۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 41
    new-instance p2, Ll/ܽܶۧ;

    invoke-direct {p2, p0}, Ll/ܽܶۧ;-><init>(Ll/ᩳܶۧ;)V

    iput-object p2, p0, Ll/ᩳܶۧ;->ܳۧ:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 102
    new-instance p2, Landroid/widget/ArrayAdapter;

    const p3, 0x1090009

    invoke-direct {p2, p1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 75
    iput-object p2, p0, Ll/ᩳܶۧ;->ܿۧ:Landroid/widget/ArrayAdapter;

    .line 107
    invoke-virtual {p2}, Landroid/widget/ArrayAdapter;->clear()V

    .line 108
    invoke-virtual {p0}, Ll/᩵ܶۧ;->ᩴ֫()[Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 109
    invoke-virtual {p0}, Ll/᩵ܶۧ;->ᩴ֫()[Ljava/lang/CharSequence;

    move-result-object p1

    array-length p3, p1

    :goto_0
    if-ge v0, p3, :cond_0

    aget-object v1, p1, v0

    .line 110
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/ArrayAdapter;->add(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩷᩹ۧ;)V
    .locals 5

    .line 132
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const v1, 0x7f0a0551

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Ll/ᩳܶۧ;->᩻ۧ:Landroid/widget/Spinner;

    .line 133
    iget-object v1, p0, Ll/ᩳܶۧ;->ܿۧ:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 134
    iget-object v0, p0, Ll/ᩳܶۧ;->᩻ۧ:Landroid/widget/Spinner;

    iget-object v1, p0, Ll/ᩳܶۧ;->ܳۧ:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 135
    iget-object v0, p0, Ll/ᩳܶۧ;->᩻ۧ:Landroid/widget/Spinner;

    invoke-virtual {p0}, Ll/᩵ܶۧ;->getValue()Ljava/lang/String;

    move-result-object v1

    .line 140
    invoke-virtual {p0}, Ll/᩵ܶۧ;->֡֫()[Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    .line 142
    array-length v3, v2

    :cond_0
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_1

    .line 143
    aget-object v4, v2, v3

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    .line 135
    :goto_0
    invoke-virtual {v0, v3}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 136
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/᩷᩹ۧ;)V

    return-void
.end method

.method public final ۛ()V
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ᩳܶۧ;->᩻ۧ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->performClick()Z

    return-void
.end method

.method public final ۬()V
    .locals 1

    .line 122
    invoke-super {p0}, Ll/֫᩸ۧ;->۬()V

    .line 125
    iget-object v0, p0, Ll/ᩳܶۧ;->ܿۧ:Landroid/widget/ArrayAdapter;

    if-eqz v0, :cond_0

    .line 126
    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method
