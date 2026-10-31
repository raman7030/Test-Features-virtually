.class public final Ll/᩺᩶ᩴ;
.super Ll/ܰ᩶ᩴ;
.source "N673"


# instance fields
.field public final synthetic d:Ll/ۨ᩶ᩴ;


# direct methods
.method public constructor <init>(Ll/ۨ᩶ᩴ;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 804
    iput-object p1, p0, Ll/᩺᩶ᩴ;->d:Ll/ۨ᩶ᩴ;

    return-void
.end method


# virtual methods
.method public final b(Ll/ۖ᩶ᩴ;Ll/ۤۗᩴ;JLl/᩷ۙᩴ;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 808
    iget-object p1, p0, Ll/᩺᩶ᩴ;->d:Ll/ۨ᩶ᩴ;

    invoke-virtual {p1, p3, p4, p5}, Ll/ۨ᩶ᩴ;->a(JLl/᩷ۙᩴ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ll/ۤۗᩴ;JLl/᩷ۙᩴ;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 812
    iget-object p1, p0, Ll/᩺᩶ᩴ;->d:Ll/ۨ᩶ᩴ;

    invoke-virtual {p1, p2, p3, p4}, Ll/ۨ᩶ᩴ;->a(JLl/᩷ۙᩴ;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ll/ۖ᩶ᩴ;Ll/ۤۗᩴ;Ll/᩷ۙᩴ;Ljava/util/Locale;)Ljava/util/Iterator;
    .locals 0

    .line 817
    iget-object p1, p0, Ll/᩺᩶ᩴ;->d:Ll/ۨ᩶ᩴ;

    .line 669
    iget-object p1, p1, Ll/ۨ᩶ᩴ;->b:Ljava/util/Map;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 670
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e(Ll/ۤۗᩴ;Ll/᩷ۙᩴ;Ljava/util/Locale;)Ljava/util/Iterator;
    .locals 0

    .line 822
    iget-object p1, p0, Ll/᩺᩶ᩴ;->d:Ll/ۨ᩶ᩴ;

    .line 669
    iget-object p1, p1, Ll/ۨ᩶ᩴ;->b:Ljava/util/Map;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    .line 670
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
