.class public final Ll/᩺ᩴ֨;
.super Ljava/lang/Object;
.source "N7KG"


# static fields
.field public static final ᩷:Ll/ۙ֨۠;


# instance fields
.field public final ֫:Z

.field public final ۜ:Ljava/util/HashSet;

.field public final ۧ:Z

.field public final ܳ:Ll/ۙܶ۠;

.field public final ܽ:Ll/ۙᩴ֨;

.field public final ܿ:Ljava/util/HashMap;

.field public final ᩳ:Ll/᩹ܶ۠;

.field public final ᩻:Ll/ܽ֡֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 85
    new-instance v0, Ll/ۙ֨۠;

    invoke-direct {v0}, Ll/ۙ֨۠;-><init>()V

    sput-object v0, Ll/᩺ᩴ֨;->᩷:Ll/ۙ֨۠;

    return-void
.end method

.method public constructor <init>(Ll/ۗ֨۠;)V
    .locals 8

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩺ᩴ֨;->ۜ:Ljava/util/HashSet;

    .line 96
    sget-object v0, Ll/᩺ᩴ֨;->᩷:Ll/ۙ֨۠;

    invoke-virtual {p1, v0, p0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;Ljava/lang/Object;)V

    .line 97
    invoke-static {p1}, Ll/ۨܶ۠;->֫(Ll/ۗ֨۠;)Ll/ۨܶ۠;

    move-result-object v0

    .line 98
    sget-object v1, Ll/֡ۖ۠;->᩻ۧ:Ll/֡ۖ۠;

    invoke-virtual {v0, v1}, Ll/ۨܶ۠;->ۧ(Ll/֡ۖ۠;)Z

    move-result v1

    iput-boolean v1, p0, Ll/᩺ᩴ֨;->֫:Z

    .line 99
    invoke-static {p1}, Ll/᩹ܶ۠;->֫(Ll/ۗ֨۠;)Ll/᩹ܶ۠;

    move-result-object v3

    iput-object v3, p0, Ll/᩺ᩴ֨;->ᩳ:Ll/᩹ܶ۠;

    .line 100
    invoke-static {p1}, Ll/ۙᩴ֨;->֫(Ll/ۗ֨۠;)Ll/ۙᩴ֨;

    move-result-object v1

    iput-object v1, p0, Ll/᩺ᩴ֨;->ܽ:Ll/ۙᩴ֨;

    .line 101
    invoke-static {p1}, Ll/ܽ֡֨;->֫(Ll/ۗ֨۠;)Ll/ܽ֡֨;

    move-result-object v4

    iput-object v4, p0, Ll/᩺ᩴ֨;->᩻:Ll/ܽ֡֨;

    .line 102
    new-instance p1, Ll/ۙܶ۠;

    sget-object v7, Ll/᩶ᩴ֨;->ۜ֫:Ll/᩶ᩴ֨;

    .line 103
    invoke-virtual {v1, v7}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v5

    const-string v6, "preview"

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Ll/ۙܶ۠;-><init>(Ll/᩹ܶ۠;Ll/ܽ֡֨;ZLjava/lang/String;Ll/᩶ᩴ֨;)V

    iput-object p1, p0, Ll/᩺ᩴ֨;->ܳ:Ll/ۙܶ۠;

    const-string p1, "forcePreview"

    .line 104
    invoke-virtual {v0, p1}, Ll/ۨܶ۠;->ۧ(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/᩺ᩴ֨;->ۧ:Z

    .line 109
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 110
    invoke-static {}, Ll/ۧۡ۠;->values()[Ll/ۧۡ۠;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 111
    iget v4, v3, Ll/ۧۡ۠;->᩸:I

    .line 112
    iget-object v3, v3, Ll/ۧۡ۠;->᩶:Ljava/lang/String;

    invoke-static {v3}, Ll/ܽ֡֨;->֫(Ljava/lang/String;)Ll/ܽ֡֨;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 114
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 105
    :cond_1
    iput-object p1, p0, Ll/᩺ᩴ֨;->ܿ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ll/ۗ֨۠;)Ll/᩺ᩴ֨;
    .locals 1

    .line 88
    sget-object v0, Ll/᩺ᩴ֨;->᩷:Ll/ۙ֨۠;

    invoke-virtual {p0, v0}, Ll/ۗ֨۠;->֫(Ll/ۙ֨۠;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ᩴ֨;

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Ll/᩺ᩴ֨;

    invoke-direct {v0, p0}, Ll/᩺ᩴ֨;-><init>(Ll/ۗ֨۠;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/ۧ֡֨;)Ll/۫۠۠;
    .locals 4

    .line 205
    iget-boolean v0, p0, Ll/᩺ᩴ֨;->֫:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 206
    invoke-virtual {p1}, Ll/ۧ֡֨;->֫()Z

    move-result v0

    const/4 v2, 0x0

    const-string v3, "compiler"

    if-eqz v0, :cond_0

    .line 207
    invoke-virtual {p1}, Ll/ۧ֡֨;->ۧ()Ll/ۨ۠۠;

    move-result-object p1

    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3165
    new-instance v0, Ll/۫۠۠;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    const-string p1, "preview.feature.disabled.plural"

    invoke-direct {v0, v3, p1, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0

    .line 208
    :cond_0
    invoke-virtual {p1}, Ll/ۧ֡֨;->ۧ()Ll/ۨ۠۠;

    move-result-object p1

    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3138
    new-instance v0, Ll/۫۠۠;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    const-string p1, "preview.feature.disabled"

    invoke-direct {v0, v3, p1, v1}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ֫(Ll/ᩳ᩶۠;I)Ll/۫۠۠;
    .locals 4

    .line 218
    iget-boolean v0, p0, Ll/᩺ᩴ֨;->֫:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 219
    iget-object v0, p0, Ll/᩺ᩴ֨;->ܿ:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܽ֡֨;

    iget-object p2, p2, Ll/ܽ֡֨;->᩸:Ljava/lang/String;

    sget-object v0, Ll/ۛᩴ۠;->֫:Ll/۫۠۠;

    .line 3147
    new-instance v0, Ll/۫۠۠;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    aput-object p2, v2, v1

    const-string p1, "compiler"

    const-string p2, "preview.feature.disabled.classfile"

    invoke-direct {v0, p1, p2, v2}, Ll/۫۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۧ֡֨;)V
    .locals 4

    .line 178
    iget-boolean v0, p0, Ll/᩺ᩴ֨;->֫:Z

    .line 137
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 138
    invoke-virtual {p0, p2}, Ll/᩺ᩴ֨;->ۧ(Ll/ۧ֡֨;)Z

    move-result v0

    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 139
    iget-object v0, p0, Ll/᩺ᩴ֨;->ܽ:Ll/ۙᩴ֨;

    sget-object v1, Ll/᩶ᩴ֨;->ۜ֫:Ll/᩶ᩴ֨;

    invoke-virtual {v0, v1}, Ll/ۙᩴ֨;->ۧ(Ll/᩶ᩴ֨;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    iget-object v0, p0, Ll/᩺ᩴ֨;->ᩳ:Ll/᩹ܶ۠;

    invoke-virtual {v0}, Ll/᩹ܶ۠;->ۧ()Ll/ᩳ᩶۠;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ᩴ֨;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 141
    invoke-virtual {p2}, Ll/ۧ֡֨;->֫()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "compiler"

    if-eqz v0, :cond_0

    .line 142
    invoke-virtual {p2}, Ll/ۧ֡֨;->ۧ()Ll/ۨ۠۠;

    move-result-object p2

    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4762
    new-instance v0, Ll/ۧܶ۠;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v1

    const-string p2, "preview.feature.use.plural"

    invoke-direct {v0, v3, p2, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 143
    :cond_0
    invoke-virtual {p2}, Ll/ۧ֡֨;->ۧ()Ll/ۨ۠۠;

    move-result-object p2

    sget-object v0, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4738
    new-instance v0, Ll/ۧܶ۠;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v1

    const-string p2, "preview.feature.use"

    invoke-direct {v0, v3, p2, v2}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    :goto_0
    iget-object p2, p0, Ll/᩺ᩴ֨;->ܳ:Ll/ۙܶ۠;

    invoke-virtual {p2, p1, v0}, Ll/ۙܶ۠;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_1
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V
    .locals 1

    .line 166
    iget-object v0, p0, Ll/᩺ᩴ֨;->ܳ:Ll/ۙܶ۠;

    invoke-virtual {v0, p1, p2}, Ll/ۙܶ۠;->֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    return-void
.end method

.method public final ֫(Ll/۫᩵۠;Ll/ۧ֡֨;)V
    .locals 4

    .line 245
    invoke-virtual {p0, p2}, Ll/᩺ᩴ֨;->ۧ(Ll/ۧ֡֨;)Z

    move-result v0

    iget-object v1, p0, Ll/᩺ᩴ֨;->ᩳ:Ll/᩹ܶ۠;

    iget-boolean v2, p0, Ll/᩺ᩴ֨;->֫:Z

    if-eqz v0, :cond_0

    if-nez v2, :cond_0

    .line 247
    sget-object v0, Ll/᩶۠۠;->ۤ:Ll/᩶۠۠;

    invoke-virtual {p0, p2}, Ll/᩺ᩴ֨;->֫(Ll/ۧ֡֨;)Ll/۫۠۠;

    move-result-object p2

    invoke-virtual {v1, v0, p1, p2}, Ll/ۖ֨۠;->֫(Ll/᩶۠۠;Ll/ۗ۠۠;Ll/۫۠۠;)V

    return-void

    .line 249
    :cond_0
    iget-object v0, p0, Ll/᩺ᩴ֨;->᩻:Ll/ܽ֡֨;

    invoke-virtual {p2, v0}, Ll/ۧ֡֨;->֫(Ll/ܽ֡֨;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 250
    sget-object v3, Ll/᩶۠۠;->ۤ:Ll/᩶۠۠;

    iget-object v0, v0, Ll/ܽ֡֨;->᩸:Ljava/lang/String;

    .line 251
    invoke-virtual {p2, v0}, Ll/ۧ֡֨;->֫(Ljava/lang/String;)Ll/۫۠۠;

    move-result-object v0

    .line 250
    invoke-virtual {v1, v3, p1, v0}, Ll/ۖ֨۠;->֫(Ll/᩶۠۠;Ll/ۗ۠۠;Ll/۫۠۠;)V

    :cond_1
    if-eqz v2, :cond_2

    .line 253
    invoke-virtual {p0, p2}, Ll/᩺ᩴ֨;->ۧ(Ll/ۧ֡֨;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 254
    invoke-virtual {p0, p1, p2}, Ll/᩺ᩴ֨;->֫(Ll/ۗ۠۠;Ll/ۧ֡֨;)V

    :cond_2
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 178
    iget-boolean v0, p0, Ll/᩺ᩴ֨;->֫:Z

    return v0
.end method

.method public final ֫(Ll/ᩳ᩶۠;)Z
    .locals 1

    .line 170
    iget-object v0, p0, Ll/᩺ᩴ֨;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()V
    .locals 2

    .line 162
    iget-object v0, p0, Ll/᩺ᩴ֨;->ᩳ:Ll/᩹ܶ۠;

    invoke-virtual {v0}, Ll/᩹ܶ۠;->ۧ()Ll/ᩳ᩶۠;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ᩴ֨;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ll/ᩳ᩶۠;I)V
    .locals 5

    .line 178
    iget-boolean v0, p0, Ll/᩺ᩴ֨;->֫:Z

    .line 153
    invoke-static {v0}, Ll/۫ۙ;->֫(Z)V

    .line 154
    sget-object v0, Ll/᩶ᩴ֨;->ۜ֫:Ll/᩶ᩴ֨;

    iget-object v1, p0, Ll/᩺ᩴ֨;->ܽ:Ll/ۙᩴ֨;

    invoke-virtual {v1, v0}, Ll/ۙᩴ֨;->֫(Ll/᩶ᩴ֨;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 155
    iget-object v1, p0, Ll/᩺ᩴ֨;->ۜ:Ljava/util/HashSet;

    iget-object v2, p0, Ll/᩺ᩴ֨;->ᩳ:Ll/᩹ܶ۠;

    invoke-virtual {v2}, Ll/᩹ܶ۠;->ۧ()Ll/ᩳ᩶۠;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 156
    iget-object v1, p0, Ll/᩺ᩴ֨;->ܿ:Ljava/util/HashMap;

    .line 157
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܽ֡֨;

    iget-object p2, p2, Ll/ܽ֡֨;->᩸:Ljava/lang/String;

    sget-object v1, Ll/ܰᩴ۠;->֫:Ll/ۧܶ۠;

    .line 4746
    new-instance v1, Ll/ۧܶ۠;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object p2, v3, p1

    const-string p1, "compiler"

    const-string p2, "preview.feature.use.classfile"

    invoke-direct {v1, p1, p2, v3}, Ll/ۧܶ۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 156
    invoke-virtual {v2, v0, p1, v1}, Ll/ۖ֨۠;->֫(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۧ֡֨;)Z
    .locals 2

    .line 187
    sget-object v0, Ll/ۨᩴ֨;->֫:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    .line 194
    iget-boolean p1, p0, Ll/᩺ᩴ֨;->ۧ:Z

    return p1

    :cond_0
    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 237
    iget-object v0, p0, Ll/᩺ᩴ֨;->ܳ:Ll/ۙܶ۠;

    invoke-virtual {v0}, Ll/ۙܶ۠;->֫()V

    return-void
.end method
