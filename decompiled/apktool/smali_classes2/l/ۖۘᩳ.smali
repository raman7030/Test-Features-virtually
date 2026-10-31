.class public final enum Ll/ۖۘᩳ;
.super Ljava/lang/Enum;
.source "K99P"


# static fields
.field public static final enum ۗ:Ll/ۖۘᩳ;

.field public static final enum ۙ:Ll/ۖۘᩳ;

.field public static final enum ᩶:Ll/ۖۘᩳ;

.field public static final synthetic ᩸:[Ll/ۖۘᩳ;

.field public static final enum ᩹:Ll/ۖۘᩳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 6
    new-instance v0, Ll/ۖۘᩳ;

    const-string v1, "ALWAYS_KEEP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/ۖۘᩳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۖۘᩳ;->᩹:Ll/ۖۘᩳ;

    .line 7
    new-instance v0, Ll/ۖۘᩳ;

    const-string v1, "ALWAYS_REMOVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/ۖۘᩳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۖۘᩳ;->᩶:Ll/ۖۘᩳ;

    .line 8
    new-instance v0, Ll/ۖۘᩳ;

    const-string v1, "QUERY_PREFER_KEEP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ll/ۖۘᩳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۖۘᩳ;->ۙ:Ll/ۖۘᩳ;

    .line 9
    new-instance v0, Ll/ۖۘᩳ;

    const-string v1, "QUERY_PREFER_REMOVE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/ۖۘᩳ;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll/ۖۘᩳ;->ۗ:Ll/ۖۘᩳ;

    .line 5
    invoke-static {}, Ll/ۖۘᩳ;->֫()[Ll/ۖۘᩳ;

    move-result-object v0

    sput-object v0, Ll/ۖۘᩳ;->᩸:[Ll/ۖۘᩳ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll/ۖۘᩳ;
    .locals 1

    .line 5
    const-class v0, Ll/ۖۘᩳ;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll/ۖۘᩳ;

    return-object p0
.end method

.method public static values()[Ll/ۖۘᩳ;
    .locals 1

    .line 5
    sget-object v0, Ll/ۖۘᩳ;->᩸:[Ll/ۖۘᩳ;

    invoke-virtual {v0}, [Ll/ۖۘᩳ;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۖۘᩳ;

    return-object v0
.end method

.method public static synthetic ֫()[Ll/ۖۘᩳ;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ll/ۖۘᩳ;

    .line 5
    sget-object v1, Ll/ۖۘᩳ;->᩹:Ll/ۖۘᩳ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖۘᩳ;->᩶:Ll/ۖۘᩳ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖۘᩳ;->ۙ:Ll/ۖۘᩳ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖۘᩳ;->ۗ:Ll/ۖۘᩳ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static ۧ()Ll/ۖۘᩳ;
    .locals 4

    .line 13
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "keep_in_editor_options"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, -0x1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    const-string v1, "3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    goto :goto_0

    :pswitch_2
    const-string v1, "2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    goto :goto_0

    :pswitch_3
    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_1

    const/4 v2, 0x1

    goto :goto_1

    :pswitch_4
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_5
    const/4 v2, 0x0

    .line 27
    :goto_1
    :pswitch_6
    invoke-static {}, Ll/ۖۘᩳ;->values()[Ll/ۖۘᩳ;

    move-result-object v0

    aget-object v0, v0, v2

    return-object v0

    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_6
        :pswitch_4
    .end packed-switch
.end method
