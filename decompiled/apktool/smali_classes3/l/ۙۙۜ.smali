.class public final Ll/ۙۙۜ;
.super Ll/۬ۗܿ;
.source "Q6ZJ"


# instance fields
.field public final ֫֫:Ll/ۗۘ;

.field public ۟:Ll/᩸ۖ;

.field public final ۧ֫:Ll/ۡۙۜ;

.field public final ܽ֫:Ll/ۗۘ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/lang/String;Ll/ܳۙۜ;ZLl/ۡۙۜ;)V
    .locals 4

    const/4 v0, -0x1

    .line 40
    invoke-direct {p0, p1, v0}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 39
    iput-object p5, p0, Ll/ۙۙۜ;->ۧ֫:Ll/ۡۙۜ;

    const p5, 0x7f1209f3

    .line 40
    invoke-virtual {p0, p5}, Ll/۬ۗܿ;->ۡ(I)V

    .line 41
    invoke-virtual {p0}, Ll/۬ۗܿ;->ܺ()V

    const/4 p5, 0x1

    .line 42
    invoke-virtual {p0, p5}, Ll/۬ۗܿ;->ܽ(Z)V

    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Z)V

    .line 44
    invoke-virtual {p0}, Ll/۬ۗܿ;->֨()V

    const/high16 v1, 0x40c00000    # 6.0f

    .line 45
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    invoke-virtual {p0, v1}, Ll/۬ۗܿ;->֫(I)V

    .line 46
    invoke-virtual {p0}, Ll/۬ۗܿ;->ܶ()V

    const/16 v1, 0x8

    .line 47
    invoke-virtual {p0, v1}, Ll/۬ۗܿ;->᩻(I)V

    const v1, 0x7f1209f1

    .line 48
    invoke-virtual {p0, v1}, Ll/۬ۗܿ;->ۢ(I)V

    const-string v1, "Referer: https://example.com/\nCookie: session=value\nX-Custom-Header: value"

    .line 49
    invoke-virtual {p0, v1}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Ll/۬ۗܿ;->֫()V

    .line 51
    invoke-virtual {p3}, Ll/ܳۙۜ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 52
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩸()V

    new-instance v1, Ll/᩶۬ۜ;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/᩶۬ۜ;-><init>(ILjava/lang/Object;)V

    const/4 v2, 0x0

    const v3, 0x7f12017b

    .line 232
    invoke-virtual {p0, v3, v1, v2}, Ll/۬ۗܿ;->֫(ILandroid/view/View$OnClickListener;Ll/᩻۟ܳ;)V

    const v1, 0x7f0d00fb

    .line 59
    invoke-virtual {p1, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v1, 0x7f0a0255

    .line 60
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ll/᩵ۙۜ;

    invoke-direct {v2, p0}, Ll/᩵ۙۜ;-><init>(Ll/ۙۙۜ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a0253

    .line 61
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ll/֡ۙۜ;

    invoke-direct {v2, p0}, Ll/֡ۙۜ;-><init>(Ll/ۙۙۜ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a024b

    .line 62
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ll/۬۬ۜ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0}, Ll/۬۬ۜ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a0250

    .line 63
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Ll/ۚۙۜ;

    invoke-direct {v2, p0}, Ll/ۚۙۜ;-><init>(Ll/ۙۙۜ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a024c

    .line 64
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۗۘ;

    iput-object v1, p0, Ll/ۙۙۜ;->֫֫:Ll/ۗۘ;

    .line 65
    invoke-virtual {p3}, Ll/ܳۙۜ;->֫()Z

    move-result p3

    invoke-virtual {v1, p3}, Ll/ۗۘ;->setChecked(Z)V

    const p3, 0x7f0a0252

    .line 66
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Ll/ۗۘ;

    iput-object p3, p0, Ll/ۙۙۜ;->ܽ֫:Ll/ۗۘ;

    .line 68
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x7d0

    if-gt v1, v2, :cond_0

    .line 69
    invoke-static {p2}, Ll/ۤۙۜ;->ܿ(Ljava/lang/String;)Ll/۫ۙۜ;

    move-result-object p2

    sget-object v1, Ll/۫ۙۜ;->ۙ:Ll/۫ۙۜ;

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 70
    :goto_0
    invoke-virtual {p3, p2}, Landroid/view/View;->setEnabled(Z)V

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    goto :goto_1

    :cond_1
    const/4 p5, 0x0

    .line 71
    :goto_1
    invoke-virtual {p3, p5}, Ll/ۗۘ;->setChecked(Z)V

    .line 72
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 73
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩻()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۙۙۜ;)V
    .locals 1

    const-string v0, ""

    .line 54
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    .line 55
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 56
    invoke-direct {p0, v0, v0}, Ll/ۙۙۜ;->ۧ(II)V

    return-void
.end method

.method public static ֫(Ll/ۙۙۜ;Landroid/view/View;)V
    .locals 5

    .line 108
    iget-object v0, p0, Ll/ۙۙۜ;->۟:Ll/᩸ۖ;

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {v0}, Ll/᩸ۖ;->֫()V

    .line 111
    :cond_0
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p0}, Ll/۬ۗܿ;->ܽ()Ll/ۗܺ᩷;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 112
    iput-object v0, p0, Ll/ۙۙۜ;->۟:Ll/᩸ۖ;

    .line 113
    new-instance p1, Ll/᩹ۙۜ;

    invoke-direct {p1, p0}, Ll/᩹ۙۜ;-><init>(Ll/ۙۙۜ;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    const-string p1, "Accept"

    const-string v1, "Accept-Language"

    const-string v3, "Origin"

    const-string v4, "Authorization"

    .line 97
    filled-new-array {v3, v4, p1, v1}, [Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/4 v1, 0x4

    if-ge v2, v1, :cond_1

    aget-object v1, p1, v2

    .line 98
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    invoke-interface {v3, v1}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ll/֨ۙۜ;

    invoke-direct {v4, p0, v1}, Ll/֨ۙۜ;-><init>(Ll/ۙۙۜ;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۙۙۜ;Ll/᩸ۖ;)V
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۙۙۜ;->۟:Ll/᩸ۖ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 115
    iput-object p1, p0, Ll/ۙۙۜ;->۟:Ll/᩸ۖ;

    :cond_0
    return-void
.end method

.method private ۧ(II)V
    .locals 0

    .line 167
    invoke-virtual {p0, p1, p2}, Ll/۬ۗܿ;->֫(II)V

    .line 168
    invoke-virtual {p0}, Ll/۬ۗܿ;->ᩳ()Ll/֡ۚۢ;

    move-result-object p1

    const p2, 0x7f0a017d

    invoke-virtual {p1, p2}, Ll/֡ۚۢ;->֫(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۤۤᩳ;

    if-eqz p1, :cond_0

    .line 170
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 171
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public static ۧ(Ll/ۙۙۜ;Landroid/view/View;)V
    .locals 3

    .line 108
    iget-object v0, p0, Ll/ۙۙۜ;->۟:Ll/᩸ۖ;

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {v0}, Ll/᩸ۖ;->֫()V

    .line 111
    :cond_0
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p0}, Ll/۬ۗܿ;->ܽ()Ll/ۗܺ᩷;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 112
    iput-object v0, p0, Ll/ۙۙۜ;->۟:Ll/᩸ۖ;

    .line 113
    new-instance p1, Ll/᩹ۙۜ;

    invoke-direct {p1, p0}, Ll/᩹ۙۜ;-><init>(Ll/ۙۙۜ;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/۠ۖ;)V

    .line 79
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f1209fb

    invoke-interface {p1, v1}, Landroid/view/Menu;->add(I)Landroid/view/MenuItem;

    move-result-object p1

    new-instance v1, Ll/۠ۙۜ;

    invoke-direct {v1, p0}, Ll/۠ۙۜ;-><init>(Ll/ۙۙۜ;)V

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 83
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f1209fc

    invoke-interface {p1, v1}, Landroid/view/Menu;->add(I)Landroid/view/MenuItem;

    move-result-object p1

    new-instance v1, Ll/ܶۙۜ;

    invoke-direct {v1, p0}, Ll/ܶۙۜ;-><init>(Ll/ۙۙۜ;)V

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 87
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f12021d

    invoke-interface {p1, v1}, Landroid/view/Menu;->add(I)Landroid/view/MenuItem;

    move-result-object p1

    new-instance v1, Ll/᩸ۙۜ;

    invoke-direct {v1, p0}, Ll/᩸ۙۜ;-><init>(Ll/ۙۙۜ;)V

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 91
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 205
    iget-object p1, p0, Ll/ۙۙۜ;->۟:Ll/᩸ۖ;

    if-eqz p1, :cond_0

    .line 206
    invoke-virtual {p1}, Ll/᩸ۖ;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 123
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 125
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    const/4 v4, 0x1

    if-gt v1, v2, :cond_7

    .line 126
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    if-gez v2, :cond_0

    .line 128
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    :cond_0
    const/16 v5, 0x3a

    .line 130
    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v5

    if-lt v5, v1, :cond_5

    if-ge v5, v2, :cond_5

    .line 132
    invoke-virtual {v0, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    add-int/2addr v5, v4

    :goto_1
    if-ge v5, v2, :cond_2

    .line 134
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x20

    if-eq p1, v1, :cond_1

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x9

    if-ne p1, v1, :cond_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    if-le v2, v5, :cond_3

    add-int/lit8 p1, v2, -0x1

    .line 138
    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v0, 0xd

    if-ne p1, v0, :cond_3

    add-int/lit8 v2, v2, -0x1

    :cond_3
    if-eqz p2, :cond_4

    .line 142
    invoke-virtual {p0}, Ll/۬ۗܿ;->ܳ()Ll/۟᩺ᩳ;

    move-result-object p1

    invoke-interface {p1, v5, v2, p2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 143
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    add-int v2, p1, v5

    .line 145
    :cond_4
    invoke-direct {p0, v5, v2}, Ll/ۙۙۜ;->ۧ(II)V

    return-void

    .line 148
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v2, v1, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    .line 153
    :cond_7
    :goto_2
    invoke-virtual {p0}, Ll/۬ۗܿ;->ܳ()Ll/۟᩺ᩳ;

    move-result-object v1

    .line 154
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    .line 0
    invoke-static {v4, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v0

    if-eq v0, v3, :cond_8

    .line 155
    invoke-interface {v1, v3}, Landroid/text/Editable;->append(C)Landroid/text/Editable;

    .line 157
    :cond_8
    invoke-interface {v1, p1}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-result-object p1

    const-string v0, ": "

    invoke-interface {p1, v0}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 158
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-eqz p2, :cond_9

    .line 160
    invoke-interface {v1, p2}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 162
    :cond_9
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-direct {p0, p1, p2}, Ll/ۙۙۜ;->ۧ(II)V

    return-void
.end method

.method public final ᩴ()V
    .locals 7

    .line 179
    :try_start_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۙۙۜ;->֫֫:Ll/ۗۘ;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    invoke-static {v0, v1}, Ll/ܳۙۜ;->֫(Ljava/lang/String;Z)Ll/ܳۙۜ;

    move-result-object v0

    .line 180
    iget-object v1, p0, Ll/ۙۙۜ;->ۧ֫:Ll/ۡۙۜ;

    iget-object v2, p0, Ll/ۙۙۜ;->ܽ֫:Ll/ۗۘ;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ll/ۡۙۜ;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V
    :try_end_0
    .catch Ll/ᩳۙۜ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 183
    sget-object v1, Ll/᩶ۙۜ;->֫:[I

    invoke-virtual {v0}, Ll/ᩳۙۜ;->ۧ()Ll/ܿۙۜ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_4

    if-eq v1, v2, :cond_3

    const/4 v4, 0x3

    if-eq v1, v4, :cond_2

    const/4 v4, 0x4

    if-eq v1, v4, :cond_1

    const/4 v4, 0x5

    if-ne v1, v4, :cond_0

    const v1, 0x7f1209ed

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IncompatibleClassChangeError;

    invoke-direct {v0}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    throw v0

    :cond_1
    const v1, 0x7f1209e8

    goto :goto_0

    :cond_2
    const v1, 0x7f1209ec

    goto :goto_0

    :cond_3
    const v1, 0x7f1209ea

    goto :goto_0

    :cond_4
    const v1, 0x7f1209eb

    .line 190
    :goto_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ܽ()Ll/ۗܺ᩷;

    move-result-object v4

    .line 191
    invoke-virtual {v0}, Ll/ᩳۙۜ;->֫()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0}, Ll/۬ۗܿ;->ܽ()Ll/ۗܺ᩷;

    move-result-object v6

    invoke-virtual {v6, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v5, v2, v6

    aput-object v1, v2, v3

    const v1, 0x7f1209e9

    .line 190
    invoke-virtual {v4, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    .line 192
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 194
    :goto_1
    invoke-virtual {v0}, Ll/ᩳۙۜ;->֫()I

    move-result v2

    const/16 v4, 0xa

    if-ge v3, v2, :cond_6

    .line 195
    invoke-virtual {v1, v4, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    if-gez v2, :cond_5

    .line 196
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    :goto_2
    move v6, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 198
    :cond_6
    invoke-virtual {v1, v4, v6}, Ljava/lang/String;->indexOf(II)I

    move-result v0

    if-gez v0, :cond_7

    .line 199
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    :cond_7
    invoke-direct {p0, v6, v0}, Ll/ۙۙۜ;->ۧ(II)V

    return-void
.end method
