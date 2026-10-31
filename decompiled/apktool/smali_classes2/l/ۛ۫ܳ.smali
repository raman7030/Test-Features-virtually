.class public final Ll/ۛ۫ܳ;
.super Ljava/lang/Object;
.source "J4L7"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field public static final ۛ:[I

.field public static final ۨ:[I


# instance fields
.field public final ۗ:Ll/ᩳۜܳ;

.field public final ۙ:Ll/۬۫ܳ;

.field public final ۤ:Ll/ܽۢܳ;

.field public ۫:Z

.field public final ۬:[Ll/ۤ۫ܳ;

.field public ᩶:Landroid/widget/EditText;

.field public final ᩸:Lbin/mt/plus/Main;

.field public ᩹:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x10

    const/4 v1, 0x2

    const/4 v2, 0x4

    const/16 v3, 0x8

    .line 50
    filled-new-array {v1, v2, v3, v0}, [I

    move-result-object v0

    sput-object v0, Ll/ۛ۫ܳ;->ۨ:[I

    const/16 v0, 0x28

    const/16 v1, 0x40

    const/16 v2, 0x20

    .line 56
    filled-new-array {v2, v0, v1, v3}, [I

    move-result-object v0

    sput-object v0, Ll/ۛ۫ܳ;->ۛ:[I

    return-void
.end method

.method public constructor <init>(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 10

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ll/ۤ۫ܳ;

    new-instance v1, Ll/֨۫ܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    const-string v3, "MD5"

    invoke-direct {v0, p0, v2, v3, v1}, Ll/ۤ۫ܳ;-><init>(Ll/ۛ۫ܳ;ILjava/lang/String;Ljava/util/function/Supplier;)V

    new-instance v1, Ll/ۤ۫ܳ;

    new-instance v3, Ll/۠۫ܳ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x1

    const-string v5, "SHA1"

    invoke-direct {v1, p0, v4, v5, v3}, Ll/ۤ۫ܳ;-><init>(Ll/ۛ۫ܳ;ILjava/lang/String;Ljava/util/function/Supplier;)V

    new-instance v3, Ll/ۤ۫ܳ;

    new-instance v5, Ll/ܶ۫ܳ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    const/4 v6, 0x2

    const-string v7, "SHA256"

    invoke-direct {v3, p0, v6, v7, v5}, Ll/ۤ۫ܳ;-><init>(Ll/ۛ۫ܳ;ILjava/lang/String;Ljava/util/function/Supplier;)V

    new-instance v5, Ll/ۤ۫ܳ;

    new-instance v7, Ll/᩸۫ܳ;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x3

    const-string v9, "CRC32"

    invoke-direct {v5, p0, v8, v9, v7}, Ll/ۤ۫ܳ;-><init>(Ll/ۛ۫ܳ;ILjava/lang/String;Ljava/util/function/Supplier;)V

    const/4 v7, 0x4

    new-array v7, v7, [Ll/ۤ۫ܳ;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    iput-object v7, p0, Ll/ۛ۫ܳ;->۬:[Ll/ۤ۫ܳ;

    .line 117
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ۫ܳ;->᩸:Lbin/mt/plus/Main;

    .line 118
    iput-object p1, p0, Ll/ۛ۫ܳ;->ۤ:Ll/ܽۢܳ;

    .line 119
    iput-object p2, p0, Ll/ۛ۫ܳ;->ۗ:Ll/ᩳۜܳ;

    .line 120
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string p2, "fsuc"

    invoke-interface {p1, p2, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Ll/ۛ۫ܳ;->۫:Z

    .line 121
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string p2, "fsf"

    invoke-interface {p1, p2, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 122
    new-instance p2, Ll/۬۫ܳ;

    invoke-direct {p2, p1}, Ll/۬۫ܳ;-><init>(I)V

    iput-object p2, p0, Ll/ۛ۫ܳ;->ۙ:Ll/۬۫ܳ;

    .line 123
    new-instance p1, Ll/᩹۫ܳ;

    invoke-direct {p1, v2, p0}, Ll/᩹۫ܳ;-><init>(ILjava/lang/Object;)V

    .line 130
    invoke-virtual {p2}, Ll/۬۫ܳ;->֫()[I

    move-result-object p2

    .line 131
    array-length v0, p2

    if-nez v0, :cond_0

    .line 132
    invoke-virtual {p1}, Ll/᩹۫ܳ;->run()V

    return-void

    .line 135
    :cond_0
    new-instance v0, Ll/ۗ۫ܳ;

    invoke-direct {v0, p0, p2, p1}, Ll/ۗ۫ܳ;-><init>(Ll/ۛ۫ܳ;[ILjava/lang/Runnable;)V

    .line 208
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static synthetic ֫(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 2

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Ll/ۚ۫ۡ;->֫(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ll/ۗܺ᩷;

    .line 78
    new-instance v0, Ll/᩵᩷ᩳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1, p2}, Ll/᩵᩷ᩳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Ll/ۛ۫ܳ;->֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;)V
    .locals 7

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const-string v3, "MD5"

    aput-object v3, v1, v2

    const/4 v3, 0x1

    const-string v4, "SHA1"

    aput-object v4, v1, v3

    const-string v4, "SHA256"

    const/4 v5, 0x2

    aput-object v4, v1, v5

    const-string v4, "CRC32"

    const/4 v5, 0x3

    aput-object v4, v1, v5

    .line 93
    sget-object v4, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "fsf"

    invoke-interface {v4, v5, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v2

    new-array v4, v0, [Z

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_1

    .line 306
    sget-object v6, Ll/ۛ۫ܳ;->ۨ:[I

    aget v6, v6, v5

    and-int/2addr v6, v2

    if-nez v6, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    aput-boolean v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 95
    :cond_1
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    const v0, 0x7f12016c

    .line 96
    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v0, Ll/᩶۫ܳ;

    invoke-direct {v0, v4}, Ll/᩶۫ܳ;-><init>([Z)V

    .line 97
    invoke-virtual {p0, v1, v4, v0}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    const/4 v0, 0x0

    const v1, 0x7f12015e

    const v2, 0x7f12070a

    .line 0
    invoke-static {p0, v2, v0, v1, v0}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/᩶ܶܽ;

    invoke-direct {v1, v4, p0, p1, v3}, Ll/᩶ܶܽ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Ll/ۛ۫ܳ;)V
    .locals 8

    .line 215
    iget-object v0, p0, Ll/ۛ۫ܳ;->᩸:Lbin/mt/plus/Main;

    const v1, 0x7f0d00b5

    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a03d6

    .line 216
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    .line 217
    iget-object v3, p0, Ll/ۛ۫ܳ;->ۗ:Ll/ᩳۜܳ;

    invoke-interface {v3}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v3, 0x0

    .line 218
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 220
    iget-object v2, p0, Ll/ۛ۫ܳ;->۬:[Ll/ۤ۫ܳ;

    const/4 v4, 0x0

    aget-object v4, v2, v4

    const v5, 0x7f0a031e

    const v6, 0x7f0a031c

    const v7, 0x7f0a031d

    invoke-virtual {v4, v7, v5, v6, v1}, Ll/ۤ۫ܳ;->֫(IIILandroid/view/View;)V

    const/4 v4, 0x1

    .line 221
    aget-object v4, v2, v4

    const v5, 0x7f0a0512

    const v6, 0x7f0a0510

    const v7, 0x7f0a0511

    invoke-virtual {v4, v7, v5, v6, v1}, Ll/ۤ۫ܳ;->֫(IIILandroid/view/View;)V

    const/4 v4, 0x2

    .line 222
    aget-object v4, v2, v4

    const v5, 0x7f0a0515

    const v6, 0x7f0a0513

    const v7, 0x7f0a0514

    invoke-virtual {v4, v7, v5, v6, v1}, Ll/ۤ۫ܳ;->֫(IIILandroid/view/View;)V

    const/4 v4, 0x3

    .line 223
    aget-object v2, v2, v4

    const v4, 0x7f0a011e

    const v5, 0x7f0a011c

    const v6, 0x7f0a011d

    invoke-virtual {v2, v6, v4, v5, v1}, Ll/ۤ۫ܳ;->֫(IIILandroid/view/View;)V

    const v2, 0x7f0a0181

    .line 225
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, p0, Ll/ۛ۫ܳ;->᩶:Landroid/widget/EditText;

    const v2, 0x7f0a05e4

    .line 226
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    .line 227
    iget-object v2, p0, Ll/ۛ۫ܳ;->᩶:Landroid/widget/EditText;

    invoke-virtual {v2, p0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    const v2, 0x7f0a050b

    .line 228
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v4, Ll/ۘ۫ܳ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Ll/ۘ۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0a00a2

    .line 230
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    new-instance v4, Ll/ᩴ۫ܳ;

    invoke-direct {v4, v5, p0}, Ll/ᩴ۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v2

    invoke-virtual {v2, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v1, 0x7f120189

    .line 250
    invoke-virtual {v2, v1, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12099e

    .line 251
    invoke-virtual {v2, v1, v3}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 252
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v2

    .line 253
    invoke-virtual {v2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v2

    .line 254
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    .line 255
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    const v4, 0x7f0d01cf

    .line 256
    invoke-virtual {v0, v4}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 257
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 258
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 259
    invoke-virtual {v3, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 260
    iget-boolean v1, p0, Ll/ۛ۫ܳ;->۫:Z

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 261
    new-instance v1, Ll/᩵۫ܳ;

    invoke-direct {v1, p0}, Ll/᩵۫ܳ;-><init>(Ll/ۛ۫ܳ;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public static ֫(Ll/ۛ۫ܳ;Z)V
    .locals 5

    .line 262
    iput-boolean p1, p0, Ll/ۛ۫ܳ;->۫:Z

    .line 263
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "fsuc"

    .line 0
    invoke-static {v0, v1, p1}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 463
    iget-object p1, p0, Ll/ۛ۫ܳ;->۬:[Ll/ۤ۫ܳ;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    .line 464
    iget-object v3, p0, Ll/ۛ۫ܳ;->ۙ:Ll/۬۫ܳ;

    iget v4, v2, Ll/ۤ۫ܳ;->ܳ:I

    invoke-virtual {v3, v4}, Ll/۬۫ܳ;->ܽ(I)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 465
    iget-object v2, v2, Ll/ۤ۫ܳ;->ᩳ:Landroid/widget/EditText;

    .line 466
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 467
    iget-boolean v4, p0, Ll/ۛ۫ܳ;->۫:Z

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 470
    :cond_2
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩶:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 471
    iget-object v0, p0, Ll/ۛ۫ܳ;->᩶:Landroid/widget/EditText;

    iget-boolean p0, p0, Ll/ۛ۫ܳ;->۫:Z

    if-eqz p0, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    :goto_2
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 1

    .line 75
    new-instance v0, Ll/ۛ۫ܳ;

    invoke-direct {v0, p0, p1}, Ll/ۛ۫ܳ;-><init>(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void
.end method

.method public static ֫([ZLl/֡ۚۢ;Ljava/lang/Runnable;)V
    .locals 4

    const/4 v0, 0x0

    .line 102
    aget-boolean v1, p0, v0

    const/4 v2, 0x1

    if-nez v1, :cond_0

    aget-boolean v1, p0, v2

    if-nez v1, :cond_0

    const/4 v1, 0x2

    aget-boolean v1, p0, v1

    if-nez v1, :cond_0

    const/4 v1, 0x3

    aget-boolean v1, p0, v1

    if-nez v1, :cond_0

    const p0, 0x7f120926

    .line 103
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 315
    :cond_0
    array-length v1, p0

    const/4 v3, 0x4

    if-ne v1, v3, :cond_3

    :goto_0
    if-ge v0, v3, :cond_2

    .line 318
    aget-boolean v1, p0, v0

    if-nez v1, :cond_1

    .line 319
    sget-object v1, Ll/ۛ۫ܳ;->ۨ:[I

    aget v1, v1, v0

    or-int/2addr v1, v2

    move v2, v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 107
    :cond_2
    sget-object p0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p0

    const-string v0, "fsf"

    invoke-interface {p0, v2, v0}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p0

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    .line 108
    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 109
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void

    .line 390
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unexpected checksum item count"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ֫()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ۛ۫ܳ;->ۛ:[I

    return-object v0
.end method

.method public static bridge synthetic ۜ(Ll/ۛ۫ܳ;)Ll/ᩳۜܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۫ܳ;->ۗ:Ll/ᩳۜܳ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ۛ۫ܳ;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۫ܳ;->ۤ:Ll/ܽۢܳ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۛ۫ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ۫ܳ;->۫:Z

    return p0
.end method

.method public static ۧ(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 2

    .line 75
    new-instance v0, Ll/ۖ۫ܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p2}, Ll/ۖ۫ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    new-instance v0, Ll/ۚ۫ܳ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۚ۫ܳ;-><init>(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ۛ۫ܳ;)V
    .locals 4

    .line 279
    iget-object v0, p0, Ll/ۛ۫ܳ;->۬:[Ll/ۤ۫ܳ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 280
    invoke-virtual {v3}, Ll/ۤ۫ܳ;->֫()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Ll/ۛ۫ܳ;->᩶:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۛ۫ܳ;->afterTextChanged(Landroid/text/Editable;)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 1

    .line 78
    new-instance v0, Ll/ۛ۫ܳ;

    invoke-direct {v0, p0, p1}, Ll/ۛ۫ܳ;-><init>(Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void
.end method

.method public static bridge synthetic ۧ()[I
    .locals 1

    .line 0
    sget-object v0, Ll/ۛ۫ܳ;->ۨ:[I

    return-object v0
.end method

.method public static bridge synthetic ܳ(Ll/ۛ۫ܳ;)Lbin/mt/plus/Main;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۫ܳ;->᩸:Lbin/mt/plus/Main;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ۛ۫ܳ;)V
    .locals 3

    .line 229
    iget-object v0, p0, Ll/ۛ۫ܳ;->᩸:Lbin/mt/plus/Main;

    new-instance v1, Ll/֡۫ܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/֡۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۛ۫ܳ;->֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ܿ(Ll/ۛ۫ܳ;)V
    .locals 9

    .line 231
    invoke-static {}, Ll/ۙ᩸᩷;->ܳ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "[\\s:]"

    const-string v2, ""

    .line 233
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v7, "md5sum"

    const-string v8, "crc32sum"

    const-string v1, "sha256"

    const-string v2, "sha1"

    const-string v3, "md5"

    const-string v4, "crc32"

    const-string v5, "sha256sum"

    const-string v6, "sha1sum"

    .line 234
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3a

    .line 236
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-eq v2, v3, :cond_1

    .line 237
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    const/16 v5, 0x8

    if-ge v3, v5, :cond_1

    .line 238
    aget-object v5, v1, v3

    .line 239
    invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 240
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 245
    :cond_1
    :goto_1
    iget-object v1, p0, Ll/ۛ۫ܳ;->᩶:Landroid/widget/EditText;

    iget-boolean v2, p0, Ll/ۛ۫ܳ;->۫:Z

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    iget-object p0, p0, Ll/ۛ۫ܳ;->᩶:Landroid/widget/EditText;

    invoke-virtual {p0, v4}, Landroid/widget/EditText;->setSelection(I)V

    :cond_3
    return-void
.end method

.method public static ᩳ(Ll/ۛ۫ܳ;)V
    .locals 5

    .line 272
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "fsf"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 273
    iget-object v1, p0, Ll/ۛ۫ܳ;->ۙ:Ll/۬۫ܳ;

    invoke-virtual {v1, v0}, Ll/۬۫ܳ;->֫(I)V

    .line 274
    iget-object v0, p0, Ll/ۛ۫ܳ;->۬:[Ll/ۤ۫ܳ;

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_0

    aget-object v4, v0, v2

    .line 275
    invoke-virtual {v4}, Ll/ۤ۫ܳ;->֫()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 277
    :cond_0
    iget-object v0, p0, Ll/ۛ۫ܳ;->᩶:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۛ۫ܳ;->afterTextChanged(Landroid/text/Editable;)V

    .line 278
    new-instance v0, Ll/۠ܽܽ;

    const/4 v2, 0x3

    invoke-direct {v0, v2, p0}, Ll/۠ܽܽ;-><init>(ILjava/lang/Object;)V

    .line 130
    invoke-virtual {v1}, Ll/۬۫ܳ;->֫()[I

    move-result-object v1

    .line 131
    array-length v2, v1

    if-nez v2, :cond_1

    .line 132
    invoke-virtual {v0}, Ll/۠ܽܽ;->run()V

    return-void

    .line 135
    :cond_1
    new-instance v2, Ll/ۗ۫ܳ;

    invoke-direct {v2, p0, v1, v0}, Ll/ۗ۫ܳ;-><init>(Ll/ۛ۫ܳ;[ILjava/lang/Runnable;)V

    .line 208
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۛ۫ܳ;)[Ll/ۤ۫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۫ܳ;->۬:[Ll/ۤ۫ܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۛ۫ܳ;)Ll/۬۫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۫ܳ;->ۙ:Ll/۬۫ܳ;

    return-object p0
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 10

    .line 487
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 488
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 489
    iget-object v0, p0, Ll/ۛ۫ܳ;->۬:[Ll/ۤ۫ܳ;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    sget-object v4, Ll/ۛ۫ܳ;->ۛ:[I

    iget-object v5, p0, Ll/ۛ۫ܳ;->ۙ:Ll/۬۫ܳ;

    if-ge v3, v1, :cond_4

    aget-object v6, v0, v3

    .line 490
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v7

    iget v8, v6, Ll/ۤ۫ܳ;->ܳ:I

    iget-object v9, v6, Ll/ۤ۫ܳ;->ۧ:Ljava/lang/String;

    aget v4, v4, v8

    if-eq v7, v4, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 493
    :cond_0
    invoke-virtual {v5, v8}, Ll/۬۫ܳ;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    .line 494
    iget v1, v6, Ll/ۤ۫ܳ;->ܳ:I

    invoke-virtual {v5, v1}, Ll/۬۫ܳ;->ܽ(I)Z

    move-result v1

    if-eqz v1, :cond_3

    if-nez v0, :cond_1

    goto :goto_1

    .line 499
    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 500
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    const-string v0, " \u221a"

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    sget v0, Ll/᩹֡᩷;->ܿ֫:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 503
    :cond_2
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    const-string v0, " \u00d7"

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 504
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 495
    :cond_3
    :goto_1
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    const-string v0, " ?"

    invoke-virtual {v9, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 496
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 508
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x8

    if-le v1, v3, :cond_7

    .line 509
    array-length v1, v0

    :goto_2
    if-ge v2, v1, :cond_7

    aget-object v3, v0, v2

    .line 510
    iget v6, v3, Ll/ۤ۫ܳ;->ܳ:I

    invoke-virtual {v5, v6}, Ll/۬۫ܳ;->ۧ(I)Ljava/lang/String;

    move-result-object v7

    .line 511
    invoke-virtual {v5, v6}, Ll/۬۫ܳ;->ܽ(I)Z

    move-result v8

    if-eqz v8, :cond_6

    if-eqz v7, :cond_6

    .line 512
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    aget v6, v4, v6

    if-lt v8, v6, :cond_5

    goto :goto_3

    .line 515
    :cond_5
    invoke-static {p1, v7}, Ll/ۢܺ֡;->ۧ(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 516
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    iget-object v0, v3, Ll/ۤ۫ܳ;->ۧ:Ljava/lang/String;

    const-string v1, " \u2248"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 517
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    sget v0, Ll/᩹֡᩷;->ܿ֫:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_6
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 522
    :cond_7
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    const-string v0, "?"

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 523
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    sget v0, Ll/᩹֡᩷;->֫:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 525
    :cond_8
    iget-object p1, p0, Ll/ۛ۫ܳ;->᩹:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
