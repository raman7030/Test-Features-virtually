.class public final Ll/᩹֡ܿ;
.super Ljava/lang/Object;
.source "097P"


# static fields
.field public static final synthetic ֫:I

.field public static ۜ:Z

.field public static ۧ:Ll/ۧۤᩴ;

.field public static ܳ:Ll/ܶ᩵ܿ;

.field public static final ܽ:Ljava/security/SecureRandom;

.field public static ܿ:Ll/᩶۫᩷;

.field public static final ᩳ:Ljava/util/regex/Pattern;

.field public static ᩻:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 34
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sput-object v0, Ll/᩹֡ܿ;->ܽ:Ljava/security/SecureRandom;

    const-string v0, "[0-9A-Z]+"

    .line 35
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩹֡ܿ;->ᩳ:Ljava/util/regex/Pattern;

    .line 36
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/᩹֡ܿ;->ۧ:Ll/ۧۤᩴ;

    const/4 v0, 0x1

    .line 37
    sput-boolean v0, Ll/᩹֡ܿ;->ۜ:Z

    .line 38
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩹֡ܿ;->ܿ:Ll/᩶۫᩷;

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/util/Map;
    .locals 1

    .line 0
    sget-object v0, Ll/᩹֡ܿ;->ۧ:Ll/ۧۤᩴ;

    return-object v0
.end method

.method public static ֫(JZLl/ܿۖ᩷;Ll/۠֡ܿ;)Ll/ܶ֡ܿ;
    .locals 6

    .line 164
    invoke-static {p3}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p3

    .line 165
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 166
    new-instance p0, Ll/ܶ֡ܿ;

    invoke-direct {p0, v1, v1, v2}, Ll/ܶ֡ܿ;-><init>(IIZ)V

    return-object p0

    .line 168
    :cond_0
    invoke-static {}, Ll/᩹֡ܿ;->᩻()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v3, Ll/֨֡ܿ;

    invoke-direct {v3, p0, p1}, Ll/֨֡ܿ;-><init>(J)V

    .line 169
    invoke-interface {v0, v3}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p0

    .line 170
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-eqz p2, :cond_3

    .line 215
    invoke-static {}, Ll/᩹֡ܿ;->ܿ()Ll/ܶ᩵ܿ;

    move-result-object p1

    const-string p2, ".i"

    .line 216
    invoke-virtual {p1, p2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p2

    .line 217
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 413
    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object p1

    .line 218
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶ᩵ܿ;

    .line 219
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    .line 220
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Ll/᩹֡ܿ;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    .line 223
    :cond_2
    invoke-virtual {p2, v4}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 224
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 171
    :cond_3
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 172
    :cond_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    add-int/2addr p2, p1

    if-eqz p4, :cond_5

    .line 174
    invoke-interface {p4, p2}, Ll/۠֡ܿ;->֫(I)V

    .line 179
    :cond_5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p1, 0x0

    :cond_6
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸֡ܿ;

    .line 180
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 181
    new-instance p0, Ll/ܶ֡ܿ;

    invoke-direct {p0, p2, p1, v2}, Ll/ܶ֡ܿ;-><init>(IIZ)V

    return-object p0

    :cond_7
    if-eqz p4, :cond_8

    .line 185
    invoke-virtual {v3}, Ll/᩸֡ܿ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p4, v4}, Ll/۠֡ܿ;->֫(Ljava/lang/String;)V

    .line 187
    :cond_8
    invoke-virtual {v3}, Ll/᩸֡ܿ;->delete()Z

    move-result v4

    if-nez v4, :cond_6

    add-int/lit8 p1, p1, 0x1

    .line 189
    invoke-virtual {v3}, Ll/᩸֡ܿ;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-static {v3}, Ll/᩹֡ܿ;->֫(Ljava/util/Set;)V

    goto :goto_1

    .line 192
    :cond_9
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-eqz p0, :cond_a

    .line 193
    new-instance p0, Ll/ܶ֡ܿ;

    invoke-direct {p0, p2, p1, v2}, Ll/ܶ֡ܿ;-><init>(IIZ)V

    return-object p0

    .line 195
    :cond_a
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_b
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 196
    invoke-interface {p3}, Ll/ܿۖ᩷;->᩻()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 197
    new-instance p0, Ll/ܶ֡ܿ;

    invoke-direct {p0, p2, p1, v2}, Ll/ܶ֡ܿ;-><init>(IIZ)V

    return-object p0

    :cond_c
    if-eqz p4, :cond_d

    .line 201
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p4, v3}, Ll/۠֡ܿ;->֫(Ljava/lang/String;)V

    .line 203
    :cond_d
    sget-object v3, Ll/᩹֡ܿ;->ܿ:Ll/᩶۫᩷;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 204
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_b

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 208
    :cond_e
    new-instance p0, Ll/ܶ֡ܿ;

    invoke-direct {p0, p2, p1, v1}, Ll/ܶ֡ܿ;-><init>(IIZ)V

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩸֡ܿ;
    .locals 3

    .line 262
    invoke-static {}, Ll/᩹֡ܿ;->ܿ()Ll/ܶ᩵ܿ;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ".i/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 263
    invoke-static {p0}, Ll/᩸֡ܿ;->֫(Ll/ܶ᩵ܿ;)Ll/᩸֡ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/Set;)V
    .locals 8

    .line 231
    invoke-static {}, Ll/᩹֡ܿ;->ܿ()Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 232
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 233
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, ".i/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 234
    invoke-static {v2}, Ll/᩸֡ܿ;->֫(Ll/ܶ᩵ܿ;)Ll/᩸֡ܿ;

    move-result-object v3

    if-nez v3, :cond_1

    .line 236
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    .line 237
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->۬()Z

    .line 238
    sget-object v2, Ll/᩹֡ܿ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v2, v1}, Ll/ۧۤᩴ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 242
    :cond_1
    invoke-virtual {v3}, Ll/᩸֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-nez v2, :cond_2

    .line 243
    invoke-virtual {v3}, Ll/᩸֡ܿ;->delete()Z

    .line 244
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->۬()Z

    goto :goto_0

    .line 248
    :cond_2
    invoke-virtual {v3}, Ll/᩸֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v2

    new-instance v4, Ll/ۚ֡ܿ;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v4}, Ll/ܶ᩵ܿ;->֫(Ll/ܿۖ᩷;)J

    move-result-wide v4

    .line 249
    invoke-static {v3}, Ll/᩸֡ܿ;->ۧ(Ll/᩸֡ܿ;)J

    move-result-wide v6

    cmp-long v2, v6, v4

    if-eqz v2, :cond_0

    .line 251
    invoke-virtual {v3, v4, v5}, Ll/᩸֡ܿ;->ۧ(J)Ll/᩸֡ܿ;

    move-result-object v2

    .line 252
    sget-object v3, Ll/᩹֡ܿ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v3, v1, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    invoke-virtual {v2}, Ll/᩸֡ܿ;->ۘ()Z

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ۜ()V
    .locals 1

    .line 52
    sget-object v0, Ll/᩹֡ܿ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->clear()V

    return-void
.end method

.method public static bridge synthetic ۧ()Ljava/security/SecureRandom;
    .locals 1

    .line 0
    sget-object v0, Ll/᩹֡ܿ;->ܽ:Ljava/security/SecureRandom;

    return-object v0
.end method

.method public static ܳ()Z
    .locals 3

    .line 56
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    const-string v1, "enable_recycle_bin"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static bridge synthetic ܽ()Ll/᩶۫᩷;
    .locals 1

    .line 0
    sget-object v0, Ll/᩹֡ܿ;->ܿ:Ll/᩶۫᩷;

    return-object v0
.end method

.method public static ܿ()Ll/ܶ᩵ܿ;
    .locals 5

    .line 88
    sget-object v0, Ll/᩹֡ܿ;->ܳ:Ll/ܶ᩵ܿ;

    if-nez v0, :cond_4

    .line 90
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, ".recycle"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-nez v1, :cond_0

    .line 94
    invoke-static {}, Ll/ܽ֡ܿ;->ܽ()Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v2, "recycle"

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 96
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 100
    :cond_0
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->᩶֫()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    .line 102
    sget-object v0, Ll/ܽ֡ܿ;->᩻:Ll/ܶ᩵ܿ;

    const-string v1, ".recycle.bin"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    :cond_2
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, ".i"

    .line 108
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 109
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "i"

    .line 110
    invoke-virtual {v0, v3}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v3

    .line 111
    invoke-virtual {v3}, Ll/ܶ᩵ܿ;->֨֫()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 112
    invoke-virtual {v3, v2}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 117
    :cond_3
    sput-object v0, Ll/᩹֡ܿ;->ܳ:Ll/ܶ᩵ܿ;

    .line 118
    sput-object v1, Ll/᩹֡ܿ;->᩻:Ljava/lang/String;

    .line 120
    :cond_4
    sget-boolean v1, Ll/᩹֡ܿ;->ۜ:Z

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    :try_start_0
    const-string v2, ".nomedia"

    .line 122
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    new-array v3, v1, [B

    .line 787
    invoke-virtual {v2, v3, v1, v1}, Ll/ܶ᩵ܿ;->֫([BII)V

    const-string v2, "README.txt"

    .line 123
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    const-string v3, "This directory stores files in the Recycle Bin. Please do not delete any files manually. If you need to delete files, you can enter the Recycle Bin from the side bar on the main interface and then delete them!\n\n\u6b64\u76ee\u5f55\u4e3a\u56de\u6536\u7ad9\u76ee\u5f55\uff0c\u8bf7\u4e0d\u8981\u624b\u52a8\u5220\u9664\u4efb\u4f55\u6587\u4ef6\uff0c\u5982\u9700\u5220\u9664\u53ef\u4ece\u4e3b\u754c\u9762\u4fa7\u62c9\u680f\u8fdb\u5165\u56de\u6536\u7ad9\u518d\u5220\u9664\uff01\n"

    invoke-virtual {v2, v3}, Ll/ܶ᩵ܿ;->ۡ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :catch_0
    sput-boolean v1, Ll/᩹֡ܿ;->ۜ:Z

    :cond_5
    return-object v0
.end method

.method public static ᩳ()Ljava/lang/String;
    .locals 1

    .line 137
    sget-object v0, Ll/᩹֡ܿ;->᩻:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 138
    invoke-static {}, Ll/᩹֡ܿ;->ܿ()Ll/ܶ᩵ܿ;

    .line 140
    :cond_0
    sget-object v0, Ll/᩹֡ܿ;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public static ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 44
    sput-object v0, Ll/᩹֡ܿ;->ܳ:Ll/ܶ᩵ܿ;

    .line 45
    sput-object v0, Ll/᩹֡ܿ;->᩻:Ljava/lang/String;

    const/4 v0, 0x1

    .line 47
    sput-boolean v0, Ll/᩹֡ܿ;->ۜ:Z

    .line 48
    sget-object v0, Ll/᩹֡ܿ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v0}, Ll/ۧۤᩴ;->clear()V

    return-void
.end method

.method public static ᩻()Ljava/util/List;
    .locals 5

    .line 144
    invoke-static {}, Ll/᩹֡ܿ;->ܿ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v1, ".i"

    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x1

    .line 413
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ۧ(Z)Ljava/util/List;

    move-result-object v0

    .line 144
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ᩴ֡ܿ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ᩴ֡ܿ;-><init>(I)V

    .line 145
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩵֡ܿ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 146
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/֡֡ܿ;

    invoke-direct {v1, v2}, Ll/֡֡ܿ;-><init>(I)V

    .line 147
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 148
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 149
    sget-object v1, Ll/᩹֡ܿ;->ۧ:Ll/ۧۤᩴ;

    invoke-virtual {v1}, Ll/ۧۤᩴ;->size()I

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v1, v2

    const/16 v2, 0x32

    if-le v1, v2, :cond_1

    .line 151
    new-instance v1, Ll/ۧۤᩴ;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ll/ۧۤᩴ;-><init>(I)V

    .line 152
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸֡ܿ;

    .line 153
    invoke-static {v3}, Ll/᩸֡ܿ;->֫(Ll/᩸֡ܿ;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 155
    :cond_0
    sput-object v1, Ll/᩹֡ܿ;->ۧ:Ll/ۧۤᩴ;

    :cond_1
    return-object v0
.end method
