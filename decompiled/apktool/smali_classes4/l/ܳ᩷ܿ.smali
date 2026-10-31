.class public final Ll/ܳ᩷ܿ;
.super Ljava/lang/Object;
.source "B4S2"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/util/HashMap;

.field public final ܽ:Ljava/util/HashMap;

.field public final ܿ:Ljava/util/HashMap;

.field public ᩳ:Ll/۟ۜܿ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    new-instance v0, Ll/۟ۜܿ;

    invoke-direct {v0}, Ll/۟ۜܿ;-><init>()V

    iput-object v0, p0, Ll/ܳ᩷ܿ;->ᩳ:Ll/۟ۜܿ;

    .line 141
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳ᩷ܿ;->ۧ:Ljava/util/HashMap;

    .line 142
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳ᩷ܿ;->֫:Ljava/util/HashMap;

    .line 143
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳ᩷ܿ;->ܿ:Ljava/util/HashMap;

    .line 144
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳ᩷ܿ;->ܽ:Ljava/util/HashMap;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܳ᩷ܿ;-><init>()V

    return-void
.end method

.method public constructor <init>(Ll/ܿ᩷ܿ;)V
    .locals 4

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    new-instance v0, Ll/۟ۜܿ;

    invoke-direct {v0}, Ll/۟ۜܿ;-><init>()V

    iput-object v0, p0, Ll/ܳ᩷ܿ;->ᩳ:Ll/۟ۜܿ;

    .line 141
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܳ᩷ܿ;->ۧ:Ljava/util/HashMap;

    .line 142
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ܳ᩷ܿ;->֫:Ljava/util/HashMap;

    .line 143
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Ll/ܳ᩷ܿ;->ܿ:Ljava/util/HashMap;

    .line 144
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    iput-object v3, p0, Ll/ܳ᩷ܿ;->ܽ:Ljava/util/HashMap;

    .line 148
    invoke-static {p1}, Ll/ܿ᩷ܿ;->ܿ(Ll/ܿ᩷ܿ;)Ll/۟ۜܿ;

    move-result-object v3

    iput-object v3, p0, Ll/ܳ᩷ܿ;->ᩳ:Ll/۟ۜܿ;

    .line 149
    invoke-static {p1}, Ll/ܿ᩷ܿ;->ۧ(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 150
    invoke-static {p1}, Ll/ܿ᩷ܿ;->֫(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 151
    invoke-static {p1}, Ll/ܿ᩷ܿ;->᩻(Ll/ܿ᩷ܿ;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܳ᩷ܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩷ܿ;->֫:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܳ᩷ܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩷ܿ;->ۧ:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܳ᩷ܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩷ܿ;->ܽ:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܳ᩷ܿ;)Ljava/util/Map;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩷ܿ;->ܿ:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܳ᩷ܿ;)Ll/۟ۜܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩷ܿ;->ᩳ:Ll/۟ۜܿ;

    return-object p0
.end method
