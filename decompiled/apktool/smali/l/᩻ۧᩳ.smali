.class public final Ll/᩻ۧᩳ;
.super Ljava/lang/Object;
.source "33YQ"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# instance fields
.field public final synthetic ᩸:Ll/ۜۧᩳ;


# direct methods
.method public constructor <init>(Ll/ۜۧᩳ;)V
    .locals 0

    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ۧᩳ;->᩸:Ll/ۜۧᩳ;

    return-void
.end method


# virtual methods
.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 166
    iget-object p2, p0, Ll/᩻ۧᩳ;->᩸:Ll/ۜۧᩳ;

    invoke-static {p2}, Ll/ۜۧᩳ;->ܿ(Ll/ۜۧᩳ;)Landroid/widget/Spinner;

    move-result-object p4

    if-ne p1, p4, :cond_1

    .line 167
    invoke-static {p2}, Ll/ۜۧᩳ;->ۧ(Ll/ۜۧᩳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 169
    :cond_0
    invoke-static {p2}, Ll/ۜۧᩳ;->ܽ(Ll/ۜۧᩳ;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p2, p1}, Ll/ۜۧᩳ;->֫(Ll/ۜۧᩳ;Ljava/lang/String;)V

    .line 170
    invoke-static {p2}, Ll/ۜۧᩳ;->ᩳ(Ll/ۜۧᩳ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/ۜۧᩳ;->֫(Ljava/lang/String;)V

    .line 171
    invoke-static {p2}, Ll/ۜۧᩳ;->֫(Ll/ۜۧᩳ;)Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    move-result-object p1

    iget-boolean p1, p1, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->targetLanguageMutable:Z

    if-eqz p1, :cond_3

    .line 172
    invoke-static {p2}, Ll/ۜۧᩳ;->ۢ(Ll/ۜۧᩳ;)V

    return-void

    .line 173
    :cond_1
    invoke-static {p2}, Ll/ۜۧᩳ;->᩷(Ll/ۜۧᩳ;)Landroid/widget/Spinner;

    move-result-object p4

    if-ne p1, p4, :cond_3

    .line 174
    invoke-static {p2}, Ll/ۜۧᩳ;->ۧ(Ll/ۜۧᩳ;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {p2}, Ll/ۜۧᩳ;->ܳ(Ll/ۜۧᩳ;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    .line 176
    :cond_2
    invoke-static {p2}, Ll/ۜۧᩳ;->᩻(Ll/ۜۧᩳ;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p2, p1}, Ll/ۜۧᩳ;->ۧ(Ll/ۜۧᩳ;Ljava/lang/String;)V

    .line 177
    invoke-static {p2}, Ll/ۜۧᩳ;->ۜ(Ll/ۜۧᩳ;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/ۜۧᩳ;->ۧ(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method
