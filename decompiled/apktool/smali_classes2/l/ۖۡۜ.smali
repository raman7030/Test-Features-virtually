.class public final Ll/ۖۡۜ;
.super Ljava/lang/Object;
.source "46X2"


# instance fields
.field public ֫:Ljava/util/List;

.field public final ۧ:Ll/ܶ᩵ܿ;

.field public ܽ:I

.field public final ܿ:Ll/۫᩵ܿ;

.field public ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;)V
    .locals 1

    const/4 v0, 0x0

    .line 737
    invoke-direct {p0, p1, v0}, Ll/ۖۡۜ;-><init>(Ll/ܶ᩵ܿ;Ll/۫᩵ܿ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/۫᩵ܿ;)V
    .locals 0

    .line 740
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 741
    iput-object p1, p0, Ll/ۖۡۜ;->ۧ:Ll/ܶ᩵ܿ;

    .line 742
    iput-object p2, p0, Ll/ۖۡۜ;->ܿ:Ll/۫᩵ܿ;

    return-void
.end method

.method public synthetic constructor <init>(Ll/ܶ᩵ܿ;Ll/۫᩵ܿ;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۖۡۜ;-><init>(Ll/ܶ᩵ܿ;Ll/۫᩵ܿ;)V

    return-void
.end method

.method public static ֫(Ll/ۖۡۜ;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 748
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 749
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۫᩵ܿ;

    .line 750
    invoke-static {p0, v2, p2, p3}, Ll/֡ۡۜ;->֫(Ll/ۖۡۜ;Ll/۫᩵ܿ;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 751
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 755
    :cond_0
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object p0

    .line 752
    invoke-static {p0, p2, p3, v2}, Ll/֡ۡۜ;->֫(Lbin/mt/json/JSONArray;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 759
    :cond_1
    iput-object p1, p0, Ll/ۖۡۜ;->֫:Ljava/util/List;

    const/4 p1, 0x0

    .line 760
    iput p1, p0, Ll/ۖۡۜ;->ܽ:I

    const/4 p1, 0x1

    .line 761
    iput-boolean p1, p0, Ll/ۖۡۜ;->ᩳ:Z

    return-void
.end method
