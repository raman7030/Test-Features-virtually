.class public final Ll/᩹ᩳۚ;
.super Ll/ۡ۬֡;
.source "U4IA"

# interfaces
.implements Ll/۫ᩳۚ;


# instance fields
.field public final ۗ:Ll/ۗᩳۚ;

.field public final ۙ:Ljava/lang/String;

.field public final ۬:Ljava/lang/String;

.field public final ᩶:Ll/ۙᩳۚ;

.field public final ᩸:Ll/ܳ۬ܺ;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۙᩳۚ;Ljava/lang/String;Ll/ۗᩳۚ;Ljava/util/ArrayList;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Ll/᩹ᩳۚ;->۬:Ljava/lang/String;

    .line 70
    invoke-static {p2}, Ll/ۙᩳۚ;->ۧ(Ll/᩵ܽۚ;)Ll/ۙᩳۚ;

    move-result-object p2

    iput-object p2, p0, Ll/᩹ᩳۚ;->᩶:Ll/ۙᩳۚ;

    .line 71
    iput-object p3, p0, Ll/᩹ᩳۚ;->ۙ:Ljava/lang/String;

    .line 72
    invoke-static {p4}, Ll/ۗᩳۚ;->ۧ(Ll/֡ܽۚ;)Ll/ۗᩳۚ;

    move-result-object p2

    iput-object p2, p0, Ll/᩹ᩳۚ;->ۗ:Ll/ۗᩳۚ;

    .line 73
    invoke-static {p5}, Ll/᩻ܿۚ;->֫(Ljava/lang/Iterable;)Ll/ܳ۬ܺ;

    move-result-object p2

    iput-object p2, p0, Ll/᩹ᩳۚ;->᩸:Ll/ܳ۬ܺ;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "call_site_"

    .line 128
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/16 p2, 0xa

    .line 132
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :goto_0
    const/4 p1, -0x1

    .line 74
    :goto_1
    iput p1, p0, Ll/᩹ᩳۚ;->᩹:I

    return-void
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 120
    iget v0, p0, Ll/᩹ᩳۚ;->᩹:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/᩹ᩳۚ;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public final ۢ()Ljava/util/List;
    .locals 1

    .line 144
    iget-object v0, p0, Ll/᩹ᩳۚ;->᩸:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final ۧ()Ll/֡ܽۚ;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/᩹ᩳۚ;->ۗ:Ll/ۗᩳۚ;

    return-object v0
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Ll/᩹ᩳۚ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ll/᩵ܽۚ;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/᩹ᩳۚ;->᩶:Ll/ۙᩳۚ;

    return-object v0
.end method
