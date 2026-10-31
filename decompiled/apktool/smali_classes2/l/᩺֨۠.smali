.class public final Ll/᩺֨۠;
.super Ll/֫۠۠;
.source "G3L1"


# instance fields
.field public final ᩶:Ll/ۨ֨۠;


# direct methods
.method public constructor <init>(Ll/ܳ֡֨;)V
    .locals 6

    .line 189
    invoke-direct {p0, p1}, Ll/ۢ۠۠;-><init>(Ljava/lang/Object;)V

    .line 190
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Ll/۫֨۠;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Ll/֫۠۠;->᩹:Ljava/util/EnumMap;

    .line 191
    invoke-static {}, Ll/۫֨۠;->values()[Ll/۫֨۠;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 192
    iget-object v4, p0, Ll/֫۠۠;->᩹:Ljava/util/EnumMap;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v3, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 274
    :cond_0
    iget-object v0, p1, Ll/ܳ֡֨;->ۨ:Ll/ᩳ᩶۠;

    if-nez v0, :cond_1

    iget-object p1, p1, Ll/ܳ֡֨;->ᩳ֫:Ll/ᩳ᩶۠;

    if-eqz p1, :cond_2

    :cond_1
    if-eqz v0, :cond_3

    .line 275
    invoke-interface {v0}, Ll/ᩳ᩶۠;->֫()Ll/ܽ᩶۠;

    move-result-object p1

    sget-object v0, Ll/ܽ᩶۠;->᩶:Ll/ܽ᩶۠;

    if-ne p1, v0, :cond_3

    .line 277
    :cond_2
    sget-object p1, Ll/ۨ֨۠;->᩶:Ll/ۨ֨۠;

    goto :goto_1

    .line 278
    :cond_3
    sget-object p1, Ll/ۨ֨۠;->ۙ:Ll/ۨ֨۠;

    :goto_1
    iput-object p1, p0, Ll/᩺֨۠;->᩶:Ll/ۨ֨۠;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/Properties;
    .locals 3

    .line 283
    invoke-super {p0}, Ll/֫۠۠;->֫()Ljava/util/Properties;

    move-result-object v0

    .line 284
    iget-object v1, p0, Ll/᩺֨۠;->᩶:Ll/ۨ֨۠;

    iget-object v1, v1, Ll/ۨ֨۠;->᩸:Ljava/lang/String;

    const-string v2, "style"

    invoke-virtual {v0, v2, v1}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "shape"

    const-string v2, "ellipse"

    .line 285
    invoke-virtual {v0, v1, v2}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
