.class public final Ll/ۧۧᩳ;
.super Ll/֨ۧᩳ;
.source "P4VC"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# static fields
.field public static ۙ:Ll/ۗ᩵;

.field public static ᩶:Z


# instance fields
.field public final ᩸:Ll/ۙۢ;

.field public final ᩹:Ll/᩶֫ᩳ;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Ll/᩶֫ᩳ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ll/֨ۧᩳ;-><init>()V

    .line 23
    iput-object p2, p0, Ll/ۧۧᩳ;->᩹:Ll/᩶֫ᩳ;

    .line 24
    new-instance p2, Ll/ۙۢ;

    invoke-direct {p2, p1}, Ll/ۙۢ;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/ۧۧᩳ;->᩸:Ll/ۙۢ;

    const p1, 0x7f1208bc

    .line 25
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(I)V

    .line 26
    invoke-virtual {p2, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 76
    sput-boolean p2, Ll/ۧۧᩳ;->᩶:Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p1
.end method

.method public final ֫(Ll/ۧ۟ܽ;)V
    .locals 2

    .line 40
    sget-boolean v0, Ll/ۧۧᩳ;->᩶:Z

    iget-object v1, p0, Ll/ۧۧᩳ;->᩸:Ll/ۙۢ;

    invoke-virtual {v1, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 41
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final ۜ()V
    .locals 4

    .line 46
    iget-object v0, p0, Ll/ۧۧᩳ;->᩹:Ll/᩶֫ᩳ;

    invoke-virtual {v0}, Ll/᩶֫ᩳ;->ܿ()V

    .line 47
    invoke-virtual {v0}, Ll/᩶֫ᩳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 48
    new-instance v1, Ll/ۗ᩵;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ll/ۗ᩵;-><init>(I)V

    sput-object v1, Ll/ۧۧᩳ;->ۙ:Ll/ۗ᩵;

    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ֫ᩳ;

    .line 50
    sget-boolean v2, Ll/ۧۧᩳ;->᩶:Z

    if-eqz v2, :cond_0

    .line 51
    sget-object v2, Ll/ۧۧᩳ;->ۙ:Ll/ۗ᩵;

    iget-object v3, v1, Ll/ۗ֫ᩳ;->֫:Ljava/lang/String;

    iget-object v1, v1, Ll/ۗ֫ᩳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 53
    :cond_0
    sget-object v2, Ll/ۧۧᩳ;->ۙ:Ll/ۗ᩵;

    iget-object v3, v1, Ll/ۗ֫ᩳ;->ۧ:Ljava/lang/String;

    iget-object v1, v1, Ll/ۗ֫ᩳ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۡ()Ll/᩶֫ᩳ;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۧۧᩳ;->᩹:Ll/᩶֫ᩳ;

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 65
    sget-object p2, Ll/ۧۧᩳ;->ۙ:Ll/ۗ᩵;

    const/4 v0, 0x0

    .line 369
    invoke-virtual {p2, p1, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 65
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x0

    .line 70
    sput-object v0, Ll/ۧۧᩳ;->ۙ:Ll/ۗ᩵;

    .line 71
    iget-object v0, p0, Ll/ۧۧᩳ;->᩹:Ll/᩶֫ᩳ;

    .line 97
    invoke-virtual {v0}, Ll/᩶֫ᩳ;->֫()V

    return-void
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 2

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "#"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۧۧᩳ;->᩹:Ll/᩶֫ᩳ;

    invoke-virtual {v1}, Ll/᩶֫ᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
