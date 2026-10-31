.class public final Ll/ۙᩴ֨;
.super Ljava/lang/Object;
.source "041R"


# static fields
.field public static final ܿ:Ll/ۧۤᩴ;

.field public static final ᩳ:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Ll/᩹ᩴ֨;

.field public final ۧ:Ljava/util/EnumSet;

.field public final ܽ:Ljava/util/EnumSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 51
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/ۙᩴ֨;->ᩳ:Ll/ۙ֨۠;

    .line 101
    new-instance v0, Ll/ۧۤᩴ;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ll/ۧۤᩴ;-><init>(I)V

    sput-object v0, Ll/ۙᩴ֨;->ܿ:Ll/ۧۤᩴ;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 9

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v0

    .line 107
    sget-object v1, Ll/֡ۖ۠;->ܿܽ:Ll/֡ۖ۠;

    invoke-virtual {v0, v1}, Ll/ۨܶ۠;->ۧ(Ll/֡ۖ۠;)Z

    move-result v1

    const-class v2, Ll/᩶ᩴ֨;

    if-nez v1, :cond_5

    sget-object v1, Ll/֡ۖ۠;->ܳܽ:Ll/֡ۖ۠;

    const-string v3, "all"

    invoke-virtual {v0, v1, v3}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const-string v3, "none"

    .line 110
    invoke-virtual {v0, v1, v3}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 112
    invoke-static {v2}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    iput-object v1, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    goto :goto_1

    .line 115
    :cond_1
    invoke-static {v2}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    iput-object v1, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    .line 117
    invoke-static {p1}, Ll/ܽ֡֨;->֫(Ll/ۗ֨۠;)Ll/ܽ֡֨;

    move-result-object v3

    .line 118
    sget-object v4, Ll/ܽ֡֨;->ܳ֫:Ll/ܽ֡֨;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-ltz v4, :cond_2

    .line 119
    sget-object v4, Ll/᩶ᩴ֨;->ۤ:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 121
    :cond_2
    sget-object v4, Ll/ۧ֡֨;->֡֫:Ll/ۧ֡֨;

    invoke-virtual {v4, v3}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 122
    sget-object v3, Ll/᩶ᩴ֨;->᩵֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 124
    :cond_3
    sget-object v3, Ll/᩶ᩴ֨;->ۖ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 125
    sget-object v3, Ll/᩶ᩴ֨;->ܽ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 126
    sget-object v3, Ll/᩶ᩴ֨;->ۧ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 127
    sget-object v3, Ll/᩶ᩴ֨;->ۡ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 128
    sget-object v3, Ll/֡ۖ۠;->᩻ۧ:Ll/֡ۖ۠;

    invoke-virtual {v0, v3}, Ll/ۨܶ۠;->ۧ(Ll/֡ۖ۠;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 129
    sget-object v3, Ll/᩶ᩴ֨;->ۜ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 131
    :cond_4
    sget-object v3, Ll/᩶ᩴ֨;->֡֫:Ll/᩶ᩴ֨;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 109
    :cond_5
    :goto_0
    invoke-static {v2}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v1

    iput-object v1, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    .line 135
    :goto_1
    invoke-static {}, Ll/᩶ᩴ֨;->values()[Ll/᩶ᩴ֨;

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_8

    aget-object v5, v1, v4

    .line 136
    sget-object v6, Ll/֡ۖ۠;->ܳܽ:Ll/֡ۖ۠;

    iget-object v7, v5, Ll/᩶ᩴ֨;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v6, v7}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 137
    iget-object v6, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    invoke-virtual {v6, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 138
    :cond_6
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "-"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, v5, Ll/᩶ᩴ֨;->᩹:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Ll/ۨܶ۠;->֫(Ll/֡ۖ۠;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 139
    iget-object v6, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    invoke-virtual {v6, v5}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    :cond_7
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 143
    :cond_8
    invoke-static {v2}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/ۙᩴ֨;->ۧ:Ljava/util/EnumSet;

    .line 145
    sget-object v0, Ll/ۙᩴ֨;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 146
    new-instance v0, Ll/᩹ᩴ֨;

    invoke-direct {v0, p1}, Ll/᩹ᩴ֨;-><init>(Ll/ۗ֨۠;)V

    iput-object v0, p0, Ll/ۙᩴ֨;->֫:Ll/᩹ᩴ֨;

    return-void
.end method

.method public constructor <init>(Ll/ۙᩴ֨;)V
    .locals 1

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    iget-object v0, p1, Ll/ۙᩴ֨;->֫:Ll/᩹ᩴ֨;

    iput-object v0, p0, Ll/ۙᩴ֨;->֫:Ll/᩹ᩴ֨;

    .line 151
    iget-object v0, p1, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    invoke-virtual {v0}, Ljava/util/EnumSet;->clone()Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    .line 152
    iget-object p1, p1, Ll/ۙᩴ֨;->ۧ:Ljava/util/EnumSet;

    invoke-virtual {p1}, Ljava/util/EnumSet;->clone()Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Ll/ۙᩴ֨;->ۧ:Ljava/util/EnumSet;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۙᩴ֨;)Ljava/util/EnumSet;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙᩴ֨;->ۧ:Ljava/util/EnumSet;

    return-object p0
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/ۙᩴ֨;
    .locals 1

    .line 55
    sget-object v0, Ll/ۙᩴ֨;->ᩳ:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙᩴ֨;

    if-nez v0, :cond_0

    .line 57
    new-instance v0, Ll/ۙᩴ֨;

    invoke-direct {v0, p0}, Ll/ۙᩴ֨;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method

.method public static bridge synthetic ֫()Ll/ۧۤᩴ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۙᩴ֨;->ܿ:Ll/ۧۤᩴ;

    return-object v0
.end method

.method public static bridge synthetic ۧ(Ll/ۙᩴ֨;)Ljava/util/EnumSet;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Lint:[values"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " suppressedValues"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙᩴ֨;->ۧ:Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۛ֡֨;)Ll/ۙᩴ֨;
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ۙᩴ֨;->֫:Ll/᩹ᩴ֨;

    invoke-virtual {p1}, Ll/ۛ֡֨;->ۨ()Ll/ۖܶ۠;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ll/᩹ᩴ֨;->֫(Ll/ۙᩴ֨;Ll/ۖܶ۠;)Ll/ۙᩴ֨;

    move-result-object v0

    .line 76
    invoke-virtual {p1}, Ll/ۛ֡֨;->ۢ֫()Z

    move-result p1

    if-eqz p1, :cond_1

    if-ne v0, p0, :cond_0

    .line 78
    new-instance p1, Ll/ۙᩴ֨;

    invoke-direct {p1, p0}, Ll/ۙᩴ֨;-><init>(Ll/ۙᩴ֨;)V

    move-object v0, p1

    .line 79
    :cond_0
    iget-object p1, v0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    sget-object v1, Ll/᩶ᩴ֨;->۫:Ll/᩶ᩴ֨;

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 80
    iget-object p1, v0, Ll/ۙᩴ֨;->ۧ:Ljava/util/EnumSet;

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method public final varargs ֫([Ll/᩶ᩴ֨;)Ll/ۙᩴ֨;
    .locals 3

    .line 90
    new-instance v0, Ll/ۙᩴ֨;

    invoke-direct {v0, p0}, Ll/ۙᩴ֨;-><init>(Ll/ۙᩴ֨;)V

    .line 91
    iget-object v1, v0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 92
    iget-object v1, v0, Ll/ۙᩴ֨;->ۧ:Ljava/util/EnumSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method

.method public final ֫(Ll/᩶ᩴ֨;)Z
    .locals 1

    .line 348
    iget-object v0, p0, Ll/ۙᩴ֨;->ܽ:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩶ᩴ֨;)Z
    .locals 1

    .line 358
    iget-object v0, p0, Ll/ۙᩴ֨;->ۧ:Ljava/util/EnumSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
