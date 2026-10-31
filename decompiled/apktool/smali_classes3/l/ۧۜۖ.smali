.class public final Ll/ۧۜۖ;
.super Ljava/lang/Object;
.source "Q882"


# static fields
.field public static final ֫:Ll/ܶᩳۖ;

.field public static final ۧ:Z

.field public static final ܽ:Ll/ܶᩳۖ;

.field public static final ᩳ:Ll/ܶᩳۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "java.sql.Date"

    .line 48
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 53
    :goto_0
    sput-boolean v0, Ll/ۧۜۖ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 71
    sget-object v0, Ll/ۤ᩻ۖ;->ۧ:Ll/ܶᩳۖ;

    sput-object v0, Ll/ۧۜۖ;->֫:Ll/ܶᩳۖ;

    .line 72
    sget-object v0, Ll/ۨ᩻ۖ;->ۧ:Ll/ܶᩳۖ;

    sput-object v0, Ll/ۧۜۖ;->ᩳ:Ll/ܶᩳۖ;

    .line 73
    sget-object v0, Ll/ܰ᩻ۖ;->ۧ:Ll/ܶᩳۖ;

    sput-object v0, Ll/ۧۜۖ;->ܽ:Ll/ܶᩳۖ;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 78
    sput-object v0, Ll/ۧۜۖ;->֫:Ll/ܶᩳۖ;

    .line 79
    sput-object v0, Ll/ۧۜۖ;->ᩳ:Ll/ܶᩳۖ;

    .line 80
    sput-object v0, Ll/ۧۜۖ;->ܽ:Ll/ܶᩳۖ;

    :goto_1
    return-void
.end method
