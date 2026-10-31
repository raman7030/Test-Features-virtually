.class public final Ll/ᩴ᩵ۘ;
.super Ljava/lang/Object;
.source "48CR"


# instance fields
.field public ֫:D

.field public ۖ:Ll/᩺ᩴۘ;

.field public ۘ:Ll/ۤᩴۘ;

.field public ۜ:Ll/ۨᩴۘ;

.field public ۡ:Ll/ۨᩴۘ;

.field public final synthetic ۢ:Ll/֡᩵ۘ;

.field public ۧ:I

.field public ܳ:Ll/۟ᩴۘ;

.field public ܺ:Ll/᩶᩵ۘ;

.field public ܽ:Ll/᩵᩵ۘ;

.field public ܿ:Ll/ܰᩴۘ;

.field public ᩳ:Ll/֫᩵ۘ;

.field public ᩷:Z

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/֡᩵ۘ;I)V
    .locals 2

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩵ۘ;->ۢ:Ll/֡᩵ۘ;

    const-wide v0, 0x3fc5555555555555L    # 0.16666666666666666

    .line 90
    iput-wide v0, p0, Ll/ᩴ᩵ۘ;->֫:D

    .line 104
    new-instance p1, Ll/ۘ᩵ۘ;

    invoke-direct {p1, p0}, Ll/ۘ᩵ۘ;-><init>(Ll/ᩴ᩵ۘ;)V

    iput-object p1, p0, Ll/ᩴ᩵ۘ;->ܺ:Ll/᩶᩵ۘ;

    .line 97
    iput p2, p0, Ll/ᩴ᩵ۘ;->ۧ:I

    const/16 p1, 0x9

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    .line 99
    iput-boolean p1, p0, Ll/ᩴ᩵ۘ;->᩷:Z

    const/16 p1, 0x80

    .line 100
    iput p1, p0, Ll/ᩴ᩵ۘ;->᩻:I

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ᩴ᩵ۘ;)I
    .locals 0

    .line 81
    iget p0, p0, Ll/ᩴ᩵ۘ;->᩻:I

    return p0
.end method

.method public static ֫(Ll/ᩴ᩵ۘ;Ll/᩷᩵ۘ;)V
    .locals 4

    .line 141
    move-object v0, p1

    check-cast v0, Ll/᩻᩵ۘ;

    const-string v1, "FreqScaler"

    .line 144
    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ljava/lang/String;)Ll/᩸ᩴۘ;

    move-result-object v1

    check-cast v1, Ll/۠ᩴۘ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 146
    invoke-virtual {v1}, Ll/ܺᩴۘ;->ᩳ()V

    .line 147
    iget-object v3, p0, Ll/ᩴ᩵ۘ;->ܳ:Ll/۟ᩴۘ;

    iget-object v3, v3, Ll/۟ᩴۘ;->᩷:Ll/ܶᩴۘ;

    .line 65
    invoke-virtual {v3, v2, v1, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    :cond_0
    const-string v1, "Timbre"

    .line 150
    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ljava/lang/String;)Ll/᩸ᩴۘ;

    move-result-object v1

    check-cast v1, Ll/۠ᩴۘ;

    if-eqz v1, :cond_1

    .line 152
    invoke-virtual {v1}, Ll/ܺᩴۘ;->ᩳ()V

    .line 153
    iget-object v3, p0, Ll/ᩴ᩵ۘ;->ۡ:Ll/ۨᩴۘ;

    iget-object v3, v3, Ll/ܿ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    .line 65
    invoke-virtual {v3, v2, v1, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 154
    iget-object v3, p0, Ll/ᩴ᩵ۘ;->ۡ:Ll/ۨᩴۘ;

    iget-object v3, v3, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v3, v1}, Ll/۠ᩴۘ;->֫(Ll/۠ᩴۘ;)V

    :cond_1
    const-string v1, "Pressure"

    .line 157
    invoke-virtual {v0, v1}, Ll/᩻᩵ۘ;->֫(Ljava/lang/String;)Ll/᩸ᩴۘ;

    move-result-object v0

    check-cast v0, Ll/۠ᩴۘ;

    if-eqz v0, :cond_2

    .line 159
    invoke-virtual {v0}, Ll/ܺᩴۘ;->ᩳ()V

    .line 160
    iget-object v1, p0, Ll/ᩴ᩵ۘ;->ۜ:Ll/ۨᩴۘ;

    iget-object v1, v1, Ll/ܿ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    .line 65
    invoke-virtual {v1, v2, v0, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 161
    iget-object v1, p0, Ll/ᩴ᩵ۘ;->ۜ:Ll/ۨᩴۘ;

    iget-object v1, v1, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v1, v0}, Ll/۠ᩴۘ;->֫(Ll/۠ᩴۘ;)V

    .line 163
    :cond_2
    invoke-interface {p1}, Ll/ۜ᩵ۘ;->ᩳ()Ll/ܶᩴۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺᩴۘ;->ᩳ()V

    .line 164
    invoke-interface {p1}, Ll/ۜ᩵ۘ;->ᩳ()Ll/ܶᩴۘ;

    move-result-object p1

    iget-object p0, p0, Ll/ᩴ᩵ۘ;->ۖ:Ll/᩺ᩴۘ;

    iget-object p0, p0, Ll/ᩳ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {p1, v2, p0, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    return-void
.end method


# virtual methods
.method public final ֫(D)V
    .locals 2

    const-wide/high16 v0, 0x4028000000000000L    # 12.0

    div-double/2addr p1, v0

    .line 210
    iput-wide p1, p0, Ll/ᩴ᩵ۘ;->֫:D

    return-void
.end method

.method public final ֫(I)V
    .locals 4

    .line 188
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۢ:Ll/֡᩵ۘ;

    invoke-static {v0}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0}, Ll/۟ۘۘ;->֫()Ll/᩸֨ۘ;

    move-result-object v0

    .line 192
    iget-object v1, p0, Ll/ᩴ᩵ۘ;->ܽ:Ll/᩵᩵ۘ;

    invoke-static {v1}, Ll/᩵᩵ۘ;->ۧ(Ll/᩵᩵ۘ;)Ll/᩸᩵ۘ;

    move-result-object v1

    .line 184
    iget v2, p0, Ll/ᩴ᩵ۘ;->ۧ:I

    shl-int/lit8 v2, v2, 0x8

    add-int/2addr v2, p1

    .line 221
    invoke-virtual {v1}, Ll/᩸᩵ۘ;->֫()Ll/ۙۘۘ;

    move-result-object p1

    new-instance v3, Ll/۠᩵ۘ;

    invoke-direct {v3, v1, v2}, Ll/۠᩵ۘ;-><init>(Ll/᩸᩵ۘ;I)V

    check-cast p1, Ll/۟ۘۘ;

    invoke-virtual {p1, v0, v3}, Ll/۟ۘۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ֫(ID)V
    .locals 11

    .line 196
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۢ:Ll/֡᩵ۘ;

    invoke-static {v0}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0}, Ll/۟ۘۘ;->֫()Ll/᩸֨ۘ;

    move-result-object v0

    int-to-double v1, p1

    .line 200
    invoke-static {v1, v2}, Ll/֨֨ۘ;->ۧ(D)D

    move-result-wide v7

    .line 201
    iget-object v1, p0, Ll/ᩴ᩵ۘ;->ܽ:Ll/᩵᩵ۘ;

    invoke-static {v1}, Ll/᩵᩵ۘ;->ۧ(Ll/᩵᩵ۘ;)Ll/᩸᩵ۘ;

    move-result-object v4

    .line 184
    iget v1, p0, Ll/ᩴ᩵ۘ;->ۧ:I

    shl-int/lit8 v1, v1, 0x8

    add-int v5, v1, p1

    .line 208
    invoke-virtual {v4}, Ll/᩸᩵ۘ;->֫()Ll/ۙۘۘ;

    move-result-object p1

    new-instance v1, Ll/֨᩵ۘ;

    iget-object v6, p0, Ll/ᩴ᩵ۘ;->ܺ:Ll/᩶᩵ۘ;

    move-object v3, v1

    move-wide v9, p2

    invoke-direct/range {v3 .. v10}, Ll/֨᩵ۘ;-><init>(Ll/᩸᩵ۘ;ILl/᩶᩵ۘ;DD)V

    check-cast p1, Ll/۟ۘۘ;

    invoke-virtual {p1, v0, v1}, Ll/۟ۘۘ;->֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V

    return-void
.end method

.method public final ֫(Ll/᩵᩵ۘ;)V
    .locals 11

    .line 113
    iput-object p1, p0, Ll/ᩴ᩵ۘ;->ܽ:Ll/᩵᩵ۘ;

    .line 114
    iget-object p1, p0, Ll/ᩴ᩵ۘ;->ۢ:Ll/֡᩵ۘ;

    invoke-static {p1}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    new-instance v1, Ll/۟ᩴۘ;

    invoke-direct {v1}, Ll/۟ᩴۘ;-><init>()V

    iput-object v1, p0, Ll/ᩴ᩵ۘ;->ܳ:Ll/۟ᩴۘ;

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0, v1}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 115
    invoke-static {p1}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    new-instance v1, Ll/֫᩵ۘ;

    .line 40
    invoke-direct {v1}, Ll/᩻᩵ۘ;-><init>()V

    .line 41
    new-instance v2, Ll/۠ᩴۘ;

    const-string v3, "Frequency"

    invoke-direct {v2, v3}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v2, v1, Ll/֫᩵ۘ;->᩻:Ll/۠ᩴۘ;

    invoke-virtual {v1, v2}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide v5, 0x407b800000000000L    # 440.0

    const-wide v7, 0x40bf400000000000L    # 8000.0

    const-wide/high16 v3, 0x4044000000000000L    # 40.0

    .line 42
    invoke-virtual/range {v2 .. v8}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 43
    new-instance v2, Ll/۠ᩴۘ;

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const/4 v5, 0x1

    const-string v6, "Amplitude"

    .line 51
    invoke-direct {v2, v5, v6, v3, v4}, Ll/۠ᩴۘ;-><init>(ILjava/lang/String;D)V

    .line 43
    iput-object v2, v1, Ll/֫᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v1, v2}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 44
    new-instance v2, Ll/᩹ᩴۘ;

    const-string v3, "Phase"

    .line 31
    invoke-direct {v2, v3}, Ll/᩸ᩴۘ;-><init>(Ljava/lang/String;)V

    .line 44
    iput-object v2, v1, Ll/֫᩵ۘ;->᩷:Ll/᩹ᩴۘ;

    invoke-virtual {v1, v2}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 45
    new-instance v2, Ll/ܶᩴۘ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ܶᩴۘ;-><init>(I)V

    iput-object v2, v1, Ll/֫᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    invoke-virtual {v1, v2}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 115
    iput-object v1, p0, Ll/ᩴ᩵ۘ;->ᩳ:Ll/֫᩵ۘ;

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0, v1}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 119
    invoke-static {p1}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    new-instance v1, Ll/ۨᩴۘ;

    invoke-direct {v1}, Ll/ۨᩴۘ;-><init>()V

    iput-object v1, p0, Ll/ᩴ᩵ۘ;->ۡ:Ll/ۨᩴۘ;

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0, v1}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 120
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۡ:Ll/ۨᩴۘ;

    iget-object v0, v0, Ll/ۨᩴۘ;->ۖ:Ll/۠ᩴۘ;

    const-wide v1, 0x3f947ae147ae147bL    # 0.02

    invoke-virtual {v0, v1, v2}, Ll/۠ᩴۘ;->֫(D)V

    .line 121
    invoke-static {p1}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    new-instance v3, Ll/ۨᩴۘ;

    invoke-direct {v3}, Ll/ۨᩴۘ;-><init>()V

    iput-object v3, p0, Ll/ᩴ᩵ۘ;->ۜ:Ll/ۨᩴۘ;

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0, v3}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 122
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۜ:Ll/ۨᩴۘ;

    iget-object v0, v0, Ll/ۨᩴۘ;->ۖ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v1, v2}, Ll/۠ᩴۘ;->֫(D)V

    .line 123
    invoke-static {p1}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    new-instance v3, Ll/ۤᩴۘ;

    invoke-direct {v3}, Ll/ۤᩴۘ;-><init>()V

    iput-object v3, p0, Ll/ᩴ᩵ۘ;->ۘ:Ll/ۤᩴۘ;

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0, v3}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 124
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۘ:Ll/ۤᩴۘ;

    iget-object v0, v0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v0, v3, v4}, Ll/۠ᩴۘ;->֫(D)V

    .line 125
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۘ:Ll/ۤᩴۘ;

    iget-object v0, v0, Ll/ۤᩴۘ;->ܺ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v1, v2}, Ll/۠ᩴۘ;->֫(D)V

    .line 126
    invoke-static {p1}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    new-instance v1, Ll/᩺ᩴۘ;

    .line 39
    invoke-direct {v1}, Ll/ᩳ᩵ۘ;-><init>()V

    .line 126
    iput-object v1, p0, Ll/ᩴ᩵ۘ;->ۖ:Ll/᩺ᩴۘ;

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0, v1}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 127
    invoke-static {p1}, Ll/֡᩵ۘ;->֫(Ll/֡᩵ۘ;)Ll/ۙۘۘ;

    move-result-object v0

    new-instance v1, Ll/ܰᩴۘ;

    .line 41
    invoke-direct {v1}, Ll/᩻᩵ۘ;-><init>()V

    .line 42
    new-instance v2, Ll/۠ᩴۘ;

    const-string v3, "Input"

    invoke-direct {v2, v3}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v2, v1, Ll/ܰᩴۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v1, v2}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 43
    new-instance v4, Ll/۠ᩴۘ;

    const-string v2, "Pan"

    invoke-direct {v4, v2}, Ll/۠ᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v4, v1, Ll/ܰᩴۘ;->ۜ:Ll/۠ᩴۘ;

    invoke-virtual {v1, v4}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    const-wide/16 v7, 0x0

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    .line 44
    invoke-virtual/range {v4 .. v10}, Ll/۠ᩴۘ;->֫(DDD)V

    .line 45
    new-instance v2, Ll/ܶᩴۘ;

    const-string v3, "Output"

    invoke-direct {v2, v3}, Ll/ܶᩴۘ;-><init>(Ljava/lang/String;)V

    iput-object v2, v1, Ll/ܰᩴۘ;->᩻:Ll/ܶᩴۘ;

    invoke-virtual {v1, v2}, Ll/᩻᩵ۘ;->֫(Ll/᩸ᩴۘ;)V

    .line 127
    iput-object v1, p0, Ll/ᩴ᩵ۘ;->ܿ:Ll/ܰᩴۘ;

    check-cast v0, Ll/۟ۘۘ;

    invoke-virtual {v0, v1}, Ll/۟ۘۘ;->֫(Ll/᩻᩵ۘ;)V

    .line 129
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ܳ:Ll/۟ᩴۘ;

    iget-object v0, v0, Ll/۟ᩴۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/۠ᩴۘ;->᩷()V

    .line 130
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ᩳ:Ll/֫᩵ۘ;

    iget-object v0, v0, Ll/֫᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    iget-object v1, p0, Ll/ᩴ᩵ۘ;->ܳ:Ll/۟ᩴۘ;

    iget-object v1, v1, Ll/۟ᩴۘ;->ܳ:Ll/۠ᩴۘ;

    const/4 v2, 0x0

    .line 65
    invoke-virtual {v0, v2, v1, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 131
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ᩳ:Ll/֫᩵ۘ;

    iget-object v0, v0, Ll/֫᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4}, Ll/۠ᩴۘ;->֫(D)V

    .line 132
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ᩳ:Ll/֫᩵ۘ;

    iget-object v0, v0, Ll/֫᩵ۘ;->᩻:Ll/۠ᩴۘ;

    const-wide/high16 v3, 0x4014000000000000L    # 5.0

    invoke-virtual {v0, v3, v4}, Ll/۠ᩴۘ;->֫(D)V

    .line 134
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۘ:Ll/ۤᩴۘ;

    iget-object v0, v0, Ll/ܿ᩵ۘ;->᩻:Ll/ܶᩴۘ;

    iget-object v1, p0, Ll/ᩴ᩵ۘ;->ۖ:Ll/᩺ᩴۘ;

    iget-object v1, v1, Ll/ᩳ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {v0, v2, v1, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 135
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۖ:Ll/᩺ᩴۘ;

    iget-object v0, v0, Ll/ᩳ᩵ۘ;->ۜ:Ll/ܶᩴۘ;

    iget-object v1, p0, Ll/ᩴ᩵ۘ;->ܿ:Ll/ܰᩴۘ;

    iget-object v1, v1, Ll/ܰᩴۘ;->ܳ:Ll/۠ᩴۘ;

    .line 65
    invoke-virtual {v0, v2, v1, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 136
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ܿ:Ll/ܰᩴۘ;

    iget-object v0, v0, Ll/ܰᩴۘ;->᩻:Ll/ܶᩴۘ;

    invoke-static {p1}, Ll/֡᩵ۘ;->ۧ(Ll/֡᩵ۘ;)Ll/ܽ᩵ۘ;

    move-result-object v1

    iget-object v1, v1, Ll/ܽ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0, v2, v1, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    .line 137
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ܿ:Ll/ܰᩴۘ;

    iget-object v0, v0, Ll/ܰᩴۘ;->᩻:Ll/ܶᩴۘ;

    invoke-static {p1}, Ll/֡᩵ۘ;->ۧ(Ll/֡᩵ۘ;)Ll/ܽ᩵ۘ;

    move-result-object p1

    iget-object p1, p1, Ll/ܽ᩵ۘ;->᩻:Ll/۠ᩴۘ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1, v2}, Ll/ܶᩴۘ;->֫(ILl/۠ᩴۘ;I)V

    return-void
.end method

.method public final ۧ(D)V
    .locals 1

    .line 226
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ܿ:Ll/ܰᩴۘ;

    iget-object v0, v0, Ll/ܰᩴۘ;->ۜ:Ll/۠ᩴۘ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩴۘ;->֫(D)V

    return-void
.end method

.method public final ۧ(I)V
    .locals 1

    .line 168
    iget-boolean v0, p0, Ll/ᩴ᩵ۘ;->᩷:Z

    if-nez v0, :cond_0

    .line 169
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ܽ:Ll/᩵᩵ۘ;

    invoke-static {v0}, Ll/᩵᩵ۘ;->֫(Ll/᩵᩵ۘ;)Ll/᩹᩵ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹᩵ۘ;->ۧ()I

    move-result v0

    rem-int/2addr p1, v0

    .line 170
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ܽ:Ll/᩵᩵ۘ;

    invoke-static {v0}, Ll/᩵᩵ۘ;->֫(Ll/᩵᩵ۘ;)Ll/᩹᩵ۘ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹᩵ۘ;->ܽ()[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    .line 172
    iput p1, p0, Ll/ᩴ᩵ۘ;->᩻:I

    :cond_0
    return-void
.end method

.method public final ܳ(D)V
    .locals 1

    .line 214
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ᩳ:Ll/֫᩵ۘ;

    iget-object v0, v0, Ll/֫᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩴۘ;->֫(D)V

    return-void
.end method

.method public final ܽ(D)V
    .locals 3

    .line 206
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ܳ:Ll/۟ᩴۘ;

    iget-object v0, v0, Ll/۟ᩴۘ;->ܳ:Ll/۠ᩴۘ;

    iget-wide v1, p0, Ll/ᩴ᩵ۘ;->֫:D

    mul-double v1, v1, p1

    invoke-virtual {v0, v1, v2}, Ll/۠ᩴۘ;->֫(D)V

    return-void
.end method

.method public final ܿ(D)V
    .locals 4

    .line 233
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۡ:Ll/ۨᩴۘ;

    iget-object v0, v0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/۠ᩴۘ;->᩻()D

    move-result-wide v0

    .line 234
    iget-object v2, p0, Ll/ᩴ᩵ۘ;->ۡ:Ll/ۨᩴۘ;

    iget-object v2, v2, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v2}, Ll/۠ᩴۘ;->ܳ()D

    move-result-wide v2

    sub-double/2addr v2, v0

    mul-double v2, v2, p1

    add-double/2addr v2, v0

    .line 236
    iget-object p1, p0, Ll/ᩴ᩵ۘ;->ۡ:Ll/ۨᩴۘ;

    iget-object p1, p1, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {p1, v2, v3}, Ll/۠ᩴۘ;->֫(D)V

    return-void
.end method

.method public final ᩳ(D)V
    .locals 4

    .line 243
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۜ:Ll/ۨᩴۘ;

    iget-object v0, v0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0}, Ll/۠ᩴۘ;->᩻()D

    move-result-wide v0

    .line 244
    iget-object v2, p0, Ll/ᩴ᩵ۘ;->ۜ:Ll/ۨᩴۘ;

    iget-object v2, v2, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v2}, Ll/۠ᩴۘ;->ܳ()D

    move-result-wide v2

    div-double/2addr v2, v0

    .line 246
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    mul-double p1, p1, v0

    .line 247
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۜ:Ll/ۨᩴۘ;

    iget-object v0, v0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩴۘ;->֫(D)V

    return-void
.end method

.method public final ᩻(D)V
    .locals 2

    const-wide v0, 0x40eecef780992203L    # 63095.73444801944

    .line 221
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p1

    const-wide v0, 0x3ef09e6a4f05e621L    # 1.5848931924611107E-5

    mul-double p1, p1, v0

    .line 222
    iget-object v0, p0, Ll/ᩴ᩵ۘ;->ۘ:Ll/ۤᩴۘ;

    iget-object v0, v0, Ll/ܿ᩵ۘ;->ܳ:Ll/۠ᩴۘ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩴۘ;->֫(D)V

    return-void
.end method
