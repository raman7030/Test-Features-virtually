.class public final Ll/ܿۧ᩻;
.super Ljava/lang/Object;
.source "H8A7"


# static fields
.field public static ֫:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 28
    invoke-static {}, Ll/ܿۧ᩻;->ܿ()V

    return-void
.end method

.method public static ֫()Ljava/lang/String;
    .locals 1

    .line 99
    sget-object v0, Ll/ܿۧ᩻;->֫:Ljava/util/Set;

    invoke-static {v0}, Ll/ܿۧ᩻;->֫(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/util/Set;)Ljava/lang/String;
    .locals 2

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 147
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 148
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 150
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 152
    :cond_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/HashSet;)V
    .locals 4

    .line 123
    invoke-static {p0}, Ll/ܿۧ᩻;->֫(Ljava/util/Set;)Ljava/lang/String;

    move-result-object v0

    .line 124
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v1

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 0
    invoke-static {v3, v2, v0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v2, "mhf"

    .line 124
    invoke-interface {v1, v2, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 126
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 127
    sput-object p0, Ll/ܿۧ᩻;->֫:Ljava/util/Set;

    .line 128
    invoke-static {}, Ll/ܿۧ᩻;->ᩳ()V

    return-void
.end method

.method public static ֫(Ljava/util/List;)V
    .locals 3

    .line 82
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 85
    :cond_0
    invoke-static {}, Ll/ܿۧ᩻;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "smhf"

    const/4 v2, 0x0

    .line 0
    invoke-static {v0, v1, v2}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 88
    :cond_1
    new-instance v0, Ljava/util/HashSet;

    sget-object v1, Ll/ܿۧ᩻;->֫:Ljava/util/Set;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 89
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 90
    invoke-static {v1}, Ll/ܿۧ᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 92
    :cond_2
    invoke-static {v0}, Ll/ܿۧ᩻;->֫(Ljava/util/HashSet;)V

    return-void
.end method

.method public static ֫(Z)V
    .locals 2

    .line 45
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "smhf"

    .line 0
    invoke-static {v0, v1, p0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 46
    invoke-static {}, Ll/ܿۧ᩻;->ᩳ()V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 1

    .line 59
    sget-object v0, Ll/ܿۧ᩻;->֫:Ljava/util/Set;

    invoke-static {p0}, Ll/ܿۧ᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "/sdcard/"

    .line 64
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v1, 0x7

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 75
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 0
    invoke-static {v1, v0, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public static ۧ(Z)V
    .locals 2

    .line 54
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "sshf"

    .line 0
    invoke-static {v0, v1, p0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 55
    invoke-static {}, Ll/ܿۧ᩻;->ᩳ()V

    return-void
.end method

.method public static ۧ()Z
    .locals 3

    .line 41
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "smhf"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ܽ(Ljava/lang/String;)Ljava/util/HashSet;
    .locals 5

    .line 113
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "\n"

    .line 114
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    const-string v4, "/"

    .line 115
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 116
    invoke-static {v3}, Ll/ܿۧ᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ܽ()Z
    .locals 3

    .line 50
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "sshf"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static ܿ()V
    .locals 3

    .line 32
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "mhf"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-static {v0}, Ll/ۢܺ֡;->֫(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 34
    invoke-static {v0}, Ll/ܿۧ᩻;->ܽ(Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object v0

    sput-object v0, Ll/ܿۧ᩻;->֫:Ljava/util/Set;

    return-void

    .line 36
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    sput-object v0, Ll/ܿۧ᩻;->֫:Ljava/util/Set;

    return-void
.end method

.method public static ᩳ()V
    .locals 2

    .line 135
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 136
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void

    .line 138
    :cond_0
    new-instance v0, Ll/ܺ֨ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺ֨ܿ;-><init>(I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ᩳ(Ljava/lang/String;)V
    .locals 0

    .line 106
    invoke-static {p0}, Ll/ܿۧ᩻;->ܽ(Ljava/lang/String;)Ljava/util/HashSet;

    move-result-object p0

    invoke-static {p0}, Ll/ܿۧ᩻;->֫(Ljava/util/HashSet;)V

    return-void
.end method
