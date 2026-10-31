.class public final Ll/ۡ᩵ۧ;
.super Ljava/lang/Object;
.source "T8QU"


# static fields
.field public static final ۜ:Ljava/util/regex/Pattern;

.field public static final ܳ:Ll/ۛ۬ܺ;

.field public static final ܿ:Ll/ۛ۬ܺ;

.field public static final ᩳ:Ll/ۛ۬ܺ;

.field public static final ᩻:Ll/ۛ۬ܺ;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-string v0, "\\s+"

    .line 79
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۡ᩵ۧ;->ۜ:Ljava/util/regex/Pattern;

    const-string v0, "auto"

    const-string v1, "none"

    .line 82
    invoke-static {v0, v1}, Ll/ۛ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ۡ᩵ۧ;->᩻:Ll/ۛ۬ܺ;

    const-string v0, "sesame"

    const-string v1, "circle"

    const-string v2, "dot"

    .line 85
    invoke-static {v2, v0, v1}, Ll/ۛ۬ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۛ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ۡ᩵ۧ;->ܿ:Ll/ۛ۬ܺ;

    const-string v0, "filled"

    const-string v1, "open"

    .line 91
    invoke-static {v0, v1}, Ll/ۛ۬ܺ;->of(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ۡ᩵ۧ;->ᩳ:Ll/ۛ۬ܺ;

    const-string v0, "before"

    const-string v1, "outside"

    const-string v2, "after"

    .line 94
    invoke-static {v2, v0, v1}, Ll/ۛ۬ܺ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۛ۬ܺ;

    move-result-object v0

    sput-object v0, Ll/ۡ᩵ۧ;->ܳ:Ll/ۛ۬ܺ;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput p1, p0, Ll/ۡ᩵ۧ;->ۧ:I

    .line 113
    iput p2, p0, Ll/ۡ᩵ۧ;->֫:I

    .line 114
    iput p3, p0, Ll/ۡ᩵ۧ;->ܽ:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۡ᩵ۧ;
    .locals 6

    if-nez p0, :cond_0

    goto :goto_0

    .line 139
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܶ۠ܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 140
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p0, 0x0

    return-object p0

    .line 144
    :cond_1
    sget-object v0, Ll/ۡ᩵ۧ;->ۜ:Ljava/util/regex/Pattern;

    invoke-static {p0, v0}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/util/regex/Pattern;)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۛ۬ܺ;->֫([Ljava/lang/Object;)Ll/ۛ۬ܺ;

    move-result-object p0

    .line 148
    sget-object v0, Ll/ۡ᩵ۧ;->ܳ:Ll/ۛ۬ܺ;

    invoke-static {v0, p0}, Ll/ܶۛܺ;->֫(Ljava/util/Set;Ll/ۛ۬ܺ;)Ll/۠ۛܺ;

    move-result-object v0

    .line 839
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "outside"

    invoke-static {v0, v1}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 153
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x5305c081

    const/4 v4, 0x1

    if-eq v2, v3, :cond_4

    const v3, -0x41ecca5b

    if-eq v2, v3, :cond_3

    const v1, 0x58705dc

    if-eq v2, v1, :cond_2

    goto :goto_1

    :cond_2
    const-string v1, "after"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x2

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, -0x2

    goto :goto_2

    :cond_4
    const-string v1, "before"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_5
    :goto_1
    const/4 v0, 0x1

    .line 168
    :goto_2
    sget-object v1, Ll/ۡ᩵ۧ;->᩻:Ll/ۛ۬ܺ;

    invoke-static {v1, p0}, Ll/ܶۛܺ;->֫(Ljava/util/Set;Ll/ۛ۬ܺ;)Ll/۠ۛܺ;

    move-result-object v1

    .line 169
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    const/4 v3, -0x1

    const/4 v5, 0x0

    if-nez v2, :cond_9

    .line 173
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, 0x2dddaf

    if-eq v1, v2, :cond_7

    const v2, 0x33af38

    if-eq v1, v2, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "none"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_8

    const/4 v3, 0x0

    goto :goto_3

    :cond_7
    const-string v1, "auto"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    :cond_8
    :goto_3
    new-instance p0, Ll/ۡ᩵ۧ;

    invoke-direct {p0, v3, v5, v0}, Ll/ۡ᩵ۧ;-><init>(III)V

    return-object p0

    .line 185
    :cond_9
    sget-object v1, Ll/ۡ᩵ۧ;->ᩳ:Ll/ۛ۬ܺ;

    invoke-static {v1, p0}, Ll/ܶۛܺ;->֫(Ljava/util/Set;Ll/ۛ۬ܺ;)Ll/۠ۛܺ;

    move-result-object v1

    .line 186
    sget-object v2, Ll/ۡ᩵ۧ;->ܿ:Ll/ۛ۬ܺ;

    invoke-static {v2, p0}, Ll/ܶۛܺ;->֫(Ljava/util/Set;Ll/ۛ۬ܺ;)Ll/۠ۛܺ;

    move-result-object p0

    .line 187
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 194
    new-instance p0, Ll/ۡ᩵ۧ;

    invoke-direct {p0, v3, v5, v0}, Ll/ۡ᩵ۧ;-><init>(III)V

    return-object p0

    .line 839
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "filled"

    invoke-static {v1, v2}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 198
    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v5, -0x4bf7529e

    if-eq v3, v5, :cond_c

    const v2, 0x34264a

    if-eq v3, v2, :cond_b

    goto :goto_4

    :cond_b
    const-string v2, "open"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x2

    goto :goto_5

    :cond_c
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :cond_d
    :goto_4
    const/4 v1, 0x1

    .line 839
    :goto_5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-string v2, "circle"

    invoke-static {p0, v2}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    .line 208
    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v5, -0x51134330

    if-eq v3, v5, :cond_10

    const v2, -0x35fdaa48    # -2135406.0f

    if-eq v3, v2, :cond_f

    const v2, 0x18549

    if-eq v3, v2, :cond_e

    goto :goto_6

    :cond_e
    const-string v2, "dot"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_11

    const/4 v4, 0x2

    goto :goto_6

    :cond_f
    const-string v2, "sesame"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_11

    const/4 v4, 0x3

    goto :goto_6

    :cond_10
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    :cond_11
    :goto_6
    new-instance p0, Ll/ۡ᩵ۧ;

    invoke-direct {p0, v4, v1, v0}, Ll/ۡ᩵ۧ;-><init>(III)V

    return-object p0
.end method
