.class public final Ll/ۙܶ۠;
.super Ljava/lang/Object;
.source "W3YL"


# instance fields
.field public ֫:Ll/ᩳ᩶۠;

.field public ۜ:Ljava/util/HashSet;

.field public ۧ:Ll/᩶ܶ۠;

.field public final ܳ:Ljava/lang/String;

.field public ܽ:Ll/ᩳ᩶۠;

.field public final ܿ:Ll/᩹ܶ۠;

.field public final ᩳ:Ll/᩶ᩴ֨;

.field public final ᩷:Z

.field public final ᩻:Ll/ܽ֡֨;


# direct methods
.method public constructor <init>(Ll/᩹ܶ۠;Ll/ܽ֡֨;ZLjava/lang/String;Ll/᩶ᩴ֨;)V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    iput-object p1, p0, Ll/ۙܶ۠;->ܿ:Ll/᩹ܶ۠;

    .line 119
    iput-object p2, p0, Ll/ۙܶ۠;->᩻:Ll/ܽ֡֨;

    .line 120
    iput-boolean p3, p0, Ll/ۙܶ۠;->᩷:Z

    .line 121
    iput-object p4, p0, Ll/ۙܶ۠;->ܳ:Ljava/lang/String;

    .line 123
    iput-object p5, p0, Ll/ۙܶ۠;->ᩳ:Ll/᩶ᩴ֨;

    return-void
.end method

.method private varargs ֫(Ll/ᩳ᩶۠;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 273
    new-instance v0, Ll/ܰ۠۠;

    const-string v1, "compiler"

    invoke-direct {v0, v1, p2, p3}, Ll/ܰ۠۠;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Ll/ۙܶ۠;->ܿ:Ll/᩹ܶ۠;

    invoke-virtual {p2, p1, v0}, Ll/ۖ֨۠;->֫(Ll/ᩳ᩶۠;Ll/ܰ۠۠;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 8

    .line 177
    iget-object v0, p0, Ll/ۙܶ۠;->ۧ:Ll/᩶ܶ۠;

    if-eqz v0, :cond_3

    .line 178
    iget-object v1, p0, Ll/ۙܶ۠;->֫:Ll/ᩳ᩶۠;

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v4, p0, Ll/ۙܶ۠;->᩻:Ll/ܽ֡֨;

    iget-object v5, p0, Ll/ۙܶ۠;->ܳ:Ljava/lang/String;

    if-nez v1, :cond_1

    if-eqz v4, :cond_0

    .line 180
    iget-object v1, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    invoke-virtual {v0, v5}, Ll/᩶ܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-direct {p0, v1, v0, v2}, Ll/ۙܶ۠;->֫(Ll/ᩳ᩶۠;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 182
    :cond_0
    iget-object v1, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    invoke-virtual {v0, v5}, Ll/᩶ܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-direct {p0, v1, v0, v2}, Ll/ۙܶ۠;->֫(Ll/ᩳ᩶۠;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_2

    .line 186
    iget-object v1, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    invoke-virtual {v0, v5}, Ll/᩶ܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v6, p0, Ll/ۙܶ۠;->֫:Ll/ᩳ᩶۠;

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v6, v7, v3

    aput-object v4, v7, v2

    invoke-direct {p0, v1, v0, v7}, Ll/ۙܶ۠;->֫(Ll/ᩳ᩶۠;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 188
    :cond_2
    iget-object v1, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    invoke-virtual {v0, v5}, Ll/᩶ܶ۠;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Ll/ۙܶ۠;->֫:Ll/ᩳ᩶۠;

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v4, v2, v3

    invoke-direct {p0, v1, v0, v2}, Ll/ۙܶ۠;->֫(Ll/ᩳ᩶۠;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :goto_0
    iget-boolean v0, p0, Ll/ۙܶ۠;->᩷:Z

    if-nez v0, :cond_3

    .line 193
    iget-object v0, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    const-string v1, ".recompile"

    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1, v2}, Ll/ۙܶ۠;->֫(Ll/ᩳ᩶۠;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۗ۠۠;Ll/ۧܶ۠;)V
    .locals 5

    .line 130
    iget-object v0, p0, Ll/ۙܶ۠;->ܿ:Ll/᩹ܶ۠;

    invoke-virtual {v0}, Ll/᩹ܶ۠;->ۧ()Ll/ᩳ᩶۠;

    move-result-object v1

    .line 132
    iget-boolean v2, p0, Ll/ۙܶ۠;->᩷:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    .line 133
    iget-object v2, p0, Ll/ۙܶ۠;->ۜ:Ljava/util/HashSet;

    if-nez v2, :cond_0

    .line 134
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Ll/ۙܶ۠;->ۜ:Ljava/util/HashSet;

    .line 136
    :cond_0
    iget v2, v0, Ll/᩹ܶ۠;->֡:I

    iget v4, v0, Ll/᩹ܶ۠;->ܿ:I

    if-ge v2, v4, :cond_1

    .line 261
    iget-object v2, p0, Ll/ۙܶ۠;->ᩳ:Ll/᩶ᩴ֨;

    .line 262
    invoke-virtual {v0, v2, p1, p2}, Ll/ۖ֨۠;->֫(Ll/᩶ᩴ֨;Ll/ۗ۠۠;Ll/ۧܶ۠;)V

    .line 139
    iget-object p1, p0, Ll/ۙܶ۠;->ۜ:Ljava/util/HashSet;

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 140
    :cond_1
    iget-object p1, p0, Ll/ۙܶ۠;->ۧ:Ll/᩶ܶ۠;

    if-nez p1, :cond_3

    .line 142
    iget-object p1, p0, Ll/ۙܶ۠;->ۜ:Ljava/util/HashSet;

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 144
    sget-object p1, Ll/᩶ܶ۠;->᩶:Ll/᩶ܶ۠;

    iput-object p1, p0, Ll/ۙܶ۠;->ۧ:Ll/᩶ܶ۠;

    goto :goto_0

    .line 147
    :cond_2
    sget-object p1, Ll/᩶ܶ۠;->ۗ:Ll/᩶ܶ۠;

    iput-object p1, p0, Ll/ۙܶ۠;->ۧ:Ll/᩶ܶ۠;

    .line 149
    :goto_0
    iput-object v1, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    .line 150
    iput-object v1, p0, Ll/ۙܶ۠;->֫:Ll/ᩳ᩶۠;

    return-void

    .line 151
    :cond_3
    sget-object p2, Ll/᩶ܶ۠;->ۗ:Ll/᩶ܶ۠;

    if-eq p1, p2, :cond_4

    sget-object p2, Ll/᩶ܶ۠;->᩶:Ll/᩶ܶ۠;

    if-ne p1, p2, :cond_7

    :cond_4
    iget-object p1, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    .line 153
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 155
    sget-object p1, Ll/᩶ܶ۠;->ۙ:Ll/᩶ܶ۠;

    iput-object p1, p0, Ll/ۙܶ۠;->ۧ:Ll/᩶ܶ۠;

    .line 156
    iput-object v3, p0, Ll/ۙܶ۠;->֫:Ll/ᩳ᩶۠;

    return-void

    .line 159
    :cond_5
    iget-object p1, p0, Ll/ۙܶ۠;->ۧ:Ll/᩶ܶ۠;

    if-nez p1, :cond_6

    .line 161
    sget-object p1, Ll/᩶ܶ۠;->ۗ:Ll/᩶ܶ۠;

    iput-object p1, p0, Ll/ۙܶ۠;->ۧ:Ll/᩶ܶ۠;

    .line 162
    iput-object v1, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    .line 163
    iput-object v1, p0, Ll/ۙܶ۠;->֫:Ll/ᩳ᩶۠;

    return-void

    .line 164
    :cond_6
    sget-object p2, Ll/᩶ܶ۠;->ۗ:Ll/᩶ܶ۠;

    if-ne p1, p2, :cond_7

    iget-object p1, p0, Ll/ۙܶ۠;->ܽ:Ll/ᩳ᩶۠;

    .line 165
    invoke-static {p1, v1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 167
    sget-object p1, Ll/᩶ܶ۠;->۬:Ll/᩶ܶ۠;

    iput-object p1, p0, Ll/ۙܶ۠;->ۧ:Ll/᩶ܶ۠;

    .line 168
    iput-object v3, p0, Ll/ۙܶ۠;->֫:Ll/ᩳ᩶۠;

    :cond_7
    return-void
.end method
