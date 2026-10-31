.class public final Ll/ۨܰܳ;
.super Ll/۬ۗܿ;
.source "21XP"


# instance fields
.field public final synthetic ֫֫:Ljava/util/Set;

.field public final synthetic ۟:Ll/ܰܰܳ;

.field public final synthetic ۧ֫:Ll/ۖۢܳ;


# direct methods
.method public constructor <init>(Ll/ܰܰܳ;Lbin/mt/plus/Main;Ljava/util/Set;Ll/ۖۢܳ;)V
    .locals 0

    .line 67
    iput-object p1, p0, Ll/ۨܰܳ;->۟:Ll/ܰܰܳ;

    iput-object p3, p0, Ll/ۨܰܳ;->֫֫:Ljava/util/Set;

    iput-object p4, p0, Ll/ۨܰܳ;->ۧ֫:Ll/ۖۢܳ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 5

    .line 71
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\"

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 76
    :cond_0
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "delete_dex_files_after_merged"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 77
    iget-object v1, p0, Ll/ۨܰܳ;->֫֫:Ljava/util/Set;

    goto :goto_0

    :cond_1
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 78
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Ll/ۨܰܳ;->۟:Ll/ܰܰܳ;

    if-nez v1, :cond_2

    invoke-static {v2, v0}, Ll/ܰܰܳ;->֫(Ll/ܰܰܳ;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const v0, 0x7f1203a1

    .line 79
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 82
    :cond_2
    sget v1, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v1, Ll/֨۠ۢ;

    const-class v3, Ll/᩺ܰܳ;

    invoke-direct {v1, v3}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 83
    iget-object v3, p0, Ll/ۨܰܳ;->ۧ֫:Ll/ۖۢܳ;

    invoke-virtual {v3}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, v4}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    .line 84
    invoke-virtual {v1, v3}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    invoke-static {v2}, Ll/ܰܰܳ;->֫(Ll/ܰܰܳ;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 85
    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    const-string v2, "outputPath"

    invoke-virtual {v1, v2, v0}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    invoke-virtual {v1}, Ll/֨۠ۢ;->֫()I

    .line 87
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :cond_3
    :goto_1
    const v0, 0x7f1203ae

    .line 73
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
