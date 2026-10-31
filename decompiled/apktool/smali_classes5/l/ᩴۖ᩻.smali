.class public final Ll/ᩴۖ᩻;
.super Ll/۬ۗܿ;
.source "H88G"


# instance fields
.field public final synthetic ֫֫:Landroid/widget/EditText;

.field public final synthetic ۟:Ll/ۗܺ᩷;

.field public final synthetic ۧ֫:Landroid/widget/EditText;

.field public final synthetic ܽ֫:Landroid/widget/EditText;

.field public final synthetic ܿ֫:Landroid/widget/EditText;

.field public final synthetic ᩳ֫:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ljava/util/regex/Matcher;Ll/ۗܺ᩷;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0

    .line 343
    iput-object p3, p0, Ll/ᩴۖ᩻;->۟:Ll/ۗܺ᩷;

    iput-object p4, p0, Ll/ᩴۖ᩻;->ۧ֫:Landroid/widget/EditText;

    iput-object p5, p0, Ll/ᩴۖ᩻;->֫֫:Landroid/widget/EditText;

    iput-object p6, p0, Ll/ᩴۖ᩻;->ܿ֫:Landroid/widget/EditText;

    iput-object p7, p0, Ll/ᩴۖ᩻;->ܽ֫:Landroid/widget/EditText;

    iput-object p8, p0, Ll/ᩴۖ᩻;->ᩳ֫:Landroid/widget/EditText;

    const/4 p3, -0x1

    .line 40
    invoke-direct {p0, p1, p3}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 345
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    .line 346
    invoke-virtual {p2, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 348
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۜ()Landroid/widget/TextView;

    move-result-object p1

    .line 349
    sget-object p2, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    const/4 p2, 0x0

    const p3, 0x3f8ccccd    # 1.1f

    .line 350
    invoke-virtual {p1, p2, p3}, Landroid/widget/TextView;->setLineSpacing(FF)V

    const/high16 p2, 0x41400000    # 12.0f

    .line 351
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 7

    .line 356
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[a-z0-9]{32}"

    .line 357
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const v0, 0x7f12019f

    .line 358
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 361
    :cond_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    .line 362
    new-instance v3, Ll/ۘۖ᩻;

    invoke-direct {v3, p0, v0}, Ll/ۘۖ᩻;-><init>(Ll/ᩴۖ᩻;Ljava/lang/String;)V

    .line 383
    new-instance v0, Ll/᩻ۖ᩻;

    iget-object v2, p0, Ll/ᩴۖ᩻;->۟:Ll/ۗܺ᩷;

    iget-object v4, p0, Ll/ᩴۖ᩻;->ܿ֫:Landroid/widget/EditText;

    iget-object v5, p0, Ll/ᩴۖ᩻;->ۧ֫:Landroid/widget/EditText;

    iget-object v6, p0, Ll/ᩴۖ᩻;->֫֫:Landroid/widget/EditText;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Ll/᩻ۖ᩻;-><init>(Ll/ۗܺ᩷;Ll/ۢۖ᩻;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 430
    invoke-virtual {v0}, Ll/۟ܶۡ;->᩻()V

    return-void
.end method
