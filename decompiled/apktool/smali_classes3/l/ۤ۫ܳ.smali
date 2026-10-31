.class public final Ll/ۤ۫ܳ;
.super Ljava/lang/Object;
.source "J4L7"


# instance fields
.field public ֫:Landroid/view/View;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:I

.field public final ܽ:Ljava/util/function/Supplier;

.field public ܿ:Landroid/view/View;

.field public ᩳ:Landroid/widget/EditText;

.field public final synthetic ᩻:Ll/ۛ۫ܳ;


# direct methods
.method public constructor <init>(Ll/ۛ۫ܳ;ILjava/lang/String;Ljava/util/function/Supplier;)V
    .locals 0

    .line 416
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ۫ܳ;->᩻:Ll/ۛ۫ܳ;

    .line 417
    iput p2, p0, Ll/ۤ۫ܳ;->ܳ:I

    .line 418
    iput-object p3, p0, Ll/ۤ۫ܳ;->ۧ:Ljava/lang/String;

    .line 419
    iput-object p4, p0, Ll/ۤ۫ܳ;->ܽ:Ljava/util/function/Supplier;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 443
    iget-object v0, p0, Ll/ۤ۫ܳ;->᩻:Ll/ۛ۫ܳ;

    invoke-static {v0}, Ll/ۛ۫ܳ;->᩻(Ll/ۛ۫ܳ;)Ll/۬۫ܳ;

    move-result-object v1

    iget v2, p0, Ll/ۤ۫ܳ;->ܳ:I

    invoke-virtual {v1, v2}, Ll/۬۫ܳ;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 444
    invoke-static {v0}, Ll/ۛ۫ܳ;->᩻(Ll/ۛ۫ܳ;)Ll/۬۫ܳ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/۬۫ܳ;->ܽ(I)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 445
    :goto_0
    iget-object v4, p0, Ll/ۤ۫ܳ;->ܿ:Landroid/view/View;

    if-eqz v2, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    const/16 v5, 0x8

    :goto_1
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 446
    iget-object v4, p0, Ll/ۤ۫ܳ;->ᩳ:Landroid/widget/EditText;

    if-eqz v2, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    const/16 v5, 0x8

    :goto_2
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 447
    iget-object v4, p0, Ll/ۤ۫ܳ;->֫:Landroid/view/View;

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    const/16 v3, 0x8

    :goto_3
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    if-eqz v2, :cond_5

    .line 449
    iget-object v2, p0, Ll/ۤ۫ܳ;->ᩳ:Landroid/widget/EditText;

    invoke-static {v0}, Ll/ۛ۫ܳ;->ۢ(Ll/ۛ۫ܳ;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    return-void
.end method

.method public final ֫(IIILandroid/view/View;)V
    .locals 0

    .line 426
    invoke-virtual {p4, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۤ۫ܳ;->ܿ:Landroid/view/View;

    .line 427
    invoke-virtual {p4, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۤ۫ܳ;->ᩳ:Landroid/widget/EditText;

    .line 428
    invoke-virtual {p4, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۤ۫ܳ;->֫:Landroid/view/View;

    .line 429
    iget-object p1, p0, Ll/ۤ۫ܳ;->ᩳ:Landroid/widget/EditText;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 430
    iget-object p1, p0, Ll/ۤ۫ܳ;->֫:Landroid/view/View;

    new-instance p2, Ll/۫۫ܳ;

    invoke-direct {p2, p0}, Ll/۫۫ܳ;-><init>(Ll/ۤ۫ܳ;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 436
    invoke-virtual {p0}, Ll/ۤ۫ܳ;->֫()V

    return-void
.end method
