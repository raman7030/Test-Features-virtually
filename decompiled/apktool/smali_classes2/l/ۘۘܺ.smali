.class public final Ll/ۘۘܺ;
.super Ljava/lang/Object;
.source "4BHP"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ۗ:[[Ll/᩸ۡܺ;

.field public final ۙ:Ljava/util/ArrayList;

.field public ۬:I

.field public final ᩶:Ll/᩷ۘܺ;

.field public ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(ILl/᩷ۘܺ;)V
    .locals 0

    .line 166
    invoke-direct {p0, p2}, Ll/ۘۘܺ;-><init>(Ll/᩷ۘܺ;)V

    .line 167
    iput p1, p0, Ll/ۘۘܺ;->۬:I

    return-void
.end method

.method public constructor <init>(Ll/᩷ۘܺ;)V
    .locals 3

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۜ()I

    move-result v0

    iput v0, p0, Ll/ۘۘܺ;->᩹:I

    .line 116
    iput-object p1, p0, Ll/ۘۘܺ;->᩶:Ll/᩷ۘܺ;

    .line 122
    iput v0, p0, Ll/ۘۘܺ;->᩸:I

    const/4 v1, 0x0

    .line 123
    iput v1, p0, Ll/ۘۘܺ;->۬:I

    .line 124
    invoke-virtual {p1}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [[Ll/᩸ۡܺ;

    iput-object v2, p0, Ll/ۘۘܺ;->ۗ:[[Ll/᩸ۡܺ;

    .line 126
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ۘۘܺ;->ۙ:Ljava/util/ArrayList;

    .line 144
    new-array v0, v0, [Ll/᩸ۡܺ;

    .line 145
    :goto_0
    iget v2, p0, Ll/ۘۘܺ;->᩹:I

    if-ge v1, v2, :cond_0

    .line 147
    sget-object v2, Ll/۟ܺܺ;->ۨ֫:Ll/۟ܺܺ;

    invoke-static {v1, v2}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 155
    :cond_0
    iget-object v1, p0, Ll/ۘۘܺ;->ۗ:[[Ll/᩸ۡܺ;

    invoke-virtual {p1}, Ll/᩷ۘܺ;->ᩳ()I

    move-result p1

    aput-object v0, v1, p1

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘۘܺ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۘۘܺ;->᩸:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ۘۘܺ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۘۘܺ;->᩸:I

    return-void
.end method

.method public static ֫(Ll/ۘۘܺ;Ll/᩸ۡܺ;)V
    .locals 2

    .line 241
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    .line 242
    invoke-virtual {p1}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object p1

    .line 244
    iget-object p0, p0, Ll/ۘۘܺ;->ۙ:Ljava/util/ArrayList;

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 245
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v0, :cond_0

    const/4 v1, 0x0

    .line 246
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 249
    :cond_0
    invoke-virtual {p0, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ۧ(Ll/ۘۘܺ;I)Ll/ᩴۡܺ;
    .locals 1

    .line 228
    iget-object p0, p0, Ll/ۘۘܺ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 229
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴۡܺ;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۘۘܺ;)Ll/᩷ۘܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۘܺ;->᩶:Ll/᩷ۘܺ;

    return-object p0
.end method

.method public static ܽ(Ll/ۘۘܺ;I)Z
    .locals 0

    .line 261
    iget p0, p0, Ll/ۘۘܺ;->۬:I

    if-ge p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۘۘܺ;)[[Ll/᩸ۡܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۘܺ;->ۗ:[[Ll/᩸ۡܺ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۘۘܺ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۘۘܺ;->۬:I

    return p0
.end method

.method public static ᩳ(Ll/ۘۘܺ;I)Z
    .locals 0

    .line 273
    iget p0, p0, Ll/ۘۘܺ;->᩹:I

    if-ge p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 177
    new-instance v0, Ll/ۢۘܺ;

    invoke-direct {v0, p0}, Ll/ۢۘܺ;-><init>(Ll/ۘۘܺ;)V

    iget-object v1, p0, Ll/ۘۘܺ;->᩶:Ll/᩷ۘܺ;

    invoke-virtual {v1, v0}, Ll/᩷ۘܺ;->ۧ(Ll/ۧۘܺ;)V

    .line 185
    iget v0, p0, Ll/ۘۘܺ;->᩸:I

    invoke-virtual {v1, v0}, Ll/᩷ۘܺ;->ܿ(I)V

    .line 186
    invoke-virtual {v1}, Ll/᩷ۘܺ;->ۖ()V

    return-void
.end method
