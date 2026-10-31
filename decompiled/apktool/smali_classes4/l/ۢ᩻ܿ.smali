.class public Ll/ۢ᩻ܿ;
.super Ll/ۗܺ᩷;
.source "89CO"


# static fields
.field public static final synthetic ܳۧ:I


# instance fields
.field public ܿۧ:Ljava/util/ArrayList;

.field public ᩳۧ:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢ᩻ܿ;->ܿۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۢ᩻ܿ;)Ll/֫ۗۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢ᩻ܿ;->ᩳۧ:Ll/֫ۗۧ;

    return-object p0
.end method

.method public static ֫(Ll/ۢ᩻ܿ;Ll/ۤܳܿ;)V
    .locals 6

    .line 68
    invoke-static {}, Ll/ܳᩴܿ;->ᩳ()V

    .line 69
    invoke-static {}, Ll/ܳᩴܿ;->ۧ()Z

    move-result v0

    .line 70
    iget-object v1, p0, Ll/ۢ᩻ܿ;->ܿۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 71
    new-instance v2, Ll/ܿ᩻ܿ;

    const/4 v3, 0x0

    .line 417
    invoke-direct {v2, v3}, Ll/ܰܳܿ;-><init>(I)V

    .line 71
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    new-instance v2, Ll/ۛܳܿ;

    const v4, 0x7f1203f3

    invoke-direct {v2, v3, v4}, Ll/ۛܳܿ;-><init>(II)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    invoke-static {}, Ll/ۙܳܿ;->ۧ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖ᩻ܿ;

    .line 74
    sget-object v4, Ll/ᩴ᩻ܿ;->֫:Ll/ᩴ᩻ܿ;

    if-ne v3, v4, :cond_0

    .line 75
    new-instance v3, Ll/ۛܳܿ;

    const/4 v4, 0x1

    const v5, 0x7f1203f5

    invoke-direct {v3, v4, v5}, Ll/ۛܳܿ;-><init>(II)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 76
    :cond_0
    sget-object v4, Ll/ۡ᩻ܿ;->֫:Ll/ۡ᩻ܿ;

    if-ne v3, v4, :cond_1

    .line 77
    new-instance v3, Ll/ۛܳܿ;

    const/4 v4, 0x2

    const v5, 0x7f1203f4

    invoke-direct {v3, v4, v5}, Ll/ۛܳܿ;-><init>(II)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    .line 79
    invoke-virtual {v3}, Ll/ۖ᩻ܿ;->֫()Ljava/lang/String;

    move-result-object v4

    const-string v5, "builtin:systemTranslate"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 82
    :cond_2
    instance-of v4, v3, Ll/ۘ᩻ܿ;

    if-eqz v4, :cond_3

    move-object v4, v3

    check-cast v4, Ll/ۘ᩻ܿ;

    .line 83
    invoke-virtual {v4}, Ll/ۘ᩻ܿ;->᩻()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    .line 87
    :cond_3
    new-instance v4, Ll/۟ܳܿ;

    invoke-direct {v4, p0, v3}, Ll/۟ܳܿ;-><init>(Ll/ۢ᩻ܿ;Ll/ۖ᩻ܿ;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۢ᩻ܿ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢ᩻ܿ;->ܿۧ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 57
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d004d

    .line 58
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f1203f0

    .line 59
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 60
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 61
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 62
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 63
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/ۧۡۡ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۧۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0486

    .line 64
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    .line 65
    new-instance v0, Ll/ۤܳܿ;

    invoke-direct {v0, p0}, Ll/ۤܳܿ;-><init>(Ll/ۢ᩻ܿ;)V

    .line 66
    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 67
    invoke-static {}, Ll/۬ܿ᩷;->ᩳ()Ll/ۚۡ֫;

    move-result-object v1

    new-instance v2, Ll/ۗܳܿ;

    invoke-direct {v2, p0, v0}, Ll/ۗܳܿ;-><init>(Ll/ۢ᩻ܿ;Ll/ۤܳܿ;)V

    invoke-virtual {v1, p0, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 92
    new-instance v0, Ll/֫ۗۧ;

    new-instance v1, Ll/۫ܳܿ;

    invoke-direct {v1, p0}, Ll/۫ܳܿ;-><init>(Ll/ۢ᩻ܿ;)V

    invoke-direct {v0, v1}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object v0, p0, Ll/ۢ᩻ܿ;->ᩳۧ:Ll/֫ۗۧ;

    .line 164
    invoke-virtual {v0, p1}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "FloatingMenuEditActivity"

    return-object v0
.end method
