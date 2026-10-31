.class public final synthetic Ll/ۡ֡᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ll/ܺ᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/᩵֡᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩵֡᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ֡᩷;->᩸:Ll/᩵֡᩷;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 2
    check-cast p1, Ll/ᩳۜܳ;

    .line 652
    invoke-interface {p1}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_6

    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 655
    :cond_0
    iget-object v0, p0, Ll/ۡ֡᩷;->᩸:Ll/᩵֡᩷;

    invoke-static {v0}, Ll/᩵֡᩷;->ۚ(Ll/᩵֡᩷;)Ljava/util/HashSet;

    move-result-object v2

    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    sget v3, Ll/ۖۢ֡;->֫:I

    const/4 v3, 0x0

    goto :goto_0

    .line 654
    :cond_1
    invoke-static {v3}, Ll/ۖۢ֡;->ۧ(Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    const-string v3, ""

    goto :goto_0

    :cond_2
    add-int/2addr v4, v1

    .line 658
    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    :goto_0
    const-string v4, "getExtension(...)"

    .line 655
    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toLowerCase(...)"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    .line 658
    :cond_3
    invoke-static {v0}, Ll/᩵֡᩷;->֨(Ll/᩵֡᩷;)Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 659
    invoke-interface {p1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v2, v1}, Ll/ۗۙ᩵;->֫(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    .line 0
    :cond_6
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
