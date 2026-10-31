.class public final Ll/ܿ᩸۠;
.super Ll/ܺ֨۠;
.source "B3ZP"


# static fields
.field public static final ᩻:Ljava/util/Set;


# instance fields
.field public ܳ:Ll/ᩳ᩸۠;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    const-string v3, "compiler.note.preview.filename"

    aput-object v3, v1, v2

    const-string v3, "compiler.note.preview.plural"

    const/4 v4, 0x1

    aput-object v3, v1, v4

    .line 0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, v1, v2

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "duplicate element: "

    invoke-static {v4, v1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    .line 174
    sput-object v0, Ll/ܿ᩸۠;->᩻:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ll/ۨܶ۠;)V
    .locals 4

    .line 91
    new-instance v0, Ll/ۡ֨۠;

    sget-object v1, Ll/᩹ۖ֨;->۬:Ll/᩹ۖ֨;

    sget-object v2, Ll/᩹ۖ֨;->᩹:Ll/᩹ۖ֨;

    sget-object v3, Ll/᩹ۖ֨;->ۗ:Ll/᩹ۖ֨;

    .line 92
    invoke-static {v1, v2, v3}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ll/ۡ֨۠;-><init>(Ll/ۨܶ۠;Ljava/util/EnumSet;)V

    const/4 p1, 0x0

    .line 91
    invoke-direct {p0, p1, v0}, Ll/ܺ֨۠;-><init>(Ll/ܳܶ۠;Ll/ۡ֨۠;)V

    return-void
.end method


# virtual methods
.method public final varargs ֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 0
    invoke-static {p2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 182
    array-length p2, p3

    const-string v0, ": "

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-object v2, p3, v1

    .line 183
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    const-string v0, ", "

    goto :goto_0

    .line 187
    :cond_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܽܶ۠;Ljava/lang/Object;Ljava/util/Locale;)Ljava/lang/String;
    .locals 1

    .line 156
    instance-of p3, p2, Ll/ۤۖ֨;

    if-eqz p3, :cond_0

    .line 157
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 158
    :cond_0
    instance-of p3, p2, Ll/۫᩵۠;

    if-eqz p3, :cond_1

    move-object p1, p2

    check-cast p1, Ll/۫᩵۠;

    .line 159
    iget-object p3, p0, Ll/ܿ᩸۠;->ܳ:Ll/ᩳ᩸۠;

    invoke-static {p3}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    .line 160
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "@"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ܿ᩸۠;->ܳ:Ll/ᩳ᩸۠;

    invoke-virtual {v0, p1}, Ll/ᩳ᩸۠;->֫(Ll/۫᩵۠;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 161
    :cond_1
    instance-of p3, p2, Ll/۫ܳ۠;

    if-eqz p3, :cond_2

    move-object p1, p2

    check-cast p1, Ll/۫ܳ۠;

    .line 162
    invoke-virtual {p1}, Ll/۫ܳ۠;->ܳ()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 163
    :cond_2
    instance-of p3, p2, Ll/ᩴۚ۠;

    if-eqz p3, :cond_3

    move-object p1, p2

    check-cast p1, Ll/ᩴۚ۠;

    .line 164
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "compiler.misc.tree.tag."

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    .line 45
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 164
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 165
    :cond_3
    instance-of p3, p2, Ll/ܽ֡֨;

    if-eqz p3, :cond_4

    sget-object p3, Ll/ܽ֡֨;->᩶:Ll/ܽ֡֨;

    if-ne p2, p3, :cond_4

    sget-object p3, Ll/ܿ᩸۠;->᩻:Ljava/util/Set;

    .line 166
    invoke-virtual {p1}, Ll/ܽܶ۠;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    const-string p1, "DEFAULT"

    goto :goto_0

    :cond_4
    const/4 p3, 0x0

    .line 169
    invoke-super {p0, p1, p2, p3}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ljava/lang/Object;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    .line 171
    :goto_0
    instance-of p2, p2, Ll/ܽܶ۠;

    if-eqz p2, :cond_5

    const-string p2, "("

    const-string p3, ")"

    .line 0
    invoke-static {p2, p1, p3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_5
    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 53
    invoke-virtual {p0, p1, p2}, Ll/ܿ᩸۠;->ۜ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۜ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 4

    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    invoke-virtual {p0, p1, p2}, Ll/ܺ֨۠;->ᩳ(Ll/ܽܶ۠;Ljava/util/Locale;)Ll/ۖܶ۠;

    move-result-object p2

    .line 134
    invoke-virtual {p1}, Ll/ܽܶ۠;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ll/ۖܶ۠;->toArray()[Ljava/lang/Object;

    move-result-object p2

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p2}, Ll/ܿ᩸۠;->֫(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    instance-of p2, p1, Ll/᩺۠۠;

    if-eqz p2, :cond_1

    .line 135
    invoke-virtual {p0}, Ll/ܺ֨۠;->getConfiguration()Ll/ۡ֨۠;

    move-result-object p2

    .line 478
    iget-object p2, p2, Ll/ۡ֨۠;->ܽ:Ljava/util/EnumSet;

    invoke-static {p2}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object p2

    .line 135
    sget-object v1, Ll/᩹ۖ֨;->ۗ:Ll/᩹ۖ֨;

    invoke-virtual {p2, v1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 136
    invoke-virtual {p0, p1, v2}, Ll/ܺ֨۠;->᩻(Ll/ܽܶ۠;Ljava/util/Locale;)Ll/ۖܶ۠;

    move-result-object p2

    .line 137
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, ",{"

    .line 139
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    invoke-virtual {p0, p1, v2}, Ll/ܺ֨۠;->᩻(Ll/ܽܶ۠;Ljava/util/Locale;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string p2, ""

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "("

    const-string v3, ")"

    .line 0
    invoke-static {v0, p2, v2, v1, v3}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, ","

    goto :goto_0

    :cond_0
    const/16 p1, 0x7d

    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 150
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;
    .locals 7

    const/4 p2, 0x0

    .line 100
    :try_start_0
    new-instance v0, Ll/ᩳ᩸۠;

    invoke-direct {v0, p1}, Ll/ᩳ᩸۠;-><init>(Ll/ܽܶ۠;)V

    iput-object v0, p0, Ll/ܿ᩸۠;->ܳ:Ll/ᩳ᩸۠;

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 691
    invoke-virtual {p1}, Ll/ܽܶ۠;->᩻()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, -0x1

    const/4 v5, 0x0

    cmp-long v6, v1, v3

    if-eqz v6, :cond_0

    .line 103
    invoke-static {p1, v5}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    sget-object v2, Ll/ۗۖ֨;->ۙ:Ll/ۗۖ֨;

    invoke-static {p1, v2}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ll/ۗۖ֨;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    sget-object v2, Ll/ۗۖ֨;->᩹:Ll/ۗۖ֨;

    invoke-static {p1, v2}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Ll/ۗۖ֨;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 110
    :cond_0
    invoke-virtual {p1}, Ll/ܽܶ۠;->ۢ()Ll/ᩳ᩶۠;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ll/ܽܶ۠;->ۢ()Ll/ᩳ᩶۠;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object v1

    sget-object v2, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    if-ne v1, v2, :cond_1

    .line 111
    invoke-static {p1, v5}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":-:-:"

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const/16 v1, 0x2d

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v1, 0x20

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {p0, p1, p2}, Ll/ܿ᩸۠;->ۜ(Ll/ܽܶ۠;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    invoke-virtual {p0, p1}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "\n"

    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    invoke-virtual {p0, p1, v5}, Ll/ܺ֨۠;->֫(Ll/ܽܶ۠;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    iput-object p2, p0, Ll/ܿ᩸۠;->ܳ:Ll/ᩳ᩸۠;

    return-object p1

    :catchall_0
    move-exception p1

    iput-object p2, p0, Ll/ܿ᩸۠;->ܳ:Ll/ᩳ᩸۠;

    .line 128
    throw p1

    .line 127
    :catch_0
    iput-object p2, p0, Ll/ܿ᩸۠;->ܳ:Ll/ᩳ᩸۠;

    return-object p2
.end method
