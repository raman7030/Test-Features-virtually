.class public final Ll/۬ۛۘ;
.super Ll/᩺ۛۘ;
.source "X8Y5"


# instance fields
.field public final ֫:Ll/۫ۛۘ;


# direct methods
.method public constructor <init>(Ll/۫ۛۘ;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ll/۟۬ۘ;-><init>()V

    .line 44
    iput-object p1, p0, Ll/۬ۛۘ;->֫:Ll/۫ۛۘ;

    return-void
.end method

.method public static ۧ()Ll/۬ۛۘ;
    .locals 3

    .line 37
    new-instance v0, Ll/۬ۛۘ;

    new-instance v1, Ll/۫ۛۘ;

    invoke-static {}, Ll/ۖ۬ۘ;->֫()Ll/ۖ۬ۘ;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/۫ۛۘ;-><init>(Ll/ۖ۬ۘ;)V

    invoke-direct {v0, v1}, Ll/۬ۛۘ;-><init>(Ll/۫ۛۘ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;Ll/ܶ۬ۘ;)Ljava/lang/Object;
    .locals 3

    .line 54
    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object v0

    const-string v1, "src"

    .line 55
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 56
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->ܿ()Ll/۠᩶ۘ;

    move-result-object v1

    const-class v2, Ll/ۡۚ֡;

    invoke-interface {v1, v2}, Ll/۠᩶ۘ;->֫(Ljava/lang/Class;)Ll/֫ۙۘ;

    move-result-object v1

    if-nez v1, :cond_1

    :goto_0
    const/4 p1, 0x0

    return-object p1

    .line 65
    :cond_1
    invoke-virtual {p1}, Ll/ᩴ᩶ۘ;->ۧ()Ll/ۧ᩺ۘ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    iget-object v2, p0, Ll/۬ۛۘ;->֫:Ll/۫ۛۘ;

    invoke-interface {p3}, Ll/ܶ۬ۘ;->attributes()Ljava/util/Map;

    move-result-object p3

    invoke-virtual {v2, p3}, Ll/۫ۛۘ;->֫(Ljava/util/Map;)Ll/᩹ۨۘ;

    move-result-object p3

    .line 74
    sget-object v2, Ll/ܶۨۘ;->֫:Ll/ۨ᩶ۘ;

    invoke-virtual {v2, p2, v0}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 75
    sget-object v0, Ll/ܶۨۘ;->ۧ:Ll/ۨ᩶ۘ;

    invoke-virtual {v0, p2, p3}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 76
    sget-object p3, Ll/ܶۨۘ;->ܽ:Ll/ۨ᩶ۘ;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p3, p2, v0}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 78
    invoke-interface {v1, p1, p2}, Ll/֫ۙۘ;->֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ljava/util/Collection;
    .locals 1

    const-string v0, "img"

    .line 27
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
