.class public final Ll/᩹۬֫;
.super Ljava/lang/Object;
.source "G8QA"


# instance fields
.field public ֫:Ll/ܺۧۧ;

.field public ۧ:Ll/ܳ۬ܺ;

.field public ܳ:Ll/ܺۧۧ;

.field public ܽ:Ll/ۢ۬ܺ;

.field public ܿ:Ll/ܺۧۧ;

.field public final ᩳ:Ll/᩹᩵֫;


# direct methods
.method public constructor <init>(Ll/᩹᩵֫;)V
    .locals 0

    .line 1034
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1035
    iput-object p1, p0, Ll/᩹۬֫;->ᩳ:Ll/᩹᩵֫;

    .line 1036
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    .line 1037
    invoke-static {}, Ll/ۢ۬ܺ;->of()Ll/ۢ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۬֫;->ܽ:Ll/ۢ۬ܺ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹۬֫;)Ll/ܳ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    return-object p0
.end method

.method public static ֫(Ll/֨᩵֫;Ll/ܳ۬ܺ;Ll/ܺۧۧ;Ll/᩹᩵֫;)Ll/ܺۧۧ;
    .locals 10

    .line 1167
    invoke-interface {p0}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v0

    .line 1168
    invoke-interface {p0}, Ll/֨᩵֫;->۫()I

    move-result v1

    .line 1171
    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ll/ۙ᩵֫;->֫(I)Ljava/lang/Object;

    move-result-object v2

    .line 1173
    :goto_0
    invoke-interface {p0}, Ll/֨᩵֫;->᩷()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_2

    invoke-virtual {v0}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 1275
    :cond_1
    invoke-virtual {v0, v1, p3, v5}, Ll/ۙ᩵֫;->֫(ILl/᩹᩵֫;Z)Ll/᩹᩵֫;

    move-result-object v0

    .line 1178
    invoke-interface {p0}, Ll/֨᩵֫;->getCurrentPosition()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll/ۘ֨֫;->֫(J)J

    move-result-wide v4

    .line 693
    iget-wide v6, p3, Ll/᩹᩵֫;->ܿ:J

    sub-long/2addr v4, v6

    .line 1177
    invoke-virtual {v0, v4, v5}, Ll/᩹᩵֫;->֫(J)I

    move-result p3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p3, -0x1

    :goto_2
    const/4 v0, 0x0

    .line 1179
    :goto_3
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 1180
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺۧۧ;

    .line 1184
    invoke-interface {p0}, Ll/֨᩵֫;->᩷()Z

    move-result v6

    .line 1185
    invoke-interface {p0}, Ll/֨᩵֫;->᩵()I

    move-result v7

    .line 1186
    invoke-interface {p0}, Ll/֨᩵֫;->ۛ()I

    move-result v8

    move-object v4, v1

    move-object v5, v2

    move v9, p3

    .line 1181
    invoke-static/range {v4 .. v9}, Ll/᩹۬֫;->֫(Ll/ܺۧۧ;Ljava/lang/Object;ZIII)Z

    move-result v4

    if-eqz v4, :cond_3

    return-object v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 1191
    :cond_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    if-eqz p2, :cond_5

    .line 1195
    invoke-interface {p0}, Ll/֨᩵֫;->᩷()Z

    move-result v6

    .line 1196
    invoke-interface {p0}, Ll/֨᩵֫;->᩵()I

    move-result v7

    .line 1197
    invoke-interface {p0}, Ll/֨᩵֫;->ۛ()I

    move-result v8

    move-object v4, p2

    move-object v5, v2

    move v9, p3

    .line 1192
    invoke-static/range {v4 .. v9}, Ll/᩹۬֫;->֫(Ll/ܺۧۧ;Ljava/lang/Object;ZIII)Z

    move-result p0

    if-eqz p0, :cond_5

    return-object p2

    :cond_5
    return-object v3
.end method

.method private ֫(Ll/ۙ᩵֫;)V
    .locals 3

    .line 1123
    invoke-static {}, Ll/ۢ۬ܺ;->᩻()Ll/ۜ۬ܺ;

    move-result-object v0

    .line 1124
    iget-object v1, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1125
    iget-object v1, p0, Ll/᩹۬֫;->ܿ:Ll/ܺۧۧ;

    invoke-direct {p0, v0, v1, p1}, Ll/᩹۬֫;->֫(Ll/ۜ۬ܺ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)V

    .line 1126
    iget-object v1, p0, Ll/᩹۬֫;->ܳ:Ll/ܺۧۧ;

    iget-object v2, p0, Ll/᩹۬֫;->ܿ:Ll/ܺۧۧ;

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1127
    iget-object v1, p0, Ll/᩹۬֫;->ܳ:Ll/ܺۧۧ;

    invoke-direct {p0, v0, v1, p1}, Ll/᩹۬֫;->֫(Ll/ۜ۬ܺ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)V

    .line 1129
    :cond_0
    iget-object v1, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    iget-object v2, p0, Ll/᩹۬֫;->ܿ:Ll/ܺۧۧ;

    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    iget-object v2, p0, Ll/᩹۬֫;->ܳ:Ll/ܺۧۧ;

    .line 1130
    invoke-static {v1, v2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1131
    iget-object v1, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    invoke-direct {p0, v0, v1, p1}, Ll/᩹۬֫;->֫(Ll/ۜ۬ܺ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 1134
    :goto_0
    iget-object v2, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 1135
    iget-object v2, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܺۧۧ;

    invoke-direct {p0, v0, v2, p1}, Ll/᩹۬֫;->֫(Ll/ۜ۬ܺ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1137
    :cond_2
    iget-object v1, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    iget-object v2, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    invoke-virtual {v1, v2}, Ll/ܳ۬ܺ;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1138
    iget-object v1, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    invoke-direct {p0, v0, v1, p1}, Ll/᩹۬֫;->֫(Ll/ۜ۬ܺ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)V

    .line 1141
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ll/ۜ۬ܺ;->ۧ()Ll/ۢ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۬֫;->ܽ:Ll/ۢ۬ܺ;

    return-void
.end method

.method private ֫(Ll/ۜ۬ܺ;Ll/ܺۧۧ;Ll/ۙ᩵֫;)V
    .locals 2

    if-nez p2, :cond_0

    goto :goto_0

    .line 1151
    :cond_0
    iget-object v0, p2, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Ll/ۙ᩵֫;->֫(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 1152
    invoke-virtual {p1, p2, p3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    return-void

    .line 1154
    :cond_1
    iget-object p3, p0, Ll/᩹۬֫;->ܽ:Ll/ۢ۬ܺ;

    invoke-virtual {p3, p2}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ۙ᩵֫;

    if-eqz p3, :cond_2

    .line 1156
    invoke-virtual {p1, p2, p3}, Ll/ۜ۬ܺ;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ll/ۜ۬ܺ;

    :cond_2
    :goto_0
    return-void
.end method

.method public static ֫(Ll/ܺۧۧ;Ljava/lang/Object;ZIII)Z
    .locals 2

    .line 1212
    iget-object v0, p0, Ll/ܺۧۧ;->ᩳ:Ljava/lang/Object;

    iget v1, p0, Ll/ܺۧۧ;->֫:I

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    if-ne v1, p3, :cond_1

    .line 1216
    iget p1, p0, Ll/ܺۧۧ;->ۧ:I

    if-eq p1, p4, :cond_2

    :cond_1
    if-nez p2, :cond_3

    const/4 p1, -0x1

    if-ne v1, p1, :cond_3

    iget p0, p0, Ll/ܺۧۧ;->ܽ:I

    if-ne p0, p5, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    return v0
.end method


# virtual methods
.method public final ֫(Ll/ܺۧۧ;)Ll/ۙ᩵֫;
    .locals 1

    .line 1090
    iget-object v0, p0, Ll/᩹۬֫;->ܽ:Ll/ۢ۬ܺ;

    invoke-virtual {v0, p1}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۙ᩵֫;

    return-object p1
.end method

.method public final ֫()Ll/ܺۧۧ;
    .locals 1

    .line 1048
    iget-object v0, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    return-object v0
.end method

.method public final ֫(Ljava/util/List;Ll/ܺۧۧ;Ll/֨᩵֫;)V
    .locals 1

    .line 1109
    invoke-static {p1}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    .line 1110
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 1111
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺۧۧ;

    iput-object p1, p0, Ll/᩹۬֫;->ܿ:Ll/ܺۧۧ;

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    iput-object p2, p0, Ll/᩹۬֫;->ܳ:Ll/ܺۧۧ;

    .line 1114
    :cond_0
    iget-object p1, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    if-nez p1, :cond_1

    .line 1115
    iget-object p1, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    iget-object p2, p0, Ll/᩹۬֫;->ܿ:Ll/ܺۧۧ;

    iget-object v0, p0, Ll/᩹۬֫;->ᩳ:Ll/᩹᩵֫;

    .line 1116
    invoke-static {p3, p1, p2, v0}, Ll/᩹۬֫;->֫(Ll/֨᩵֫;Ll/ܳ۬ܺ;Ll/ܺۧۧ;Ll/᩹᩵֫;)Ll/ܺۧۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    .line 1119
    :cond_1
    invoke-interface {p3}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩹۬֫;->֫(Ll/ۙ᩵֫;)V

    return-void
.end method

.method public final ֫(Ll/֨᩵֫;)V
    .locals 3

    .line 1095
    iget-object v0, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    iget-object v1, p0, Ll/᩹۬֫;->ܿ:Ll/ܺۧۧ;

    iget-object v2, p0, Ll/᩹۬֫;->ᩳ:Ll/᩹᩵֫;

    .line 1096
    invoke-static {p1, v0, v1, v2}, Ll/᩹۬֫;->֫(Ll/֨᩵֫;Ll/ܳ۬ܺ;Ll/ܺۧۧ;Ll/᩹᩵֫;)Ll/ܺۧۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    return-void
.end method

.method public final ۧ()Ll/ܺۧۧ;
    .locals 1

    .line 1081
    iget-object v0, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-static {v0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۧۧ;

    return-object v0
.end method

.method public final ۧ(Ll/֨᩵֫;)V
    .locals 3

    .line 1101
    iget-object v0, p0, Ll/᩹۬֫;->ۧ:Ll/ܳ۬ܺ;

    iget-object v1, p0, Ll/᩹۬֫;->ܿ:Ll/ܺۧۧ;

    iget-object v2, p0, Ll/᩹۬֫;->ᩳ:Ll/᩹᩵֫;

    .line 1102
    invoke-static {p1, v0, v1, v2}, Ll/᩹۬֫;->֫(Ll/֨᩵֫;Ll/ܳ۬ܺ;Ll/ܺۧۧ;Ll/᩹᩵֫;)Ll/ܺۧۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩹۬֫;->֫:Ll/ܺۧۧ;

    .line 1103
    invoke-interface {p1}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩹۬֫;->֫(Ll/ۙ᩵֫;)V

    return-void
.end method

.method public final ܽ()Ll/ܺۧۧ;
    .locals 1

    .line 1059
    iget-object v0, p0, Ll/᩹۬֫;->ܿ:Ll/ܺۧۧ;

    return-object v0
.end method

.method public final ᩳ()Ll/ܺۧۧ;
    .locals 1

    .line 1070
    iget-object v0, p0, Ll/᩹۬֫;->ܳ:Ll/ܺۧۧ;

    return-object v0
.end method
