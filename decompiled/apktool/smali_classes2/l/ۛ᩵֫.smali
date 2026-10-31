.class public Ll/ۛ᩵֫;
.super Ljava/lang/Object;
.source "48R2"


# instance fields
.field public ֡:I

.field public ֨:Ll/ܳ۬ܺ;

.field public ֫:Ll/ۤ᩵֫;

.field public ۖ:I

.field public ۗ:I

.field public ۘ:I

.field public ۙ:Ll/ܳ۬ܺ;

.field public ۚ:Ljava/util/HashMap;

.field public ۛ:Z

.field public ۜ:I

.field public ۠:Ll/ܳ۬ܺ;

.field public ۡ:I

.field public ۢ:I

.field public ۤ:I

.field public ۧ:Ljava/util/HashSet;

.field public ۨ:I

.field public ۫:Z

.field public ۬:Z

.field public ܳ:Z

.field public ܶ:I

.field public ܺ:I

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:Z

.field public ᩴ:I

.field public ᩵:I

.field public ᩶:Ll/ܳ۬ܺ;

.field public ᩷:I

.field public ᩸:Ll/ܳ۬ܺ;

.field public ᩹:I

.field public ᩻:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    .line 117
    iput v0, p0, Ll/ۛ᩵֫;->ۖ:I

    .line 118
    iput v0, p0, Ll/ۛ᩵֫;->ܺ:I

    .line 119
    iput v0, p0, Ll/ۛ᩵֫;->ۡ:I

    .line 120
    iput v0, p0, Ll/ۛ᩵֫;->ۢ:I

    .line 121
    iput v0, p0, Ll/ۛ᩵֫;->ۨ:I

    .line 122
    iput v0, p0, Ll/ۛ᩵֫;->ۤ:I

    const/4 v1, 0x1

    .line 123
    iput-boolean v1, p0, Ll/ۛ᩵֫;->᩻:Z

    .line 124
    iput-boolean v1, p0, Ll/ۛ᩵֫;->ۛ:Z

    .line 125
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v2

    iput-object v2, p0, Ll/ۛ᩵֫;->ۙ:Ll/ܳ۬ܺ;

    .line 126
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v2

    iput-object v2, p0, Ll/ۛ᩵֫;->᩶:Ll/ܳ۬ܺ;

    const/4 v2, 0x0

    .line 127
    iput v2, p0, Ll/ۛ᩵֫;->ۗ:I

    .line 129
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v3

    iput-object v3, p0, Ll/ۛ᩵֫;->֨:Ll/ܳ۬ܺ;

    .line 130
    iput v2, p0, Ll/ۛ᩵֫;->ܶ:I

    .line 131
    iput v0, p0, Ll/ۛ᩵֫;->᩷:I

    .line 132
    iput v0, p0, Ll/ۛ᩵֫;->ۜ:I

    .line 133
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ᩵֫;->۠:Ll/ܳ۬ܺ;

    .line 134
    sget-object v0, Ll/ۤ᩵֫;->֫:Ll/ۤ᩵֫;

    iput-object v0, p0, Ll/ۛ᩵֫;->֫:Ll/ۤ᩵֫;

    .line 136
    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ᩵֫;->᩸:Ll/ܳ۬ܺ;

    .line 137
    iput v2, p0, Ll/ۛ᩵֫;->᩹:I

    .line 138
    iput-boolean v1, p0, Ll/ۛ᩵֫;->۫:Z

    .line 139
    iput v2, p0, Ll/ۛ᩵֫;->ܿ:I

    .line 140
    iput-boolean v2, p0, Ll/ۛ᩵֫;->۬:Z

    .line 142
    iput-boolean v2, p0, Ll/ۛ᩵֫;->ܳ:Z

    .line 144
    iput-boolean v2, p0, Ll/ۛ᩵֫;->ᩳ:Z

    .line 145
    iput-boolean v2, p0, Ll/ۛ᩵֫;->ܽ:Z

    .line 146
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۛ᩵֫;->ۚ:Ljava/util/HashMap;

    .line 147
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۛ᩵֫;->ۧ:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Ll/ۨ᩵֫;)V
    .locals 0

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    invoke-direct {p0, p1}, Ll/ۛ᩵֫;->ۧ(Ll/ۨ᩵֫;)V

    return-void
.end method

.method public static bridge synthetic ֡(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->֡:I

    return p0
.end method

.method public static bridge synthetic ֨(Ll/ۛ᩵֫;)Ll/ܳ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩵֫;->֨:Ll/ܳ۬ܺ;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩵֫;)Ll/ۤ᩵֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩵֫;->֫:Ll/ۤ᩵֫;

    return-object p0
.end method

.method public static bridge synthetic ۖ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ۖ:I

    return p0
.end method

.method public static bridge synthetic ۗ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ۗ:I

    return p0
.end method

.method public static bridge synthetic ۘ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ۘ:I

    return p0
.end method

.method public static bridge synthetic ۙ(Ll/ۛ᩵֫;)Ll/ܳ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩵֫;->ۙ:Ll/ܳ۬ܺ;

    return-object p0
.end method

.method public static bridge synthetic ۚ(Ll/ۛ᩵֫;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩵֫;->ۚ:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ۛ(Ll/ۛ᩵֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩵֫;->ۛ:Z

    return p0
.end method

.method public static bridge synthetic ۜ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ۜ:I

    return p0
.end method

.method public static bridge synthetic ۠(Ll/ۛ᩵֫;)Ll/ܳ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩵֫;->۠:Ll/ܳ۬ܺ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ۡ:I

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ۢ:I

    return p0
.end method

.method public static bridge synthetic ۤ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ۤ:I

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۛ᩵֫;)Ljava/util/HashSet;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩵֫;->ۧ:Ljava/util/HashSet;

    return-object p0
.end method

.method private ۧ(Ll/ۨ᩵֫;)V
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "preferredVideoMimeTypes",
            "preferredVideoLanguages",
            "preferredAudioLanguages",
            "preferredAudioMimeTypes",
            "audioOffloadPreferences",
            "preferredTextLanguages",
            "overrides",
            "disabledTrackTypes"
        }
    .end annotation

    .line 290
    iget v0, p1, Ll/ۨ᩵֫;->ۖ:I

    iput v0, p0, Ll/ۛ᩵֫;->ۖ:I

    .line 291
    iget v0, p1, Ll/ۨ᩵֫;->ܺ:I

    iput v0, p0, Ll/ۛ᩵֫;->ܺ:I

    .line 292
    iget v0, p1, Ll/ۨ᩵֫;->ۡ:I

    iput v0, p0, Ll/ۛ᩵֫;->ۡ:I

    .line 293
    iget v0, p1, Ll/ۨ᩵֫;->ۢ:I

    iput v0, p0, Ll/ۛ᩵֫;->ۢ:I

    .line 294
    iget v0, p1, Ll/ۨ᩵֫;->֡:I

    iput v0, p0, Ll/ۛ᩵֫;->֡:I

    .line 295
    iget v0, p1, Ll/ۨ᩵֫;->᩵:I

    iput v0, p0, Ll/ۛ᩵֫;->᩵:I

    .line 296
    iget v0, p1, Ll/ۨ᩵֫;->ᩴ:I

    iput v0, p0, Ll/ۛ᩵֫;->ᩴ:I

    .line 297
    iget v0, p1, Ll/ۨ᩵֫;->ۘ:I

    iput v0, p0, Ll/ۛ᩵֫;->ۘ:I

    .line 298
    iget v0, p1, Ll/ۨ᩵֫;->ۨ:I

    iput v0, p0, Ll/ۛ᩵֫;->ۨ:I

    .line 299
    iget v0, p1, Ll/ۨ᩵֫;->ۤ:I

    iput v0, p0, Ll/ۛ᩵֫;->ۤ:I

    .line 300
    iget-boolean v0, p1, Ll/ۨ᩵֫;->᩻:Z

    iput-boolean v0, p0, Ll/ۛ᩵֫;->᩻:Z

    .line 302
    iget-boolean v0, p1, Ll/ۨ᩵֫;->ۛ:Z

    iput-boolean v0, p0, Ll/ۛ᩵֫;->ۛ:Z

    .line 303
    iget-object v0, p1, Ll/ۨ᩵֫;->ۙ:Ll/ܳ۬ܺ;

    iput-object v0, p0, Ll/ۛ᩵֫;->ۙ:Ll/ܳ۬ܺ;

    .line 304
    iget-object v0, p1, Ll/ۨ᩵֫;->᩶:Ll/ܳ۬ܺ;

    iput-object v0, p0, Ll/ۛ᩵֫;->᩶:Ll/ܳ۬ܺ;

    .line 305
    iget v0, p1, Ll/ۨ᩵֫;->ۗ:I

    iput v0, p0, Ll/ۛ᩵֫;->ۗ:I

    .line 307
    iget-object v0, p1, Ll/ۨ᩵֫;->֨:Ll/ܳ۬ܺ;

    iput-object v0, p0, Ll/ۛ᩵֫;->֨:Ll/ܳ۬ܺ;

    .line 308
    iget v0, p1, Ll/ۨ᩵֫;->ܶ:I

    iput v0, p0, Ll/ۛ᩵֫;->ܶ:I

    .line 309
    iget v0, p1, Ll/ۨ᩵֫;->᩷:I

    iput v0, p0, Ll/ۛ᩵֫;->᩷:I

    .line 310
    iget v0, p1, Ll/ۨ᩵֫;->ۜ:I

    iput v0, p0, Ll/ۛ᩵֫;->ۜ:I

    .line 311
    iget-object v0, p1, Ll/ۨ᩵֫;->۠:Ll/ܳ۬ܺ;

    iput-object v0, p0, Ll/ۛ᩵֫;->۠:Ll/ܳ۬ܺ;

    .line 312
    iget-object v0, p1, Ll/ۨ᩵֫;->֫:Ll/ۤ᩵֫;

    iput-object v0, p0, Ll/ۛ᩵֫;->֫:Ll/ۤ᩵֫;

    .line 314
    iget-object v0, p1, Ll/ۨ᩵֫;->᩸:Ll/ܳ۬ܺ;

    iput-object v0, p0, Ll/ۛ᩵֫;->᩸:Ll/ܳ۬ܺ;

    .line 315
    iget v0, p1, Ll/ۨ᩵֫;->᩹:I

    iput v0, p0, Ll/ۛ᩵֫;->᩹:I

    .line 316
    iget-boolean v0, p1, Ll/ۨ᩵֫;->۫:Z

    iput-boolean v0, p0, Ll/ۛ᩵֫;->۫:Z

    .line 318
    iget v0, p1, Ll/ۨ᩵֫;->ܿ:I

    iput v0, p0, Ll/ۛ᩵֫;->ܿ:I

    .line 319
    iget-boolean v0, p1, Ll/ۨ᩵֫;->۬:Z

    iput-boolean v0, p0, Ll/ۛ᩵֫;->۬:Z

    .line 321
    iget-boolean v0, p1, Ll/ۨ᩵֫;->ܳ:Z

    iput-boolean v0, p0, Ll/ۛ᩵֫;->ܳ:Z

    .line 323
    iget-boolean v0, p1, Ll/ۨ᩵֫;->ᩳ:Z

    iput-boolean v0, p0, Ll/ۛ᩵֫;->ᩳ:Z

    .line 324
    iget-boolean v0, p1, Ll/ۨ᩵֫;->ܽ:Z

    iput-boolean v0, p0, Ll/ۛ᩵֫;->ܽ:Z

    .line 325
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p1, Ll/ۨ᩵֫;->ۧ:Ll/ۛ۬ܺ;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/ۛ᩵֫;->ۧ:Ljava/util/HashSet;

    .line 326
    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Ll/ۨ᩵֫;->ۚ:Ll/ۢ۬ܺ;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Ll/ۛ᩵֫;->ۚ:Ljava/util/HashMap;

    return-void
.end method

.method public static bridge synthetic ۨ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ۨ:I

    return p0
.end method

.method public static bridge synthetic ۫(Ll/ۛ᩵֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩵֫;->۫:Z

    return p0
.end method

.method public static bridge synthetic ۬(Ll/ۛ᩵֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩵֫;->۬:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ۛ᩵֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩵֫;->ܳ:Z

    return p0
.end method

.method public static bridge synthetic ܶ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ܶ:I

    return p0
.end method

.method public static bridge synthetic ܺ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ܺ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۛ᩵֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩵֫;->ܽ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۛ᩵֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩵֫;->ᩳ:Z

    return p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->ᩴ:I

    return p0
.end method

.method public static bridge synthetic ᩵(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->᩵:I

    return p0
.end method

.method public static bridge synthetic ᩶(Ll/ۛ᩵֫;)Ll/ܳ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩵֫;->᩶:Ll/ܳ۬ܺ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->᩷:I

    return p0
.end method

.method public static bridge synthetic ᩸(Ll/ۛ᩵֫;)Ll/ܳ۬ܺ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩵֫;->᩸:Ll/ܳ۬ܺ;

    return-object p0
.end method

.method public static bridge synthetic ᩹(Ll/ۛ᩵֫;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛ᩵֫;->᩹:I

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ۛ᩵֫;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ᩵֫;->᩻:Z

    return p0
.end method


# virtual methods
.method public ֫(I)Ll/ۛ᩵֫;
    .locals 2

    .line 829
    iget-object v0, p0, Ll/ۛ᩵֫;->ۚ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 830
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 831
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫᩵֫;

    .line 86
    iget-object v1, v1, Ll/۫᩵֫;->֫:Ll/۬᩵֫;

    iget v1, v1, Ll/۬᩵֫;->ܿ:I

    if-ne v1, p1, :cond_0

    .line 833
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method public ֫(IZ)Ll/ۛ᩵֫;
    .locals 0

    if-eqz p2, :cond_0

    .line 872
    iget-object p2, p0, Ll/ۛ᩵֫;->ۧ:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 874
    :cond_0
    iget-object p2, p0, Ll/ۛ᩵֫;->ۧ:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public ֫(Ljava/util/Set;)Ll/ۛ᩵֫;
    .locals 1

    .line 856
    iget-object v0, p0, Ll/ۛ᩵֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 857
    iget-object v0, p0, Ll/ۛ᩵֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public ֫(Ll/۫᩵֫;)Ll/ۛ᩵֫;
    .locals 2

    .line 86
    iget-object v0, p1, Ll/۫᩵֫;->֫:Ll/۬᩵֫;

    iget v1, v0, Ll/۬᩵֫;->ܿ:I

    .line 814
    invoke-virtual {p0, v1}, Ll/ۛ᩵֫;->֫(I)Ll/ۛ᩵֫;

    .line 815
    iget-object v1, p0, Ll/ۛ᩵֫;->ۚ:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public varargs ֫([Ljava/lang/String;)Ll/ۛ᩵֫;
    .locals 5

    .line 885
    sget v0, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v0, Ll/֫۬ܺ;

    invoke-direct {v0}, Ll/֫۬ܺ;-><init>()V

    .line 886
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    .line 155
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    invoke-static {v4}, Ll/ۘ֨֫;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 889
    :cond_0
    invoke-virtual {v0}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p1

    .line 712
    iput-object p1, p0, Ll/ۛ᩵֫;->᩸:Ll/ܳ۬ܺ;

    .line 713
    iput-boolean v2, p0, Ll/ۛ᩵֫;->۫:Z

    return-object p0
.end method

.method public ֫()Ll/ۨ᩵֫;
    .locals 1

    .line 881
    new-instance v0, Ll/ۨ᩵֫;

    invoke-direct {v0, p0}, Ll/ۨ᩵֫;-><init>(Ll/ۛ᩵֫;)V

    return-object v0
.end method

.method public final ֫(Ll/ۨ᩵֫;)V
    .locals 0

    .line 333
    invoke-direct {p0, p1}, Ll/ۛ᩵֫;->ۧ(Ll/ۨ᩵֫;)V

    return-void
.end method

.method public ۧ()Ll/ۛ᩵֫;
    .locals 1

    const/4 v0, -0x3

    .line 739
    iput v0, p0, Ll/ۛ᩵֫;->ܿ:I

    return-object p0
.end method

.method public ܽ()Ll/ۛ᩵֫;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 698
    invoke-virtual {p0, v0}, Ll/ۛ᩵֫;->֫([Ljava/lang/String;)Ll/ۛ᩵֫;

    move-result-object v0

    return-object v0
.end method

.method public ᩳ()Ll/ۛ᩵֫;
    .locals 1

    const/4 v0, 0x0

    .line 725
    iput v0, p0, Ll/ۛ᩵֫;->᩹:I

    .line 726
    iput-boolean v0, p0, Ll/ۛ᩵֫;->۫:Z

    return-object p0
.end method
