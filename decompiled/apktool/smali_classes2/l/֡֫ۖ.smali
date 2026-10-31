.class public final Ll/֡֫ۖ;
.super Ljava/lang/Object;
.source "C7NK"

# interfaces
.implements Ll/ۧ۟ܺ;


# static fields
.field public static final ᩳ:Ljava/util/regex/Pattern;


# instance fields
.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ll/۠֫ۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^(//+)(?!noinspection|\\$NON-NLS-\\d+\\$)[^\\s/]"

    .line 117
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/֡֫ۖ;->ᩳ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/۠֫ۖ;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Ll/֡֫ۖ;->ۧ:Ljava/lang/String;

    .line 40
    iput-object p2, p0, Ll/֡֫ۖ;->ܽ:Ll/۠֫ۖ;

    return-void
.end method

.method public static ֫(Ll/֡֫ۖ;Ljava/util/ArrayList;I)Ljava/lang/String;
    .locals 9

    .line 67
    iget-object p0, p0, Ll/֡֫ۖ;->ۧ:Ljava/lang/String;

    .line 170
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 171
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, " "

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    .line 174
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v5, "/**"

    .line 176
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const-string v6, "*"

    if-eqz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "/*"

    .line 180
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 183
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 184
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 75
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, -0x1

    const/4 v5, 0x1

    const/4 v6, -0x1

    .line 79
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v5, v7, :cond_5

    .line 80
    invoke-static {}, Ll/ۨ۠ܺ;->ᩳ()Ll/ۨ۠ܺ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۨ۠ܺ;->֫()Ll/ۨ۠ܺ;

    move-result-object v7

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/CharSequence;

    invoke-virtual {v7, v8}, Ll/ۨ۠ܺ;->ۧ(Ljava/lang/CharSequence;)I

    move-result v7

    if-ltz v7, :cond_4

    if-eq v6, v1, :cond_3

    if-ge v7, v6, :cond_4

    :cond_3
    move v6, v7

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 87
    :cond_5
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v3, v1, :cond_7

    .line 91
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, v2}, Ll/ۤܶܺ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lt v1, v6, :cond_6

    .line 94
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 96
    :cond_6
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 99
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 153
    :cond_8
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr p2, v3

    .line 156
    invoke-static {p2, v2}, Ll/ۤܶܺ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 157
    :goto_5
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v3, v1, :cond_a

    .line 158
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 160
    invoke-virtual {v1, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_9

    const-string v2, "* "

    .line 161
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    :cond_9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 165
    :cond_a
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܶ۟ܺ;I)Ljava/lang/String;
    .locals 8

    .line 45
    invoke-interface {p1}, Ll/ܶ۟ܺ;->ܿ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 46
    invoke-interface {p1}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 48
    :cond_0
    invoke-interface {p1}, Ll/ܶ۟ܺ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 49
    invoke-interface {p1}, Ll/ܶ۟ܺ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/֡֫ۖ;->ܽ:Ll/۠֫ۖ;

    invoke-virtual {v1}, Ll/۠֫ۖ;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 50
    invoke-static {p2, v0}, Ll/ܽܽۖ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 52
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 53
    invoke-static {v0}, Ll/۬۟ܺ;->ᩳ(Ljava/lang/String;)Ljava/util/Iterator;

    move-result-object v0

    .line 54
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_8

    .line 55
    invoke-interface {p1}, Ll/ܶ۟ܺ;->֫()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 56
    invoke-static {}, Ll/ۨ۠ܺ;->ᩳ()Ll/ۨ۠ܺ;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v5

    :goto_1
    if-ge v3, v5, :cond_3

    .line 768
    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-virtual {v2, v6}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v5, v5, -0x1

    if-le v5, v3, :cond_4

    .line 773
    invoke-interface {v4, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-virtual {v2, v6}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 778
    invoke-interface {v4, v3, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    .line 56
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 58
    :cond_5
    invoke-static {}, Ll/ۨ۠ܺ;->ᩳ()Ll/ۨ۠ܺ;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v6

    sub-int/2addr v6, v4

    :goto_3
    if-ltz v6, :cond_7

    .line 814
    invoke-interface {v5, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-virtual {v2, v4}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v4

    if-nez v4, :cond_6

    add-int/lit8 v6, v6, 0x1

    .line 815
    invoke-interface {v5, v3, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_6
    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    :cond_7
    const-string v2, ""

    .line 58
    :goto_4
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 61
    :cond_8
    invoke-interface {p1}, Ll/ܶ۟ܺ;->֫()Z

    move-result v0

    if-eqz v0, :cond_10

    .line 120
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 121
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, " "

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 123
    sget-object v5, Ll/֡֫ۖ;->ᩳ:Ljava/util/regex/Pattern;

    invoke-virtual {v5, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 124
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_9

    .line 125
    invoke-virtual {v5, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    .line 126
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "/"

    invoke-static {v5, v7}, Ll/ۤܶܺ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v5, v1, v6}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    :cond_9
    const-string v2, "// MOE:"

    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 130
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 133
    :cond_a
    :goto_6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, p2

    const/16 v5, 0x64

    if-le v2, v5, :cond_d

    rsub-int/lit8 v2, p2, 0x64

    :goto_7
    const/4 v5, 0x2

    if-lt v2, v5, :cond_b

    .line 136
    invoke-static {}, Ll/ۨ۠ܺ;->ᩳ()Ll/ۨ۠ܺ;

    move-result-object v6

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-virtual {v6, v7}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result v6

    if-nez v6, :cond_b

    add-int/lit8 v2, v2, -0x1

    goto :goto_7

    :cond_b
    if-gt v2, v5, :cond_c

    goto :goto_8

    .line 142
    :cond_c
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "//"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v2, v1, v5}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    .line 145
    :cond_d
    :goto_8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 105
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    invoke-static {p2, v2}, Ll/ۤܶܺ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 108
    :goto_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v4, v1, :cond_f

    .line 109
    iget-object v1, p0, Ll/֡֫ۖ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    .line 111
    :cond_f
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 64
    :cond_10
    invoke-static {p1}, Ll/֫۟ܺ;->֫(Ll/ܶ۟ܺ;)Ll/ܽ۫ᩴ;

    move-result-object p1

    new-instance v0, Ll/᩵֫ۖ;

    invoke-direct {v0, p0, v1, p2}, Ll/᩵֫ۖ;-><init>(Ll/֡֫ۖ;Ljava/util/ArrayList;I)V

    .line 65
    invoke-virtual {p1, v0}, Ll/ܽ۫ᩴ;->orElseGet(Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method
