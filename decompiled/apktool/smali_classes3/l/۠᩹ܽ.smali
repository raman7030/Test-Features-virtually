.class public final Ll/۠᩹ܽ;
.super Ll/۬ۗܿ;
.source "P676"


# instance fields
.field public final synthetic ֫֫:Ljava/lang/String;

.field public final synthetic ۟:Ll/᩷᩶ܽ;

.field public final synthetic ۧ֫:Z


# direct methods
.method public constructor <init>(Ll/᩷᩶ܽ;Ll/᩷᩶ܽ;Ljava/lang/String;Z)V
    .locals 0

    .line 1063
    iput-object p1, p0, Ll/۠᩹ܽ;->۟:Ll/᩷᩶ܽ;

    iput-object p3, p0, Ll/۠᩹ܽ;->֫֫:Ljava/lang/String;

    iput-boolean p4, p0, Ll/۠᩹ܽ;->ۧ֫:Z

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 8

    .line 1066
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 1067
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Ll/۠᩹ܽ;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_1

    .line 1071
    :cond_0
    iget-object v4, p0, Ll/۠᩹ܽ;->۟:Ll/᩷᩶ܽ;

    invoke-static {v4}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v5

    iget-object v5, v5, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v5, v5, Ll/᩻᩶ܽ;->᩹:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 1072
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const v1, 0x7f12016e

    .line 1073
    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v7, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    return-void

    .line 1076
    :cond_2
    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    .line 1077
    iget-boolean v2, p0, Ll/۠᩹ܽ;->ۧ֫:Z

    if-eqz v2, :cond_3

    const-string v2, "/"

    .line 1078
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 0
    invoke-static {v1, v2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1081
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v3

    iget-object v3, v3, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v3, v3, Ll/᩻᩶ܽ;->ۗ:Ljava/lang/String;

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1081
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v3

    iget-object v3, v3, Ll/ᩳ᩶ܽ;->۫:Ll/᩻᩶ܽ;

    iget-object v3, v3, Ll/᩻᩶ܽ;->ۗ:Ljava/lang/String;

    .line 0
    invoke-static {v2, v3, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1081
    invoke-static {v4, v1, v0}, Ll/᩷᩶ܽ;->֫(Ll/᩷᩶ܽ;Ljava/lang/String;Ljava/lang/String;)V

    .line 1082
    sput-boolean v7, Ll/᩷᩶ܽ;->ܺۧ:Z

    .line 1083
    invoke-static {v4}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 1084
    invoke-static {v4}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ۤ:Ll/ۗ᩶֡;

    iget-object v0, v0, Ll/ۗ᩶֡;->ܳ:Ll/֡ۙ֡;

    invoke-virtual {v0}, Ll/ۤۙ֡;->֫()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ᩸֡;

    .line 1085
    invoke-virtual {v1}, Ll/ۧ᩸֡;->᩷()Ll/᩺ۙ֡;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v2

    .line 0
    invoke-static {v7, v7, v2}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1087
    invoke-static {v4}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v3

    iget-object v3, v3, Ll/ᩳ᩶ܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1089
    :cond_4
    invoke-static {v4}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v0

    iget-object v0, v0, Ll/ᩳ᩶ܽ;->ܺ֫:Ll/ܳ᩶ܽ;

    invoke-static {v4}, Ll/᩷᩶ܽ;->ܳ(Ll/᩷᩶ܽ;)Ll/ᩳ᩶ܽ;

    move-result-object v1

    iget-object v1, v1, Ll/ᩳ᩶ܽ;->ۗ:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳ᩶ܽ;->֫(Ljava/util/Set;)V

    .line 1090
    invoke-static {v4}, Ll/᩷᩶ܽ;->ۡ(Ll/᩷᩶ܽ;)V

    .line 1091
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 1068
    :cond_5
    :goto_1
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
