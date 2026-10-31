.class public final Ll/᩹᩻۠;
.super Ll/᩷ۜ۠;
.source "Z5U8"


# instance fields
.field public final synthetic ܿ:Ll/᩶ۜ۠;


# direct methods
.method public constructor <init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/EnumSet;)V
    .locals 0

    .line 1056
    iput-object p1, p0, Ll/᩹᩻۠;->ܿ:Ll/᩶ۜ۠;

    invoke-direct {p0, p1, p2, p3, p4}, Ll/᩷ۜ۠;-><init>(Ll/᩶ۜ۠;Ll/ۤܶ۠;Ll/ܽ᩻۠;Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۛ֡֨;)V
    .locals 6

    .line 1058
    iget-object p2, p0, Ll/᩹᩻۠;->ܿ:Ll/᩶ۜ۠;

    iget v0, p2, Ll/᩶ۜ۠;->ܳ:I

    add-int/2addr v0, p1

    .line 1059
    iget-boolean p1, p2, Ll/᩶ۜ۠;->᩺:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 1060
    iput-boolean p1, p2, Ll/᩶ۜ۠;->ܰ:Z

    .line 1061
    invoke-virtual {p2}, Ll/᩶ۜ۠;->֫()I

    move-result p1

    .line 1062
    new-array v1, p1, [I

    iput-object v1, p2, Ll/᩶ۜ۠;->ۗ:[I

    .line 1063
    new-array v1, p1, [I

    iput-object v1, p2, Ll/᩶ۜ۠;->᩶:[I

    .line 1064
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, p1, :cond_1

    .line 1067
    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    move-result v3

    .line 1068
    invoke-virtual {p2}, Ll/᩶ۜ۠;->ۧ()C

    move-result v4

    const v5, 0x9000

    and-int/2addr v5, v4

    if-eqz v5, :cond_0

    goto :goto_1

    .line 1072
    :cond_0
    iget-object v5, p2, Ll/᩶ۜ۠;->ۗ:[I

    aput v3, v5, v2

    .line 1073
    iget-object v3, p2, Ll/᩶ۜ۠;->᩶:[I

    aput v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1077
    :cond_1
    iput v0, p2, Ll/᩶ۜ۠;->ܳ:I

    return-void
.end method
