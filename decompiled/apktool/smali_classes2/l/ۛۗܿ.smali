.class public abstract Ll/ۛۗܿ;
.super Ljava/lang/Object;
.source "X81I"


# instance fields
.field public final ֫:Ll/ۤۤᩳ;

.field public final ۧ:Landroid/widget/ImageView;

.field public final ܳ:Ll/ۤۤᩳ;

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;II)V
    .locals 7

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Ll/ۛۗܿ;->ܽ:Z

    const v1, 0x7f0d00bd

    .line 25
    invoke-virtual {p1, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a017d

    .line 26
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۤۤᩳ;

    iput-object v2, p0, Ll/ۛۗܿ;->ܳ:Ll/ۤۤᩳ;

    const v3, 0x7f0a017e

    .line 27
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ۤۤᩳ;

    iput-object v3, p0, Ll/ۛۗܿ;->֫:Ll/ۤۤᩳ;

    const v4, 0x7f0a0287

    .line 28
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Ll/ۛۗܿ;->ۧ:Landroid/widget/ImageView;

    const v5, 0x7f0a0631

    .line 29
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v6, 0x7f120b87

    .line 30
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(I)V

    .line 32
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 33
    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 34
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput p2, p0, Ll/ۛۗܿ;->ܿ:I

    .line 35
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    iput p2, p0, Ll/ۛۗܿ;->ᩳ:I

    .line 37
    new-instance p2, Landroid/text/InputFilter$LengthFilter;

    const/4 p3, 0x6

    invoke-direct {p2, p3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    new-array v5, v0, [Landroid/text/InputFilter;

    const/4 v6, 0x0

    aput-object p2, v5, v6

    invoke-virtual {v2, v5}, Ll/ۤۤᩳ;->֫([Landroid/text/InputFilter;)V

    .line 38
    new-instance p2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {p2, p3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    new-array p3, v0, [Landroid/text/InputFilter;

    aput-object p2, p3, v6

    invoke-virtual {v3, p3}, Ll/ۤۤᩳ;->֫([Landroid/text/InputFilter;)V

    .line 40
    new-instance p2, Ll/۫ۗܿ;

    invoke-direct {p2, p0}, Ll/۫ۗܿ;-><init>(Ll/ۛۗܿ;)V

    invoke-virtual {v2, p2}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    .line 63
    new-instance p2, Ll/ۤۗܿ;

    invoke-direct {p2, p0}, Ll/ۤۗܿ;-><init>(Ll/ۛۗܿ;)V

    invoke-virtual {v3, p2}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    .line 86
    new-instance p2, Ll/ܳۘۡ;

    const/4 p3, 0x2

    invoke-direct {p2, p3, p0}, Ll/ܳۘۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 106
    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 p2, 0x0

    const p3, 0x7f12015e

    const v0, 0x7f12070a

    .line 0
    invoke-static {p1, v0, p2, p3, p2}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object p1

    .line 110
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p2

    new-instance p3, Ll/ܳۚۡ;

    invoke-direct {p3, p0, p1}, Ll/ܳۚۡ;-><init>(Ll/ۛۗܿ;Ll/֡ۚۢ;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛۗܿ;)V
    .locals 3

    .line 87
    iget-object v0, p0, Ll/ۛۗܿ;->ۧ:Landroid/widget/ImageView;

    iget-boolean v1, p0, Ll/ۛۗܿ;->ܽ:Z

    xor-int/lit8 v2, v1, 0x1

    iput-boolean v2, p0, Ll/ۛۗܿ;->ܽ:Z

    if-nez v1, :cond_1

    const v1, 0x7f08021b

    .line 89
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 91
    :try_start_0
    iget-object v0, p0, Ll/ۛۗܿ;->ܳ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 92
    iget-object v1, p0, Ll/ۛۗܿ;->֫:Ll/ۤۤᩳ;

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    if-lez v0, :cond_0

    if-lez v1, :cond_0

    .line 94
    iput v0, p0, Ll/ۛۗܿ;->ܿ:I

    .line 95
    iput v1, p0, Ll/ۛۗܿ;->ᩳ:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void

    :cond_1
    const p0, 0x7f08024f

    .line 101
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛۗܿ;Ll/֡ۚۢ;)V
    .locals 4

    .line 113
    iget-object v0, p0, Ll/ۛۗܿ;->֫:Ll/ۤۤᩳ;

    iget-object v1, p0, Ll/ۛۗܿ;->ܳ:Ll/ۤۤᩳ;

    const v2, 0x7f120b48

    :try_start_0
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 120
    :try_start_1
    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 126
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 127
    invoke-virtual {p0, v1, v0}, Ll/ۛۗܿ;->֫(II)V

    return-void

    .line 122
    :catch_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 123
    invoke-static {v2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto :goto_0

    .line 115
    :catch_1
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 116
    invoke-static {v2}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۛۗܿ;)Ll/ۤۤᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۗܿ;->֫:Ll/ۤۤᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۛۗܿ;)Ll/ۤۤᩳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۗܿ;->ܳ:Ll/ۤۤᩳ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۛۗܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛۗܿ;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۛۗܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛۗܿ;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۛۗܿ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛۗܿ;->ᩳ:I

    return p0
.end method


# virtual methods
.method public abstract ֫(II)V
.end method
