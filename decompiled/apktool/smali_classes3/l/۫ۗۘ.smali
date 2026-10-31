.class public final Ll/۫ۗۘ;
.super Ljava/lang/Object;
.source "690O"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Z

.field public ܽ:I

.field public final ᩳ:Ll/ۜ۬ۘ;


# direct methods
.method public constructor <init>(Ll/ۜ۬ۘ;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, Ll/۫ۗۘ;->ᩳ:Ll/ۜ۬ۘ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ۗۘ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ۗۘ;->֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/۫ۗۘ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۫ۗۘ;->֫:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ll/۫ۗۘ;Ll/ۗ᩶ۘ;Ll/ۧۚ֡;)V
    .locals 8

    .line 180
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    .line 182
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ۧ(Ll/֡ۚ֡;)V

    .line 184
    iget-object p2, p0, Ll/۫ۗۘ;->֫:Ljava/util/ArrayList;

    if-eqz p2, :cond_5

    .line 186
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object p2

    .line 193
    invoke-virtual {p2}, Ll/ᩳۙۘ;->length()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    sub-int/2addr v1, v3

    .line 195
    invoke-virtual {p2, v1}, Ll/ᩳۙۘ;->charAt(I)C

    move-result v1

    const/16 v4, 0xa

    if-eq v4, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 199
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ᩳ()V

    :cond_1
    const/16 v4, 0xa0

    .line 205
    invoke-virtual {p2, v4}, Ll/ᩳۙۘ;->append(C)V

    .line 207
    new-instance p2, Ll/֫۬ۘ;

    iget-object v4, p0, Ll/۫ۗۘ;->ᩳ:Ll/ۜ۬ۘ;

    iget-object v5, p0, Ll/۫ۗۘ;->֫:Ljava/util/ArrayList;

    iget-boolean v6, p0, Ll/۫ۗۘ;->ۧ:Z

    iget v7, p0, Ll/۫ۗۘ;->ܽ:I

    rem-int/lit8 v7, v7, 0x2

    if-ne v7, v3, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    invoke-direct {p2, v4, v5, v6, v7}, Ll/֫۬ۘ;-><init>(Ll/ۜ۬ۘ;Ljava/util/ArrayList;ZZ)V

    .line 213
    iget-boolean v4, p0, Ll/۫ۗۘ;->ۧ:Z

    if-eqz v4, :cond_3

    goto :goto_2

    .line 215
    :cond_3
    iget v2, p0, Ll/۫ۗۘ;->ܽ:I

    add-int/2addr v2, v3

    :goto_2
    iput v2, p0, Ll/۫ۗۘ;->ܽ:I

    if-eqz v1, :cond_4

    add-int/lit8 v0, v0, 0x1

    .line 217
    :cond_4
    invoke-interface {p1, v0, p2}, Ll/ۗ᩶ۘ;->֫(ILjava/lang/Object;)V

    const/4 p1, 0x0

    .line 219
    iput-object p1, p0, Ll/۫ۗۘ;->֫:Ljava/util/ArrayList;

    :cond_5
    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ۗۘ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/۫ۗۘ;->ۧ:Z

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۫ۗۘ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput v0, p0, Ll/۫ۗۘ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 113
    iput-object v0, p0, Ll/۫ۗۘ;->֫:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 114
    iput-boolean v0, p0, Ll/۫ۗۘ;->ۧ:Z

    .line 115
    iput v0, p0, Ll/۫ۗۘ;->ܽ:I

    return-void
.end method
