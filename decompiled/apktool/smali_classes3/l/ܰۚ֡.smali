.class public final Ll/ܰۚ֡;
.super Ljava/lang/Object;
.source "64JA"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۜ:Ljava/util/ArrayList;

.field public final ۡ:Ljava/util/ArrayList;

.field public ۢ:I

.field public final ۧ:Ljava/util/ArrayList;

.field public ܳ:Ll/۬ܿܳ;

.field public ܽ:Ljava/util/LinkedHashSet;

.field public final ܿ:Ljava/util/ArrayList;

.field public ᩳ:Ll/ۛۚ֡;

.field public ᩷:I

.field public final ᩻:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۚ֡;->֫:Ljava/util/ArrayList;

    .line 145
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۚ֡;->ܿ:Ljava/util/ArrayList;

    .line 147
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۚ֡;->ۧ:Ljava/util/ArrayList;

    .line 148
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۚ֡;->ۜ:Ljava/util/ArrayList;

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܰۚ֡;->ۡ:Ljava/util/ArrayList;

    .line 150
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܰۚ֡;->᩻:Ljava/util/HashSet;

    .line 152
    invoke-static {}, Ll/᩵᩵֡;->ۢ()Ljava/util/LinkedHashSet;

    move-result-object v0

    iput-object v0, p0, Ll/ܰۚ֡;->ܽ:Ljava/util/LinkedHashSet;

    .line 154
    sget-object v0, Ll/ۛۚ֡;->ۙ:Ll/ۛۚ֡;

    iput-object v0, p0, Ll/ܰۚ֡;->ᩳ:Ll/ۛۚ֡;

    const/16 v0, 0x64

    .line 155
    iput v0, p0, Ll/ܰۚ֡;->ۢ:I

    .line 156
    iput v0, p0, Ll/ܰۚ֡;->᩷:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܰۚ֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۚ֡;->֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۜ(Ll/ܰۚ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰۚ֡;->᩷:I

    return p0
.end method

.method public static ۡ(Ll/ܰۚ֡;)Ll/᩺ۚ֡;
    .locals 1

    .line 400
    iget-object p0, p0, Ll/ܰۚ֡;->ܳ:Ll/۬ܿܳ;

    if-eqz p0, :cond_0

    return-object p0

    .line 403
    :cond_0
    new-instance p0, Ll/᩶ۢᩴ;

    const/16 v0, 0x9

    invoke-direct {p0, v0}, Ll/᩶ۢᩴ;-><init>(I)V

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ܰۚ֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۚ֡;->ۡ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܰۚ֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۚ֡;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܰۚ֡;)Ljava/util/HashSet;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۚ֡;->᩻:Ljava/util/HashSet;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܰۚ֡;)Ljava/util/LinkedHashSet;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۚ֡;->ܽ:Ljava/util/LinkedHashSet;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܰۚ֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۚ֡;->ܿ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܰۚ֡;)Ll/ۛۚ֡;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۚ֡;->ᩳ:Ll/ۛۚ֡;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ܰۚ֡;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܰۚ֡;->ۢ:I

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ܰۚ֡;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܰۚ֡;->ۜ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ll/֫֨֡;
    .locals 1

    .line 162
    new-instance v0, Ll/֫֨֡;

    invoke-direct {v0, p0}, Ll/֫֨֡;-><init>(Ll/ܰۚ֡;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Iterable;)V
    .locals 2

    const-string v0, "extensions must not be null"

    .line 170
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖᩴ֡;

    .line 172
    instance-of v1, v0, Ll/۟ۚ֡;

    if-eqz v1, :cond_0

    .line 173
    check-cast v0, Ll/۟ۚ֡;

    .line 174
    invoke-interface {v0, p0}, Ll/۟ۚ֡;->֫(Ll/ܰۚ֡;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ֫(Ll/֡ᩴ֡;)V
    .locals 1

    .line 336
    iget-object v0, p0, Ll/ܰۚ֡;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ۛۚ֡;)V
    .locals 0

    .line 227
    iput-object p1, p0, Ll/ܰۚ֡;->ᩳ:Ll/ۛۚ֡;

    return-void
.end method

.method public final ֫(Ll/۬ܿܳ;)V
    .locals 0

    .line 395
    iput-object p1, p0, Ll/ܰۚ֡;->ܳ:Ll/۬ܿܳ;

    return-void
.end method

.method public final ֫(Ll/ܳ֨֡;)V
    .locals 1

    .line 316
    iget-object v0, p0, Ll/ܰۚ֡;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ܺ֨֡;)V
    .locals 1

    .line 298
    iget-object v0, p0, Ll/ܰۚ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Ll/ᩳ᩵֡;)V
    .locals 1

    .line 377
    iget-object v0, p0, Ll/ܰۚ֡;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
