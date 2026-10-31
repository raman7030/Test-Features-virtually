.class public final Ll/᩶ᩳۜ;
.super Ljava/lang/Object;
.source "S776"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Z

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/Integer;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;)V
    .locals 0

    .line 878
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 879
    iput-object p1, p0, Ll/᩶ᩳۜ;->ܽ:Ljava/lang/String;

    .line 880
    iput-object p2, p0, Ll/᩶ᩳۜ;->ᩳ:Ljava/lang/String;

    .line 881
    iput-object p3, p0, Ll/᩶ᩳۜ;->ܿ:Ljava/lang/Integer;

    .line 882
    iput-boolean p4, p0, Ll/᩶ᩳۜ;->ܳ:Z

    .line 883
    iput-boolean p5, p0, Ll/᩶ᩳۜ;->֫:Z

    .line 884
    iput-object p6, p0, Ll/᩶ᩳۜ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static ֫(ILjava/lang/String;)Ll/᩶ᩳۜ;
    .locals 8

    .line 892
    new-instance v7, Ll/᩶ᩳۜ;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x1

    const-string v6, "VALUE_XML_TRUNCATED"

    const/4 v2, 0x0

    const/4 v4, 0x1

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Ll/᩶ᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;)V

    return-object v7
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;)Ll/᩶ᩳۜ;
    .locals 8

    .line 888
    new-instance v7, Ll/᩶ᩳۜ;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Ll/᩶ᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;)V

    return-object v7
.end method

.method public static ֫(Ljava/lang/String;)Ll/᩶ᩳۜ;
    .locals 8

    .line 897
    new-instance v7, Ll/᩶ᩳۜ;

    const/4 v5, 0x0

    const-string v6, "VALUE_XML_TOO_LARGE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Ll/᩶ᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;)V

    return-object v7
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ll/᩶ᩳۜ;
    .locals 8

    .line 902
    new-instance v7, Ll/᩶ᩳۜ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Ll/᩶ᩳۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;)V

    return-object v7
.end method
