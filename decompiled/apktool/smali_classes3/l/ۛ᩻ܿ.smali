.class public Ll/ۛ᩻ܿ;
.super Ll/ۗܺ᩷;
.source "A7IB"


# static fields
.field public static final synthetic ܳۧ:I


# instance fields
.field public ܿۧ:Ljava/util/ArrayList;

.field public ᩳۧ:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛ᩻ܿ;->ܿۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩻ܿ;)Ll/֫ۗۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩻ܿ;->ᩳۧ:Ll/֫ۗۧ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/ۛ᩻ܿ;Ll/ܶ᩻ܿ;)V
    .locals 5

    .line 60
    iget-object v0, p0, Ll/ۛ᩻ܿ;->ܿۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 61
    new-instance v1, Ll/᩸᩻ܿ;

    const/4 v2, 0x0

    const v3, 0x7f1203f3

    invoke-direct {v1, v2, v3}, Ll/᩸᩻ܿ;-><init>(II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-static {}, Ll/֡᩻ܿ;->ۧ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖ᩻ܿ;

    .line 63
    sget-object v3, Ll/ᩴ᩻ܿ;->֫:Ll/ᩴ᩻ܿ;

    if-ne v2, v3, :cond_0

    .line 64
    new-instance v2, Ll/᩸᩻ܿ;

    const/4 v3, 0x1

    const v4, 0x7f1203f5

    invoke-direct {v2, v3, v4}, Ll/᩸᩻ܿ;-><init>(II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 65
    :cond_0
    sget-object v3, Ll/ۡ᩻ܿ;->֫:Ll/ۡ᩻ܿ;

    if-ne v2, v3, :cond_1

    .line 66
    new-instance v2, Ll/᩸᩻ܿ;

    const/4 v3, 0x2

    const v4, 0x7f1203f4

    invoke-direct {v2, v3, v4}, Ll/᩸᩻ܿ;-><init>(II)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 68
    :cond_1
    instance-of v3, v2, Ll/ۘ᩻ܿ;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Ll/ۘ᩻ܿ;

    .line 69
    invoke-virtual {v3}, Ll/ۘ᩻ܿ;->᩻()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    .line 73
    :cond_2
    new-instance v3, Ll/ۙ᩻ܿ;

    invoke-direct {v3, p0, v2}, Ll/ۙ᩻ܿ;-><init>(Ll/ۛ᩻ܿ;Ll/ۖ᩻ܿ;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {p1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۛ᩻ܿ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩻ܿ;->ܿۧ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 49
    invoke-super {p0, p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0d004d

    .line 50
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f120a87

    .line 51
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    const p1, 0x7f0a063a

    .line 52
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۢᩴ;

    iput-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 53
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->֫(Ll/ۢᩴ;)V

    .line 54
    invoke-virtual {p0}, Ll/ۗܺ᩷;->ۗ()V

    .line 55
    iget-object p1, p0, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    new-instance v0, Ll/᩵֨᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩵֨᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/ۢᩴ;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0486

    .line 56
    invoke-virtual {p0, p1}, Ll/ۗܺ᩷;->ܽ(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/۬۬ۧ;

    .line 57
    new-instance v0, Ll/ܶ᩻ܿ;

    invoke-direct {v0, p0}, Ll/ܶ᩻ܿ;-><init>(Ll/ۛ᩻ܿ;)V

    .line 58
    invoke-virtual {p1, v0}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 59
    invoke-static {}, Ll/۬ܿ᩷;->ᩳ()Ll/ۚۡ֫;

    move-result-object v1

    new-instance v2, Ll/ۚ᩻ܿ;

    invoke-direct {v2, p0, v0}, Ll/ۚ᩻ܿ;-><init>(Ll/ۛ᩻ܿ;Ll/ܶ᩻ܿ;)V

    invoke-virtual {v1, p0, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;Ll/֨ۡ֫;)V

    .line 78
    new-instance v0, Ll/֫ۗۧ;

    new-instance v1, Ll/۠᩻ܿ;

    invoke-direct {v1, p0}, Ll/۠᩻ܿ;-><init>(Ll/ۛ᩻ܿ;)V

    invoke-direct {v0, v1}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    iput-object v0, p0, Ll/ۛ᩻ܿ;->ᩳۧ:Ll/֫ۗۧ;

    .line 133
    invoke-virtual {v0, p1}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "ToolMenuEditActivity"

    return-object v0
.end method
